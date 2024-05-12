package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BottomNotice {

    @InterfaceC65349Pkn("arguments")
    public final Map<String, String> arguments;

    @InterfaceC65349Pkn("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomNotice)) {
            return false;
        }
        BottomNotice bottomNotice = (BottomNotice) obj;
        return o.LJ(this.text, bottomNotice.text) && o.LJ(this.arguments, bottomNotice.arguments);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.arguments;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomNotice(text=");
        LIZ.append(this.text);
        LIZ.append(", arguments=");
        return C15890jp.LIZ(LIZ, this.arguments, ')', LIZ);
    }

    public BottomNotice(String str, Map<String, String> map) {
        this.text = str;
        this.arguments = map;
    }
}
