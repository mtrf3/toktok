package com.ss.android.ugc.aweme.contentlanguage.api;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C26383AXb;
import X.C26384AXc;
import X.C26387AXf;
import X.C38987FRv;
import X.C58096Mr6;
import X.C73969T1h;
import X.PEH;
import X.RBW;
import X.T16;
import X.ViewOnClickListenerC26389AXh;
import Y.IDxS74S0000000_4;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ContentLanguageGuideServiceImpl implements IContentLanguageGuideService {
    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void LIZ() {
        C26387AXf.LIZ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final String LJ() {
        C26383AXb LIZ = C26387AXf.LIZ();
        LIZ.getClass();
        if (RBW.LJLLI.LJI()) {
            String LIZ2 = SharePrefCache.inst().getUserAddLanguages().LIZ();
            o.LJIIIIZZ(LIZ2, "{\n            SharePrefC…Languages.cache\n        }");
            return LIZ2;
        }
        return LIZ.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final boolean LJII() {
        return C26387AXf.LIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final boolean LJIIIIZZ() {
        boolean z;
        C26383AXb LIZ = C26387AXf.LIZ();
        String LIZIZ = LIZ.LIZ.LIZIZ();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(LIZIZ)) {
            jSONObject.put("content_language_not_login", LIZIZ);
        }
        if (jSONObject.length() > 0) {
            AbstractC73672Svk<BaseResponse> unloginContentPreference = ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(LanguageApi.class)).setUnloginContentPreference("settings_not_login", jSONObject.toString());
            if (unloginContentPreference != null) {
                unloginContentPreference.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS74S0000000_4(2));
            }
            z = true;
        } else {
            z = false;
        }
        C26384AXc c26384AXc = LIZ.LIZ;
        c26384AXc.getClass();
        try {
            c26384AXc.LIZ().LJIIIZ(false);
        } catch (Throwable th) {
            PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
        }
        LIZ.LIZ.LIZJ("");
        LIZ.LIZIZ = false;
        LIZ.LIZIZ();
        return z;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final boolean LJIIJJI() {
        C26383AXb LIZ = C26387AXf.LIZ();
        LIZ.getClass();
        Boolean LIZLLL = C38987FRv.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
        if (!LIZLLL.booleanValue()) {
            return false;
        }
        C26384AXc c26384AXc = LIZ.LIZ;
        c26384AXc.getClass();
        try {
        } catch (Throwable th) {
            PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
        }
        if (c26384AXc.LIZ().LJI()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void onFeedStop() {
        ViewOnClickListenerC26389AXh viewOnClickListenerC26389AXh = C26387AXf.LIZ().LIZLLL;
        if (viewOnClickListenerC26389AXh != null) {
            viewOnClickListenerC26389AXh.LJFF();
        }
    }

    public static IContentLanguageGuideService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IContentLanguageGuideService.class, false);
        if (LIZ != null) {
            return (IContentLanguageGuideService) LIZ;
        }
        if (C58096Mr6.m == null) {
            synchronized (IContentLanguageGuideService.class) {
                if (C58096Mr6.m == null) {
                    C58096Mr6.m = new ContentLanguageGuideServiceImpl();
                }
            }
        }
        return C58096Mr6.m;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void LJFF(String str) {
        AbstractC73672Svk<BaseResponse> contentLanguage;
        C26383AXb LIZ = C26387AXf.LIZ();
        LIZ.getClass();
        if (RBW.LJLLI.LJI()) {
            LanguageApi languageApi = (LanguageApi) LIZ.LJ.getValue();
            if (languageApi != null && (contentLanguage = languageApi.setContentLanguage("content_language", str, 1)) != null) {
                contentLanguage.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS74S0000000_4(1));
                return;
            }
            return;
        }
        LIZ.LIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void LJI(Context context) {
        if (context == null) {
            return;
        }
        C26383AXb LIZ = C26387AXf.LIZ();
        LIZ.getClass();
        if (!LIZ.LIZIZ) {
            return;
        }
        LIZ.LIZLLL(context);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void LJIIJ(Context context) {
        o.LJIIIZ(context, "context");
        C26387AXf.LIZ().LIZLLL(context);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService
    public final void LJIIIZ(ActivityC45651qj context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        C26383AXb LIZ = C26387AXf.LIZ();
        LIZ.getClass();
        ViewOnClickListenerC26389AXh viewOnClickListenerC26389AXh = LIZ.LIZLLL;
        if (viewOnClickListenerC26389AXh != null && viewOnClickListenerC26389AXh.isShowing()) {
            if (ContentLanguageServiceImpl.LJIIJJI().LJIIJ(aweme)) {
                ViewOnClickListenerC26389AXh viewOnClickListenerC26389AXh2 = LIZ.LIZLLL;
                if (viewOnClickListenerC26389AXh2 != null) {
                    viewOnClickListenerC26389AXh2.LJLJJLL = System.currentTimeMillis();
                    return;
                }
                return;
            }
            try {
                ViewOnClickListenerC26389AXh viewOnClickListenerC26389AXh3 = LIZ.LIZLLL;
                if (viewOnClickListenerC26389AXh3 != null) {
                    viewOnClickListenerC26389AXh3.dismiss();
                }
                LIZ.LIZIZ = true;
                if (RBW.LJLLI.LJI()) {
                    BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().setContentLanguageDialogShown(false);
                    return;
                }
                C26384AXc c26384AXc = LIZ.LIZ;
                c26384AXc.getClass();
                try {
                    c26384AXc.LIZ().LJIIIZ(false);
                } catch (Throwable th) {
                    PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
                }
                LIZ.LIZ.LIZJ("");
                return;
            } catch (IllegalArgumentException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        if (!LIZ.LIZIZ) {
            return;
        }
        LIZ.LIZLLL(context);
    }
}
