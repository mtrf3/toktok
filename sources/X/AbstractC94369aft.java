package X;

import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationUIType;
import kotlin.jvm.internal.o;

/* renamed from: X.aft, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC94369aft implements InterfaceC93980aZc {
    public final C64962gm LIZ;
    public final C94368afs LIZIZ;
    public final Feature LIZJ;

    @Override // X.InterfaceC93980aZc
    public void LJI() {
    }

    public final UIAnnotationTransform2D LJII() {
        UIAnnotationBase uiAnnotationAccordingUIType = this.LIZJ.getUiAnnotationAccordingUIType(UIAnnotationUIType.UIAnnotationUIType_Transform2D);
        if (uiAnnotationAccordingUIType != null) {
            return UIAnnotationTransform2D.dynamicCast((Element) uiAnnotationAccordingUIType);
        }
        return null;
    }

    public AbstractC94369aft(Feature feature) {
        o.LJIIIZ(feature, "feature");
        this.LIZJ = feature;
        this.LIZ = C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI()));
        this.LIZIZ = new C94368afs(this);
    }

    public Object LJIIIIZZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return C76800UCe.LIZ;
    }
}
