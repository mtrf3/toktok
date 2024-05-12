package com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.assem;

import X.AnonymousClass374;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C36636EZk;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71489S3x;
import X.C71490S3y;
import X.C71491S3z;
import X.C71515S4x;
import X.C73305Spp;
import X.C78926UyI;
import X.C86V;
import X.C8YN;
import X.C9BD;
import X.K5T;
import X.OSZ;
import X.S53;
import X.S54;
import X.S55;
import X.S56;
import X.SYL;
import X.TBT;
import X.XKX;
import Y.ACListenerS32S0100000_12;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.powerlist.ProductListCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel.ProductListViewModel;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductListAssem extends UIListContentAssem<ProductListViewModel> {
    public static final String LJLLI = C86V.LJFF(R.string.fab);
    public static final String LJLLILLLL = C86V.LJFF(R.string.iqt);
    public static final String LJLLJ = C86V.LJFF(R.string.fgd);
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C214298b3 LJLJLLL;
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

    public ProductListAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS162S0100000_12(LIZ, 715), S55.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 713));
        this.LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 710));
        this.LJLJJI = C221108m2.LIZIZ(S54.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 717));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 714));
        this.LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 712));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 711));
        C65776Prg LIZ2 = C65352Pkq.LIZ(ProductListViewModel.class);
        this.LJLJLLL = new C214298b3(new AqS162S0100000_12(LIZ2, 716), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), S56.INSTANCE, LIZ2);
    }

    public final AnonymousClass374 C3() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-productImageLayout>(...)");
        return (AnonymousClass374) value;
    }

    public final K5T F3() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-searchBar>(...)");
        return (K5T) value;
    }

    public final C73305Spp H3() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: I3, reason: merged with bridge method [inline-methods] */
    public final ProductListViewModel A3() {
        return (ProductListViewModel) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 0;
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LJII = false;
        return c57939MoZ;
    }

    public final void E3(boolean z) {
        ProductListViewModel A3 = A3();
        RootData rootData = (RootData) this.LJLILLLLZI.getValue();
        A3.getClass();
        o.LJIIIZ(rootData, "rootData");
        A3.setState(C71490S3y.LJLIL);
        long currentTimeMillis = System.currentTimeMillis();
        S53.LIZIZ = currentTimeMillis;
        b.LJJIJIIJIL("rd_ec_live_request_send", new OSZ("page_name", "template_product_list"), new OSZ("previous_page", "notice_board_edit"), new OSZ("start_click_to_now", Long.valueOf(currentTimeMillis - S53.LIZ)), new OSZ("api_path", "/aweme/v1/oec/affiliate/live/product/list"), new OSZ("request_method", "get"), new OSZ("request_type", 1), new OSZ("is_retry", Boolean.valueOf(z)));
        if (!z) {
            S53.LIZ(S53.LIZIZ - S53.LIZ, "init", "did_load");
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(A3), C36636EZk.LIZ, null, new C71515S4x(A3, z, System.currentTimeMillis(), rootData, null), 2);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        F3().getEditTextView().setHint(LJLLI);
        F3().setOnClickClearListener(new ACListenerS32S0100000_12(this, 196));
        F3().getEditTextView().setOnEditorActionListener(new C71489S3x(this));
        C3().setHideKeyBoard$e_commerce_influencer_release(new AqS178S0100000_12(this, 710));
        new KeyBoardMonitor(this).LIZ(F3().getEditTextView(), new C71491S3z(this));
        v3().LLLF.LJZL(ProductListCell.class);
        SYL v3 = v3();
        getContext();
        v3.setLayoutManager(new LinearLayoutManager(1, false));
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.S57
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S5B) obj).LJLILLLLZI;
            }
        }, null, new AqS178S0100000_12(this, 711), new AqS162S0100000_12(this, 1240), new AqS178S0100000_12(this, 712), 2, null);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.S58
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S5B) obj).LJLJJI;
            }
        }, null, new AqS194S0100000_12(this, 270), 6);
        E3(false);
    }
}
