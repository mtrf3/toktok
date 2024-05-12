package X;

import android.view.View;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.NCs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58978NCs {
    public final View LIZ;
    public final EnumC46475ILv LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58978NCs)) {
            return false;
        }
        C58978NCs c58978NCs = (C58978NCs) obj;
        return o.LJ(this.LIZ, c58978NCs.LIZ) && this.LIZIZ == c58978NCs.LIZIZ && o.LJ(this.LIZJ, c58978NCs.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        String str = this.LIZJ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContainerModel(realView=");
        LIZ.append(this.LIZ);
        LIZ.append(", loadStatus=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", containerId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C58978NCs(View realView, EnumC46475ILv loadStatus, String str) {
        o.LJIIIZ(realView, "realView");
        o.LJIIIZ(loadStatus, "loadStatus");
        this.LIZ = realView;
        this.LIZIZ = loadStatus;
        this.LIZJ = str;
    }
}
