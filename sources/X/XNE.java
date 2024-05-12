package X;

import Y.ARunnableS18S0400000_15;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAsset;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;

/* loaded from: classes16.dex */
public final class XNE extends XN9<AbstractC83571Wr1, UIAnnotationAsset> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // X.XN9
    public final UIAnnotationErrorCode LIZIZ() {
        U u = this.LIZJ;
        if (u == 0) {
            return UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr;
        }
        return u.refreshAnnotationPreview();
    }

    public XNE(UIAnnotationAsset uIAnnotationAsset, XN6 xn6) {
        super(uIAnnotationAsset, xn6);
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = "";
        if (uIAnnotationAsset == null) {
            return;
        }
        this.LIZ = new C83572Wr2(UIAnnotationAssetUIMore.dynamicCast(uIAnnotationAsset.getUIMore()));
    }

    public final void LIZJ(Object obj, UIAnnotationUpdateType uIAnnotationUpdateType, C2V c2v) {
        C82887Wfz.LIZ();
        C38995FSd.LIZJ().execute(new ARunnableS18S0400000_15(this, obj, uIAnnotationUpdateType, c2v, 4));
    }
}
