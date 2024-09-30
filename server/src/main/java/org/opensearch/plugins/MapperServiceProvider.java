/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.plugins;

import org.opensearch.core.index.Index;
import org.opensearch.index.mapper.MapperService;

@FunctionalInterface
public interface MapperServiceProvider {
    MapperService getMapperService(Index index);
}
