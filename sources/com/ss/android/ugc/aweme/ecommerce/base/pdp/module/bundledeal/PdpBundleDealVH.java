package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal;

import X.AnonymousClass391;
import X.C0JU;
import X.C16880lQ;
import X.C221108m2;
import X.C26338AVi;
import X.C26508Aam;
import X.C26706Ady;
import X.C26867AgZ;
import X.C27739Aud;
import X.C28037AzR;
import X.C32151Nz;
import X.C35635Dyh;
import X.C39468FeK;
import X.C44878HjO;
import X.C45804HyK;
import X.C47261Igj;
import X.C57522No;
import X.C5H3;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69921RcL;
import X.C70101RfF;
import X.C70123Rfb;
import X.C70144Rfw;
import X.C70145Rfx;
import X.C70759Rpr;
import X.C70858RrS;
import X.C70913RsL;
import X.C70917RsP;
import X.C70918RsQ;
import X.C70920RsS;
import X.C70931Rsd;
import X.C72545SdZ;
import X.C76800UCe;
import X.C78565UsT;
import X.C78613UtF;
import X.C78857UxB;
import X.C78915Uy7;
import X.C78946Uyc;
import X.C78983UzD;
import X.C79045V0n;
import X.C79234V7u;
import X.EnumC46512INg;
import X.EnumC72807Shn;
import X.InterfaceC36571c5;
import X.InterfaceC71003Rtn;
import X.O6R;
import X.ORS;
import X.OUP;
import X.W5F;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleAddButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundlePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleSku;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleTotalPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.utils.Au2S0S0501000_12;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.ss.android.ugc.aweme.utils.Au2S5S0400000_12;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS31S0210000_12;
import kotlin.jvm.internal.AqS32S0301000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS38S0300000_12;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class PdpBundleDealVH extends AbsFullSpanVH implements InterfaceC71003Rtn, c {
    public static final C70145Rfx Companion = new C70145Rfx();
    public Map<Integer, View> _$_findViewCache;
    public final LinkedList<C57522No> cacheViews;
    public final C5H3 logger$delegate;
    public int productShowCount;
    public final C5H3 style$delegate;
    public final C5H3 vm$delegate;

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

    private final void bindStyle() {
        int i;
        View view = this.itemView;
        View tv_title = view.findViewById(R.id.mo6);
        o.LJIIIIZZ(tv_title, "tv_title");
        if (!getStyle().getHideTitle()) {
            i = 0;
        } else {
            i = 8;
        }
        tv_title.setVisibility(i);
        View findViewById = view.findViewById(R.id.wn);
        getStyle().getAddToCartBtnNewRadius();
        findViewById.getClass();
        ((TuxTextView) view.findViewById(R.id.mp5)).setTuxFont(getStyle().getTotalRealPriceFont());
        View add_to_cart_layout = view.findViewById(R.id.w6);
        o.LJIIIIZZ(add_to_cart_layout, "add_to_cart_layout");
        C26338AVi.LJIIIZ(add_to_cart_layout, null, Integer.valueOf(getStyle().getTotalPriceLayoutMarginTop()), null, null, 29);
    }

    private final View createPlusView() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = AnonymousClass391.LIZ(35.5d);
        layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_plus);
        tuxIconView.setIconWidth(getStyle().getAddIconSize());
        tuxIconView.setIconHeight(getStyle().getAddIconSize());
        tuxIconView.setLayoutParams(layoutParams);
        return tuxIconView;
    }

    private final IBundleStyle getStyle() {
        return (IBundleStyle) this.style$delegate.getValue();
    }

    public final C70123Rfb getLogger() {
        return (C70123Rfb) this.logger$delegate.getValue();
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.vm$delegate.getValue();
    }

    @Override // X.InterfaceC71003Rtn
    public InterfaceC71003Rtn preTrackNode() {
        InterfaceC36571c5 LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
        if (LJIIIZ instanceof InterfaceC71003Rtn) {
            return (InterfaceC71003Rtn) LJIIIZ;
        }
        return null;
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // X.InterfaceC71003Rtn
    public List<String> getRegisteredLane() {
        return C61878OQg.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpBundleDealVH(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a21, viewGroup, false));
        this._$_findViewCache = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.vm$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 48));
        this.logger$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 360));
        this.cacheViews = new LinkedList<>();
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 361));
    }

    private final BundleAddItemsToCartRequest generateRequest(BundleInfo bundleInfo) {
        String str;
        HashMap<String, Object> hashMap;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap<String, Object> trackParams;
        C70101RfF c70101RfF = IPdpStarter.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = getVm().LJLJJLL;
        c70101RfF.getClass();
        int LIZIZ = C70101RfF.LIZIZ(pdpEnterParam);
        IPdpStarter.PdpEnterParam pdpEnterParam2 = getVm().LJLJJLL;
        if (pdpEnterParam2 != null) {
            str = pdpEnterParam2.getChainKey();
        } else {
            str = null;
        }
        IPdpStarter.PdpEnterParam pdpEnterParam3 = getVm().LJLJJLL;
        if (pdpEnterParam3 != null) {
            hashMap = pdpEnterParam3.getTrackParams();
        } else {
            hashMap = null;
        }
        String LIZ = C28037AzR.LIZ(hashMap);
        IPdpStarter.PdpEnterParam pdpEnterParam4 = getVm().LJLJJLL;
        if (pdpEnterParam4 != null && (trackParams = pdpEnterParam4.getTrackParams()) != null) {
            obj = trackParams.get("author_id");
        } else {
            obj = null;
        }
        String str6 = (String) obj;
        ArrayList arrayList = new ArrayList();
        List<BundleProduct> list = bundleInfo.productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                String str7 = bundleProduct.sellerId;
                BundleSku bundleSku = bundleProduct.selectedSku;
                if (bundleSku != null) {
                    str2 = bundleSku.wareHouseId;
                } else {
                    str2 = null;
                }
                String str8 = bundleProduct.productId;
                if (bundleSku != null) {
                    str3 = bundleSku.skuId;
                } else {
                    str3 = null;
                }
                Integer num = bundleProduct.addCount;
                Integer valueOf = Integer.valueOf(LIZIZ);
                IPdpStarter.PdpEnterParam pdpEnterParam5 = getVm().LJLJJLL;
                if (pdpEnterParam5 != null) {
                    str4 = pdpEnterParam5.getSourceInfo();
                } else {
                    str4 = null;
                }
                PageSourceInfo LIZJ = C39468FeK.LIZJ();
                if (LIZJ != null) {
                    str5 = C27739Aud.LJI(LIZJ);
                } else {
                    str5 = null;
                }
                arrayList.add(new AddItemToCartRequest(str7, str2, str8, str3, num, str, LIZ, valueOf, str6, null, str4, null, null, null, str5, 0, Boolean.FALSE));
            }
        }
        return new BundleAddItemsToCartRequest(arrayList, bundleInfo.bundleId, null, null, 12, null);
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [X.2No, android.view.View] */
    private final void initView(BundleInfo bundleInfo) {
        String str;
        BundlePrice bundlePrice;
        String str2;
        BundlePrice bundlePrice2;
        BundlePrice bundlePrice3;
        BundlePrice bundlePrice4;
        String str3;
        BundlePrice bundlePrice5;
        String str4;
        String str5;
        String str6;
        int i;
        BundleProduct bundleProduct;
        View view;
        String str7;
        String str8;
        String str9;
        View view2 = this.itemView;
        int i2 = R.id.jci;
        ViewGroup scroll_container = (ViewGroup) view2.findViewById(R.id.jci);
        o.LJIIIIZZ(scroll_container, "scroll_container");
        LinkedList<C57522No> linkedList = this.cacheViews;
        while (scroll_container.getChildCount() > 0) {
            C16880lQ.LLIFFJFJJ(0, scroll_container);
            C76800UCe c76800UCe = C76800UCe.LIZ;
            if (c76800UCe instanceof C57522No) {
                linkedList.add(c76800UCe);
            }
        }
        bindStyle();
        TextView textView = (TextView) view2.findViewById(R.id.mo6);
        String str10 = bundleInfo.title;
        if (str10 == null) {
            str10 = "Bundle";
        }
        textView.setText(str10);
        List<BundleProduct> list = bundleInfo.productList;
        if (list != null) {
            int i3 = 0;
            for (BundleProduct bundleProduct2 : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    BundleProduct bundleProduct3 = bundleProduct2;
                    if (i3 > 0) {
                        ViewGroup viewGroup = (ViewGroup) view2.findViewById(i2);
                        View view3 = (View) ORS.LJJLJLI(this.cacheViews);
                        if (view3 == null) {
                            view3 = createPlusView();
                        }
                        viewGroup.addView(view3);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(i2);
                    View view4 = (View) ORS.LJJLJLI(this.cacheViews);
                    if (view4 == null) {
                        final Context context = view2.getContext();
                        o.LJIIIIZZ(context, "context");
                        ?? r9 = new FrameLayout(context) { // from class: X.2No
                            public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

                            public final View LIZ(int i5) {
                                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
                                View view5 = (View) linkedHashMap.get(Integer.valueOf(i5));
                                if (view5 != null) {
                                    return view5;
                                }
                                View findViewById = findViewById(i5);
                                if (findViewById == null) {
                                    return null;
                                }
                                linkedHashMap.put(Integer.valueOf(i5), findViewById);
                                return findViewById;
                            }

                            {
                                super(context, null, 0);
                                C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a23, this, true);
                            }
                        };
                        PdpViewModel vm = getVm();
                        C70123Rfb logger = getLogger();
                        IBundleStyle style = getStyle();
                        o.LJIIIZ(vm, "vm");
                        o.LJIIIZ(bundleProduct3, "bundleProduct");
                        o.LJIIIZ(logger, "logger");
                        o.LJIIIZ(style, "style");
                        ((TuxTextView) r9.LIZ(R.id.mf6)).setTuxFont(style.getProductPriceFont());
                        ((TuxTextView) r9.LIZ(R.id.mf6)).setTextColorRes(style.getProductPriceTextColor());
                        C45804HyK.LJJLIIIJ(style.getProductPriceMarginTop(), r9.LIZ(R.id.mf6));
                        Image image = bundleProduct3.image;
                        SmartImageView product_img = (SmartImageView) r9.LIZ(R.id.i5y);
                        o.LJIIIIZZ(product_img, "product_img");
                        if (image != null) {
                            W5F LIZLLL = C70759Rpr.LIZLLL(image);
                            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
                            LIZLLL.LJIJJLI = style.getProductImageOptions();
                            Context context2 = r9.getContext();
                            o.LJIIIIZZ(context2, "context");
                            LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cj, context2);
                            LIZLLL.LJJIIJ = product_img;
                            C16880lQ.LLJJJ(LIZLLL);
                        }
                        BundlePrice bundlePrice6 = bundleProduct3.productPrice;
                        if (bundlePrice6 != null && (str9 = bundlePrice6.discount) != null && C78857UxB.LJJJIL(str9)) {
                            C45804HyK.LJJLL(r9.LIZ(R.id.mf0));
                            ((TextView) r9.LIZ(R.id.mf0)).setText(bundleProduct3.productPrice.discount);
                        }
                        TextView textView2 = (TextView) r9.LIZ(R.id.mf6);
                        BundlePrice bundlePrice7 = bundleProduct3.productPrice;
                        String str11 = "";
                        if (bundlePrice7 == null || (str7 = bundlePrice7.realPrice) == null) {
                            str7 = "";
                        }
                        textView2.setText(str7);
                        TextView textView3 = (TextView) r9.LIZ(R.id.mf2);
                        BundlePrice bundlePrice8 = bundleProduct3.productPrice;
                        if (bundlePrice8 != null && (str8 = bundlePrice8.originalPrice) != null) {
                            str11 = str8;
                        }
                        textView3.setText(str11);
                        ((TextView) r9.LIZ(R.id.mf2)).getPaint().setFlags(16);
                        ((TextView) r9.LIZ(R.id.mf2)).getPaint().setAntiAlias(true);
                        View product_layout = r9.LIZ(R.id.i67);
                        o.LJIIIIZZ(product_layout, "product_layout");
                        bundleProduct = bundleProduct3;
                        i = i3;
                        C16880lQ.LJIIJ(new Au2S0S0501000_12(bundleProduct, logger, bundleInfo, i3, vm, r9, 0), product_layout);
                        view = r9;
                    } else {
                        i = i3;
                        bundleProduct = bundleProduct3;
                        view = view4;
                    }
                    viewGroup2.addView(view);
                    if (this.productShowCount < bundleInfo.productList.size()) {
                        this.productShowCount++;
                        C70123Rfb logger2 = getLogger();
                        logger2.getClass();
                        o.LJIIIZ(bundleProduct, "bundleProduct");
                        C78946Uyc.LJJII(this, new C70913RsL(), new AqS32S0301000_12(logger2, bundleInfo, bundleProduct, i, 6));
                    }
                    i3 = i4;
                    i2 = R.id.jci;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        String str12 = null;
        BundleTotalPrice bundleTotalPrice = bundleInfo.totalPrice;
        if (bundleTotalPrice != null && (str6 = bundleTotalPrice.totalTitle) != null) {
            ((TextView) view2.findViewById(R.id.mp_)).setText(str6);
        }
        BundleTotalPrice bundleTotalPrice2 = bundleInfo.totalPrice;
        if (bundleTotalPrice2 != null && (str5 = bundleTotalPrice2.saveTitle) != null) {
            ((TextView) view2.findViewById(R.id.mp7)).setText(str5);
        }
        BundleTotalPrice bundleTotalPrice3 = bundleInfo.totalPrice;
        if (bundleTotalPrice3 != null && (bundlePrice5 = bundleTotalPrice3.price) != null && (str4 = bundlePrice5.realPrice) != null) {
            ((TextView) view2.findViewById(R.id.mp5)).setText(str4);
        }
        BundleTotalPrice bundleTotalPrice4 = bundleInfo.totalPrice;
        if (bundleTotalPrice4 != null && (bundlePrice4 = bundleTotalPrice4.price) != null && (str3 = bundlePrice4.originalPrice) != null) {
            ((TextView) view2.findViewById(R.id.mp4)).setText(str3);
            ((TextView) view2.findViewById(R.id.mp4)).getPaint().setFlags(16);
            ((TextView) view2.findViewById(R.id.mp4)).getPaint().setAntiAlias(true);
        }
        BundleTotalPrice bundleTotalPrice5 = bundleInfo.totalPrice;
        if (bundleTotalPrice5 != null && (bundlePrice3 = bundleTotalPrice5.price) != null) {
            str = bundlePrice3.discount;
        } else {
            str = null;
        }
        if (C78857UxB.LJJJIL(str)) {
            View tv_total_discount = view2.findViewById(R.id.mp3);
            o.LJIIIIZZ(tv_total_discount, "tv_total_discount");
            OUP.LJJLIIIJ(tv_total_discount);
            TextView textView4 = (TextView) view2.findViewById(R.id.mp3);
            BundleTotalPrice bundleTotalPrice6 = bundleInfo.totalPrice;
            if (bundleTotalPrice6 != null && (bundlePrice2 = bundleTotalPrice6.price) != null) {
                str12 = bundlePrice2.discount;
            }
            textView4.setText(str12);
        }
        BundleTotalPrice bundleTotalPrice7 = bundleInfo.totalPrice;
        if (bundleTotalPrice7 != null && (bundlePrice = bundleTotalPrice7.price) != null && (str2 = bundlePrice.savePrice) != null) {
            ((TextView) view2.findViewById(R.id.mp6)).setText(str2);
        }
        BundleAddButton bundleAddButton = bundleInfo.bundleAddButton;
        if (bundleAddButton != null) {
            ((TextView) view2.findViewById(R.id.wn)).setMaxLines(2);
            ((TextView) view2.findViewById(R.id.wn)).setText(bundleAddButton.buttonText);
            View addcart_btn = view2.findViewById(R.id.wn);
            o.LJIIIIZZ(addcart_btn, "addcart_btn");
            C16880lQ.LJIIJ(new Au2S11S0300000_12(this, bundleInfo, bundleAddButton, 2), addcart_btn);
            View add_to_cart_layout = view2.findViewById(R.id.w6);
            o.LJIIIIZZ(add_to_cart_layout, "add_to_cart_layout");
            C16880lQ.LJIIJ(new Au2S5S0400000_12(this, view2, bundleInfo, bundleAddButton, 0), add_to_cart_layout);
            C70123Rfb logger3 = getLogger();
            boolean isClickable = view2.findViewById(R.id.wn).isClickable();
            logger3.getClass();
            C78946Uyc.LJJII(this, new C70918RsQ(0), new AqS31S0210000_12(logger3, bundleInfo, isClickable, 4));
        }
    }

    private final void reportError(String str) {
        C78983UzD.LJIIZILJ(new RuntimeException(i0.LJFF("PdpBundleDealVH ", str)));
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        C78915Uy7.LJJIL(params, C70144Rfw.LJLIL);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C35635Dyh item) {
        List<BundleInfo> list;
        o.LJIIIZ(item, "item");
        if (item.LIZ == null) {
            View findViewById = this.itemView.findViewById(R.id.k24);
            o.LJIIIIZZ(findViewById, "itemView.skeleton_layout");
            OUP.LJJLIIIJ(findViewById);
            PdpViewModel vm = getVm();
            if (!vm.LLLIIL) {
                vm.LLLIIL = true;
                if (vm.ow0()) {
                    C78565UsT.LJJIJ(vm, C78613UtF.LIZJ, new C69921RcL(vm, null));
                }
            }
        } else {
            View findViewById2 = this.itemView.findViewById(R.id.k24);
            o.LJIIIIZZ(findViewById2, "itemView.skeleton_layout");
            OUP.LJIJJLI(findViewById2);
        }
        BundleInfoResponseData bundleInfoResponseData = item.LIZ;
        if (bundleInfoResponseData == null || (list = bundleInfoResponseData.bundleInfoList) == null || list.isEmpty()) {
            return;
        }
        BundleInfo bundleInfo = (BundleInfo) ListProtector.get(list, 0);
        getLogger().LIZJ = item.LIZ.requestId;
        initView(bundleInfo);
        C70123Rfb logger = getLogger();
        logger.getClass();
        o.LJIIIZ(bundleInfo, "bundleInfo");
        if (!logger.LIZIZ) {
            logger.LIZIZ = true;
            C78946Uyc.LJJII(this, new C70920RsS(), new AqS143S0200000_12(logger, bundleInfo, 126));
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, false);
    }

    public final void jumpBundleSheet(BundleAddButton bundleAddButton, BundleInfo bundleInfo) {
        Object obj;
        HashMap<String, Object> trackParams;
        HashMap<String, Object> trackParams2;
        String str = bundleAddButton.schema;
        if (str == null || str.length() == 0) {
            reportError("schema is null");
            return;
        }
        LinkedHashMap LIZ = C0JU.LIZ("previous_page", "product_detail");
        String dw0 = getVm().dw0();
        if (dw0 != null) {
            LIZ.put("entrance_info", dw0);
        }
        LIZ.put("entrance_form", "horizontal_goods_card");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<BundleProduct> list = bundleInfo.productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productSource);
                sb.append(",");
                sb2.append(bundleProduct.productId);
                sb2.append(",");
            }
        }
        String sb3 = sb.toString();
        o.LJIIIIZZ(sb3, "productSourceList.toString()");
        LIZ.put("product_source", sb3);
        String sb4 = sb2.toString();
        o.LJIIIIZZ(sb4, "productIdList.toString()");
        LIZ.put("product_id", sb4);
        IPdpStarter.PdpEnterParam pdpEnterParam = getVm().LJLJJLL;
        Object obj2 = null;
        if (pdpEnterParam != null && (trackParams2 = pdpEnterParam.getTrackParams()) != null) {
            obj = trackParams2.get("enter_from_info");
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        Object obj3 = "unknown";
        if (obj == null) {
            obj = "unknown";
        }
        LIZ.put("enter_from_info", obj);
        LIZ.put("source_page_type", "bundle_deal");
        IPdpStarter.PdpEnterParam pdpEnterParam2 = getVm().LJLJJLL;
        if (pdpEnterParam2 != null && (trackParams = pdpEnterParam2.getTrackParams()) != null) {
            obj2 = trackParams.get("source_page_type");
        }
        if ((obj2 instanceof String) && obj2 != null) {
            obj3 = obj2;
        }
        LIZ.put("first_source_page", obj3);
        LIZ.put("parent_product_id", getVm().jw0());
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        String str2 = bundleAddButton.schema;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("trackParams", C27739Aud.LJI(LIZ));
        C26867AgZ.LIZIZ(context, str2, linkedHashMap, false).open();
    }

    public final void addCart(View view, BundleInfo bundleInfo, BundleAddButton bundleAddButton) {
        Integer num = bundleAddButton.action;
        int value = EnumC46512INg.ADD_TO_CART.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC46512INg.OPEN_SECONDARY_PAGE.getValue();
            if (num == null || num.intValue() != value2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("add cart type wrong: ");
                LIZ.append(bundleAddButton.action);
                reportError(X1D.LIZIZ(LIZ));
                return;
            }
            C70123Rfb logger = getLogger();
            logger.getClass();
            o.LJIIIZ(bundleInfo, "bundleInfo");
            C78946Uyc.LJJII(this, new C70917RsP(), new AqS143S0200000_12(logger, bundleInfo, 124));
            jumpBundleSheet(bundleAddButton, bundleInfo);
            return;
        }
        getVm().Kv0(this.itemView, generateRequest(bundleInfo), new IDqS38S0300000_12(this, bundleInfo, view, 0));
        C70123Rfb logger2 = getLogger();
        logger2.getClass();
        o.LJIIIZ(bundleInfo, "bundleInfo");
        C78946Uyc.LJJII(this, new C70931Rsd(), new AqS143S0200000_12(logger2, bundleInfo, 125));
    }
}
