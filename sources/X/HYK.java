package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HYK extends HYI {
    public final HYN LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HYK) && o.LJ(this.LIZ, ((HYK) obj).LIZ);
        }
        return true;
    }

    public final int hashCode() {
        HYN hyn = this.LIZ;
        if (hyn != null) {
            return hyn.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TryRecordOnCameraNotInit(event=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public HYK(HYN event) {
        o.LJIIIZ(event, "event");
        this.LIZ = event;
    }
}
