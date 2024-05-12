package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.Ml2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57720Ml2 implements InterfaceC57671MkF<String> {
    public final String LIZ;
    public final int LIZIZ;

    public C57720Ml2() {
        this(0);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MaFVideoLoadParams(pageToken=");
        LIZ.append(this.LIZ);
        LIZ.append(", loadCount=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C57720Ml2(int i) {
        this("", 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57720Ml2)) {
            return false;
        }
        C57720Ml2 c57720Ml2 = (C57720Ml2) obj;
        if (o.LJ(this.LIZ, c57720Ml2.LIZ) && this.LIZIZ == c57720Ml2.LIZIZ) {
            return true;
        }
        return false;
    }

    public C57720Ml2(String pageToken, int i) {
        o.LJIIIZ(pageToken, "pageToken");
        this.LIZ = pageToken;
        this.LIZIZ = i;
    }
}
