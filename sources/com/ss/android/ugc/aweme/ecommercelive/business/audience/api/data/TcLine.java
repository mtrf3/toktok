package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TcLine {

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("value")
    public final String value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TcLine)) {
            return false;
        }
        TcLine tcLine = (TcLine) obj;
        return o.LJ(this.key, tcLine.key) && o.LJ(this.value, tcLine.value) && this.type == tcLine.type;
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.type;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TcLine(key=");
        LIZ.append(this.key);
        LIZ.append(", value=");
        LIZ.append(this.value);
        LIZ.append(", type=");
        return b0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public TcLine(String str, String str2, int i) {
        this.key = str;
        this.value = str2;
        this.type = i;
    }

    public /* synthetic */ TcLine(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, i);
    }
}
