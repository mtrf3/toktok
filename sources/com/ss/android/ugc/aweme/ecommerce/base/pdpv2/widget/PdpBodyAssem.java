package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.widget;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C26701Adt;
import X.C40443Fu3;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C61928OSe;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70300RiS;
import X.C70454Rkw;
import X.C70455Rkx;
import X.C70536RmG;
import X.C70537RmH;
import X.C70538RmI;
import X.C70545RmP;
import X.C70551RmV;
import X.C70565Rmj;
import X.C71312Rym;
import X.C73305Spp;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C9BE;
import X.EnumC61929OSf;
import X.InterfaceC36571c5;
import X.InterfaceC71003Rtn;
import X.KL2;
import X.MKO;
import X.O9B;
import X.TBT;
import Y.IDLListenerS198S0100000_12;
import Y.IDrS14S0200000_12;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BlankBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.HeaderBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.LogisticsBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.LynxBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.ProductInfoBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.ReturnPolicyBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.SellerInfoBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.SkuBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescImageBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescSpecBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescTextBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescVideoBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpHeadViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpBodyAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public final C214298b3 LJLL;
    public final C214298b3 LJLLI;
    public final C55749LuL LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final int LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C70455Rkx LJZ;
    public final IDLListenerS198S0100000_12 LJZI;
    public final Map<Integer, View> LJZL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZL;
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

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.a2g;
    }

    public PdpBodyAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpMainViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 391), C70536RmG.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PdpBodyViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS162S0100000_12(LIZ2, 392), C70537RmH.INSTANCE, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(PdpHeadViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ3, c9be, new AqS162S0100000_12(LIZ3, 393), C70538RmI.INSTANCE, null);
        this.LJLLILLLL = new C55749LuL(C47704Ins.LIZJ(this, C70300RiS.class, null), checkSupervisorPrepared());
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        this.LJLLL = C221108m2.LIZIZ(C70551RmV.LJLIL);
        this.LJLLLL = C7MY.LIZIZ(44);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 389));
        this.LJLZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 394));
        this.LJZ = new C70455Rkx(this);
        this.LJZI = new IDLListenerS198S0100000_12(this, 1);
    }

    public final PdpMainViewModel H3() {
        return (PdpMainViewModel) this.LJLJLLL.getValue();
    }

    public final String I3() {
        return (String) this.LJLLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).LJJLL(this.LJZ);
        _$_findCachedViewById(R.id.isf).getViewTreeObserver().removeOnGlobalLayoutListener(this.LJZI);
        C70565Rmj c70565Rmj = (C70565Rmj) this.LJLLL.getValue();
        c70565Rmj.LIZIZ = null;
        c70565Rmj.LIZJ = null;
        ((O9B) ((PdpBodyViewModel) this.LJLL.getValue()).LJLJJI.getValue()).LIZJ();
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        O9B o9b = (O9B) ((PdpBodyViewModel) this.LJLL.getValue()).LJLJJI.getValue();
        InterfaceC36571c5 LIZLLL = C212428Vi.LIZLLL(this);
        o.LJII(LIZLLL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.slark.api.ITrackNode");
        o9b.LIZIZ((InterfaceC71003Rtn) LIZLLL, H3(), I3());
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        if (ActivityStack.isAppBackGround()) {
            C61928OSe c61928OSe = new C61928OSe(I3());
            c61928OSe.LJIILIIL(EnumC61929OSf.CLOSE);
            c61928OSe.LJIIJ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.keh);
        View inflate = View.inflate(getContext(), R.layout.a2h, null);
        o.LJIIIIZZ(inflate, "inflate(\n               …      null,\n            )");
        c73305Spp.LIZJ(inflate);
        View top_btn = _$_findCachedViewById(R.id.le_);
        o.LJIIIIZZ(top_btn, "top_btn");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 90, 42), top_btn);
        MKO mko = (MKO) _$_findCachedViewById(R.id.isf);
        if (mko != null) {
            Class[] clsArr = (Class[]) C47261Igj.LJJIJIIJI(HeaderBrickVH.class, BlankBrickVH.class, LynxBrickVH.class, SkuBrickVH.class, ProductInfoBrickVH.class, LogisticsBrickVH.class, ReturnPolicyBrickVH.class, SellerInfoBrickVH.class, ProductDescTextBrickVH.class, ProductDescImageBrickVH.class, ProductDescSpecBrickVH.class, ProductDescVideoBrickVH.class).toArray(new Class[0]);
            mko.LLLF.LJZL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Context context = mko.getContext();
            o.LJIIIIZZ(context, "context");
            ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
            scrollTopLinearLayoutManager.LLIIIJ = ((Number) this.LJLLLLLL.getValue()).intValue() + 1;
            mko.setLayoutManager(scrollTopLinearLayoutManager);
            Context context2 = mko.getContext();
            o.LJIIIIZZ(context2, "context");
            mko.LJII(new C71312Rym(KL2.LIZJ(mko.getContext(), 16.0f), AnonymousClass636.LJIIIIZZ(R.attr.dz, context2), (int) KL2.LIZJ(mko.getContext(), 0.5f)), -1);
            mko.LJIIJJI(this.LJZ);
            C70565Rmj c70565Rmj = (C70565Rmj) this.LJLLL.getValue();
            C70454Rkw c70454Rkw = new C70454Rkw(this);
            c70565Rmj.getClass();
            c70565Rmj.LIZIZ = mko;
            c70565Rmj.LIZJ = c70454Rkw;
            mko.setFlingListener(new C70545RmP(c70565Rmj));
            mko.LJIIJJI(new IDrS14S0200000_12(c70565Rmj, mko, 2));
            mko.getViewTreeObserver().addOnGlobalLayoutListener(this.LJZI);
            C40443Fu3.LIZ("tiktokec_product_detail_v2").LJIIIIZZ(mko);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLL.getValue(), new TBT() { // from class: X.RiX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C27723AuN) obj).LJLIL;
            }
        }, null, new AqS194S0100000_12(this, 220), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.RmE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C69947Rcl) obj).LJLILLLLZI);
            }
        }, null, C26701Adt.LJLIL, 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.Rgf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C69947Rcl) obj).LJLJI);
            }
        }, null, new AqS194S0100000_12(this, 221), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.Rcn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C69947Rcl) obj).LJLJJI;
            }
        }, null, new AqS186S0100000_4(this, 285), 6);
    }
}
