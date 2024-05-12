package X;

import android.graphics.drawable.Drawable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.57o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1298057o {
    public final Integer LIZ;
    public final Drawable LIZIZ;
    public final Drawable LIZJ;
    public final Drawable LIZLLL;
    public final Integer LJ;

    public C1298057o() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1298057o)) {
            return false;
        }
        C1298057o c1298057o = (C1298057o) obj;
        return o.LJ(this.LIZ, c1298057o.LIZ) && o.LJ(this.LIZIZ, c1298057o.LIZIZ) && o.LJ(this.LIZJ, c1298057o.LIZJ) && o.LJ(this.LIZLLL, c1298057o.LIZLLL) && o.LJ(this.LJ, c1298057o.LJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Drawable drawable = this.LIZIZ;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (drawable3 == null ? 0 : drawable3.hashCode())) * 31;
        Integer num2 = this.LJ;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransitionIconConfig(imageSize=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconBgResource=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", noTransitionIcon=");
        LIZ.append(this.LIZJ);
        LIZ.append(", hasTransitionIcon=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", transitionHighLightColor=");
        return s0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ C1298057o(int i) {
        this(null, null, null, null, null);
    }

    public C1298057o(Integer num, Drawable drawable, Drawable drawable2, Drawable drawable3, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = drawable;
        this.LIZJ = drawable2;
        this.LIZLLL = drawable3;
        this.LJ = num2;
    }
}
