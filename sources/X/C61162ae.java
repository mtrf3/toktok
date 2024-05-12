package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.2ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61162ae {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61162ae)) {
            return false;
        }
        C61162ae c61162ae = (C61162ae) obj;
        return o.LJ(this.LIZ, c61162ae.LIZ) && this.LIZIZ == c61162ae.LIZIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LayoutParam(layoutBusinessType=");
        LIZ.append(this.LIZ);
        LIZ.append(", layoutVersion=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C61162ae(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
