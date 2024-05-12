package X;

import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;

/* renamed from: X.aex, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94311aex implements InterfaceC93473aRR {
    public final /* synthetic */ FaceDistortionFragment LIZ;

    @Override // X.InterfaceC93473aRR
    public final void onCancel() {
    }

    @Override // X.InterfaceC93473aRR
    public final void LIZ() {
        this.LIZ.onEventObjectAction("cancel");
        this.LIZ.cancel();
        this.LIZ.vl(true);
    }

    public C94311aex(FaceDistortionFragment faceDistortionFragment) {
        this.LIZ = faceDistortionFragment;
    }
}
