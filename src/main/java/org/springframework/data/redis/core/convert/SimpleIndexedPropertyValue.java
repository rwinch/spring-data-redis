/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.redis.core.convert;

/**
 * @author Christoph Strobl
 */
public class SimpleIndexedPropertyValue implements IndexedData {

	private final String keyspace;
	private final String path;
	private final Object value;

	public SimpleIndexedPropertyValue(String keyspace, String path, Object value) {

		this.keyspace = keyspace;
		this.path = path;
		this.value = value;
	}

	@Override
	public String getPath() {
		return path;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public String getKeySpace() {
		return this.keyspace;
	}

}