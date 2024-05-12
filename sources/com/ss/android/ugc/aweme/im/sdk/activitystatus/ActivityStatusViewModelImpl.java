package com.ss.android.ugc.aweme.im.sdk.activitystatus;

import X.AbstractC73635Sv9;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.AbstractC73946T0k;
import X.C09G;
import X.C106844Hg;
import X.C106934Hp;
import X.C107384Ji;
import X.C115724gS;
import X.C117504jK;
import X.C32I;
import X.C3A8;
import X.C3A9;
import X.C3AD;
import X.C3AE;
import X.C3AF;
import X.C3B2;
import X.C3B3;
import X.C3BA;
import X.C3BB;
import X.C47261Igj;
import X.C73318Sq2;
import X.C73320Sq4;
import X.C73411SrX;
import X.C73542Ste;
import X.C73549Stl;
import X.C73582SuI;
import X.C73714SwQ;
import X.C73849Syb;
import X.C73893SzJ;
import X.C73969T1h;
import X.C78253UnR;
import X.C78999UzT;
import X.C79543Ag;
import X.C84763XOl;
import X.C86550Xxy;
import X.C98453th;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC73518StG;
import X.InterfaceC79563Ai;
import X.InterfaceC86486Xww;
import X.InterfaceC92693kP;
import X.ORY;
import X.ORZ;
import X.T2J;
import X.X1D;
import X.XKX;
import Y.AfS22S0110000_1;
import Y.AfS53S0100000_1;
import Y.IDhS94S0100000_1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.setting.serverpush.model.InAppPushSetting;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS10S1110000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS26S0100100_1;
import kotlin.jvm.internal.AqS44S1200000_1;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ActivityStatusViewModelImpl implements GenericLifecycleObserver, C3B2, C3A9, DefaultLifecycleObserver {
    public static final /* synthetic */ int LLFFF = 0;
    public final C106934Hp LJLIL;
    public final C98453th LJLILLLLZI;
    public final InterfaceC65784Pro<Long> LJLJI;
    public final ActivityStatusConfig LJLJJI;
    public final Map<String, C73849Syb<ActivityStatus>> LJLJJL;
    public final Map<String, C73849Syb<ActivityStatus>> LJLJJLL;
    public final Map<String, Integer> LJLJL;
    public final Map<String, Integer> LJLJLJ;
    public final C73893SzJ<String> LJLJLLL;
    public final C73893SzJ<String> LJLL;
    public InterfaceC92693kP LJLLI;
    public final C73318Sq2 LJLLILLLL;
    public final C73318Sq2 LJLLJ;
    public final AbstractC73946T0k LJLLL;
    public final AbstractC73946T0k LJLLLL;
    public final LifecycleOwner LJLLLLLL;
    public final InterfaceC70422pa LJLZ;
    public C73411SrX LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public final CopyOnWriteArrayList<InterfaceC79563Ai> LL;
    public final C107384Ji LLD;
    public C73411SrX LLF;
    public C73411SrX LLFF;

    @Override // X.C3B2
    public final void LIZLLL() {
        this.LJZL = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    @Override // X.C3B2
    public final void LIZ() {
        C3B3.LIZJ(this, "activity_status_push_setting_changed", 0L, 6);
    }

    @Override // X.C3B2
    public final void LJ() {
        this.LJLILLLLZI.LIZ("stop report");
        C73411SrX c73411SrX = this.LJZ;
        if (c73411SrX != null) {
            this.LJLLJ.LIZIZ(c73411SrX);
        }
        this.LJZ = null;
    }

    public final void LJIILLIIL() {
        C98453th c98453th = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLogout activeObservedID ");
        LIZ.append(this.LJLJJL.size());
        LIZ.append(" activeObservedIDForMob ");
        LIZ.append(this.LJLJJLL.size());
        c98453th.LIZ(X1D.LIZIZ(LIZ));
        C106844Hg.LIZ("onLogout");
        Iterator<Map.Entry<String, C73849Syb<ActivityStatus>>> it = this.LJLJJL.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onComplete();
        }
        Iterator<Map.Entry<String, C73849Syb<ActivityStatus>>> it2 = this.LJLJJLL.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().onComplete();
        }
        this.LJLJJL.clear();
        this.LJLJJLL.clear();
        this.LJLJLJ.clear();
        this.LJLIL.LIZIZ.LIZIZ.LJIIIIZZ(-1);
        o.LJIIIIZZ(C115724gS.LJLIL, "complete()");
        this.LJLJL.clear();
        InterfaceC92693kP interfaceC92693kP = this.LJLLI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        C73411SrX c73411SrX = this.LJZ;
        if (c73411SrX != null) {
            this.LJLLJ.LIZIZ(c73411SrX);
        }
        this.LJZ = null;
    }

    public final void LJIJI() {
        this.LJLILLLLZI.LIZ("subscribeToFastInterval");
        long j = this.LJLJJI.ui_high_priority_refresh_status_interval;
        C73411SrX LJIIIIZZ = C73542Ste.LJIIIIZZ(AbstractC73672Svk.LJJIJ(j, j, TimeUnit.MILLISECONDS, this.LJLLLL), new AqS167S0100000_1(this, 49), null, new AqS167S0100000_1(this, 50), 2);
        C78999UzT.LJFF(LJIIIIZZ, this.LJLLJ);
        this.LLFF = LJIIIIZZ;
    }

    public final void LJIJJ() {
        this.LJLILLLLZI.LIZ("subscribeToNormalInterval");
        long j = this.LJLJJI.ui_refresh_status_interval;
        C73411SrX LJIIIIZZ = C73542Ste.LJIIIIZZ(AbstractC73672Svk.LJJIJ(j, j, TimeUnit.MILLISECONDS, this.LJLLLL), new AqS167S0100000_1(this, 51), null, new AqS167S0100000_1(this, 52), 2);
        C78999UzT.LJFF(LJIIIIZZ, this.LJLLJ);
        this.LLF = LJIIIIZZ;
    }

    @Override // X.C3B2
    public final /* bridge */ /* synthetic */ C107384Ji getSettings() {
        return this.LLD;
    }

    @Override // X.C3A9
    public final List<C3AD> LIZJ(List<String> list) {
        return this.LJLIL.LIZ(list);
    }

    @Override // X.C3B2
    public final List<ActivityStatus> LJFF(String... userIDs) {
        o.LJIIIZ(userIDs, "userIDs");
        List<C3AD> LIZ = this.LJLIL.LIZ(ORY.LJJZZIII(userIDs));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
        Iterator<C3AD> it = LIZ.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZJ);
        }
        return arrayList;
    }

    @Override // X.C3A9
    public final void LJI(String uid) {
        o.LJIIIZ(uid, "uid");
        this.LJLJLLL.onNext(uid);
    }

    @Override // X.C3B2
    public final void LJII(C79543Ag c79543Ag) {
        this.LL.add(c79543Ag);
    }

    @Override // X.C3B2
    public final void LJIIIZ(ActivityStatus... statuses) {
        o.LJIIIZ(statuses, "statuses");
        C106934Hp c106934Hp = this.LJLIL;
        ActivityStatus[] statuses2 = (ActivityStatus[]) Arrays.copyOf(statuses, statuses.length);
        c106934Hp.getClass();
        o.LJIIIZ(statuses2, "statuses");
        C3AF c3af = c106934Hp.LIZIZ;
        Object[] statuses3 = Arrays.copyOf(statuses2, statuses2.length);
        c3af.getClass();
        o.LJIIIZ(statuses3, "statuses");
        C78999UzT.LJFF(C73542Ste.LIZLLL(AbstractC73638SvC.LJIJ(statuses3).LJIJI(new IDhS94S0100000_1(c3af, 1)).LJJIIJ(this.LJLLL), new AqS167S0100000_1(this, 53), new AqS167S0100000_1(this, 54)), this.LJLLILLLL);
    }

    @Override // X.C3B2
    public final ActivityStatus LJIIJ(String userId) {
        boolean z;
        o.LJIIIZ(userId, "userId");
        if (userId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        List<C3AD> LIZ = this.LJLIL.LIZ(C47261Igj.LJJIJ(userId));
        if (((ArrayList) LIZ).isEmpty()) {
            return null;
        }
        return ((C3AD) ORZ.LJLLJ(LIZ)).LIZJ;
    }

    @Override // X.C3B2
    public final void LJIILIIL(boolean z) {
        long j;
        if (z) {
            j = this.LJLJJI.status_report_interval;
        } else {
            j = 0;
        }
        C78999UzT.LJFF(C73542Ste.LJFF(AbstractC73635Sv9.LJ(new InterfaceC73518StG() { // from class: X.4Hf
            @Override // X.InterfaceC73518StG
            public final void LIZ(C73516StE c73516StE) {
                ActivityStatusViewModelImpl.this.LJLILLLLZI.LIZ("reportMyStatus check prerequisite");
                if (ActivityStatusViewModelImpl.this.LLD.LJFF()) {
                    c73516StE.onSuccess(C76800UCe.LIZ);
                } else {
                    c73516StE.onComplete();
                }
            }
        }).LJIJJ(this.LJLLLL), C73542Ste.LIZIZ, C73542Ste.LIZJ, new AqS26S0100100_1(this, j, 0)), this.LJLLILLLL);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZIZ(this, owner);
        C106844Hg.LIZ("tearDown");
        LJIILLIIL();
        this.LJLJLLL.onComplete();
        this.LJLL.onComplete();
        C107384Ji c107384Ji = this.LLD;
        IAccountService iAccountService = c107384Ji.LIZLLL;
        if (iAccountService != null) {
            iAccountService.LJIILLIIL(c107384Ji.LJIILL);
        }
        c107384Ji.LJIIIIZZ.LIZLLL();
        c107384Ji.LJIIJJI.onComplete();
        this.LJLLILLLL.LIZLLL();
        this.LJLLJ.LIZLLL();
        InterfaceC92693kP interfaceC92693kP = this.LJLLI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LJZ = null;
        LJIIIIZZ(0L, "app_terminate", false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZJ(this, owner);
        C106844Hg.LIZ("switchToBackground");
        LJ();
        LJIIIIZZ(0L, "enter_background", false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZLLL(this, owner);
        C106844Hg.LIZ("switchToForeground");
        if (this.LJZI || this.LJZL) {
            C3B3.LIZJ(this, "enter_foreground", 0L, 6);
        }
        LJIILIIL(true);
        if (!C117504jK.LIZ) {
            return;
        }
        this.LJLILLLLZI.LIZ("fetchActivityStatusActively");
        LJIIZILJ(null, ORZ.LLJI(this.LJLJLJ.keySet()), false);
        LJIIZILJ(null, ORZ.LLJI(this.LJLJL.keySet()), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C3A9
    public final void LJIIL(List<String> list, C3A8 cacheState) {
        o.LJIIIZ(cacheState, "cacheState");
        C106934Hp c106934Hp = this.LJLIL;
        c106934Hp.getClass();
        C3AF c3af = c106934Hp.LIZIZ;
        c3af.getClass();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C3AD c3ad = (C3AD) c3af.LIZIZ.LIZIZ(next);
            if (c3ad != null) {
                c3af.LIZIZ.LIZJ(next, C3AD.LIZ(c3ad, 0L, cacheState, 7));
            }
        }
    }

    public final void LJIILL(List<C3AD> statuses, boolean z) {
        o.LJIIIZ(statuses, "statuses");
        for (C3AD c3ad : statuses) {
            ActivityStatus activityStatus = c3ad.LIZJ;
            if (activityStatus == null) {
                activityStatus = new ActivityStatus(c3ad.LIZ, -1L, -1L);
            }
            C73849Syb<ActivityStatus> c73849Syb = this.LJLJJL.get(c3ad.LIZ);
            C73849Syb<ActivityStatus> c73849Syb2 = this.LJLJJLL.get(c3ad.LIZ);
            if (c73849Syb != null) {
                c73849Syb.onNext(activityStatus);
            }
            if (c73849Syb2 != null) {
                c73849Syb2.onNext(activityStatus);
            }
        }
        if (!z) {
            Iterator<InterfaceC79563Ai> it = this.LL.iterator();
            while (it.hasNext()) {
                InterfaceC79563Ai next = it.next();
                ArrayList arrayList = new ArrayList();
                Iterator<C3AD> it2 = statuses.iterator();
                while (it2.hasNext()) {
                    ActivityStatus activityStatus2 = it2.next().LIZJ;
                    if (activityStatus2 != null) {
                        arrayList.add(activityStatus2);
                    }
                }
                next.LIZ(arrayList);
            }
        }
    }

    public final void LJIJ(final String str, final boolean z) {
        if (o.LJ(str, "cold_start")) {
            this.LJZI = true;
        }
        C78999UzT.LJFF(C73542Ste.LJFF(AbstractC73635Sv9.LJ(new InterfaceC73518StG(this) { // from class: X.4He
            public final /* synthetic */ ActivityStatusViewModelImpl LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.InterfaceC73518StG
            public final void LIZ(C73516StE c73516StE) {
                boolean LJI;
                if (z) {
                    LJI = this.LIZIZ.LLD.LJFF();
                } else {
                    LJI = this.LIZIZ.LLD.LJI();
                }
                C98453th c98453th = this.LIZIZ.LJLILLLLZI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reportMyStatusForSpecialScene check prerequisite ");
                LIZ.append(LJI);
                c98453th.LIZ(X1D.LIZIZ(LIZ));
                if (LJI) {
                    c73516StE.onSuccess(str);
                } else {
                    c73516StE.onComplete();
                }
            }
        }).LJIJJ(this.LJLLLL), new AqS167S0100000_1(this, 48), C73542Ste.LIZJ, new AqS10S1110000_1(this, str, z, 1)), this.LJLLILLLL);
    }

    @Override // X.C3B2
    public final void LJIIIIZZ(long j, String str, boolean z) {
        if (!z && !C117504jK.LIZ) {
            return;
        }
        if (j == 0) {
            LJIJ(str, z);
        } else {
            if (j <= 0) {
                return;
            }
            C78999UzT.LJFF(AbstractC73672Svk.LJJIJIL(str).LJIIL(j, TimeUnit.MILLISECONDS).LJJL(this.LJLLLL).LJJJ(this.LJLLLL).LJJJLIIL(new AfS22S0110000_1(this, z, 2), new AfS53S0100000_1(this, 105)), this.LJLLILLLL);
        }
    }

    @Override // X.C3B2
    public final MutableLiveData LJIIJJI(String str, boolean z, C3BA scene) {
        o.LJIIIZ(scene, "scene");
        return LJIILJJIL(str, z, scene, true, null);
    }

    public final void LJIIZILJ(String str, List userIdList, boolean z) {
        o.LJIIIZ(userIdList, "userIdList");
        C106934Hp c106934Hp = this.LJLIL;
        c106934Hp.getClass();
        C3AF c3af = c106934Hp.LIZIZ;
        c3af.getClass();
        ArrayList arrayList = new ArrayList(C32I.LJJL(userIdList, 10));
        Iterator it = userIdList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C3AD LIZIZ = c3af.LIZIZ.LIZIZ(str2);
            if (LIZIZ == null) {
                LIZIZ = new C3AD(str2, 0L, null);
            }
            arrayList.add(LIZIZ);
        }
        C78999UzT.LJFF(C73542Ste.LIZLLL(AbstractC73638SvC.LJIJ(arrayList).LJIJI(T2J.LJLIL).LJJIIJ(this.LJLLL), new AqS167S0100000_1(this, 509), new AqS167S0100000_1(this, str, z, 510)), this.LJLLILLLL);
    }

    @Override // X.C3B2
    public final MutableLiveData LIZIZ(String userId, boolean z, C3BA scene, String str) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(scene, "scene");
        return LJIILJJIL(userId, z, scene, false, str);
    }

    public final MutableLiveData LJIILJJIL(String str, boolean z, C3BA c3ba, boolean z2, String str2) {
        C73849Syb<ActivityStatus> c73849Syb;
        Map<String, Integer> map;
        if (str.length() == 0) {
            return new MutableLiveData(null);
        }
        if (z2) {
            Map<String, C73849Syb<ActivityStatus>> map2 = this.LJLJJLL;
            C73849Syb<ActivityStatus> c73849Syb2 = map2.get(str);
            if (c73849Syb2 == null) {
                c73849Syb2 = new C73849Syb<>();
                map2.put(str, c73849Syb2);
            }
            c73849Syb = c73849Syb2;
        } else {
            Map<String, C73849Syb<ActivityStatus>> map3 = this.LJLJJL;
            C73849Syb<ActivityStatus> c73849Syb3 = map3.get(str);
            if (c73849Syb3 == null) {
                c73849Syb3 = new C73849Syb<>();
                map3.put(str, c73849Syb3);
            }
            c73849Syb = c73849Syb3;
        }
        if (C3BB.LIZ[c3ba.ordinal()] == 1) {
            map = this.LJLJL;
        } else {
            map = this.LJLJLJ;
        }
        if (!z2) {
            LJIIZILJ(str2, C47261Igj.LJJIJ(str), true);
            return new ActivityStatusLiveData(c73849Syb, z, null, null, new AqS44S1200000_1(this, (ActivityStatusViewModelImpl) map, (Map<String, Integer>) str, (String) 8), new AqS44S1200000_1(this, (ActivityStatusViewModelImpl) map, (Map<String, Integer>) str, (String) 9), 12, null);
        }
        return new ActivityStatusLiveData(c73849Syb, z, null, null, null, new AqS55S1100000_1(this, str, 17), 28, null);
    }

    public ActivityStatusViewModelImpl(C106934Hp c106934Hp, C98453th log, InterfaceC65784Pro<Long> currentTimeUnix, ActivityStatusConfig config, Map<String, C73849Syb<ActivityStatus>> activeObservedID, Map<String, C73849Syb<ActivityStatus>> activeObservedIDForMob, Map<String, Integer> highRefreshIds, Map<String, Integer> normalRefreshIds, C73893SzJ<String> queryBuffer, C73893SzJ<String> reportBuffer, InterfaceC92693kP interfaceC92693kP, C73318Sq2 coldDisposable, C73318Sq2 hotDisposable, AbstractC73946T0k io2, AbstractC73946T0k computation, LifecycleOwner processLifecycleOwner, InterfaceC70422pa uiScope, boolean z, boolean z2) {
        o.LJIIIZ(log, "log");
        o.LJIIIZ(currentTimeUnix, "currentTimeUnix");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(activeObservedID, "activeObservedID");
        o.LJIIIZ(activeObservedIDForMob, "activeObservedIDForMob");
        o.LJIIIZ(highRefreshIds, "highRefreshIds");
        o.LJIIIZ(normalRefreshIds, "normalRefreshIds");
        o.LJIIIZ(queryBuffer, "queryBuffer");
        o.LJIIIZ(reportBuffer, "reportBuffer");
        o.LJIIIZ(coldDisposable, "coldDisposable");
        o.LJIIIZ(hotDisposable, "hotDisposable");
        o.LJIIIZ(io2, "io");
        o.LJIIIZ(computation, "computation");
        o.LJIIIZ(processLifecycleOwner, "processLifecycleOwner");
        o.LJIIIZ(uiScope, "uiScope");
        this.LJLIL = c106934Hp;
        this.LJLILLLLZI = log;
        this.LJLJI = currentTimeUnix;
        this.LJLJJI = config;
        this.LJLJJL = activeObservedID;
        this.LJLJJLL = activeObservedIDForMob;
        this.LJLJL = highRefreshIds;
        this.LJLJLJ = normalRefreshIds;
        this.LJLJLLL = queryBuffer;
        this.LJLL = reportBuffer;
        this.LJLLI = interfaceC92693kP;
        this.LJLLILLLL = coldDisposable;
        this.LJLLJ = hotDisposable;
        this.LJLLL = io2;
        this.LJLLLL = computation;
        this.LJLLLLLL = processLifecycleOwner;
        this.LJLZ = uiScope;
        this.LL = new CopyOnWriteArrayList<>();
        C107384Ji c107384Ji = new C107384Ji(this);
        this.LLD = c107384Ji;
        log.LIZ("ActivityStatusViewModelImpl#init");
        XKX.LIZLLL(uiScope, null, null, new C3AE(this, null), 3);
        if (z) {
            log.LIZ("subscribeToBatchUpdates");
            long j = config.status_cache_request_debounce_interval;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(new C73582SuI(queryBuffer.LJFF(j, timeUnit, computation, config.remoteBatchSize).LJJIFFI(C78253UnR.LJLJJL), new IDhS94S0100000_1(this, 15)), new AqS167S0100000_1(this, 503), null, new AqS167S0100000_1(this, 504), 2), hotDisposable);
            log.LIZ("subscribeToReportingBuffer");
            long j2 = config.status_report_request_debounce_interval;
            C73320Sq4.LIZ(timeUnit, "unit is null");
            C73320Sq4.LIZ(computation, "scheduler is null");
            C78999UzT.LJFF(C73542Ste.LJI(new C73549Stl(new C73714SwQ(j2, reportBuffer, computation, timeUnit), new IDhS94S0100000_1(this, 16)), new AqS167S0100000_1(this, 505), C73542Ste.LIZJ), hotDisposable);
            LJIJJ();
            LJIJI();
            log.LIZ("subscribeSharingStatusSubject");
            C78999UzT.LJFF(c107384Ji.LJIIJJI.LJJL(io2).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS53S0100000_1(this, 104)), coldDisposable);
        }
        if (z2) {
            C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
            if (c86550Xxy.LJIIL(27) == null) {
                c86550Xxy.LIZ.LJIIJJI(new InterfaceC86486Xww() { // from class: X.4I4
                    public int LIZ;
                    public InterfaceC112564bM LIZIZ;
                    public Long LIZJ;

                    @Override // X.InterfaceC86486Xww
                    public final int[] LIZ() {
                        return new int[]{27, 31, 32};
                    }

                    @Override // X.InterfaceC86486Xww
                    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                        return false;
                    }

                    public static boolean LIZJ(InnerPushMessage message) {
                        boolean z3;
                        boolean z4;
                        boolean z5;
                        ActivityStatus activityStatus;
                        InAppPushSetting inAppPushSetting;
                        Integer M;
                        Integer M2;
                        o.LJIIIZ(message, "message");
                        IPrivacyService LJIIIIZZ = PrivacyServiceImpl.LJIIIIZZ();
                        if (LJIIIIZZ != null) {
                            PrivacyUserSettingsV2 privacyUserSettings = LJIIIIZZ.getPrivacyUserSettings();
                            if (privacyUserSettings == null || (M2 = privacyUserSettings.M("direct_message")) == null || M2.intValue() != 3) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            boolean z6 = !z3;
                            PrivacyUserSettingsV2 privacyUserSettings2 = LJIIIIZZ.getPrivacyUserSettings();
                            if (privacyUserSettings2 == null || (M = privacyUserSettings2.M("activity_status")) == null || M.intValue() != 1) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            PushSettings LJ = C85940Xo8.LIZIZ.LJ();
                            if (LJ != null && (inAppPushSetting = LJ.inAppPushSetting) != null && inAppPushSetting.getInAppActiveStatusPush() == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z6 && z4 && z5) {
                                if ((message.getType() == 27 && C31Q.LJIILLIIL.LJI().LJII) || (activityStatus = (ActivityStatus) C62070OXq.LIZ(ActivityStatus.class, message.getBizExtraJsonStr())) == null) {
                                    return false;
                                }
                                C3AL.LIZ.getClass();
                                if (OUP.LJJII(activityStatus, null, C3AL.LIZ(), 1)) {
                                    return true;
                                }
                                ActivityStatus LJIIJ = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().LJIIJ(activityStatus.userID);
                                if (LJIIJ == null) {
                                    return false;
                                }
                                return OUP.LJJII(LJIIJ, null, C3AL.LIZ(), 1);
                            }
                        }
                        return false;
                    }

                    public static String LJIIIZ(InnerPushMessage innerPushMessage) {
                        try {
                            String bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
                            if (bizExtraJsonStr == null) {
                                bizExtraJsonStr = "";
                            }
                            String string = JSONObjectProtectorUtils.getString(new JSONObject(bizExtraJsonStr), "user_id");
                            o.LJIIIIZZ(string, "{\n            JSONObject…ring(\"user_id\")\n        }");
                            return string;
                        } catch (Exception unused) {
                            return "";
                        }
                    }

                    @Override // X.InterfaceC86486Xww
                    public final boolean LJFF(InnerPushMessage innerPushMessage) {
                        return LIZJ(innerPushMessage);
                    }

                    @Override // X.InterfaceC86486Xww
                    public final boolean LJIIIIZZ(InnerPushMessage message) {
                        o.LJIIIZ(message, "message");
                        return LIZJ(message);
                    }

                    public static void LJI(InnerPushMessage innerPushMessage, String str) {
                        C107724Kq c107724Kq = new C107724Kq(null);
                        c107724Kq.LJI = Boolean.TRUE;
                        c107724Kq.LIZIZ = EnumC112364b2.INNER_PUSH;
                        c107724Kq.LIZJ = LJIIIZ(innerPushMessage);
                        c107724Kq.LJ = str;
                        c107724Kq.LIZLLL = "inner_push";
                        C78946Uyc.LJJIJIIJIL(c107724Kq);
                    }

                    @Override // X.InterfaceC86486Xww
                    public final boolean LIZIZ(int i, InnerPushMessage innerPushMessage) {
                        int i2;
                        long id = innerPushMessage.getId();
                        Long l = this.LIZJ;
                        if (l == null || id != l.longValue()) {
                            return false;
                        }
                        if (i != 1 && i != 2) {
                            if (i != 3 || (i2 = this.LIZ) == 0) {
                                return false;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    return false;
                                }
                                LJI(innerPushMessage, "chat_room");
                                return false;
                            }
                            this.LIZ = 2;
                            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                            if (uiTemplate != null) {
                                uiTemplate.setContent(EF7.LIZIZ().getString(R.string.h0n, uiTemplate.getTitle()));
                                uiTemplate.setRightType(1);
                                uiTemplate.setRightImageUrl(null);
                                C2068389v c2068389v = new C2068389v();
                                c2068389v.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
                                c2068389v.LJ = Integer.valueOf(R.attr.go);
                                c2068389v.LIZIZ = C7MY.LIZIZ(16);
                                c2068389v.LIZJ = C7MY.LIZIZ(16);
                                uiTemplate.setRightImageDrawable(c2068389v.LIZ(EF7.LIZIZ()));
                                uiTemplate.setRightImageResId(0);
                                uiTemplate.setRightImageRadius(0);
                            }
                            InterfaceC112564bM interfaceC112564bM = this.LIZIZ;
                            if (interfaceC112564bM != null) {
                                interfaceC112564bM.LIZ(innerPushMessage, new int[]{3, 2});
                            }
                            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3UB(innerPushMessage, null), 3);
                            LJII(this, "click", innerPushMessage);
                            LJI(innerPushMessage, "inner_push");
                            return true;
                        }
                        LJI(innerPushMessage, "chat_room");
                        return false;
                    }

                    @Override // X.InterfaceC86486Xww
                    public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
                        this.LIZ = 1;
                        this.LIZJ = Long.valueOf(innerPushMessage.getId());
                        this.LIZIZ = c86507XxH;
                        Keva kevaRepo = C76582zW.LIZ();
                        o.LJIIIIZZ(kevaRepo, "kevaRepo");
                        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                        o.LJIIIIZZ(curUserId, "userService().curUserId");
                        long currentTimeMillis = System.currentTimeMillis();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("time_when_activity_status_push_show");
                        LIZ.append(curUserId);
                        kevaRepo.storeLong(X1D.LIZIZ(LIZ), currentTimeMillis);
                        LJII(this, "show", innerPushMessage);
                        InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
                        C107724Kq c107724Kq = new C107724Kq(null);
                        c107724Kq.LJI = Boolean.TRUE;
                        c107724Kq.LIZJ = LJIIIZ(innerPushMessage);
                        c107724Kq.LIZIZ = EnumC112364b2.INNER_PUSH;
                        c107724Kq.LIZLLL = "inner_push";
                        activityStatusAnalytics.LJFF(c107724Kq);
                        return null;
                    }

                    public static void LJII(C4I4 c4i4, String str, InnerPushMessage innerPushMessage) {
                        String str2;
                        String str3;
                        C85323Wm onEventV3 = C772831o.LIZ();
                        c4i4.getClass();
                        o.LJIIIZ(onEventV3, "onEventV3");
                        OSZ[] oszArr = new OSZ[5];
                        oszArr[0] = new OSZ("enter_from", "inner_push");
                        if (innerPushMessage.getType() == 32) {
                            str2 = "dm_permissions_receiver_open";
                        } else {
                            str2 = "inner_push_active_status";
                        }
                        oszArr[1] = new OSZ("enter_method", str2);
                        oszArr[2] = new OSZ("action_type", str);
                        oszArr[3] = new OSZ("message_type", "send_a_hi");
                        int type = innerPushMessage.getType();
                        if (type != 27) {
                            if (type != 31) {
                                str3 = "";
                            } else {
                                str3 = CardStruct.IStatusCode.DEFAULT;
                            }
                        } else {
                            str3 = "1";
                        }
                        oszArr[4] = new OSZ("online_order", str3);
                        onEventV3.LIZIZ("greeting_button", C113554cx.LJJLIIIIJ(oszArr));
                    }
                });
            }
            if (!C84763XOl.LJIIJJI) {
                C3B3.LIZJ(this, "cold_start", 3000L, 4);
            }
        }
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(C84763XOl.LIZLLL().LJJJ(C73969T1h.LIZIZ()), null, null, new AqS167S0100000_1(this, 47), 3), coldDisposable);
    }
}
