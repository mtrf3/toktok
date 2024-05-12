package com.ss.android.ugc.aweme.miniapp_api.model.net;

import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MicroAppHttpHeader {
    public final String name;
    public final String value;

    public int hashCode() {
        int i;
        String str = this.name;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.value;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        String str = this.name;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(": ");
        String str3 = this.value;
        if (str3 != null) {
            str2 = str3;
        }
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(MicroAppHttpHeader.class, obj.getClass())) {
            return false;
        }
        MicroAppHttpHeader microAppHttpHeader = (MicroAppHttpHeader) obj;
        if (!o.LJ(this.name, microAppHttpHeader.name)) {
            return false;
        }
        return o.LJ(this.value, microAppHttpHeader.value);
    }

    public MicroAppHttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}
