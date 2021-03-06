/*
 * Copyright 2006-2012 The Scriptella Project Team.
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
package scriptella.driver.hana;

import scriptella.jdbc.GenericDriver;

/**
 * Scriptella Adapter for Hana database.
 * <p>For configuration details and examples see <a href="package-summary.html">overview page</a>.
 *
 * @author Bodo Hüsemann
 * @version 1.0
 */
public class Driver extends GenericDriver {
    public static final String HANA_DRIVER_NAME = "com.sap.db.jdbc.Driver";


    public Driver() {
        loadDrivers(HANA_DRIVER_NAME);
    }
}
