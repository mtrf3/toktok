package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.5xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152015xt {
    public final C08630Vn<C76800UCe> LIZ;
    public final C08630Vn<OSZ<Float, Float>> LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;

    public C152015xt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C152015xt)) {
            return false;
        }
        C152015xt c152015xt = (C152015xt) obj;
        return o.LJ(this.LIZ, c152015xt.LIZ) && o.LJ(this.LIZIZ, c152015xt.LIZIZ) && this.LIZJ == c152015xt.LIZJ && o.LJ(this.LIZLLL, c152015xt.LIZLLL);
    }

    public final int hashCode() {
        C08630Vn<C76800UCe> c08630Vn = this.LIZ;
        int hashCode = (c08630Vn == null ? 0 : c08630Vn.hashCode()) * 31;
        C08630Vn<OSZ<Float, Float>> c08630Vn2 = this.LIZIZ;
        int hashCode2 = (((hashCode + (c08630Vn2 == null ? 0 : c08630Vn2.hashCode())) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ColorPickerViewStates(showEvent=");
        LIZ.append(this.LIZ);
        LIZ.append(", hideEvent=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", gestureTopMargin=");
        LIZ.append(this.LIZJ);
        LIZ.append(", color=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C152015xt(int i) {
        this(null, null, 0, null);
    }

    public C152015xt(C08630Vn<C76800UCe> c08630Vn, C08630Vn<OSZ<Float, Float>> c08630Vn2, int i, Integer num) {
        this.LIZ = c08630Vn;
        this.LIZIZ = c08630Vn2;
        this.LIZJ = i;
        this.LIZLLL = num;
    }

    public static C152015xt LIZ(C152015xt c152015xt, C08630Vn c08630Vn, C08630Vn c08630Vn2, Integer num, int i) {
        int i2;
        if ((i & 1) != 0) {
            c08630Vn = c152015xt.LIZ;
        }
        if ((i & 2) != 0) {
            c08630Vn2 = c152015xt.LIZIZ;
        }
        if ((i & 4) != 0) {
            i2 = c152015xt.LIZJ;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            num = c152015xt.LIZLLL;
        }
        c152015xt.getClass();
        return new C152015xt(c08630Vn, c08630Vn2, i2, num);
    }
}
