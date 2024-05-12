package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationSlider;
import com.bytedance.ies.effecteditor.swig.UIAnnotationSliderUIMore;

/* loaded from: classes16.dex */
public final class XNH extends XN9<XNP, UIAnnotationSlider> {
    @Override // X.XN9
    public final UIAnnotationErrorCode LIZIZ() {
        U u = this.LIZJ;
        if (u == 0) {
            return UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr;
        }
        return u.refreshAnnotationPreview();
    }

    public XNH(UIAnnotationSlider uIAnnotationSlider, XN6 xn6) {
        super(uIAnnotationSlider, xn6);
        if (uIAnnotationSlider == null) {
            return;
        }
        this.LIZ = new XNO(UIAnnotationSliderUIMore.dynamicCast(uIAnnotationSlider.getUIMore()));
    }
}
