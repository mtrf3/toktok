package com.ss.android.ugc.aweme.commercialize.live.promote.service;

import X.AnonymousClass629;
import X.C188727au;
import X.C19N;
import X.C42955GtT;
import X.C47261Igj;
import X.C58096Mr6;
import X.C64707PaR;
import X.C73969T1h;
import X.EF7;
import X.FMX;
import X.HG3;
import X.NIC;
import X.NID;
import X.NIE;
import X.NIF;
import X.NIG;
import X.NIH;
import X.OKW;
import X.RBX;
import X.T16;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventCategories;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventCommon;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventData;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventModel;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventPayload;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PromoteUtilImpl implements IPromoteUtil {
    public static final Map<String, Boolean> LIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final void LJ() {
        NIC.LIZ = null;
        NIC.LIZJ = null;
    }

    public static IPromoteUtil LJIIIZ() {
        Object LIZ2 = C58096Mr6.LIZ(IPromoteUtil.class, false);
        if (LIZ2 != null) {
            return (IPromoteUtil) LIZ2;
        }
        if (C58096Mr6.LLLLLJLJLL == null) {
            synchronized (IPromoteUtil.class) {
                if (C58096Mr6.LLLLLJLJLL == null) {
                    C58096Mr6.LLLLLJLJLL = new PromoteUtilImpl();
                }
            }
        }
        return C58096Mr6.LLLLLJLJLL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LIZ() {
        return e1.LIZ(31744, "promote_use_ad_hybrid", true, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final String LIZJ() {
        return AnonymousClass629.LIZ("randomUUID().toString()");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final void LJFF() {
        C42955GtT.LIZ.checkUserPromoteEligible().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(NIE.LJLIL, NIF.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LJIIIIZZ() {
        return C19N.LJ("promote_other_no_show_in_fyp", false);
    }

    public static boolean LJIIJ() {
        if (OKW.LIZJ().length() == 0) {
            return false;
        }
        Boolean bool = (Boolean) ((LinkedHashMap) LIZ).get(OKW.LIZJ());
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LJI() {
        if (OKW.LIZJ().length() == 0) {
            return false;
        }
        if (((LinkedHashMap) LIZ).get(OKW.LIZJ()) == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LIZIZ(Aweme aweme) {
        PromoteModel promoteModel;
        if (aweme != null && (promoteModel = aweme.getPromoteModel()) != null && promoteModel.isPromoteAdLabel()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r9, X.C59948Nfs r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.live.promote.service.PromoteUtilImpl.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, X.Nfs):boolean");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final void LJII(String sessionId, String str, String str2) {
        o.LJIIIZ(sessionId, "sessionId");
        SettingsManager.LIZLLL().getClass();
        String str3 = "";
        String LJI = SettingsManager.LJI("promote_entrance_click_url", "");
        if (LJI == null) {
            LJI = "";
        }
        if (TextUtils.isEmpty(LJI)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("session_id", sessionId);
            c188727au.LJIIIZ("is_success", CardStruct.IStatusCode.DEFAULT);
            c188727au.LJIIIZ("promote_by", str2);
            c188727au.LJIIIZ("store_country", C64707PaR.LIZJ);
            FMX.LJIIL("promote_entrance_click", c188727au.LIZ);
            return;
        }
        if (NIH.LIZ.contains(str)) {
            str3 = "delivery";
        } else if (NIH.LIZIZ.contains(str)) {
            str3 = "promote-center";
        }
        String valueOf = String.valueOf(EF7.LJIIIZ);
        String LJII = EF7.LJII();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        PromoteEventCommon promoteEventCommon = new PromoteEventCommon(null, null, null, null, sessionId, valueOf, LJII, null, curUserId, 143, null);
        String valueOf2 = String.valueOf(EF7.LJIIIZ);
        String LJII2 = EF7.LJII();
        String str4 = C64707PaR.LIZJ;
        o.LJIIIIZZ(str4, "getUserRegion()");
        C42955GtT.LIZ.postPromoteClickToFE(LJI, new PromoteEventData(null, C47261Igj.LJJIJ(new PromoteEventModel(null, promoteEventCommon, new PromoteEventPayload(null, null, new PromoteEventCategories(str, str2, str4, valueOf2, LJII2, null, str3, 32, null), 3, null), 1, null)), 1, null)).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(NIG.LJLIL, new NID(str, sessionId, str2));
    }
}
