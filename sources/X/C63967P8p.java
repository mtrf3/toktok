package X;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.NativeCallbacks;

/* renamed from: X.P8p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63967P8p implements NativeCallbacks.IGetFrameCallback {
    public final /* synthetic */ C84098WzW LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C84098WzW LIZJ;

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
    public final void onResult(VEFrame vEFrame, boolean z) {
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
        InterfaceC63970P8s interfaceC63970P8s = this.LIZJ.LJII;
        if (interfaceC63970P8s != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getGetFrameCallback: consume: ");
            LIZ.append(System.currentTimeMillis() - this.LIZIZ);
            P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZ));
            interfaceC63970P8s.LIZ(vEFrame, 0);
        }
    }

    public C63967P8p(C84098WzW c84098WzW, long j, C84098WzW c84098WzW2) {
        this.LIZ = c84098WzW;
        this.LIZIZ = j;
        this.LIZJ = c84098WzW2;
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
        this.LIZJ.getClass();
        InterfaceC63970P8s interfaceC63970P8s = this.LIZJ.LJII;
        if (interfaceC63970P8s != null) {
            StringBuilder LIZJ = C06460Ne.LIZJ("getGetFrameCallback: width: ", i, ", height: ", i2, ", consume: ");
            LIZJ.append(System.currentTimeMillis() - this.LIZIZ);
            P4Q.LJFF("TERecorder", X1D.LIZIZ(LIZJ));
            interfaceC63970P8s.onResult(iArr, i, i2);
            interfaceC63970P8s.LIZ(VEFrame.createIntArrayFrame(iArr, i, i2, 0, j / 1000, P6Z.TEPixFmt_Count), 0);
        }
    }
}
