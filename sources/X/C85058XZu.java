package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.XZu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85058XZu {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;

    public C85058XZu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85058XZu)) {
            return false;
        }
        C85058XZu c85058XZu = (C85058XZu) obj;
        return o.LJ(this.LIZ, c85058XZu.LIZ) && o.LJ(this.LIZIZ, c85058XZu.LIZIZ) && this.LIZJ == c85058XZu.LIZJ;
    }

    public final int hashCode() {
        return C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Upsell2svCampaignObj(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", category=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C85058XZu(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = -1;
    }
}
