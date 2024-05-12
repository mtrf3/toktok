package X;

import Y.AfS0S2201000_11;
import Y.AfS0S3301000_11;
import Y.AfS20S1200000_11;
import Y.AfS23S0400000_11;
import Y.AfS23S1300000_11;
import Y.AfS24S1100000_11;
import Y.AfS32S0201000_11;
import Y.AfS34S0201000_15;
import Y.AfS3S2200000_11;
import Y.AfS40S0101000_15;
import Y.AfS50S0300000_11;
import Y.AfS60S0200000_11;
import Y.AfS63S0100000_11;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.R9t */
/* loaded from: classes12.dex */
public final class C69093R9t {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(RA0.LJLIL);
    public static final String LIZIZ = "phone";

    public static java.util.Map LJIIIIZZ() {
        int i;
        C35936E8m c35936E8m = new C35936E8m();
        String LJ = a.LIZIZ().LJ();
        int i2 = 0;
        if (LJ == null || LJ.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c35936E8m.LIZ(i ^ 1, "if_exist");
        String LJFF = GuestModeServiceImpl.LJIIJJI().LJFF();
        if (LJFF == null || LJFF.length() == 0) {
            i2 = 1;
        }
        c35936E8m.LIZ(i2 ^ 1, "if_exist_for_guest");
        FMX.LJIIL("birthday_get", c35936E8m.LIZ);
        HashMap hashMap = new HashMap();
        String LJ2 = a.LIZIZ().LJ();
        if (LJ2 != null) {
            hashMap.put("birthday", LJ2);
        } else {
            String LJFF2 = GuestModeServiceImpl.LJIIJJI().LJFF();
            if (LJFF2 != null) {
                hashMap.put("birthday", LJFF2);
            }
        }
        return hashMap;
    }

    public static boolean LJIIJ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static JSONObject LJII(R40 r40) {
        JSONObject jSONObject;
        if (r40 != null) {
            try {
                T t = r40.LJIIIZ;
                if (t != 0 && (jSONObject = t.LJ) != null) {
                    return JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static int LJIIIZ(EnumC69116RAq enumC69116RAq) {
        switch (C69115RAp.LIZIZ[enumC69116RAq.ordinal()]) {
            case 1:
                return 0;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 1;
            default:
                return -1;
        }
    }

    public static int LJIILLIIL(int i) {
        if (i == 1 || i == 3) {
            return EnumC69096R9w.ACTIVATION_NEW_REGISTER.getScene();
        }
        if (i == 4 || i == 6) {
            return EnumC69096R9w.ACTIVATION_FORGET.getScene();
        }
        if (i == 7) {
            return EnumC69096R9w.ACTIVATION_LOGIN_ONLY.getScene();
        }
        if (i == 10 || i == 8) {
            return EnumC69096R9w.ACTIVATION_BIND_V2.getScene();
        }
        if (i == 13 || i == 15) {
            return EnumC69096R9w.ACTIVATION_MODIFY.getScene();
        }
        if (i == 19) {
            return EnumC69096R9w.ACTIVATION_LOGIN_PASSWORD_NOTIFY.getScene();
        }
        if (i == 20) {
            return EnumC69096R9w.ACTIVATION_CHANGE_MOBILE.getScene();
        }
        if (i == 22) {
            return EnumC69096R9w.ACTIVATION_IDENTIFY_VERIFICATION.getScene();
        }
        if (i == 24) {
            return EnumC69096R9w.ACTIVATION_QUICK_LOGIN.getScene();
        }
        if (i == 26 || i == 27) {
            return EnumC69096R9w.ACTIVATION_AUTHORIZE.getScene();
        }
        if (i == 28) {
            return EnumC69096R9w.ACTIVATION_CHANGE_MOBILE_VERIFY.getScene();
        }
        if (i == 29) {
            return EnumC69096R9w.ACTIVATION_SAFE_LOCK.getScene();
        }
        if (i == 30) {
            return EnumC69096R9w.ACTIVATION_SAFE_UNLOCK.getScene();
        }
        if (i == 31) {
            return EnumC69096R9w.ACTIVATION_GET_OR_REGISTER.getScene();
        }
        if (i == 33) {
            return EnumC69096R9w.ACTIVATION_CHANGE_MOBILE.getScene();
        }
        if (i == 32) {
            return EnumC69096R9w.ACTIVATION_BIND_WAP.getScene();
        }
        if (i == 42) {
            return EnumC69096R9w.ACTIVATION_BIND_V2.getScene();
        }
        return -1;
    }

    public static int LJIJ(EnumC69113RAn enumC69113RAn) {
        return LJIILLIIL(LJIIZILJ(enumC69113RAn, false));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIIZILJ(X.EnumC69113RAn r2, boolean r3) {
        /*
            int[] r1 = X.C69115RAp.LIZ
            int r0 = r2.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 5: goto L22;
                case 6: goto L22;
                case 7: goto L13;
                case 8: goto L1f;
                case 9: goto L10;
                case 10: goto L1c;
                case 11: goto L19;
                case 12: goto L19;
                case 13: goto L19;
                case 14: goto L19;
                case 15: goto L19;
                case 16: goto L19;
                case 17: goto L19;
                case 18: goto L13;
                case 19: goto L16;
                case 20: goto L16;
                case 21: goto Le;
                default: goto Lb;
            }
        Lb:
            r0 = 24
        Ld:
            return r0
        Le:
            if (r3 == 0) goto L13
        L10:
            r0 = 20
            goto Ld
        L13:
            r0 = 8
            goto Ld
        L16:
            r0 = 42
            goto Ld
        L19:
            r0 = 22
            goto Ld
        L1c:
            r0 = 13
            goto Ld
        L1f:
            r0 = 33
            goto Ld
        L22:
            r0 = 4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69093R9t.LJIIZILJ(X.RAn, boolean):int");
    }

    public static void LJJIIJ(String str, java.util.Map map) {
        if (str == null || str.length() == 0) {
            map.put("rules_version", "v2");
        } else {
            map.put("rule_strategies", str);
        }
    }

    public static C73626Sv0 LIZIZ(Fragment fragment, InterfaceC69056R8i accountCallback, String str) {
        java.util.Map LJJLIL;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        C68972R5c.LJIIIIZZ(Boolean.TRUE, "phone", accountCallback.q9(), false, null, 24);
        if (C69040R7s.LIZIZ()) {
            LJJLIL = C113554cx.LJJLIL(C69040R7s.LIZ());
            LJJLIL.putAll(LJIIIIZZ());
        } else {
            LJJLIL = C113554cx.LJJLIL(LJIIIIZZ());
        }
        LJJLIL.put("mobile_profile", str);
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new C69055R8h(accountCallback, "/passport/carrier_auth/login_continue/", LJJLIL)).LJIIIZ(new AfS60S0200000_11(fragment, accountCallback, 1)).LJIIIIZZ(new AfS63S0100000_11(accountCallback, 13)));
    }

    public static C73626Sv0 LJJIII(BaseUpdatePasswordFragment fragment, BaseUpdatePasswordFragment accountCallback, String str, String str2) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(fragment);
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R8S(accountCallback, str2, str)).LJIIIZ(new AfS20S1200000_11(setPasswordMobHelper, accountCallback, str, 5)).LJIIIIZZ(new AfS20S1200000_11(setPasswordMobHelper, accountCallback, str, 8)));
    }

    public static C73626Sv0 LIZ(Fragment fragment, InterfaceC69056R8i accountCallback, String email, V86 source, String str) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(email, "email");
        o.LJIIIZ(source, "source");
        C1JD.LJJIIJZLJL(accountCallback.q9().LJJLIIIJJI(), "email", accountCallback.Hg(), accountCallback.q9().LJJLIIIJLLLLLLLZ(), str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String LIZIZ2 = C38354F3m.LIZIZ(email);
        o.LJIIIIZZ(LIZIZ2, "encryptWithXor(email)");
        linkedHashMap.put("email", LIZIZ2);
        linkedHashMap.put("email_source", String.valueOf(source.getValue()));
        linkedHashMap.put("mix_mode", "1");
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new C69055R8h(accountCallback, "/passport/email/bind_without_verify/", linkedHashMap)).LJIIIZ(new AfS24S1100000_11(accountCallback, str, 7)).LJIIIIZZ(new AfS24S1100000_11(accountCallback, str, 3)));
    }

    public static C73626Sv0 LJ(BaseI18nLoginFragment baseI18nLoginFragment, EnumC69116RAq scene, EnumC69113RAn step, BaseI18nLoginFragment baseI18nLoginFragment2, String email) {
        o.LJIIIZ(email, "email");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        return C73636SvA.LIZ(baseI18nLoginFragment, baseI18nLoginFragment2, AbstractC73635Sv9.LJ(new C69043R7v(baseI18nLoginFragment2, email, scene, step)).LJIIIIZZ(new AfS63S0100000_11(baseI18nLoginFragment2, 11)));
    }

    public static C73626Sv0 LJIIJJI(Fragment fragment, InterfaceC69056R8i accountCallback, String account, String pwd, String str) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(account, "account");
        o.LJIIIZ(pwd, "pwd");
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new C69039R7r(accountCallback, str, account, pwd)).LJIIIZ(new AfS3S2200000_11(fragment, accountCallback, str, account, 1)).LJIIIIZZ(new AfS20S1200000_11(accountCallback, str, (InterfaceC88472Yns) null, 2)));
    }

    public static /* synthetic */ C73626Sv0 LJIJJLI(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str, EnumC69113RAn enumC69113RAn, String str2) {
        return LJIJJ(fragment, interfaceC69056R8i, str, enumC69113RAn, str2, null);
    }

    public static C73626Sv0 LJJIIJZLJL(BaseAccountFlowFragment fragment, InterfaceC69056R8i accountCallback, String str, int i, java.util.Map map) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
        clientSubmitSmsCodeEvent.LJI(accountCallback.q9().LJJLIIIJJI());
        clientSubmitSmsCodeEvent.LJII(accountCallback.q9().LJJLIIIJLLLLLLLZ());
        clientSubmitSmsCodeEvent.LJIIIZ(LJIILLIIL(i));
        clientSubmitSmsCodeEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSubmitSmsCodeEvent.LJFF();
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R8X(i, accountCallback, str, map)).LJIIIZ(new AfS34S0201000_15(i, fragment, accountCallback, 1)).LJIIIIZZ(new AfS34S0201000_15(i, fragment, accountCallback, 2)));
    }

    public static C73626Sv0 LJJIIZ(Fragment fragment, InterfaceC69056R8i accountCallback, String str, int i, java.util.Map map) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new C69042R7u(i, accountCallback, str, map)).LJIIIZ(new AfS32S0201000_11(i, accountCallback, fragment, 1)).LJIIIIZZ(new AfS32S0201000_11(i, accountCallback, fragment, 2)));
    }

    public static C73626Sv0 LJIIL(Fragment fragment, InterfaceC69056R8i accountCallback, String account, String pwd, String str, String str2) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(account, "account");
        o.LJIIIZ(pwd, "pwd");
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R9A(fragment, accountCallback, str, str2, pwd, account)).LJIIIZ(new AfS20S1200000_11(fragment, accountCallback, str, 3)).LJIIIIZZ(new AfS24S1100000_11(accountCallback, str, 5)));
    }

    public static C73626Sv0 LJIJJ(Fragment fragment, InterfaceC69056R8i accountCallback, String phoneNumber, EnumC69113RAn step, String str, java.util.Map map) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(step, "step");
        int LJIIZILJ = LJIIZILJ(step, false);
        try {
            C66516Q8q LJIIL = C66513Q8n.LIZJ().LJIIL(phoneNumber, null);
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y(String.valueOf(LJIIL.getNationalNumber()), String.valueOf(LJIIL.getCountryCode()));
        } catch (Exception unused) {
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y("", "");
        }
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R8D(map, accountCallback, phoneNumber, LJIIZILJ, step)).LJIIIZ(new AfS0S2201000_11(LJIIZILJ, step, accountCallback, str, phoneNumber, 5)).LJIIIIZZ(new AfS0S2201000_11(LJIIZILJ, step, accountCallback, str, phoneNumber, 6)));
    }

    public static C73626Sv0 LJJIFFI(Fragment fragment, EnumC69116RAq scene, EnumC69113RAn step, InterfaceC69056R8i accountCallback, String phoneNumber, String str) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        int LJIIZILJ = LJIIZILJ(step, false);
        try {
            C66516Q8q LJIIL = C66513Q8n.LIZJ().LJIIL(phoneNumber, null);
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y(String.valueOf(LJIIL.getNationalNumber()), String.valueOf(LJIIL.getCountryCode()));
        } catch (Exception unused) {
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y("", "");
        }
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new C69037R7p(LJIIZILJ, str, accountCallback, phoneNumber, scene, step)).LJIIIIZZ(new AfS0S2201000_11(LJIIZILJ, step, accountCallback, str, phoneNumber, 2)).LJIIIZ(new C69094R9u(LJIIZILJ, accountCallback, str, phoneNumber, step, fragment)));
    }

    public static C73626Sv0 LIZLLL(Fragment fragment, InterfaceC69056R8i accountCallback, String phoneNumber, String str, int i, java.util.Map map, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
        clientSubmitSmsCodeEvent.LJI(accountCallback.q9().LJJLIIIJJI());
        clientSubmitSmsCodeEvent.LJII(accountCallback.q9().LJJLIIIJLLLLLLLZ());
        clientSubmitSmsCodeEvent.LJIIIZ(LJIILLIIL(i));
        clientSubmitSmsCodeEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSubmitSmsCodeEvent.LJFF();
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new C69044R7w(i, accountCallback, phoneNumber, str, map)).LJIIIZ(new AfS40S0101000_15(accountCallback, i, 2)).LJIIIIZZ(new AfS34S0201000_15(i, interfaceC88472Yns, accountCallback, 0)));
    }

    public static AbstractC73635Sv9 LJI(BaseAccountFlowFragment fragment, BaseAccountFlowFragment accountCallback, String str, String str2, boolean z, boolean z2, String str3) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(fragment);
        if (z2) {
            return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new C69034R7m(fragment, accountCallback, null, str, str2, z)).LJIIIZ(new AfS23S1300000_11(accountCallback, fragment, setPasswordMobHelper, str2, 1)).LJIIIIZZ(new AfS20S1200000_11(setPasswordMobHelper, accountCallback, str2, 9)));
        }
        if (!z2) {
            return AbstractC73635Sv9.LJ(new C69034R7m(fragment, accountCallback, str3, str, str2, z));
        }
        throw new C162476Zf();
    }

    public static AbstractC73635Sv9 LJIILIIL(Fragment fragment, EnumC69116RAq scene, EnumC69113RAn step, InterfaceC69056R8i accountCallback, String str, String smsCodeKey, boolean z) {
        boolean z2;
        boolean z3;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(smsCodeKey, "smsCodeKey");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        if (z) {
            if (scene == EnumC69116RAq.SIGN_UP) {
                z3 = true;
            } else {
                z3 = false;
            }
            return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new C69033R7l(fragment, scene, step, accountCallback, str, smsCodeKey, z3)).LJIIIIZZ(new AfS60S0200000_11(accountCallback, scene, 2)).LJIIIZ(new AfS50S0300000_11(fragment, accountCallback, scene, 1)));
        }
        if (!z) {
            if (scene == EnumC69116RAq.SIGN_UP) {
                z2 = true;
            } else {
                z2 = false;
            }
            return AbstractC73635Sv9.LJ(new C69033R7l(fragment, scene, step, accountCallback, str, smsCodeKey, z2));
        }
        throw new C162476Zf();
    }

    public static C73626Sv0 LJIILJJIL(BaseAccountFlowFragment baseAccountFlowFragment, BaseAccountFlowFragment baseAccountFlowFragment2, EnumC69116RAq scene, EnumC69113RAn step, String str, String str2, java.util.Map map) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        return C73636SvA.LIZ(baseAccountFlowFragment, baseAccountFlowFragment2, AbstractC73635Sv9.LJ(new C69051R8d(str2, str, map, baseAccountFlowFragment2)).LJIIIIZZ(new AfS63S0100000_11(baseAccountFlowFragment2, 16)).LJIIIZ(new AfS23S0400000_11(baseAccountFlowFragment, baseAccountFlowFragment2, scene, step, 0)));
    }

    public static C73626Sv0 LJJI(Fragment fragment, InterfaceC69056R8i accountCallback, String str, EnumC69116RAq scene, EnumC69113RAn step, String str2, String str3) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y("", "");
        int LJIIIZ = LJIIIZ(scene);
        int LJIIZILJ = LJIIZILJ(step, false);
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R7C(accountCallback, fragment, scene, step, str, LJIIZILJ, LJIIIZ)).LJIIIIZZ(new AfS0S2201000_11(LJIIZILJ, step, accountCallback, str3, str2, 0)).LJIIIZ(new AfS0S2201000_11(LJIIZILJ, step, accountCallback, str3, str2, 1)));
    }

    public static C73626Sv0 LJJII(Fragment fragment, InterfaceC69056R8i accountCallback, String phoneNumber, EnumC69116RAq scene, EnumC69113RAn step, String str, String ticket) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        o.LJIIIZ(ticket, "ticket");
        try {
            C66516Q8q LJIIL = C66513Q8n.LIZJ().LJIIL(phoneNumber, null);
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y(String.valueOf(LJIIL.getNationalNumber()), String.valueOf(LJIIL.getCountryCode()));
        } catch (Exception unused) {
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y("", "");
        }
        int LJIIIZ = LJIIIZ(scene);
        int LJIIZILJ = LJIIZILJ(step, false);
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R7B(str, LJIIZILJ, accountCallback, fragment, phoneNumber, ticket, LJIIIZ, scene, step)).LJIIIIZZ(new AfS0S2201000_11(LJIIZILJ, step, accountCallback, str, phoneNumber, 3)).LJIIIZ(new AfS0S2201000_11(LJIIZILJ, step, accountCallback, str, phoneNumber, 4)));
    }

    public static C73626Sv0 LJFF(String str, Fragment fragment, InterfaceC69056R8i accountCallback, String email, String str2, int i, java.util.Map map, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(email, "email");
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R8R(i, accountCallback, email, str2, map)).LJIIIZ(new AfS24S1100000_11(accountCallback, str, 6)).LJIIIIZZ(new AfS20S1200000_11(accountCallback, str, interfaceC88472Yns, 7)));
    }

    public static C73626Sv0 LJIJI(Fragment fragment, InterfaceC69056R8i accountCallback, String email, int i, String sendMethod, java.util.Map map, String str, int i2) {
        java.util.Map map2 = map;
        String str2 = null;
        if ((i2 & 32) != 0) {
            map2 = null;
        }
        if ((i2 & 64) == 0) {
            str2 = str;
        }
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(email, "email");
        o.LJIIIZ(sendMethod, "sendMethod");
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R8T(i, fragment, accountCallback, null, email, str2, sendMethod, map2)));
    }

    public static /* synthetic */ C73626Sv0 LJJ(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, String str2, String str3, int i) {
        String str4 = str3;
        if ((i & 128) != 0) {
            str4 = null;
        }
        return LJIL(fragment, interfaceC69056R8i, str, enumC69116RAq, enumC69113RAn, "", str2, str4, null);
    }

    public static C73626Sv0 LIZJ(BaseAccountFlowFragment fragment, InterfaceC69056R8i accountCallback, String str, EnumC69116RAq scene, EnumC69113RAn step, String str2, String ticket, String mUnusableMobileTicket, java.util.Map map) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(mUnusableMobileTicket, "mUnusableMobileTicket");
        C1HQ c1hq = new C1HQ();
        c1hq.put("unusable_mobile_ticket", mUnusableMobileTicket);
        c1hq.put("phone_number_source", String.valueOf(C78966Uyw.LJJIIZI(fragment, accountCallback)));
        c1hq.putAll(map);
        int scene2 = EnumC69096R9w.ACTIVATION_CHANGE_MOBILE.getScene();
        ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
        clientSubmitSmsCodeEvent.LJI(accountCallback.q9().LJJLIIIJJI());
        clientSubmitSmsCodeEvent.LJII(accountCallback.q9().LJJLIIIJLLLLLLLZ());
        clientSubmitSmsCodeEvent.LJIIIZ(scene2);
        clientSubmitSmsCodeEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSubmitSmsCodeEvent.LJFF();
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R8Q(accountCallback, str, str2, ticket, c1hq, scene, step)).LJIIIZ(new AfS34S0201000_15(scene2, fragment, accountCallback, 3)).LJIIIIZZ(new AfS40S0101000_15(accountCallback, scene2, 0)));
    }

    public static C73626Sv0 LJIL(Fragment fragment, InterfaceC69056R8i accountCallback, String phoneNumber, EnumC69116RAq scene, EnumC69113RAn step, String ticket, String str, String str2, java.util.Map map) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        o.LJIIIZ(ticket, "ticket");
        try {
            C66516Q8q LJIIL = C66513Q8n.LIZJ().LJIIL(phoneNumber, null);
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y(String.valueOf(LJIIL.getNationalNumber()), String.valueOf(LJIIL.getCountryCode()));
        } catch (Exception unused) {
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y("", "");
        }
        int LJIIIZ = LJIIIZ(scene);
        int LJIIZILJ = LJIIZILJ(step, false);
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R8F(map, accountCallback, phoneNumber, LJIIZILJ, ticket, LJIIIZ, scene, step)).LJIIIIZZ(new AfS0S3301000_11(LJIIZILJ, fragment, step, accountCallback, str2, str, phoneNumber, 0)).LJIIIZ(new AfS0S3301000_11(LJIIZILJ, fragment, step, accountCallback, str2, str, phoneNumber, 1)));
    }

    public static C73626Sv0 LJIILL(Fragment fragment, InterfaceC69056R8i accountCallback, String str, EnumC69116RAq scene, EnumC69113RAn step, String str2, String str3, String str4, String str5, String str6, String str7, java.util.Map map, int i) {
        boolean z;
        String str8 = str3;
        String str9 = str2;
        String str10 = str5;
        String str11 = str6;
        String str12 = str7;
        java.util.Map map2 = map;
        if ((i & 32) != 0) {
            str9 = null;
        }
        if ((i & 64) != 0) {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str10 = null;
        }
        if ((i & 512) != 0) {
            str11 = null;
        }
        if ((i & 1024) != 0) {
            str12 = null;
        }
        if ((i & 2048) != 0) {
            map2 = null;
        }
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        try {
            C66516Q8q LJIIL = C66513Q8n.LIZJ().LJIIL(str, null);
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y(String.valueOf(LJIIL.getNationalNumber()), String.valueOf(LJIIL.getCountryCode()));
        } catch (Exception unused) {
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C69098R9y("", "");
        }
        int LJIIIZ = LJIIIZ(scene);
        if (map2 != null) {
            z = map2.containsKey("passport_ticket");
        } else {
            z = false;
        }
        int LJIIZILJ = LJIIZILJ(step, z);
        return C73636SvA.LIZ(fragment, accountCallback, AbstractC73635Sv9.LJ(new R8E(map2, accountCallback, str, LJIIZILJ, str9, LJIIIZ, str8, scene, step)).LJIIIZ(new C69097R9x(LJIIZILJ, accountCallback, str4, str, str10, str11, str12, step)).LJIIIIZZ(new C69095R9v(LJIIZILJ, accountCallback, str4, str, str10, str11, step)));
    }
}
