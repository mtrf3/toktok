package X;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.NativeCallbacks;

/* renamed from: X.P8q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63968P8q implements NativeCallbacks.IGetFrameCallback {
    public final /* synthetic */ C84098WzW LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
    public final /* synthetic */ void onResult(VEFrame vEFrame, boolean z) {
        C63971P8t.LIZ(this, vEFrame, z);
    }

    public C63968P8q(C84098WzW c84098WzW, long j) {
        this.LIZ = c84098WzW;
        this.LIZIZ = j;
    }

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
    public final void onResult(int[] iArr, int i, int i2, long j, boolean z) {
        String str;
        EnumC63969P8r enumC63969P8r = this.LIZ.LIZ;
        if (enumC63969P8r != EnumC63969P8r.FOLLOW_SHOT_FRAME_MODE) {
            if (enumC63969P8r == EnumC63969P8r.NORMAL_GET_FRAME_MODE) {
                str = "te_record_shot_screen_time";
            } else {
                str = "te_record_shot_hd_screen_time";
            }
            C63868P4u.LJ(0, System.currentTimeMillis() - this.LIZIZ, str);
        }
        if (!z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("origin FrameCallback: width: ");
            LIZ.append(i);
            LIZ.append(", height: ");
            LIZ.append(i2);
            P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ));
            this.LIZ.getClass();
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("effect FrameCallback: width: ");
        LIZ2.append(i);
        LIZ2.append(", height: ");
        LIZ2.append(i2);
        P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ2));
        this.LIZ.getClass();
        InterfaceC63970P8s interfaceC63970P8s = this.LIZ.LJII;
        if (interfaceC63970P8s == null) {
            return;
        }
        if (iArr == null) {
            P4Q.LIZ("TERecorder", "mRenderFrameCallback: data is null");
            this.LIZ.LJII.onResult(null, i, i2);
            this.LIZ.LJII.LIZ(null, -1);
        } else {
            interfaceC63970P8s.onResult(iArr, i, i2);
            this.LIZ.LJII.LIZ(VEFrame.createIntArrayFrame(iArr, i, i2, 0, 0L, P6Z.TEPixFmt_Count), 0);
        }
    }
}
