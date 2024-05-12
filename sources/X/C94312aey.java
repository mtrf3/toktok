package X;

import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;

/* renamed from: X.aey, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94312aey implements InterfaceC93473aRR {
    public final /* synthetic */ FaceDistortionFragment LIZ;

    @Override // X.InterfaceC93473aRR
    public final void onCancel() {
    }

    @Override // X.InterfaceC93473aRR
    public final void LIZ() {
        this.LIZ.cancel();
        this.LIZ.vl(true);
    }

    public C94312aey(FaceDistortionFragment faceDistortionFragment) {
        this.LIZ = faceDistortionFragment;
    }
}
