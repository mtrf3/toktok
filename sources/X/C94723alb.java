package X;

import com.bytedance.ies.effectcreator.swig.EEScale;
import com.bytedance.ies.effectcreator.swig.UIAnnotationScriptTransform2D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2DData;
import kotlin.jvm.internal.o;

/* renamed from: X.alb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94723alb extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAnnotationScriptTransform2D, UIAnnotationTransform2DData, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94723alb(float f, float f2) {
        super(2);
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        UIAnnotationScriptTransform2D transform2D = uIAnnotationScriptTransform2D;
        o.LJIIIZ(transform2D, "transform2D");
        o.LJIIIZ(uIAnnotationTransform2DData, "<anonymous parameter 1>");
        EEScale eEScale = new EEScale();
        eEScale.setX(this.LJLIL);
        eEScale.setY(this.LJLILLLLZI);
        transform2D.updateDeltaValue(eEScale);
        return C76800UCe.LIZ;
    }
}
