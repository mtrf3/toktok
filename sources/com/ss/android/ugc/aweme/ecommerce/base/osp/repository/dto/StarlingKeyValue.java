package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StarlingKeyValue {

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("value")
    public final String value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarlingKeyValue)) {
            return false;
        }
        StarlingKeyValue starlingKeyValue = (StarlingKeyValue) obj;
        return o.LJ(this.key, starlingKeyValue.key) && o.LJ(this.value, starlingKeyValue.value);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StarlingKeyValue(key=");
        LIZ.append(this.key);
        LIZ.append(", value=");
        return q.LIZIZ(LIZ, this.value, ')', LIZ);
    }

    public StarlingKeyValue(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
