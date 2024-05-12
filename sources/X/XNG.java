package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationOptionList;
import com.bytedance.ies.effecteditor.swig.UIAnnotationOptionListUIMore;

/* loaded from: classes16.dex */
public final class XNG extends XN9<XNN, UIAnnotationOptionList> {
    @Override // X.XN9
    public final UIAnnotationErrorCode LIZIZ() {
        U u = this.LIZJ;
        if (u == 0) {
            return UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr;
        }
        return u.refreshAnnotationPreview();
    }

    public XNG(UIAnnotationOptionList uIAnnotationOptionList, XN6 xn6) {
        super(uIAnnotationOptionList, xn6);
        if (uIAnnotationOptionList == null) {
            return;
        }
        this.LIZ = new XNM(UIAnnotationOptionListUIMore.dynamicCast(uIAnnotationOptionList.getUIMore()));
    }
}
