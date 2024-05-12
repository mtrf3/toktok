package com.twitter.sdk.android.core.models;

import X.InterfaceC65349Pkn;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public class ApiErrors {

    @InterfaceC65349Pkn("errors")
    public final List<ApiError> errors;

    public ApiErrors() {
        this(null);
    }

    public ApiErrors(List<ApiError> list) {
        List<ApiError> unmodifiableList;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.errors = unmodifiableList;
    }
}
