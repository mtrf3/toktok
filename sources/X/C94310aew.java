package X;

import android.widget.LinearLayout;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel;
import com.bytedance.ies.effectcreator.swig.ChangeFrom;
import com.bytedance.ies.effectcreator.swig.EEPoint;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFacePoints;
import kotlin.jvm.internal.o;

/* renamed from: X.aew, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94310aew implements InterfaceC93891aYB {
    public final /* synthetic */ FaceDistortionFragment LIZ;

    @Override // X.InterfaceC93891aYB
    public final void LIZ() {
        this.LIZ.onEventObjectAction("drag");
    }

    public C94310aew(FaceDistortionFragment faceDistortionFragment) {
        this.LIZ = faceDistortionFragment;
    }

    @Override // X.InterfaceC93891aYB
    public final void LJJJJI(float f, float f2, int i) {
        C94314af0 c94314af0 = this.LIZ.LJLIL;
        o.LJI(c94314af0);
        C93464aRI c93464aRI = c94314af0.LJLJLJ;
        float height = (c93464aRI.getHeight() * f2) + c93464aRI.getTop();
        C94314af0 c94314af02 = this.LIZ.LJLIL;
        o.LJI(c94314af02);
        o.LJIIIIZZ(c94314af02.LJLJJL, "binding.btnSave");
        if (height >= r1.getBottom() + this.LIZ.LJLLL) {
            float height2 = (c93464aRI.getHeight() * f2) + c93464aRI.getTop();
            C94314af0 c94314af03 = this.LIZ.LJLIL;
            o.LJI(c94314af03);
            LinearLayout linearLayout = c94314af03.LJLJJI;
            o.LJIIIIZZ(linearLayout, "binding.btnReset");
            float top = linearLayout.getTop();
            FaceDistortionFragment faceDistortionFragment = this.LIZ;
            if (height2 > top - faceDistortionFragment.LJLLL) {
                return;
            }
            FaceDistortionViewModel Al = faceDistortionFragment.Al();
            boolean booleanValue = ((Boolean) this.LIZ.Al().LJLLJ.getValue()).booleanValue();
            Al.getClass();
            EEPoint eEPoint = new EEPoint();
            eEPoint.setX(f);
            eEPoint.setY(f2);
            UIAnnotationFacePoints uIAnnotationFacePoints = Al.LJLLLL;
            if (uIAnnotationFacePoints != null) {
                uIAnnotationFacePoints.updateValue(i, eEPoint, booleanValue, ChangeFrom.ChangeFromNormal);
            }
            Al.jv0();
        }
    }
}
