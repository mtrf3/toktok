package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingView;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2N extends S2Q {
    public int LJLJL;
    public final C71437S1x LJLJLJ;
    public final S2Y LJLJLLL;
    public final S25 LJLL;
    public final S2X<C119774mz> LJLLI;
    public final S36<ConstraintLayout> LJLLILLLL;
    public final S2A LJLLJ;
    public final S33<FrameLayout> LJLLL;
    public final java.util.Map<Integer, View> LJLLLL;

    public static /* synthetic */ void getLivePinCardMinimalism$annotations() {
    }

    @Override // X.InterfaceC71133Rvt
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC71133Rvt
    public final void LJJIL(int i, AtmosphereTag atmosphereTag) {
    }

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.S2Q, X.AbstractC71212RxA
    public void setAtmosphereTags(List<AtmosphereTag> atmosphereTags) {
        o.LJIIIZ(atmosphereTags, "atmosphereTags");
    }

    public final void LJJZ() {
        if (this.LJLLJ.LIZ() || this.LJLJLJ.LIZ()) {
            this.LJLL.LJ(1);
        } else {
            this.LJLL.LJ(2);
        }
    }

    @Override // X.AbstractC71212RxA
    public java.util.Map<String, String> getEventParamForContentShow() {
        String str;
        this.LJLJJL.remove("flashsale_status");
        this.LJLJJL.remove("countdown_type");
        String LJIIIZ = this.LJLLJ.LJIIIZ();
        if (LJIIIZ != null) {
            this.LJLJJL.put("flashsale_status", LJIIIZ);
        }
        String LJIIIIZZ = this.LJLLJ.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            this.LJLJJL.put("countdown_type", LJIIIIZZ);
        }
        java.util.Map<String, String> map = this.LJLJJL;
        if (this.LJLLJ.LIZLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_free_shipping", str);
        this.LJLJJL.put("promotion_label_level", "3");
        return this.LJLJJL;
    }

    @Override // X.AbstractC71212RxA
    public java.util.Map<String, String> getPromotionLogoDaInfo() {
        return new HashMap();
    }

    private final void setPopCardStyle(PopupCardVO popupCardVO) {
        L3I l3i = new L3I();
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(new C53434Ky6().LIZJ);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setBackground(c110614Vt.LIZ(context));
        this.LJLLILLLL.LJIIJJI(new C53647L3r());
        this.LJLLL.LJI(new C53647L3r());
        this.LJLJLLL.LJI(l3i.LJLJJLL);
        this.LJLJLJ.LJI(l3i.LJLJL);
        this.LJLLI.LJIIIZ(l3i.LJLJLJ);
        S2A s2a = this.LJLLJ;
        java.util.Map<L3F, S2E> style = l3i.LJLJJL;
        s2a.getClass();
        o.LJIIIZ(style, "style");
        s2a.LJIIJ = style;
    }

    private final void setSoldOut(boolean z) {
        if (this.LJLLILLLL.LIZ()) {
            this.LJLLL.LJII(z);
        }
        if (this.LJLJLLL.LIZ()) {
            S2Y s2y = this.LJLJLLL;
            String string = getContext().getString(R.string.t5);
            s2y.LJII(new C53608L2e(z, string, string));
        }
    }

    @Override // X.InterfaceC71247Rxj
    public final void LJJLIIIIJ(boolean z) {
        if (!isAttachedToWindow()) {
            C36746EbW.LIZ(6, "not shown, don't refresh stock");
        } else {
            setSoldOut(z);
        }
    }

    @Override // X.InterfaceC71247Rxj
    public final void LJJJJZ(String str, com.bytedance.android.livesdk.model.message.Img img) {
        if (!isAttachedToWindow()) {
            C36746EbW.LIZ(6, "not shown, don't refresh title");
            return;
        }
        if (this.LJLJJLL != null) {
            if (str != null && str.length() != 0) {
                this.LJLL.LIZLLL(str);
            }
            if (img != null && C78857UxB.LJJJIL(img.url)) {
                int LJIIL = C43001GuD.LJIIL(this.LJLJL);
                String str2 = img.url;
                o.LJIIIIZZ(str2, "cover.url");
                String LJJIIZ = C1E4.LJJIIZ(str2, LJIIL, LJIIL, EnumC70569Rmn.LIVE_POP_CARD);
                S36<ConstraintLayout> s36 = this.LJLLILLLL;
                String str3 = img.key;
                o.LJIIIIZZ(str3, "cover.key");
                s36.LJII(null, LJJIIZ, str3);
            }
            requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2N(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLLLL = C62850Ola.LJFF(context, "context");
        this.LJLJL = 4;
        C16880lQ.LLLZIIL(R.layout.ar8, C16880lQ.LLZIL(context).cloneInContext(new ContextThemeWrapper(context, R.style.a7j)), this);
        ViewGroup ecommercelive_product_price_layout = (ViewGroup) _$_findCachedViewById(R.id.cmu);
        o.LJIIIIZZ(ecommercelive_product_price_layout, "ecommercelive_product_price_layout");
        this.LJLLI = new S2X<>(ecommercelive_product_price_layout, new C71479S3n());
        FrameLayout ecommercelive_promotion_layout = (FrameLayout) _$_findCachedViewById(R.id.cmy);
        o.LJIIIIZZ(ecommercelive_promotion_layout, "ecommercelive_promotion_layout");
        S2A s2a = new S2A(ecommercelive_promotion_layout);
        this.LJLLJ = s2a;
        C119754mx ecommercelive_sellingpoint_layout = (C119754mx) _$_findCachedViewById(R.id.cn2);
        o.LJIIIIZZ(ecommercelive_sellingpoint_layout, "ecommercelive_sellingpoint_layout");
        this.LJLJLJ = new C71437S1x(ecommercelive_sellingpoint_layout, this.LJLJJL);
        TuxTextView ecommercelive_btn_buy = (TuxTextView) _$_findCachedViewById(R.id.cm3);
        o.LJIIIIZZ(ecommercelive_btn_buy, "ecommercelive_btn_buy");
        this.LJLJLLL = new S2Y(ecommercelive_btn_buy);
        TuxTextView ecommercelive_product_desc = (TuxTextView) _$_findCachedViewById(R.id.cmo);
        o.LJIIIIZZ(ecommercelive_product_desc, "ecommercelive_product_desc");
        this.LJLL = new S25(ecommercelive_product_desc);
        ViewGroup ecommercelive_product_main_image_layout = (ViewGroup) _$_findCachedViewById(R.id.cmr);
        o.LJIIIIZZ(ecommercelive_product_main_image_layout, "ecommercelive_product_main_image_layout");
        this.LJLLILLLL = new S36<>(ecommercelive_product_main_image_layout, new S3C());
        ViewGroup ecommercelive_product_sold_out_image_mask_layout = (ViewGroup) _$_findCachedViewById(R.id.cmw);
        o.LJIIIIZZ(ecommercelive_product_sold_out_image_mask_layout, "ecommercelive_product_sold_out_image_mask_layout");
        this.LJLLL = new S33<>(ecommercelive_product_sold_out_image_mask_layout, new C78685UuP());
        getControllerLifecycleManager().LIZ.add(s2a);
    }

    public final void LJJLL(PopupCardVO popupCardVO, boolean z, String str, boolean z2) {
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = System.currentTimeMillis();
        this.LJLLILLLL.LJII(new S2V(c72242sW, this, popupCardVO, z, z2), str, popupCardVO.getImageUrlKey());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (!getShown()) {
            setShown(true);
            this.LJLLJ.LJIIJJI(this.LJLJJL);
            this.LJLJLJ.LJ();
            InterfaceC71446S2g popCardViewCallback = getPopCardViewCallback();
            if (popCardViewCallback != null) {
                popCardViewCallback.LJI();
            }
        }
        if (z) {
            boolean ta0 = LiveOuterService.LJJJLL().LJJIIJZLJL().ta0();
            int i5 = i3 - i;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            int LJI = C87277YNd.LJI(300, context);
            if (ta0 || i5 < LJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 != this.LJLJJI) {
                this.LJLJJI = z2;
            }
        }
        S2X<C119774mz> s2x = this.LJLLI;
        boolean z3 = !this.LJLJJI;
        TuxTextView tuxTextView = s2x.LJII;
        if (tuxTextView != null) {
            S2R.LIZIZ(tuxTextView, z3);
        }
        TuxTextView tuxTextView2 = s2x.LJIIIIZZ;
        if (tuxTextView2 != null) {
            S2R.LIZIZ(tuxTextView2, z3);
        }
    }

    @Override // X.AbstractC71212RxA
    public final void LJJLJLI(PopupCardVO popupCardVO, C48502J1u c48502J1u, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, boolean z2, int i) {
        boolean z3;
        List<SellingItem> list;
        List<PromotionItem> list2;
        setPopCardStyle(popupCardVO);
        getControllerLifecycleManager().LIZ();
        this.LJLJJLL = popupCardVO;
        this.LJLJL = i;
        int LJIIL = C43001GuD.LJIIL(i);
        String LJJIIZ = C1E4.LJJIIZ(popupCardVO.getImageUrl(), LJIIL, LJIIL, EnumC70569Rmn.LIVE_POP_CARD);
        InterfaceC43919HLn<C76800UCe> interfaceC43919HLn = C70870Rre.LIZ.get(LJJIIZ);
        if (interfaceC43919HLn != null && interfaceC43919HLn.isCompleted()) {
            z3 = true;
        } else {
            z3 = false;
        }
        S32 s32 = null;
        if (z3) {
            LJJLL(popupCardVO, z, LJJIIZ, true);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C71277RyD(interfaceC43919HLn, this, popupCardVO, z, LJJIIZ, null), 3);
        }
        this.LJLLILLLL.LJIIIIZZ();
        this.LJLLILLLL.LJIIIZ(popupCardVO.getBagIndex(), Integer.valueOf(popupCardVO.getPlatform()), popupCardVO.getSource());
        setSoldOut(popupCardVO.isSoldOut());
        ((LinkedHashMap) this.LJLJJL).clear();
        S2Y s2y = this.LJLJLLL;
        boolean isSoldOut = popupCardVO.isSoldOut();
        String string = getContext().getString(R.string.t5);
        s2y.LJII(new C53608L2e(isSoldOut, string, string));
        this.LJLJJI = LiveOuterService.LJJJLL().LJJIIJZLJL().ta0();
        PromotionView promotionView = popupCardVO.getPromotionView();
        if (promotionView != null && (list2 = promotionView.promotion_items) != null) {
            ArrayList arrayList = new ArrayList();
            for (PromotionItem promotionItem : list2) {
                if (!ORZ.LJLJJI(promotionItem.getType(), S2P.LIZIZ)) {
                    arrayList.add(promotionItem);
                }
            }
            this.LJLLJ.LJIILIIL(new S2G(arrayList, popupCardVO.getCreateTime(), popupCardVO.getServerTime(), false, 24));
        }
        SellingView sellingView = popupCardVO.getSellingView();
        if (sellingView != null && (list = sellingView.sellingItems) != null) {
            if (this.LJLLJ.LIZ()) {
                this.LJLJLJ.LJFF(new C71438S1y(list, 1));
            } else {
                this.LJLJLJ.LJFF(new C71438S1y(list, 2));
            }
        }
        this.LJLLJ.LIZIZ = new C71448S2i(this);
        LJJZ();
        this.LJLL.LIZLLL(popupCardVO.getTitle());
        S2X<C119774mz> s2x = this.LJLLI;
        String formatOriginPrice = popupCardVO.getFormatOriginPrice();
        String formatAvailablePrice = popupCardVO.getFormatAvailablePrice();
        String price = popupCardVO.getPrice();
        String pricePrefix = popupCardVO.getPricePrefix();
        String discount = popupCardVO.getDiscount();
        if (C78857UxB.LJJJIL(popupCardVO.getPriceIntegerNum())) {
            s32 = new S32(popupCardVO.getPriceCurrency(), popupCardVO.getPriceIntegerNum(), popupCardVO.getPriceDecimalNum());
        }
        s2x.LJIIIIZZ(new C71451S2l(formatOriginPrice, formatAvailablePrice, price, pricePrefix, discount, s32));
        View ecommercelive_icon_close = _$_findCachedViewById(R.id.cm9);
        o.LJIIIIZZ(ecommercelive_icon_close, "ecommercelive_icon_close");
        C16880lQ.LJIIJ(new Au2S20S0100000_12((InterfaceC65784Pro) interfaceC65784Pro, 65), ecommercelive_icon_close);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 66, 42, 42), this.LJLLILLLL.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 67, 42, 42), this.LJLL.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 68, 42, 42), this.LJLJLLL.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 69, 42, 42), this);
    }
}
