package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.communicate;

import X.C49679Jed;
import X.C49680Jee;
import X.C49681Jef;
import X.C50345JpN;
import X.C51757KSz;
import X.C78857UxB;
import X.EnumC50341JpJ;
import X.F2Y;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.JYG;
import X.VNS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenSingleFeedbackSheetMethod extends BaseBridgeMethod {
    public final C50345JpN LJLIL;

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "openSingleFeedbackSheet";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenSingleFeedbackSheetMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = new C50345JpN(contextProviderFactory, "openSingleFeedbackSheet", EnumC50341JpJ.STABLE);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        UrlModel urlModel;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLIL.LIZ(params, iReturn)) {
            return;
        }
        try {
            String optString = params.optString("feedback_type");
            String optString2 = params.optString("img_cover");
            String optString3 = params.optString("title");
            String optString4 = params.optString("extra_log_params");
            VNS vns = null;
            if (C78857UxB.LJJJIL(optString2)) {
                urlModel = (UrlModel) GsonHolder.LIZLLL().LIZ().LJII(optString2, new C49681Jef().getType());
            } else {
                urlModel = null;
            }
            Map map = (Map) GsonHolder.LIZLLL().LIZ().LJII(optString4, new C49679Jed().getType());
            F2Y LIZ = this.contextProviderFactory.LIZ(VNS.class);
            if (LIZ != null) {
                vns = (VNS) LIZ.LIZIZ();
            }
            JYG jyg = new JYG(optString, urlModel, optString3, C51757KSz.LIZLLL(optString), map, null, null, 96, null);
            String optString5 = params.optString("extra_params");
            if (C78857UxB.LJJJIL(optString5)) {
                try {
                    Map map2 = (Map) GsonHolder.LIZLLL().LIZ().LJII(optString5, new C49680Jee().getType());
                    if (map2 != null) {
                        if (C78857UxB.LJJJIL((String) map2.get("aweme_id"))) {
                            jyg.setAwemeId((String) map2.get("aweme_id"));
                        }
                        if (C78857UxB.LJJJIL((String) map2.get("author_id"))) {
                            jyg.setAuthorId((String) map2.get("author_id"));
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (vns != null) {
                C51757KSz.LIZIZ(vns, jyg);
            }
            iReturn.onSuccess(new JSONObject());
        } catch (Exception e) {
            iReturn.LIZ(-1, e.getMessage());
        }
    }
}
