package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.Mbo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57148Mbo {
    public final C77216USe LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Bundle LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57148Mbo)) {
            return false;
        }
        C57148Mbo c57148Mbo = (C57148Mbo) obj;
        return o.LJ(this.LIZ, c57148Mbo.LIZ) && o.LJ(this.LIZIZ, c57148Mbo.LIZIZ) && o.LJ(this.LIZJ, c57148Mbo.LIZJ) && o.LJ(this.LIZLLL, c57148Mbo.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationPipelineState(response=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZJ);
        LIZ.append(", bundle=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        Bundle bundle = this.LIZLLL;
        if (bundle == null) {
            hashCode = 0;
        } else {
            hashCode = bundle.hashCode();
        }
        return LJ + hashCode;
    }

    public C57148Mbo(C77216USe response, String enterFrom, String enterMethod, Bundle bundle) {
        o.LJIIIZ(response, "response");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LIZ = response;
        this.LIZIZ = enterFrom;
        this.LIZJ = enterMethod;
        this.LIZLLL = bundle;
    }
}
