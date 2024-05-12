package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class Arg3 {

    @InterfaceC65349Pkn("body")
    public final Body body;

    @InterfaceC65349Pkn("interface")
    public final Interface interfaceStr;

    /* JADX WARN: Multi-variable type inference failed */
    public Arg3() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Arg3)) {
            return false;
        }
        Arg3 arg3 = (Arg3) obj;
        return this.interfaceStr == arg3.interfaceStr && o.LJ(this.body, arg3.body);
    }

    public final int hashCode() {
        Interface r0 = this.interfaceStr;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        Body body = this.body;
        return hashCode + (body != null ? body.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Arg3(interfaceStr=");
        LIZ.append(this.interfaceStr);
        LIZ.append(", body=");
        LIZ.append(this.body);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public Arg3(Interface r1, Body body) {
        this.interfaceStr = r1;
        this.body = body;
    }

    public /* synthetic */ Arg3(Interface r3, Body body, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r3, (i & 2) != 0 ? null : body);
    }
}
