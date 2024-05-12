package X;

import com.ss.android.ttve.model.VETrackParams;
import java.util.ArrayList;

/* renamed from: X.Wc7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82647Wc7 {
    public final VETrackParams LIZ = new VETrackParams();

    public final void LIZIZ() {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.speeds == null) {
            vETrackParams.speeds = new ArrayList();
        }
        this.LIZ.speeds.add(Double.valueOf(1.0d));
    }

    public final void LIZ(String str) {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.paths == null) {
            vETrackParams.paths = new ArrayList();
        }
        this.LIZ.paths.add(str);
    }

    public final void LIZJ(int i) {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.trimIns == null) {
            vETrackParams.trimIns = new ArrayList();
        }
        this.LIZ.trimIns.add(Integer.valueOf(i));
    }

    public final void LIZLLL(int i) {
        VETrackParams vETrackParams = this.LIZ;
        if (vETrackParams.trimOuts == null) {
            vETrackParams.trimOuts = new ArrayList();
        }
        this.LIZ.trimOuts.add(Integer.valueOf(i));
    }
}
