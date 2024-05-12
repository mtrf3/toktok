package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.50J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C50J {
    public final C125534wH LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50J)) {
            return false;
        }
        C50J c50j = (C50J) obj;
        return o.LJ(this.LIZ, c50j.LIZ) && this.LIZIZ == c50j.LIZIZ;
    }

    public final int hashCode() {
        C125534wH c125534wH = this.LIZ;
        return ((c125534wH == null ? 0 : c125534wH.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CropResult(cropData=");
        LIZ.append(this.LIZ);
        LIZ.append(", cropMode=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C50J(C125534wH c125534wH, int i) {
        this.LIZ = c125534wH;
        this.LIZIZ = i;
    }
}
