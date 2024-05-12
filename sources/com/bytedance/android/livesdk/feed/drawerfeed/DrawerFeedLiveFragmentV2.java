package com.bytedance.android.livesdk.feed.drawerfeed;

import X.AbstractC030309z;
import X.AbstractC28694BNy;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass172;
import X.BL7;
import X.BMN;
import X.BN3;
import X.BO0;
import X.BO1;
import X.BO2;
import X.BO3;
import X.BO4;
import X.BO5;
import X.BO6;
import X.BO8;
import X.BOX;
import X.BTJ;
import X.BZI;
import X.C03660Ck;
import X.C03880Dg;
import X.C08660Vq;
import X.C08680Vs;
import X.C08700Vu;
import X.C0A2;
import X.C10A;
import X.C12800eq;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C223318pb;
import X.C278917p;
import X.C279317t;
import X.C28594BKc;
import X.C28686BNq;
import X.C28688BNs;
import X.C28692BNw;
import X.C28787BRn;
import X.C29S;
import X.C2NU;
import X.C32789Ctt;
import X.C38354F3m;
import X.C3C5;
import X.C65300Pk0;
import X.C73933Szx;
import X.C73943T0h;
import X.C73969T1h;
import X.C76800UCe;
import X.C90903hW;
import X.CN1;
import X.EnumC12790ep;
import X.InterfaceC28689BNt;
import X.InterfaceC29856Bng;
import X.InterfaceC74170T9a;
import X.JBR;
import X.Q7L;
import X.X1D;
import Y.ACListenerS32S0101000_15;
import Y.ALAdapterS4S0100000_5;
import Y.AObserverS58S0101000_2;
import Y.AObserverS60S0101000_5;
import Y.AfS36S0101000_5;
import Y.AfS37S0000000_5;
import Y.AfS57S0100000_5;
import Y.IDHandlerS18S0100000_5;
import Y.IDcS37S0100000_5;
import Y.IDrS45S0100000_5;
import Y.IDrS53S0100000_15;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.livesetting.feed.FeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerDrawOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerLoadOptSetting;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class DrawerFeedLiveFragmentV2 extends BaseFragment implements BMN {
    public static final /* synthetic */ int LJZ = 0;
    public C223318pb LJLIL;
    public RecyclerView LJLILLLLZI;
    public View LJLJI;
    public C28686BNq LJLJJI;
    public GridLayoutManager LJLJJL;
    public BO1 LJLJJLL;
    public TabFeedViewModel LJLJL;
    public ItemTab LJLJLJ;
    public BL7 LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public long LJLLJ;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public String LJLJLLL = "";
    public String LJLLL = "";

    @Override // X.BMN
    public final String D8() {
        return "";
    }

    @Override // X.BMN
    public final void Yj() {
    }

    @Override // X.BMN
    public final void i7() {
    }

    public final void Dl() {
        Al("click");
        if (getContext() != null) {
            ((IHostAction) CN1.LIZ(IHostAction.class)).handleSchema(getContext(), "sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={request_from:explore}", new Bundle());
        }
    }

    @Override // X.BMN
    public final int Ef() {
        int i = (LiveFeedPreloadSetting.INSTANCE.getValue().feedPreloadStyleTwo - 1) * 2;
        if (i <= 1) {
            int value = FeedPreloadSetting.INSTANCE.getValue();
            if (value <= 1) {
                return 4;
            }
            return value;
        }
        return i;
    }

    @Override // X.BMN
    public final String url() {
        if (!C38354F3m.LJ(this.LJLJLLL)) {
            return this.LJLJLLL;
        }
        return "";
    }

    public final void vl() {
        boolean z;
        if (this.LJLZ) {
            return;
        }
        if (getUserVisibleHint() && isResumed()) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLLLLLL == z) {
            return;
        }
        this.LJLLLLLL = z;
        if (z) {
            if (this.LJLLI) {
                Al("show");
            }
            TabFeedViewModel tabFeedViewModel = this.LJLJL;
            if (tabFeedViewModel != null) {
                tabFeedViewModel.mv0(true);
            }
            C28686BNq c28686BNq = this.LJLJJI;
            if (c28686BNq != null) {
                c28686BNq.LLFF = true;
                c28686BNq.LL.onNext(Boolean.TRUE);
                C28686BNq c28686BNq2 = this.LJLJJI;
                c28686BNq2.LJZI.onNext(BTJ.LIZJ);
                c28686BNq2.LLF = false;
            }
            if (this.LJLLLL) {
                xl();
                return;
            }
            return;
        }
        TabFeedViewModel tabFeedViewModel2 = this.LJLJL;
        if (tabFeedViewModel2 != null) {
            tabFeedViewModel2.mv0(false);
            GridLayoutManager gridLayoutManager = this.LJLJJL;
            if (gridLayoutManager != null) {
                this.LJLJL.LLIFFJFJJ = gridLayoutManager.LLIL();
                View LJJIJIL = this.LJLJJL.LJJIJIL(this.LJLJL.LLIFFJFJJ);
                if (LJJIJIL != null) {
                    this.LJLJL.LLII = LJJIJIL.getTop();
                }
            }
        }
        C28686BNq c28686BNq3 = this.LJLJJI;
        if (c28686BNq3 == null) {
            return;
        }
        c28686BNq3.LLFF = false;
        c28686BNq3.LL.onNext(Boolean.FALSE);
        this.LJLJJI.LJZL.onNext(BTJ.LIZJ);
    }

    public final void xl() {
        String str;
        C28686BNq c28686BNq = this.LJLJJI;
        if (c28686BNq != null) {
            boolean z = false;
            if (c28686BNq.LJZL() == 0 || (this.LJLJJI.LJZL() == 1 && this.LJLJJI.LJJIZ(0).type == 1005)) {
                getContext();
                try {
                    z = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                }
                if (z) {
                    str = "abnormal_error";
                } else {
                    str = "network_error";
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_explore_page_show");
                LIZ.LJIJJ(str, "show_type");
                C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
                LIZ.LJIJJ(c08680Vs.LJ, "show_method");
                LIZ.LJIJJ(this.LJLLL, "tab_type");
                LIZ.LJIJJ(c08680Vs.LJIIJJI, "landing_reason");
                LIZ.LJIJJ(c08680Vs.LJIIJ, "from_drawer_tab");
                LIZ.LJIJJ(Integer.valueOf(c08680Vs.LJFF()), C08680Vs.LJIIZILJ);
                LIZ.LJIJJ(C08660Vq.LIZ(), C08680Vs.LJIJ);
                LIZ.LJIJJ(c08680Vs.LIZIZ(), "entrance_type");
                LIZ.LJIIZILJ();
                LIZ.LJIIIIZZ();
                LIZ.LJJIIJZLJL();
            }
        }
        str = "normal";
        BZI LIZ2 = C28787BRn.LIZ("livesdk_explore_page_show");
        LIZ2.LJIJJ(str, "show_type");
        C08680Vs c08680Vs2 = C08680Vs.LJIILJJIL;
        LIZ2.LJIJJ(c08680Vs2.LJ, "show_method");
        LIZ2.LJIJJ(this.LJLLL, "tab_type");
        LIZ2.LJIJJ(c08680Vs2.LJIIJJI, "landing_reason");
        LIZ2.LJIJJ(c08680Vs2.LJIIJ, "from_drawer_tab");
        LIZ2.LJIJJ(Integer.valueOf(c08680Vs2.LJFF()), C08680Vs.LJIIZILJ);
        LIZ2.LJIJJ(C08660Vq.LIZ(), C08680Vs.LJIJ);
        LIZ2.LJIJJ(c08680Vs2.LIZIZ(), "entrance_type");
        LIZ2.LJIIZILJ();
        LIZ2.LJIIIIZZ();
        LIZ2.LJJIIJZLJL();
    }

    public DrawerFeedLiveFragmentV2() {
        new IDHandlerS18S0100000_5(this, C16880lQ.LLJJJJ(), 2);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        vl();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        vl();
        this.LJLZ = false;
    }

    public static void Al(String str) {
        HashMap LIZJ = C03660Ck.LIZJ("action_type", str);
        BZI LIZ = C28787BRn.LIZ("livesdk_explore_live_take_button");
        LIZ.LJJIFFI(LIZJ);
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C28686BNq c28686BNq = this.LJLJJI;
        c28686BNq.notifyItemRangeChanged(0, c28686BNq.getItemCount());
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C12800eq.LJFF(EnumC12790ep.LiveFeedInit);
        super.onCreate(bundle);
        C28594BKc.LIZJ();
        if (!TextUtils.isEmpty(null)) {
            this.LJLJLLL = null;
        }
        List<ItemTab> LIZJ = BOX.LJFF().LIZJ();
        if (LIZJ != null && ((ArrayList) LIZJ).size() > 0) {
            ItemTab itemTab = (ItemTab) ListProtector.get(LIZJ, 0);
            this.LJLJLJ = itemTab;
            this.LJLJLLL = itemTab.getUrl();
        }
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(C08700Vu.class).LJII(BTJ.LIZIZ(this)).LIZJ(C73933Szx.LIZLLL(this))).LIZIZ(new AfS36S0101000_5(5, this, 3));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        boolean z2 = true;
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "667955207939830057");
        if (c03880Dg.LIZJ(10502, "com/bytedance/android/livesdk/feed/drawerfeed/DrawerFeedLiveFragmentV2", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/bytedance/android/livesdk/feed/drawerfeed/DrawerFeedLiveFragmentV2", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (!z || !this.LJLL.isOpen()) {
            z2 = false;
        }
        super.setUserVisibleHint(z2);
        vl();
        c03880Dg.LIZIZ(10502, "com/bytedance/android/livesdk/feed/drawerfeed/DrawerFeedLiveFragmentV2", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        String str;
        final String str2;
        super.onViewCreated(view, bundle);
        this.LJLJJLL = new BO1(new FeedRepository(new BN3(), (FeedApi) Q7L.LIZIZ(FeedApi.class), new C278917p(), new C279317t()));
        final String str3 = this.LJLLL;
        final C28688BNs c28688BNs = new C28688BNs(str3);
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(R.layout.d77), new InterfaceC28689BNt() { // from class: X.BNu
            /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            @Override // X.InterfaceC28689BNt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.BNR LIZ(android.view.ViewGroup r10, java.lang.Object[] r11) {
                /*
                    r9 = this;
                    java.lang.String r8 = r1
                    r0 = 2131563675(0x7f0d149b, float:1.8752814E38)
                    r1 = 0
                    r7 = r10
                    android.view.View r3 = X.C28289B8j.LIZ(r7, r0, r7, r1)
                    int r0 = r11.length
                    r2 = 0
                    if (r0 <= 0) goto L4d
                    r1 = r11[r1]
                    boolean r0 = r1 instanceof X.InterfaceC28693BNx
                    if (r0 == 0) goto L4d
                    X.BNx r1 = (X.InterfaceC28693BNx) r1
                    com.bytedance.android.livesdk.feed.feed.FeedDataKey r4 = r1.LIZ()
                L1b:
                    int r1 = r11.length
                    r0 = 1
                    if (r1 <= r0) goto L4b
                    r5 = r11[r0]
                    boolean r0 = r5 instanceof X.C73893SzJ
                    if (r0 == 0) goto L4b
                    X.SzJ r5 = (X.C73893SzJ) r5
                L27:
                    int r1 = r11.length
                    r0 = 2
                    if (r1 <= r0) goto L2f
                    r0 = r11[r0]
                    boolean r0 = r0 instanceof X.C73893SzJ
                L2f:
                    int r1 = r11.length
                    r0 = 3
                    if (r1 <= r0) goto L37
                    r0 = r11[r0]
                    boolean r0 = r0 instanceof X.C73893SzJ
                L37:
                    int r1 = r11.length
                    r0 = 4
                    if (r1 <= r0) goto L49
                    r6 = r11[r0]
                    boolean r0 = r6 instanceof X.C73893SzJ
                    if (r0 == 0) goto L49
                    X.SzJ r6 = (X.C73893SzJ) r6
                L43:
                    com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder r2 = new com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder
                    r2.<init>(r3, r4, r5, r6, r7, r8)
                    return r2
                L49:
                    r6 = r2
                    goto L43
                L4b:
                    r5 = r2
                    goto L27
                L4d:
                    r4 = r2
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C28690BNu.LIZ(android.view.ViewGroup, java.lang.Object[]):X.BNR");
            }
        });
        hashMap.put(Integer.valueOf(R.layout.djv), new InterfaceC28689BNt() { // from class: X.BNv
            /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
            @Override // X.InterfaceC28689BNt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.BNR LIZ(android.view.ViewGroup r12, java.lang.Object[] r13) {
                /*
                    r11 = this;
                    X.BNs r2 = X.C28688BNs.this
                    r2.getClass()
                    r9 = r12
                    android.content.Context r0 = r9.getContext()
                    android.view.LayoutInflater r3 = X.C16880lQ.LLZIL(r0)
                    r0 = 2131564181(0x7f0d1695, float:1.875384E38)
                    r1 = 0
                    android.view.View r4 = X.C16880lQ.LLLLIILL(r3, r0, r9, r1)
                    int r0 = r13.length
                    r3 = 0
                    if (r0 <= 0) goto L58
                    r1 = r13[r1]
                    boolean r0 = r1 instanceof X.InterfaceC28693BNx
                    if (r0 == 0) goto L58
                    X.BNx r1 = (X.InterfaceC28693BNx) r1
                    com.bytedance.android.livesdk.feed.feed.FeedDataKey r5 = r1.LIZ()
                L26:
                    int r1 = r13.length
                    r0 = 2
                    if (r1 <= r0) goto L56
                    r6 = r13[r0]
                    boolean r0 = r6 instanceof X.C73893SzJ
                    if (r0 == 0) goto L56
                    X.SzJ r6 = (X.C73893SzJ) r6
                L32:
                    int r1 = r13.length
                    r0 = 3
                    if (r1 <= r0) goto L54
                    r7 = r13[r0]
                    boolean r0 = r7 instanceof X.C73893SzJ
                    if (r0 == 0) goto L54
                    X.SzJ r7 = (X.C73893SzJ) r7
                L3e:
                    int r1 = r13.length
                    r0 = 4
                    if (r1 <= r0) goto L52
                    r8 = r13[r0]
                    boolean r0 = r8 instanceof X.C73893SzJ
                    if (r0 == 0) goto L52
                    X.SzJ r8 = (X.C73893SzJ) r8
                L4a:
                    X.BdU r3 = new X.BdU
                    java.lang.String r10 = r2.LIZ
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                    return r3
                L52:
                    r8 = r3
                    goto L4a
                L54:
                    r7 = r3
                    goto L3e
                L56:
                    r6 = r3
                    goto L32
                L58:
                    r5 = r3
                    goto L26
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C28691BNv.LIZ(android.view.ViewGroup, java.lang.Object[]):X.BNR");
            }
        });
        hashMap.put(Integer.valueOf(R.layout.djj), new InterfaceC28689BNt() { // from class: X.BNr
            @Override // X.InterfaceC28689BNt
            public final BNR LIZ(ViewGroup viewGroup, Object[] objArr) {
                C73893SzJ c73893SzJ;
                C28688BNs c28688BNs2 = C28688BNs.this;
                c28688BNs2.getClass();
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.djj, viewGroup, false);
                if (objArr.length > 4) {
                    Object obj = objArr[4];
                    if (obj instanceof C73893SzJ) {
                        c73893SzJ = (C73893SzJ) obj;
                        return new C28684BNo(LLLLIILL, c73893SzJ, c28688BNs2.LIZ);
                    }
                }
                c73893SzJ = null;
                return new C28684BNo(LLLLIILL, c73893SzJ, c28688BNs2.LIZ);
            }
        });
        this.LJLJJI = new C28686BNq(hashMap);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        BO1 bo1 = this.LJLJJLL;
        ItemTab itemTab = this.LJLJLJ;
        if (itemTab != null) {
            j = itemTab.getId();
        } else {
            j = 1;
        }
        bo1.LIZIZ = j;
        bo1.LIZJ = this;
        final TabFeedViewModel tabFeedViewModel = (TabFeedViewModel) ViewModelProviders.of(mo49getActivity, bo1).get(this.LJLLL, TabFeedViewModel.class);
        tabFeedViewModel.pv0();
        tabFeedViewModel.qv0();
        if (!TextUtils.isEmpty(this.LJLLL) && !TextUtils.equals(this.LJLLL, "foru")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enter_auto_vertical_");
            LIZ.append(this.LJLLL);
            str = X1D.LIZIZ(LIZ);
        } else {
            str = "drawer_enter_from_room";
        }
        tabFeedViewModel.LLIIIJ = !C38354F3m.LJ(str);
        tabFeedViewModel.LJLZ.ao0(str);
        tabFeedViewModel.LJLJJL.observe(this, new BO0(this));
        if (!TextUtils.isEmpty(this.LJLLL) && !TextUtils.equals(this.LJLLL, "foru")) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("vertical_");
            str2 = JBR.LJFF(LIZ2, this.LJLLL, "_refresh", LIZ2);
        } else {
            str2 = "drawer_refresh";
        }
        this.LJLIL.setOnRefreshListener(new InterfaceC74170T9a() { // from class: X.BMO
            @Override // X.InterfaceC74170T9a
            public final void LJ() {
                TabFeedViewModel tabFeedViewModel2 = TabFeedViewModel.this;
                tabFeedViewModel2.LJLZ.Qr(str2, null);
                tabFeedViewModel2.gv0();
            }
        });
        this.LJLJL = tabFeedViewModel;
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.LLIILII = new IDcS37S0100000_5(this, 5);
        this.LJLJJL = gridLayoutManager;
        BO3 bo3 = new BO3();
        bo3.LJI = mo49getActivity();
        bo3.LIZJ = this.LJLJL;
        RecyclerView recyclerView = this.LJLILLLLZI;
        bo3.LIZIZ = recyclerView;
        bo3.LJII = new C32789Ctt(this);
        bo3.LIZ = this.LJLJJI;
        bo3.LIZLLL = this.LJLJJL;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), this.LJLILLLLZI.getPaddingTop(), this.LJLILLLLZI.getPaddingRight(), this.LJLILLLLZI.getPaddingBottom());
        bo3.LJFF = new AbstractC030309z() { // from class: X.8BI
            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                int i;
                if (view2.getVisibility() == 0) {
                    i = C15380j0.LIZ(3.0f);
                } else {
                    i = 0;
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                if ((layoutParams instanceof C1BZ) && ((C1BZ) layoutParams).LJLILLLLZI) {
                    i = C15380j0.LIZ(3.0f);
                }
                int LIZ3 = C15380j0.LIZ(1.5f);
                rect.set(LIZ3, i, LIZ3, 0);
            }
        };
        bo3.LJ = 2;
        bo3.LJIIIIZZ = this.LJLLL;
        RecyclerView recyclerView2 = bo3.LIZIZ;
        if (recyclerView2 != null) {
            recyclerView2.setItemAnimator(null);
            AbstractC28694BNy abstractC28694BNy = bo3.LIZ;
            if (abstractC28694BNy != null) {
                BaseFeedDataViewModel baseFeedDataViewModel = bo3.LIZJ;
                if (baseFeedDataViewModel != null) {
                    LifecycleOwner lifecycleOwner = bo3.LJI;
                    if (lifecycleOwner != null) {
                        RecyclerView recyclerView3 = bo3.LIZIZ;
                        BO5 bo5 = new BO5(lifecycleOwner, abstractC28694BNy, recyclerView3, baseFeedDataViewModel);
                        C0A2 c0a2 = bo3.LIZLLL;
                        bo5.LIZLLL = c0a2;
                        if (c0a2 instanceof StaggeredGridLayoutManager) {
                            ((StaggeredGridLayoutManager) c0a2).LLJJIJIL(bo3.LJ);
                        }
                        bo5.LJI = bo3.LJII;
                        bo5.LJ = bo3.LJFF;
                        bo5.LJII = bo3.LJIIIIZZ;
                        abstractC28694BNy.LLFII = new Object[]{new C28692BNw(bo5), abstractC28694BNy.LJZ, abstractC28694BNy.LJZI, abstractC28694BNy.LJZL, abstractC28694BNy.LL, abstractC28694BNy.LLD};
                        recyclerView3.setAdapter(abstractC28694BNy);
                        recyclerView3.setLayoutManager(bo5.LIZLLL);
                        recyclerView3.LJIIJJI(new IDrS45S0100000_5(bo5, 10));
                        AbstractC030309z abstractC030309z = bo5.LJ;
                        if (abstractC030309z != null) {
                            recyclerView3.LJII(abstractC030309z, -1);
                        }
                        abstractC28694BNy.LLIIIJ(baseFeedDataViewModel);
                        abstractC28694BNy.LJZ.LJJJLIIL(new AfS57S0100000_5(bo5, 344), new AfS37S0000000_5(12));
                        abstractC28694BNy.LJZI.LJJJLIIL(new AfS36S0101000_5(1, bo5, 45), new AfS37S0000000_5(12));
                        baseFeedDataViewModel.start();
                        baseFeedDataViewModel.LJLZ.Rr(lifecycleOwner);
                        baseFeedDataViewModel.LJZ.observeForever(new AObserverS58S0101000_2(0, bo5, 19));
                        baseFeedDataViewModel.LJZL.observe(lifecycleOwner, new AObserverS60S0101000_5(0, bo5, 2));
                        this.LJLJL.mv0(getUserVisibleHint());
                        LiveDrawerLoadOptSetting liveDrawerLoadOptSetting = LiveDrawerLoadOptSetting.INSTANCE;
                        DrawerLoadOpt value = liveDrawerLoadOptSetting.getValue();
                        if (value != null && (!"foru".equals(this.LJLLL) ? !(!"game".equals(this.LJLLL) || (!value.isPreLoadingGameData && !value.isPreLoadingGameUI)) : !(!value.isPreLoadingForuData && !value.isPreLoadingForuUI)) && !this.LJLJL.LLIIIZ) {
                            register(AbstractC73672Svk.LJJIJIL(1).LJIIL(2L, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS36S0101000_5(1, this, 13)).LJJJJZ());
                        }
                        this.LJLJL.LJZL.observe(this, new AObserverS60S0101000_5(1, this, 0));
                        if (!LiveAudienceImageCacheRefactorSetting.INSTANCE.getValue()) {
                            this.LJLJL.LJZI.observe(this, new BO6());
                        }
                        AnonymousClass172.LIZ("live_enter", C03660Ck.LIZJ("event_belong", "tab_click"));
                        String tabType = this.LJLLL;
                        TabFeedViewModel model = this.LJLJL;
                        o.LJIIIZ(tabType, "tabType");
                        o.LJIIIZ(model, "model");
                        DrawerLoadOpt value2 = liveDrawerLoadOptSetting.getValue();
                        if (o.LJ("foru", tabType) && value2 != null && value2.isPreLoadingForuUI) {
                            BO2.LIZ().put(tabType, model);
                            return;
                        } else {
                            if (!o.LJ("game", tabType) || value2 == null || !value2.isPreLoadingGameUI) {
                                return;
                            }
                            BO2.LIZ().put(tabType, model);
                            return;
                        }
                    }
                    throw new IllegalStateException("lifecycleOwner must not be null");
                }
                throw new IllegalStateException("viewModel must not be null");
            }
            throw new IllegalStateException("adapter must not be null");
        }
        throw new IllegalStateException("recyclerView must not be null");
    }

    public final void wl(int i, View view) {
        View view2;
        boolean z;
        if (!this.LJLLI || this.LJLLILLLL || (view2 = this.LJLJI) == null) {
            return;
        }
        if (view2.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        float LIZ = C15380j0.LIZ(100.0f);
        if (i != 0) {
            if (i != 1 || z) {
                return;
            }
            this.LJLLILLLL = true;
            view.setVisibility(0);
            Al("show");
            view.setTranslationY(LIZ);
            view.animate().setDuration(300L).translationY(0.0f).setListener(new ALAdapterS4S0100000_5(this, 25)).alpha(1.0f).start();
            return;
        }
        if (!z) {
            return;
        }
        this.LJLLILLLL = true;
        view.animate().setDuration(300L).translationY(LIZ).setListener(new ALAdapterS4S0100000_5(this, 24)).alpha(0.0f).start();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        if (!LiveDrawerDrawOptSetting.INSTANCE.isOpt()) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3r, viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3s, viewGroup, false);
        }
        this.LJLILLLLZI = (RecyclerView) LLLLIILL.findViewById(R.id.ftq);
        this.LJLIL = (C223318pb) LLLLIILL.findViewById(R.id.kwp);
        this.LJLILLLLZI.LJIIJJI(new BO8());
        this.LJLILLLLZI.LJIIJJI(new IDrS53S0100000_15(this, 2));
        this.LJLJI = LLLLIILL.findViewById(R.id.lor);
        ((IHostUser) CN1.LIZ(IHostUser.class)).requestLivePermission(new BO4(this), "drawer_feed");
        C16880lQ.LJIIJ(new ACListenerS32S0101000_15(0, this, 18), this.LJLJI);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
