package X;

import android.graphics.PointF;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel;
import com.bytedance.ies.effectcreator.swig.EEPoint;
import com.bytedance.ies.effectcreator.swig.EEPointList;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFacePoints;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel$refreshKeyPoints$1", f = "FaceDistortionViewModel.kt", l = {232}, m = "invokeSuspend")
/* renamed from: X.am6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94754am6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FaceDistortionViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94754am6(FaceDistortionViewModel faceDistortionViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = faceDistortionViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94754am6(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EEPointList facePoints;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            UIAnnotationFacePoints uIAnnotationFacePoints = this.LJLILLLLZI.LJLLLL;
            if (uIAnnotationFacePoints != null && (facePoints = uIAnnotationFacePoints.getFacePoints()) != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(facePoints, 10));
                Iterator<EEPoint> it = facePoints.iterator();
                while (it.hasNext()) {
                    EEPoint it2 = it.next();
                    o.LJIIIIZZ(it2, "it");
                    arrayList.add(new PointF((float) it2.getX(), (float) it2.getY()));
                }
                XLM xlm = this.LJLILLLLZI.LJLL;
                this.LJLIL = 1;
                xlm.setValue(arrayList);
                if (C76800UCe.LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
