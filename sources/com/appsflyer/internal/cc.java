package com.appsflyer.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class cc extends ce {
    public cc(Context context) {
        super("af_purchase", Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.j
    public final j valueOf(String str) {
        super.valueOf(AFInAppEventParameterName(str));
        return this;
    }
}
