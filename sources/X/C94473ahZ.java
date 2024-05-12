package X;

import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* renamed from: X.ahZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94473ahZ implements X0L {
    public final /* synthetic */ C93886aY6 LIZ;

    @Override // X.X0E
    public final void LJFF(int i) {
    }

    @Override // X.X0E
    public final void LJI(boolean z) {
    }

    public C94473ahZ(C93886aY6 c93886aY6) {
        this.LIZ = c93886aY6;
    }

    @Override // X.X0L
    public final void onInfo(int i, int i2, String str) {
        if (i == 1000) {
            VERecorder vERecorder = this.LIZ.LIZLLL;
            o.LJI(vERecorder);
            vERecorder.LIZIZ.startCameraPreview(this.LIZ.LJ);
            this.LIZ.LJII.postValue(Boolean.TRUE);
        }
    }
}
