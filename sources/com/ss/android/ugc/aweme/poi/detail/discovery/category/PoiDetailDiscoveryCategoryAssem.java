package com.ss.android.ugc.aweme.poi.detail.discovery.category;

import X.AbstractC030309z;
import X.AbstractC72278SYg;
import X.C06830Op;
import X.C0A2;
import X.C184077Kh;
import X.C188447aS;
import X.C212428Vi;
import X.C214348b8;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C242819fx;
import X.C25620zW;
import X.C2K0;
import X.C32151Nz;
import X.C42625Go9;
import X.C50420Jqa;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57939MoZ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C72912tb;
import X.C73305Spp;
import X.C78685UuP;
import X.C78926UyI;
import X.C7MY;
import X.C85047XZj;
import X.C85048XZk;
import X.C85049XZl;
import X.C8W0;
import X.C8XO;
import X.EV9;
import X.IHN;
import X.InterfaceC115514g7;
import X.InterfaceC55235Lm3;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.InterfaceC84851XRv;
import X.KL2;
import X.O6R;
import X.Q7K;
import X.QD3;
import X.SYL;
import X.TBR;
import X.TBT;
import X.X1D;
import Y.IDrS53S0100000_15;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.video.FocusingPageUpdateAbility;
import com.ss.android.ugc.aweme.poi.detail.discovery.video.FocusingPosUpdateAbility;
import com.ss.android.ugc.aweme.poi.detail.discovery.video.PoiDetailDiscoveryCategoryAwemeListSharedViewModel;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes16.dex */
public final class PoiDetailDiscoveryCategoryAssem extends ReusedUISlotAssem<PoiDetailDiscoveryCategoryAssem> implements C8XO<PoiDiscoveryApi.PoiCategory>, InterfaceC84851XRv {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIILZ;
    public static final int LLIIIJ;
    public static final int LLIIIL;
    public final InterfaceC115514g7 LLFF;
    public final C214378bB LLFFF;
    public SYL LLFII;
    public SYL LLFZ;
    public C73305Spp LLI;
    public boolean LLIFFJFJJ;
    public String LLII;
    public boolean LLIIII;

    static {
        TBT tbt = new TBT(PoiDetailDiscoveryCategoryAssem.class, "categoryViewModel", "getCategoryViewModel()Lcom/ss/android/ugc/aweme/poi/detail/discovery/category/PoiDetailDiscoveryCategoryViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIILZ = new InterfaceC74236TBo[]{tbt};
        LLIIIJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        LLIIIL = C7MY.LIZIZ(150);
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bzs;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public PoiDetailDiscoveryCategoryAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailDiscoveryCategoryViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS165S0100000_15(LIZ, 532), null, C85047XZj.INSTANCE, null, null);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this, 744);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PoiDetailDiscoveryCategoryAwemeListSharedViewModel.class);
        C85048XZk c85048XZk = C85048XZk.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS165S0100000_15((C8W0) this, 533);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LLFFF = new C214378bB(LIZ2, aqS165S0100000_15, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c85048XZk, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    public final PoiDetailDiscoveryCategoryViewModel m4() {
        return (PoiDetailDiscoveryCategoryViewModel) this.LLFF.LIZ(this, LLIIIILZ[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C42625Go9.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void c4() {
        C42625Go9.LIZIZ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(PoiDiscoveryApi.PoiCategory poiCategory) {
        PoiDiscoveryApi.PoiCategory item = poiCategory;
        o.LJIIIZ(item, "item");
        m4().LJLIL = item.LJLIL;
        m4().LJLILLLLZI = item.tabCode;
        m4().getClass();
        m4().getClass();
        m4().manualListRefresh();
        Context context = getContext();
        if (context == null) {
            return;
        }
        SYL syl = new SYL(context, null);
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZ = 5;
        syl.setListConfig(c57939MoZ);
        AssemListViewModel assemListViewModel = (AssemListViewModel) this.LLFFF.getValue();
        C72808Sho<InterfaceC57784Mm4> state = syl.getState();
        o.LJIIIIZZ(state, "fakeList.state");
        assemListViewModel.setListState(state);
        final PoiDetailDiscoveryCategoryAwemeListSharedViewModel poiDetailDiscoveryCategoryAwemeListSharedViewModel = (PoiDetailDiscoveryCategoryAwemeListSharedViewModel) this.LLFFF.getValue();
        syl.LJLJLLL((AbstractC72278SYg) new TBR(poiDetailDiscoveryCategoryAwemeListSharedViewModel) { // from class: X.7aU
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(PoiDiscoveryApi.PoiCategory poiCategory) {
        return true;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDiscoveryReload(IHN event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLIL, m4().LJLIL) && this.LLIIII) {
            if (event.LJLILLLLZI) {
                SYL syl = this.LLFZ;
                if (syl != null) {
                    syl.setVisibility(0);
                    SYL syl2 = this.LLFII;
                    if (syl2 != null) {
                        syl2.setVisibility(4);
                        return;
                    } else {
                        o.LJIJI("powerList");
                        throw null;
                    }
                }
                o.LJIJI("loadingPowerList");
                throw null;
            }
            SYL syl3 = this.LLFZ;
            if (syl3 != null) {
                syl3.setVisibility(8);
                SYL syl4 = this.LLFII;
                if (syl4 != null) {
                    syl4.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("powerList");
                    throw null;
                }
            }
            o.LJIJI("loadingPowerList");
            throw null;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onVideoEvent(C50420Jqa event) {
        int indexOf;
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(event, "event");
        if (event.LJLJLJ == -1 || !this.LJLLL || !this.LLIIII || !(event.LJLILLLLZI instanceof Aweme) || !o.LJ(event.LJLJJI, "poi_detail_discovery") || event.LJLIL != 66) {
            return;
        }
        Object obj = event.LJLILLLLZI;
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        List<? extends Aweme> list = ((PoiDetailDiscoveryCategoryAwemeListSharedViewModel) this.LLFFF.getValue()).LJLILLLLZI;
        if (list == null || !(!list.isEmpty()) || (indexOf = list.indexOf(obj)) < 0 || indexOf >= list.size()) {
            return;
        }
        SYL syl = this.LLFII;
        if (syl != null) {
            int i = LLIIIL;
            if (indexOf >= syl.getState().LJIIIIZZ() || syl.getState().LJIIIIZZ() <= 0) {
                return;
            }
            int LJIIJJI = (KL2.LJIIJJI(syl.getContext()) / 2) - (i / 2);
            C0A2 layoutManager = syl.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                return;
            }
            linearLayoutManager.LJFF(indexOf, LJIIJJI);
            return;
        }
        o.LJIJI("powerList");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLFII = (SYL) C7MY.LIZLLL(view, "view", R.id.i04, "view.findViewById(R.id.power_list)");
        View findViewById = view.findViewById(R.id.i06);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.power_list_loading)");
        this.LLFZ = (SYL) findViewById;
        View findViewById2 = view.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.status_view)");
        this.LLI = (C73305Spp) findViewById2;
        SYL syl = this.LLFII;
        if (syl != null) {
            syl.setLifecycleOwner(this);
            syl.LLLF.LJZL(CardItemCell.class);
            syl.getContext();
            syl.setLayoutManager(new LinearLayoutManager(0, false));
            syl.setItemAnimator(null);
            final int i = LLIIIJ;
            final int LIZIZ = C7MY.LIZIZ(16);
            final int LIZIZ2 = C7MY.LIZIZ(16);
            syl.LJII(new AbstractC030309z(i, LIZIZ, LIZIZ2) { // from class: X.4Yg
                public final int LJLIL;
                public final int LJLILLLLZI = 0;
                public final int LJLJI;
                public final int LJLJJI;

                {
                    this.LJLIL = i;
                    this.LJLJI = LIZIZ;
                    this.LJLJJI = LIZIZ2;
                }

                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view2, RecyclerView recyclerView, C0AC c0ac) {
                    int i2;
                    int i3;
                    int LIZJ = C1JX.LIZJ(rect, "outRect", view2, "view", recyclerView, "parent", c0ac, "state", view2);
                    if (this.LJLILLLLZI == 1) {
                        AbstractC029409q adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            i3 = adapter.getItemCount();
                        } else {
                            i3 = 0;
                        }
                        if (LIZJ == 0) {
                            rect.set(0, this.LJLJI, 0, (int) (this.LJLIL / 2.0f));
                            return;
                        } else if (LIZJ == i3 - 1) {
                            rect.set(0, (int) (this.LJLIL / 2.0f), 0, this.LJLJJI);
                            return;
                        } else {
                            int i4 = (int) (this.LJLIL / 2.0f);
                            rect.set(0, i4, 0, i4);
                            return;
                        }
                    }
                    AbstractC029409q adapter2 = recyclerView.getAdapter();
                    if (adapter2 != null) {
                        i2 = adapter2.getItemCount();
                    } else {
                        i2 = 0;
                    }
                    if (LIZJ == 0) {
                        rect.set(this.LJLJI, 0, (int) (this.LJLIL / 2.0f), 0);
                    } else if (LIZJ == i2 - 1) {
                        rect.set((int) (this.LJLIL / 2.0f), 0, this.LJLJJI, 0);
                    } else {
                        int i5 = (int) (this.LJLIL / 2.0f);
                        rect.set(i5, 0, i5, 0);
                    }
                }
            }, -1);
            C57939MoZ c57939MoZ = new C57939MoZ();
            c57939MoZ.LIZIZ = false;
            syl.setListConfig(c57939MoZ);
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
                FocusingPageUpdateAbility focusingPageUpdateAbility = new FocusingPageUpdateAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.discovery.category.PoiDetailDiscoveryCategoryAssem$listenForFocusPageChange$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.ss.android.ugc.aweme.poi.detail.discovery.video.FocusingPageUpdateAbility
                    public final void mh(int i2, String str, String str2) {
                        StringBuilder LIZ = C06830Op.LIZ("CategoryAssem - onFocusingPageUpdate - focusingPageIndex: ", i2, ", newFocusPageId: ", str, "; lastFocusPageId: ");
                        LIZ.append(str2);
                        LIZ.append(", currentTabCode: ");
                        LIZ.append(PoiDetailDiscoveryCategoryAssem.this.m4().LJLILLLLZI);
                        LIZ.append("; \n refreshState: ");
                        LIZ.append(((C242819fx) PoiDetailDiscoveryCategoryAssem.this.m4().getState()).LJLIL.LJLIL);
                        C188447aS.LIZ(X1D.LIZIZ(LIZ));
                        PoiDetailDiscoveryCategoryAssem poiDetailDiscoveryCategoryAssem = PoiDetailDiscoveryCategoryAssem.this;
                        poiDetailDiscoveryCategoryAssem.LLIFFJFJJ = false;
                        poiDetailDiscoveryCategoryAssem.LLIIII = false;
                        if (o.LJ(poiDetailDiscoveryCategoryAssem.m4().LJLILLLLZI, str)) {
                            PoiDetailDiscoveryCategoryAssem poiDetailDiscoveryCategoryAssem2 = PoiDetailDiscoveryCategoryAssem.this;
                            poiDetailDiscoveryCategoryAssem2.LLIIII = true;
                            WeakReference<InterfaceC84851XRv> weakReference = C85049XZl.LJ;
                            if (weakReference != null) {
                                weakReference.clear();
                            }
                            C85049XZl.LJ = null;
                            C85049XZl.LJ = new WeakReference<>(poiDetailDiscoveryCategoryAssem2);
                            if (((C242819fx) PoiDetailDiscoveryCategoryAssem.this.m4().getState()).LJLIL.LJLIL instanceof C72912tb) {
                                PoiDetailDiscoveryCategoryAssem.this.v2(null);
                                return;
                            }
                            PoiDetailDiscoveryCategoryAssem poiDetailDiscoveryCategoryAssem3 = PoiDetailDiscoveryCategoryAssem.this;
                            poiDetailDiscoveryCategoryAssem3.LLIFFJFJJ = true;
                            poiDetailDiscoveryCategoryAssem3.LLII = poiDetailDiscoveryCategoryAssem3.m4().LJLILLLLZI;
                        }
                    }
                };
                C2K0 LIZ = C55096Ljo.LIZ(LIZJ, FocusingPageUpdateAbility.class, null);
                if (LIZ == null) {
                    C55096Ljo.LJIIJJI(LIZJ, focusingPageUpdateAbility, FocusingPageUpdateAbility.class, null);
                } else {
                    try {
                        InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                        if (invocationHandler instanceof EV9) {
                            ((EV9) invocationHandler).LIZ.add(focusingPageUpdateAbility);
                        } else {
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        }
                    } catch (IllegalArgumentException unused) {
                        EV9 ev9 = new EV9();
                        ev9.LIZ.add(focusingPageUpdateAbility);
                        ev9.LIZ.add(LIZ);
                        Object newProxyInstance = Proxy.newProxyInstance(FocusingPageUpdateAbility.class.getClassLoader(), new Class[]{FocusingPageUpdateAbility.class}, ev9);
                        if (newProxyInstance != null) {
                            C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, FocusingPageUpdateAbility.class, null);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.discovery.video.FocusingPageUpdateAbility");
                        }
                    }
                }
            }
            SYL syl2 = this.LLFII;
            if (syl2 != null) {
                syl2.LJIIJJI(new IDrS53S0100000_15(this, 3));
                syl.LJLJLLL(m4().getConfig());
                PoiDetailDiscoveryCategoryViewModel m4 = m4();
                C72808Sho<InterfaceC57784Mm4> state = syl.getState();
                o.LJIIIIZZ(state, "state");
                m4.setListState(state);
                SYL syl3 = this.LLFZ;
                if (syl3 != null) {
                    syl3.setLifecycleOwner(this);
                    syl3.LLLF.LJZL(CardItemCell.class);
                    syl3.getContext();
                    syl3.setLayoutManager(new LinearLayoutManager(0, false));
                    syl3.setItemAnimator(null);
                    final int i2 = LLIIIJ;
                    final int LIZIZ3 = C7MY.LIZIZ(16);
                    final int LIZIZ4 = C7MY.LIZIZ(16);
                    syl3.LJII(new AbstractC030309z(i2, LIZIZ3, LIZIZ4) { // from class: X.4Yg
                        public final int LJLIL;
                        public final int LJLILLLLZI = 0;
                        public final int LJLJI;
                        public final int LJLJJI;

                        {
                            this.LJLIL = i2;
                            this.LJLJI = LIZIZ3;
                            this.LJLJJI = LIZIZ4;
                        }

                        @Override // X.AbstractC030309z
                        public final void LJ(Rect rect, View view2, RecyclerView recyclerView, C0AC c0ac) {
                            int i22;
                            int i3;
                            int LIZJ2 = C1JX.LIZJ(rect, "outRect", view2, "view", recyclerView, "parent", c0ac, "state", view2);
                            if (this.LJLILLLLZI == 1) {
                                AbstractC029409q adapter = recyclerView.getAdapter();
                                if (adapter != null) {
                                    i3 = adapter.getItemCount();
                                } else {
                                    i3 = 0;
                                }
                                if (LIZJ2 == 0) {
                                    rect.set(0, this.LJLJI, 0, (int) (this.LJLIL / 2.0f));
                                    return;
                                } else if (LIZJ2 == i3 - 1) {
                                    rect.set(0, (int) (this.LJLIL / 2.0f), 0, this.LJLJJI);
                                    return;
                                } else {
                                    int i4 = (int) (this.LJLIL / 2.0f);
                                    rect.set(0, i4, 0, i4);
                                    return;
                                }
                            }
                            AbstractC029409q adapter2 = recyclerView.getAdapter();
                            if (adapter2 != null) {
                                i22 = adapter2.getItemCount();
                            } else {
                                i22 = 0;
                            }
                            if (LIZJ2 == 0) {
                                rect.set(this.LJLJI, 0, (int) (this.LJLIL / 2.0f), 0);
                            } else if (LIZJ2 == i22 - 1) {
                                rect.set((int) (this.LJLIL / 2.0f), 0, this.LJLJJI, 0);
                            } else {
                                int i5 = (int) (this.LJLIL / 2.0f);
                                rect.set(i5, 0, i5, 0);
                            }
                        }
                    }, -1);
                    m4().getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new PoiDiscoveryApi.PoiDiscoveryCard(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 98303, null));
                    arrayList.add(new PoiDiscoveryApi.PoiDiscoveryCard(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 98303, null));
                    arrayList.add(new PoiDiscoveryApi.PoiDiscoveryCard(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 98303, null));
                    arrayList.add(new PoiDiscoveryApi.PoiDiscoveryCard(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 98303, null));
                    arrayList.add(new PoiDiscoveryApi.PoiDiscoveryCard(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 98303, null));
                    arrayList.add(new PoiDiscoveryApi.PoiDiscoveryCard(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 98303, null));
                    arrayList.add(new PoiDiscoveryApi.PoiDiscoveryCard(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 98303, null));
                    arrayList.add(new PoiDiscoveryApi.PoiDiscoveryCard(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 98303, null));
                    syl3.getState().LJ(arrayList);
                    AssemViewModel.asyncSubscribe$default(m4(), new TBT() { // from class: X.XZi
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            C242819fx c242819fx = (C242819fx) obj;
                            c242819fx.getClass();
                            return C208708Ha.LIZLLL(c242819fx);
                        }
                    }, null, new AqS181S0100000_15(this, 89), new AqS165S0100000_15(this, 531), new AqS181S0100000_15(this, 90), 2, null);
                    return;
                }
                o.LJIJI("loadingPowerList");
                throw null;
            }
            o.LJIJI("powerList");
            throw null;
        }
        o.LJIJI("powerList");
        throw null;
    }

    @Override // X.InterfaceC84851XRv
    public final void v2(String str) {
        int i;
        int i2;
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        FocusingPosUpdateAbility focusingPosUpdateAbility;
        Integer num;
        if (C78685UuP.LJJJZ(str) && !o.LJ(str, m4().LJLILLLLZI)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("updateCurrentFocusPosition() - targetTabCode: ", str, ", but currentTabCode: ");
            LIZIZ.append(m4().LJLILLLLZI);
            C188447aS.LIZ(X1D.LIZIZ(LIZIZ));
            return;
        }
        int i3 = 0;
        if (Q7K.LIZIZ("poi_is_low_device", 0) == 1 && (num = PoiServerConfigSettings.LIZ().regionPoiDiscovery) != null && num.intValue() == 3) {
            return;
        }
        SYL syl = this.LLFII;
        if (syl != null) {
            int LJIIIIZZ = syl.getState().LJIIIIZZ();
            View LJFF = C85049XZl.LIZ.LJFF(syl.getLayoutManager());
            int i4 = -1;
            if (LJFF != null && syl.getLayoutManager() != null) {
                int LJJJLL = C0A2.LJJJLL(LJFF);
                C0A2 layoutManager = syl.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager) != null) {
                    i = linearLayoutManager2.LLIL();
                } else {
                    i = 0;
                }
                C0A2 layoutManager2 = syl.getLayoutManager();
                if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager2) != null) {
                    i2 = linearLayoutManager.LLILLIZIL();
                } else {
                    i2 = 0;
                }
                if (i != 0 && i2 != LJIIIIZZ - 1) {
                    i3 = LJJJLL;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onScrollStateChanged - snap: ");
                LIZ.append(LJFF);
                LIZ.append(", selectedPos: ");
                LIZ.append(i3);
                LIZ.append(", first: ");
                LIZ.append(i);
                LIZ.append(", last: ");
                LIZ.append(i2);
                C188447aS.LIZ(X1D.LIZIZ(LIZ));
                i4 = i3;
            }
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null && (focusingPosUpdateAbility = (FocusingPosUpdateAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), FocusingPosUpdateAbility.class, null)) != null) {
                focusingPosUpdateAbility.U80(m4().LJLILLLLZI, i4, C85049XZl.LIZIZ);
            }
            C85049XZl.LIZIZ = i4;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateCurrentFocusPosition - focusPos:");
            LIZ2.append(i4);
            C188447aS.LIZ(X1D.LIZIZ(LIZ2));
            return;
        }
        o.LJIJI("powerList");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(PoiDiscoveryApi.PoiCategory poiCategory) {
    }
}
