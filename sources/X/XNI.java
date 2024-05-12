package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationTextInput;
import com.bytedance.ies.effecteditor.swig.UIAnnotationTextInputUIMore;

/* loaded from: classes16.dex */
public final class XNI extends XN9<XNR, UIAnnotationTextInput> {
    @Override // X.XN9
    public final UIAnnotationErrorCode LIZIZ() {
        U u = this.LIZJ;
        if (u == 0) {
            return UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr;
        }
        return u.refreshAnnotationPreview();
    }

    public XNI(UIAnnotationTextInput uIAnnotationTextInput, XN6 xn6) {
        super(uIAnnotationTextInput, xn6);
        if (uIAnnotationTextInput == null) {
            return;
        }
        this.LIZ = new XNQ(UIAnnotationTextInputUIMore.dynamicCast(uIAnnotationTextInput.getUIMore()));
    }
}
