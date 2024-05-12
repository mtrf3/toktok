package com.ss.android.ugc.aweme.setting;

import X.AEB;
import X.AEG;
import X.AG6;
import X.ARI;
import X.AbstractC66965QPx;
import X.ActivityC86117Xqz;
import X.C03880Dg;
import X.C10I;
import X.C10K;
import X.C116724i4;
import X.C16880lQ;
import X.C188727au;
import X.C238249Wq;
import X.C244659iv;
import X.C25851ACp;
import X.C25860ACy;
import X.C26045AKb;
import X.C26227ARb;
import X.C2YJ;
import X.C31457CWf;
import X.C3AY;
import X.C58725N2z;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73969T1h;
import X.C74702wU;
import X.C77273UUj;
import X.C78975Uz5;
import X.C85780XlY;
import X.C85792Xlk;
import X.C85793Xll;
import X.C85990Xow;
import X.C9NE;
import X.DialogC254019y1;
import X.DialogC25756A8y;
import X.E7X;
import X.E7Y;
import X.EFJ;
import X.EnumC46490IMk;
import X.EnumC46491IMl;
import X.EnumC85643XjL;
import X.EnumC85784Xlc;
import X.EnumC85785Xld;
import X.EnumC85786Xle;
import X.EnumC85787Xlf;
import X.FMX;
import X.HG3;
import X.IMM;
import X.IMO;
import X.IMP;
import X.IMX;
import X.IS4;
import X.InterfaceC789838c;
import X.InterfaceC88472Yns;
import X.QD3;
import X.R41;
import X.RBX;
import X.RCY;
import X.SHU;
import X.T16;
import X.VL2;
import X.X1D;
import X.XJ5;
import X.XJ6;
import Y.AObjectS42S0101000_5;
import Y.ARunnableS11S0201000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS16S0201000_13;
import Y.ARunnableS16S0400000_13;
import Y.ARunnableS3S0220000_15;
import Y.AfS17S0001000_5;
import Y.AfS39S0101000_13;
import Y.IDRunnableS6S0101000;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.account.api.IChangeUnlinkAccountBindingsApi;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ExitUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ExitUnlinkPhoneEmailPopupEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ShowUnlinkPhoneEmailPopupEvent;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import com.ss.android.ugc.aweme.account.model.VerificationMethod;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.autofill.AdAutofillService;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.api.IUnbindValidateApi;
import com.ss.android.ugc.aweme.setting.api.RegionStatusApi;
import com.ss.android.ugc.aweme.setting.creatorverification.CreatorVerificationApi;
import com.ss.android.ugc.aweme.setting.model.DoBStatus;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.aweme.user.UserStore;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AqS1S1010000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import yq4.a;

/* loaded from: classes16.dex */
public class I18nSettingManageMyAccountActivity extends ActivityC86117Xqz implements WeakHandler.IHandler {
    public static final /* synthetic */ int LLIILZL = 0;
    public User LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public C73411SrX LJLL;
    public C25860ACy LJLLJ;
    public C25860ACy LJLLL;
    public C25860ACy LJLLLL;
    public C25860ACy LJLLLLLL;
    public C25860ACy LJLZ;
    public C25860ACy LJZ;
    public C25860ACy LJZI;
    public C25860ACy LJZL;
    public C25860ACy LL;
    public C25860ACy LLD;
    public DialogC25756A8y LLF;
    public SHU LLFF;
    public C78975Uz5 LLFFF;
    public WeakHandler LLFII;
    public C25851ACp LLI;
    public AEG LLIFFJFJJ;
    public AEG LLII;
    public C25860ACy LLIIII;
    public C25860ACy LLIIIILZ;
    public TuxIconView LLIIIJ;
    public TuxTextView LLIIIL;
    public String LLIIIZ;
    public final IAccountBindingsService LLIILII;
    public DoBStatus LJLJJI = new DoBStatus();
    public boolean LJLJJL = false;
    public boolean LJLJJLL = false;
    public boolean LJLJL = false;
    public String LJLJLJ = "";
    public String LJLJLLL = "";
    public long LJLLI = 0;
    public boolean LJLLILLLL = false;
    public final C73318Sq2 LLFZ = new C73318Sq2();
    public final Map<String, C25860ACy> LLIIJI = new HashMap();
    public final int LLIIJLIL = 52;
    public final int LLIIL = 41;

    public static void LLII(DialogC254019y1 dialogC254019y1) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/ies/dmt/ui/dialog/DmtStatusViewDialog", "show", dialogC254019y1, new Object[0], "void", new C65300Pk0(false, "()V", "4974362483774497951")).LIZ) {
            return;
        }
        dialogC254019y1.show();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LJIJ() {
        DialogC25756A8y dialogC25756A8y = this.LLF;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            this.LLF.dismiss();
        }
    }

    public final void LLIIJLIL() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "age_edit_page");
        c188727au.LJFF(this.LJLJJI.getType(), "user_age_status");
        FMX.LJIIL("click_manage_account_birthday_edit", c188727au.LIZ);
    }

    public final void LLILLJJLI() {
        User user = this.LJLIL;
        if (user != null && user.getBindPhone() != null) {
            String bindPhone = this.LJLIL.getBindPhone();
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZLLL(bindPhone);
            this.LJLLL.LJIILIIL(c116724i4.LIZ.toString());
        }
    }

    public final void LLJILJILJ() {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.gqr);
        c26045AKb.LJIIJ();
    }

    public final void LLJJJIL() {
        if (this.LLIIII == null) {
            return;
        }
        if (AdAutofillService.LJIIIIZZ().LJI()) {
            this.LLIIII.LJIILIIL(getString(R.string.dv0));
        } else {
            this.LLIIII.LJIILIIL("");
        }
    }

    public final void LLJJJJ() {
        if (this.LJLJJL) {
            this.LJLLLL.LJIIIZ(false);
            this.LJZL.LJIIIZ(false);
            this.LJZI.LJIIIZ(false);
            this.LJZ.LJIIIZ(false);
            if (this.LJLLLLLL != null && PasskeyService.LJFF().LIZJ()) {
                this.LJLLLLLL.LJIIIZ(false);
            }
        } else {
            this.LJLLL.LJIIIZ(false);
            this.LL.LJIIIZ(false);
            this.LLD.LJIIIZ(false);
            if (AdAutofillService.LJIIIIZZ().LIZ()) {
                AEG aeg = this.LLIFFJFJJ;
                if (aeg != null) {
                    aeg.LJIIIZ(false);
                }
                AEG aeg2 = this.LLII;
                if (aeg2 != null) {
                    aeg2.LJIIIZ(false);
                }
                C25860ACy c25860ACy = this.LLIIII;
                if (c25860ACy != null) {
                    c25860ACy.LJIIIZ(false);
                }
            }
        }
        this.LLI.LIZLLL();
    }

    public I18nSettingManageMyAccountActivity() {
        R41.LIZIZ.LJIIL();
        this.LLIILII = AccountBindingsService.LIZJ();
    }

    public final void LLILLL() {
        this.LJLIL = HG3.LJIILL().getCurUser();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        if (!this.LJLJJL) {
            a.LIZIZ().LJIL(null);
        }
        this.LLFFF.LIZ.LIZLLL();
        this.LLFF.LJFF.LIZLLL();
        EventBus.LIZJ().LJIJ(this);
        this.LLFII = null;
        this.LLFZ.dispose();
        C73411SrX c73411SrX = this.LJLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        CreatorVerificationApi creatorVerificationApi;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", true);
        super.onResume();
        ((RBX) HG3.LJIILL()).getSetPasswordStatus(new C85792Xlk(this));
        SHU shu = this.LLFF;
        boolean z = !this.LJLJJL;
        if (shu.LJ && z) {
            shu.LIZ("unknown");
            shu.LIZIZ.LJIIIZ(true);
            CreatorVerificationApi.LIZ.getClass();
            InterfaceC789838c create = C85793Xll.LIZIZ.create(C74702wU.LIZ);
            if (create != null) {
                creatorVerificationApi = (CreatorVerificationApi) create.create(CreatorVerificationApi.class);
            } else {
                creatorVerificationApi = null;
            }
            o.LJI(creatorVerificationApi);
            creatorVerificationApi.getVerificationStatus().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IS4(shu));
        } else {
            shu.LIZIZ.LJIIIZ(false);
        }
        LLJJJIL();
        if (this.LJLJI) {
            this.LJLJI = false;
            LLILLL();
            LLILLIZIL(this.LJLIL);
            LLILLJJLI();
            LLJJJJ();
        }
        if (!this.LJLJL && this.LJLJJL) {
            this.LJLLI = System.currentTimeMillis();
            RegionStatusApi.LIZ.getClass();
            this.LJLL = (C73411SrX) E7Y.LIZIZ.getRegionStatus().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS39S0101000_13(3, this, 2), new AfS17S0001000_5(1, 0));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", false);
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

    public static void LLIILII(boolean z) {
        VL2 exitMethod;
        ExitUnlinkPhoneEmailConfirmPageEvent exitUnlinkPhoneEmailConfirmPageEvent = new ExitUnlinkPhoneEmailConfirmPageEvent();
        exitUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC85785Xld.CHANGE);
        IMP isEmailVerified = IMP.NULL;
        o.LJIIIZ(isEmailVerified, "isEmailVerified");
        exitUnlinkPhoneEmailConfirmPageEvent.LIZLLL(isEmailVerified.getValue(), "is_email_verified");
        exitUnlinkPhoneEmailConfirmPageEvent.LJIIIZ(EnumC85786Xle.PHONE);
        if (z) {
            exitMethod = VL2.CLICK_CONTINUE;
        } else {
            exitMethod = VL2.GO_BACK;
        }
        o.LJIIIZ(exitMethod, "exitMethod");
        exitUnlinkPhoneEmailConfirmPageEvent.LIZLLL(exitMethod.getValue(), "exit_method");
        exitUnlinkPhoneEmailConfirmPageEvent.LJFF();
    }

    public final void LLFII(final boolean z) {
        XJ6 xj6;
        runOnUiThread(new IDRunnableS6S0101000(7, this, 31));
        if (z) {
            xj6 = XJ6.CHANGE_MOBILE;
        } else {
            xj6 = XJ6.CHANGE_EMAIL;
        }
        IChangeUnlinkAccountBindingsApi.LIZ.getClass();
        XJ5.LIZ(xj6).LJ(new C10I() { // from class: X.FRa
            @Override // X.C10I
            public final Object then(C10K c10k) {
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                boolean z2 = z;
                i18nSettingManageMyAccountActivity.getClass();
                if (!C82544WaS.LJ(c10k) || ((SafeEnvV2Response) c10k.LJIIJJI()).data == null || (((SafeEnvV2Response) c10k.LJIIJJI()).data.errorCode != 0 && ((SafeEnvV2Response) c10k.LJIIJJI()).data.errorCode != 2029)) {
                    i18nSettingManageMyAccountActivity.LLJILJILJ();
                } else {
                    SafeEnvData safeEnvData = ((SafeEnvV2Response) c10k.LJIIJJI()).data;
                    boolean LLIIJI = I18nSettingManageMyAccountActivity.LLIIJI(safeEnvData.twoStepVerifyWays, z2);
                    boolean z3 = safeEnvData.safe;
                    Bundle LIZJ = AnonymousClass036.LIZJ("enter_method", "normal", "page", "change_binding");
                    LIZJ.putBoolean("is_safe_env", z3);
                    LIZJ.putString("passport_ticket", safeEnvData.passportTicket);
                    ArrayList<VerificationMethodType> arrayList = new ArrayList<>();
                    List<VerificationMethod> list = safeEnvData.eligibleVerificationMethods;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
                        Iterator<VerificationMethod> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(it.next().type);
                        }
                        arrayList.addAll(arrayList2);
                    }
                    if (z3) {
                        if (LLIIJI) {
                            i18nSettingManageMyAccountActivity.LLILZ(z2, true, arrayList, LIZJ);
                        } else if (z2) {
                            i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS11S0201000_8(3, i18nSettingManageMyAccountActivity, LIZJ, 3));
                        } else {
                            i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS16S0201000_13(0, i18nSettingManageMyAccountActivity, LIZJ, 12));
                        }
                    } else if (LLIIJI) {
                        i18nSettingManageMyAccountActivity.LLILZ(z2, false, arrayList, LIZJ);
                    } else {
                        i18nSettingManageMyAccountActivity.LLJJJJJIL(z2, arrayList, LIZJ);
                    }
                }
                i18nSettingManageMyAccountActivity.runOnUiThread(new Q8V(6, i18nSettingManageMyAccountActivity));
                return null;
            }
        }, C10K.LJIIIIZZ, null);
    }

    public final void LLFZ(final boolean z) {
        XJ6 xj6;
        if (z) {
            xj6 = XJ6.UNBIND_MOBILE;
        } else {
            xj6 = XJ6.UNBIND_EMAIL;
        }
        runOnUiThread(new IDRunnableS6S0101000(7, this, 31));
        IChangeUnlinkAccountBindingsApi.LIZ.getClass();
        XJ5.LIZ(xj6).LJ(new C10I() { // from class: X.XlX
            @Override // X.C10I
            public final Object then(C10K c10k) {
                int i;
                boolean z2;
                List<VerificationMethod> list;
                int i2;
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                boolean z3 = z;
                i18nSettingManageMyAccountActivity.getClass();
                if (!C82544WaS.LJ(c10k) || ((SafeEnvV2Response) c10k.LJIIJJI()).data == null || (((SafeEnvV2Response) c10k.LJIIJJI()).data.errorCode != 0 && ((SafeEnvV2Response) c10k.LJIIJJI()).data.errorCode != 2029)) {
                    i18nSettingManageMyAccountActivity.LLJILJILJ();
                    i18nSettingManageMyAccountActivity.LLIL(z3, EnumC85784Xlc.UNLINK, IMX.UNKNOWN);
                } else {
                    i18nSettingManageMyAccountActivity.LJLJI = true;
                    SafeEnvData safeEnvData = ((SafeEnvV2Response) c10k.LJIIJJI()).data;
                    User LIZJ = UserStore.LIZJ(false);
                    if (LIZJ.isHasEmail() && z3) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (LIZJ.isPhoneBinded() && !z3) {
                        i++;
                    }
                    if (!C85631Xj9.LJ().isEmpty()) {
                        i++;
                    }
                    if (i > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z4 = safeEnvData.safe;
                    Bundle LIZJ2 = AnonymousClass036.LIZJ("enter_method", "normal", "page", "remove_binding");
                    LIZJ2.putBoolean("is_safe_env", z4);
                    if (safeEnvData.eligibleVerificationMethods != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<VerificationMethod> it = safeEnvData.eligibleVerificationMethods.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().type);
                        }
                        LIZJ2.putSerializable("eligible_verification_methods", arrayList);
                    }
                    LIZJ2.putString("passport_ticket", safeEnvData.passportTicket);
                    LIZJ2.putBoolean("is_2sv_env", I18nSettingManageMyAccountActivity.LLIIJI(safeEnvData.twoStepVerifyWays, z3));
                    if (!z4 ? !z2 || (list = safeEnvData.eligibleVerificationMethods) == null || list.isEmpty() : !z2) {
                        i18nSettingManageMyAccountActivity.LLIL(z3, EnumC85784Xlc.UNLINK, IMX.DIGITAL_3);
                        if (z3) {
                            i2 = R.string.c_b;
                        } else {
                            i2 = R.string.c__;
                        }
                        i18nSettingManageMyAccountActivity.showToast(i18nSettingManageMyAccountActivity.getString(i2));
                    } else {
                        i18nSettingManageMyAccountActivity.LLIL(z3, EnumC85784Xlc.UNLINK, IMX.DIGITAL_1);
                        if (z3) {
                            HG3.LJFF().unbindPhoneV2(i18nSettingManageMyAccountActivity, C85631Xj9.LIZJ(true), EnumC46491IMl.MANAGE_MY_ACCOUNT.getValue(), z4, LIZJ2);
                        } else {
                            HG3.LJFF().unbindEmailV2(i18nSettingManageMyAccountActivity, i18nSettingManageMyAccountActivity.LJLIL.isEmailVerified(), C85631Xj9.LIZJ(false), EnumC46491IMl.MANAGE_MY_ACCOUNT.getValue(), z4, LIZJ2);
                        }
                    }
                }
                i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS12S0101000_8(5, i18nSettingManageMyAccountActivity, 2));
                return null;
            }
        }, C10K.LJIIIIZZ, null);
    }

    public final String LLIIIILZ(String str) {
        try {
            return DateFormat.getDateInstance(1, new Locale(((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage(), C85990Xow.LIZ())).format(new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).parse(str));
        } catch (ParseException unused) {
            return getString(R.string.b9u);
        }
    }

    public final void LLILIL(boolean z) {
        IMM isEmailVerified;
        EnumC85643XjL unlinkType;
        ShowUnlinkPhoneEmailPopupEvent showUnlinkPhoneEmailPopupEvent = new ShowUnlinkPhoneEmailPopupEvent();
        if (z) {
            isEmailVerified = IMM.NULL;
        } else if (this.LJLIL.isEmailVerified()) {
            isEmailVerified = IMM.DIGITAL_1;
        } else {
            isEmailVerified = IMM.DIGITAL_0;
        }
        o.LJIIIZ(isEmailVerified, "isEmailVerified");
        showUnlinkPhoneEmailPopupEvent.LIZLLL(isEmailVerified.getValue(), "is_email_verified");
        EnumC46491IMl enterFrom = EnumC46491IMl.MANAGE_MY_ACCOUNT;
        o.LJIIIZ(enterFrom, "enterFrom");
        showUnlinkPhoneEmailPopupEvent.LIZLLL(enterFrom.getValue(), "enter_from");
        if (z) {
            unlinkType = EnumC85643XjL.PHONE;
        } else {
            unlinkType = EnumC85643XjL.EMAIL;
        }
        o.LJIIIZ(unlinkType, "unlinkType");
        showUnlinkPhoneEmailPopupEvent.LIZLLL(unlinkType.getValue(), "unlink_type");
        showUnlinkPhoneEmailPopupEvent.LJFF();
    }

    public final void LLILLIZIL(User user) {
        if (C2YJ.LIZIZ.LIZ.getEnableEmailVerification().intValue() != 1) {
            this.LL.LJIIIZ(false);
            return;
        }
        this.LL.LJIIIZ(true);
        String email = user.getEmail();
        if (TextUtils.isEmpty(email)) {
            this.LLIIIL.setText(email);
            C77273UUj.LIZLLL(this.LL, this.LLIIIL, null);
        } else if (user.isEmailVerified()) {
            this.LLIIIL.setText(email);
            C77273UUj.LIZLLL(this.LL, this.LLIIIL, null);
        } else {
            C77273UUj.LIZLLL(this.LL, this.LLIIIJ, getString(R.string.tg2, user.getEmail()));
        }
    }

    public final void LLJILLL(boolean z) {
        LLILLL();
        if (this.LJLIL == null) {
            return;
        }
        this.LJZI.LJIIIZ(false);
        this.LJZL.LJIIIZ(false);
        if (this.LJLIL.getAccountType() == 0 || z) {
            this.LJZL.LJIIIZ(true);
            return;
        }
        if (this.LJLIL.getAccountType() == 3) {
            this.LJZI.LJIIIZ(true);
        } else {
            if (this.LJLIL.getAccountType() != 2) {
                return;
            }
            this.LJZI.LJIIIZ(true);
            this.LJZL.LJIIIZ(true);
        }
    }

    public final void LLJJJ(boolean z) {
        DialogC254019y1 dialogC254019y1 = new DialogC254019y1(this);
        LLII(dialogC254019y1);
        IUnbindValidateApi.LIZ.getClass();
        IUnbindValidateApi iUnbindValidateApi = E7X.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EFJ.LIZJ);
        LIZ.append("/passport/email/unbind_validate/");
        String LIZLLL = AbstractC66965QPx.LIZLLL(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(LIZLLL, "getCsrfToken(CommonConst…SI + PATH_EMAIL_VALIDATE)");
        iUnbindValidateApi.unbindEmailValidate(LIZLLL).LJ(new C85780XlY(this, dialogC254019y1, z), C10K.LJIIIIZZ, null);
    }

    public void exit(View view) {
        finish();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 112) {
            Object obj = message.obj;
            if (!(obj instanceof User)) {
                return;
            }
            HG3.LJIILL().updateCurUser((User) obj);
            LLILLL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0360, code lost:
    
        if (r12.enable == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x022d, code lost:
    
        if (r0.enable == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x022f, code lost:
    
        r15.LLI.LIZ(X.C77273UUj.LIZ(getString(com.zhiliaoapp.musically.R.string.s85), new Y.ACListenerS22S0101000_3(1, r15, 12)));
     */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.onCreate(android.os.Bundle):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onSwitchBusinessAccountSuccessEvent(C9NE c9ne) {
        finish();
    }

    public final void showToast(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    public static boolean LLIIJI(List list, boolean z) {
        String str;
        if (list == null) {
            return false;
        }
        if (z) {
            str = "mobile_sms_verify";
        } else {
            str = "email_verify";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TwoStepVerifyWays twoStepVerifyWays = (TwoStepVerifyWays) it.next();
            if (Objects.equals(twoStepVerifyWays.getVerify_way(), str) && Boolean.TRUE.equals(twoStepVerifyWays.isAvailable())) {
                return true;
            }
        }
        return false;
    }

    public final String LLIIIZ(int i, boolean z) {
        if (i != 2031) {
            if (i != 2050) {
                return getString(R.string.gqr);
            }
            if (z) {
                return getString(R.string.tfc);
            }
            return getString(R.string.tep);
        }
        if (z) {
            return getString(R.string.tfb);
        }
        return getString(R.string.ten);
    }

    public final void LLIZLLLIL(String str, boolean z) {
        int i;
        int i2;
        LLILIL(false);
        ARI ari = new ARI(this);
        ari.LJI = true;
        if (z) {
            ari.LJI(R.string.tf6, new C31457CWf(3, this));
            ari.LJI(R.string.tf9, new AObjectS42S0101000_5(2, this, 39));
            i = R.string.tf8;
        } else {
            ari.LJI(R.string.tf5, new AObjectS42S0101000_5(2, this, 42));
            ari.LJIIIIZZ(R.string.tf0, new AObjectS42S0101000_5(2, this, 43));
            ari.LJIIIIZZ(R.string.tf4, new AObjectS42S0101000_5(2, this, 14));
            i = R.string.tf3;
        }
        String string = getString(i, i0.LJFF("\n", str));
        if (z) {
            i2 = R.string.tf7;
        } else {
            i2 = R.string.tf1;
        }
        String string2 = getString(i2);
        C26227ARb c26227ARb = new C26227ARb(this);
        c26227ARb.LJFF(string);
        c26227ARb.LIZIZ(string2);
        c26227ARb.LJIIL = ari;
        c26227ARb.LJIIIZ = new C244659iv(this, R.raw.icon_envelope, Integer.valueOf(R.attr.go), 0);
        c26227ARb.LJIIIIZZ = !this.LLIILII.LIZ();
        c26227ARb.LJII = this.LLIILII.LIZ();
        c26227ARb.LIZJ(new AObjectS42S0101000_5(2, this, 45));
        if (!z) {
            TuxTextView tuxTextView = new TuxTextView(this);
            tuxTextView.setText(getString(R.string.tf2));
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColorRes(R.attr.gu);
            tuxTextView.setGravity(17);
            c26227ARb.LJIIJJI = new C238249Wq(tuxTextView);
        }
        c26227ARb.LJI().LIZLLL();
    }

    public final void LLJJIJIIJIL(int i, int i2) {
        ARI ari = new ARI(this);
        ari.LJII(getResources().getString(i2), new InterfaceC88472Yns() { // from class: X.9ho
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                final I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                final ARN arn = (ARN) obj;
                i18nSettingManageMyAccountActivity.getClass();
                HG3.LJIIL();
                HG3.LJLJL.LJIIIIZZ().switchProAccount(0, null, null, 0, new R47() { // from class: X.AXQ
                    @Override // X.R47
                    public final void onResult(int i3, int i4, Object obj2) {
                        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = I18nSettingManageMyAccountActivity.this;
                        ARN arn2 = arn;
                        i18nSettingManageMyAccountActivity2.getClass();
                        if (i3 == 14 && i4 == 1) {
                            ((RBX) HG3.LJIILL()).queryUser();
                            a.LJIILIIL().LIZ();
                            a.LJIILIIL().LJ();
                            i18nSettingManageMyAccountActivity2.LLJILLL(true);
                            C26045AKb c26045AKb = new C26045AKb(i18nSettingManageMyAccountActivity2);
                            c26045AKb.LJIIIZ(i18nSettingManageMyAccountActivity2.getResources().getString(R.string.rzc));
                            c26045AKb.LJIIJ();
                            SettingManagerServiceImpl.LIZJ().LIZ(1);
                            FMX.LJIIL("switch_to_personal_account_success", new HashMap());
                        } else {
                            C5S1 c5s1 = new C5S1(i18nSettingManageMyAccountActivity2);
                            c5s1.LIZJ(R.string.imh);
                            c5s1.LJ();
                        }
                        arn2.LIZ().LIZIZ(null);
                    }
                });
                return C76800UCe.LIZ;
            }
        });
        String text = getResources().getString(R.string.cg_);
        o.LJIIIZ(text, "text");
        ari.LJIIIZ(text, null);
        ari.LJI = true;
        C26227ARb c26227ARb = new C26227ARb(this);
        c26227ARb.LJ(R.string.slc);
        c26227ARb.LIZ(i);
        c26227ARb.LJIIL = ari;
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
    }

    public final AEG LLIIIJ(CharSequence text, CharSequence charSequence, Boolean bool) {
        boolean z = !bool.booleanValue();
        Integer valueOf = Integer.valueOf(this.LLIIJLIL);
        Integer valueOf2 = Integer.valueOf(this.LLIIL);
        o.LJIIIZ(text, "text");
        return new AEG(new AEB(text, z, true, false, false, charSequence, valueOf, valueOf2, null, null, null, 15360));
    }

    public final void LLIL(boolean z, EnumC85784Xlc exitMethod, IMX imx) {
        EnumC85787Xlf unlinkType;
        IMO isEmailVerified;
        ExitUnlinkPhoneEmailPopupEvent exitUnlinkPhoneEmailPopupEvent = new ExitUnlinkPhoneEmailPopupEvent();
        if (z) {
            unlinkType = EnumC85787Xlf.PHONE;
        } else {
            unlinkType = EnumC85787Xlf.EMAIL;
        }
        o.LJIIIZ(unlinkType, "unlinkType");
        exitUnlinkPhoneEmailPopupEvent.LIZLLL(unlinkType.getValue(), "unlink_type");
        o.LJIIIZ(exitMethod, "exitMethod");
        exitUnlinkPhoneEmailPopupEvent.LIZLLL(exitMethod.getValue(), "exit_method");
        if (z) {
            isEmailVerified = IMO.NULL;
        } else if (this.LJLIL.isEmailVerified()) {
            isEmailVerified = IMO.DIGITAL_1;
        } else {
            isEmailVerified = IMO.DIGITAL_0;
        }
        o.LJIIIZ(isEmailVerified, "isEmailVerified");
        exitUnlinkPhoneEmailPopupEvent.LIZLLL(isEmailVerified.getValue(), "is_email_verified");
        EnumC46490IMk enterFrom = EnumC46490IMk.MANAGE_MY_ACCOUNT;
        o.LJIIIZ(enterFrom, "enterFrom");
        exitUnlinkPhoneEmailPopupEvent.LIZLLL(enterFrom.getValue(), "enter_from");
        if (imx != null) {
            exitUnlinkPhoneEmailPopupEvent.LIZLLL(imx.getValue(), "unlink_eligible_status");
        }
        exitUnlinkPhoneEmailPopupEvent.LJFF();
    }

    public final void LLJJJJJIL(boolean z, final ArrayList<VerificationMethodType> arrayList, final Bundle bundle) {
        boolean z2 = !arrayList.isEmpty();
        if (z) {
            if (z2) {
                VerificationMethodType verificationMethodType = VerificationMethodType.MOBILE;
                if (arrayList.contains(verificationMethodType)) {
                    runOnUiThread(new ARunnableS16S0400000_13(this, bundle, arrayList, verificationMethodType, 12));
                    return;
                } else {
                    runOnUiThread(new ARunnableS16S0400000_13(this, bundle, arrayList, (VerificationMethodType) ListProtector.get(arrayList, 0), 12));
                    return;
                }
            }
            showToast(getString(R.string.c_6));
            return;
        }
        if (z2) {
            final VerificationMethodType verificationMethodType2 = VerificationMethodType.EMAIL;
            if (arrayList.contains(verificationMethodType2)) {
                runOnUiThread(new Runnable() { // from class: X.V1r
                    @Override // java.lang.Runnable
                    public final void run() {
                        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                        Bundle bundle2 = bundle;
                        ArrayList arrayList2 = arrayList;
                        VerificationMethodType verificationMethodType3 = verificationMethodType2;
                        i18nSettingManageMyAccountActivity.LJLJI = true;
                        i18nSettingManageMyAccountActivity.LJIJ();
                        if (i18nSettingManageMyAccountActivity.LJLIL.isEmailVerified()) {
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("status", "verified");
                            FMX.LJIIL("enter_email_setting", c188727au.LIZ);
                            if (i18nSettingManageMyAccountActivity.LJLJJL && i18nSettingManageMyAccountActivity.LJLJJLL) {
                                bundle2.putString("page", "prompt_user_confirm");
                                bundle2.putString("enter_from", i18nSettingManageMyAccountActivity.LLIIIZ);
                                bundle2.putString("enter_method", "normal");
                                bundle2.putBoolean("is_from_prompt", true);
                            }
                        }
                        bundle2.putSerializable("eligible_verification_methods", new ArrayList());
                        bundle2.putInt("email_source", V86.DYABindEmailSourceTypeAccountManagementEmail.getValue());
                        bundle2.putSerializable("eligible_verification_methods", arrayList2);
                        String value = EnumC46491IMl.MANAGE_MY_ACCOUNT.getValue();
                        int i = C85700XkG.LIZ[verificationMethodType3.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    HG3.LJFF().changeEmailVerifyByPassword(i18nSettingManageMyAccountActivity, value, bundle2, null);
                                    return;
                                }
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Unknown verification method [");
                                LIZ.append(verificationMethodType3);
                                LIZ.append("]");
                                throw new IllegalStateException(X1D.LIZIZ(LIZ));
                            }
                            HG3.LJFF().changeEmail(i18nSettingManageMyAccountActivity, value, bundle2, null);
                            return;
                        }
                        HG3.LJFF().changeEmailVerifyByPhone(i18nSettingManageMyAccountActivity, value, bundle2, null);
                    }
                });
                return;
            } else {
                final VerificationMethodType verificationMethodType3 = (VerificationMethodType) ListProtector.get(arrayList, 0);
                runOnUiThread(new Runnable() { // from class: X.V1r
                    @Override // java.lang.Runnable
                    public final void run() {
                        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                        Bundle bundle2 = bundle;
                        ArrayList arrayList2 = arrayList;
                        VerificationMethodType verificationMethodType32 = verificationMethodType3;
                        i18nSettingManageMyAccountActivity.LJLJI = true;
                        i18nSettingManageMyAccountActivity.LJIJ();
                        if (i18nSettingManageMyAccountActivity.LJLIL.isEmailVerified()) {
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("status", "verified");
                            FMX.LJIIL("enter_email_setting", c188727au.LIZ);
                            if (i18nSettingManageMyAccountActivity.LJLJJL && i18nSettingManageMyAccountActivity.LJLJJLL) {
                                bundle2.putString("page", "prompt_user_confirm");
                                bundle2.putString("enter_from", i18nSettingManageMyAccountActivity.LLIIIZ);
                                bundle2.putString("enter_method", "normal");
                                bundle2.putBoolean("is_from_prompt", true);
                            }
                        }
                        bundle2.putSerializable("eligible_verification_methods", new ArrayList());
                        bundle2.putInt("email_source", V86.DYABindEmailSourceTypeAccountManagementEmail.getValue());
                        bundle2.putSerializable("eligible_verification_methods", arrayList2);
                        String value = EnumC46491IMl.MANAGE_MY_ACCOUNT.getValue();
                        int i = C85700XkG.LIZ[verificationMethodType32.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    HG3.LJFF().changeEmailVerifyByPassword(i18nSettingManageMyAccountActivity, value, bundle2, null);
                                    return;
                                }
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Unknown verification method [");
                                LIZ.append(verificationMethodType32);
                                LIZ.append("]");
                                throw new IllegalStateException(X1D.LIZIZ(LIZ));
                            }
                            HG3.LJFF().changeEmail(i18nSettingManageMyAccountActivity, value, bundle2, null);
                            return;
                        }
                        HG3.LJFF().changeEmailVerifyByPhone(i18nSettingManageMyAccountActivity, value, bundle2, null);
                    }
                });
                return;
            }
        }
        showToast(getString(R.string.c_0));
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        User curUser;
        RCY rcy;
        if (i != 1) {
            if (i != 10) {
                return;
            }
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "platform");
            if (TextUtils.isEmpty(LLJJIJIIJIL)) {
                return;
            }
            String LIZJ = C77273UUj.LIZJ(LLJJIJIIJIL);
            int intExtra = intent.getIntExtra("error_code", 0);
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "description");
            if (i2 != -1) {
                if (intExtra == 1030) {
                    C3AY.LIZ(this, getString(R.string.s81), getString(R.string.s7z), getString(R.string.s80), null, null);
                    return;
                }
                if (TextUtils.isEmpty(LLJJIJIIJIL2)) {
                    LLJJIJIIJIL2 = getString(R.string.s82, LIZJ);
                }
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIZ(LLJJIJIIJIL2);
                c26045AKb.LJIIJ();
                return;
            }
            String string = getString(R.string.s83, LIZJ);
            C26045AKb c26045AKb2 = new C26045AKb(this);
            c26045AKb2.LJIIIZ(string);
            c26045AKb2.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb2.LJII(R.attr.e8);
            c26045AKb2.LJIIJ();
            AG6 ag6 = (AG6) ((HashMap) this.LLIIJI).get(LLJJIJIIJIL);
            if (ag6 == null || (rcy = R41.LIZIZ().getBoundSocialPlatforms().get(LLJJIJIIJIL)) == null) {
                return;
            }
            ag6.LJIIJ(new AqS1S1010000_4(rcy.LIZJ, true, 2));
            return;
        }
        if (i2 != 2 || intent.getIntExtra("bind_email_result", -1) != 1 || (curUser = ((RBX) HG3.LJIILL()).getCurUser()) == null) {
            return;
        }
        C26045AKb c26045AKb3 = new C26045AKb(this);
        c26045AKb3.LJIIIZ(getString(R.string.mk, curUser.getEmail()));
        c26045AKb3.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb3.LJII(R.attr.e8);
        c26045AKb3.LJIIJ();
    }

    public final void LLILZ(final boolean z, final boolean z2, final ArrayList<VerificationMethodType> arrayList, final Bundle bundle) {
        ARI ari = new ARI(this);
        ari.LJII(getString(R.string.c_5), new InterfaceC88472Yns() { // from class: X.XlZ
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                VL1 vl1;
                EnumC85786Xle enumC85786Xle;
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                boolean z3 = z2;
                boolean z4 = z;
                ArrayList<VerificationMethodType> arrayList2 = arrayList;
                Bundle bundle2 = bundle;
                if (!z3) {
                    i18nSettingManageMyAccountActivity.LLJJJJJIL(z4, arrayList2, bundle2);
                } else {
                    if (z4) {
                        i18nSettingManageMyAccountActivity.getClass();
                        i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS11S0201000_8(3, i18nSettingManageMyAccountActivity, bundle2, 3));
                    } else {
                        i18nSettingManageMyAccountActivity.getClass();
                        i18nSettingManageMyAccountActivity.runOnUiThread(new ARunnableS16S0201000_13(0, i18nSettingManageMyAccountActivity, bundle2, 12));
                    }
                    i18nSettingManageMyAccountActivity.LJIJ();
                }
                ExitUnlinkPhoneEmailConfirmPageEvent exitUnlinkPhoneEmailConfirmPageEvent = new ExitUnlinkPhoneEmailConfirmPageEvent();
                if (z3) {
                    vl1 = VL1.YES;
                } else {
                    vl1 = VL1.NO;
                }
                exitUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ(vl1);
                if (z4) {
                    enumC85786Xle = EnumC85786Xle.PHONE;
                } else {
                    enumC85786Xle = EnumC85786Xle.EMAIL;
                }
                exitUnlinkPhoneEmailConfirmPageEvent.LJIIIZ(enumC85786Xle);
                exitUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC85785Xld.CHANGE);
                exitUnlinkPhoneEmailConfirmPageEvent.LJII(IMQ.DIGITAL_1);
                VL2 exitMethod = VL2.CLICK_CONTINUE;
                o.LJIIIZ(exitMethod, "exitMethod");
                exitUnlinkPhoneEmailConfirmPageEvent.LIZLLL(exitMethod.getValue(), "exit_method");
                exitUnlinkPhoneEmailConfirmPageEvent.LJFF();
                return C76800UCe.LIZ;
            }
        });
        ari.LJIIIIZZ(R.string.c_4, null);
        runOnUiThread(new ARunnableS3S0220000_15(this, z, ari, z2, 1));
    }
}
