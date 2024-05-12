package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel;

import X.AbstractC97583sI;
import X.AnonymousClass315;
import X.C107384Ji;
import X.C113554cx;
import X.C162476Zf;
import X.C30U;
import X.C34B;
import X.C3SC;
import X.C47261Igj;
import X.C48841JEv;
import X.C64962gm;
import X.C65992iR;
import X.C70372pV;
import X.C76800UCe;
import X.C772831o;
import X.C78613UtF;
import X.C80743Ew;
import X.C80993Fv;
import X.C85323Wm;
import X.C97623sM;
import X.C97653sP;
import X.C97723sW;
import X.C97733sX;
import X.C97843si;
import X.EXV;
import X.EnumC101483ya;
import X.EnumC101493yb;
import X.EnumC97613sL;
import X.EnumC97633sN;
import X.HG3;
import X.InterfaceC101673yt;
import X.InterfaceC101763z2;
import X.InterfaceC75532xp;
import X.InterfaceC88471Ynr;
import X.InterfaceC97703sU;
import X.InterfaceC97743sY;
import X.InterfaceC97753sZ;
import X.ORZ;
import X.OSZ;
import X.RBX;
import X.T2R;
import X.X1D;
import X.XIA;
import X.XIF;
import X.XKW;
import X.XKX;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.CleanUpPushPermissionConfig;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AppStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticePushStatus;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import djb.IDaS20S0000000_1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public class SessionListTopNoticeViewModel extends ViewModel {
    public static final C3SC LL = new Object() { // from class: X.3SC
    };
    public static final List<String> LLD = new ArrayList();
    public final String LJLIL;
    public final TikTokImApi LJLILLLLZI;
    public final InterfaceC75532xp LJLJI;
    public final C80993Fv LJLJJI;
    public final XKW LJLJJL;
    public final InterfaceC97703sU LJLJJLL;
    public final InterfaceC88471Ynr<EnumC101483ya, InterfaceC101673yt, C76800UCe> LJLJL;
    public final InterfaceC88471Ynr<EnumC101493yb, InterfaceC101763z2, C76800UCe> LJLJLJ;
    public final InterfaceC97743sY LJLJLLL;
    public final MutableLiveData<C70372pV<C76800UCe>> LJLL;
    public final MutableLiveData LJLLI;
    public final MutableLiveData<C70372pV<C76800UCe>> LJLLILLLL;
    public final MutableLiveData LJLLJ;
    public List<String> LJLLL;
    public int LJLLLL;
    public final MutableLiveData<EnumC97613sL> LJLLLLLL;
    public final MutableLiveData LJLZ;
    public final C64962gm LJZ;
    public final IDaS20S0000000_1 LJZI;
    public final IDaS20S0000000_1 LJZL;

    public SessionListTopNoticeViewModel() {
        this(null, null, null, 1023);
    }

    public final void lv0() {
        synchronized (this) {
            if (this.LJLLLL >= ((ArrayList) this.LJLLL).size()) {
                this.LJLLLLLL.setValue(EnumC97613sL.EmptyTopNoticeView);
                return;
            }
            while (this.LJLLLL < ((ArrayList) this.LJLLL).size()) {
                List<String> list = this.LJLLL;
                int i = this.LJLLLL;
                this.LJLLLL = i + 1;
                EnumC97613sL mv0 = mv0((String) ORZ.LJLLLLLL(i, list));
                this.LJLLLLLL.setValue(mv0);
                if (mv0 != EnumC97613sL.EmptyTopNoticeView) {
                    break;
                }
            }
        }
    }

    public final void gv0() {
        if (((CleanUpPushPermissionConfig) C97843si.LIZIZ.getValue()).group != 5 && C97843si.LIZ() && this.LJLLLLLL.getValue() == EnumC97613sL.TurnOnNotificationView) {
            kv0("inbox");
            this.LJLLLLLL.setValue(EnumC97613sL.EmptyTopNoticeView);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C48841JEv.LIZJ(this.LJZ, null);
    }

    public static boolean jv0(String str) {
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(EnumC97613sL.DM_TURN_ON_PERMISSION_EVERYONE.getNoticeCode(), EnumC97613sL.DM_TURN_ON_PERMISSION_EVERYONE_CREATOR.getNoticeCode(), EnumC97613sL.DM_TURN_ON_PERMISSION_FRIENDS.getNoticeCode(), EnumC97613sL.DM_TURN_ON_PERMISSION_MAF.getNoticeCode());
        if ((LJJIJIIJI instanceof Collection) && LJJIJIIJI.isEmpty()) {
            return false;
        }
        Iterator it = LJJIJIIJI.iterator();
        while (it.hasNext()) {
            if (o.LJ(str, it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void iv0(EnumC97633sN enumC97633sN) {
        EnumC101493yb enumC101493yb;
        InterfaceC88471Ynr<EnumC101493yb, InterfaceC101763z2, C76800UCe> interfaceC88471Ynr = this.LJLJLJ;
        int i = C97623sM.LIZIZ[enumC97633sN.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            enumC101493yb = EnumC101493yb.EVERYONE_CREATORS;
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        enumC101493yb = EnumC101493yb.NO_ONE;
                    }
                } else {
                    enumC101493yb = EnumC101493yb.FRIENDS;
                }
            } else {
                enumC101493yb = EnumC101493yb.MAF;
            }
        } else {
            enumC101493yb = EnumC101493yb.EVERYONE;
        }
        interfaceC88471Ynr.invoke(enumC101493yb, new InterfaceC101763z2() { // from class: X.3sS
            @Override // X.InterfaceC101763z2
            public final void LIZ(EnumC101633yp reason) {
                o.LJIIIZ(reason, "reason");
                if (C97713sV.LIZ[reason.ordinal()] != 1) {
                    SessionListTopNoticeViewModel sessionListTopNoticeViewModel = SessionListTopNoticeViewModel.this;
                    sessionListTopNoticeViewModel.LJLLLL--;
                }
                SessionListTopNoticeViewModel.this.lv0();
            }
        });
    }

    public final void kv0(String sourceType) {
        String str;
        o.LJIIIZ(sourceType, "sourceType");
        EnumC97613sL value = this.LJLLLLLL.getValue();
        if (value != null) {
            str = value.getNoticeCode();
        } else {
            str = null;
        }
        if (((CleanUpPushPermissionConfig) C97843si.LIZIZ.getValue()).group != 5 && C97843si.LIZ() && o.LJ(str, EnumC97613sL.TurnOnNotificationView.getNoticeCode())) {
            C97653sP.LIZ.storeLong("key_unified_push_permission", System.currentTimeMillis());
        }
        ov0(1, str, sourceType, "");
        nv0("notification_setting_alert_close");
        lv0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC97613sL mv0(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel.mv0(java.lang.String):X.3sL");
    }

    public final void nv0(String str) {
        AbstractC97583sI abstractC97583sI;
        String LIZ;
        EnumC97613sL value = this.LJLLLLLL.getValue();
        InterfaceC97753sZ interfaceC97753sZ = null;
        if (value != null) {
            interfaceC97753sZ = value.getConfig();
        }
        if (!(interfaceC97753sZ instanceof AbstractC97583sI) || (abstractC97583sI = (AbstractC97583sI) interfaceC97753sZ) == null || (LIZ = abstractC97583sI.LIZ()) == null) {
            return;
        }
        this.LJLJI.LIZIZ(str, C113554cx.LJJL(new OSZ("enter_from", this.LJLIL), new OSZ("pop_up_type", LIZ)));
    }

    public static void hv0(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, int i, boolean z) {
        TopChatNoticePushStatus topChatNoticePushStatus;
        AppStatus appStatus;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("activity_status_");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(\"activity_status…serService().curUserId}\")");
        sessionListTopNoticeViewModel.getClass();
        if (z) {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_ON;
        } else {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_OFF;
        }
        boolean contains = repo.contains("has_permission_sheet_shown");
        if (sessionListTopNoticeViewModel.LJLJJLL.LJ()) {
            if (sessionListTopNoticeViewModel.LJLJJLL.LIZ()) {
                appStatus = AppStatus.APP_STATUS_NORMAL;
            } else {
                appStatus = AppStatus.APP_STATUS_COLD_START;
            }
        } else {
            appStatus = AppStatus.APP_STATUS_NEW_LOGIN;
        }
        XKX.LIZLLL(sessionListTopNoticeViewModel.LJZ, sessionListTopNoticeViewModel.LJZI, null, new C80743Ew(sessionListTopNoticeViewModel, topChatNoticePushStatus, appStatus, i, contains, null), 2);
    }

    public SessionListTopNoticeViewModel(String enterFrom, AqS183S0100000_1 aqS183S0100000_1, AqS183S0100000_1 aqS183S0100000_12, int i) {
        TikTokImApi tikTokImApi;
        C85323Wm analyticsEventSender;
        C80993Fv spUtil;
        XIA ioDispatcher;
        XIF mainDispatcher;
        C107384Ji activityStatusViewModelSettings;
        enterFrom = (i & 1) != 0 ? "chat_list" : enterFrom;
        if ((i & 2) != 0) {
            tikTokImApi = C30U.LIZ();
        } else {
            tikTokImApi = null;
        }
        if ((i & 4) != 0) {
            analyticsEventSender = C772831o.LIZ();
        } else {
            analyticsEventSender = null;
        }
        if ((i & 8) != 0) {
            spUtil = C80993Fv.LIZ();
            o.LJIIIIZZ(spUtil, "get()");
        } else {
            spUtil = null;
        }
        if ((i & 16) != 0) {
            ioDispatcher = C78613UtF.LIZJ;
        } else {
            ioDispatcher = null;
        }
        if ((i & 32) != 0) {
            mainDispatcher = EXV.LIZ;
        } else {
            mainDispatcher = null;
        }
        if ((i & 64) != 0) {
            activityStatusViewModelSettings = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings();
        } else {
            activityStatusViewModelSettings = null;
        }
        InterfaceC88471Ynr displayDmSettingBottomSheet = aqS183S0100000_1;
        displayDmSettingBottomSheet = (i & 128) != 0 ? C97723sW.LJLIL : displayDmSettingBottomSheet;
        InterfaceC88471Ynr displayDmSettingPopup = aqS183S0100000_12;
        displayDmSettingPopup = (i & 256) != 0 ? C97733sX.LJLIL : displayDmSettingPopup;
        InterfaceC97743sY deps = (i & 512) != 0 ? new InterfaceC97743sY() { // from class: X.3wS
            @Override // X.InterfaceC97743sY
            public final void LIZLLL() {
                IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAccuracyAnalysis().LIZJ(C772831o.LIZ());
            }

            @Override // X.InterfaceC97743sY
            public final boolean LIZIZ() {
                if (((Number) C100223wY.LIZ.getValue()).intValue() == 1) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC97743sY
            public final boolean LIZJ() {
                if (((Number) C100203wW.LIZ.getValue()).intValue() == 1) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC97743sY
            public final void LIZ(int i2, boolean z) {
                IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAccuracyAnalysis().LIZLLL(i2, z, C772831o.LIZ());
            }
        } : null;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(tikTokImApi, "tikTokImApi");
        o.LJIIIZ(analyticsEventSender, "analyticsEventSender");
        o.LJIIIZ(spUtil, "spUtil");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        o.LJIIIZ(mainDispatcher, "mainDispatcher");
        o.LJIIIZ(activityStatusViewModelSettings, "activityStatusViewModelSettings");
        o.LJIIIZ(displayDmSettingBottomSheet, "displayDmSettingBottomSheet");
        o.LJIIIZ(displayDmSettingPopup, "displayDmSettingPopup");
        o.LJIIIZ(deps, "deps");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = tikTokImApi;
        this.LJLJI = analyticsEventSender;
        this.LJLJJI = spUtil;
        this.LJLJJL = mainDispatcher;
        this.LJLJJLL = activityStatusViewModelSettings;
        this.LJLJL = displayDmSettingBottomSheet;
        this.LJLJLJ = displayDmSettingPopup;
        this.LJLJLLL = deps;
        MutableLiveData<C70372pV<C76800UCe>> mutableLiveData = new MutableLiveData<>();
        this.LJLL = mutableLiveData;
        this.LJLLI = mutableLiveData;
        MutableLiveData<C70372pV<C76800UCe>> mutableLiveData2 = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData2;
        this.LJLLJ = mutableLiveData2;
        this.LJLLL = new ArrayList();
        MutableLiveData<EnumC97613sL> mutableLiveData3 = new MutableLiveData<>();
        this.LJLLLLLL = mutableLiveData3;
        this.LJLZ = mutableLiveData3;
        this.LJZ = C48841JEv.LIZ(ioDispatcher.plus(T2R.LJIIJJI()));
        AnonymousClass315 anonymousClass315 = CoroutineExceptionHandler.LJJJJIZL;
        this.LJZI = new IDaS20S0000000_1(anonymousClass315, 25);
        this.LJZL = new IDaS20S0000000_1(anonymousClass315, 26);
    }

    public final void ov0(int i, String str, String sourceType, String str2) {
        o.LJIIIZ(sourceType, "sourceType");
        if (str == null || ujb.o.LJJJJJL(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendNoticeAckEvent notice code is null ");
            LIZ.append(str);
            C34B.LJIIIIZZ("TopNoticeViewModel", X1D.LIZIZ(LIZ));
            return;
        }
        XKX.LIZLLL(this.LJZ, this.LJZL, null, new C65992iR(this, str, sourceType, i, str2, null), 2);
    }
}
