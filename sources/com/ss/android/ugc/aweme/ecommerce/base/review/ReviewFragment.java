package com.ss.android.ugc.aweme.ecommerce.base.review;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1DJ;
import X.C221108m2;
import X.C26059AKp;
import X.C29S;
import X.C38891fp;
import X.C3C5;
import X.C53204KuO;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70357RjN;
import X.C70690Rok;
import X.C70691Rol;
import X.C70785RqH;
import X.C70803RqZ;
import X.C70804Rqa;
import X.C70805Rqb;
import X.C70806Rqc;
import X.C70807Rqd;
import X.C70808Rqe;
import X.C70809Rqf;
import X.C70818Rqo;
import X.C70830Rr0;
import X.C70845RrF;
import X.C70846RrG;
import X.C70856RrQ;
import X.C71312Rym;
import X.C73156SnQ;
import X.C73181Snp;
import X.C73305Spp;
import X.C75792yF;
import X.C76800UCe;
import X.C78983UzD;
import X.C80218Ve2;
import X.C90903hW;
import X.IHJ;
import X.InterfaceC60061Nhh;
import X.SQU;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS48S0100000_12;
import Y.IDrS15S0000000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpReviewClickEvent;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class ReviewFragment extends ECBaseJediFragment implements InterfaceC60061Nhh {
    public boolean LLD;
    public final lifecycleAwareLazy LLF;
    public final C62822Ol8 LLFF;
    public boolean LLFFF;
    public C70818Rqo LLFII;
    public final ARunnableS48S0100000_12 LLFZ;
    public long LLI;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new C70805Rqb(this));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new C70807Rqd(this));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new C70803RqZ(this));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new C70804Rqa(this));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new C70808Rqe(this));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new C70806Rqc(this));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 431));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new C70809Rqf(this));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 430));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 433));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 428));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 432));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 420));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 427));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 425));
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 422));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 423));
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 424));
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 421));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 426));
    public final Handler LL = new Handler(C16880lQ.LLJJJJ());

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLIFFJFJJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ReviewFragment() {
        AqS194S0100000_12 aqS194S0100000_12 = new AqS194S0100000_12(this, 77);
        C65776Prg LIZ = C65352Pkq.LIZ(ProductReviewViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 434);
        this.LLF = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, aqS194S0100000_12, 8));
        this.LLFF = C221108m2.LIZIZ(new AqS162S0100000_12(this, 429));
        this.LLFZ = new ARunnableS48S0100000_12(this, 21);
    }

    public final float Al() {
        return ((Number) this.LJLJL.getValue()).floatValue();
    }

    public final PdpReviewClickEvent vl() {
        return (PdpReviewClickEvent) this.LJZL.getValue();
    }

    public final int wl() {
        return ((Number) this.LLFF.getValue()).intValue();
    }

    public final ProductReviewViewModel xl() {
        return (ProductReviewViewModel) this.LLF.getValue();
    }

    public final void Hl() {
        this.LLI = SystemClock.elapsedRealtime();
        this.LL.removeCallbacks(this.LLFZ);
        Gl(false);
        ((C73305Spp) _$_findCachedViewById(R.id.j1_)).setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        if (wl() == 2) {
            return "shop_review";
        }
        return "product_review";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (C53204KuO.LIZ()) {
            C26059AKp.LIZ().LIZIZ("ec_cart_entry_click", this);
            C26059AKp.LIZ().LIZIZ("ec_share_icon_click", this);
            C26059AKp.LIZ().LIZIZ("ec_buy_now_click", this);
            C26059AKp.LIZ().LIZIZ("ec_sku_submit", this);
            C26059AKp.LIZ().LIZIZ("ec_add_cart_click", this);
            C26059AKp.LIZ().LIZIZ("ec_seller_shop_icon_click", this);
            C26059AKp.LIZ().LIZIZ("ec_im_icon_click", this);
            C26059AKp.LIZ().LIZIZ("ec_back_from_review", this);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C70691Rol c70691Rol = xl().LJLLILLLL;
        if (c70691Rol != null) {
            c70691Rol.LJI = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C70691Rol c70691Rol = xl().LJLLILLLL;
        if (c70691Rol != null) {
            c70691Rol.LJJIZ(this, this.LLFFF);
        }
    }

    public final String Dl(Integer num) {
        if (num == null || num.intValue() != 2) {
            if (num == null || num.intValue() != 1) {
                String string = getString(R.string.f_n);
                o.LJIIIIZZ(string, "getString(R.string.ecom_…page_sort_page_relevance)");
                return string;
            }
            String string2 = getString(R.string.f_n);
            o.LJIIIIZZ(string2, "getString(R.string.ecom_…page_sort_page_relevance)");
            return string2;
        }
        String string3 = getString(R.string.f_m);
        o.LJIIIIZZ(string3, "getString(R.string.ecom_…_page_sort_page_recently)");
        return string3;
    }

    public final void Gl(boolean z) {
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            View review_list_header = _$_findCachedViewById(R.id.j11);
            o.LJIIIIZZ(review_list_header, "review_list_header");
            ViewGroup.LayoutParams layoutParams2 = review_list_header.getLayoutParams();
            if (layoutParams2 instanceof C80218Ve2) {
                layoutParams = layoutParams2;
            }
            C80218Ve2 c80218Ve2 = (C80218Ve2) layoutParams;
            if (c80218Ve2 != null) {
                c80218Ve2.LIZ = 1;
                review_list_header.setLayoutParams(c80218Ve2);
            }
            _$_findCachedViewById(R.id.j10).setVisibility(0);
            return;
        }
        View review_list_header2 = _$_findCachedViewById(R.id.j11);
        o.LJIIIIZZ(review_list_header2, "review_list_header");
        ViewGroup.LayoutParams layoutParams3 = review_list_header2.getLayoutParams();
        if (layoutParams3 instanceof C80218Ve2) {
            layoutParams = layoutParams3;
        }
        C80218Ve2 c80218Ve22 = (C80218Ve2) layoutParams;
        if (c80218Ve22 != null) {
            c80218Ve22.LIZ = -1;
            review_list_header2.setLayoutParams(c80218Ve22);
        }
        _$_findCachedViewById(R.id.j10).setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int intValue;
        Integer num;
        String str;
        super.onCreate(bundle);
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LIZIZ.LJIIJ(true);
        LIZIZ.LIZIZ.LJIIL();
        LIZIZ.LJ(R.attr.cl);
        LIZIZ.LIZJ();
        Context context = getContext();
        if (context != null) {
            C70691Rol.LJIILL = Al();
            C70691Rol.LJIILLIIL = ((Number) this.LJLJLLL.getValue()).intValue();
            C70691Rol.LJIIZILJ = ((Number) this.LJLL.getValue()).intValue();
            if (this.LJZI.getValue() != null && ((num = (Integer) this.LJZI.getValue()) == null || num.intValue() != 0)) {
                String str2 = (String) this.LJLZ.getValue();
                C70690Rok c70690Rok = null;
                Integer num2 = null;
                c70690Rok = null;
                if (str2 != null && (str = (String) this.LJLLLLLL.getValue()) != null) {
                    String str3 = (String) this.LJZ.getValue();
                    if (str3 != null) {
                        num2 = Integer.valueOf(CastIntegerProtector.parseInt(str3));
                    }
                    c70690Rok = new C70690Rok(str2, 0, num2, (Integer) this.LJZI.getValue(), str);
                }
                C70691Rol.LJIJ = c70690Rok;
            } else {
                if (wl() == 2) {
                    intValue = ((Number) this.LJLL.getValue()).intValue();
                } else {
                    intValue = ((Number) this.LJLJLLL.getValue()).intValue();
                }
                C70691Rol.LJIJ = new C70690Rok("", 0, null, Integer.valueOf(intValue), "");
            }
            String str4 = (String) this.LJLLILLLL.getValue();
            o.LJIIIZ(str4, "<set-?>");
            C70691Rol.LJIJJ = str4;
            C70691Rol.LJIJJLI = wl();
            xl().LJLLILLLL = new C70691Rol(context, ((Number) this.LJLLJ.getValue()).intValue(), (String) this.LJLLI.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, X.InterfaceC27438Apm
    public final boolean onDetectBlank(Map<String, String> params) {
        o.LJIIIZ(params, "params");
        if (xl().onDetectBlank(params)) {
            return true;
        }
        if (((ViewGroup) _$_findCachedViewById(R.id.j10)).getChildCount() <= 0 || _$_findCachedViewById(R.id.j10).getHeight() <= 0) {
            params.put("blank_type", "empty_view");
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        C70691Rol c70691Rol;
        C70691Rol c70691Rol2;
        C70691Rol c70691Rol3;
        String str2;
        o.LJIIIZ(eventName, "eventName");
        try {
            try {
                switch (eventName.hashCode()) {
                    case -1309859235:
                        if (eventName.equals("ec_cart_entry_click")) {
                            try {
                                int i = JSONObjectProtectorUtils.getInt(new JSONObject(str), "notice_number");
                                C70691Rol c70691Rol4 = xl().LJLLILLLL;
                                if (c70691Rol4 != null) {
                                    c70691Rol4.LJIILIIL(this, i);
                                }
                            } catch (Exception e) {
                                e = e;
                                break;
                            }
                        }
                        return;
                    case -522436004:
                        if (eventName.equals("ec_im_icon_click") && (c70691Rol3 = xl().LJLLILLLL) != null) {
                            c70691Rol3.LJIJJ(this);
                        }
                        return;
                    case -267333701:
                        if (eventName.equals("ec_sku_submit")) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            JSONObject jSONObject = new JSONObject(str);
                            boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject, "is_buy_with_coupon");
                            String string = JSONObjectProtectorUtils.getString(jSONObject, "sku_item");
                            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "logistic_info");
                            SkuItem skuItem = (SkuItem) C75792yF.LIZ(string, SkuItem.class);
                            C70357RjN c70357RjN = (C70357RjN) C75792yF.LIZ(string2, C70357RjN.class);
                            int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "quantity");
                            int i3 = JSONObjectProtectorUtils.getInt(jSONObject, "product_type");
                            int i4 = JSONObjectProtectorUtils.getInt(jSONObject, "sku_show_type");
                            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "promotion_da_info");
                            HeaderBannerDaInfo headerBannerDaInfo = (HeaderBannerDaInfo) C75792yF.LIZ(JSONObjectProtectorUtils.getString(jSONObject, "header_banner_da_info"), HeaderBannerDaInfo.class);
                            C70691Rol c70691Rol5 = xl().LJLLILLLL;
                            if (c70691Rol5 != null) {
                                if (skuItem != null) {
                                    str2 = skuItem.skuId;
                                } else {
                                    str2 = null;
                                }
                                Integer valueOf = Integer.valueOf(i2);
                                Integer valueOf2 = Integer.valueOf(i3);
                                Integer valueOf3 = Integer.valueOf(i4);
                                o.LJIIIIZZ(skuItem, "skuItem");
                                c70691Rol5.LJJIJ(this, z, elapsedRealtime, str2, valueOf, valueOf2, valueOf3, C38891fp.LJJIL(skuItem), c70357RjN, string3, null, headerBannerDaInfo);
                            }
                        }
                        return;
                    case -234587192:
                        if (!eventName.equals("ec_add_cart_click")) {
                            return;
                        }
                        String buttonType = JSONObjectProtectorUtils.getString(new JSONObject(str), "button_type");
                        C70691Rol c70691Rol6 = xl().LJLLILLLL;
                        if (c70691Rol6 == null) {
                            return;
                        }
                        o.LJIIIIZZ(buttonType, "buttonType");
                        c70691Rol6.LJIIIIZZ(this, buttonType);
                        return;
                    case -124420061:
                        if (!eventName.equals("ec_share_icon_click") || (c70691Rol2 = xl().LJLLILLLL) == null) {
                            return;
                        }
                        c70691Rol2.LJJII(this);
                        return;
                    case 1408357164:
                        if (!eventName.equals("ec_seller_shop_icon_click") || (c70691Rol = xl().LJLLILLLL) == null) {
                            return;
                        }
                        c70691Rol.LJJIIJ(this);
                        return;
                    case 1748555397:
                        if (!eventName.equals("ec_buy_now_click")) {
                            return;
                        }
                        JSONObjectProtectorUtils.getBoolean(new JSONObject(str), "is_buy_with_coupon");
                        C70691Rol c70691Rol7 = xl().LJLLILLLL;
                        if (c70691Rol7 == null) {
                            return;
                        }
                        c70691Rol7.LJIIL(this);
                        return;
                    case 1815769014:
                        if (!eventName.equals("ec_back_from_review")) {
                            return;
                        }
                        this.LLFFF = true;
                        C70691Rol c70691Rol8 = xl().LJLLILLLL;
                        if (c70691Rol8 == null) {
                            return;
                        }
                        c70691Rol8.LJJIJIL(this);
                        return;
                    default:
                        return;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductReviewFragment onEvent Exception: ");
        LIZ.append(e);
        LIZ.append(", eventName=");
        LIZ.append(eventName);
        LIZ.append(", params=");
        LIZ.append(str);
        C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C70818Rqo c70818Rqo = new C70818Rqo(this);
        ((C73305Spp) _$_findCachedViewById(R.id.j1_)).LIZJ(c70818Rqo.LIZ);
        ((C73305Spp) _$_findCachedViewById(R.id.j1_)).LIZIZ(c70818Rqo);
        this.LLFII = c70818Rqo;
        C73156SnQ.LJIIIIZZ(this, xl(), new TBT() { // from class: X.Rqw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getStatus();
            }
        }, new AqS194S0100000_12(this, 244));
        C73156SnQ.LJIIIIZZ(this, xl(), new TBT() { // from class: X.Rp7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getSelectFilterId();
            }
        }, new AqS194S0100000_12(this, 246));
        C73156SnQ.LJIIIIZZ(this, xl(), new TBT() { // from class: X.RpM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getCountStr();
            }
        }, new AqS194S0100000_12(this, 248));
        C73156SnQ.LJIIIIZZ(this, xl(), new TBT() { // from class: X.Rqs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getFilterData();
            }
        }, new AqS194S0100000_12(this, 231));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j10);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        recyclerView.setLayoutManager(new ScrollTopLinearLayoutManager(requireContext));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.j10);
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        recyclerView2.LJII(new C71312Rym(0.0f, AnonymousClass636.LJIIIIZZ(R.attr.dz, requireContext2), 2, 0), -1);
        C70846RrG LIZ = C70845RrF.LIZ(this, xl().LJLLJ);
        SQU.LIZ(LIZ, IHJ.LJLIL, new AqS178S0100000_12(this, 625));
        C73181Snp LJJIZ = C1DJ.LJJIZ(LIZ);
        LJJIZ.LIZ = 244;
        C70830Rr0 creator = C70830Rr0.LJLIL;
        o.LJIIJ(creator, "creator");
        LJJIZ.LIZIZ = creator;
        LJJIZ.LJIIJ = xl();
        LJJIZ.LJ = new C70856RrQ(new AqS178S0100000_12(this, 626), new AqS194S0100000_12(this, 249), new AqS194S0100000_12(this, LiveCoverMinSizeSetting.DEFAULT));
        LJJIZ.LJI = new AqS178S0100000_12(this, 604);
        LJJIZ.LIZLLL = new AqS194S0100000_12(this, 232);
        RecyclerView review_list = (RecyclerView) _$_findCachedViewById(R.id.j10);
        o.LJIIIIZZ(review_list, "review_list");
        LJJIZ.LIZ(review_list);
        ((RecyclerView) _$_findCachedViewById(R.id.j10)).LJIIJJI(new IDrS15S0000000_12(0));
        _$_findCachedViewById(R.id.le_).setVisibility(8);
        ((RecyclerView) _$_findCachedViewById(R.id.j10)).LJIIJJI(new C70785RqH(this));
        _$_findCachedViewById(R.id.le_).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 175)));
        if (C53204KuO.LIZ()) {
            C26059AKp.LIZ().LIZJ("ec_cart_entry_click", this);
            C26059AKp.LIZ().LIZJ("ec_share_icon_click", this);
            C26059AKp.LIZ().LIZJ("ec_buy_now_click", this);
            C26059AKp.LIZ().LIZJ("ec_sku_submit", this);
            C26059AKp.LIZ().LIZJ("ec_add_cart_click", this);
            C26059AKp.LIZ().LIZJ("ec_seller_shop_icon_click", this);
            C26059AKp.LIZ().LIZJ("ec_im_icon_click", this);
            C26059AKp.LIZ().LIZJ("ec_back_from_review", this);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a6h, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
