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
package org.n52.iceland.ogc.ows;

import org.n52.shetland.ogc.ows.OwsServiceProvider;
import org.n52.shetland.ogc.ows.OwsServiceIdentification;

import java.util.Locale;
import java.util.Set;

import org.n52.iceland.util.LocalizedProducer;

/**
 * @author Christian Autermann
 */
public interface ServiceMetadataRepository {

    LocalizedProducer<OwsServiceIdentification> getServiceIdentificationFactory(String service);

    LocalizedProducer<OwsServiceProvider> getServiceProviderFactory(String service);

    Set<Locale> getAvailableLocales();

}
