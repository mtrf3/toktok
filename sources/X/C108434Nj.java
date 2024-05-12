package X;

import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.4Nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108434Nj {
    public final LinearLayout LIZ;
    public final C71897SJp LIZIZ;
    public final SY4 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108434Nj)) {
            return false;
        }
        C108434Nj c108434Nj = (C108434Nj) obj;
        return o.LJ(this.LIZ, c108434Nj.LIZ) && o.LJ(this.LIZIZ, c108434Nj.LIZIZ) && o.LJ(this.LIZJ, c108434Nj.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        SY4 sy4 = this.LIZJ;
        return hashCode + (sy4 == null ? 0 : sy4.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareCreateGroupPayload(layout=");
        LIZ.append(this.LIZ);
        LIZ.append(", checkboxView=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", createGroupButton=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C108434Nj(LinearLayout linearLayout, C71897SJp c71897SJp, SY4 sy4) {
        this.LIZ = linearLayout;
        this.LIZIZ = c71897SJp;
        this.LIZJ = sy4;
    }
}
