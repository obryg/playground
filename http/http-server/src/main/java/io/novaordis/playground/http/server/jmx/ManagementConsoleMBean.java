/*
 * Copyright (c) 2017 Nova Ordis LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.novaordis.playground.http.server.jmx;

/**
 * The http-server JMX management interface.
 *
 * @author Ovidiu Feodorov <ovidiu@novaordis.com>
 * @since 1/7/17
 */
public interface ManagementConsoleMBean {

    // Constants -------------------------------------------------------------------------------------------------------

    // Static ----------------------------------------------------------------------------------------------------------

    // Public ----------------------------------------------------------------------------------------------------------

    int getConnectionCount();

    /**
     * Lists alive connections by logging the connection list as INFO, and also returns the string as result.
     */
    String listConnections();

    /**
     * Lists the connections that have been closed since the server was started, by logging the connection list as
     * INFO, and also returns the string as result.
     *
     * @see ManagementConsoleMBean#clearClosedConnectionHistory()
     */
    String listClosedConnections();

    /**
     * @see ManagementConsoleMBean#listClosedConnections()
     */
    void clearClosedConnectionHistory();

    /**
     * If the request being handled by the specified connection is being "delayed", release the request.
     * A noop if request in that situation exists.
     */
    void releaseDelayedRequest(long connectionId);


}
