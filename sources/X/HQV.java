package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HQV extends HQX {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Object obj;
        Activity LIZLLL;
        HQY hqy = (HQY) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            obj = GsonHolder.LIZLLL().LIZ().LJI(GsonHolder.LIZLLL().LIZ().LJIILL(hqy.getAweme()), Aweme.class);
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("deserialized error, aweme is ");
            LIZ.append(hqy.getAweme());
            C31626Cb8.LIZ(c37356ElM, -1, X1D.LIZIZ(LIZ), 4);
            obj = null;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null) {
            if (obj != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(LIZLLL, "aweme://template/ugc/preview");
                buildRoute.withParam("ugc_preview_enter_from", "jsb");
                buildRoute.withParam("aweme_model", (Serializable) obj);
                buildRoute.withParam("ugc_extra_template_id", hqy.getTemplateId());
                buildRoute.withParam("ugc_extra_nle_summary", hqy.getNleSummary());
                buildRoute.withParam("ugc_extra_challenge_name", hqy.getChallengeName());
                buildRoute.withParam("ugc_extra_anchors", hqy.getAnchors());
                buildRoute.withParam("ugc_extra_open_platform", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), hqy.getExtra()));
                buildRoute.withParam("ugc_shoot_way", hqy.getShootWay());
                buildRoute.open();
                c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC44038HQc.class, null), "");
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C31626Cb8.LIZ(c37356ElM, -1, "owner activity is null.", 4);
    }
}
