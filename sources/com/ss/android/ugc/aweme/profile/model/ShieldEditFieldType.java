package com.ss.android.ugc.aweme.profile.model;

import X.V0N;

/* loaded from: classes3.dex */
public enum ShieldEditFieldType {
    BIO_LINK(1);

    public final int typeValue;

    public static ShieldEditFieldType valueOf(String str) {
        return (ShieldEditFieldType) V0N.LJJJ(ShieldEditFieldType.class, str);
    }

    public final int getTypeValue() {
        return this.typeValue;
    }

    ShieldEditFieldType(int i) {
        this.typeValue = i;
    }
}
