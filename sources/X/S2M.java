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
public final class S2M extends S2Q {
    public final S2Y LJLJL;
    public final S25 LJLJLJ;
    public final S2X<C119774mz> LJLJLLL;
    public final S36<ConstraintLayout> LJLL;
    public final S33<FrameLayout> LJLLI;
    public final S2A LJLLILLLL;
    public final C71437S1x LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ;

    public static /* synthetic */ void getLivePinCardMinimalism$annotations() {
    }

    @Override // X.InterfaceC71133Rvt
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC71133Rvt
    public final void LJJIL(int i, AtmosphereTag atmosphereTag) {
    }

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLZ;
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

    @Override // X.AbstractC71212RxA
    public java.util.Map<String, String> getEventParamForContentShow() {
        String str;
        this.LJLJJL.remove("flashsale_status");
        this.LJLJJL.remove("countdown_type");
        String LJIIIZ = this.LJLLILLLL.LJIIIZ();
        if (LJIIIZ != null) {
            this.LJLJJL.put("flashsale_status", LJIIIZ);
        }
        String LJIIIIZZ = this.LJLLILLLL.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            this.LJLJJL.put("countdown_type", LJIIIIZZ);
        }
        java.util.Map<String, String> map = this.LJLJJL;
        if (this.LJLLILLLL.LIZLLL) {
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
        L3K l3k = new L3K();
        this.LJLL.LJIIJJI(l3k.LJJJ());
        this.LJLLI.LJI(l3k.LJJJ());
        this.LJLJL.LJI(l3k.LJLJJL);
        this.LJLLJ.LJI(l3k.LJJJJIZL());
        this.LJLJLLL.LJIIIZ(l3k.LJJIL());
        S2A s2a = this.LJLLILLLL;
        java.util.Map<L3F, ? extends S2E> LJJJIL = l3k.LJJJIL();
        s2a.getClass();
        s2a.LJIIJ = LJJJIL;
    }

    private final void setSoldOut(boolean z) {
        if (this.LJLL.LIZ()) {
            this.LJLLI.LJII(z);
        }
        if (this.LJLJL.LIZ()) {
            S2Y s2y = this.LJLJL;
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
                this.LJLJLJ.LIZLLL(str);
            }
            if (img != null && C78857UxB.LJJJIL(img.url)) {
                int LJIIL = C43001GuD.LJIIL(this.LJLLL);
                String str2 = img.url;
                o.LJIIIIZZ(str2, "cover.url");
                String LJJIIZ = C1E4.LJJIIZ(str2, LJIIL, LJIIL, EnumC70569Rmn.LIVE_POP_CARD);
                S36<ConstraintLayout> s36 = this.LJLL;
                String str3 = img.key;
                o.LJIIIIZZ(str3, "cover.key");
                s36.LJII(null, LJJIIZ, str3);
            }
            requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2M(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLZ = C62850Ola.LJFF(context, "context");
        this.LJLLL = 5;
        C16880lQ.LLLZIIL(R.layout.ar7, C16880lQ.LLZIL(context).cloneInContext(new ContextThemeWrapper(context, R.style.a7j)), this);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(context.getResources().getDimension(R.dimen.pg));
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        setBackground(c110614Vt.LIZ(context));
        ViewGroup ecommercelive_product_price_layout = (ViewGroup) _$_findCachedViewById(R.id.cmu);
        o.LJIIIIZZ(ecommercelive_product_price_layout, "ecommercelive_product_price_layout");
        this.LJLJLLL = new S2X<>(ecommercelive_product_price_layout, new C71479S3n());
        TuxTextView ecommercelive_btn_buy = (TuxTextView) _$_findCachedViewById(R.id.cm3);
        o.LJIIIIZZ(ecommercelive_btn_buy, "ecommercelive_btn_buy");
        this.LJLJL = new S2Y(ecommercelive_btn_buy);
        TuxTextView ecommercelive_product_desc = (TuxTextView) _$_findCachedViewById(R.id.cmo);
        o.LJIIIIZZ(ecommercelive_product_desc, "ecommercelive_product_desc");
        this.LJLJLJ = new S25(ecommercelive_product_desc);
        ViewGroup ecommercelive_product_main_image_layout = (ViewGroup) _$_findCachedViewById(R.id.cmr);
        o.LJIIIIZZ(ecommercelive_product_main_image_layout, "ecommercelive_product_main_image_layout");
        this.LJLL = new S36<>(ecommercelive_product_main_image_layout, new S3C());
        ViewGroup ecommercelive_product_sold_out_image_mask_layout = (ViewGroup) _$_findCachedViewById(R.id.cmw);
        o.LJIIIIZZ(ecommercelive_product_sold_out_image_mask_layout, "ecommercelive_product_sold_out_image_mask_layout");
        this.LJLLI = new S33<>(ecommercelive_product_sold_out_image_mask_layout, new C78685UuP());
        FrameLayout ecommercelive_promotion_layout = (FrameLayout) _$_findCachedViewById(R.id.cmy);
        o.LJIIIIZZ(ecommercelive_promotion_layout, "ecommercelive_promotion_layout");
        S2A s2a = new S2A(ecommercelive_promotion_layout);
        this.LJLLILLLL = s2a;
        C119754mx selling_point_view = (C119754mx) _$_findCachedViewById(R.id.jnz);
        o.LJIIIIZZ(selling_point_view, "selling_point_view");
        this.LJLLJ = new C71437S1x(selling_point_view, this.LJLJJL);
        getControllerLifecycleManager().LIZ.add(s2a);
    }

    public final void LJJLL(PopupCardVO popupCardVO, boolean z, String str, boolean z2) {
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = System.currentTimeMillis();
        this.LJLL.LJII(new S2U(c72242sW, this, popupCardVO, z, z2), str, popupCardVO.getImageUrlKey());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        C71451S2l c71451S2l;
        super.onLayout(z, i, i2, i3, i4);
        if (!getShown()) {
            setShown(true);
            this.LJLLILLLL.LJIIJJI(this.LJLJJL);
            this.LJLLJ.LJ();
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
            View ecommercelive_promotion_layout = _$_findCachedViewById(R.id.cmy);
            o.LJIIIIZZ(ecommercelive_promotion_layout, "ecommercelive_promotion_layout");
            if (ecommercelive_promotion_layout.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                this.LJLLLLLL = (_$_findCachedViewById(R.id.i3y).getWidth() - _$_findCachedViewById(R.id.cmy).getMeasuredWidth()) - getContext().getResources().getDimensionPixelOffset(R.dimen.pb);
            } else {
                this.LJLLLLLL = _$_findCachedViewById(R.id.i3y).getWidth();
            }
            if (this.LJLLLL) {
                int i6 = this.LJLLLLLL;
                if (i6 > 0 && i6 < _$_findCachedViewById(R.id.i3y).getWidth()) {
                    if (this.LJLJLLL.LJII(this.LJLLLLLL)) {
                        this.LJLJLLL.LJIIJ(false);
                        this.LJLLILLLL.LJII(false);
                        return;
                    }
                    S2X<C119774mz> s2x = this.LJLJLLL;
                    int i7 = this.LJLLLLLL;
                    TuxTextView tuxTextView = s2x.LJI;
                    if (tuxTextView == null || (c71451S2l = s2x.LJIIIZ) == null || s2x.LJFF().LIZJ(s2x.LIZJ, tuxTextView, c71451S2l.LIZLLL, c71451S2l.LIZJ, c71451S2l.LJFF, i7)) {
                        this.LJLJLLL.LJIIJ(true);
                        this.LJLLILLLL.LJII(false);
                        return;
                    }
                    this.LJLLILLLL.LJII(true);
                    if (this.LJLJLLL.LJII(_$_findCachedViewById(R.id.i3y).getWidth())) {
                        this.LJLJLLL.LJIIJ(false);
                        return;
                    } else {
                        this.LJLJLLL.LJIIJ(true);
                        return;
                    }
                }
                this.LJLLILLLL.LJII(true);
                return;
            }
            S2X<C119774mz> s2x2 = this.LJLJLLL;
            if (!C71461S2v.LIZ(s2x2.LJII) && !C71461S2v.LIZ(s2x2.LJIIIIZZ)) {
                return;
            }
            this.LJLJLLL.LJIIJ(true);
        }
    }

    @Override // X.AbstractC71212RxA
    public final void LJJLJLI(PopupCardVO popupCardVO, C48502J1u c48502J1u, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, boolean z2, int i) {
        boolean z3;
        List<SellingItem> list;
        List<PromotionItem> list2;
        this.LJLLL = i;
        setPopCardStyle(popupCardVO);
        this.LJLL.LJIIIIZZ();
        this.LJLL.LJIIIZ(popupCardVO.getBagIndex(), Integer.valueOf(popupCardVO.getPlatform()), popupCardVO.getSource());
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
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C71276RyC(interfaceC43919HLn, this, popupCardVO, z, LJJIIZ, null), 3);
        }
        ((LinkedHashMap) this.LJLJJL).clear();
        setSoldOut(popupCardVO.isSoldOut());
        this.LJLJLJ.LIZLLL(popupCardVO.getTitle());
        PromotionView promotionView = popupCardVO.getPromotionView();
        if (promotionView != null && (list2 = promotionView.promotion_items) != null) {
            ArrayList arrayList = new ArrayList();
            for (PromotionItem promotionItem : list2) {
                if (!ORZ.LJLJJI(promotionItem.getType(), S2P.LIZIZ)) {
                    arrayList.add(promotionItem);
                }
            }
            this.LJLLILLLL.LJIILIIL(new S2G(arrayList, popupCardVO.getCreateTime(), popupCardVO.getServerTime(), true, 16));
        }
        boolean LIZ = this.LJLLILLLL.LIZ();
        this.LJLLLL = LIZ;
        if (LIZ) {
            this.LJLLILLLL.LJII(false);
            S2X<C119774mz> s2x = this.LJLJLLL;
            String formatAvailablePrice = popupCardVO.getFormatAvailablePrice();
            String price = popupCardVO.getPrice();
            String pricePrefix = popupCardVO.getPricePrefix();
            if (C78857UxB.LJJJIL(popupCardVO.getPriceIntegerNum())) {
                s32 = new S32(popupCardVO.getPriceCurrency(), popupCardVO.getPriceIntegerNum(), popupCardVO.getPriceDecimalNum());
            }
            s2x.LJIIIIZZ(new C71451S2l((String) null, formatAvailablePrice, price, pricePrefix, (String) null, s32));
        } else {
            this.LJLLILLLL.LJII(true);
            S2X<C119774mz> s2x2 = this.LJLJLLL;
            String formatOriginPrice = popupCardVO.getFormatOriginPrice();
            String formatAvailablePrice2 = popupCardVO.getFormatAvailablePrice();
            String price2 = popupCardVO.getPrice();
            String pricePrefix2 = popupCardVO.getPricePrefix();
            String discount = popupCardVO.getDiscount();
            if (C78857UxB.LJJJIL(popupCardVO.getPriceIntegerNum())) {
                s32 = new S32(popupCardVO.getPriceCurrency(), popupCardVO.getPriceIntegerNum(), popupCardVO.getPriceDecimalNum());
            }
            s2x2.LJIIIIZZ(new C71451S2l(formatOriginPrice, formatAvailablePrice2, price2, pricePrefix2, discount, s32));
        }
        SellingView sellingView = popupCardVO.getSellingView();
        if (sellingView != null && (list = sellingView.sellingItems) != null) {
            this.LJLLJ.LJFF(new C71438S1y(list, -1));
        }
        if (this.LJLLJ.LIZ()) {
            this.LJLJLJ.LJ(1);
        } else {
            this.LJLJLJ.LJ(2);
        }
        View ecommercelive_icon_close = _$_findCachedViewById(R.id.cm9);
        o.LJIIIIZZ(ecommercelive_icon_close, "ecommercelive_icon_close");
        C16880lQ.LJIIJ(new Au2S20S0100000_12((InterfaceC65784Pro) interfaceC65784Pro, 60), ecommercelive_icon_close);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 61, 42, 42), this.LJLL.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 62, 42, 42), this.LJLJLJ.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 63, 42, 42), this.LJLJL.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 64, 42, 42), this);
    }
}
