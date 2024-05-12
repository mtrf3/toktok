package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.DzL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35675DzL {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35675DzL)) {
            return false;
        }
        C35675DzL c35675DzL = (C35675DzL) obj;
        return o.LJ(this.LIZ, c35675DzL.LIZ) && this.LIZIZ == c35675DzL.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdWebResStatus(url=");
        LIZ.append(this.LIZ);
        LIZ.append(", status=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35675DzL(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
