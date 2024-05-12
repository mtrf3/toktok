package X;

import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;

/* renamed from: X.Wxy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84002Wxy implements InterfaceC83704WtA {
    public final /* synthetic */ VETaintSceneDetectParams LIZ;
    public final /* synthetic */ X03 LIZIZ;
    public final /* synthetic */ VERecorder LIZJ;

    @Override // X.InterfaceC83704WtA
    public final void onError(String str) {
        P4Q.LIZJ("VERecorder", "get model path failure!");
    }

    @Override // X.InterfaceC83704WtA
    public final void onSuccess(String str) {
        VETaintSceneDetectParams vETaintSceneDetectParams = this.LIZ;
        vETaintSceneDetectParams.modelPath = str;
        this.LIZJ.LIZIZ.setLensParams(vETaintSceneDetectParams, this.LIZIZ);
    }

    public C84002Wxy(VERecorder vERecorder, VETaintSceneDetectParams vETaintSceneDetectParams, X03 x03) {
        this.LIZJ = vERecorder;
        this.LIZ = vETaintSceneDetectParams;
        this.LIZIZ = x03;
    }
}
