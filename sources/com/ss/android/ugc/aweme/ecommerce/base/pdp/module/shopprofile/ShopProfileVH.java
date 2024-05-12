package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile;

import X.AnonymousClass391;
import X.C00F;
import X.C110614Vt;
import X.C113554cx;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26706Ady;
import X.C26867AgZ;
import X.C26869Agb;
import X.C27546ArW;
import X.C27553Ard;
import X.C27570Aru;
import X.C27739Aud;
import X.C32151Nz;
import X.C38350F3i;
import X.C44878HjO;
import X.C45804HyK;
import X.C47261Igj;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70445Rkn;
import X.C70759Rpr;
import X.C72545SdZ;
import X.C76800UCe;
import X.C78565UsT;
import X.C79045V0n;
import X.C7MY;
import X.EnumC26807Afb;
import X.O6R;
import X.OSZ;
import X.OUP;
import X.W5F;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class ShopProfileVH extends AbsFullSpanVH implements c {
    public Map<Integer, View> _$_findViewCache;
    public List<SellerDetailInfo> detailInfo;
    public final C5H3 style$delegate;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final IShopProfileStyle getStyle() {
        return (IShopProfileStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onResume() {
        trackTag(new C70445Rkn(getItem()));
        super.onResume();
    }

    private final void bindStyle() {
        View shop_image = _$_findCachedViewById(R.id.jy5);
        o.LJIIIIZZ(shop_image, "shop_image");
        C27570Aru.LJI(getStyle().getShopImageSize(), getStyle().getShopImageSize(), shop_image);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        OUP.LJJJJI(getStyle().getPaddingBottom(), itemView);
        C45804HyK.LJJLIIIJ(getStyle().getSicMarginTop(), _$_findCachedViewById(R.id.jnt));
        if (getStyle().getShowVisitBtn()) {
            View visit = _$_findCachedViewById(R.id.ndb);
            o.LJIIIIZZ(visit, "visit");
            visit.setVisibility(0);
            View visit2 = _$_findCachedViewById(R.id.ndb);
            o.LJIIIIZZ(visit2, "visit");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 46, 42), visit2);
            ImageView shop_arrow_view = (ImageView) _$_findCachedViewById(R.id.jxu);
            o.LJIIIIZZ(shop_arrow_view, "shop_arrow_view");
            shop_arrow_view.setVisibility(8);
            return;
        }
        View visit3 = _$_findCachedViewById(R.id.ndb);
        o.LJIIIIZZ(visit3, "visit");
        visit3.setVisibility(8);
        ImageView shop_arrow_view2 = (ImageView) _$_findCachedViewById(R.id.jxu);
        o.LJIIIIZZ(shop_arrow_view2, "shop_arrow_view");
        shop_arrow_view2.setVisibility(0);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopProfileVH(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a4a, viewGroup, false));
        this._$_findViewCache = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 67));
        this.style$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 234));
    }

    private final void bindDetail(C27546ArW c27546ArW) {
        boolean z;
        List<SellerDetailInfo> list;
        float f;
        int i = 0;
        int i2 = 1;
        if (C00F.LIZ(31744, 0, "pdp_show_sale_count", true) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && (list = c27546ArW.LJLL) != null && list.size() > 1) {
            if (o.LJ(this.detailInfo, c27546ArW.LJLL) && ((ViewGroup) _$_findCachedViewById(R.id.jnt)).getChildCount() > 0) {
                return;
            }
            this.detailInfo = c27546ArW.LJLL;
            LinearLayout bindDetail$lambda$28 = (LinearLayout) _$_findCachedViewById(R.id.jnt);
            o.LJIIIIZZ(bindDetail$lambda$28, "bindDetail$lambda$28");
            bindDetail$lambda$28.setVisibility(0);
            if (bindDetail$lambda$28.getChildCount() > 0) {
                bindDetail$lambda$28.removeAllViews();
            }
            List<SellerDetailInfo> list2 = c27546ArW.LJLL;
            if (list2 != null) {
                int i3 = 0;
                for (SellerDetailInfo sellerDetailInfo : list2) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        SellerDetailInfo sellerDetailInfo2 = sellerDetailInfo;
                        if (c27546ArW.LJLL.size() == 4 && (o.LJ(sellerDetailInfo2.key, "response_rate") || o.LJ(sellerDetailInfo2.key, "delivery_rate"))) {
                            f = 1.5f;
                        } else {
                            f = 1.0f;
                        }
                        LinearLayout linearLayout = new LinearLayout(this.itemView.getContext());
                        linearLayout.setOrientation(i2);
                        linearLayout.setGravity(48);
                        LinearLayout linearLayout2 = new LinearLayout(this.itemView.getContext());
                        linearLayout2.setOrientation(i);
                        linearLayout2.setGravity(16);
                        Context context = this.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        TuxTextView tuxTextView = new TuxTextView(context, null, 6, i);
                        tuxTextView.setTuxFont(62);
                        tuxTextView.setTextColorRes(R.attr.go);
                        tuxTextView.setText(sellerDetailInfo2.countShowContent);
                        linearLayout2.addView(tuxTextView);
                        String str = sellerDetailInfo2.headTag;
                        if (str != null) {
                            Context context2 = this.itemView.getContext();
                            o.LJIIIIZZ(context2, "itemView.context");
                            TuxTextView tuxTextView2 = new TuxTextView(context2, null, 6, 0);
                            tuxTextView2.setTuxFont(91);
                            tuxTextView2.setTextColorRes(R.attr.eb);
                            C110614Vt c110614Vt = new C110614Vt();
                            c110614Vt.LIZIZ = Integer.valueOf(R.attr.c_);
                            c110614Vt.LJIIIIZZ = Float.valueOf(C7MY.LIZIZ(2));
                            c110614Vt.LJIIIZ = Float.valueOf(C7MY.LIZIZ(2));
                            c110614Vt.LJIIJ = Float.valueOf(C7MY.LIZIZ(2));
                            c110614Vt.LJIIJJI = Float.valueOf(C7MY.LIZIZ(2));
                            Context context3 = tuxTextView2.getContext();
                            o.LJIIIIZZ(context3, "context");
                            tuxTextView2.setBackground(c110614Vt.LIZ(context3));
                            tuxTextView2.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
                            tuxTextView2.setLayoutParams(marginLayoutParams);
                            tuxTextView2.setText(str);
                            linearLayout2.addView(tuxTextView2);
                        }
                        linearLayout.addView(linearLayout2, new ViewGroup.LayoutParams(-1, -2));
                        Context context4 = this.itemView.getContext();
                        o.LJIIIIZZ(context4, "itemView.context");
                        TuxTextView tuxTextView3 = new TuxTextView(context4, null, 6, 0);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams2.topMargin = C7MY.LIZIZ(2);
                        tuxTextView3.setLayoutParams(marginLayoutParams2);
                        tuxTextView3.setTuxFont(81);
                        tuxTextView3.setTextColorRes(R.attr.gv);
                        tuxTextView3.setText(sellerDetailInfo2.content);
                        tuxTextView3.setMaxLines(2);
                        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                        linearLayout.addView(tuxTextView3);
                        C16880lQ.LJIIJ(new C27553Ard(sellerDetailInfo2, this, linearLayout, c27546ArW), linearLayout);
                        bindDetail$lambda$28.addView(linearLayout, new LinearLayout.LayoutParams(C7MY.LIZIZ(0), -2, f));
                        if (i3 != C47261Igj.LJJI(c27546ArW.LJLL)) {
                            View view = new View(this.itemView.getContext());
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(AnonymousClass391.LIZ(0.5d), C7MY.LIZIZ(32));
                            marginLayoutParams3.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                            marginLayoutParams3.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                            view.setLayoutParams(marginLayoutParams3);
                            bindDetail$lambda$28.setGravity(48);
                            Context context5 = view.getContext();
                            o.LJIIIIZZ(context5, "context");
                            Integer LJI = C79045V0n.LJI(R.attr.dz, context5);
                            if (LJI != null) {
                                view.setBackgroundColor(LJI.intValue());
                            }
                            bindDetail$lambda$28.addView(view);
                        }
                        i3 = i4;
                        i = 0;
                        i2 = 1;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        View seller_info_container = _$_findCachedViewById(R.id.jnt);
        o.LJIIIIZZ(seller_info_container, "seller_info_container");
        seller_info_container.setVisibility(8);
    }

    private final void bindProfile(C27546ArW c27546ArW) {
        StoreOfficialLabel storeOfficialLabel;
        float f;
        W5F LIZLLL = C70759Rpr.LIZLLL(c27546ArW.LJLILLLLZI);
        LIZLLL.LIZIZ("ShopProfileVH");
        LIZLLL.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.jy5);
        C16880lQ.LLJJJ(LIZLLL);
        ((TextView) _$_findCachedViewById(R.id.jy8)).setText(c27546ArW.LJLJI);
        View shop_image = _$_findCachedViewById(R.id.jy5);
        o.LJIIIIZZ(shop_image, "shop_image");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 45, 42), shop_image);
        if (!getStyle().getOfficialInSimple() && (storeOfficialLabel = c27546ArW.LJLJLJ) != null) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            Image LIZ = storeOfficialLabel.LIZ(context);
            if (LIZ != null) {
                Integer num = c27546ArW.LJLJLJ.labelType;
                int value = EnumC26807Afb.BLUE_V.getValue();
                if (num == null || num.intValue() != value) {
                    f = 15.0f;
                } else {
                    f = 12.0f;
                }
                Integer width = LIZ.getWidth(f);
                if (width != null) {
                    int intValue = width.intValue();
                    View official_label = _$_findCachedViewById(R.id.h9z);
                    o.LJIIIIZZ(official_label, "official_label");
                    C27570Aru.LJI(intValue, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(f))), official_label);
                }
                TuxTextView shop_name = (TuxTextView) _$_findCachedViewById(R.id.jy8);
                o.LJIIIIZZ(shop_name, "shop_name");
                SmartImageView official_label2 = (SmartImageView) _$_findCachedViewById(R.id.h9z);
                o.LJIIIIZZ(official_label2, "official_label");
                OUP.LJIIZILJ(shop_name, official_label2);
                SmartImageView official_label3 = (SmartImageView) _$_findCachedViewById(R.id.h9z);
                o.LJIIIIZZ(official_label3, "official_label");
                OUP.LJJJI(official_label3, LIZ);
            }
        }
    }

    private final void bindSellingDetail(C27546ArW c27546ArW) {
        LinkRichText linkRichText;
        SellerSellingPoint sellerSellingPoint = c27546ArW.LJLLLL;
        if (sellerSellingPoint != null && (linkRichText = sellerSellingPoint.sellingTag) != null) {
            if (((ViewGroup) _$_findCachedViewById(R.id.g60)).getChildCount() > 0) {
                ((ViewGroup) _$_findCachedViewById(R.id.g60)).removeAllViews();
            }
            ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.g60);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setTuxFont(71);
            tuxTextView.setTextColorRes(R.attr.gv);
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            Context context2 = this.itemView.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            tuxTextView.setText(RichTextUtil.LIZJ(richTextUtil, context2, linkRichText, null, R.attr.go, false, 72, null, 84));
            tuxTextView.setMaxLines(1);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            viewGroup.addView(tuxTextView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindSimpleDetail(X.C27546ArW r16) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.ShopProfileVH.bindSimpleDetail(X.ArW):void");
    }

    private final void fillRatingStars(float f) {
        View shop_rating_detail = _$_findCachedViewById(R.id.jyb);
        o.LJIIIIZZ(shop_rating_detail, "shop_rating_detail");
        shop_rating_detail.setVisibility(0);
        _$_findCachedViewById(R.id.jyb).setBackground(null);
        ((TextView) _$_findCachedViewById(R.id.jyc)).setText(String.valueOf(f));
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.jye);
        tuxIconView.setIconRes(R.raw.icon_star_fill);
        tuxIconView.setTintColorRes(R.attr.c6);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C27546ArW item) {
        o.LJIIIZ(item, "item");
        bindProfile(item);
        bindSimpleDetail(item);
        bindSellingDetail(item);
        bindDetail(item);
        bindStyle();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78565UsT.LJJIZ(itemView, null, new C26869Agb(this, null), 3);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C26508Aam.LIZ(itemView2, item.LJLJLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onClick(String str) {
        Object obj;
        String str2;
        String str3;
        HashMap<String, Object> trackParams;
        HashMap<String, Object> trackParams2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = getViewModel().LJLJJLL;
        if (pdpEnterParam != null && (trackParams2 = pdpEnterParam.getTrackParams()) != null) {
            linkedHashMap.putAll(trackParams2);
        }
        linkedHashMap.remove("page_name");
        linkedHashMap.put("previous_page", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam2 = getViewModel().LJLJJLL;
        if (pdpEnterParam2 == null || (trackParams = pdpEnterParam2.getTrackParams()) == null || (obj = trackParams.get("source_page_type")) == null) {
            obj = "unknown";
        }
        linkedHashMap.put("show_window_source", obj);
        String str4 = ((C27546ArW) getItem()).LJLJL;
        if (str4 != null && !ujb.o.LJJJJJL(str4)) {
            PdpViewModel viewModel = getViewModel();
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            String str5 = ((C27546ArW) getItem()).LJLIL;
            Float LJJIJLIJ = C38350F3i.LJJIJLIJ(((C27546ArW) getItem()).LJLJJL);
            StoreOfficialLabel storeOfficialLabel = ((C27546ArW) getItem()).LJLJLJ;
            if (storeOfficialLabel != null) {
                str2 = storeOfficialLabel.labelTypeStr;
            } else {
                str2 = null;
            }
            int aw0 = getViewModel().aw0();
            List<SellerDetailInfo> list = this.detailInfo;
            SellerSellingPoint sellerSellingPoint = ((C27546ArW) getItem()).LJLLLL;
            if (sellerSellingPoint != null) {
                str3 = sellerSellingPoint.sellingPoints;
            } else {
                str3 = null;
            }
            PdpViewModel.nw0(viewModel, context, str4, str5, LJJIJLIJ, "showcase_detail", str2, aw0, null, null, null, list, str, str3, null, 9088);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        String str6 = ((C27546ArW) getItem()).LJLJJLL;
        if (str6 == null || ujb.o.LJJJJJL(str6)) {
            return;
        }
        String uri = C26867AgZ.LIZJ(str6, C113554cx.LJJL(new OSZ("enter_from", getViewModel().bw0()), new OSZ("trackParams", C27739Aud.LJI(linkedHashMap)))).build().toString();
        o.LJIIIIZZ(uri, "RouterUtils.createUrl(\n …     ).build().toString()");
        C70414RkI c70414RkI = getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJIIL = true;
        }
        SmartRouter.buildRoute(this.itemView.getContext(), uri).open();
        C70414RkI c70414RkI2 = getViewModel().LLFII;
        if (c70414RkI2 == null) {
            return;
        }
        C70414RkI.LJJJIL(c70414RkI2, "showcase_detail", null, null, null, 30);
    }
}
