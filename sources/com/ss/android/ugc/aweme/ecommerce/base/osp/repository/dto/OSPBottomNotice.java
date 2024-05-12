package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OSPBottomNotice {

    @InterfaceC65349Pkn("arguments")
    public final HashMap<String, String> arguments;

    @InterfaceC65349Pkn("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSPBottomNotice)) {
            return false;
        }
        OSPBottomNotice oSPBottomNotice = (OSPBottomNotice) obj;
        return o.LJ(this.text, oSPBottomNotice.text) && o.LJ(this.arguments, oSPBottomNotice.arguments);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        HashMap<String, String> hashMap = this.arguments;
        return hashCode + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OSPBottomNotice(text=");
        LIZ.append(this.text);
        LIZ.append(", arguments=");
        LIZ.append(this.arguments);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public OSPBottomNotice(String str, HashMap<String, String> hashMap) {
        this.text = str;
        this.arguments = hashMap;
    }

    public /* synthetic */ OSPBottomNotice(String str, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : hashMap);
    }
}
