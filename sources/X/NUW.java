package X;

import com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;

/* loaded from: classes11.dex */
public final class NUW {
    public static PreRenderWebViewBusiness LIZ(NUT nut) {
        C59472NVs c59472NVs;
        C59304NPg c59304NPg;
        if (nut != null) {
            c59472NVs = nut.getParams();
        } else {
            c59472NVs = null;
        }
        if (!(c59472NVs instanceof NP1) || (c59304NPg = (C59304NPg) c59472NVs) == null || c59304NPg.LJI() != 7) {
            return null;
        }
        return (PreRenderWebViewBusiness) nut.LIZ(PreRenderWebViewBusiness.class);
    }
}
