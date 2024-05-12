package com.ss.android.ugc.aweme.services;

import X.C221108m2;
import X.C35936E8m;
import X.C38985FRt;
import X.C38987FRv;
import X.C51029K0z;
import X.C58096Mr6;
import X.C5H3;
import X.C61650OHm;
import X.C79061V1d;
import X.C85990Xow;
import X.EnumC35839E4t;
import X.FMX;
import X.HG3;
import X.OKG;
import X.V0N;
import android.os.Bundle;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import defpackage.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MandatoryLoginService implements IMandatoryLoginService {
    public static final Companion Companion = new Companion();
    public boolean hasRequestComplianceApi;
    public final C5H3 hybridABForcedLogin$delegate;
    public final Keva keva;
    public boolean loggedInitialMandatoryLoginDecision;
    public boolean skipLoginForTest;

    private final boolean isMockPopup() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean disableForTest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public void skipLoginForTest() {
        this.skipLoginForTest = true;
    }

    private final Companion.HybridABForcedLogin getHybridABForcedLogin() {
        return (Companion.HybridABForcedLogin) this.hybridABForcedLogin$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public Bundle getLoginActivityBundle() {
        Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("is_fullscreen_dialog", true, "enter_from", "cold_launch");
        m.putString("enter_method", "reopen");
        m.putBoolean("is_skippable_dialog", true ^ enableForcedLogin(false));
        return m;
    }

    public MandatoryLoginService() {
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(StateOwner.LJLIL);
        Keva repo = Keva.getRepo("mandatory_login_repo");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.keva = repo;
        this.hybridABForcedLogin$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 70));
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean shouldShowLoginTabFirst() {
        if ((o.LJ("US", AccountService.LJIJ().LJIILL()) && !t1.LJI()) || new PrevLoginPlatformService().LJI()) {
            return true;
        }
        return false;
    }

    /* loaded from: classes7.dex */
    public static final class Companion {

        /* loaded from: classes7.dex */
        public enum HybridABForcedLogin {
            CONTROL(0),
            FORCE_LOGIN(1),
            CONTROL_AAB(2);

            public static final C0030Companion Companion = new C0030Companion();
            public static final Map<Integer, HybridABForcedLogin> map;
            public final int value;

            public static HybridABForcedLogin valueOf(String str) {
                return (HybridABForcedLogin) V0N.LJJJ(HybridABForcedLogin.class, str);
            }

            static {
                HybridABForcedLogin[] values = values();
                int LJJIIZ = C51029K0z.LJJIIZ(values.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
                for (HybridABForcedLogin hybridABForcedLogin : values) {
                    linkedHashMap.put(Integer.valueOf(hybridABForcedLogin.value), hybridABForcedLogin);
                }
                map = linkedHashMap;
            }

            /* renamed from: com.ss.android.ugc.aweme.services.MandatoryLoginService$Companion$HybridABForcedLogin$Companion, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C0030Companion {
                public /* synthetic */ C0030Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public C0030Companion() {
                }

                public final HybridABForcedLogin getValue(int i) {
                    HybridABForcedLogin hybridABForcedLogin = HybridABForcedLogin.map.get(Integer.valueOf(i));
                    if (hybridABForcedLogin == null) {
                        return HybridABForcedLogin.CONTROL;
                    }
                    return hybridABForcedLogin;
                }
            }

            public final int getValue() {
                return this.value;
            }

            HybridABForcedLogin(int i) {
                this.value = i;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean getHasRequestComplianceApi() {
        return this.hasRequestComplianceApi;
    }

    public static IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IMandatoryLoginService.class, z);
        if (LIZ != null) {
            return (IMandatoryLoginService) LIZ;
        }
        if (C58096Mr6.P5 == null) {
            synchronized (IMandatoryLoginService.class) {
                if (C58096Mr6.P5 == null) {
                    C58096Mr6.P5 = new MandatoryLoginService();
                }
            }
        }
        return C58096Mr6.P5;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean enableForcedLogin(boolean z) {
        String string;
        String string2;
        boolean z2;
        Object obj;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        Integer valueOf;
        if (isMockPopup()) {
            return false;
        }
        String LIZ = C85990Xow.LIZ();
        Locale locale = Locale.ROOT;
        String LIZJ = OKG.LIZJ(locale, "ROOT", LIZ, locale, "this as java.lang.String).toUpperCase(locale)");
        String storeRegion = AccountService.LJIJ().LJIILL();
        if (!this.keva.contains("first_ever_priority_region")) {
            this.keva.storeString("first_ever_priority_region", LIZJ);
            string = LIZJ;
        } else {
            string = this.keva.getString("first_ever_priority_region", "");
            o.LJIIIIZZ(string, "keva.getString(FIRST_EVER_PRIORITY_REGION, \"\")");
        }
        if (!this.keva.contains("first_ever_store_region")) {
            o.LJIIIIZZ(storeRegion, "storeRegion");
            this.keva.storeString("first_ever_store_region", storeRegion);
            string2 = storeRegion;
        } else {
            string2 = this.keva.getString("first_ever_store_region", "");
            o.LJIIIIZZ(string2, "keva.getString(FIRST_EVER_STORE_REGION, \"\")");
        }
        if (!C38987FRv.LIZLLL().booleanValue() && !this.keva.contains("is_second_launch")) {
            this.keva.storeBoolean("is_second_launch", true);
            z2 = true;
        } else {
            z2 = false;
        }
        o.LJIIIIZZ(storeRegion, "storeRegion");
        logMandatoryLoginDecision(string, LIZJ, string2, storeRegion, z2);
        int i = this.keva.getInt("force_login_group", -1);
        if (i >= 0 && Companion.HybridABForcedLogin.Companion.getValue(i) == Companion.HybridABForcedLogin.FORCE_LOGIN) {
            return true;
        }
        if (z && getHybridABForcedLogin() == Companion.HybridABForcedLogin.FORCE_LOGIN) {
            return true;
        }
        if (GuestModeServiceImpl.LJIIJJI().LJIIJ()) {
            return false;
        }
        if (C38985FRt.LIZIZ.LJIIL().LIZLLL()) {
            return true;
        }
        Iterator LJFF = C79061V1d.LJFF(false);
        do {
            obj = null;
            if (!LJFF.hasNext()) {
                break;
            }
            obj = LJFF.next();
        } while (((IPluginService.PluginData) obj).id != EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA.getValue());
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) == null || (valueOf = Integer.valueOf(personalizedNUJV2Data.personalizedNUJLabel)) == null || (valueOf.intValue() != 1 && valueOf.intValue() != 2)) {
            LIZJ = storeRegion;
        }
        if (!o.LJ(LIZJ, "IT") && !o.LJ(LIZJ, "US") && !C61650OHm.LIZ.contains(LIZJ) && !o.LJ(LIZJ, "")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public void setHasRequestComplianceApi(boolean z) {
        this.hasRequestComplianceApi = z;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean shouldShowForcedLogin(boolean z) {
        if (disableForTest() || t1.LJI() || !enableForcedLogin(z)) {
            return false;
        }
        return true;
    }

    private final void logMandatoryLoginDecision(String str, String str2, String str3, String str4, boolean z) {
        if (this.loggedInitialMandatoryLoginDecision) {
            return;
        }
        this.loggedInitialMandatoryLoginDecision = true;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("first_ever_priority_region", str);
        c35936E8m.LIZLLL("priority_region", str2);
        c35936E8m.LIZLLL("first_ever_store_region", str3);
        c35936E8m.LIZLLL("store_region", str4);
        Boolean LIZLLL = C38987FRv.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
        c35936E8m.LIZ(LIZLLL.booleanValue() ? 1 : 0, "is_first_launch");
        c35936E8m.LIZ(z ? 1 : 0, "is_second_launch");
        FMX.LJIIL("mandatory_login_decision", c35936E8m.LIZ);
    }
}
