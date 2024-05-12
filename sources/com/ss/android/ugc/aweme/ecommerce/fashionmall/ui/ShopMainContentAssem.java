package com.ss.android.ugc.aweme.ecommerce.fashionmall.ui;

import X.C113554cx;
import X.C141335gf;
import X.C214298b3;
import X.C36746EbW;
import X.C3C1;
import X.C3C5;
import X.C40171ht;
import X.C40443Fu3;
import X.C47704Ins;
import X.C55749LuL;
import X.C55978Ly2;
import X.C56020Lyi;
import X.C56021Lyj;
import X.C56022Lyk;
import X.C56026Lyo;
import X.C56045Lz7;
import X.C56054LzG;
import X.C56055LzH;
import X.C56056LzI;
import X.C56066LzS;
import X.C56069LzV;
import X.C56070LzW;
import X.C56071LzX;
import X.C56074Lza;
import X.C56075Lzb;
import X.C56090Lzq;
import X.C56095Lzv;
import X.C61269O2v;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76542zS;
import X.C76800UCe;
import X.C78565UsT;
import X.C78613UtF;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.EnumC56002LyQ;
import X.EnumC56081Lzh;
import X.M1V;
import X.MKM;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBT;
import X.X1D;
import Y.IDrS13S0200000_9;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.MallMainToolPanelBean;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainContentBean;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.MallCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS38S0100100_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ShopMainContentAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final C56074Lza LJLJLJ;
    public final C56071LzX LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ShopMainContentAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 109), C56066LzS.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MallCommonViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9be, new AqS159S0100000_9(LIZ2, 110), C56069LzV.INSTANCE, null);
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C56020Lyi.class, null), checkSupervisorPrepared());
        C56021Lyj c56021Lyj = new C56021Lyj(this);
        EnumC56002LyQ enumC56002LyQ = EnumC56002LyQ.SKELETON;
        this.LJLJLJ = new C56074Lza(new ShopMainContentBean(enumC56002LyQ, false, null, null, null, null, null, null, false, 510, null), new MallMainToolPanelBean(enumC56002LyQ, null, null, null, 14, null), c56021Lyj);
        this.LJLJLLL = new C56071LzX();
    }

    public final C56020Lyi v3() {
        return (C56020Lyi) this.LJLJI.getValue();
    }

    public final ShopMainViewModel x3() {
        return (ShopMainViewModel) this.LJLIL.getValue();
    }

    public final void A3() {
        String str;
        boolean z;
        if (v3().LJLJJI) {
            return;
        }
        C55978Ly2 state = x3().getState();
        C56054LzG LIZ = state.LJLIL.LIZ();
        if (LIZ != null) {
            str = LIZ.LIZ;
        } else {
            str = null;
        }
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !z;
        if (!this.LJLJJI) {
            if ((z3 && this.LJLJJL) || (state.LJLIL instanceof C3C1) || (state.LJLILLLLZI instanceof C3C1)) {
                z2 = true;
            }
            this.LJLJJI = z2;
        }
        if (this.LJLJJI) {
            v3().LJLJJI = true;
            long currentTimeMillis = System.currentTimeMillis() - v3().LJLIL;
            C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
            boolean z4 = this.LJLJJLL;
            boolean z5 = this.LJLJL;
            c56045Lz7.getClass();
            C76542zS.LIZJ("rd_tiktokec_mall_page_load_dur", new C56026Lyo(currentTimeMillis, z3, z3, z4, z5, z4, z5));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C56075Lzb c56075Lzb = this.LJLJLJ.LJLJL;
        if (c56075Lzb != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c56075Lzb.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            }
            c56075Lzb.LJLJI = null;
            M1V monitor = c56075Lzb.LJLJLLL;
            o.LJIIJ(monitor, "monitor");
            C61269O2v.LIZ.remove(monitor);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C56045Lz7.LJIILIIL(C56045Lz7.LIZ, EnumC56081Lzh.STAGE_CREATE_VIEW_END.getStage(), v3().LJZ, System.currentTimeMillis() - C56090Lzq.LIZ, false, null, 56);
        this.LJLJLJ.LJLJJI = v3();
        ((SwipeRefreshLayout) _$_findCachedViewById(R.id.itq)).setOnRefreshListener(new C56055LzH(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "context");
        recyclerView.setLayoutManager(new MallLinearLayoutManager(context));
        recyclerView.setItemAnimator(new C40171ht());
        recyclerView.setHasFixedSize(true);
        C56095Lzv c56095Lzv = new C56095Lzv();
        MKM recycler_view = (MKM) _$_findCachedViewById(R.id.isn);
        o.LJIIIIZZ(recycler_view, "recycler_view");
        C56071LzX scrollEvent = this.LJLJLLL;
        o.LJIIIZ(scrollEvent, "scrollEvent");
        c56095Lzv.LIZIZ = new WeakReference<>(recycler_view);
        c56095Lzv.LIZJ = new WeakReference<>(scrollEvent);
        recycler_view.setFlingListener(new C56070LzW(c56095Lzv));
        recycler_view.LJIIJJI(new IDrS13S0200000_9(c56095Lzv, recycler_view, 2));
        long currentTimeMillis = System.currentTimeMillis();
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setAdapter(this.LJLJLJ);
        this.LJLJLJ.LJLJJLL = new AqS38S0100100_9(currentTimeMillis, this, 1);
        this.LJLJLJ.LJLIL.setRecyclerView((RecyclerView) _$_findCachedViewById(R.id.isn));
        C40443Fu3.LIZ("tiktokec_anchor_mall_main_page").LJIIIIZZ((RecyclerView) _$_findCachedViewById(R.id.isn));
        AssemViewModel.asyncSubscribe$default(x3(), new TBT() { // from class: X.Ly3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55978Ly2) obj).LJLJLLL;
            }
        }, null, new AqS175S0100000_9(this, 512), null, new AqS175S0100000_9(this, 514), 10, null);
        AssemViewModel.asyncSubscribe$default(x3(), new TBT() { // from class: X.Ly5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55978Ly2) obj).LJLIL;
            }
        }, null, new AqS175S0100000_9(this, 515), null, new AqS175S0100000_9(this, 516), 10, null);
        AssemViewModel.asyncSubscribe$default(x3(), new TBT() { // from class: X.LzU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55978Ly2) obj).LJLILLLLZI;
            }
        }, null, new AqS175S0100000_9(this, 518), null, null, 26, null);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.Ly4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C55978Ly2) obj).LJLJI);
            }
        }, null, C56056LzI.LJLIL, 6);
        ShopMainViewModel x3 = x3();
        if (!x3.LJLJLJ) {
            x3.LJLJLJ = true;
            C78565UsT.LJJIJIIJI(x3, C78613UtF.LIZJ, new C56022Lyk(x3, null));
        }
        x3().mv0(true, false);
        x3().nv0(true, false);
    }

    public final void C3(int i, int i2, List list) {
        if (i <= i2) {
            while (true) {
                try {
                    ShopMainViewModel x3 = x3();
                    int cardType = ((ToolEntryVO) ListProtector.get(list, i)).getCardType();
                    Set<Integer> set = x3.LJLLILLLL;
                    if (set != null && set.contains(Integer.valueOf(cardType))) {
                        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("button_name", ((ToolEntryVO) ListProtector.get(list, i)).getButtonName()), new OSZ("page_struc_type", "tools_out"), new OSZ("item_order", String.valueOf(i + 1)));
                        if (((ToolEntryVO) ListProtector.get(list, i)).getNotify()) {
                            LJJLIIIIJ.put("notice_number", "");
                            LJJLIIIIJ.put("notice_type", "red_dot");
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("ToolPanelButtonShow sendButtonShowEvent buttonName: ");
                        LIZ.append(((ToolEntryVO) ListProtector.get(list, i)).getButtonName());
                        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
                        C56045Lz7.LIZ.getClass();
                        C56045Lz7.LJ(LJJLIIIIJ);
                        ShopMainViewModel x32 = x3();
                        int cardType2 = ((ToolEntryVO) ListProtector.get(list, i)).getCardType();
                        Set<Integer> set2 = x32.LJLLILLLL;
                        if (set2 != null) {
                            set2.remove(Integer.valueOf(cardType2));
                        }
                    }
                    if (i == i2) {
                        break;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    return;
                }
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
    }
}
