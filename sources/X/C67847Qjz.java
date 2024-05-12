package X;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* renamed from: X.Qjz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67847Qjz {
    public final C67719Qhv<?> LIZ;
    public final Feature LIZIZ;

    public /* synthetic */ C67847Qjz(C67719Qhv c67719Qhv, Feature feature) {
        this.LIZ = c67719Qhv;
        this.LIZIZ = feature;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(this.LIZ, "key");
        c64362PNu.LIZ(this.LIZIZ, "feature");
        return c64362PNu.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C67847Qjz)) {
            C67847Qjz c67847Qjz = (C67847Qjz) obj;
            if (C64363PNv.LIZ(this.LIZ, c67847Qjz.LIZ) && C64363PNv.LIZ(this.LIZIZ, c67847Qjz.LIZIZ)) {
                return true;
            }
        }
        return false;
    }
}
