package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationCache;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCacheUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;

/* loaded from: classes16.dex */
public final class XNF extends XN9<XNL, UIAnnotationCache> {
    @Override // X.XN9
    public final UIAnnotationErrorCode LIZIZ() {
        U u = this.LIZJ;
        if (u == 0) {
            return UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr;
        }
        return u.refreshAnnotationPreview();
    }

    public XNF(UIAnnotationCache uIAnnotationCache, XN6 xn6) {
        super(uIAnnotationCache, xn6);
        if (uIAnnotationCache == null) {
            return;
        }
        this.LIZ = new XNK(UIAnnotationCacheUIMore.dynamicCast(uIAnnotationCache.getUIMore()));
    }
}
