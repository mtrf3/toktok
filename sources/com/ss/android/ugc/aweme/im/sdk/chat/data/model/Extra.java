package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes8.dex */
public final class Extra extends F9E {
    public final boolean bold;

    @InterfaceC65349Pkn("color_type")
    public final int colorType;

    public static /* synthetic */ Extra copy$default(Extra extra, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = extra.colorType;
        }
        if ((i2 & 2) != 0) {
            z = extra.bold;
        }
        return extra.copy(i, z);
    }

    public final Extra copy(int i, boolean z) {
        return new Extra(i, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.colorType), Boolean.valueOf(this.bold)};
    }

    public final boolean getBold() {
        return this.bold;
    }

    public final int getColorType() {
        return this.colorType;
    }

    public Extra(int i, boolean z) {
        this.colorType = i;
        this.bold = z;
    }
}
