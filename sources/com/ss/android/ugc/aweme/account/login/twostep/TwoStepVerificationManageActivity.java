package com.ss.android.ugc.aweme.account.login.twostep;

import X.ActivityC86117Xqz;
import X.C01R;
import X.C0H1;
import X.C0JT;
import X.C10K;
import X.C16880lQ;
import X.C188727au;
import X.C1B3;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C5S1;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73306Spq;
import X.C78840Uwu;
import X.C79045V0n;
import X.C85114Xao;
import X.C85115Xap;
import X.C85117Xar;
import X.C85126Xb0;
import X.C85132Xb6;
import X.C85135Xb9;
import X.C85137XbB;
import X.C85138XbC;
import X.C85139XbD;
import X.C85140XbE;
import X.C85144XbI;
import X.C85152XbQ;
import X.C85153XbR;
import X.C85154XbS;
import X.C85158XbW;
import X.C85159XbX;
import X.C85183Xbv;
import X.DialogC61824OOe;
import X.EF7;
import X.EnumC78973Uz3;
import X.EnumC85151XbP;
import X.FMX;
import X.GJ0;
import X.GJ2;
import X.InterfaceC26157AOj;
import X.InterfaceC88472Yns;
import X.QQN;
import X.R41;
import X.R9U;
import X.V1B;
import X.V86;
import X.WM7;
import Y.ACListenerS35S0100000_15;
import Y.AgS0S2211000_15;
import Y.AgS11S2100000_15;
import Y.AgS124S0100000_7;
import Y.AgS131S0100000_15;
import Y.AgS41S0110000_15;
import Y.IDeS98S0200000_15;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS1S2211000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepVerificationManageActivity extends ActivityC86117Xqz {
    public final TwoStepVerificationService LJLJJLL;
    public AddVerificationResponse LJLJL;
    public boolean LJLJLJ;
    public AuthDeviceResponse LJLJLLL;
    public TwoSvUserData LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 49));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 45));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 46));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 47));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 48));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public TwoStepVerificationManageActivity() {
        InterfaceC26157AOj LJIIL = R41.LIZIZ.LJIIL();
        o.LJII(LJIIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.TwoStepVerificationService");
        this.LJLJJLL = (TwoStepVerificationService) LJIIL;
    }

    public final Bundle LLII() {
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", getEnterFrom());
        bundle.putString("enter_method", getEnterMethod());
        bundle.putString("page", "twosv_setup");
        bundle.putBoolean("is_mandatory_two_sv", LLIL());
        bundle.putBoolean("show_skip", false);
        return bundle;
    }

    public final Bundle LLIIIILZ() {
        Bundle LIZ = C01R.LIZ("is_idv", true);
        LIZ.putString("enter_method", getEnterMethod());
        LIZ.putString("page", "twosv_setup");
        return LIZ;
    }

    public final DialogC61824OOe LLIIIJ() {
        return (DialogC61824OOe) this.LJLIL.getValue();
    }

    public final boolean LLIILII() {
        AuthDeviceResponse.Data data;
        List<Device> auth_device;
        AuthDeviceResponse authDeviceResponse = this.LJLJLLL;
        if (authDeviceResponse != null && (data = authDeviceResponse.getData()) != null && (auth_device = data.getAuth_device()) != null) {
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

    public final boolean LLIL() {
        return ((Boolean) this.LJLJJL.getValue()).booleanValue();
    }

    public final String getEnterFrom() {
        return (String) this.LJLILLLLZI.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LJLJI.getValue();
    }

    public final void LLIIJLIL() {
        V1B.LJLJI(LLIIIJ());
        this.LJLJLJ = false;
    }

    public final void LLILLL() {
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.keh);
        C73306Spq c73306Spq = new C73306Spq();
        String string = getString(R.string.hve);
        o.LJIIIIZZ(string, "getString(R.string.load_status_click_retry)");
        c73306Spq.LJI = string;
        c73305Spp.setStatus(c73306Spq);
        C16880lQ.LJIIJJI(new ACListenerS35S0100000_15(this, 40), (C73305Spp) _$_findCachedViewById(R.id.keh));
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (o.LJ("mandatory_popup", getEnterFrom()) || o.LJ("nudge_popup", getEnterFrom())) {
            C85144XbI.LJJIJIL("back");
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        V1B.LJLILLLLZI(LLIIIJ());
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final void LLILIL(AddVerificationResponse addVerificationResponse) {
        String str;
        String str2 = null;
        if (LLIL()) {
            this.LJLJL = addVerificationResponse;
            if (this.LJLL == null) {
                return;
            }
            AddVerificationResponse.Data data = addVerificationResponse.getData();
            if (data != null) {
                str = data.getDefault_verify_way();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                finish();
            }
        }
        this.LJLJJLL.setTwoStepVerificationResponseToCache(addVerificationResponse);
        LLIIJLIL();
        Fragment LJJJI = getSupportFragmentManager().LJJJI(R.id.dm7);
        AddVerificationResponse.Data data2 = addVerificationResponse.getData();
        if (data2 != null) {
            str2 = data2.getDefault_verify_way();
        }
        if (TextUtils.isEmpty(str2)) {
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "this.enterFrom");
            if (LJJJI instanceof TwoStepVerificationDetailFragment) {
                C5S1 c5s1 = new C5S1(this);
                c5s1.LIZLLL(getString(R.string.rn_));
                c5s1.LJ();
                enterFrom = "turn_off_refresh";
            }
            if (!(LJJJI instanceof TurnOnTwoStepVerificationFragment)) {
                C188727au LJFF = C85144XbI.LJFF();
                LJFF.LJIIIZ("enter_from", enterFrom);
                FMX.LJIIL("two_step_verification_turn_on_notify", LJFF.LIZ);
                Fragment LJJJIL = getSupportFragmentManager().LJJJIL("TurnOnTwoStepVerificationFragment");
                if (LJJJIL == null) {
                    LJJJIL = new TurnOnTwoStepVerificationFragment();
                }
                Bundle LIZ = C0H1.LIZ("enter_from", enterFrom);
                LIZ.putSerializable("two_sv_user_data", this.LJLL);
                LJJJIL.setArguments(LIZ);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIJ(LJJJIL, "TurnOnTwoStepVerificationFragment", R.id.dm7);
                c1b3.LJI();
                return;
            }
            return;
        }
        String enterFrom2 = getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "this.enterFrom");
        String str3 = "refresh";
        if (LJJJI instanceof TwoStepVerificationDetailFragment) {
            ((TwoStepVerificationDetailFragment) LJJJI).Al(addVerificationResponse);
        } else {
            if (LJJJI instanceof TurnOnTwoStepVerificationFragment) {
                C5S1 c5s12 = new C5S1(this);
                c5s12.LIZLLL(getString(R.string.rna));
                c5s12.LJ();
                enterFrom2 = "refresh";
            }
            Fragment LJJJIL2 = getSupportFragmentManager().LJJJIL("TwoStepVerificationDetailFragment");
            if (LJJJIL2 == null) {
                LJJJIL2 = new TwoStepVerificationDetailFragment();
            }
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            o.LJI(supportFragmentManager2);
            C1B3 c1b32 = new C1B3(supportFragmentManager2);
            Bundle bundle = new Bundle();
            bundle.putSerializable("response", addVerificationResponse);
            LJJJIL2.setArguments(bundle);
            Bundle arguments = LJJJIL2.getArguments();
            o.LJI(arguments);
            arguments.putString("enter_from", enterFrom2);
            c1b32.LJIIJ(LJJJIL2, "TwoStepVerificationDetailFragment", R.id.dm7);
            c1b32.LJI();
            str3 = enterFrom2;
        }
        C188727au LJFF2 = C85144XbI.LJFF();
        LJFF2.LJIIIZ("enter_from", str3);
        FMX.LJIIL("two_step_verification_manage_notify", LJFF2.LIZ);
    }

    public final void LLILLIZIL(boolean z) {
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).LJFF();
        C16880lQ.LJIIJJI(null, (C73305Spp) _$_findCachedViewById(R.id.keh));
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
        this.LJLJJLL.getTwoStepStatus(z).LJ(new AgS41S0110000_15(this, z, 2), C10K.LJIIIIZZ, null);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onCreate", true);
        activityConfiguration(GJ2.LJLIL);
        super.onCreate(bundle);
        setTheme(R.style.kp);
        setContentView(R.layout.o9);
        C85115Xap.LIZLLL = false;
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.qfj);
        o.LJIIIIZZ(string, "getString(R.string.security_step_verification)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS165S0100000_15(this, 148));
        c252709vu.setNavActions(c235119Kp);
        TwoStepAuthApi.LIZ.getClass();
        TwoStepAuthApi.LIZIZ().getAuthDeviceList().LJ(new AgS124S0100000_7(this, 31), C10K.LJI, null);
        if (LLIL()) {
            if (!TextUtils.isEmpty((String) this.LJLJJI.getValue())) {
                this.LJLJJLL.getAvailableWays().LJ(new AgS131S0100000_15(this, 20), C10K.LJIIIIZZ, null);
            }
            LLILLIZIL(false);
        } else {
            AddVerificationResponse twoStepVerificationResponseFromCache = this.LJLJJLL.getTwoStepVerificationResponseFromCache();
            if (twoStepVerificationResponseFromCache != null) {
                ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(8);
                _$_findCachedViewById(R.id.dm7).setVisibility(0);
                LLILIL(twoStepVerificationResponseFromCache);
                String enterFrom = getEnterFrom();
                o.LJIIIIZZ(enterFrom, "enterFrom");
                C85144XbI.LJIILJJIL(twoStepVerificationResponseFromCache, enterFrom, false, false, false, false);
            } else {
                LLILLIZIL(true);
            }
        }
        Integer LJI = C79045V0n.LJI(R.attr.c9, this);
        if (LJI != null) {
            ((C252709vu) _$_findCachedViewById(R.id.l_2)).setNavBackground(LJI.intValue());
            ((C252709vu) _$_findCachedViewById(R.id.l_2)).LJIILJJIL(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onCreate", false);
    }

    public final void LLIIJI(Integer num, String str) {
        C85115Xap.LIZ = false;
        C85115Xap.LIZIZ = false;
        C85115Xap.LIZJ = false;
        LLIIJLIL();
        if (num == null) {
            C5S1 c5s1 = new C5S1(this);
            c5s1.LIZLLL(getString(R.string.g5w));
            c5s1.LJ();
        } else if (num.intValue() < 0 || TextUtils.isEmpty(str)) {
            C5S1 c5s12 = new C5S1(this);
            c5s12.LIZLLL(getString(R.string.img));
            c5s12.LJ();
        } else {
            C5S1 c5s13 = new C5S1(this);
            o.LJI(str);
            c5s13.LIZLLL(str);
            c5s13.LJ();
        }
    }

    public final void LLJJIJIIJIL(int i, List ways) {
        o.LJIIIZ(ways, "ways");
        if (o.LJ("mandatory_popup", getEnterFrom()) || o.LJ("nudge_popup", getEnterFrom())) {
            C85144XbI.LJJIJIL("turn_on");
        }
        if (!this.LJLJLJ) {
            this.LJLJLJ = true;
            LLIIIZ(i, false, ways);
        }
    }

    public final void LLJJJJ(String str, InterfaceC88472Yns interfaceC88472Yns) {
        R41.LIZ().getSetPasswordStatus(new C85135Xb9(this, interfaceC88472Yns, str));
    }

    public final void LLJJJJJIL(String str, InterfaceC88472Yns interfaceC88472Yns) {
        boolean z;
        String email;
        String mobile;
        TwoSvUserData twoSvUserData = this.LJLL;
        if (twoSvUserData != null && o.LJ(twoSvUserData.getHas_pwd(), Boolean.TRUE)) {
            R41.LJFF().verifyPassword(this, getEnterFrom(), LLIIIILZ(), new IDeS98S0200000_15(this, interfaceC88472Yns, 9));
            return;
        }
        TwoSvUserData twoSvUserData2 = this.LJLL;
        if (twoSvUserData2 != null) {
            z = o.LJ(twoSvUserData2.getHas_mobile(), Boolean.TRUE);
        } else {
            z = false;
        }
        String str2 = "";
        if (z) {
            BindService LIZIZ = R41.LIZIZ();
            String enterFrom = getEnterFrom();
            String enterMethod = getEnterMethod();
            TwoSvUserData twoSvUserData3 = this.LJLL;
            if (twoSvUserData3 != null && (mobile = twoSvUserData3.getMobile()) != null) {
                str2 = mobile;
            }
            LIZIZ.verifyMobileWithWorkflowTokenForTicket(this, enterFrom, enterMethod, str2, LLIIIILZ(), new IDeS98S0200000_15(this, interfaceC88472Yns, 11));
            return;
        }
        TwoSvUserData twoSvUserData4 = this.LJLL;
        if (twoSvUserData4 != null && o.LJ(twoSvUserData4.getHas_email(), Boolean.TRUE)) {
            BindService LIZIZ2 = R41.LIZIZ();
            String enterFrom2 = getEnterFrom();
            String enterMethod2 = getEnterMethod();
            TwoSvUserData twoSvUserData5 = this.LJLL;
            if (twoSvUserData5 != null && (email = twoSvUserData5.getEmail()) != null) {
                str2 = email;
            }
            LIZIZ2.verifyEmailWithWorkflowTokenForTicket(this, enterFrom2, enterMethod2, str2, LLIIIILZ(), new IDeS98S0200000_15(this, interfaceC88472Yns, 13));
            return;
        }
        interfaceC88472Yns.invoke(new C85114Xao(str, "oauth_verify"));
    }

    public final void LLIIIZ(int i, boolean z, List list) {
        V1B.LJLJJL(LLIIIJ());
        QQN qqn = new QQN();
        qqn.LIZ = "/passport/shark/safe_verify/verification_manage/";
        qqn.LIZJ(WM7.SCENE_SERVICE, "two_step_manage");
        new R9U(this, qqn.LIZIZ(), new C85117Xar(i, this, list, z)).LJIIIZ();
    }

    public final void LLILLJJLI(String way, String ticket, String str) {
        o.LJIIIZ(way, "way");
        o.LJIIIZ(ticket, "ticket");
        V1B.LJLJJL(LLIIIJ());
        TwoStepAuthApi.LIZ.getClass();
        TwoStepAuthApi.LIZIZ().removeVerification(ticket, way).LJ(new AgS11S2100000_15(this, way, str, 0), C10K.LJIIIIZZ, null);
    }

    public final void LLJILLL(String way, String ticket, String str) {
        o.LJIIIZ(way, "way");
        o.LJIIIZ(ticket, "ticket");
        V1B.LJLJJL(LLIIIJ());
        TwoStepAuthApi.LIZ.getClass();
        TwoStepAuthApi.LIZIZ().removeAllVerification(ticket).LJ(new AgS11S2100000_15(this, str, way, 1), C10K.LJIIIIZZ, null);
    }

    public final void LLFII(List list, String str, String verify_ticket, int i, boolean z) {
        String verify_way = C85144XbI.LJII(list);
        V1B.LJLJJL(LLIIIJ());
        TwoStepAuthApi.LIZ.getClass();
        o.LJIIIZ(verify_ticket, "verify_ticket");
        o.LJIIIZ(verify_way, "verify_way");
        TwoStepAuthApi.LIZIZ().addVerification(verify_ticket, verify_way, i).LJ(new AgS0S2211000_15(i, this, verify_way, str, list, z, 0), C10K.LJIIIIZZ, null);
    }

    public final void LLFZ(List ways, String verifyMethod, String ticket, int i, boolean z) {
        o.LJIIIZ(verifyMethod, "verifyMethod");
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(ways, "ways");
        if (LLIL() && this.LJLL != null) {
            if (ways.contains("mobile_sms_verify") && !C85115Xap.LIZIZ) {
                LLJJJIL(z, verifyMethod, EnumC85151XbP.SMS, ticket, ways, i);
                return;
            }
            if (ways.contains("email_verify") && !C85115Xap.LIZJ) {
                LLJJJIL(z, verifyMethod, EnumC85151XbP.EMAIL, ticket, ways, i);
                return;
            }
            if (ways.contains("pwd_verify") && !C85115Xap.LIZ) {
                LLJJJIL(z, verifyMethod, EnumC85151XbP.PASSWORD, ticket, ways, i);
                return;
            }
            if (GJ0.LIZ() && ways.contains("totp_verify") && !C85115Xap.LIZLLL) {
                LLJJJIL(z, verifyMethod, EnumC85151XbP.TOTP, ticket, ways, i);
                return;
            }
            TwoSvUserData twoSvUserData = this.LJLL;
            o.LJI(twoSvUserData);
            Boolean has_email = twoSvUserData.getHas_email();
            Boolean bool = Boolean.TRUE;
            if (!o.LJ(has_email, bool)) {
                LLILZ(ways, verifyMethod, ticket, i, z);
                return;
            }
            TwoSvUserData twoSvUserData2 = this.LJLL;
            o.LJI(twoSvUserData2);
            if (!o.LJ(twoSvUserData2.getHas_mobile(), bool)) {
                LLIZLLLIL(ways, verifyMethod, ticket, i, z);
                return;
            } else {
                LLFII(ways, verifyMethod, ticket, i, z);
                return;
            }
        }
        User LIZJ = R41.LIZJ();
        if (ways.contains("mobile_sms_verify") && !C85115Xap.LIZIZ) {
            LLJJJ(z, "trusted_environment", EnumC85151XbP.SMS, ticket, ways, i);
            return;
        }
        if (ways.contains("email_verify") && !C85115Xap.LIZJ) {
            LLJJJ(z, "trusted_environment", EnumC85151XbP.EMAIL, ticket, ways, i);
            return;
        }
        if (ways.contains("pwd_verify") && !C85115Xap.LIZ) {
            LLJJJ(z, "trusted_environment", EnumC85151XbP.PASSWORD, ticket, ways, i);
            return;
        }
        if (GJ0.LIZ() && ways.contains("totp_verify") && !C85115Xap.LIZLLL) {
            LLJJJ(z, "trusted_environment", EnumC85151XbP.TOTP, ticket, ways, i);
            return;
        }
        if (!LIZJ.isHasEmail()) {
            LLILZ(ways, verifyMethod, ticket, i, z);
        } else if (!LIZJ.isPhoneBinded()) {
            LLIZLLLIL(ways, verifyMethod, ticket, i, z);
        } else {
            LLFII(ways, verifyMethod, ticket, i, z);
        }
    }

    public final void LLILZ(List list, String str, String str2, int i, boolean z) {
        V1B.LJLJJL(LLIIIJ());
        BindService LIZIZ = R41.LIZIZ();
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        Bundle LIZ = C0JT.LIZ("show_success_toast", false, "show_skip", true);
        LIZ.putString("page", "twosv_setup");
        LIZ.putInt("email_source", V86.DYABindEmailSourceTypeTwoStepVerification.getValue());
        LIZ.putBoolean("is_mandatory_two_sv", LLIL());
        LIZIZ.bindEmail(this, enterFrom, enterMethod, LIZ, new C85158XbW(i, this, str, str2, list, z));
    }

    public final void LLIZLLLIL(List list, String str, String str2, int i, boolean z) {
        BindService LIZIZ = R41.LIZIZ();
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        Bundle LIZ = C0JT.LIZ("show_success_toast", false, "show_skip", true);
        LIZ.putString("page", "twosv_setup");
        LIZ.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeTwoStepVerification.getValue());
        LIZ.putBoolean("is_mandatory_two_sv", LLIL());
        LIZIZ.bindMobile(this, enterFrom, enterMethod, LIZ, new C85159XbX(i, this, str, str2, list, z));
    }

    public static void LLJILJILJ(TwoStepVerificationManageActivity twoStepVerificationManageActivity, String ticket, boolean z, String str, InterfaceC88472Yns interfaceC88472Yns, int i) {
        C10K<BindOrUpdateTOTPResponse> registerTotp;
        InterfaceC88472Yns callBack = interfaceC88472Yns;
        boolean z2 = z;
        String enterMethod = str;
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            enterMethod = twoStepVerificationManageActivity.getEnterMethod();
            o.LJIIIIZZ(enterMethod, "this.enterMethod");
        }
        if ((i & 8) != 0) {
            callBack = C85183Xbv.LJLIL;
        }
        twoStepVerificationManageActivity.getClass();
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(callBack, "callBack");
        if (z2) {
            TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.LIZ;
            int i2 = EF7.LJIIIZ;
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
            long parseLong = CastLongProtector.parseLong(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
            twoStepAuthApi.getClass();
            registerTotp = TwoStepAuthApi.LJFF(i2, parseLong, ticket);
        } else {
            TwoStepAuthApi twoStepAuthApi2 = TwoStepAuthApi.LIZ;
            int i3 = EF7.LJIIIZ;
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2 = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2, "getDeviceId()");
            long parseLong2 = CastLongProtector.parseLong(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2);
            twoStepAuthApi2.getClass();
            registerTotp = TwoStepAuthApi.LIZIZ().registerTotp(i3, parseLong2, ticket, TwoStepAuthApi.LIZJ("/passport/totp/register/v2/"));
        }
        registerTotp.LJ(new C85132Xb6(twoStepVerificationManageActivity, enterMethod, ticket, callBack, z2), C10K.LJIIIIZZ, null);
    }

    public final void LLJJJ(boolean z, String str, EnumC85151XbP enumC85151XbP, String str2, List<String> list, int i) {
        User LIZJ = R41.LIZJ();
        int i2 = C85126Xb0.LIZ[enumC85151XbP.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    LLJILJILJ(this, str2, false, null, new AqS1S2211000_15(i, this, str2, list, z, 1), 6);
                    return;
                } else if (LIZJ.isEmailVerified()) {
                    C85115Xap.LIZJ = true;
                    LLFZ(list, "trusted_environment", str2, i, z);
                    return;
                } else {
                    if (LIZJ.isHasEmail()) {
                        R41.LIZIZ().verifyEmail(this, getEnterFrom(), HiddenActivity$$ExternalSyntheticOutline0.m("show_success_toast", false, "page", "twosv_setup"), new C85153XbR(i, this, str2, list, z));
                        return;
                    }
                    BindService LIZIZ = R41.LIZIZ();
                    String enterFrom = getEnterFrom();
                    String enterMethod = getEnterMethod();
                    Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("show_success_toast", false, "page", "twosv_setup");
                    m.putInt("email_source", V86.DYABindEmailSourceTypeTwoStepVerification.getValue());
                    LIZIZ.bindEmail(this, enterFrom, enterMethod, m, new C85154XbS(i, this, str2, list, z));
                    return;
                }
            }
            if (LIZJ.isPhoneBinded()) {
                C85115Xap.LIZIZ = true;
                LLFZ(list, "trusted_environment", str2, i, z);
                return;
            }
            BindService LIZIZ2 = R41.LIZIZ();
            String enterFrom2 = getEnterFrom();
            String enterMethod2 = getEnterMethod();
            Bundle m2 = HiddenActivity$$ExternalSyntheticOutline0.m("show_success_toast", false, "page", "twosv_setup");
            m2.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeTwoStepVerification.getValue());
            LIZIZ2.bindMobile(this, enterFrom2, enterMethod2, m2, new C85152XbQ(i, this, str2, list, z));
            return;
        }
        R41.LIZ().getSetPasswordStatus(new C85137XbB(i, this, str2, list, z));
    }

    public final void LLJJJIL(boolean z, String str, EnumC85151XbP enumC85151XbP, String str2, List<String> list, int i) {
        int i2 = C85126Xb0.LIZ[enumC85151XbP.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    LLJILJILJ(this, str2, false, null, new AqS1S2211000_15(i, this, str, str2, list, z, 2), 6);
                    return;
                }
                TwoSvUserData twoSvUserData = this.LJLL;
                if (twoSvUserData != null && o.LJ(twoSvUserData.getHas_email(), Boolean.TRUE)) {
                    C85115Xap.LIZJ = true;
                    LLFZ(list, str, str2, i, z);
                    return;
                }
                BindService LIZIZ = R41.LIZIZ();
                String enterFrom = getEnterFrom();
                String enterMethod = getEnterMethod();
                Bundle bundle = new Bundle();
                bundle.putString("page", "twosv_setup");
                bundle.putBoolean("show_success_toast", false);
                bundle.putInt("email_source", V86.DYABindEmailSourceTypeTwoStepVerification.getValue());
                bundle.putBoolean("is_mandatory_two_sv", LLIL());
                LIZIZ.bindEmail(this, enterFrom, enterMethod, bundle, new C85140XbE(i, this, str, str2, list, z));
                return;
            }
            TwoSvUserData twoSvUserData2 = this.LJLL;
            if (twoSvUserData2 != null && o.LJ(twoSvUserData2.getHas_mobile(), Boolean.TRUE)) {
                C85115Xap.LIZIZ = true;
                LLFZ(list, str, str2, i, z);
                return;
            }
            BindService LIZIZ2 = R41.LIZIZ();
            String enterFrom2 = getEnterFrom();
            String enterMethod2 = getEnterMethod();
            Bundle bundle2 = new Bundle();
            bundle2.putString("page", "twosv_setup");
            bundle2.putBoolean("show_success_toast", false);
            bundle2.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeTwoStepVerification.getValue());
            bundle2.putBoolean("is_mandatory_two_sv", LLIL());
            LIZIZ2.bindMobile(this, enterFrom2, enterMethod2, bundle2, new C85139XbD(i, this, str, str2, list, z));
            return;
        }
        TwoSvUserData twoSvUserData3 = this.LJLL;
        o.LJI(twoSvUserData3);
        if (o.LJ(twoSvUserData3.getHas_pwd(), Boolean.TRUE)) {
            C85115Xap.LIZ = true;
            LLFZ(list, str, str2, i, z);
        } else {
            R41.LJFF().setPassword(this, LLII(), new C85138XbC(i, this, str, str2, list, z));
        }
    }
}
