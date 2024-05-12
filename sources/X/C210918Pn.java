package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.8Pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210918Pn {
    public final String LIZ;
    public final ViewGroup LIZIZ;
    public final C8PX LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C210918Pn)) {
            return false;
        }
        C210918Pn c210918Pn = (C210918Pn) obj;
        return o.LJ(this.LIZ, c210918Pn.LIZ) && o.LJ(this.LIZIZ, c210918Pn.LIZIZ) && o.LJ(this.LIZJ, c210918Pn.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(category=");
        LIZ.append(this.LIZ);
        LIZ.append(", containerView=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", categoryContext=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C210918Pn(String category, C218518hr c218518hr, C210848Pg c210848Pg) {
        o.LJIIIZ(category, "category");
        this.LIZ = category;
        this.LIZIZ = c218518hr;
        this.LIZJ = c210848Pg;
    }
}
