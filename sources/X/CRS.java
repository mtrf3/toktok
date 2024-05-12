package X;

import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRS {
    public final CMB LIZ;
    public final PerceptionMessage LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CRS)) {
            return false;
        }
        CRS crs = (CRS) obj;
        return o.LJ(this.LIZ, crs.LIZ) && o.LJ(this.LIZIZ, crs.LIZIZ);
    }

    public final int hashCode() {
        CMB cmb = this.LIZ;
        return this.LIZIZ.hashCode() + ((cmb == null ? 0 : cmb.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiCoHostInviteViolationDialogEvent(coHostInviteEvent=");
        LIZ.append(this.LIZ);
        LIZ.append(", perceptionMessage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CRS(CMB cmb, PerceptionMessage perceptionMessage) {
        o.LJIIIZ(perceptionMessage, "perceptionMessage");
        this.LIZ = cmb;
        this.LIZIZ = perceptionMessage;
    }
}
