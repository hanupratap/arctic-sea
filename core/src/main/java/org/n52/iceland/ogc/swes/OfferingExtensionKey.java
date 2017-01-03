/*
 * Copyright 2015-2017 52°North Initiative for Geospatial Open Source
 * Software GmbH
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
package org.n52.iceland.ogc.swes;

import org.n52.iceland.ogc.AbstractComparableServiceVersionDomainKey;
import org.n52.shetland.ogc.ows.service.OwsServiceKey;

/**
 * Key class to identify {@link OfferingExtensionProvider}.
 *
 * @author <a href="mailto:c.hollmann@52north.org">Carsten Hollmann</a>
 * @since 1.0.0
 *
 */
@Deprecated // SOS-specific
public class OfferingExtensionKey extends AbstractComparableServiceVersionDomainKey<OfferingExtensionKey> {

    /**
     * constructor
     *
     * @param sok
     *            the {@link OwsServiceKey} to set
     * @param domain
     *            the domain to set
     */
    public OfferingExtensionKey(OwsServiceKey sok, String domain) {
        super(sok, domain);
    }

    /**
     * constructor
     *
     * @param service
     *            the service to set
     * @param version
     *            the version to set
     * @param domain
     *            the domain to set
     */
    public OfferingExtensionKey(String service, String version, String domain) {
        super(service, version, domain);
    }

}
