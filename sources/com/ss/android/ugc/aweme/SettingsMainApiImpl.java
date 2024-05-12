package com.ss.android.ugc.aweme;

import X.C100023wE;
import X.C118554l1;
import X.C157566Gi;
import X.C158056If;
import X.C16880lQ;
import X.C34656Diu;
import X.C37026Eg2;
import X.C58096Mr6;
import X.C59646Nb0;
import X.C68322mC;
import X.C85906Xna;
import X.E3F;
import X.EU4;
import X.EUJ;
import X.FCD;
import X.FFL;
import X.FUK;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.ZstdService;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.google.gson.m;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.network.spi.IZstdService;
import com.ss.android.ugc.aweme.setting.GetPushSettingCallback;
import com.ss.android.ugc.aweme.setting.serverpush.presenter.IGetPushSettingCallback;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SettingsMainApiImpl implements ISettingsMainApi {
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final C100023wE LJ() {
        C100023wE c100023wE = new C100023wE();
        c100023wE.LIZ = 10;
        c100023wE.LIZJ = false;
        c100023wE.LIZLLL = 5;
        c100023wE.LJ = 3;
        c100023wE.LIZ = SharePrefCache.inst().getMultiSelectLimit();
        return c100023wE;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final List<EUJ> LJII() {
        IGetPushSettingCallback iGetPushSettingCallback;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C118554l1.LIZ());
        Object LIZ = C58096Mr6.LIZ(IGetPushSettingCallback.class, false);
        if (LIZ != null) {
            iGetPushSettingCallback = (IGetPushSettingCallback) LIZ;
        } else {
            if (C58096Mr6.r6 == null) {
                synchronized (IGetPushSettingCallback.class) {
                    if (C58096Mr6.r6 == null) {
                        C58096Mr6.r6 = new GetPushSettingCallback();
                    }
                }
            }
            iGetPushSettingCallback = C58096Mr6.r6;
        }
        iGetPushSettingCallback.getPushSettingCallback();
        arrayList.add(C85906Xna.LJLIL);
        arrayList.add(new FUK());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final boolean shouldUseRecyclerPartialUpdate() {
        return e1.LIZ(31744, "share_useNotifySingle", true, false);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZ(Context context) {
        IZstdService zstdService;
        if (FCD.LJI(context)) {
            Keva repo = KevaImpl.getRepo("ab_iorap_repo", 0);
            FFL.LJIIIZ().getClass();
            repo.storeBoolean("iorap_enable_prefetch", FFL.LJ(31744, "iorap_enable_prefetch", true, false));
        }
        Object LIZ = C58096Mr6.LIZ(IZstdService.class, false);
        if (LIZ != null) {
            zstdService = (IZstdService) LIZ;
        } else {
            zstdService = new ZstdService();
        }
        zstdService.LIZ();
        UgCommonServiceImpl.LJIJ().LIZ(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZIZ(m rawJson) {
        synchronized (C37026Eg2.LIZ) {
            o.LJIIIZ(rawJson, "rawJson");
            C68322mC c68322mC = new C68322mC();
            E3F.LIZJ("GetABTestHelper", new AqS148S0200000_1(rawJson, (m) c68322mC, (C68322mC<JSONObject>) 28), new AqS153S0200000_6(rawJson, (m) c68322mC, (C68322mC<JSONObject>) 12), ((Boolean) C34656Diu.LIZIZ.getValue()).booleanValue());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = (JSONObject) c68322mC.element;
            if (jSONObject2 != null) {
                for (String str : C37026Eg2.LIZ()) {
                    Object opt = jSONObject2.opt(str);
                    if (opt != null) {
                        jSONObject.put(str, opt);
                    }
                }
            }
            C37026Eg2.LIZLLL = jSONObject;
            Object value = C37026Eg2.LIZIZ.getValue();
            o.LJIIIIZZ(value, "<get-KEVA_REPO>(...)");
            ((Keva) value).storeString("hybrid_abtest", jSONObject.toString());
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZJ(Activity activity) {
        IContentLanguageGuideService LIZIZ = ContentLanguageGuideServiceImpl.LIZIZ();
        if (activity != null && LIZIZ.LJIIJJI()) {
            LIZIZ.LJIIJ(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZLLL(EU4 eu4) {
        Object obj = eu4.LIZ;
        if ((obj == null || (obj instanceof C157566Gi)) && obj != null) {
            try {
                SettingsManager.LIZLLL().getClass();
                String[] strArr = (String[]) SettingsManager.LJII("aweme_ad_link_priority", String[].class);
                if (strArr != null) {
                    List<String> asList = Arrays.asList(strArr);
                    if (asList != null && (!asList.isEmpty())) {
                        C59646Nb0.LIZ = asList;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final C100023wE LJI(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        C100023wE c100023wE = new C100023wE();
        try {
            if (iESSettingsProxy.getImContactsMultiSelectLimit().intValue() > 0) {
                SharePrefCache.inst().getMultiSelectLimitItem().LJ(editor, iESSettingsProxy.getImContactsMultiSelectLimit());
                c100023wE.LIZ = iESSettingsProxy.getImContactsMultiSelectLimit().intValue();
            } else {
                c100023wE.LIZ = SharePrefCache.inst().getMultiSelectLimit();
            }
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
            c100023wE.LIZ = SharePrefCache.inst().getMultiSelectLimit();
        }
        try {
            c100023wE.LIZJ = iESSettingsProxy.getDisableImMessageFullFeedSlide().booleanValue();
        } catch (C158056If e2) {
            C16880lQ.LLLLIIL(e2);
        }
        try {
            c100023wE.LIZLLL = iESSettingsProxy.getEnabledImAsupporterMsgTypes().intValue();
        } catch (C158056If e3) {
            C16880lQ.LLLLIIL(e3);
        }
        try {
            c100023wE.LJ = iESSettingsProxy.getEnabledImAsupporterFuncs().intValue();
        } catch (C158056If e4) {
            C16880lQ.LLLLIIL(e4);
        }
        c100023wE.LIZIZ = iESSettingsProxy.getImImageDomains();
        return c100023wE;
    }
}
