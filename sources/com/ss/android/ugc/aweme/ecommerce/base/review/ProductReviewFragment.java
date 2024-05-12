package com.ss.android.ugc.aweme.ecommerce.base.review;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1DJ;
import X.C1GE;
import X.C221108m2;
import X.C26059AKp;
import X.C26515Aat;
import X.C26516Aau;
import X.C26695Adn;
import X.C26696Ado;
import X.C26699Adr;
import X.C27162AlK;
import X.C29S;
import X.C38891fp;
import X.C3C5;
import X.C47261Igj;
import X.C53204KuO;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70357RjN;
import X.C70690Rok;
import X.C70691Rol;
import X.C70694Roo;
import X.C70696Roq;
import X.C70721RpF;
import X.C70782RqE;
import X.C70784RqG;
import X.C70786RqI;
import X.C70787RqJ;
import X.C70788RqK;
import X.C70789RqL;
import X.C70790RqM;
import X.C70791RqN;
import X.C70792RqO;
import X.C70828Rqy;
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
import X.C80217Ve1;
import X.C80218Ve2;
import X.C90903hW;
import X.InterfaceC60061Nhh;
import X.LBV;
import X.LTF;
import X.SQU;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnClickListenerC26698Adq;
import X.X1D;
import Y.ACListenerS23S0101000_4;
import Y.ACListenerS37S0300000_12;
import Y.ARunnableS48S0100000_12;
import Y.IDCListenerS258S0100000_12;
import Y.IDrS15S0000000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpReviewClickEvent;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.AqS79S0400000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class ProductReviewFragment extends ECBaseJediFragment implements InterfaceC60061Nhh {
    public boolean LLD;
    public final lifecycleAwareLazy LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final boolean LLFZ;
    public boolean LLI;
    public final ARunnableS48S0100000_12 LLIFFJFJJ;
    public long LLII;
    public final IDCListenerS258S0100000_12 LLIIII;
    public final Map<Integer, View> LLIIIILZ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new C70789RqL(this));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new C70791RqN(this));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new C70787RqJ(this));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new C70788RqK(this));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new C70792RqO(this));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new C70790RqM(this));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 415));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new C70786RqI(this));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 412));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 418));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 408));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 417));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 407));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 406));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 416));
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 411));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 413));
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 414));
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 409));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 405));
    public final Handler LL = new Handler(C16880lQ.LLJJJJ());

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIILZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLIIIILZ;
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

    public ProductReviewFragment() {
        AqS194S0100000_12 aqS194S0100000_12 = new AqS194S0100000_12(this, 74);
        C65776Prg LIZ = C65352Pkq.LIZ(ProductReviewViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 419);
        this.LLF = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, aqS194S0100000_12, 7));
        this.LLFF = C221108m2.LIZIZ(C70696Roq.LJLIL);
        this.LLFFF = C221108m2.LIZIZ(C70694Roo.LJLIL);
        this.LLFII = C221108m2.LIZIZ(new AqS162S0100000_12(this, 410));
        C26515Aat.LIZ.getClass();
        this.LLFZ = C26515Aat.LIZ();
        this.LLIFFJFJJ = new ARunnableS48S0100000_12(this, 20);
        this.LLIIII = new IDCListenerS258S0100000_12(this, 1);
    }

    public final boolean Al() {
        return ((Boolean) this.LJLJLJ.getValue()).booleanValue();
    }

    public final PdpReviewClickEvent Dl() {
        return (PdpReviewClickEvent) this.LJZL.getValue();
    }

    public final int Gl() {
        return ((Number) this.LLFII.getValue()).intValue();
    }

    public final ProductReviewViewModel Hl() {
        return (ProductReviewViewModel) this.LLF.getValue();
    }

    public final float Il() {
        return ((Number) this.LJLJL.getValue()).floatValue();
    }

    public final boolean Jl() {
        return ((Boolean) this.LLFF.getValue()).booleanValue();
    }

    public final void Ll() {
        this.LLII = SystemClock.elapsedRealtime();
        this.LL.removeCallbacks(this.LLIFFJFJJ);
        Kl(false);
        if (this.LLFZ) {
            C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.jyk);
            if (c73305Spp == null) {
                return;
            }
            c73305Spp.setVisibility(0);
            return;
        }
        C73305Spp c73305Spp2 = (C73305Spp) _$_findCachedViewById(R.id.j1_);
        if (c73305Spp2 == null) {
            return;
        }
        c73305Spp2.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        if (Gl() == 2) {
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
        C70691Rol c70691Rol = Hl().LJLLILLLL;
        if (c70691Rol != null) {
            c70691Rol.LJI = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C70691Rol c70691Rol = Hl().LJLLILLLL;
        if (c70691Rol != null) {
            c70691Rol.LJJIZ(this, this.LLI);
        }
    }

    public final void Kl(boolean z) {
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            if (this.LLFZ) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.jyj);
                if (_$_findCachedViewById != null) {
                    ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById.getLayoutParams();
                    if (layoutParams2 instanceof C80218Ve2) {
                        layoutParams = layoutParams2;
                    }
                    C80218Ve2 c80218Ve2 = (C80218Ve2) layoutParams;
                    if (c80218Ve2 != null) {
                        c80218Ve2.LIZ = 1;
                        _$_findCachedViewById.setLayoutParams(c80218Ve2);
                    }
                }
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.jyi);
                if (_$_findCachedViewById2 == null) {
                    return;
                }
                _$_findCachedViewById2.setVisibility(0);
                return;
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.j11);
            if (_$_findCachedViewById3 != null) {
                ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById3.getLayoutParams();
                if (layoutParams3 instanceof C80218Ve2) {
                    layoutParams = layoutParams3;
                }
                C80218Ve2 c80218Ve22 = (C80218Ve2) layoutParams;
                if (c80218Ve22 != null) {
                    c80218Ve22.LIZ = 1;
                    _$_findCachedViewById3.setLayoutParams(c80218Ve22);
                }
            }
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.j10);
            if (_$_findCachedViewById4 == null) {
                return;
            }
            _$_findCachedViewById4.setVisibility(0);
            return;
        }
        if (this.LLFZ) {
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.jyj);
            if (_$_findCachedViewById5 != null) {
                ViewGroup.LayoutParams layoutParams4 = _$_findCachedViewById5.getLayoutParams();
                if (layoutParams4 instanceof C80218Ve2) {
                    layoutParams = layoutParams4;
                }
                C80218Ve2 c80218Ve23 = (C80218Ve2) layoutParams;
                if (c80218Ve23 != null) {
                    c80218Ve23.LIZ = -1;
                    _$_findCachedViewById5.setLayoutParams(c80218Ve23);
                }
            }
            View _$_findCachedViewById6 = _$_findCachedViewById(R.id.jyi);
            if (_$_findCachedViewById6 == null) {
                return;
            }
            _$_findCachedViewById6.setVisibility(8);
            return;
        }
        View _$_findCachedViewById7 = _$_findCachedViewById(R.id.jyj);
        if (_$_findCachedViewById7 != null) {
            ViewGroup.LayoutParams layoutParams5 = _$_findCachedViewById7.getLayoutParams();
            if (layoutParams5 instanceof C80218Ve2) {
                layoutParams = layoutParams5;
            }
            C80218Ve2 c80218Ve24 = (C80218Ve2) layoutParams;
            if (c80218Ve24 != null) {
                c80218Ve24.LIZ = -1;
                _$_findCachedViewById7.setLayoutParams(c80218Ve24);
            }
        }
        View _$_findCachedViewById8 = _$_findCachedViewById(R.id.j10);
        if (_$_findCachedViewById8 == null) {
            return;
        }
        _$_findCachedViewById8.setVisibility(8);
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
            C70691Rol.LJIILL = Il();
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
                if (Gl() == 2) {
                    intValue = ((Number) this.LJLL.getValue()).intValue();
                } else {
                    intValue = ((Number) this.LJLJLLL.getValue()).intValue();
                }
                C70691Rol.LJIJ = new C70690Rok("", 0, null, Integer.valueOf(intValue), "");
            }
            String str4 = (String) this.LJLLILLLL.getValue();
            o.LJIIIZ(str4, "<set-?>");
            C70691Rol.LJIJJ = str4;
            C70691Rol.LJIJJLI = Gl();
            Hl().LJLLILLLL = new C70691Rol(context, ((Number) this.LJLLJ.getValue()).intValue(), (String) this.LJLLI.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, X.InterfaceC27438Apm
    public final boolean onDetectBlank(Map<String, String> params) {
        ViewGroup viewGroup;
        o.LJIIIZ(params, "params");
        if (Hl().onDetectBlank(params)) {
            return true;
        }
        if (this.LLFZ) {
            viewGroup = (ViewGroup) _$_findCachedViewById(R.id.jyi);
        } else {
            viewGroup = (ViewGroup) _$_findCachedViewById(R.id.j10);
        }
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || viewGroup.getHeight() <= 0) {
            params.put("blank_type", "empty_view");
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0039. Please report as an issue. */
    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        Integer num;
        PreOrderInfo preOrderInfo;
        C70691Rol c70691Rol;
        C70691Rol c70691Rol2;
        C70691Rol c70691Rol3;
        o.LJIIIZ(eventName, "eventName");
        try {
            try {
                try {
                    switch (eventName.hashCode()) {
                        case -1309859235:
                            if (eventName.equals("ec_cart_entry_click")) {
                                try {
                                    int i = JSONObjectProtectorUtils.getInt(new JSONObject(str), "notice_number");
                                    C70691Rol c70691Rol4 = Hl().LJLLILLLL;
                                    if (c70691Rol4 != null) {
                                        c70691Rol4.LJIILIIL(this, i);
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("ProductReviewFragment onEvent Exception: ");
                                    LIZ.append(e);
                                    LIZ.append(", eventName=");
                                    LIZ.append(eventName);
                                    LIZ.append(", params=");
                                    LIZ.append(str);
                                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
                                    return;
                                }
                            }
                            return;
                        case -522436004:
                            if (eventName.equals("ec_im_icon_click") && (c70691Rol3 = Hl().LJLLILLLL) != null) {
                                c70691Rol3.LJIJJ(this);
                            }
                            return;
                        case -267333701:
                            try {
                                if (!eventName.equals("ec_sku_submit")) {
                                    return;
                                }
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
                                String str2 = null;
                                if (skuItem != null && (preOrderInfo = skuItem.preOrderInfo) != null) {
                                    num = preOrderInfo.shippingDays;
                                } else {
                                    num = null;
                                }
                                HeaderBannerDaInfo headerBannerDaInfo = (HeaderBannerDaInfo) C75792yF.LIZ(JSONObjectProtectorUtils.getString(jSONObject, "header_banner_da_info"), HeaderBannerDaInfo.class);
                                C70691Rol c70691Rol5 = Hl().LJLLILLLL;
                                if (c70691Rol5 == null) {
                                    return;
                                }
                                if (skuItem != null) {
                                    str2 = skuItem.skuId;
                                }
                                Integer valueOf = Integer.valueOf(i2);
                                Integer valueOf2 = Integer.valueOf(i3);
                                Integer valueOf3 = Integer.valueOf(i4);
                                o.LJIIIIZZ(skuItem, "skuItem");
                                c70691Rol5.LJJIJ(this, z, elapsedRealtime, str2, valueOf, valueOf2, valueOf3, C38891fp.LJJIL(skuItem), c70357RjN, string3, num, headerBannerDaInfo);
                                return;
                            } catch (Exception e2) {
                                e = e2;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("ProductReviewFragment onEvent Exception: ");
                                LIZ2.append(e);
                                LIZ2.append(", eventName=");
                                LIZ2.append(eventName);
                                LIZ2.append(", params=");
                                LIZ2.append(str);
                                C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
                                return;
                            }
                        case -234587192:
                            if (!eventName.equals("ec_add_cart_click")) {
                                return;
                            }
                            String buttonType = JSONObjectProtectorUtils.getString(new JSONObject(str), "button_type");
                            C70691Rol c70691Rol6 = Hl().LJLLILLLL;
                            if (c70691Rol6 == null) {
                                return;
                            }
                            o.LJIIIIZZ(buttonType, "buttonType");
                            c70691Rol6.LJIIIIZZ(this, buttonType);
                            return;
                        case -124420061:
                            if (!eventName.equals("ec_share_icon_click") || (c70691Rol2 = Hl().LJLLILLLL) == null) {
                                return;
                            }
                            c70691Rol2.LJJII(this);
                            return;
                        case 1408357164:
                            if (!eventName.equals("ec_seller_shop_icon_click") || (c70691Rol = Hl().LJLLILLLL) == null) {
                                return;
                            }
                            c70691Rol.LJJIIJ(this);
                            return;
                        case 1748555397:
                            if (!eventName.equals("ec_buy_now_click")) {
                                return;
                            }
                            JSONObjectProtectorUtils.getBoolean(new JSONObject(str), "is_buy_with_coupon");
                            C70691Rol c70691Rol7 = Hl().LJLLILLLL;
                            if (c70691Rol7 == null) {
                                return;
                            }
                            c70691Rol7.LJIIL(this);
                            return;
                        case 1815769014:
                            if (!eventName.equals("ec_back_from_review")) {
                                return;
                            }
                            this.LLI = true;
                            C70691Rol c70691Rol8 = Hl().LJLLILLLL;
                            if (c70691Rol8 == null) {
                                return;
                            }
                            c70691Rol8.LJJIJIL(this);
                            return;
                        default:
                            return;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C70782RqE c70782RqE = new C70782RqE(this);
        if (this.LLFZ) {
            ((C73305Spp) _$_findCachedViewById(R.id.jyk)).LIZJ(c70782RqE.LIZJ);
            ((C73305Spp) _$_findCachedViewById(R.id.jyk)).LIZIZ(c70782RqE);
        } else {
            ((C73305Spp) _$_findCachedViewById(R.id.j1_)).LIZJ(c70782RqE.LIZJ);
            ((C73305Spp) _$_findCachedViewById(R.id.j1_)).LIZIZ(c70782RqE);
        }
        C73156SnQ.LJIIIIZZ(this, Hl(), new TBT() { // from class: X.RqQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getFilterData();
            }
        }, new AqS174S0200000_12(this, c70782RqE, 24));
        if (this.LLFZ) {
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.jyi);
            o.LJIIIIZZ(recyclerView, "view.shop_review_list");
            xl(recyclerView, (C73305Spp) view.findViewById(R.id.jyk));
            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.jyi);
            o.LJIIIIZZ(recyclerView2, "view.shop_review_list");
            C80217Ve1 c80217Ve1 = (C80217Ve1) view.findViewById(R.id.jyj);
            o.LJIIIIZZ(c80217Ve1, "view.shop_review_list_header");
            CardView cardView = (CardView) view.findViewById(R.id.lea);
            if (cardView != null) {
                cardView.setVisibility(8);
            }
            recyclerView2.LJIIJJI(new C70784RqG(c80217Ve1, cardView));
            if (cardView != null) {
                cardView.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS37S0300000_12(this, c80217Ve1, recyclerView2, 10)));
            }
        } else {
            RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.j10);
            o.LJIIIIZZ(recyclerView3, "view.review_list");
            xl(recyclerView3, (C73305Spp) view.findViewById(R.id.j1_));
            RecyclerView recyclerView4 = (RecyclerView) view.findViewById(R.id.j10);
            o.LJIIIIZZ(recyclerView4, "view.review_list");
            C80217Ve1 c80217Ve12 = (C80217Ve1) view.findViewById(R.id.j11);
            o.LJIIIIZZ(c80217Ve12, "view.review_list_header");
            CardView cardView2 = (CardView) view.findViewById(R.id.le_);
            if (cardView2 != null) {
                cardView2.setVisibility(8);
            }
            recyclerView4.LJIIJJI(new C70784RqG(c80217Ve12, cardView2));
            if (cardView2 != null) {
                cardView2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS37S0300000_12(this, c80217Ve12, recyclerView4, 10)));
            }
        }
        if (this.LLFZ) {
            if (((Boolean) this.LLFFF.getValue()).booleanValue() && Jl()) {
                _$_findCachedViewById(R.id.k6w);
                C70691Rol c70691Rol = Hl().LJLLILLLL;
                if (c70691Rol != null) {
                    c70691Rol.LJJIJIIJIL(this, 1);
                }
                View sort_by_default = _$_findCachedViewById(R.id.k6w);
                o.LJIIIIZZ(sort_by_default, "sort_by_default");
                C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 100, 42), sort_by_default);
                View sort_by_time = _$_findCachedViewById(R.id.k6y);
                o.LJIIIIZZ(sort_by_time, "sort_by_time");
                C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 101, 42), sort_by_time);
            } else {
                _$_findCachedViewById(R.id.k74).setVisibility(8);
            }
        } else if (Al()) {
            View star_and_sort_ttf = _$_findCachedViewById(R.id.kbu);
            o.LJIIIIZZ(star_and_sort_ttf, "star_and_sort_ttf");
            star_and_sort_ttf.setVisibility(0);
            View filter_flow_layout = _$_findCachedViewById(R.id.d9t);
            o.LJIIIIZZ(filter_flow_layout, "filter_flow_layout");
            filter_flow_layout.setVisibility(8);
            View sort_by_default_ttf = _$_findCachedViewById(R.id.k6x);
            o.LJIIIIZZ(sort_by_default_ttf, "sort_by_default_ttf");
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 102, 42), sort_by_default_ttf);
            View sort_by_time_ttf = _$_findCachedViewById(R.id.k6z);
            o.LJIIIIZZ(sort_by_time_ttf, "sort_by_time_ttf");
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 103, 42), sort_by_time_ttf);
        } else if (((Boolean) this.LLFFF.getValue()).booleanValue() && Il() >= 0.0f && Jl()) {
            ((LBV) _$_findCachedViewById(R.id.k79)).setOnSwitchTypeListener(new AqS178S0100000_12(this, 622));
            ((LBV) _$_findCachedViewById(R.id.k7_)).setOnSwitchTypeListener(new AqS178S0100000_12(this, 623));
            _$_findCachedViewById(R.id.k71).addOnLayoutChangeListener(this.LLIIII);
        } else {
            _$_findCachedViewById(R.id.k71).setVisibility(8);
            _$_findCachedViewById(R.id.k72).setVisibility(8);
        }
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

    public final void xl(RecyclerView recyclerView, C73305Spp c73305Spp) {
        if (!this.LLFZ) {
            if (Il() >= 0.0f && Jl()) {
                ((C26516Aau) _$_findCachedViewById(R.id.ink)).getMaxScore().setText("5");
                ((C26516Aau) _$_findCachedViewById(R.id.ink)).getScore().setText(String.valueOf(Il()));
                ((LTF) _$_findCachedViewById(R.id.inq)).setRate(Il());
                ((LTF) _$_findCachedViewById(R.id.inq)).setStarSize(16);
                _$_findCachedViewById(R.id.ind).setVisibility(0);
            } else if (!Al()) {
                _$_findCachedViewById(R.id.ind).setVisibility(8);
            }
            if (Al()) {
                View question_text = _$_findCachedViewById(R.id.ikc);
                o.LJIIIIZZ(question_text, "question_text");
                question_text.setVisibility(8);
                View ttf_review_header = _$_findCachedViewById(R.id.lmr);
                o.LJIIIIZZ(ttf_review_header, "ttf_review_header");
                ttf_review_header.setVisibility(0);
                ((TextView) _$_findCachedViewById(R.id.inn)).setText(String.valueOf(Il()));
                ((TuxTextView) _$_findCachedViewById(R.id.inn)).LJJJ(32.0f);
                ((LTF) _$_findCachedViewById(R.id.inr)).setRate(Il());
                ((LTF) _$_findCachedViewById(R.id.inr)).setStarSize(16);
            }
        }
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        recyclerView.setLayoutManager(new ScrollTopLinearLayoutManager(requireContext));
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        recyclerView.LJII(new C71312Rym(0.0f, AnonymousClass636.LJIIIIZZ(R.attr.dz, requireContext2), 2, 0), -1);
        C73156SnQ.LJIIIIZZ(this, Hl(), new TBT() { // from class: X.RpE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getSelectFilterId();
            }
        }, new AqS174S0200000_12(this, c73305Spp, 11));
        C70846RrG LIZ = C70845RrF.LIZ(this, Hl().LJLLJ);
        SQU.LIZ(LIZ, C70721RpF.LJLIL, new AqS178S0100000_12(this, 153));
        C73181Snp LJJIZ = C1DJ.LJJIZ(LIZ);
        LJJIZ.LIZ = 244;
        C70828Rqy creator = C70828Rqy.LJLIL;
        o.LJIIJ(creator, "creator");
        LJJIZ.LIZIZ = creator;
        LJJIZ.LJIIJ = Hl();
        LJJIZ.LJ = new C70856RrQ(new AqS143S0200000_12(this, c73305Spp, 37), new AqS174S0200000_12(this, c73305Spp, 12), new AqS174S0200000_12(this, c73305Spp, 13));
        LJJIZ.LJI = new AqS178S0100000_12(this, 155);
        LJJIZ.LIZLLL = new AqS194S0100000_12(this, 75);
        LJJIZ.LIZ(recyclerView);
        recyclerView.LJIIJJI(new IDrS15S0000000_12(1));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        if (this.LLFZ) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a77, viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a5z, viewGroup, false);
        }
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

    public final void vl(C26696Ado c26696Ado, C26699Adr c26699Adr, List list) {
        int i;
        int i2;
        if (C1GE.LJIILIIL(list)) {
            i = 0;
        } else {
            i = 8;
        }
        c26699Adr.setVisibility(i);
        Object value = this.LJLLLLLL.getValue();
        if (c26699Adr.LJLIL.getChildCount() == 0) {
            c26699Adr.LJLIL.removeAllViews();
            Iterator it = ((ArrayList) list).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) next;
                    Context context = c26699Adr.getContext();
                    o.LJIIIIZZ(context, "context");
                    C26695Adn c26695Adn = new C26695Adn(context);
                    c26695Adn.setBackgroundResource(R.drawable.afw);
                    c26695Adn.getPre().setText(reviewFilterStruct.name);
                    c26695Adn.getSuf().setText(reviewFilterStruct.countStr);
                    TuxIconView star = c26695Adn.getStar();
                    Integer num = reviewFilterStruct.type;
                    if (num == null || num.intValue() != 2) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    star.setVisibility(i2);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    int i5 = C27162AlK.LJIIIZ;
                    marginLayoutParams.rightMargin = i5;
                    marginLayoutParams.bottomMargin = i5;
                    marginLayoutParams.setMarginEnd(i5);
                    c26695Adn.setLayoutParams(marginLayoutParams);
                    if (o.LJ(reviewFilterStruct.filterId, value)) {
                        c26699Adr.LJLJI = c26695Adn;
                        c26695Adn.LIZ(true);
                    }
                    c26695Adn.setTag(reviewFilterStruct);
                    c26695Adn.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC26698Adq(c26699Adr, i3)));
                    c26699Adr.LJLIL.addView(c26695Adn);
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        c26699Adr.setOnSelectedChangeListener(new AqS79S0400000_12(this, c26696Ado, c26699Adr, list, 1));
    }

    public final void wl(C26696Ado c26696Ado, C26699Adr c26699Adr, List<ReviewFilterStruct> list) {
        int i;
        Object value = this.LJLLLLLL.getValue();
        if (c26696Ado.LJLIL.getChildCount() == 0) {
            c26696Ado.LJLIL.removeAllViews();
            Iterator it = ((ArrayList) list).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) next;
                    Context context = c26696Ado.getContext();
                    o.LJIIIIZZ(context, "context");
                    C26695Adn c26695Adn = new C26695Adn(context);
                    TextView suf = c26695Adn.getSuf();
                    if (suf != null) {
                        suf.setText(reviewFilterStruct.countStr);
                    }
                    TuxIconView star = c26695Adn.getStar();
                    if (star != null) {
                        Integer num = reviewFilterStruct.type;
                        if (num == null || num.intValue() != 2) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        star.setVisibility(i);
                    }
                    if (o.LJ("102", reviewFilterStruct.filterId)) {
                        TuxIconView star2 = c26695Adn.getStar();
                        if (star2 != null) {
                            star2.setVisibility(0);
                        }
                        TuxIconView star3 = c26695Adn.getStar();
                        if (star3 != null) {
                            star3.setIconRes(R.raw.icon_camera_fill);
                        }
                        TuxIconView star4 = c26695Adn.getStar();
                        if (star4 != null) {
                            star4.setTintColorRes(R.attr.go);
                        }
                        TextView pre = c26695Adn.getPre();
                        if (pre != null) {
                            pre.setVisibility(8);
                        }
                        TextView suf2 = c26695Adn.getSuf();
                        if (suf2 != null) {
                            suf2.setText(reviewFilterStruct.name + reviewFilterStruct.countStr);
                        }
                    } else {
                        TextView pre2 = c26695Adn.getPre();
                        if (pre2 != null) {
                            pre2.setVisibility(0);
                        }
                        TextView pre3 = c26695Adn.getPre();
                        if (pre3 != null) {
                            pre3.setText(reviewFilterStruct.name);
                        }
                        TextView suf3 = c26695Adn.getSuf();
                        if (suf3 != null) {
                            suf3.setText(reviewFilterStruct.countStr);
                        }
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    int i4 = C27162AlK.LJIIIZ;
                    marginLayoutParams.rightMargin = i4;
                    marginLayoutParams.setMarginEnd(i4);
                    c26695Adn.setLayoutParams(marginLayoutParams);
                    if (o.LJ(reviewFilterStruct.filterId, value)) {
                        c26696Ado.LJLJJI = c26695Adn;
                        c26695Adn.LIZ(false);
                    }
                    c26695Adn.setTag(reviewFilterStruct);
                    c26695Adn.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0101000_4(i2, c26696Ado, 7)));
                    c26696Ado.LJLIL.addView(c26695Adn);
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        c26696Ado.setOnSelectedChangeListener(new AqS79S0400000_12(this, c26696Ado, c26699Adr, list, 0));
    }
}
