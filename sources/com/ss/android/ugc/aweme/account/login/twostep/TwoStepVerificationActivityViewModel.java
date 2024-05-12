package com.ss.android.ugc.aweme.account.login.twostep;

import X.A2F;
import X.A2G;
import X.C01R;
import X.C10K;
import X.C221108m2;
import X.C239289aG;
import X.C33Q;
import X.C45804HyK;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C69084R9k;
import X.C76800UCe;
import X.C78685UuP;
import X.C78857UxB;
import X.C85118Xas;
import X.C85119Xat;
import X.C85124Xay;
import X.C85125Xaz;
import X.C85128Xb2;
import X.C85129Xb3;
import X.C85130Xb4;
import X.C85131Xb5;
import X.C85136XbA;
import X.C85144XbI;
import X.C85155XbT;
import X.C85160XbY;
import X.C85165Xbd;
import X.C85166Xbe;
import X.C85167Xbf;
import X.C8HZ;
import X.EF7;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.EnumC85151XbP;
import X.GJ6;
import X.InterfaceC26157AOj;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.R41;
import X.V86;
import Y.AgS124S0100000_7;
import Y.AgS131S0100000_15;
import Y.AgS50S1100000_15;
import Y.IDeS359S0100000_15;
import Y.IDeS98S0200000_15;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.AqS33S0210000_15;
import kotlin.jvm.internal.AqS55S1200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepVerificationActivityViewModel extends AssemListViewModel<C85167Xbf, C85165Xbd, Integer> {
    public static final /* synthetic */ int LJLL = 0;
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C239289aG.class, "two_step_verification_management_hierarchy_data_key"), true);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 145));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 146));
    public final TwoStepVerificationService LJLJJI;
    public Map<EnumC85151XbP, C85136XbA> LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public boolean LJLJLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C85167Xbf(0);
    }

    public final String getEnterFrom() {
        return (String) this.LJLILLLLZI.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LJLJI.getValue();
    }

    public final void iv0() {
        boolean z;
        boolean z2;
        setStateImmediate(C85160XbY.LJLIL);
        this.LJLJJI.fetchDeviceName();
        TwoStepAuthApi.LIZ.getClass();
        TwoStepAuthApi.LIZIZ().getAuthDeviceList().LJ(new AgS124S0100000_7(this, 32), C10K.LJI, null);
        if (sv0()) {
            this.LJLJJI.getAvailableWays().LJ(new AgS131S0100000_15(this, 26), C10K.LJIIIIZZ, null);
            return;
        }
        User LIZJ = R41.LIZJ();
        Map<EnumC85151XbP, C85136XbA> map = this.LJLJJL;
        EnumC85151XbP enumC85151XbP = EnumC85151XbP.SMS;
        if (LIZJ.isPhoneBinded() && C78857UxB.LJJJIL(LIZJ.getBindPhone())) {
            z = true;
        } else {
            z = false;
        }
        map.put(enumC85151XbP, new C85136XbA(z, false, null, LIZJ.getBindPhone(), false, false, 54));
        Map<EnumC85151XbP, C85136XbA> map2 = this.LJLJJL;
        EnumC85151XbP enumC85151XbP2 = EnumC85151XbP.EMAIL;
        if (LIZJ.isHasEmail() && LIZJ.isEmailVerified() && C78857UxB.LJJJIL(LIZJ.getEmail())) {
            z2 = true;
        } else {
            z2 = false;
        }
        map2.put(enumC85151XbP2, new C85136XbA(z2, false, enumC85151XbP2, LIZJ.getEmail(), false, false, 50));
        Map<EnumC85151XbP, C85136XbA> map3 = this.LJLJJL;
        EnumC85151XbP enumC85151XbP3 = EnumC85151XbP.TOTP;
        map3.put(enumC85151XbP3, new C85136XbA(false, false, enumC85151XbP3, null, false, false, 59));
        Map<EnumC85151XbP, C85136XbA> map4 = this.LJLJJL;
        EnumC85151XbP enumC85151XbP4 = EnumC85151XbP.PASSWORD;
        map4.put(enumC85151XbP4, new C85136XbA(R41.LIZ().hasCurUserSetPassword(), false, enumC85151XbP4, null, false, false, 58));
        AddVerificationResponse twoStepVerificationResponseFromCache = this.LJLJJI.getTwoStepVerificationResponseFromCache();
        if (twoStepVerificationResponseFromCache != null) {
            Av0(twoStepVerificationResponseFromCache);
        } else {
            this.LJLJJI.getTwoStepStatus(!sv0()).LJ(new AgS131S0100000_15(this, 3), C10K.LJIIIIZZ, null);
        }
    }

    public final Bundle jv0() {
        Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("show_success_toast", false, "page", "twosv_setup");
        m.putBoolean("is_mandatory_two_sv", sv0());
        if (!this.LJLJLLL) {
            float f = this.LJLJLJ + 1.0f;
            this.LJLJLJ = f;
            float f2 = this.LJLJL;
            int i = 100;
            if (f <= f2) {
                i = (int) ((f / f2) * 100);
            }
            m.putInt("progress", i);
        }
        return m;
    }

    public final C239289aG lv0() {
        return (C239289aG) this.LJLIL.getValue();
    }

    public final Bundle mv0() {
        Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("is_idv", true, "page", "twosv_setup");
        m.putString("enter_method", "normal");
        return m;
    }

    public final List<C85165Xbd> nv0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.LJLJJL).entrySet().iterator();
        while (it.hasNext()) {
            C85136XbA c85136XbA = (C85136XbA) ((Map.Entry) it.next()).getValue();
            if (c85136XbA.LIZIZ || c85136XbA.LIZJ != EnumC85151XbP.TOTP || tv0()) {
                arrayList.add(new C85165Xbd(c85136XbA));
            }
        }
        return arrayList;
    }

    public final List<String> pv0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.LJLJJL).entrySet().iterator();
        while (it.hasNext()) {
            C85136XbA c85136XbA = (C85136XbA) ((Map.Entry) it.next()).getValue();
            if (c85136XbA.LJ) {
                arrayList.add(this.LJLJJI.getVerifyTypeFromMethod(c85136XbA.LIZJ));
            }
        }
        return arrayList;
    }

    public final boolean rv0() {
        AuthDeviceResponse.Data data;
        List<Device> auth_device;
        AuthDeviceResponse previousAuthDeviceListStatus = this.LJLJJI.getPreviousAuthDeviceListStatus();
        if (previousAuthDeviceListStatus != null && (data = previousAuthDeviceListStatus.getData()) != null && (auth_device = data.getAuth_device()) != null) {
            Iterator<Device> it = auth_device.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Device next = it.next();
                if (o.LJ(String.valueOf(next.getDevice_id()), DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean tv0() {
        return ((Boolean) this.LJLJJLL.getValue()).booleanValue();
    }

    public final void wv0() {
        C85136XbA c85136XbA;
        C85136XbA c85136XbA2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 2;
        for (Map.Entry entry : ((LinkedHashMap) this.LJLJJL).entrySet()) {
            Object key = entry.getKey();
            C85136XbA c85136XbA3 = (C85136XbA) entry.getValue();
            linkedHashMap.put(key, c85136XbA3);
            if (c85136XbA3.LIZ && c85136XbA3.LIZJ != EnumC85151XbP.TOTP) {
                linkedHashMap.put(key, C85136XbA.LIZ(c85136XbA3, false, false, null, true, false, 13));
                i--;
            } else {
                linkedHashMap.put(key, C85136XbA.LIZ(c85136XbA3, false, false, null, false, false, 13));
            }
        }
        this.LJLJJL = linkedHashMap;
        while (i > 0) {
            Map<EnumC85151XbP, C85136XbA> map = this.LJLJJL;
            EnumC85151XbP enumC85151XbP = EnumC85151XbP.SMS;
            C85136XbA c85136XbA4 = (C85136XbA) ((LinkedHashMap) map).get(enumC85151XbP);
            if (c85136XbA4 != null && !c85136XbA4.LJ) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.LJLJJL;
                C85136XbA c85136XbA5 = (C85136XbA) linkedHashMap2.get(enumC85151XbP);
                if (c85136XbA5 != null) {
                    c85136XbA2 = C85136XbA.LIZ(c85136XbA5, false, false, null, true, false, 47);
                } else {
                    c85136XbA2 = new C85136XbA(false, false, null, null, true, false, 47);
                }
                linkedHashMap2.put(enumC85151XbP, c85136XbA2);
            } else {
                Map<EnumC85151XbP, C85136XbA> map2 = this.LJLJJL;
                EnumC85151XbP enumC85151XbP2 = EnumC85151XbP.EMAIL;
                C85136XbA c85136XbA6 = (C85136XbA) ((LinkedHashMap) map2).get(enumC85151XbP2);
                if (c85136XbA6 != null && !c85136XbA6.LJ) {
                    LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.LJLJJL;
                    C85136XbA c85136XbA7 = (C85136XbA) linkedHashMap3.get(enumC85151XbP2);
                    if (c85136XbA7 != null) {
                        c85136XbA = C85136XbA.LIZ(c85136XbA7, false, false, null, true, false, 47);
                    } else {
                        c85136XbA = new C85136XbA(false, false, enumC85151XbP2, null, true, false, 43);
                    }
                    linkedHashMap3.put(enumC85151XbP2, c85136XbA);
                }
            }
            i--;
        }
    }

    public final void yv0() {
        setStateImmediate(C85155XbT.LJLIL);
    }

    public TwoStepVerificationActivityViewModel() {
        InterfaceC26157AOj LJIIL = R41.LIZIZ.LJIIL();
        o.LJII(LJIIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.TwoStepVerificationService");
        this.LJLJJI = (TwoStepVerificationService) LJIIL;
        this.LJLJJL = new LinkedHashMap();
        this.LJLJJLL = C221108m2.LIZIZ(GJ6.LJLIL);
    }

    public final boolean sv0() {
        return C78685UuP.LJJJZ(lv0().LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean uv0() {
        String str;
        AddVerificationResponse.Data data;
        AddVerificationResponse.Data data2;
        C85167Xbf c85167Xbf = (C85167Xbf) getState();
        AddVerificationResponse LIZ = c85167Xbf.LJLJI.LIZ();
        String str2 = null;
        if (LIZ != null && (data2 = LIZ.getData()) != null) {
            str = data2.getDefault_verify_way();
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            return true;
        }
        AddVerificationResponse LIZ2 = c85167Xbf.LJLILLLLZI.LIZ();
        if (LIZ2 != null && (data = LIZ2.getData()) != null) {
            str2 = data.getDefault_verify_way();
        }
        if (C78685UuP.LJJJZ(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Av0(com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse r9) {
        /*
            r8 = this;
            r2 = r9
            if (r2 == 0) goto L1a
            com.ss.android.ugc.aweme.services.TwoStepVerificationService r0 = r8.LJLJJI
            r0.setTwoStepVerificationResponseToCache(r2)
            com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse$Data r0 = r2.getData()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.getDefault_verify_way()
            if (r0 == 0) goto L1a
            int r0 = r0.length()
            if (r0 != 0) goto L79
        L1a:
            r8.wv0()
        L1d:
            if (r2 == 0) goto L66
            java.lang.String r3 = r8.getEnterFrom()
            java.util.Map<X.XbP, X.XbA> r1 = r8.LJLJJL
            X.XbP r0 = X.EnumC85151XbP.PASSWORD
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            X.XbA r0 = (X.C85136XbA) r0
            if (r0 == 0) goto L77
            boolean r4 = r0.LJ
        L33:
            java.util.Map<X.XbP, X.XbA> r1 = r8.LJLJJL
            X.XbP r0 = X.EnumC85151XbP.SMS
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            X.XbA r0 = (X.C85136XbA) r0
            if (r0 == 0) goto L75
            boolean r5 = r0.LJ
        L43:
            java.util.Map<X.XbP, X.XbA> r1 = r8.LJLJJL
            X.XbP r0 = X.EnumC85151XbP.EMAIL
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            X.XbA r0 = (X.C85136XbA) r0
            if (r0 == 0) goto L73
            boolean r6 = r0.LJ
        L53:
            java.util.Map<X.XbP, X.XbA> r1 = r8.LJLJJL
            X.XbP r0 = X.EnumC85151XbP.TOTP
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            X.XbA r0 = (X.C85136XbA) r0
            if (r0 == 0) goto L71
            boolean r7 = r0.LJ
        L63:
            X.C85144XbI.LJIILJJIL(r2, r3, r4, r5, r6, r7)
        L66:
            kotlin.jvm.internal.AqS146S0200000_15 r1 = new kotlin.jvm.internal.AqS146S0200000_15
            r0 = 17
            r1.<init>(r8, r2, r0)
            r8.withState(r1)
            return
        L71:
            r7 = 0
            goto L63
        L73:
            r6 = 0
            goto L53
        L75:
            r5 = 0
            goto L43
        L77:
            r4 = 0
            goto L33
        L79:
            r8.Gv0(r2)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel.Av0(com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse):void");
    }

    public final void Fv0(EnumC85151XbP methodType) {
        o.LJIIIZ(methodType, "methodType");
        User LIZJ = R41.LIZJ();
        int i = C85125Xaz.LIZ[methodType.ordinal()];
        Activity activity = null;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    PasswordService LJFF = R41.LJFF();
                    Context context = lv0().LJLJI;
                    if (context != null) {
                        activity = C45804HyK.LJIJJ(context);
                    }
                    LJFF.changePassword(activity, getEnterFrom(), getEnterMethod(), C01R.LIZ("show_success_toast", false), new IDeS359S0100000_15(this, 0));
                    return;
                }
                C85144XbI.LJIL(getEnterFrom());
                AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this, BuildConfig.VERSION_CODE);
                AqS181S0100000_15 aqS181S0100000_152 = new AqS181S0100000_15(this, 293);
                AqS197S0100000_15 aqS197S0100000_15 = new AqS197S0100000_15(this, 68);
                Context context2 = lv0().LJLJI;
                if (context2 == null) {
                    return;
                }
                yv0();
                TwoStepAuthApi.LIZ.getClass();
                TwoStepAuthApi.LIZ(context2, aqS181S0100000_15, aqS181S0100000_152, aqS197S0100000_15);
                return;
            }
            BindService LIZIZ = R41.LIZIZ();
            Context context3 = lv0().LJLJI;
            if (context3 != null) {
                activity = C45804HyK.LJIJJ(context3);
            }
            LIZIZ.changeEmail(activity, "", HiddenActivity$$ExternalSyntheticOutline0.m("show_success_toast", false, "page", "twosv_setup"), new C85128Xb2(this, methodType, LIZJ));
            return;
        }
        BindService LIZIZ2 = R41.LIZIZ();
        Context context4 = lv0().LJLJI;
        if (context4 != null) {
            activity = C45804HyK.LJIJJ(context4);
        }
        LIZIZ2.modifyMobile(activity, "", HiddenActivity$$ExternalSyntheticOutline0.m("show_success_toast", false, "page", "twosv_setup"), new C85129Xb3(this, methodType, LIZJ));
    }

    public final void Gv0(AddVerificationResponse addVerificationResponse) {
        AddVerificationResponse.Data data;
        List<VerifyWay> two_step_verify_ways;
        C85136XbA c85136XbA;
        C85136XbA c85136XbA2;
        C85136XbA c85136XbA3;
        C85136XbA c85136XbA4;
        if (addVerificationResponse != null && (data = addVerificationResponse.getData()) != null && (two_step_verify_ways = data.getTwo_step_verify_ways()) != null) {
            for (VerifyWay verifyWay : two_step_verify_ways) {
                boolean LJ = o.LJ(verifyWay.is_available(), Boolean.TRUE);
                String verify_way = verifyWay.getVerify_way();
                if (verify_way != null) {
                    switch (verify_way.hashCode()) {
                        case -797498437:
                            if (verify_way.equals("pwd_verify")) {
                                Map<EnumC85151XbP, C85136XbA> map = this.LJLJJL;
                                EnumC85151XbP enumC85151XbP = EnumC85151XbP.PASSWORD;
                                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                                C85136XbA c85136XbA5 = (C85136XbA) linkedHashMap.get(enumC85151XbP);
                                if (c85136XbA5 != null) {
                                    c85136XbA4 = C85136XbA.LIZ(c85136XbA5, false, LJ, null, false, true, 29);
                                } else {
                                    c85136XbA4 = new C85136XbA(false, LJ, enumC85151XbP, null, false, true, 25);
                                }
                                linkedHashMap.put(enumC85151XbP, c85136XbA4);
                                break;
                            } else {
                                break;
                            }
                        case 300626556:
                            if (verify_way.equals("email_verify")) {
                                Map<EnumC85151XbP, C85136XbA> map2 = this.LJLJJL;
                                EnumC85151XbP enumC85151XbP2 = EnumC85151XbP.EMAIL;
                                LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                                C85136XbA c85136XbA6 = (C85136XbA) linkedHashMap2.get(enumC85151XbP2);
                                if (c85136XbA6 != null) {
                                    c85136XbA3 = C85136XbA.LIZ(c85136XbA6, false, LJ, null, false, true, 29);
                                } else {
                                    c85136XbA3 = new C85136XbA(false, LJ, enumC85151XbP2, null, false, true, 25);
                                }
                                linkedHashMap2.put(enumC85151XbP2, c85136XbA3);
                                break;
                            } else {
                                break;
                            }
                        case 312290780:
                            if (verify_way.equals("mobile_sms_verify")) {
                                Map<EnumC85151XbP, C85136XbA> map3 = this.LJLJJL;
                                EnumC85151XbP enumC85151XbP3 = EnumC85151XbP.SMS;
                                LinkedHashMap linkedHashMap3 = (LinkedHashMap) map3;
                                C85136XbA c85136XbA7 = (C85136XbA) linkedHashMap3.get(enumC85151XbP3);
                                if (c85136XbA7 != null) {
                                    c85136XbA2 = C85136XbA.LIZ(c85136XbA7, false, LJ, null, false, true, 29);
                                } else {
                                    c85136XbA2 = new C85136XbA(false, LJ, null, null, false, true, 29);
                                }
                                linkedHashMap3.put(enumC85151XbP3, c85136XbA2);
                                break;
                            } else {
                                break;
                            }
                        case 1972338561:
                            if (verify_way.equals("totp_verify")) {
                                Map<EnumC85151XbP, C85136XbA> map4 = this.LJLJJL;
                                EnumC85151XbP enumC85151XbP4 = EnumC85151XbP.TOTP;
                                LinkedHashMap linkedHashMap4 = (LinkedHashMap) map4;
                                C85136XbA c85136XbA8 = (C85136XbA) linkedHashMap4.get(enumC85151XbP4);
                                if (c85136XbA8 != null) {
                                    c85136XbA = C85136XbA.LIZ(c85136XbA8, false, LJ, null, false, true, 29);
                                } else {
                                    c85136XbA = new C85136XbA(false, LJ, enumC85151XbP4, null, false, true, 25);
                                }
                                linkedHashMap4.put(enumC85151XbP4, c85136XbA);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C85165Xbd> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS181S0100000_15((C8HZ) newListState, (C8HZ<C85166Xbe>) 39));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        A2F a2f = A2G.LIZ;
        C85167Xbf c85167Xbf = (C85167Xbf) getState();
        c85167Xbf.getClass();
        List list = c85167Xbf.getListState().LJLJJI;
        if (list == null) {
            list = new ArrayList();
        }
        a2f.getClass();
        return A2F.LIZ(list);
    }

    public final void qv0(List<String> list) {
        String email;
        User LIZJ = R41.LIZJ();
        this.LJLJL = 1.0f;
        this.LJLJLJ = 0.0f;
        C85136XbA c85136XbA = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(EnumC85151XbP.SMS);
        if (c85136XbA == null || !c85136XbA.LIZ) {
            this.LJLJL += 1.0f;
        }
        C85136XbA c85136XbA2 = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(EnumC85151XbP.EMAIL);
        if ((c85136XbA2 == null || !c85136XbA2.LIZ) && (list.contains("email_verify") || !LIZJ.isHasEmail() || (email = LIZJ.getEmail()) == null || email.length() == 0 || sv0())) {
            this.LJLJL += 1.0f;
        }
        if (list.contains("pwd_verify")) {
            C85136XbA c85136XbA3 = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(EnumC85151XbP.PASSWORD);
            if (c85136XbA3 == null || !c85136XbA3.LIZ) {
                this.LJLJL += 1.0f;
            }
        }
        if (tv0() && list.contains("totp_verify")) {
            C85136XbA c85136XbA4 = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(EnumC85151XbP.TOTP);
            if (c85136XbA4 != null && c85136XbA4.LIZ) {
                return;
            }
            this.LJLJL += 1.0f;
        }
    }

    public final void zv0(AddVerificationResponse addVerificationResponse) {
        String default_verify_way;
        this.LJLJJI.setTwoStepVerificationResponseToCache(addVerificationResponse);
        AddVerificationResponse.Data data = addVerificationResponse.getData();
        if (data == null || (default_verify_way = data.getDefault_verify_way()) == null || default_verify_way.length() == 0) {
            wv0();
        } else {
            Gv0(addVerificationResponse);
        }
        withState(new AqS146S0200000_15(this, addVerificationResponse, 16));
    }

    public final void Cv0(String verify_ticket, String str) {
        yv0();
        TwoStepAuthApi.LIZ.getClass();
        o.LJIIIZ(verify_ticket, "verify_ticket");
        TwoStepAuthApi.LIZIZ().removeAllVerification(verify_ticket).LJ(new AgS50S1100000_15(this, str, 0), C10K.LJIIIIZZ, null);
    }

    public final void Ev0(EnumC85151XbP enumC85151XbP, boolean z) {
        List<String> pv0;
        if (o.LJ("mandatory_popup", getEnterFrom()) || o.LJ("nudge_popup", getEnterFrom())) {
            C85144XbI.LJJIJIL("turn_on");
        }
        Map<EnumC85151XbP, C85136XbA> map = this.LJLJJL;
        EnumC85151XbP enumC85151XbP2 = EnumC85151XbP.TOTP;
        C85136XbA c85136XbA = (C85136XbA) ((LinkedHashMap) map).get(enumC85151XbP2);
        if (c85136XbA != null && c85136XbA.LJ) {
            this.LJLJJL.put(enumC85151XbP2, C85136XbA.LIZ(c85136XbA, false, false, null, false, false, 62));
        }
        if (enumC85151XbP != null && ((LinkedHashMap) this.LJLJJL).get(enumC85151XbP) != null) {
            C85136XbA c85136XbA2 = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(enumC85151XbP);
            if (c85136XbA2 != null) {
                pv0 = C47261Igj.LJJIJIL(this.LJLJJI.getVerifyTypeFromMethod(c85136XbA2.LIZJ));
            } else {
                pv0 = pv0();
            }
        } else {
            pv0 = pv0();
        }
        this.LJLJLLL = z;
        ov0(pv0, false);
    }

    public final void Hv0(String str, InterfaceC88472Yns interfaceC88472Yns) {
        boolean z;
        boolean z2;
        String str2;
        String str3;
        User LIZJ = R41.LIZJ();
        C85136XbA c85136XbA = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(EnumC85151XbP.PASSWORD);
        if (c85136XbA != null && c85136XbA.LIZ) {
            z = true;
        } else {
            z = false;
        }
        Activity activity = null;
        if (z) {
            PasswordService LJFF = R41.LJFF();
            Context context = lv0().LJLJI;
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            }
            String enterFrom = getEnterFrom();
            Bundle mv0 = mv0();
            if (sv0()) {
                mv0.putInt("current_scene", EnumC69116RAq.VERIFY_ACCOUNT_FROM_2SV.getValue());
            }
            LJFF.verifyPassword(activity, enterFrom, mv0, new IDeS98S0200000_15(this, interfaceC88472Yns, 14));
            return;
        }
        Map<EnumC85151XbP, C85136XbA> map = this.LJLJJL;
        EnumC85151XbP enumC85151XbP = EnumC85151XbP.SMS;
        C85136XbA c85136XbA2 = (C85136XbA) ((LinkedHashMap) map).get(enumC85151XbP);
        if (c85136XbA2 != null && c85136XbA2.LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str4 = "";
        if (z2) {
            if (sv0()) {
                BindService LIZIZ = R41.LIZIZ();
                Context context2 = lv0().LJLJI;
                if (context2 != null) {
                    activity = C45804HyK.LJIJJ(context2);
                }
                String enterFrom2 = getEnterFrom();
                String enterMethod = getEnterMethod();
                C85136XbA c85136XbA3 = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(enumC85151XbP);
                if (c85136XbA3 != null && (str3 = c85136XbA3.LIZLLL) != null) {
                    str4 = str3;
                }
                LIZIZ.verifyMobileWithWorkflowTokenForTicket(activity, enterFrom2, enterMethod, str4, mv0(), new IDeS98S0200000_15(this, interfaceC88472Yns, 15));
                return;
            }
            BindService LIZIZ2 = R41.LIZIZ();
            Context context3 = lv0().LJLJI;
            if (context3 != null) {
                activity = C45804HyK.LJIJJ(context3);
            }
            LIZIZ2.verifyMobileForTicket(activity, getEnterFrom(), getEnterMethod(), mv0(), new IDeS98S0200000_15(this, interfaceC88472Yns, 16));
            return;
        }
        if (!LIZJ.isHasEmail()) {
            C85136XbA c85136XbA4 = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(EnumC85151XbP.EMAIL);
            if (c85136XbA4 == null || !c85136XbA4.LIZ) {
                interfaceC88472Yns.invoke(new C85119Xat(str, "oauth_verify"));
                return;
            }
        }
        if (sv0()) {
            BindService LIZIZ3 = R41.LIZIZ();
            Context context4 = lv0().LJLJI;
            if (context4 != null) {
                activity = C45804HyK.LJIJJ(context4);
            }
            String enterFrom3 = getEnterFrom();
            String enterMethod2 = getEnterMethod();
            C85136XbA c85136XbA5 = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(EnumC85151XbP.EMAIL);
            if (c85136XbA5 != null && (str2 = c85136XbA5.LIZLLL) != null) {
                str4 = str2;
            }
            LIZIZ3.verifyEmailWithWorkflowTokenForTicket(activity, enterFrom3, enterMethod2, str4, mv0(), new IDeS98S0200000_15(this, interfaceC88472Yns, 17));
            return;
        }
        BindService LIZIZ4 = R41.LIZIZ();
        Context context5 = lv0().LJLJI;
        if (context5 != null) {
            activity = C45804HyK.LJIJJ(context5);
        }
        LIZIZ4.verifyEmailForTicket(activity, getEnterFrom(), getEnterMethod(), mv0(), new IDeS98S0200000_15(this, interfaceC88472Yns, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        num.intValue();
        A2F a2f = A2G.LIZ;
        C85167Xbf c85167Xbf = (C85167Xbf) getState();
        c85167Xbf.getClass();
        List list = c85167Xbf.getListState().LJLJJI;
        if (list == null) {
            list = new ArrayList();
        }
        a2f.getClass();
        return A2F.LIZ(list);
    }

    public final void ov0(List list, boolean z) {
        AqS33S0210000_15 aqS33S0210000_15 = new AqS33S0210000_15(this, (TwoStepVerificationActivityViewModel) list, (List<String>) z, true);
        AqS33S0210000_15 aqS33S0210000_152 = new AqS33S0210000_15(this, (TwoStepVerificationActivityViewModel) list, (List<String>) z, true);
        AqS197S0100000_15 aqS197S0100000_15 = new AqS197S0100000_15(this, 69);
        Context context = lv0().LJLJI;
        if (context != null) {
            yv0();
            TwoStepAuthApi.LIZ.getClass();
            TwoStepAuthApi.LIZ(context, aqS33S0210000_15, aqS33S0210000_152, aqS197S0100000_15);
        }
    }

    public static C69084R9k kv0(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, Integer num, String str) {
        int i;
        String str2 = str;
        twoStepVerificationActivityViewModel.getClass();
        if (num != null) {
            i = num.intValue();
        } else {
            i = -2;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C69084R9k(i, str2, EnumC69116RAq.NONE, EnumC69113RAn.NONE, null, "");
    }

    public final void vv0(EnumC85151XbP enumC85151XbP, String verify_ticket, String str) {
        yv0();
        String verify_way = this.LJLJJI.getVerifyTypeFromMethod(enumC85151XbP);
        TwoStepAuthApi.LIZ.getClass();
        o.LJIIIZ(verify_ticket, "verify_ticket");
        o.LJIIIZ(verify_way, "verify_way");
        TwoStepAuthApi.LIZIZ().removeVerification(verify_ticket, verify_way).LJ(new C85118Xas(this, verify_way, str, enumC85151XbP), C10K.LJIIIIZZ, null);
    }

    public static void hv0(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, Integer num, String str, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        twoStepVerificationActivityViewModel.getClass();
        twoStepVerificationActivityViewModel.withState(new AqS55S1200000_15(twoStepVerificationActivityViewModel, num, str, 5));
    }

    public static void xv0(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, Integer num, String str, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        twoStepVerificationActivityViewModel.getClass();
        twoStepVerificationActivityViewModel.setState(new AqS55S1200000_15(twoStepVerificationActivityViewModel, num, str, 3));
    }

    public final void Bv0(String ticket, boolean z, String enterMethod, InterfaceC88472Yns<? super String, C76800UCe> callBack) {
        C10K<BindOrUpdateTOTPResponse> registerTotp;
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(callBack, "callBack");
        if (z) {
            TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.LIZ;
            int i = EF7.LJIIIZ;
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
            long parseLong = CastLongProtector.parseLong(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
            twoStepAuthApi.getClass();
            registerTotp = TwoStepAuthApi.LJFF(i, parseLong, ticket);
        } else {
            TwoStepAuthApi twoStepAuthApi2 = TwoStepAuthApi.LIZ;
            int i2 = EF7.LJIIIZ;
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2 = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2, "getDeviceId()");
            long parseLong2 = CastLongProtector.parseLong(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2);
            twoStepAuthApi2.getClass();
            registerTotp = TwoStepAuthApi.LIZIZ().registerTotp(i2, parseLong2, ticket, TwoStepAuthApi.LIZJ("/passport/totp/register/v2/"));
        }
        registerTotp.LJ(new C85131Xb5(this, enterMethod, ticket, callBack, z), C10K.LJIIIIZZ, null);
    }

    public final void gv0(List list, String str, String str2, int i, boolean z) {
        Activity activity;
        String email;
        if (list.contains("mobile_sms_verify")) {
            Map<EnumC85151XbP, C85136XbA> map = this.LJLJJL;
            EnumC85151XbP enumC85151XbP = EnumC85151XbP.SMS;
            C85136XbA c85136XbA = (C85136XbA) ((LinkedHashMap) map).get(enumC85151XbP);
            if (c85136XbA == null || !c85136XbA.LIZ) {
                Dv0(z, str, enumC85151XbP, str2, list, i);
                return;
            }
        }
        if (list.contains("email_verify")) {
            Map<EnumC85151XbP, C85136XbA> map2 = this.LJLJJL;
            EnumC85151XbP enumC85151XbP2 = EnumC85151XbP.EMAIL;
            C85136XbA c85136XbA2 = (C85136XbA) ((LinkedHashMap) map2).get(enumC85151XbP2);
            if (c85136XbA2 == null || !c85136XbA2.LIZ) {
                Dv0(z, str, enumC85151XbP2, str2, list, i);
                return;
            }
        }
        if (list.contains("pwd_verify")) {
            Map<EnumC85151XbP, C85136XbA> map3 = this.LJLJJL;
            EnumC85151XbP enumC85151XbP3 = EnumC85151XbP.PASSWORD;
            C85136XbA c85136XbA3 = (C85136XbA) ((LinkedHashMap) map3).get(enumC85151XbP3);
            if (c85136XbA3 == null || !c85136XbA3.LIZ) {
                Dv0(z, str, enumC85151XbP3, str2, list, i);
                return;
            }
        }
        if (tv0() && list.contains("totp_verify")) {
            Map<EnumC85151XbP, C85136XbA> map4 = this.LJLJJL;
            EnumC85151XbP enumC85151XbP4 = EnumC85151XbP.TOTP;
            C85136XbA c85136XbA4 = (C85136XbA) ((LinkedHashMap) map4).get(enumC85151XbP4);
            if (c85136XbA4 == null || !c85136XbA4.LIZ) {
                Dv0(z, str, enumC85151XbP4, str2, list, i);
                return;
            }
        }
        C85130Xb4 c85130Xb4 = new C85130Xb4(this);
        User LIZJ = R41.LIZJ();
        C85136XbA c85136XbA5 = (C85136XbA) ((LinkedHashMap) this.LJLJJL).get(EnumC85151XbP.EMAIL);
        if ((c85136XbA5 != null && c85136XbA5.LIZ) || (LIZJ.isHasEmail() && (email = LIZJ.getEmail()) != null && email.length() != 0 && !sv0())) {
            c85130Xb4.invoke(Boolean.valueOf(z), str, str2, list, Integer.valueOf(i));
            return;
        }
        BindService LIZIZ = R41.LIZIZ();
        Context context = lv0().LJLJI;
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        Bundle jv0 = jv0();
        jv0.putBoolean("show_success_toast", false);
        jv0.putBoolean("show_skip", true);
        jv0.putInt("email_source", V86.DYABindEmailSourceTypeTwoStepVerification.getValue());
        LIZIZ.bindEmail(activity, enterFrom, enterMethod, jv0, new C85124Xay(i, this, str, str2, list, c85130Xb4, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dv0(boolean r23, java.lang.String r24, X.EnumC85151XbP r25, java.lang.String r26, java.util.List<java.lang.String> r27, int r28) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel.Dv0(boolean, java.lang.String, X.XbP, java.lang.String, java.util.List, int):void");
    }
}
