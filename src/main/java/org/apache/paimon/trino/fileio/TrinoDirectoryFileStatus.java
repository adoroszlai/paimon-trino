/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.paimon.trino.fileio;

import org.apache.paimon.fs.FileStatus;
import org.apache.paimon.fs.Path;

/** File status for directory. */
public class TrinoDirectoryFileStatus implements FileStatus {

    private final Path path;

    public TrinoDirectoryFileStatus(Path path) {
        this.path = path;
    }

    @Override
    public long getLen() {
        // can't get len by trino file system
        return -1;
    }

    @Override
    public boolean isDir() {
        return true;
    }

    @Override
    public Path getPath() {
        return path;
    }

    @Override
    public long getModificationTime() {
        // can't get modification time by trino file system
        return -1;
    }
}
