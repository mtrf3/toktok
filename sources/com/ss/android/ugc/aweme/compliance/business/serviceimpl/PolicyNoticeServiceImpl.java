package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AV1;
import X.C03880Dg;
import X.C221108m2;
import X.C39257Fav;
import X.C39258Faw;
import X.C39335FcB;
import X.C39344FcK;
import X.C39345FcL;
import X.C39519Ff9;
import X.C54936LhE;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65928Pu8;
import X.C6D8;
import X.C73428Sro;
import X.C73969T1h;
import X.C76800UCe;
import X.C8GG;
import X.E77;
import X.E7R;
import X.EF7;
import X.EKV;
import X.EKW;
import X.EnumC39255Fat;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.T16;
import Y.AfS53S0100000_1;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.compliance.business.policynotice.api.PolicyNoticeApi;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2;
import defpackage.e1;
import java.util.Locale;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class PolicyNoticeServiceImpl implements IPolicyNoticeService {
    public boolean LIZ;
    public final C39344FcK LIZIZ = new C39344FcK(this);
    public final C39345FcL LIZJ = new C39345FcL(this);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C39335FcB.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 34));
    public EKV LJFF;

    public static String LJFF(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "android_id"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "3176449833496478895");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public static long LJI() {
        long LJI = EF7.LJI();
        try {
            for (String str : (String[]) s.LJLJJL(EF7.LIZLLL(), new String[]{"."}, 0, 6).toArray(new String[0])) {
                Integer valueOf = CastIntegerProtector.valueOf(str);
                o.LJIIIIZZ(valueOf, "valueOf(aVersion)");
                LJI = valueOf.longValue() + (100 * LJI);
            }
        } catch (Throwable unused) {
        }
        return LJI;
    }

    public static String LJ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                return "";
            }
            if (TextUtils.isEmpty(E77.LIZ)) {
                E77.LIZ = LJFF(contentResolver);
            }
            return E77.LIZ;
        }
        return LJFF(contentResolver);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final View LIZIZ(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context = rootView.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        C8GG c8gg = new C8GG(context);
        c8gg.setVisibility(8);
        c8gg.setLayoutParams(layoutParams);
        return c8gg;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void LIZJ(Context context) {
        String str;
        String str2;
        o.LJIIIZ(context, "context");
        Long l = null;
        try {
            str = LJ(context.getContentResolver());
        } catch (Exception unused) {
            str = null;
        }
        SharedPreferences LIZIZ = AutobackupService.LIZJ().LIZIZ();
        long j = LIZIZ.getLong("last_acceptance_time", -1L);
        String string = LIZIZ.getString("last_acceptance_country_code", null);
        int i = C39258Faw.LIZ[C39257Fav.LIZLLL().ordinal()];
        if (i != 1) {
            if (i != 2) {
                str2 = "row_dnu_consent_box";
            } else {
                str2 = "eu_dnu_consent_box";
            }
        } else {
            str2 = "kr_dnu_consent_box";
        }
        if (string != null) {
            str = null;
        }
        EKV ekv = this.LJFF;
        if (ekv != null) {
            ekv.dispose();
        }
        E7R e7r = PolicyNoticeApi.LIZ;
        if (j != -1) {
            l = Long.valueOf(j);
        }
        long LJI = LJI();
        String LJIILL = AccountService.LJIJ().LJIILL();
        o.LJIIIIZZ(LJIILL, "get().getService(IAccoun…ava).storeRegionUpperCase");
        String lowerCase = LJIILL.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        e7r.getClass();
        C73428Sro LJJL = E7R.LIZIZ.consentAcceptance(str, l, string, LJI, str2, lowerCase).LJJL(T16.LIZ());
        EKV ekv2 = new EKV();
        LJJL.LIZ(ekv2);
        this.LJFF = ekv2;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void LIZLLL(boolean z) {
        int value;
        int value2;
        IComplianceDependService LIZ;
        if ((z && (LIZ = C54936LhE.LIZ()) != null && LIZ.LIZ()) || TpcConsentServiceImpl.LJIIZILJ().LJIILJJIL() || C6D8.LIZLLL() || this.LIZ) {
            return;
        }
        this.LIZ = true;
        if (e1.LIZ(31744, "popupsdk_multi_enabled", true, false)) {
            UniversalPopupService2 universalPopupService2 = (UniversalPopupService2) this.LIZLLL.getValue();
            if (z) {
                value2 = EnumC39255Fat.SCENE_LOGIN.getValue();
            } else {
                value2 = EnumC39255Fat.SCENE_COLD_LAUNCH.getValue();
            }
            universalPopupService2.LIZIZ(value2, EF7.LIZIZ(), this.LIZJ, this.LIZIZ, new AqS172S0100000_6(this, 11));
            return;
        }
        UniversalPopupService universalPopupService = (UniversalPopupService) this.LJ.getValue();
        if (z) {
            value = EnumC39255Fat.SCENE_LOGIN.getValue();
        } else {
            value = EnumC39255Fat.SCENE_COLD_LAUNCH.getValue();
        }
        universalPopupService.LIZLLL(value, EF7.LIZIZ(), new AqS172S0100000_6(this, 12));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void LIZ(final String str, final String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        boolean z;
        String str5;
        int i = 0;
        if (o.LJ(str, "kr_dnu_consent_box") || o.LJ(str, "eu_dnu_consent_box") || o.LJ(str, "row_dnu_consent_box")) {
            z = true;
        } else {
            z = false;
        }
        Long l = null;
        if (z) {
            String LJIILL = AccountService.LJIJ().LJIILL();
            o.LJIIIIZZ(LJIILL, "get().getService(IAccoun…ava).storeRegionUpperCase");
            str5 = LJIILL.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            l = Long.valueOf(LJI());
        } else {
            str5 = null;
        }
        E7R e7r = PolicyNoticeApi.LIZ;
        if (num2 != null) {
            i = num2.intValue();
        }
        Integer valueOf = Integer.valueOf(i);
        e7r.getClass();
        E7R.LIZIZ.policyNoticeApprove(str, str2, str3, str4, num, valueOf, str5, l).LJJL(T16.LIZ()).LJIJJLI(new EKW(z, bool, this)).LJIJJ(new InterfaceC64592gB() { // from class: X.2nI
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String message = ((Throwable) obj).getMessage();
                String str6 = "";
                if (message == null) {
                    message = "";
                }
                String str7 = str;
                String str8 = str2;
                C188727au c188727au = new C188727au();
                if (str7 == null) {
                    str7 = "";
                }
                c188727au.LJIIIZ("business", str7);
                if (str8 != null) {
                    str6 = str8;
                }
                c188727au.LJIIIZ("version", str6);
                c188727au.LJIIIZ("error", message);
                c188727au.LIZLLL(2, "type");
                FMX.LJIIL("tns_general_failure", c188727au.LIZ);
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = interfaceC65784Pro2;
                if (interfaceC65784Pro3 != null) {
                    interfaceC65784Pro3.invoke();
                }
            }
        }).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(interfaceC65784Pro, 20), new InterfaceC64592gB() { // from class: X.2nJ
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
