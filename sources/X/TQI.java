package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TQI {
    public final String LIZ = "selfie_window";
    public final String LIZIZ = "link_management_pannel";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TQI)) {
            return false;
        }
        TQI tqi = (TQI) obj;
        tqi.getClass();
        return o.LJ(null, null) && o.LJ(this.LIZ, tqi.LIZ) && o.LJ(this.LIZIZ, tqi.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + C79062V1e.LJ(this.LIZ, 0, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenPreviewPanelData(previewData=");
        LIZ.append((Object) null);
        LIZ.append(", openSource=");
        LIZ.append(this.LIZ);
        LIZ.append(", from=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }
}
