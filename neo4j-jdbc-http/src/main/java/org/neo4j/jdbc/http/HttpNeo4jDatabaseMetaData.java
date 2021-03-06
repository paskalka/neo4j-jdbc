/*
 * Copyright (c) 2016 LARUS Business Automation [http://www.larus-ba.it]
 * <p>
 * This file is part of the "LARUS Integration Framework for Neo4j".
 * <p>
 * The "LARUS Integration Framework for Neo4j" is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created on 15/4/2016
 */
package org.neo4j.jdbc.http;

import org.neo4j.jdbc.Neo4jDatabaseMetaData;

/**
 * Provides metadata
 *
 * @author AgileLARUS
 * @since 3.0.0
 */
class HttpNeo4jDatabaseMetaData extends Neo4jDatabaseMetaData {

	public HttpNeo4jDatabaseMetaData(HttpNeo4jConnection connection) {
		super(connection);

		// compute database version
		if (connection != null && connection.executor != null ) {
			this.databaseVersion = connection.executor.getServerVersion();
		}
	}


}
