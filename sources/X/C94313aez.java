package X;

import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFacePoints;

/* renamed from: X.aez, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94313aez implements InterfaceC93473aRR {
    public final /* synthetic */ FaceDistortionFragment LIZ;

    @Override // X.InterfaceC93473aRR
    public final void onCancel() {
    }

    @Override // X.InterfaceC93473aRR
    public final void LIZ() {
        this.LIZ.onEventObjectAction("reset");
        FaceDistortionViewModel Al = this.LIZ.Al();
        UIAnnotationFacePoints uIAnnotationFacePoints = Al.LJLLLL;
        if (uIAnnotationFacePoints != null) {
            uIAnnotationFacePoints.reset();
        }
        Al.jv0();
    }

    public C94313aez(FaceDistortionFragment faceDistortionFragment) {
        this.LIZ = faceDistortionFragment;
    }
}
