package com.ss.android.ugc.aweme.service;

import X.AbstractC73638SvC;
import X.C221108m2;
import X.C232409Ae;
import X.C235769Nc;
import X.C254389yc;
import X.C254419yf;
import X.C254439yh;
import X.C254499yn;
import X.C47261Igj;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C78999UzT;
import X.HG3;
import X.RBX;
import X.T16;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.paidcontent.api.EventTypes;
import com.ss.android.ugc.aweme.paidcontent.api.PromoteApi;
import com.ss.android.ugc.aweme.paidcontent.api.PromoteImpressionEvent;
import com.ss.android.ugc.aweme.profile.model.PaidContentAwareBannerSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentAwareBannerServiceImpl implements IPaidContentAwareBannerService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C254419yf.LJLIL);
    public final C73318Sq2 LIZIZ = new C73318Sq2();

    public static IPaidContentAwareBannerService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IPaidContentAwareBannerService.class, false);
        if (LIZ != null) {
            return (IPaidContentAwareBannerService) LIZ;
        }
        return new PaidContentAwareBannerServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final void LIZ() {
        this.LIZIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final AbstractC73638SvC<BaseResponse> LIZIZ() {
        List LJJIJ = C47261Igj.LJJIJ(new EventTypes(16));
        PromoteApi.LIZ.getClass();
        return C254389yc.LIZ().logPromoteImpression(new PromoteImpressionEvent(null, LJJIJ, 1, null));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final boolean LIZLLL() {
        if (this.LIZ.getValue() == null || !C232409Ae.LIZ()) {
            return false;
        }
        Object value = C254439yh.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-bannerVisitRepo>(...)");
        if (((Keva) value).getInt(((RBX) HG3.LJIILL()).getCurUserId(), 0) < ((PaidContentAwareBannerSetting) C254439yh.LIZIZ.getValue()).getAwareBannerMaxDisplayCount()) {
            return true;
        }
        C78999UzT.LJFF(LJ().LJJIIJ(T16.LIZ()).LJJI(), this.LIZIZ);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final AbstractC73638SvC<BaseResponse> LJ() {
        List LJJIJ = C47261Igj.LJJIJ(new EventTypes(14));
        PromoteApi.LIZ.getClass();
        return C254389yc.LIZ().logPromoteImpression(new PromoteImpressionEvent(null, LJJIJ, 1, null));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final void LIZJ(C235769Nc c235769Nc) {
        if (this.LIZ.getValue() != null) {
            PaidContentAwareBannerSetting bannerInfo = (PaidContentAwareBannerSetting) this.LIZ.getValue();
            o.LJIIIIZZ(bannerInfo, "bannerInfo");
            PopupManager.LJIIL(new C254499yn(c235769Nc, bannerInfo, this.LIZIZ));
        }
    }
}
