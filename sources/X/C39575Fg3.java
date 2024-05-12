package X;

import Y.ACallableS109S0100000_6;
import android.app.Activity;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxEnv;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLocalServiceImpl;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fg3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39575Fg3 implements InterfaceC39390Fd4 {
    public final WeakReference<Context> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ ABP LIZLLL;
    public final /* synthetic */ C87093YGb LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        GeckoLocalService geckoLocalService;
        EnumC39924Flg enumC39924Flg;
        C39392Fd6.LIZJ("pref_language_key", this.LIZIZ);
        C39392Fd6.LIZJ("key_current_locale", this.LIZJ);
        Context context = this.LIZ.get();
        if (context == null) {
            return;
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            LJIJJ.finish();
        }
        C40406FtS.LIZ.LIZ = false;
        C39576Fg4.LIZ(2);
        this.LJ.getClass();
        C87093YGb.LIZLLL(context);
        ABP abp = this.LIZLLL;
        if (abp != null) {
            C25813ABd c25813ABd = (C25813ABd) abp;
            String str = c25813ABd.LIZ;
            String str2 = c25813ABd.LIZIZ;
            try {
                JSONObject jSONObject = new JSONObject();
                if (str == null) {
                    str = "";
                }
                jSONObject.put("pre_label", str);
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("label", str2);
                AppLogNewUtils.onEventV3("save_app_language_change", jSONObject);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        C47242IgQ.LIZ().clearCache();
        Keva.getRepo("TTSettingData").erase("last_get_setting_time");
        SettingManagerServiceImpl.LIZJ().LIZ(2);
        C56971MXn.LIZIZ();
        C87093YGb c87093YGb = this.LJ;
        c87093YGb.getClass();
        FGR.LIZIZ().LIZ(null, new ACallableS109S0100000_6(c87093YGb, 42), 0);
        BusinessComponentServiceUtils.getLiveAllService().getClass();
        Live.switchLocale();
        RBX rbx = (RBX) HG3.LJIILL();
        if (rbx.isLogin()) {
            rbx.updateLanguage(null, SettingServiceImpl.LIZ().getAppLanguage(), 0);
        }
        C38499F9b.LIZ.LIZIZ().notifyLocaleChange(C85999Xp5.LIZJ(context, null, null));
        IMService.createIIMServicebyMonsterPlugin(false).getImInitializeService().LJ();
        Object LIZ = C58096Mr6.LIZ(GeckoLocalService.class, false);
        if (LIZ != null) {
            geckoLocalService = (GeckoLocalService) LIZ;
        } else {
            if (C58096Mr6.Z7 == null) {
                synchronized (GeckoLocalService.class) {
                    if (C58096Mr6.Z7 == null) {
                        C58096Mr6.Z7 = new GeckoLocalServiceImpl();
                    }
                }
            }
            geckoLocalService = C58096Mr6.Z7;
        }
        geckoLocalService.LIZ();
        FCG fcg = FCH.LIZIZ;
        String locale = C85999Xp5.LIZIZ();
        fcg.getClass();
        o.LJIIJ(locale, "locale");
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        o.LJFF(LJIIIZ, "LynxEnv.inst()");
        LJIIIZ.LJJIFFI = locale;
        C31999Ch9.LIZJ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C31999Ch9.LIZ);
        linkedHashMap.putAll(C31999Ch9.LIZIZ);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC60761Nsz interfaceC60761Nsz = (InterfaceC60761Nsz) ((Reference) ((Map.Entry) it.next()).getValue()).get();
            if (interfaceC60761Nsz != 0) {
                InterfaceC60710NsA interfaceC60710NsA = interfaceC60761Nsz.getHybridContext().hybridParams;
                if (interfaceC60710NsA != null) {
                    enumC39924Flg = interfaceC60710NsA.getType();
                } else {
                    enumC39924Flg = null;
                }
                if (enumC39924Flg == EnumC39924Flg.LYNX) {
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    javaOnlyMap.putString("locale", locale);
                    ((VNS) interfaceC60761Nsz).sendGlobalEventToLepus("onLocaleChanged", C47261Igj.LJJIJ(javaOnlyMap));
                }
            }
        }
        C55888Lwa.LIZIZ.notifyLocaleChange(C85999Xp5.LIZJ(context, null, null));
        TranslationServiceImpl.LJJIJ().LJIJ();
    }

    public C39575Fg3(C87093YGb c87093YGb, Context context, String str, String str2, C25813ABd c25813ABd) {
        this.LJ = c87093YGb;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c25813ABd;
        this.LIZ = new WeakReference<>(context);
    }
}
