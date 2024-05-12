package X;

import Y.IDCListenerS202S0100000_1;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.4Ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107384Ji implements InterfaceC97703sU {
    public final ActivityStatusViewModelImpl LIZ;
    public final InterfaceC65784Pro<Keva> LIZIZ;
    public final AnonymousClass453 LIZJ;
    public final IAccountService LIZLLL;
    public final IAccountUserService LJ;
    public final IPrivacyService LJFF;
    public final IIMUnder16Proxy LJI;
    public final InterfaceC65784Pro<Boolean> LJII;
    public final C73318Sq2 LJIIIIZZ;
    public final AbstractC73946T0k LJIIIZ;
    public final AbstractC73946T0k LJIIJ;
    public final C73849Syb<C76800UCe> LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public long LJIILJJIL;
    public final C107004Hw LJIILL;
    public boolean LJIILLIIL;
    public final MutableLiveData<Boolean> LJIIZILJ;

    @Override // X.InterfaceC97703sU
    public final void LIZIZ() {
        this.LJIILLIIL = true;
    }

    @Override // X.InterfaceC97703sU
    public final boolean LJ() {
        return this.LIZIZ.invoke().getBoolean("has_permission_sheet_shown", false);
    }

    public final boolean LJFF() {
        boolean z = true;
        if (((Boolean) C107504Ju.LIZ.getValue()).booleanValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.LJIILJJIL > ((Number) C107524Jw.LIZ.getValue()).longValue()) {
                if (!LJI() || !LJII()) {
                    z = false;
                }
                this.LJIILIIL = z;
                this.LJIILJJIL = currentTimeMillis;
            }
            return this.LJIILIIL;
        }
        try {
            if (LJI()) {
                if (LJII()) {
                    return true;
                }
                "user has opted out of sharing".toString();
                throw new IllegalArgumentException("user has opted out of sharing");
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        } catch (Exception e) {
            AnonymousClass453 anonymousClass453 = this.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prerequisite failed ");
            LIZ.append(e.getMessage());
            anonymousClass453.i(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public final boolean LJI() {
        PrivacySettingsRestrictionItem LIZJ;
        IPrivacyService iPrivacyService;
        PrivacySettingsRestrictionItem LIZJ2;
        boolean z = false;
        if (((Boolean) C107504Ju.LIZ.getValue()).booleanValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.LJIILJJIL > ((Number) C107524Jw.LIZ.getValue()).longValue()) {
                IAccountUserService iAccountUserService = this.LJ;
                if (iAccountUserService != null && iAccountUserService.isLogin() && !this.LJI.LIZIZ() && (iPrivacyService = this.LJFF) != null && (LIZJ2 = iPrivacyService.LIZJ(0, "activity_status")) != null && LIZJ2.getShowType() == 0 && this.LJII.invoke().booleanValue()) {
                    z = true;
                }
                this.LJIIL = z;
                this.LJIILJJIL = currentTimeMillis;
            }
            return this.LJIIL;
        }
        try {
            IAccountUserService iAccountUserService2 = this.LJ;
            if (iAccountUserService2 != null && iAccountUserService2.isLogin()) {
                if (!this.LJI.LIZIZ()) {
                    IPrivacyService iPrivacyService2 = this.LJFF;
                    if (iPrivacyService2 != null && (LIZJ = iPrivacyService2.LIZJ(0, "activity_status")) != null && LIZJ.getShowType() == 0) {
                        if (this.LJII.invoke().booleanValue()) {
                            return true;
                        }
                        "feature is not turned on".toString();
                        throw new IllegalArgumentException("feature is not turned on");
                    }
                    "user is restricted".toString();
                    throw new IllegalArgumentException("user is restricted");
                }
                "user have no im function".toString();
                throw new IllegalArgumentException("user have no im function");
            }
            "no active logged in account".toString();
            throw new IllegalArgumentException("no active logged in account");
        } catch (Exception e) {
            AnonymousClass453 anonymousClass453 = this.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prerequisite failed ");
            LIZ.append(e.getMessage());
            anonymousClass453.i(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public final boolean LJII() {
        PrivacyUserSettingsV2 privacyUserSettings;
        Integer M;
        IPrivacyService iPrivacyService = this.LJFF;
        if (iPrivacyService == null || (privacyUserSettings = iPrivacyService.getPrivacyUserSettings()) == null || (M = privacyUserSettings.M("activity_status")) == null || M.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final void LJIIIIZZ() {
        this.LIZIZ.invoke().storeBoolean("has_permission_sheet_shown", true);
    }

    @Override // X.InterfaceC97703sU
    public final boolean LIZ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC97703sU
    public final MutableLiveData<Boolean> LIZJ() {
        return this.LJIIZILJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.4Hw, X.LEA] */
    public C107384Ji(ActivityStatusViewModelImpl viewmodel) {
        RBY rby;
        C2WF getRepo = C2WF.LJLIL;
        PO8 po8 = new PO8("ActivityStatusPrivacySettingsImpl");
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != 0) {
            rby = LJIJ.LJFF();
        } else {
            rby = null;
        }
        IPrivacyService LJIIIIZZ = PrivacyServiceImpl.LJIIIIZZ();
        IIMUnder16Proxy LJJIJ = C78966Uyw.LJJIJ();
        o.LJIIIIZZ(LJJIJ, "getUnder16Proxy()");
        final C107454Jp c107454Jp = C107454Jp.LIZ;
        TBR tbr = new TBR(c107454Jp) { // from class: X.4Jo
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return Boolean.valueOf(C107454Jp.LIZ());
            }
        };
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        AbstractC73946T0k LIZ = T16.LIZ();
        o.LJIIIIZZ(LIZ, "io()");
        AbstractC73946T0k LIZIZ = C73969T1h.LIZIZ();
        C73849Syb<C76800UCe> c73849Syb = new C73849Syb<>();
        o.LJIIIZ(viewmodel, "viewmodel");
        o.LJIIIZ(getRepo, "getRepo");
        this.LIZ = viewmodel;
        this.LIZIZ = getRepo;
        this.LIZJ = po8;
        this.LIZLLL = LJIJ;
        this.LJ = rby;
        this.LJFF = LJIIIIZZ;
        this.LJI = LJJIJ;
        this.LJII = tbr;
        this.LJIIIIZZ = c73318Sq2;
        this.LJIIIZ = LIZ;
        this.LJIIJ = LIZIZ;
        this.LJIIJJI = c73849Syb;
        this.LJIILJJIL = -1L;
        ?? r0 = new LEA() { // from class: X.4Hw
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (!z) {
                    return;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C107384Ji.this.LIZ.LJIILLIIL();
                            C107384Ji.this.LIZ.LJ();
                        }
                    } else {
                        C107384Ji.this.LIZ.LJIILLIIL();
                        final C107384Ji c107384Ji = C107384Ji.this;
                        IAccountService iAccountService = c107384Ji.LIZLLL;
                        if (iAccountService != null) {
                            final String curUserId = iAccountService.LJFF().getCurUserId();
                            C4IE c4ie = C4IE.LIZ;
                            C4IH c4ih = new C4IH() { // from class: X.4Hx
                                @Override // X.C4IH
                                public final void LIZ() {
                                    C4IE c4ie2 = C4IE.LIZ;
                                    String uid = curUserId;
                                    o.LJIIIIZZ(uid, "uid");
                                    c4ie2.getClass();
                                    CopyOnWriteArrayList<C4IH> copyOnWriteArrayList = C4IE.LIZLLL.get(uid);
                                    if (copyOnWriteArrayList != null) {
                                        copyOnWriteArrayList.remove(this);
                                    }
                                    c107384Ji.LIZ.LJIILIIL(false);
                                }
                            };
                            c4ie.getClass();
                            C4IE.LIZ(curUserId, c4ih);
                        }
                        ActivityStatusViewModelImpl activityStatusViewModelImpl = C107384Ji.this.LIZ;
                        activityStatusViewModelImpl.getClass();
                        C106844Hg.LIZ("onAccountSwitch");
                        C3B3.LIZJ(activityStatusViewModelImpl, "switch_account", 3000L, 4);
                        C31Q.LJIILLIIL.LJI().LJII = false;
                        if (activityStatusViewModelImpl.LJZ == null) {
                            activityStatusViewModelImpl.LJIILIIL(true);
                        }
                    }
                } else {
                    final C107384Ji c107384Ji2 = C107384Ji.this;
                    IAccountService iAccountService2 = c107384Ji2.LIZLLL;
                    if (iAccountService2 != null) {
                        final String curUserId2 = iAccountService2.LJFF().getCurUserId();
                        C4IE c4ie2 = C4IE.LIZ;
                        C4IH c4ih2 = new C4IH() { // from class: X.4Hx
                            @Override // X.C4IH
                            public final void LIZ() {
                                C4IE c4ie22 = C4IE.LIZ;
                                String uid = curUserId2;
                                o.LJIIIIZZ(uid, "uid");
                                c4ie22.getClass();
                                CopyOnWriteArrayList<C4IH> copyOnWriteArrayList = C4IE.LIZLLL.get(uid);
                                if (copyOnWriteArrayList != null) {
                                    copyOnWriteArrayList.remove(this);
                                }
                                c107384Ji2.LIZ.LJIILIIL(false);
                            }
                        };
                        c4ie2.getClass();
                        C4IE.LIZ(curUserId2, c4ih2);
                    }
                    ActivityStatusViewModelImpl activityStatusViewModelImpl2 = C107384Ji.this.LIZ;
                    activityStatusViewModelImpl2.getClass();
                    C106844Hg.LIZ("onLogin");
                    C3B3.LIZJ(activityStatusViewModelImpl2, "switch_account", 3000L, 4);
                    C31Q.LJIILLIIL.LJI().LJII = false;
                    if (activityStatusViewModelImpl2.LJZ == null) {
                        activityStatusViewModelImpl2.LJIILIIL(true);
                    }
                }
                C107384Ji.this.LJIILJJIL = -1L;
            }
        };
        this.LJIILL = r0;
        if (LJIJ != 0) {
            LJIJ.LJIILJJIL(r0);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJIIZILJ = new MutableLiveData<>(Boolean.FALSE);
    }

    public final void LJIIIZ(boolean z) {
        InterfaceC101453yX LJFF;
        IPrivacyService iPrivacyService = this.LJFF;
        if (iPrivacyService == null || (LJFF = iPrivacyService.LJFF()) == null) {
            return;
        }
        int i = 1;
        if (!z) {
            i = 2;
        }
        this.LJIIIIZZ.LIZLLL();
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(LJFF.LIZJ(i).LJJL(this.LJIIIZ).LJJJ(this.LJIIJ), new AqS167S0100000_1(this, 506), new AqS151S0100000_1(this, 1049), null, 4), this.LJIIIIZZ);
    }

    @QD3
    public final void handlePrivacySettingChangeEvent(C79723Ay event) {
        o.LJIIIZ(event, "event");
        if (((Boolean) C107504Ju.LIZ.getValue()).booleanValue()) {
            this.LJIILJJIL = -1L;
        }
    }

    @Override // X.InterfaceC97703sU
    public final void LIZLLL(ActivityC45651qj activityC45651qj, AqS175S0100000_9 onDismiss) {
        o.LJIIIZ(onDismiss, "onDismiss");
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(onDismiss, 507);
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        C107404Jk c107404Jk = new C107404Jk(activityC45651qj, supportFragmentManager);
        SY4 sy4 = c107404Jk.LJII;
        if (sy4 != null) {
            sy4.setVisibility(8);
            c107404Jk.LJIIIZ = aqS167S0100000_1;
            boolean LJII = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJII();
            c107404Jk.LIZJ(LJII);
            ARV arv = c107404Jk.LIZLLL;
            if (arv != null) {
                arv.setChecked(LJII);
                c107404Jk.LJIIJJI = LJII;
                ARV arv2 = c107404Jk.LIZLLL;
                if (arv2 != null) {
                    arv2.setOnCheckedChangeListener(new IDCListenerS202S0100000_1(c107404Jk, 2));
                    TuxSheet LIZ = c107404Jk.LIZ();
                    c107404Jk.LIZIZ = LIZ;
                    if (supportFragmentManager != null) {
                        LIZ.show(supportFragmentManager, "");
                    }
                    IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LJI(EnumC107414Jl.INBOX_TITLE);
                    return;
                }
                o.LJIJI("switch");
                throw null;
            }
            o.LJIJI("switch");
            throw null;
        }
        o.LJIJI("buttonSave");
        throw null;
    }

    public final void LJIIJ(ActivityC45651qj activityC45651qj, InboxFragment popupScene, AqS175S0100000_9 onDismiss) {
        o.LJIIIZ(popupScene, "popupScene");
        o.LJIIIZ(onDismiss, "onDismiss");
        PopupManager.LJIIL(new C107394Jj(activityC45651qj, popupScene, new AqS167S0100000_1(onDismiss, 508)));
    }
}
