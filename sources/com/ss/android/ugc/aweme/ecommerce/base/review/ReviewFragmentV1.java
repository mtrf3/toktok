package com.ss.android.ugc.aweme.ecommerce.base.review;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1DJ;
import X.C221108m2;
import X.C26059AKp;
import X.C27749Aun;
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
import X.C70810Rqg;
import X.C70811Rqh;
import X.C70812Rqi;
import X.C70813Rqj;
import X.C70814Rqk;
import X.C70815Rql;
import X.C70816Rqm;
import X.C70817Rqn;
import X.C70829Rqz;
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
import X.C7MY;
import X.C80218Ve2;
import X.C90903hW;
import X.IHI;
import X.InterfaceC60061Nhh;
import X.Q8U;
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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
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
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class ReviewFragmentV1 extends ECBaseJediFragment implements InterfaceC60061Nhh {
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final Handler LJZL;
    public boolean LL;
    public final lifecycleAwareLazy LLD;
    public final C62822Ol8 LLF;
    public boolean LLFF;
    public C70817Rqn LLFFF;
    public boolean LLFII;
    public final ARunnableS48S0100000_12 LLFZ;
    public long LLI;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new C70812Rqi(this));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new C70814Rqk(this));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new C70810Rqg(this));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new C70811Rqh(this));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new C70815Rql(this));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new C70813Rqj(this));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 446));

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

    public ReviewFragmentV1() {
        boolean z;
        C221108m2.LIZIZ(new C70816Rqm(this));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 445));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 448));
        this.LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 443));
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 447));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 435));
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 442));
        this.LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 440));
        this.LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 437));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 438));
        this.LJLZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 439));
        this.LJZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 436));
        this.LJZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 441));
        this.LJZL = new Handler(C16880lQ.LLJJJJ());
        AqS194S0100000_12 aqS194S0100000_12 = new AqS194S0100000_12(this, 78);
        C65776Prg LIZ = C65352Pkq.LIZ(ProductReviewViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 449);
        this.LLD = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, aqS194S0100000_12, 9));
        this.LLF = C221108m2.LIZIZ(new AqS162S0100000_12(this, 444));
        if (Dl() == -1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.LLFII = !z;
        this.LLFZ = new ARunnableS48S0100000_12(this, 22);
    }

    public final ProductReviewViewModel Al() {
        return (ProductReviewViewModel) this.LLD.getValue();
    }

    public final float Dl() {
        return ((Number) this.LJLJL.getValue()).floatValue();
    }

    public final PdpReviewClickEvent vl() {
        return (PdpReviewClickEvent) this.LJZI.getValue();
    }

    public final int wl() {
        return ((Number) this.LLF.getValue()).intValue();
    }

    public final int xl() {
        return ((Number) this.LJLJLJ.getValue()).intValue();
    }

    public final void Il() {
        this.LLI = SystemClock.elapsedRealtime();
        this.LJZL.removeCallbacks(this.LLFZ);
        Hl(false);
        ((C73305Spp) _$_findCachedViewById(R.id.j1a)).setVisibility(0);
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
        C70691Rol c70691Rol = Al().LJLLILLLL;
        if (c70691Rol != null) {
            c70691Rol.LJI = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C70691Rol c70691Rol = Al().LJLLILLLL;
        if (c70691Rol != null) {
            c70691Rol.LJJIZ(this, this.LLFF);
        }
    }

    public final String Gl(Integer num) {
        if (num == null || num.intValue() != 2) {
            if (num == null || num.intValue() != 1) {
                String string = getString(R.string.smj);
                o.LJIIIIZZ(string, "getString(R.string.ttec_review_sort_relevant)");
                return string;
            }
            String string2 = getString(R.string.smj);
            o.LJIIIIZZ(string2, "getString(R.string.ttec_review_sort_relevant)");
            return string2;
        }
        String string3 = getString(R.string.smh);
        o.LJIIIIZZ(string3, "getString(R.string.ttec_review_sort_recent)");
        return string3;
    }

    public final void Hl(boolean z) {
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            View review_list_header_v1 = _$_findCachedViewById(R.id.j13);
            o.LJIIIIZZ(review_list_header_v1, "review_list_header_v1");
            ViewGroup.LayoutParams layoutParams2 = review_list_header_v1.getLayoutParams();
            if (layoutParams2 instanceof C80218Ve2) {
                layoutParams = layoutParams2;
            }
            C80218Ve2 c80218Ve2 = (C80218Ve2) layoutParams;
            if (c80218Ve2 != null) {
                c80218Ve2.LIZ = 1;
                review_list_header_v1.setLayoutParams(c80218Ve2);
            }
            _$_findCachedViewById(R.id.j14).setVisibility(0);
            return;
        }
        View review_list_header_v12 = _$_findCachedViewById(R.id.j13);
        o.LJIIIIZZ(review_list_header_v12, "review_list_header_v1");
        ViewGroup.LayoutParams layoutParams3 = review_list_header_v12.getLayoutParams();
        if (layoutParams3 instanceof C80218Ve2) {
            layoutParams = layoutParams3;
        }
        C80218Ve2 c80218Ve22 = (C80218Ve2) layoutParams;
        if (c80218Ve22 != null) {
            c80218Ve22.LIZ = -1;
            review_list_header_v12.setLayoutParams(c80218Ve22);
        }
        _$_findCachedViewById(R.id.j14).setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int xl;
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
            C70691Rol.LJIILL = Dl();
            C70691Rol.LJIILLIIL = xl();
            C70691Rol.LJIIZILJ = ((Number) this.LJLJLLL.getValue()).intValue();
            if (this.LJZ.getValue() != null && ((num = (Integer) this.LJZ.getValue()) == null || num.intValue() != 0)) {
                String str2 = (String) this.LJLLLLLL.getValue();
                C70690Rok c70690Rok = null;
                Integer num2 = null;
                c70690Rok = null;
                if (str2 != null && (str = (String) this.LJLLLL.getValue()) != null) {
                    String str3 = (String) this.LJLZ.getValue();
                    if (str3 != null) {
                        num2 = Integer.valueOf(CastIntegerProtector.parseInt(str3));
                    }
                    c70690Rok = new C70690Rok(str2, 0, num2, (Integer) this.LJZ.getValue(), str);
                }
                C70691Rol.LJIJ = c70690Rok;
            } else {
                if (wl() == 2) {
                    xl = ((Number) this.LJLJLLL.getValue()).intValue();
                } else {
                    xl = xl();
                }
                C70691Rol.LJIJ = new C70690Rok("", 0, null, Integer.valueOf(xl), "");
            }
            String str4 = (String) this.LJLLI.getValue();
            o.LJIIIZ(str4, "<set-?>");
            C70691Rol.LJIJJ = str4;
            C70691Rol.LJIJJLI = wl();
            Al().LJLLILLLL = new C70691Rol(context, ((Number) this.LJLLILLLL.getValue()).intValue(), (String) this.LJLL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, X.InterfaceC27438Apm
    public final boolean onDetectBlank(Map<String, String> params) {
        o.LJIIIZ(params, "params");
        if (Al().onDetectBlank(params)) {
            return true;
        }
        if (((ViewGroup) _$_findCachedViewById(R.id.j14)).getChildCount() <= 0 || _$_findCachedViewById(R.id.j14).getHeight() <= 0) {
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
                                C70691Rol c70691Rol4 = Al().LJLLILLLL;
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
                        if (eventName.equals("ec_im_icon_click") && (c70691Rol3 = Al().LJLLILLLL) != null) {
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
                            C70691Rol c70691Rol5 = Al().LJLLILLLL;
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
                        C70691Rol c70691Rol6 = Al().LJLLILLLL;
                        if (c70691Rol6 == null) {
                            return;
                        }
                        o.LJIIIIZZ(buttonType, "buttonType");
                        c70691Rol6.LJIIIIZZ(this, buttonType);
                        return;
                    case -124420061:
                        if (!eventName.equals("ec_share_icon_click") || (c70691Rol2 = Al().LJLLILLLL) == null) {
                            return;
                        }
                        c70691Rol2.LJJII(this);
                        return;
                    case 1408357164:
                        if (!eventName.equals("ec_seller_shop_icon_click") || (c70691Rol = Al().LJLLILLLL) == null) {
                            return;
                        }
                        c70691Rol.LJJIIJ(this);
                        return;
                    case 1748555397:
                        if (!eventName.equals("ec_buy_now_click")) {
                            return;
                        }
                        JSONObjectProtectorUtils.getBoolean(new JSONObject(str), "is_buy_with_coupon");
                        C70691Rol c70691Rol7 = Al().LJLLILLLL;
                        if (c70691Rol7 == null) {
                            return;
                        }
                        c70691Rol7.LJIIL(this);
                        return;
                    case 1815769014:
                        if (!eventName.equals("ec_back_from_review")) {
                            return;
                        }
                        this.LLFF = true;
                        C70691Rol c70691Rol8 = Al().LJLLILLLL;
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
        int i;
        int i2;
        int i3;
        String LIZIZ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C70817Rqn c70817Rqn = new C70817Rqn(requireContext);
        ((C73305Spp) _$_findCachedViewById(R.id.j1a)).LIZJ(c70817Rqn.LIZ);
        ((C73305Spp) _$_findCachedViewById(R.id.j1a)).LIZIZ(c70817Rqn);
        this.LLFFF = c70817Rqn;
        ImageView tv_rating_star_v1 = (ImageView) _$_findCachedViewById(R.id.mgn);
        o.LJIIIIZZ(tv_rating_star_v1, "tv_rating_star_v1");
        if (this.LLFII) {
            i = 0;
        } else {
            i = 8;
        }
        tv_rating_star_v1.setVisibility(i);
        View tv_rating_score_v1 = _$_findCachedViewById(R.id.mgl);
        o.LJIIIIZZ(tv_rating_score_v1, "tv_rating_score_v1");
        if (this.LLFII) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tv_rating_score_v1.setVisibility(i2);
        View review_account_split = _$_findCachedViewById(R.id.j0b);
        o.LJIIIIZZ(review_account_split, "review_account_split");
        if (this.LLFII) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        review_account_split.setVisibility(i3);
        ((TextView) _$_findCachedViewById(R.id.mgl)).setText(String.valueOf(Dl()));
        View rating_progress_bar_group_v1 = _$_findCachedViewById(R.id.inp);
        o.LJIIIIZZ(rating_progress_bar_group_v1, "rating_progress_bar_group_v1");
        rating_progress_bar_group_v1.setVisibility(8);
        View review_ratings = _$_findCachedViewById(R.id.j17);
        o.LJIIIIZZ(review_ratings, "review_ratings");
        review_ratings.setVisibility(8);
        TextView textView = (TextView) _$_findCachedViewById(R.id.j0c);
        if (xl() == 0 || xl() == 1) {
            String string = getString(R.string.fc3);
            o.LJIIIIZZ(string, "getString(R.string.ecom_pdp_reviews_count_1)");
            LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(xl())}, 1, string, "format(format, *args)");
        } else {
            String string2 = getString(R.string.fc2);
            o.LJIIIIZZ(string2, "getString(R.string.ecom_pdp_reviews_count)");
            LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(xl())}, 1, string2, "format(format, *args)");
        }
        textView.setText(LIZIZ);
        C73156SnQ.LJIIIIZZ(this, Al(), new TBT() { // from class: X.Rqv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getStatus();
            }
        }, new AqS194S0100000_12(this, 241));
        C73156SnQ.LJII(this, Al(), new TBT() { // from class: X.RpK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getCountStrV2();
            }
        }, new TBT() { // from class: X.Rqx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getCount();
            }
        }, new IDqS436S0100000_12(this, 33));
        C73156SnQ.LJIIIIZZ(this, Al(), new TBT() { // from class: X.RpJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getRate();
            }
        }, new AqS194S0100000_12(this, 245));
        C73156SnQ.LJIIIIZZ(this, Al(), new TBT() { // from class: X.RpL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getReviewRatingsLink();
            }
        }, new AqS194S0100000_12(this, 247));
        C73156SnQ.LJIIIIZZ(this, Al(), new TBT() { // from class: X.Rqr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getFilterData();
            }
        }, new AqS194S0100000_12(this, 238));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j14);
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        recyclerView.setLayoutManager(new ScrollTopLinearLayoutManager(requireContext2));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.j14);
        Context requireContext3 = requireContext();
        o.LJIIIIZZ(requireContext3, "requireContext()");
        recyclerView2.LJII(new C71312Rym(0.0f, AnonymousClass636.LJIIIIZZ(R.attr.cr, requireContext3), C7MY.LIZIZ(16)), -1);
        C70846RrG LIZ = C70845RrF.LIZ(this, Al().LJLLJ);
        SQU.LIZ(LIZ, IHI.LJLIL, new AqS178S0100000_12(this, 610));
        C73181Snp LJJIZ = C1DJ.LJJIZ(LIZ);
        LJJIZ.LIZ = 244;
        C70829Rqz creator = C70829Rqz.LJLIL;
        o.LJIIJ(creator, "creator");
        LJJIZ.LIZIZ = creator;
        LJJIZ.LJIIJ = Al();
        LJJIZ.LJ = new C70856RrQ(new AqS178S0100000_12(this, 614), new AqS194S0100000_12(this, 239), new AqS194S0100000_12(this, 240));
        LJJIZ.LJI = new AqS178S0100000_12(this, 616);
        LJJIZ.LIZLLL = new AqS194S0100000_12(this, 242);
        RecyclerView review_list_v1 = (RecyclerView) _$_findCachedViewById(R.id.j14);
        o.LJIIIIZZ(review_list_v1, "review_list_v1");
        LJJIZ.LIZ(review_list_v1);
        ((RecyclerView) _$_findCachedViewById(R.id.j14)).LJIIJJI(new IDrS15S0000000_12(2));
        _$_findCachedViewById(R.id.leb).setVisibility(8);
        ((RecyclerView) _$_findCachedViewById(R.id.j14)).LJIIJJI(new C27749Aun(this));
        _$_findCachedViewById(R.id.leb).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 176)));
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
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a6i, viewGroup, false);
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
