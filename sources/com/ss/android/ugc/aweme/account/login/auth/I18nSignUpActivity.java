package com.ss.android.ugc.aweme.account.login.auth;

import X.AV9;
import X.AVK;
import X.AbstractC85577XiH;
import X.ActivityC86117Xqz;
import X.C03880Dg;
import X.C06F;
import X.C0JU;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C26227ARb;
import X.C2NU;
import X.C35869E5x;
import X.C35870E5y;
import X.C35936E8m;
import X.C36089EEj;
import X.C36093EEn;
import X.C38985FRt;
import X.C38995FSd;
import X.C39082FVm;
import X.C40888G2y;
import X.C47261Igj;
import X.C53262KvK;
import X.C56662Kg;
import X.C5S1;
import X.C62783OkV;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C66569QAr;
import X.C68517Qun;
import X.C68548QvI;
import X.C68989R5t;
import X.C69101RAb;
import X.C77275UUl;
import X.C78685UuP;
import X.C79045V0n;
import X.C79061V1d;
import X.C81226VuI;
import X.C84763XOl;
import X.C85541Xhh;
import X.C85542Xhi;
import X.C85550Xhq;
import X.C85551Xhr;
import X.C85552Xhs;
import X.C85554Xhu;
import X.C85555Xhv;
import X.C85556Xhw;
import X.C85566Xi6;
import X.C85567Xi7;
import X.C85573XiD;
import X.C85575XiF;
import X.C85576XiG;
import X.C85578XiI;
import X.C85581XiL;
import X.C85582XiM;
import X.C85583XiN;
import X.C85585XiP;
import X.C85587XiR;
import X.C85588XiS;
import X.C85589XiT;
import X.C85590XiU;
import X.C85992Xoy;
import X.DUE;
import X.DialogC25756A8y;
import X.EnumC35839E4t;
import X.EnumC36236EKa;
import X.EnumC68524Quu;
import X.FFL;
import X.FH5;
import X.FMX;
import X.G1C;
import X.G1E;
import X.G3S;
import X.G3T;
import X.HG3;
import X.InterfaceC18010nF;
import X.InterfaceC34451Wv;
import X.InterfaceC62984Onk;
import X.InterfaceC69103RAd;
import X.InterfaceC85592XiW;
import X.InterfaceC85593XiX;
import X.ORS;
import X.R41;
import X.R46;
import X.R5Z;
import X.R67;
import X.R6A;
import X.RBX;
import X.UC0;
import X.Z8A;
import Y.ACListenerS48S0200000_14;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS50S0100000_14;
import Y.ARunnableS51S0100000_15;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import com.ss.android.ugc.aweme.app.services.NewUserMainModuleService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService;
import com.ss.android.ugc.aweme.service.increaseloginnotify.IncreaseLoginNotifyService;
import com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService;
import com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;
import com.ss.android.ugc.aweme.services.SmartLockService;
import com.ss.android.ugc.aweme.user.UserStore;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* loaded from: classes16.dex */
public class I18nSignUpActivity extends ActivityC86117Xqz implements InterfaceC69103RAd, InterfaceC18010nF, InterfaceC85592XiW, R6A, InterfaceC62984Onk {
    public static final /* synthetic */ int LJLLLL = 0;
    public boolean LJLIL;
    public Intent LJLJJI;
    public SmartRoute LJLJJL;
    public DialogC25756A8y LJLJJLL;
    public AbstractC85577XiH LJLJL;
    public SignupViewModel LJLJLJ;
    public Long LJLJLLL;
    public boolean LJLL;
    public C35869E5x LJLLI;
    public final IProactiveTriggersService LJLLILLLL;
    public final IIncreaseLoginNotifyService LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public String LJLILLLLZI = "";
    public final long LJLJI = System.currentTimeMillis();

    public final boolean LLIIIILZ() {
        if (CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false).shouldShowOneClickLoginPanel()) {
            return false;
        }
        SignupViewModel signupViewModel = this.LJLJLJ;
        if (signupViewModel != null) {
            if (!signupViewModel.rv0()) {
                return false;
            }
            SignupViewModel signupViewModel2 = this.LJLJLJ;
            if (signupViewModel2 != null) {
                return signupViewModel2.qv0() && TextUtils.isEmpty(HG3.LJIILL().getLastUid());
            }
            o.LJIJI("dependencies");
            throw null;
        }
        o.LJIJI("dependencies");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b5346";
    }

    @Override // X.InterfaceC62984Onk
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public I18nSignUpActivity() {
        IProactiveTriggersService LJI = ProactiveTriggersService.LJI();
        o.LJIIIIZZ(LJI, "get().getService(IProact…ggersService::class.java)");
        this.LJLLILLLL = LJI;
        IIncreaseLoginNotifyService LJI2 = IncreaseLoginNotifyService.LJI();
        o.LJIIIIZZ(LJI2, "get().getService(IIncrea…otifyService::class.java)");
        this.LJLLJ = LJI2;
    }

    @Override // X.InterfaceC85592XiW
    public final void LJIILIIL() {
        SignupViewModel signupViewModel = this.LJLJLJ;
        if (signupViewModel != null) {
            if (!signupViewModel.rv0()) {
                LLFII();
                ViewPagerBottomSheetBehavior LIZ = ViewPagerBottomSheetBehavior.LIZ(_$_findCachedViewById(R.id.j71));
                if (LIZ != null) {
                    LIZ.setState(5);
                    return;
                } else {
                    finish();
                    return;
                }
            }
            finish();
            return;
        }
        o.LJIJI("dependencies");
        throw null;
    }

    public final void LLFII() {
        SignupViewModel signupViewModel = this.LJLJLJ;
        if (signupViewModel != null) {
            if (!((Boolean) signupViewModel.LLIIJLIL.getValue()).booleanValue()) {
                getWindow().setDimAmount(0.0f);
                return;
            }
            return;
        }
        o.LJIJI("dependencies");
        throw null;
    }

    public final boolean LLFZ() {
        UserPermissionData.UserPermissionInfo LIZ;
        Boolean bool;
        AbstractC85577XiH abstractC85577XiH = this.LJLJL;
        if (abstractC85577XiH != null) {
            if (!abstractC85577XiH.LJJLIIJ()) {
                return false;
            }
            SignupViewModel signupViewModel = this.LJLJLJ;
            if (signupViewModel != null) {
                if (!((Boolean) signupViewModel.LJLLLLLL.getValue()).booleanValue() || !e1.LIZ(31744, "multi_account_signup", true, false) || (LIZ = AVK.LIZ()) == null) {
                    return false;
                }
                if (ujb.o.LJJJJJL(LIZ.getAgeGateRegion())) {
                    String str = UserPermissionData.UserPermissionRequestType.DEFAULT_TYPE.toString();
                    if (LIZ.permissionsMap().containsKey(str) && (bool = LIZ.permissionsMap().get(str)) != null && !bool.booleanValue()) {
                        return false;
                    }
                }
                if (UserStore.LIZJ(false).getAgeGateAction() != 0) {
                    return false;
                }
                Z8A z8a = Z8A.LIZIZ;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
                z8a.LIZ.showCheckMultiAccountBottomSheet(supportFragmentManager, new AV9("click_sign_up", "check_same_user_multi_account", 28), "check_multi_account_dialog");
                return true;
            }
            o.LJIJI("dependencies");
            throw null;
        }
        o.LJIJI("signupManager");
        throw null;
    }

    public final void LLIIIJ() {
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(this);
        this.LJLJJLL = dialogC25756A8y;
        dialogC25756A8y.LIZLLL(false);
        DialogC25756A8y dialogC25756A8y2 = this.LJLJJLL;
        if (dialogC25756A8y2 != null) {
            dialogC25756A8y2.LIZ(false);
        }
        DialogC25756A8y dialogC25756A8y3 = this.LJLJJLL;
        if (dialogC25756A8y3 != null) {
            dialogC25756A8y3.LIZIZ(R.string.rjz);
        }
        DialogC25756A8y dialogC25756A8y4 = this.LJLJJLL;
        if (dialogC25756A8y4 == null || new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y4, new Object[0], "void", new C65300Pk0(false, "()V", "-5309090443418078275")).LIZ) {
            return;
        }
        dialogC25756A8y4.show();
    }

    public final void LLIIJLIL() {
        AbstractC85577XiH abstractC85577XiH = this.LJLJL;
        if (abstractC85577XiH != null) {
            if (!abstractC85577XiH.LJJLIIJ() && PasskeyService.LJFF().LIZJ()) {
                AbstractC85577XiH abstractC85577XiH2 = this.LJLJL;
                if (abstractC85577XiH2 != null) {
                    abstractC85577XiH2.LJIIIZ();
                    return;
                } else {
                    o.LJIJI("signupManager");
                    throw null;
                }
            }
            AbstractC85577XiH abstractC85577XiH3 = this.LJLJL;
            if (abstractC85577XiH3 != null) {
                SignupViewModel signupViewModel = this.LJLJLJ;
                if (signupViewModel != null) {
                    boolean gv0 = signupViewModel.gv0();
                    SignupViewModel signupViewModel2 = this.LJLJLJ;
                    if (signupViewModel2 != null) {
                        String enterMethod = signupViewModel2.getEnterMethod();
                        o.LJIIIIZZ(enterMethod, "dependencies.enterMethod");
                        SignupViewModel signupViewModel3 = this.LJLJLJ;
                        if (signupViewModel3 != null) {
                            abstractC85577XiH3.LJIIIIZZ(enterMethod, gv0, signupViewModel3.rv0());
                            return;
                        } else {
                            o.LJIJI("dependencies");
                            throw null;
                        }
                    }
                    o.LJIJI("dependencies");
                    throw null;
                }
                o.LJIJI("dependencies");
                throw null;
            }
            o.LJIJI("signupManager");
            throw null;
        }
        o.LJIJI("signupManager");
        throw null;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        AbstractC85577XiH abstractC85577XiH = this.LJLJL;
        if (abstractC85577XiH != null) {
            if (abstractC85577XiH.LJJLIIIJLLLLLLLZ()) {
                return;
            }
            C35936E8m c35936E8m = new C35936E8m();
            SignupViewModel signupViewModel = this.LJLJLJ;
            if (signupViewModel != null) {
                c35936E8m.LIZLLL("enter_method", signupViewModel.getEnterMethod());
                SignupViewModel signupViewModel2 = this.LJLJLJ;
                if (signupViewModel2 != null) {
                    c35936E8m.LIZLLL("enter_from", signupViewModel2.getEnterFrom());
                    c35936E8m.LIZLLL("exit_method", "go_back");
                    SignupViewModel signupViewModel3 = this.LJLJLJ;
                    if (signupViewModel3 != null) {
                        c35936E8m.LIZLLL("group_id", signupViewModel3.jv0());
                        SignupViewModel signupViewModel4 = this.LJLJLJ;
                        if (signupViewModel4 != null) {
                            c35936E8m.LIZLLL("login_panel_type", signupViewModel4.lv0());
                            SignupViewModel signupViewModel5 = this.LJLJLJ;
                            if (signupViewModel5 != null) {
                                c35936E8m.LIZIZ(((Number) signupViewModel5.LJLLL.getValue()).longValue(), "duration");
                                SignupViewModel signupViewModel6 = this.LJLJLJ;
                                if (signupViewModel6 != null) {
                                    if (o.LJ(signupViewModel6.getEnterFrom(), "age_gate_page")) {
                                        c35936E8m.LIZJ("exit_to", "back_to_age_gate");
                                    }
                                    FMX.LJIIL("close_login_notify", c35936E8m.LIZ);
                                    super.onBackPressed();
                                    return;
                                }
                                o.LJIJI("dependencies");
                                throw null;
                            }
                            o.LJIJI("dependencies");
                            throw null;
                        }
                        o.LJIJI("dependencies");
                        throw null;
                    }
                    o.LJIJI("dependencies");
                    throw null;
                }
                o.LJIJI("dependencies");
                throw null;
            }
            o.LJIJI("dependencies");
            throw null;
        }
        o.LJIJI("signupManager");
        throw null;
    }

    public final boolean LLII() {
        if (C53262KvK.LIZIZ()) {
            SignupViewModel signupViewModel = this.LJLJLJ;
            if (signupViewModel != null) {
                if (!signupViewModel.sv0()) {
                    return true;
                }
            } else {
                o.LJIJI("dependencies");
                throw null;
            }
        }
        return false;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI == null || !LLJJIJI.getBoolean("has_callBack", false)) {
            R41.LJIIJJI(10, 4);
            new Handler().postDelayed(new ARunnableS51S0100000_15(this, 21), 200L);
        }
        SignupViewModel signupViewModel = this.LJLJLJ;
        if (signupViewModel != null) {
            if (!signupViewModel.rv0()) {
                overridePendingTransition(0, R.anim.a7);
            } else {
                overridePendingTransition(0, R.anim.a6);
            }
            if (this.LJLIL) {
                C69101RAb.LIZIZ(15);
            }
            DialogC25756A8y dialogC25756A8y = this.LJLJJLL;
            if (dialogC25756A8y != null) {
                dialogC25756A8y.dismiss();
            }
            this.LJLLILLLL.LJ();
            this.LJLLJ.LIZIZ();
            AbstractC85577XiH abstractC85577XiH = this.LJLJL;
            if (abstractC85577XiH != null) {
                SignupViewModel signupViewModel2 = this.LJLJLJ;
                if (signupViewModel2 != null) {
                    boolean gv0 = signupViewModel2.gv0();
                    SignupViewModel signupViewModel3 = this.LJLJLJ;
                    if (signupViewModel3 != null) {
                        abstractC85577XiH.LJII(gv0, signupViewModel3.rv0());
                        return;
                    } else {
                        o.LJIJI("dependencies");
                        throw null;
                    }
                }
                o.LJIJI("dependencies");
                throw null;
            }
            o.LJIJI("signupManager");
            throw null;
        }
        o.LJIJI("dependencies");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).remove(this);
        super.onDestroy();
        ArrayList arrayList = (ArrayList) C66569QAr.LJII;
        if (!arrayList.isEmpty()) {
            ORS.LJJLL(arrayList);
        }
        if (!C56662Kg.LIZ().LJIIIIZZ("cold_boot_after_sync_user_to_signup_destroy")) {
            C56662Kg.LIZ().LJFF("cold_boot_after_sync_user_to_signup_destroy", false);
        }
        if (!C56662Kg.LIZ().LJIIIIZZ("cold_boot_login_success_to_signup_destroy")) {
            C56662Kg.LIZ().LJFF("cold_boot_login_success_to_signup_destroy", false);
        }
        C35869E5x c35869E5x = this.LJLLI;
        if (c35869E5x != null) {
            c35869E5x.dispose();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (C84763XOl.LJIIJJI) {
            AbstractC85577XiH abstractC85577XiH = this.LJLJL;
            if (abstractC85577XiH != null) {
                abstractC85577XiH.LIZLLL("background");
                return;
            } else {
                o.LJIJI("signupManager");
                throw null;
            }
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZIZ(System.currentTimeMillis() - this.LJLJI, "stay_time");
        FMX.LJIIL("sign_up_main_page", c35936E8m.LIZ);
    }

    public static void LLIIJI(int i) {
        if (C39082FVm.LIZ()) {
            LinkedHashMap LIZ = C0JU.LIZ("monitor_scene", "scene_login");
            LIZ.put("vv_code", Integer.valueOf(i));
            C39082FVm.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC69103RAd
    public final void LJIIL(int i) {
        if (i != 11) {
            if (i != 15) {
                AbstractC85577XiH abstractC85577XiH = this.LJLJL;
                if (abstractC85577XiH != null) {
                    abstractC85577XiH.LJIIL(i);
                    return;
                } else {
                    o.LJIJI("signupManager");
                    throw null;
                }
            }
            super.finish();
            return;
        }
        this.LJLIL = true;
        Long l = this.LJLJLLL;
        if (l != null) {
            long longValue = l.longValue();
            int i2 = Keva.getRepo("app_launch").getInt("launch_times", -1);
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - longValue, "duration");
            c35936E8m.LIZ(i2, "launch_times");
            FMX.LJIIL("first_login_duration", c35936E8m.LIZ);
        }
        if (DUE.LJFF(true) && !this.LJLL) {
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZ(NewUserMainModuleService.LJIIJ().LIZLLL(1, 3));
            LJIIIZ.LIZJ();
            this.LJLL = true;
        }
        C56662Kg.LIZ().LJFF("cold_boot_new_user_login_duration", false);
        C56662Kg.LIZ().LIZJ("cold_boot_new_user_login_end_to_feed_total_start", false);
        finish();
    }

    @Override // X.R6A
    public final void LJJLIL(String str) {
        SignupViewModel signupViewModel = this.LJLJLJ;
        if (signupViewModel != null) {
            if (signupViewModel.rv0()) {
                C35936E8m c35936E8m = new C35936E8m();
                c35936E8m.LIZLLL("enter_method", "login_entry_page");
                SignupViewModel signupViewModel2 = this.LJLJLJ;
                if (signupViewModel2 != null) {
                    c35936E8m.LIZLLL("enter_from", signupViewModel2.getEnterFrom());
                    c35936E8m.LIZLLL("exit_method", str);
                    FMX.LJIIL("back_to_sign_up", c35936E8m.LIZ);
                    C35936E8m c35936E8m2 = new C35936E8m();
                    SignupViewModel signupViewModel3 = this.LJLJLJ;
                    if (signupViewModel3 != null) {
                        c35936E8m2.LIZLLL("enter_method", signupViewModel3.getEnterMethod());
                        SignupViewModel signupViewModel4 = this.LJLJLJ;
                        if (signupViewModel4 != null) {
                            c35936E8m2.LIZLLL("enter_from", signupViewModel4.getEnterFrom());
                            c35936E8m2.LIZLLL("exit_method", str);
                            FMX.LJIIL("exit_cold_launch_login_notify", c35936E8m2.LIZ);
                            return;
                        }
                        o.LJIJI("dependencies");
                        throw null;
                    }
                    o.LJIJI("dependencies");
                    throw null;
                }
                o.LJIJI("dependencies");
                throw null;
            }
            return;
        }
        o.LJIJI("dependencies");
        throw null;
    }

    @Override // X.R6A
    public final boolean LJLLLLLL(SmartRoute smartRoute) {
        this.LJLJJI = null;
        this.LJLJJL = smartRoute;
        return LLFZ();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.2UI] */
    public final void LLIIIZ(boolean z) {
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).loadCredentials(this, true, new G1C(this, new InterfaceC34451Wv() { // from class: X.2UI
            @Override // X.InterfaceC34451Wv
            public final Object LJJIII() {
                return null;
            }

            @Override // X.InterfaceC34451Wv
            public final boolean Wi() {
                return false;
            }

            @Override // X.InterfaceC34451Wv, X.InterfaceC18010nF
            public String getBtmPageCode() {
                return "b7909";
            }

            @Override // X.InterfaceC18010nF
            public final java.util.Map<String, String> x3() {
                return null;
            }

            @Override // X.InterfaceC34451Wv, X.InterfaceC18010nF
            public final String LLZIL() {
                return C18030nH.LIZ(this);
            }
        }, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        List<? extends C85542Xhi> LJJIJIL;
        Integer num;
        int i2;
        boolean z2;
        AbstractC85577XiH c85575XiF;
        ?? r8;
        Object obj;
        IPluginService.ShowConfig showConfig;
        Object obj2;
        IPluginService.NonForcedLoginRegionFlow nonForcedLoginRegionFlow;
        int i3;
        Integer num2;
        Integer num3;
        Window window;
        boolean z3;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity", "onCreate", true);
        super.onCreate(bundle);
        LLIIJI(2200);
        C66569QAr.LJFF(false);
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).add(this);
        supportRequestWindowFeature(1);
        setContentView(R.layout.ns);
        Intent intent = getIntent();
        o.LJIIIZ(intent, "intent");
        SignupViewModel signupViewModel = (SignupViewModel) new ViewModelProvider(this).get(SignupViewModel.class);
        signupViewModel.LJLIL = new WeakReference<>(this);
        signupViewModel.LJLILLLLZI = intent;
        ArrayList arrayList = new ArrayList();
        if (C62783OkV.LIZ()) {
            arrayList.add(C85555Xhv.LJIIJ);
        } else if (signupViewModel.gv0()) {
            arrayList.add(C85550Xhq.LJIIJ);
        } else {
            arrayList.add(C85554Xhu.LJIIJ);
        }
        List LIZIZ = C85992Xoy.LIZIZ(false, signupViewModel.gv0(), new C85581XiL(this, signupViewModel));
        String str = (String) signupViewModel.LLFF.getPlatform().getValue();
        Iterator it = ((ArrayList) LIZIZ).iterator();
        while (it.hasNext()) {
            C85542Xhi c85542Xhi = (C85542Xhi) it.next();
            if (C78685UuP.LJJJZ(str) && s.LJJJLZIJ(c85542Xhi.LJ, str, false)) {
                z3 = true;
            } else {
                z3 = false;
            }
            c85542Xhi.LJI = z3;
        }
        if (((Boolean) signupViewModel.LJZ.getValue()).booleanValue()) {
            arrayList.add(C85551Xhr.LJIIJ);
            arrayList.add(new C85541Xhh(LIZIZ));
        } else {
            arrayList.addAll(LIZIZ);
        }
        if (signupViewModel.gv0()) {
            i = R.string.pc3;
        } else {
            i = R.string.doe;
        }
        Integer num4 = null;
        if (signupViewModel.gv0()) {
            num4 = Integer.valueOf(R.raw.icon_person_fill);
        }
        if (C62783OkV.LIZ()) {
            String enterMethod = signupViewModel.getEnterMethod();
            Bundle nv0 = signupViewModel.nv0();
            String enterFrom = signupViewModel.getEnterFrom();
            boolean LIZ = C62783OkV.LIZ();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            ListProtector.add(arrayList, 1, new C85567Xi7(enterMethod, nv0, this, this, i, LIZ, null, enterFrom, false, 672));
        } else {
            String enterFrom2 = signupViewModel.getEnterFrom();
            Bundle bundle2 = new Bundle(signupViewModel.kv0());
            if (signupViewModel.gv0() && ((Boolean) signupViewModel.LJZ.getValue()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            boolean gv0 = signupViewModel.gv0();
            boolean contains = C77275UUl.LJIIIIZZ("email", "mobile", "username").contains(signupViewModel.LLFFF);
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            ListProtector.add(arrayList, 1, new C85566Xi6(enterFrom2, bundle2, this, this, num4, Integer.valueOf(i), z, gv0, contains));
        }
        if (signupViewModel.LLFF.LIZIZ() != EnumC36236EKa.NONE) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                C85542Xhi c85542Xhi2 = (C85542Xhi) ListProtector.get(arrayList, i4);
                if (s.LJJJLZIJ(c85542Xhi2.LJ, signupViewModel.LLFFF, false)) {
                    ListProtector.remove(arrayList, i4);
                    ListProtector.add(arrayList, 1, c85542Xhi2);
                    break;
                }
                i4++;
            }
        }
        signupViewModel.LJLJI = arrayList;
        if (signupViewModel.gv0()) {
            LJJIJIL = C47261Igj.LJJIJIL(C85550Xhq.LJIIJ);
        } else if (C38985FRt.LIZIZ.LJIIL().LJII(signupViewModel.getEnterMethod())) {
            LJJIJIL = C47261Igj.LJJIJIL(C85556Xhw.LJIIJ);
        } else if (((Boolean) signupViewModel.LJZL.getValue()).booleanValue()) {
            LJJIJIL = C47261Igj.LJJIJIL(C85552Xhs.LJIIJ);
        } else {
            LJJIJIL = C47261Igj.LJJIJIL(C85554Xhu.LJIIJ);
        }
        List LIZIZ2 = C85992Xoy.LIZIZ(true, signupViewModel.gv0(), new C85582XiM(this, signupViewModel));
        if (signupViewModel.gv0()) {
            num = Integer.valueOf(R.raw.icon_person_fill);
        } else {
            num = null;
        }
        if (signupViewModel.gv0()) {
            i2 = R.string.pc4;
        } else {
            i2 = R.string.dq2;
        }
        String enterMethod2 = signupViewModel.getEnterMethod();
        Bundle nv02 = signupViewModel.nv0();
        if (signupViewModel.gv0() && ((Boolean) signupViewModel.LJZ.getValue()).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean gv02 = signupViewModel.gv0();
        String enterFrom3 = signupViewModel.getEnterFrom();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        ListProtector.add(LJJIJIL, 1, new C85567Xi7(enterMethod2, nv02, this, this, i2, z2, num, enterFrom3, gv02, 32));
        if (signupViewModel.gv0() && ((Boolean) signupViewModel.LJZ.getValue()).booleanValue()) {
            LJJIJIL.add(C85551Xhr.LJIIJ);
            LJJIJIL.add(new C85541Xhh(LIZIZ2));
        } else {
            LJJIJIL.addAll(LIZIZ2);
        }
        signupViewModel.LJLJJI = LJJIJIL;
        this.LJLJLJ = signupViewModel;
        R46.LIZIZ = signupViewModel.getEnterFrom();
        SignupViewModel signupViewModel2 = this.LJLJLJ;
        if (signupViewModel2 != null) {
            R46.LIZJ = signupViewModel2.lv0();
            SignupViewModel signupViewModel3 = this.LJLJLJ;
            if (signupViewModel3 != null) {
                TuxTextView title_bar = (TuxTextView) _$_findCachedViewById(R.id.l_2);
                o.LJIIIIZZ(title_bar, "title_bar");
                View divider = _$_findCachedViewById(R.id.cd9);
                o.LJIIIIZZ(divider, "divider");
                TuxIconView top_left_icon = (TuxIconView) _$_findCachedViewById(R.id.lfj);
                o.LJIIIIZZ(top_left_icon, "top_left_icon");
                TuxIconView top_right_icon = (TuxIconView) _$_findCachedViewById(R.id.lfx);
                o.LJIIIIZZ(top_right_icon, "top_right_icon");
                TuxTextView skip_text = (TuxTextView) _$_findCachedViewById(R.id.k2n);
                o.LJIIIIZZ(skip_text, "skip_text");
                signupViewModel3.LLIILZL = new C85573XiD(title_bar, divider, top_left_icon, top_right_icon, skip_text);
                C85585XiP c85585XiP = new C85585XiP(this, this, this);
                if (C62783OkV.LIZ()) {
                    c85575XiF = new C85576XiG(c85585XiP.LIZ, c85585XiP.LIZIZ, c85585XiP.LIZJ);
                } else {
                    c85575XiF = new C85575XiF(c85585XiP.LIZ, c85585XiP.LIZIZ, c85585XiP.LIZJ);
                }
                this.LJLJL = c85575XiF;
                this.LJLILLLLZI = R41.LIZLLL();
                if (!C35870E5y.LIZ()) {
                    a.LIZIZ().LJIJ();
                }
                Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
                if (LLJJIJI == null || !LLJJIJI.getBoolean("has_callBack", false)) {
                    R41.LJIIJJI(10, 1);
                }
                Window window2 = getWindow();
                window2.setGravity(80);
                window2.setLayout(-1, -1);
                SignupViewModel signupViewModel4 = this.LJLJLJ;
                if (signupViewModel4 != null) {
                    if (signupViewModel4.sv0() && (window = getWindow()) != null) {
                        window.setStatusBarColor(0);
                    }
                    SignupViewModel signupViewModel5 = this.LJLJLJ;
                    if (signupViewModel5 != null) {
                        if (signupViewModel5.rv0()) {
                            C06F c06f = new C06F(-1, -1);
                            c06f.setMargins(0, 0, 0, 0);
                            _$_findCachedViewById(R.id.j71).setLayoutParams(c06f);
                            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.bv8).getLayoutParams();
                            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            ((FrameLayout.LayoutParams) layoutParams).topMargin = 0;
                            ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.j71).getLayoutParams();
                            o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                            r8 = 0;
                            r8 = 0;
                            ((C06F) layoutParams2).LIZIZ(null);
                            _$_findCachedViewById(R.id.j71).setBackground(C79045V0n.LJIIIIZZ(R.attr.cl, this));
                            if (LLIIIILZ()) {
                                _$_findCachedViewById(R.id.j71).post(new ARunnableS50S0100000_14(this, 52));
                            }
                        } else {
                            r8 = 0;
                            ViewPagerBottomSheetBehavior LIZ2 = ViewPagerBottomSheetBehavior.LIZ(_$_findCachedViewById(R.id.j71));
                            LIZ2.LJII = true;
                            LIZ2.setState(5);
                            LIZ2.LJIILLIIL = new C85578XiI(this);
                            LIZ2.LJIJJLI = new C81226VuI(LIZ2, this);
                            SignupViewModel signupViewModel6 = this.LJLJLJ;
                            if (signupViewModel6 != null) {
                                if (!signupViewModel6.pv0()) {
                                    _$_findCachedViewById(R.id.j71).post(new ARunnableS33S0200000_14(this, LIZ2, 32));
                                }
                                C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.dn3), new ACListenerS48S0200000_14(LIZ2, this, 2));
                                _$_findCachedViewById(R.id.j71).post(new ARunnableS50S0100000_14(LIZ2, 53));
                            } else {
                                o.LJIJI("dependencies");
                                throw null;
                            }
                        }
                        AbstractC85577XiH abstractC85577XiH = this.LJLJL;
                        if (abstractC85577XiH != null) {
                            InterfaceC85593XiX content = abstractC85577XiH.getContent();
                            if (content instanceof C85587XiR) {
                                FragmentManager supportFragmentManager = getSupportFragmentManager();
                                C1B3 LIZ3 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                                LIZ3.LJIIJ(((C85587XiR) content).LJLIL, r8, _$_findCachedViewById(R.id.k0h).getId());
                                LIZ3.LJIILJJIL();
                            } else if (content instanceof C85588XiS) {
                                ((ViewGroup) _$_findCachedViewById(R.id.k0h)).addView(((C85588XiS) content).LJLIL);
                            } else {
                                IllegalStateException illegalStateException = new IllegalStateException("Unknown type of content");
                                ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity", "onCreate", false);
                                throw illegalStateException;
                            }
                            SignupViewModel signupViewModel7 = this.LJLJLJ;
                            if (signupViewModel7 != null) {
                                if (signupViewModel7.gv0()) {
                                    SignupViewModel signupViewModel8 = this.LJLJLJ;
                                    if (signupViewModel8 != null) {
                                        if (!signupViewModel8.rv0()) {
                                            View _$_findCachedViewById = _$_findCachedViewById(R.id.bv8);
                                            if (_$_findCachedViewById.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                                ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById.getLayoutParams();
                                                o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                layoutParams4.height = -2;
                                                layoutParams4.setMargins(0, 0, 0, 0);
                                                _$_findCachedViewById.setLayoutParams(layoutParams4);
                                                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.k0h);
                                                if (_$_findCachedViewById2.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                                                    ViewGroup.LayoutParams layoutParams5 = _$_findCachedViewById2.getLayoutParams();
                                                    o.LJII(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                                                    layoutParams6.height = -2;
                                                    layoutParams6.setMargins(0, 0, 0, 0);
                                                    _$_findCachedViewById2.setLayoutParams(layoutParams6);
                                                }
                                            }
                                        }
                                    } else {
                                        o.LJIJI("dependencies");
                                        throw r8;
                                    }
                                }
                                AbstractC85577XiH abstractC85577XiH2 = this.LJLJL;
                                if (abstractC85577XiH2 != null) {
                                    abstractC85577XiH2.LJJLJ(bundle);
                                    SignupViewModel signupViewModel9 = this.LJLJLJ;
                                    if (signupViewModel9 != null) {
                                        if (!signupViewModel9.sv0()) {
                                            SignupViewModel signupViewModel10 = this.LJLJLJ;
                                            if (signupViewModel10 != null) {
                                                if (signupViewModel10.rv0()) {
                                                    SignupViewModel signupViewModel11 = this.LJLJLJ;
                                                    if (signupViewModel11 != null) {
                                                        if (((Boolean) signupViewModel11.LLIIIJ.getValue()).booleanValue()) {
                                                            C38995FSd.LIZIZ().execute(new ARunnableS42S0100000_6(this, 173));
                                                        }
                                                    } else {
                                                        o.LJIJI("dependencies");
                                                        throw r8;
                                                    }
                                                }
                                            } else {
                                                o.LJIJI("dependencies");
                                                throw r8;
                                            }
                                        }
                                        Iterator LJFF = C79061V1d.LJFF(false);
                                        while (true) {
                                            if (LJFF.hasNext()) {
                                                obj = LJFF.next();
                                                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.NON_FORCED_REGION_QUICK_LOGIN.getValue()) {
                                                    break;
                                                }
                                            } else {
                                                obj = r8;
                                                break;
                                            }
                                        }
                                        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
                                        if (pluginData != null && (showConfig = pluginData.showConfig) != null && o.LJ(showConfig.shouldShow, Boolean.TRUE) && TextUtils.isEmpty(((RBX) HG3.LJIILL()).getLastUid()) && !CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false).shouldShowOneClickLoginPanel()) {
                                            Iterator LJFF2 = C79061V1d.LJFF(false);
                                            while (true) {
                                                if (LJFF2.hasNext()) {
                                                    obj2 = LJFF2.next();
                                                    if (((IPluginService.PluginData) obj2).id == EnumC35839E4t.NON_FORCED_REGION_QUICK_LOGIN.getValue()) {
                                                        break;
                                                    }
                                                } else {
                                                    obj2 = r8;
                                                    break;
                                                }
                                            }
                                            IPluginService.PluginData pluginData2 = (IPluginService.PluginData) obj2;
                                            if (pluginData2 != null && o.LJ(pluginData2.showConfig.shouldShow, Boolean.TRUE)) {
                                                String str2 = pluginData2.abExposeVid;
                                                if (str2 != null) {
                                                    FH5.LIZIZ().getClass();
                                                    FH5.LIZ(str2);
                                                }
                                                IPluginService.PluginDataWrapper pluginDataWrapper = pluginData2.configData;
                                                if (pluginDataWrapper != null) {
                                                    nonForcedLoginRegionFlow = pluginDataWrapper.nonForcedLoginRegionFlow;
                                                } else {
                                                    nonForcedLoginRegionFlow = r8;
                                                }
                                                int i5 = Keva.getRepo("quick_login_repo").getInt("failure_count", 0);
                                                if (nonForcedLoginRegionFlow != null && (num3 = nonForcedLoginRegionFlow.frequencyPostFailure) != null) {
                                                    i3 = num3.intValue();
                                                } else {
                                                    i3 = 0;
                                                }
                                                if (i5 <= i3 && nonForcedLoginRegionFlow != null && nonForcedLoginRegionFlow.enableFlow && (num2 = nonForcedLoginRegionFlow.singleAccountLoginType) != null) {
                                                    G3S g3s = G3S.ONE_CLICK_LOGIN;
                                                    G3T g3t = G3S.Companion;
                                                    int intValue = num2.intValue();
                                                    g3t.getClass();
                                                    if (g3s == G3T.LIZ(intValue)) {
                                                        LLIIIZ(true);
                                                    } else if (G3S.AUTO_LOGIN == G3T.LIZ(num2.intValue())) {
                                                        SmartLockService.createISmartLockServicebyMonsterPlugin(false).checkCredential(new G1E(this));
                                                    }
                                                }
                                            }
                                        }
                                        if (!Keva.getRepo("CDID_XP").getBoolean("did_save", false)) {
                                            this.LJLLI = new C35869E5x(this);
                                            IPluginService createIPluginServicebyMonsterPlugin = PluginService.createIPluginServicebyMonsterPlugin(false);
                                            EnumC35839E4t enumC35839E4t = EnumC35839E4t.CDID_TEST_DATA;
                                            C35869E5x c35869E5x = this.LJLLI;
                                            if (c35869E5x != null) {
                                                createIPluginServicebyMonsterPlugin.observe(enumC35839E4t, this, c35869E5x);
                                            } else {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        }
                                        if (LLII()) {
                                            SignupViewModel signupViewModel12 = this.LJLJLJ;
                                            if (signupViewModel12 != null) {
                                                if (!o.LJ(signupViewModel12.getEnterMethod(), "homepage_hot_proactive") && LLII()) {
                                                    C68517Qun.LJIILIIL();
                                                    SignupViewModel signupViewModel13 = this.LJLJLJ;
                                                    if (signupViewModel13 != null) {
                                                        String enterFrom4 = signupViewModel13.getEnterFrom();
                                                        MutableLiveData<EnumC68524Quu> mutableLiveData = C68517Qun.LIZLLL;
                                                        if (enterFrom4 == null) {
                                                            enterFrom4 = "";
                                                        }
                                                        mutableLiveData.observeForever(new C68548QvI(enterFrom4));
                                                        mutableLiveData.observe(this, new R5Z(this));
                                                    } else {
                                                        o.LJIJI("dependencies");
                                                        throw r8;
                                                    }
                                                }
                                            } else {
                                                o.LJIJI("dependencies");
                                                throw r8;
                                            }
                                        } else if (!LLIIIILZ()) {
                                            LLIIJLIL();
                                        }
                                        FFL.LJIIIZ().getClass();
                                        FFL.LJIIL(-1, false, "hybrid_test_experiment_int", 1);
                                        C85589XiT.LIZ.getClass();
                                        FFL LJIIIZ = FFL.LJIIIZ();
                                        C40888G2y c40888G2y = C85589XiT.LIZIZ;
                                        LJIIIZ.getClass();
                                        FFL.LJIJI(true, "hybrid_test_experiment_custom_2", 31744, C40888G2y.class, c40888G2y, 1);
                                        C85590XiU.LIZ.getClass();
                                        FFL LJIIIZ2 = FFL.LJIIIZ();
                                        C40888G2y c40888G2y2 = C85590XiU.LIZIZ;
                                        LJIIIZ2.getClass();
                                        FFL.LJIJI(true, "hybrid_test_experiment_custom_3", 31744, C40888G2y.class, c40888G2y2, 1);
                                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity", "onCreate", false);
                                        return;
                                    }
                                    o.LJIJI("dependencies");
                                    throw r8;
                                }
                                o.LJIJI("signupManager");
                                throw r8;
                            }
                            o.LJIJI("dependencies");
                            throw r8;
                        }
                        o.LJIJI("signupManager");
                        throw r8;
                    }
                    o.LJIJI("dependencies");
                    throw null;
                }
                o.LJIJI("dependencies");
                throw null;
            }
            o.LJIJI("dependencies");
            throw null;
        }
        o.LJIJI("dependencies");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && intent.getIntExtra("error_code", -1) == 1097) {
            C26227ARb c26227ARb = new C26227ARb(this);
            c26227ARb.LJ(R.string.bi8);
            c26227ARb.LIZ(R.string.bi6);
            UC0.LIZJ(c26227ARb, new AqS181S0100000_15(this, 20));
            c26227ARb.LJI().LIZLLL();
        }
    }

    @Override // X.R6A
    public final void LJJJLZIJ(boolean z, String str, String str2, String loginPanelType, Bundle data) {
        o.LJIIIZ(loginPanelType, "loginPanelType");
        o.LJIIIZ(data, "data");
        if (C2NU.LIZ.LIZIZ()) {
            LLIIJI(2211);
            data.putString("login_panel_type", loginPanelType);
            SignupViewModel signupViewModel = this.LJLJLJ;
            if (signupViewModel != null) {
                if (signupViewModel.nv0().getBoolean("is_multi_account", false) && AVK.LIZIZ()) {
                    data.putBoolean("is_multi_account_same_user", true);
                }
                if (z && a.LIZIZ().LJIILLIIL() && a.LIZIZ().LIZ()) {
                    SmartRoute LIZIZ = R67.LIZIZ(this);
                    data.putBoolean("age_gate_block", true);
                    LIZIZ.withParam(data);
                    this.LJLJJI = null;
                    this.LJLJJL = LIZIZ;
                    if (!LLFZ()) {
                        LIZIZ.open();
                    }
                } else {
                    this.LJLJJI = null;
                    this.LJLJJL = null;
                    this.LJLJJI = C68989R5t.LIZ(this, z, str, new C85583XiN(this, str2, loginPanelType, data));
                    if (!LLFZ()) {
                        C68989R5t.LIZIZ(this, this.LJLJJI);
                    }
                }
                LJJLIL("click_platform");
                return;
            }
            o.LJIJI("dependencies");
            throw null;
        }
        C5S1 c5s1 = new C5S1(this);
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }
}
