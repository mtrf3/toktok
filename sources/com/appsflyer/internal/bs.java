package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class bs extends j {
    public bs() {
        super(null, null, Boolean.FALSE, null);
    }

    @Override // com.appsflyer.internal.j
    public final j valueOf(String str) {
        super.valueOf(AFInAppEventParameterName(str));
        return this;
    }
}
