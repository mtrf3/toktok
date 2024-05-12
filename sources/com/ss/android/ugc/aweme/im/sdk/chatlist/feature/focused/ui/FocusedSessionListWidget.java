package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui;

import X.AV1;
import X.AbstractC029409q;
import X.AbstractC73672Svk;
import X.AbstractC73946T0k;
import X.ActivityC45651qj;
import X.C106674Gp;
import X.C107064Ic;
import X.C107454Jp;
import X.C16880lQ;
import X.C209108Io;
import X.C221108m2;
import X.C2NU;
import X.C2U8;
import X.C31M;
import X.C31N;
import X.C32I;
import X.C34B;
import X.C35L;
import X.C3B2;
import X.C3B3;
import X.C3BA;
import X.C3E6;
import X.C3K5;
import X.C3KN;
import X.C3L2;
import X.C3L3;
import X.C3L4;
import X.C3MD;
import X.C3ML;
import X.C3OA;
import X.C3OH;
import X.C3SR;
import X.C3SS;
import X.C3SU;
import X.C3SW;
import X.C3SX;
import X.C3X0;
import X.C42193GhB;
import X.C47261Igj;
import X.C48841JEv;
import X.C4D2;
import X.C4Z2;
import X.C53432Ky4;
import X.C54362LVe;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73849Syb;
import X.C73969T1h;
import X.C78613UtF;
import X.C78866UxK;
import X.C82773Mr;
import X.C84203Se;
import X.C84543Tm;
import X.C84563To;
import X.C96423qQ;
import X.C96533qb;
import X.C96963rI;
import X.C98533tp;
import X.EnumC100693xJ;
import X.EnumC112364b2;
import X.EnumC94693nd;
import X.MLD;
import X.ORS;
import X.ORZ;
import X.QD3;
import X.T16;
import X.X1D;
import X.XKX;
import Y.AObserverS62S0300000_1;
import Y.AObserverS69S0100000_1;
import Y.AfS53S0100000_1;
import Y.IDFactoryS60S0000000_1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.SessionListReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.data.dto.DistinctUntilChangedLiveData;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public final class FocusedSessionListWidget extends InboxAdapterWidget implements C3SW, MLD {
    public final C3SR LJLJL;
    public final C3X0 LJLJLJ;
    public final AbstractC73946T0k LJLJLLL;
    public final AbstractC73946T0k LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public final int LJLLJ;
    public final boolean LJLLL;
    public final C73318Sq2 LJLLLL;
    public final SessionListReadStatusViewModel LJLLLLLL;
    public final ConcurrentHashMap<String, LiveData<ActivityStatus>> LJLZ;
    public final ConcurrentHashMap<String, ActivityStatus> LJZ;
    public final C3X0 LJZI;
    public boolean LJZL;
    public final C62822Ol8 LL;
    public final DistinctUntilChangedLiveData LLD;
    public final MutableLiveData<EnumC94693nd> LLF;
    public final MutableLiveData LLFF;
    public final MutableLiveData<Integer> LLFFF;
    public final MutableLiveData LLFII;
    public String LLFZ;
    public String LLI;
    public Integer LLIFFJFJJ;
    public volatile boolean LLII;
    public final C73849Syb<C3MD> LLIIII;
    public final C62822Ol8 LLIIIILZ;

    public FocusedSessionListWidget() {
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LLII = false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.C3SW
    public final void LIZ() {
        if (this.LLFZ == null || this.LLI == null) {
            LJIJ();
        }
        synchronized (C3K5.LJLIL) {
            C3K5.LIZJ("first_dm_item_attach", null);
        }
        String str = this.LLFZ;
        String str2 = this.LLI;
        Integer num = this.LLIFFJFJJ;
        this.LJLJL.Fd(str, str2);
        this.LJLJL.Gr0(num, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.MLD
    public final void LJ() {
        C34B.LIZIZ("FocusedSessionListWidget", "onRefresh");
        this.LJLIL.requireContext();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C2U8.LIZ(new C82773Mr());
                InboxSocPubStatusViewModelImpl inboxSocPubStatusViewModelImpl = (InboxSocPubStatusViewModelImpl) this.LL.getValue();
                if (inboxSocPubStatusViewModelImpl != null) {
                    String[] strArr = (String[]) inboxSocPubStatusViewModelImpl.LJLJI.toArray(new String[0]);
                    inboxSocPubStatusViewModelImpl.gv0((String[]) Arrays.copyOf(strArr, strArr.length), false);
                }
                C106674Gp.LJIIJJI("inbox_refresh", false);
                C31N.LIZ();
                this.LJLJL.refresh();
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C35L(null), 3);
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.MLD
    public final void LJIIJJI() {
        this.LJLJL.LJIIJJI();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (this.LJLLL) {
            return;
        }
        if (this.LJLLILLLL && this.LJZL) {
            C3X0 c3x0 = this.LJLJLJ;
            ArrayList arrayList = new ArrayList();
            int i = this.LJLLJ;
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    arrayList.add(new C3L4() { // from class: X.3OK
                        @Override // X.C3L4
                        public final C3OB LIZJ() {
                            return null;
                        }

                        @Override // X.C3L4
                        public final String LJFF() {
                            return "";
                        }

                        @Override // X.C3L4
                        public final int LJIIIIZZ() {
                            return 0;
                        }

                        @Override // X.C3L4
                        public final void LJIIIZ() {
                        }
                    });
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            c3x0.submitList(arrayList);
        }
        this.LJLLLL.LIZ(C73542Ste.LJIIIIZZ(this.LJLJL.XT(true).LJJL(this.LJLJLLL).LJIL(new AfS53S0100000_1(this, 30)).LJIJJLI(new AfS53S0100000_1(this, 31)).LJJJ(this.LJLL), new AqS167S0100000_1(this, 155), null, new AqS167S0100000_1(this, 156), 2));
        this.LJZL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LJLLLL.LIZLLL();
        C3E6.LJ();
        IMCriticalFlowKeva.LIZ.LIZJ().erase("show_chat_list_performance");
    }

    @Override // X.MLD
    public final AbstractC73672Svk<C3MD> LIZJ() {
        boolean z;
        if ((C3SX.LIZ() & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLLL.LIZ(C73542Ste.LJIIIIZZ(this.LJLJL.XT(!z).LJJL(this.LJLJLLL).LJIJJLI(new AfS53S0100000_1(this, 29)).LJJJ(this.LJLL), new AqS167S0100000_1(this, 153), null, new AqS167S0100000_1(this, 154), 2));
        if ((C3SX.LIZ() & 4) != 0) {
            this.LJLLLL.LIZ(C73542Ste.LJIIIIZZ(((AbstractC73672Svk) this.LLIIIILZ.getValue()).LJIIJJI(200L, TimeUnit.MILLISECONDS), null, null, new AqS167S0100000_1(this, 518), 3));
        }
        C73849Syb<C3MD> c73849Syb = this.LLIIII;
        return C42193GhB.LIZJ(c73849Syb, c73849Syb);
    }

    public final void LJIJ() {
        this.LLFZ = MainPageFragmentImpl.LJI().LJJLIIIJJI();
        this.LLI = "button";
        this.LLIFFJFJJ = Integer.valueOf(C54362LVe.LJIILJJIL(99));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C96963rI.LJ().getClass();
        C84543Tm.LIZIZ();
        C3X0 c3x0 = this.LJLJLJ;
        c3x0.getClass();
        c3x0.LJLJJL = this;
        this.LLII = true;
        EventBus.LIZJ().LJIILJJIL(this);
        C3E6.LIZIZ();
        this.LJLJL.yp().observe(this.LJLIL, new AObserverS69S0100000_1(this, 45));
        if (this.LJLIL.getContext() instanceof Activity) {
            Context context = this.LJLIL.getContext();
            o.LJII(context, "null cannot be cast to non-null type android.app.Activity");
            Bundle LLJJIJI = C16880lQ.LLJJIJI(((Activity) context).getIntent());
            if (LLJJIJI != null) {
                this.LLFZ = LLJJIJI.getString("enter_from");
                this.LLI = LLJJIJI.getString("enter_method");
            }
        }
        ((C4Z2) C96423qQ.LIZ()).LIZ(EnumC100693xJ.ENTER_SESSION_LIST);
        C107064Ic.LIZ();
        if (((Number) C4D2.LIZ.getValue()).intValue() == 1) {
            C78866UxK.LJJLIIIIJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C3E6.LIZJ();
        C98533tp.LIZIZ();
        C3X0 c3x0 = this.LJLJLJ;
        Iterator it = ((ArrayList) c3x0.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((SessionListViewHolder) it.next()).U();
        }
        ORS.LJJLIL(C3SS.LJLIL, c3x0.LJLJJLL);
        EventBus.LIZJ().LJIJ(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C96963rI.LJ().getClass();
        C96963rI.LIZLLL().getClass();
        if (C84563To.LIZ()) {
            C84543Tm.LIZ();
        }
        this.LJLIL.requireContext();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C2U8.LIZ(new C82773Mr());
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final AbstractC029409q<?> LJIIJ() {
        return this.LJZI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<Integer> LJIIL() {
        return this.LLFII;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<EnumC94693nd> LJIILIIL() {
        return this.LLFF;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final MutableLiveData<Boolean> LJIILJJIL() {
        return this.LLD;
    }

    public static List LJIILLIIL(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C3L4 c3l4 = (C3L4) it.next();
            int i = c3l4.LJLZ;
            long max = Math.max(c3l4.LJLJL, c3l4.LJLLI) / 1000;
            if (c3l4.LJLLILLLL > 0) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new C3ML(i, max, 100, z, c3l4));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int LJIIIZ(int i) {
        return this.LJLJL.qp0(i);
    }

    public final void LJIIZILJ(List<C3L4> list) {
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            ActivityStatus activityStatus = null;
            if (i >= 0) {
                C3L4 c3l4 = (C3L4) next;
                if (c3l4 instanceof C3L3) {
                    C3L3 c3l3 = (C3L3) c3l4;
                    IMUser LJIJI = c3l3.LJIJI();
                    if (LJIJI != null) {
                        if (AV1.LJIJI(LJIJI.getUid())) {
                            String uid = LJIJI.getUid();
                            o.LJIIIIZZ(uid, "user.uid");
                            activityStatus = new ActivityStatus(uid, System.currentTimeMillis() / 1000, 0L, 4, null);
                        } else {
                            LiveData<ActivityStatus> liveData = this.LJLZ.get(c3l3.LJFF());
                            if (liveData == null || (activityStatus = liveData.getValue()) == null) {
                                activityStatus = this.LJZ.get(c3l3.LJFF());
                            }
                        }
                    }
                    ListProtector.set(list, i, C3KN.LIZIZ(c3l3, activityStatus));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void LJIJI(C3OH c3oh) {
        C3L3 c3l3;
        IMUser LJIJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("observeActivityStatus ");
        LIZ.append(this.LJLLI);
        LIZ.append("  ");
        LIZ.append(c3oh);
        C34B.LIZIZ("FocusedSessionListWidget", X1D.LIZIZ(LIZ));
        if (!this.LJLLI) {
            return;
        }
        Iterator<LiveData<ActivityStatus>> it = this.LJLZ.values().iterator();
        while (it.hasNext()) {
            it.next().removeObservers(this);
        }
        this.LJLZ.clear();
        if (!C3KN.LIZ()) {
            if (this.LJLJL.Fg0()) {
                this.LJZ.clear();
                LJIJJ(c3oh);
                return;
            }
            return;
        }
        this.LJLJL.jt0();
        Iterator it2 = ((ArrayList) ORZ.LLJILJILJ(c3oh.LIZ)).iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                C3L4 c3l4 = (C3L4) next;
                if ((c3l4 instanceof C3L3) && !(c3l4 instanceof C3L2) && (LJIJI = (c3l3 = (C3L3) c3l4).LJIJI()) != null && LJIJI.getUid() != null && !AV1.LJIJI(LJIJI.getUid()) && LJIJI.getFollowStatus() == 2) {
                    C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
                    String uid = LJIJI.getUid();
                    o.LJIIIIZZ(uid, "user.uid");
                    LiveData<ActivityStatus> LIZ2 = C3B3.LIZ(activityStatusViewModel, uid, C3BA.INBOX, EnumC112364b2.CHAT_CELL.getValue(), 2);
                    LIZ2.observe(this, new AObserverS62S0300000_1(this, c3l4, c3oh, 0));
                    ConcurrentHashMap<String, LiveData<ActivityStatus>> concurrentHashMap = this.LJLZ;
                    String LJFF = c3l3.LJFF();
                    o.LJIIIIZZ(LJFF, "session.sessionID");
                    concurrentHashMap.put(LJFF, LIZ2);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void LJIJJ(C3OH c3oh) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionListUpdate: ");
        LIZ.append(c3oh);
        C34B.LIZIZ("FocusedSessionListWidget", X1D.LIZIZ(LIZ));
        this.LJLLLLLL.kv0(c3oh.LIZ);
        this.LJLJL.V().set(c3oh.LIZIZ);
        List<C3L4> LLJILJILJ = ORZ.LLJILJILJ(c3oh.LIZ);
        LJIIZILJ(LLJILJILJ);
        if (this.LJLLL) {
            this.LLIIII.onNext(new C3MD((List<C3ML>) LJIILLIIL(LLJILJILJ), c3oh.LIZIZ, c3oh.LIZJ, c3oh.LIZLLL, c3oh.LJ, IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().hasUnreadMessageRequest()));
        } else {
            this.LJLJLJ.submitList(LLJILJILJ);
        }
    }

    @QD3
    public final void onEvent(C31M event) {
        o.LJIIIZ(event, "event");
        C31N.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @X.QD3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(X.C3ST r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L49
            android.content.Intent r0 = r5.LJLIL
            r2 = 0
            if (r0 == 0) goto L4c
            android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r0)
            if (r1 == 0) goto L4d
            java.lang.String r0 = "enter_from"
            java.lang.String r0 = r1.getString(r0)
        L13:
            r4.LLFZ = r0
            if (r1 == 0) goto L4a
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r1.getString(r0)
        L1d:
            r4.LLI = r0
            if (r1 == 0) goto L2b
            java.lang.String r0 = "message_cnt"
            int r0 = r1.getInt(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L2b:
            r4.LLIFFJFJJ = r2
            java.lang.String r0 = r4.LLFZ
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L49
            boolean r0 = r4.LLII
            if (r0 != 0) goto L49
            java.lang.String r3 = r4.LLFZ
            java.lang.String r2 = r4.LLI
            java.lang.Integer r1 = r4.LLIFFJFJJ
            X.3SR r0 = r4.LJLJL
            r0.Fd(r3, r2)
            X.3SR r0 = r4.LJLJL
            r0.Gr0(r1, r3, r2)
        L49:
            return
        L4a:
            r0 = r2
            goto L1d
        L4c:
            r1 = r2
        L4d:
            r0 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget.onNewIntent(X.3ST):void");
    }

    @QD3
    public final void onTabChangeEvent(C209108Io event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLILLLLZI, "NOTIFICATION")) {
            if (this.LLFZ == null || this.LLI == null) {
                LJIJ();
            } else {
                if (!this.LLII) {
                    return;
                }
                this.LJLJL.Fd(this.LLFZ, this.LLI);
            }
        }
    }

    @Override // X.MLD
    public final void I0(int i, int i2) {
        this.LJLJL.I0(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void LJII(int i, C96533qb uiStyleConfig) {
        o.LJIIIZ(uiStyleConfig, "uiStyleConfig");
        if (this.LJLLL) {
            return;
        }
        C3X0 c3x0 = this.LJLJLJ;
        c3x0.getClass();
        c3x0.LJLJI.put(i, uiStyleConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusedSessionListWidget(InboxFragment fragment, LiveData parentWidgetState, boolean z) {
        super(fragment, parentWidgetState);
        o.LJIIIZ(fragment, "fragment");
        FocusedSessionListViewModelImpl focusedSessionListViewModel = (FocusedSessionListViewModelImpl) ViewModelProviders.of(fragment, (IDFactoryS60S0000000_1) FocusedSessionListViewModelImpl.LJLLL.getValue()).get(FocusedSessionListViewModelImpl.class);
        o.LJIIIZ(focusedSessionListViewModel, "focusedViewModel");
        o.LJIIIZ(fragment, "fragment");
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        C3X0 c3x0 = new C3X0(focusedSessionListViewModel, new C3OA(requireActivity, "notification_page", "cell"));
        AbstractC73946T0k LIZ = T16.LIZ();
        o.LJIIIIZZ(LIZ, "io()");
        AbstractC73946T0k LIZIZ = C73969T1h.LIZIZ();
        boolean LIZ2 = C107454Jp.LIZ();
        boolean LIZLLL = C53432Ky4.LIZLLL();
        int LIZIZ2 = C53432Ky4.LIZIZ();
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
        o.LJIIIZ(focusedSessionListViewModel, "focusedSessionListViewModel");
        this.LJLJL = focusedSessionListViewModel;
        this.LJLJLJ = c3x0;
        this.LJLJLLL = LIZ;
        this.LJLL = LIZIZ;
        this.LJLLI = LIZ2;
        this.LJLLILLLL = LIZLLL;
        this.LJLLJ = LIZIZ2;
        this.LJLLL = z;
        this.LJLLLL = new C73318Sq2();
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        o.LJI(mo49getActivity);
        SessionListReadStatusViewModel LIZ3 = C84203Se.LIZ(mo49getActivity);
        LIZ3.hv0(new AqS148S0200000_1(fragment, LIZ3, 60));
        this.LJLLLLLL = LIZ3;
        this.LJLZ = new ConcurrentHashMap<>();
        this.LJZ = new ConcurrentHashMap<>();
        this.LJZI = c3x0;
        this.LJZL = true;
        this.LL = C221108m2.LIZIZ(new AqS148S0200000_1(fragment, this, 61));
        this.LLD = focusedSessionListViewModel.LJLJJL;
        MutableLiveData<EnumC94693nd> mutableLiveData = new MutableLiveData<>();
        this.LLF = mutableLiveData;
        this.LLFF = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LLFFF = mutableLiveData2;
        this.LLFII = mutableLiveData2;
        this.LLIIII = new C73849Syb<>();
        this.LLIIIILZ = C221108m2.LIZIZ(C3SU.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void LJIILL(int i, int i2, Intent intent) {
        if (i == 1101 && i2 == 11) {
            this.LJLJL.Fd(null, null);
        }
    }
}
