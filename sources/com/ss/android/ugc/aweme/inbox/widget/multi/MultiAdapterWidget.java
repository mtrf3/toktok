package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC029409q;
import X.AbstractC56676MMe;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C221018lt;
import X.C221108m2;
import X.C35886E6o;
import X.C3ML;
import X.C52548Kjo;
import X.C52926Kpu;
import X.C53339KwZ;
import X.C53364Kwy;
import X.C53432Ky4;
import X.C54251LQx;
import X.C54262LRi;
import X.C54362LVe;
import X.C56641MKv;
import X.C56650MLe;
import X.C56652MLg;
import X.C56657MLl;
import X.C56660MLo;
import X.C56661MLp;
import X.C56662MLq;
import X.C56664MLs;
import X.C56665MLt;
import X.C56678MMg;
import X.C56947MWp;
import X.C57143Mbj;
import X.C62822Ol8;
import X.C73426Srm;
import X.C76965UIn;
import X.C78999UzT;
import X.C87652Yae;
import X.C96533qb;
import X.ENR;
import X.EnumC58046MqI;
import X.EnumC94693nd;
import X.HH1;
import X.IKE;
import X.InterfaceC64592gB;
import X.L2P;
import X.LKR;
import X.ML1;
import X.MLD;
import X.MMG;
import X.MMJ;
import X.MR4;
import X.MS5;
import X.QD3;
import X.TBT;
import X.UTK;
import X.V10;
import X.X1D;
import X.XKX;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import Y.AfS61S0100000_9;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class MultiAdapterWidget extends InboxAdapterWidget implements MLD {
    public final boolean LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public InsertStory LJLLLLLL;
    public String LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;

    @Override // X.MLD
    public final void I0(int i, int i2) {
    }

    @Override // X.MLD
    public final void LJIIJJI() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LJLLL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        int i;
        boolean z;
        Context context;
        Integer M;
        this.LJLLL = true;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings != null && (M = privacyUserSettings.M("direct_message")) != null) {
            i = M.intValue();
        } else {
            i = 0;
        }
        if (this.LJLLI) {
            this.LJLLI = false;
            this.LJLLLL = i;
            C221018lt.LJFF("MultiAdapterWidget", "onResume by created");
            return;
        }
        if (!LJIJ()) {
            C221018lt.LJFF("MultiAdapterWidget", "onResume but not in inbox tab");
            return;
        }
        if (C53339KwZ.LJ()) {
            SkylightMediaListViewModel LIZLLL = C56652MLg.LIZLLL(this);
            if (LIZLLL.LJLJJLL != null) {
                z = true;
            } else {
                z = false;
            }
            LIZLLL.LJLJJLL = null;
        } else if (L2P.LIZ()) {
            SkylightListViewModel LIZJ = C56652MLg.LIZJ(this);
            if (LIZJ.LJLJJL != null) {
                z = true;
            } else {
                z = false;
            }
            LIZJ.LJLJJL = null;
        } else {
            InboxTopHorizontalListVM inboxTopHorizontalListVM = (InboxTopHorizontalListVM) this.LJZ.getValue();
            if (inboxTopHorizontalListVM.LJLLLL != null) {
                z = true;
            } else {
                z = false;
            }
            inboxTopHorizontalListVM.LJLLLL = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResume hasNewNotice=");
        C76965UIn.LIZJ(LIZ, this.LJLLILLLL, ", backFromStoryPlayer=", z, ", noticeDeleted=");
        LIZ.append(LJIILLIIL().LLIIL);
        LIZ.append(", noticeUpdate=");
        HH1.LIZIZ(LIZ, LJIILLIIL().LLIILII, LIZ, "MultiAdapterWidget");
        if (z && (context = this.LJLIL.getContext()) != null) {
            ((IAppWidgetService) this.LJZI.getValue()).LJIILLIIL(context);
        }
        if (this.LJLLILLLL) {
            this.LJLLILLLL = false;
            C56641MKv.LIZ(ML1.LJLIL);
            MultiViewModel LJIILLIIL = LJIILLIIL();
            LJIILLIIL.getClass();
            MS5.LJI(new C56665MLt(false, z, LJIILLIIL));
            return;
        }
        if (LJIILLIIL().LLIIL || LJIILLIIL().LLIILII) {
            LJIILLIIL().ov0(2);
            return;
        }
        long j = LJIILLIIL().LLIIJI;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - j;
        C62822Ol8 c62822Ol8 = C87652Yae.LJ;
        boolean z2 = j2 >= ((Number) c62822Ol8.getValue()).longValue();
        StringBuilder LIZJ2 = V10.LIZJ("expiredByTabChange ", currentTimeMillis, " - ");
        LIZJ2.append(j);
        LIZJ2.append(" >= ");
        LIZJ2.append(((Number) c62822Ol8.getValue()).longValue());
        LIZJ2.append(" = ");
        LIZJ2.append(z2);
        C221018lt.LJFF("InboxRefreshSettings", X1D.LIZIZ(LIZJ2));
        if (z2) {
            C56641MKv.LIZ(ML1.LJLIL);
            if (z) {
                LJIILLIIL().ov0(34);
                return;
            } else {
                LJIILLIIL().ov0(2);
                return;
            }
        }
        if (C52548Kjo.LIZ() && i > 0 && i != this.LJLLLL) {
            this.LJLLLL = i;
            LJIILLIIL().ov0(2);
            return;
        }
        MultiViewModel LJIILLIIL2 = LJIILLIIL();
        if (LJIILLIIL2.LLIL != 0) {
            MS5.LJI(new AqS159S0100000_9(LJIILLIIL2, 837));
        }
        if (C53339KwZ.LJ()) {
            C56652MLg.LIZLLL(this).setState(C56662MLq.LJLIL);
        } else if (L2P.LIZ()) {
            C56652MLg.LIZJ(this).setState(C56661MLp.LJLIL);
        } else {
            ((AssemViewModel) this.LJZ.getValue()).setState(C56664MLs.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.MLD
    public final AbstractC73672Svk<List<C3ML>> LIZJ() {
        AbstractC73672Svk abstractC73672Svk = (AbstractC73672Svk) this.LJZL.getValue();
        abstractC73672Svk.getClass();
        return new C73426Srm(abstractC73672Svk).LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final AbstractC029409q<?> LJIIJ() {
        return (AbstractC029409q) this.LJLJLLL.getValue();
    }

    public final MultiViewModel LJIILLIIL() {
        return (MultiViewModel) this.LJLJLJ.getValue();
    }

    public final boolean LJIJ() {
        ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
        if (mo49getActivity != null) {
            return LKR.LIZIZ(mo49getActivity, "NOTIFICATION");
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
    
        if (r7 != false) goto L16;
     */
    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.MLD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r12 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onRefresh isTabChange="
            r1.append(r0)
            boolean r0 = r12.LJLLJ
            r1.append(r0)
            java.lang.String r0 = ", hasNewNotice="
            r1.append(r0)
            boolean r0 = r12.LJLLILLLL
            r1.append(r0)
            java.lang.String r0 = ", isRefreshByTabChange="
            r1.append(r0)
            X.Ol8 r2 = X.C87652Yae.LIZJ
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "MultiAdapterWidget"
            X.C221018lt.LJFF(r0, r1)
            X.ML1 r0 = X.ML1.LJLIL
            X.C56641MKv.LIZ(r0)
            boolean r0 = r12.LJLLJ
            r5 = 2
            if (r0 == 0) goto Lbf
            boolean r0 = r12.LJLLILLLL
            r6 = 0
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel r2 = r12.LJIILLIIL()
            boolean r1 = r12.LJLLJ
            r2.getClass()
            X.MLt r0 = new X.MLt
            r0.<init>(r1, r6, r2)
            X.MS5.LJI(r0)
        L56:
            r12.LJLLJ = r6
            r12.LJLLILLLL = r6
        L5a:
            return
        L5b:
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb4
            com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel r0 = r12.LJIILLIIL()
            long r3 = r0.LLIIJI
            long r0 = java.lang.System.currentTimeMillis()
            long r10 = r0 - r3
            X.Ol8 r9 = X.C87652Yae.LIZLLL
            java.lang.Object r2 = r9.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            long r7 = r2.longValue()
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 < 0) goto Lbd
            r7 = 1
        L84:
            java.lang.String r8 = "expiredByTabChange "
            java.lang.String r2 = " - "
            java.lang.StringBuilder r2 = X.V10.LIZJ(r8, r0, r2)
            r2.append(r3)
            java.lang.String r0 = " >= "
            r2.append(r0)
            java.lang.Object r0 = r9.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r2.append(r0)
            java.lang.String r0 = " = "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "InboxRefreshSettings"
            X.C221018lt.LJFF(r0, r1)
            if (r7 == 0) goto L56
        Lb4:
            com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel r0 = r12.LJIILLIIL()
            r0.ov0(r5)
            goto L56
        Lbd:
            r7 = 0
            goto L84
        Lbf:
            com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel r0 = r12.LJIILLIIL()
            r0.ov0(r5)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget.LJ():void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<Boolean> LJIIIIZZ() {
        return LJIILLIIL().LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<EnumC94693nd> LJIILIIL() {
        return LJIILLIIL().LJLJJI;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        int i;
        NoticeList noticeList;
        LJIILLIIL().LJLILLLLZI.observe(this, new AObserverS77S0100000_9(this, 73));
        if (C53339KwZ.LJ()) {
            AssemViewModel.asyncSubscribe$default(C56652MLg.LIZLLL(this.LJLIL), new TBT() { // from class: X.MLr
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((InboxSkylightListState) obj).getRefreshState();
                }
            }, null, null, C56660MLo.LJLIL, new AqS175S0100000_9(this, 437), 6, null);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLLI = true;
        C56641MKv.LIZ(ML1.LJLIL);
        MultiViewModel LJIILLIIL = LJIILLIIL();
        LJIILLIIL.getClass();
        C56678MMg.LIZ.LIZ();
        if (C53364Kwy.LIZ()) {
            List<InboxEntranceCell> LJFF = C56678MMg.LJFF();
            LJIILLIIL.kv0(LJFF);
            LJIILLIIL.LLIIIZ = PreloadManager.LIZ();
            if (C53432Ky4.LJ() && !LJIILLIIL.LLIIIZ && (noticeList = PreloadManager.LIZJ.get()) != null) {
                C54362LVe.LJIJI(noticeList).LJJJLIIL(new InterfaceC64592gB() { // from class: X.2aE
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("rxInitNoticeCount,onNext result = ");
                        LIZ.append(obj);
                        C221018lt.LJFF("MultiViewModel", X1D.LIZIZ(LIZ));
                    }
                }, new InterfaceC64592gB() { // from class: X.2aF
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("rxInitNoticeCount,onError result = ");
                        LIZ.append(obj);
                        C221018lt.LJFF("MultiViewModel", X1D.LIZIZ(LIZ));
                    }
                });
            }
            MMJ.ENTRANCE_LIST_PRELOAD_IS_CANCELLED.setValue(Integer.valueOf(PreloadManager.LIZ() ? 1 : 0));
            MMJ mmj = MMJ.ENTRANCE_LIST_IS_PRELOAD;
            if (LJFF != null) {
                i = 1;
            } else {
                i = 0;
            }
            mmj.setValue(Integer.valueOf(i));
        }
        if (C53364Kwy.LIZ()) {
            if (LJIILLIIL.LLFFF == null) {
                LJIILLIIL.LLFFF = LJIILLIIL.LLFF;
            }
            if (LJIILLIIL.LL == null) {
                LJIILLIIL.LL = LJIILLIIL.LJZL;
            }
            if (LJIILLIIL.LJLZ == null) {
                LJIILLIIL.LJLZ = LJIILLIIL.LJZ;
            }
        }
        if (C53432Ky4.LIZLLL()) {
            C221018lt.LJFF("MultiViewModel", "onInitRefresh-cacheWithSkeleton");
            LJIILLIIL.sv0(true);
        } else if (((Boolean) C53432Ky4.LIZIZ.getValue()).booleanValue()) {
            C221018lt.LJFF("MultiViewModel", "onInitRefresh-cacheWithoutSkeleton");
            LJIILLIIL.sv0(false);
        } else {
            LJIILLIIL.rv0(true);
        }
        if (C52926Kpu.LIZ()) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(LJIILLIIL), null, null, new C57143Mbj(LJIILLIIL, null), 3);
        } else {
            C78999UzT.LJFF(UTK.LIZIZ.LJFF(EnumC58046MqI.CONTACT).LIZIZ().LJJJJZI(new AfS61S0100000_9(LJIILLIIL, 39)), LJIILLIIL.LJLJL);
        }
        LJIILLIIL().ov0(2);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int LJIIIZ(int i) {
        List list = (List) LJIILLIIL().LJLILLLLZI.getValue();
        if (list == null || i < 0) {
            return -1;
        }
        int size = list.size();
        while (i < size) {
            if (((AbstractC56676MMe) ListProtector.get(list, i)).isUnread()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(java.util.List<? extends X.AbstractC56676MMe> r8) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget.LJIIZILJ(java.util.List):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowRequestFinished(C56947MWp event) {
        o.LJIIIZ(event, "event");
        LJIILLIIL().LLIIJLIL++;
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChangedEvent(C54262LRi event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI != 2) {
            return;
        }
        int i = event.LJLJI;
        if (i == 301) {
            C221018lt.LJFF("MultiAdapterWidget", "refactor notice count init finish");
            return;
        }
        if (i != 201) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRedPointUpdate isResume=");
        HH1.LIZIZ(LIZ, this.LJLLL, LIZ, "MultiAdapterWidget");
        if (!this.LJLLL || !LJIJ()) {
            this.LJLLILLLL = true;
            return;
        }
        C221018lt.LJFF("MultiAdapterWidget", "onRedPointUpdate need refresh");
        this.LJLLILLLL = false;
        ((Handler) this.LJLL.getValue()).post(new ARunnableS45S0100000_9(this, 64));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNoticeDeleted(MR4 event) {
        o.LJIIIZ(event, "event");
        LJIILLIIL().LLIIL = true;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNoticeUpdate(IKE event) {
        o.LJIIIZ(event, "event");
        LJIILLIIL().LLIILII = true;
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRedPointUpdate(C54251LQx event) {
        boolean z;
        o.LJIIIZ(event, "event");
        if (ENR.LIZ()) {
            return;
        }
        int i = event.LJLIL;
        if (i == -3) {
            z = true;
        } else {
            z = false;
        }
        if (z && event.LJLJI == 2) {
            C221018lt.LJFF("MultiAdapterWidget", "notice count init finish");
            return;
        }
        if (i == -3 && event.LJLJI == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRedPointUpdate isResume=");
            HH1.LIZIZ(LIZ, this.LJLLL, LIZ, "MultiAdapterWidget");
            if (!this.LJLLL || !LJIJ()) {
                this.LJLLILLLL = true;
                return;
            }
            C221018lt.LJFF("MultiAdapterWidget", "onRedPointUpdate need refresh");
            this.LJLLILLLL = false;
            ((Handler) this.LJLL.getValue()).post(new ARunnableS45S0100000_9(this, 65));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void LJII(int i, C96533qb uiStyleConfig) {
        o.LJIIIZ(uiStyleConfig, "uiStyleConfig");
        if (this.LJLJL) {
            return;
        }
        MMG mmg = (MMG) this.LJLJLLL.getValue();
        mmg.getClass();
        mmg.LJLJJI.put(i, uiStyleConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAdapterWidget(InboxFragment fragment, LiveData parentWidgetState, boolean z) {
        super(fragment, parentWidgetState);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
        this.LJLJL = z;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(fragment, 829));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(fragment, 825));
        this.LJLL = C221108m2.LIZIZ(C35886E6o.INSTANCE);
        this.LJZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 828));
        this.LJZI = C221108m2.LIZIZ(C56657MLl.LJLIL);
        this.LJZL = C221108m2.LIZIZ(C56650MLe.LJLIL);
    }
}
