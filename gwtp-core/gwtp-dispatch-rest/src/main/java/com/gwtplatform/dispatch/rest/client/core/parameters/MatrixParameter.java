/*
 * Copyright 2015 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.rest.client.core.parameters;

import com.gwtplatform.common.shared.UrlUtils;
import com.gwtplatform.dispatch.rest.shared.DateFormat;

public class MatrixParameter extends CollectionSupportedParameter {
    private final UrlUtils urlUtils;

    public MatrixParameter(
            String name,
            Object object,
            UrlUtils urlUtils) {
        this(name, object, DateFormat.DEFAULT, urlUtils);
    }

    public MatrixParameter(
            String name,
            Object object,
            String dateFormat,
            UrlUtils urlUtils) {
        super(Type.MATRIX, name, object, dateFormat);

        this.urlUtils = urlUtils;
    }

    @Override
    protected String encodeKey(String key) {
        return urlUtils.encodeMatrixParameter(key);
    }

    @Override
    protected String encodeValue(String value) {
        return urlUtils.encodeMatrixParameter(value);
    }
}
