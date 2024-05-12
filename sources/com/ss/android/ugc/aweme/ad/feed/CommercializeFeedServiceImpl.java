package com.ss.android.ugc.aweme.ad.feed;

import X.C58096Mr6;
import X.C58655N0h;
import X.C58704N2e;
import X.C59218NLy;
import X.GHC;
import android.app.Activity;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.ad.feed.ad4ad.Ad4adBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class CommercializeFeedServiceImpl implements ICommercializeFeedService {
    public static ICommercializeFeedService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(ICommercializeFeedService.class, false);
        if (LIZ != null) {
            return (ICommercializeFeedService) LIZ;
        }
        if (C58096Mr6.LJLLL == null) {
            synchronized (ICommercializeFeedService.class) {
                if (C58096Mr6.LJLLL == null) {
                    C58096Mr6.LJLLL = new CommercializeFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.LJLLL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final Ad4adBottomBarAssemTrigger LIZ() {
        return new Ad4adBottomBarAssemTrigger();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final C59218NLy LIZIZ(Activity activity, GHC ghc) {
        o.LJIIIZ(activity, "activity");
        return new C59218NLy(activity, ghc);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final void LIZJ(String rawExtra, boolean z) {
        String str;
        o.LJIIIZ(rawExtra, "rawExtra");
        JSONObject jSONObject = new JSONObject(rawExtra);
        if (JSONObjectProtectorUtils.getInt(jSONObject, "CostType") != 3) {
            return;
        }
        String cId = JSONObjectProtectorUtils.getString(jSONObject, "CreativeId");
        String string = JSONObjectProtectorUtils.getString(jSONObject, "LogExtra");
        if (z) {
            str = "ad_message_show";
        } else {
            str = "ad_message_click";
        }
        o.LJIIIIZZ(cId, "cId");
        C58655N0h LJ = C58704N2e.LJ("message_ad", str, cId, string, null);
        LJ.LIZJ("countdown_push", "refer");
        LJ.LIZIZ("2", "message_type");
        LJ.LJI();
    }
}
