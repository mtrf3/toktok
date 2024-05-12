package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKW {
    public Long LIZ;
    public CharSequence LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public long LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public WeakReference<InterfaceC65784Pro<C76800UCe>> LJIIIZ;

    public AKW() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKW)) {
            return false;
        }
        AKW akw = (AKW) obj;
        return o.LJ(this.LIZ, akw.LIZ) && o.LJ(this.LIZIZ, akw.LIZIZ) && o.LJ(this.LIZJ, akw.LIZJ) && o.LJ(this.LIZLLL, akw.LIZLLL) && this.LJ == akw.LJ && this.LJFF == akw.LJFF && this.LJI == akw.LJI && this.LJII == akw.LJII && this.LJIIIIZZ == akw.LJIIIIZZ && o.LJ(this.LJIIIZ, akw.LJIIIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TuxToastBaseBundle(expireTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", message=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", icon=");
        LIZ.append(this.LIZJ);
        LIZ.append(", iconColor=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", duration=");
        LIZ.append(this.LJ);
        LIZ.append(", hasShowAnimation=");
        LIZ.append(this.LJFF);
        LIZ.append(", hasDismissAnimation=");
        LIZ.append(this.LJI);
        LIZ.append(", acrossActivities=");
        LIZ.append(this.LJII);
        LIZ.append(", uniqueIdForReuse=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", dismissListener=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Long l = this.LIZ;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = hashCode * 31;
        CharSequence charSequence = this.LIZIZ;
        if (charSequence == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.LIZJ;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num2 = this.LIZLLL;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJ, (i4 + hashCode4) * 31, 31);
        boolean z = this.LJFF;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (LIZJ + i6) * 31;
        boolean z2 = this.LJI;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        if (!this.LJII) {
            i5 = 0;
        }
        int i10 = (((i9 + i5) * 31) + this.LJIIIIZZ) * 31;
        WeakReference<InterfaceC65784Pro<C76800UCe>> weakReference = this.LJIIIZ;
        if (weakReference != null) {
            i = weakReference.hashCode();
        }
        return i10 + i;
    }

    public AKW(Object obj) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = 3000L;
        this.LJFF = true;
        this.LJI = true;
        this.LJII = false;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = null;
    }
}
