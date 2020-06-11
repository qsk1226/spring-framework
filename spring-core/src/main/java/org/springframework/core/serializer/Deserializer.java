/*
 * Copyright 2002-2018 the original author or authors.
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

package org.springframework.core.serializer;

import java.io.IOException;
import java.io.InputStream;

/**
 * A strategy interface for converting from data in an InputStream to an Object.
 *
 * @author Gary Russell
 * @author Mark Fisher
 * @since 3.0.5
 * @param <T> the object type
 */
@FunctionalInterface
public interface Deserializer<T> {

	/**
	 * Read (assemble) an object of type T from the given InputStream.
	 * <p>Note: Implementations should not close the given InputStream
	 * (or any decorators of that InputStream) but rather leave this up
	 * to the caller.
	 * @param inputStream the input stream
	 * @return the deserialized object
	 * @throws IOException in case of errors reading from the stream
	 */
	T deserialize(InputStream inputStream) throws IOException;

}
