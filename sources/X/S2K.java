package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.data.DaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingView;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.settings.PinCardRefactorSettings;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2K extends AbstractC71281RyH {
    public int LJLJJLL;
    public final S25 LJLJL;
    public final S2X<FrameLayout> LJLJLJ;
    public final S36<ConstraintLayout> LJLJLLL;
    public final S33<FrameLayout> LJLL;
    public final S20 LJLLI;
    public final S2J LJLLILLLL;
    public final C71442S2c LJLLJ;
    public final C71440S2a<ConstraintLayout> LJLLL;
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

    @Override // X.AbstractC71281RyH, X.AbstractC71212RxA
    public void setAtmosphereTags(List<AtmosphereTag> atmosphereTags) {
        o.LJIIIZ(atmosphereTags, "atmosphereTags");
    }

    public final void LJJZ() {
        if (this.LJLLI.LIZ() || this.LJLLILLLL.LIZ()) {
            this.LJLJL.LJ(1);
        } else {
            this.LJLJL.LJ(2);
        }
    }

    @Override // X.AbstractC71212RxA
    public java.util.Map<String, String> getEventParamForContentShow() {
        String str;
        this.LJLJJI.remove("flashsale_status");
        this.LJLJJI.remove("countdown_type");
        String LJIIIZ = this.LJLLILLLL.LJIIIZ();
        if (LJIIIZ != null) {
            this.LJLJJI.put("flashsale_status", LJIIIZ);
        }
        String LJIIIIZZ = this.LJLLILLLL.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            this.LJLJJI.put("countdown_type", LJIIIIZZ);
        }
        java.util.Map<String, String> map = this.LJLJJI;
        if (this.LJLLILLLL.LIZLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_free_shipping", str);
        this.LJLJJI.put("promotion_label_level", "3");
        return this.LJLJJI;
    }

    @Override // X.AbstractC71212RxA
    public java.util.Map<String, String> getPromotionLogoDaInfo() {
        return new HashMap();
    }

    private final void setPopCardStyle(PopupCardVO popupCardVO) {
        L3E l3e;
        if (this.LJLJJLL == 2) {
            setPadding(0, 0, 0, getContext().getResources().getDimensionPixelOffset(R.dimen.pb));
            l3e = new L31();
        } else {
            setPadding(0, 0, 0, getContext().getResources().getDimensionPixelOffset(R.dimen.pg));
            l3e = new L3E();
        }
        C71442S2c c71442S2c = this.LJLLJ;
        L3V style = l3e.LJ;
        c71442S2c.getClass();
        o.LJIIIZ(style, "style");
        c71442S2c.LJFF = style;
        this.LJLJLJ.LJIIIZ(l3e.LIZ());
        S20 s20 = this.LJLLI;
        C53617L2n style2 = l3e.LIZJ;
        s20.getClass();
        o.LJIIIZ(style2, "style");
        s20.LJFF = style2;
        S2J s2j = this.LJLLILLLL;
        java.util.Map<L3F, S2E> style3 = l3e.LIZIZ;
        s2j.getClass();
        o.LJIIIZ(style3, "style");
        s2j.LJIIJ = style3;
        this.LJLJLLL.LJIIJJI(l3e.LIZLLL);
        this.LJLL.LJI(l3e.LIZLLL);
        C71440S2a<ConstraintLayout> c71440S2a = this.LJLLL;
        InterfaceC54556Lb6 style4 = l3e.LIZIZ();
        c71440S2a.getClass();
        o.LJIIIZ(style4, "style");
        c71440S2a.LJI(style4);
        c71440S2a.LJFF.LIZ(style4);
    }

    private final void setSoldOut(boolean z) {
        if (2 == this.LJLJJLL) {
            S2X<FrameLayout> s2x = this.LJLJLJ;
            s2x.LJFF().LJIIIZ(s2x.LIZJ, s2x.LJI, !z);
            C71442S2c c71442S2c = this.LJLLJ;
            c71442S2c.getClass();
            if (o.LJ(c71442S2c.LJ, Boolean.valueOf(z))) {
                C36746EbW.LIZ(5, "same state and not init");
            } else {
                c71442S2c.LJ = Boolean.valueOf(z);
                if (z) {
                    T t = c71442S2c.LIZ;
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZJ = Float.valueOf(c71442S2c.LJFF.LIZ());
                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.cg);
                    t.setBackground(c110614Vt.LIZ(c71442S2c.LIZJ));
                    ((TuxIconView) c71442S2c.LJI.getValue()).setTintColorRes(R.attr.gp);
                } else {
                    T t2 = c71442S2c.LIZ;
                    C110614Vt c110614Vt2 = new C110614Vt();
                    c110614Vt2.LIZJ = Float.valueOf(c71442S2c.LJFF.LIZ());
                    c110614Vt2.LIZIZ = Integer.valueOf(R.attr.eb);
                    t2.setBackground(c110614Vt2.LIZ(c71442S2c.LIZJ));
                    ((TuxIconView) c71442S2c.LJI.getValue()).setTintColorRes(R.attr.dj);
                }
            }
        }
        this.LJLL.LJII(z);
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
        if (this.LJLJJL != null) {
            if (str != null && str.length() != 0) {
                this.LJLJL.LIZLLL(str);
            }
            int LJIIL = C43001GuD.LJIIL(this.LJLJJLL);
            if (img != null && C78857UxB.LJJJIL(img.url)) {
                String str2 = img.url;
                o.LJIIIIZZ(str2, "cover.url");
                String LJJIIZ = C1E4.LJJIIZ(str2, LJIIL, LJIIL, EnumC70569Rmn.LIVE_POP_CARD);
                S36<ConstraintLayout> s36 = this.LJLJLLL;
                String str3 = img.key;
                o.LJIIIIZZ(str3, "cover.key");
                s36.LJII(null, LJJIIZ, str3);
            }
            requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2K(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLLLL = C62850Ola.LJFF(context, "context");
        this.LJLJJLL = 3;
        C16880lQ.LLLZIIL(R.layout.arf, C16880lQ.LLZIL(context).cloneInContext(new ContextThemeWrapper(context, R.style.a7j)), this);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(context.getResources().getDimension(R.dimen.pg));
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        setBackground(c110614Vt.LIZ(context));
        ViewGroup ecommercelive_product_price_layout = (ViewGroup) _$_findCachedViewById(R.id.cmu);
        o.LJIIIIZZ(ecommercelive_product_price_layout, "ecommercelive_product_price_layout");
        this.LJLJLJ = new S2X<>(ecommercelive_product_price_layout, new C78688UuS());
        TuxTextView ecommercelive_product_desc = (TuxTextView) _$_findCachedViewById(R.id.cmo);
        o.LJIIIIZZ(ecommercelive_product_desc, "ecommercelive_product_desc");
        this.LJLJL = new S25(ecommercelive_product_desc);
        ViewGroup ecommercelive_product_main_image_layout = (ViewGroup) _$_findCachedViewById(R.id.cmr);
        o.LJIIIIZZ(ecommercelive_product_main_image_layout, "ecommercelive_product_main_image_layout");
        this.LJLJLLL = new S36<>(ecommercelive_product_main_image_layout, new S3C());
        ViewGroup ecommercelive_product_sold_out_image_mask_layout = (ViewGroup) _$_findCachedViewById(R.id.cmw);
        o.LJIIIIZZ(ecommercelive_product_sold_out_image_mask_layout, "ecommercelive_product_sold_out_image_mask_layout");
        this.LJLL = new S33<>(ecommercelive_product_sold_out_image_mask_layout, new C78685UuP());
        C119794n1 ecommercelive_selling_point_layout = (C119794n1) _$_findCachedViewById(R.id.cn1);
        o.LJIIIIZZ(ecommercelive_selling_point_layout, "ecommercelive_selling_point_layout");
        this.LJLLI = new S20(ecommercelive_selling_point_layout, this.LJLJJI);
        C119794n1 ecommercelive_promotion_layout = (C119794n1) _$_findCachedViewById(R.id.cmy);
        o.LJIIIIZZ(ecommercelive_promotion_layout, "ecommercelive_promotion_layout");
        S2J s2j = new S2J(ecommercelive_promotion_layout);
        this.LJLLILLLL = s2j;
        ViewGroup ecommercelive_btn_buy = (ViewGroup) _$_findCachedViewById(R.id.cm3);
        o.LJIIIIZZ(ecommercelive_btn_buy, "ecommercelive_btn_buy");
        this.LJLLJ = new C71442S2c(ecommercelive_btn_buy, new C78687UuR());
        ConstraintLayout ecommercelive_product_main_image_layout2 = (ConstraintLayout) _$_findCachedViewById(R.id.cmr);
        o.LJIIIIZZ(ecommercelive_product_main_image_layout2, "ecommercelive_product_main_image_layout");
        this.LJLLL = new C71440S2a<>(ecommercelive_product_main_image_layout2, new C54555Lb5());
        getControllerLifecycleManager().LIZ.add(s2j);
    }

    public final void LJJLL(PopupCardVO popupCardVO, boolean z, String str, boolean z2) {
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = System.currentTimeMillis();
        this.LJLJLLL.LJII(new S2W(c72242sW, this, popupCardVO, z, z2), str, popupCardVO.getImageUrlKey());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (((X.C119794n1) r1.LIZ).LJLIL != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            X.S2J r0 = r4.LJLLILLLL
            boolean r0 = r0.LIZ()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1d
            X.S2J r1 = r4.LJLLILLLL
            boolean r0 = r1.LIZ()
            if (r0 == 0) goto L65
            T extends android.view.View r0 = r1.LIZ
            X.4n1 r0 = (X.C119794n1) r0
            android.view.View r0 = r0.LJLIL
            if (r0 == 0) goto L65
        L1d:
            X.S2J r0 = r4.LJLLILLLL
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L5f
            X.S20 r0 = r4.LJLLI
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L3d
            X.S20 r1 = r4.LJLLI
            boolean r0 = r1.LIZ()
            if (r0 == 0) goto L5f
            T extends android.view.View r0 = r1.LIZ
            X.4n1 r0 = (X.C119794n1) r0
            android.view.View r0 = r0.LJLIL
            if (r0 == 0) goto L5f
        L3d:
            r4.LJJZ()
            boolean r0 = r4.getShown()
            if (r0 != 0) goto L5e
            r4.setShown(r2)
            X.S2J r1 = r4.LJLLILLLL
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LJLJJI
            r1.LJIIJJI(r0)
            X.S20 r0 = r4.LJLLI
            r0.LJ()
            X.S2g r0 = r4.getPopCardViewCallback()
            if (r0 == 0) goto L5e
            r0.LJI()
        L5e:
            return
        L5f:
            X.S20 r0 = r4.LJLLI
            r0.LIZJ(r3)
            goto L3d
        L65:
            X.S2J r1 = r4.LJLLILLLL
            boolean r0 = r1.LJ
            if (r0 == 0) goto L72
            X.2mu r0 = r1.LJII
            if (r0 == 0) goto L72
            r0.LIZ()
        L72:
            X.S2J r0 = r4.LJLLILLLL
            r0.LIZJ(r3)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S2K.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC71212RxA
    public final void LJJLJLI(PopupCardVO popupCardVO, C48502J1u c48502J1u, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, boolean z2, int i) {
        C018905p c018905p;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        S32 s32;
        boolean z3;
        List<SellingItem> list;
        String str;
        String str2;
        List<PromotionItem> list2;
        C018905p c018905p2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        this.LJLJJLL = i;
        setPopCardStyle(popupCardVO);
        this.LJLJJL = popupCardVO;
        boolean z4 = false;
        if (2 == this.LJLJJLL) {
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.cmo).getLayoutParams();
            if ((layoutParams instanceof C018905p) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.pg));
                marginLayoutParams2.setMarginStart(getContext().getResources().getDimensionPixelOffset(R.dimen.pg));
            }
            _$_findCachedViewById(R.id.cm3).setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.cmu).getLayoutParams();
            if ((layoutParams2 instanceof C018905p) && (c018905p2 = (C018905p) layoutParams2) != null) {
                c018905p2.topToTop = R.id.cm3;
                c018905p2.bottomToBottom = R.id.cm3;
                c018905p2.topToBottom = -1;
                c018905p2.startToStart = R.id.cm3;
                c018905p2.endToEnd = R.id.cm3;
                c018905p2.endToStart = -1;
                ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = 0;
                c018905p2.setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.oz));
                c018905p2.setMarginStart(getContext().getResources().getDimensionPixelOffset(R.dimen.pb));
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById(R.id.cmo).getLayoutParams();
            if ((layoutParams3 instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams.setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.pg));
                marginLayoutParams.setMarginStart(getContext().getResources().getDimensionPixelOffset(R.dimen.pg));
            }
            _$_findCachedViewById(R.id.cm3).setVisibility(8);
            ViewGroup.LayoutParams layoutParams4 = _$_findCachedViewById(R.id.cmu).getLayoutParams();
            if ((layoutParams4 instanceof C018905p) && (c018905p = (C018905p) layoutParams4) != null) {
                c018905p.startToStart = R.id.cmo;
                c018905p.endToEnd = R.id.cmo;
                c018905p.topToBottom = R.id.cmz;
                c018905p.topToTop = -1;
                c018905p.endToStart = -1;
                c018905p.bottomToBottom = -1;
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = getContext().getResources().getDimensionPixelOffset(R.dimen.pg);
                c018905p.setMarginEnd(0);
                c018905p.setMarginStart(0);
            }
        }
        S2X<FrameLayout> s2x = this.LJLJLJ;
        String formatAvailablePrice = popupCardVO.getFormatAvailablePrice();
        String price = popupCardVO.getPrice();
        String pricePrefix = popupCardVO.getPricePrefix();
        if (C78857UxB.LJJJIL(popupCardVO.getPriceIntegerNum())) {
            s32 = new S32(popupCardVO.getPriceCurrency(), popupCardVO.getPriceIntegerNum(), popupCardVO.getPriceDecimalNum());
        } else {
            s32 = null;
        }
        s2x.LJIIIIZZ(new C71451S2l((String) null, formatAvailablePrice, price, pricePrefix, (String) null, s32));
        C71440S2a<ConstraintLayout> c71440S2a = this.LJLLL;
        String discount = popupCardVO.getDiscount();
        if (C78857UxB.LJJJIL(discount)) {
            if (c71440S2a.LJI == null) {
                c71440S2a.LJI = c71440S2a.LJFF.LIZIZ(c71440S2a.LIZ);
            }
            TuxTextView tuxTextView = c71440S2a.LJI;
            if (tuxTextView != null) {
                tuxTextView.setText(discount);
            }
        } else {
            c71440S2a.getClass();
        }
        setSoldOut(popupCardVO.isSoldOut());
        ((LinkedHashMap) this.LJLJJI).clear();
        if (_$_findCachedViewById(R.id.cm3).getVisibility() == 0) {
            View ecommercelive_btn_buy = _$_findCachedViewById(R.id.cm3);
            o.LJIIIIZZ(ecommercelive_btn_buy, "ecommercelive_btn_buy");
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 71, 42, 42), ecommercelive_btn_buy);
        }
        this.LJLJLLL.LJIIIIZZ();
        this.LJLJLLL.LJIIIZ(popupCardVO.getBagIndex(), Integer.valueOf(popupCardVO.getPlatform()), popupCardVO.getSource());
        int LJIIL = C43001GuD.LJIIL(i);
        String LJJIIZ = C1E4.LJJIIZ(popupCardVO.getImageUrl(), LJIIL, LJIIL, EnumC70569Rmn.LIVE_POP_CARD);
        InterfaceC43919HLn<C76800UCe> interfaceC43919HLn = C70870Rre.LIZ.get(LJJIIZ);
        if (interfaceC43919HLn != null && interfaceC43919HLn.isCompleted()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            LJJLL(popupCardVO, z, LJJIIZ, true);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C71278RyE(interfaceC43919HLn, this, popupCardVO, z, LJJIIZ, null), 3);
        }
        this.LJLJL.LIZLLL(popupCardVO.getTitle());
        PromotionView promotionView = popupCardVO.getPromotionView();
        if (promotionView != null && (list2 = promotionView.promotion_items) != null) {
            ArrayList arrayList = new ArrayList();
            for (PromotionItem promotionItem : list2) {
                if (!ORZ.LJLJJI(promotionItem.getType(), S2P.LIZIZ)) {
                    arrayList.add(promotionItem);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                S2J s2j = this.LJLLILLLL;
                S2G s2g = new S2G(arrayList, popupCardVO.getCreateTime(), popupCardVO.getServerTime(), false, 24);
                s2j.getClass();
                if (!PinCardRefactorSettings.LIZ().getPromotionEnable()) {
                    s2j.LIZJ(false);
                } else {
                    s2j.LIZLLL = false;
                    s2j.LJFF = false;
                    s2j.LJ = false;
                    s2j.LJIIIIZZ.clear();
                    ((ViewGroup) s2j.LIZ).removeAllViews();
                    List<PromotionItem> list3 = s2g.LJLIL;
                    if (!list3.isEmpty()) {
                        PromotionItem promotionItem2 = (PromotionItem) ListProtector.get(list3, 0);
                        if (S29.LJFF(promotionItem2)) {
                            s2j.LJFF = true;
                            s2j.LJIIIIZZ.add(promotionItem2);
                            C68772mv LIZ = C68782mw.LIZ(s2g.LJLILLLLZI, s2g.LJLJI, promotionItem2.getStartTime(), promotionItem2.getEndTime());
                            if (LIZ != null) {
                                s2j.LIZLLL(promotionItem2, LIZ);
                            }
                        } else if (S29.LJ(promotionItem2)) {
                            s2j.LJIIIIZZ.add(promotionItem2);
                            s2j.LJI(promotionItem2);
                        } else {
                            for (PromotionItem promotionItem3 : list3) {
                                Integer type = promotionItem3.getType();
                                if (type != null && type.intValue() == 8) {
                                    s2j.LIZLLL = true;
                                }
                                if (!S29.LJFF(promotionItem3) && !S29.LJ(promotionItem3)) {
                                    s2j.LJIIIIZZ.add(promotionItem3);
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) s2j.LIZ;
                            ArrayList<PromotionItem> arrayList2 = s2j.LJIIIIZZ;
                            EnumC70206Rgw enumC70206Rgw = EnumC70206Rgw.POP_CARD;
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -1);
                            S2E s2e = s2j.LJIIJ.get(L3F.DEFAULT);
                            if (s2e == null) {
                                s2e = new L3A();
                            }
                            C70648Ro4.LIZIZ(viewGroup, arrayList2, enumC70206Rgw, marginLayoutParams3, s2e.getTextFont(), s2j.LJIIJ());
                        }
                        if (((ViewGroup) s2j.LIZ).getChildCount() > 0) {
                            s2j.LIZJ(true);
                        }
                    } else {
                        s2j.LIZJ(false);
                    }
                }
            }
        }
        SellingView sellingView = popupCardVO.getSellingView();
        if (sellingView != null && (list = sellingView.sellingItems) != null) {
            S20 s20 = this.LJLLI;
            C71438S1y c71438S1y = new C71438S1y(list, -1);
            s20.getClass();
            if (!PinCardRefactorSettings.LIZ().getSellingPointEnable()) {
                s20.LIZJ(false);
            } else {
                s20.LJ.clear();
                ((ViewGroup) s20.LIZ).removeAllViews();
                StringBuilder sb = new StringBuilder();
                for (SellingItem sellingItem : c71438S1y.LJLIL) {
                    if (!AbstractC71432S1s.LJI.contains(Integer.valueOf(sellingItem.sellingItemType)) && (str = sellingItem.showText) != null) {
                        DaInfo daInfo = sellingItem.daInfo;
                        if (daInfo != null && (str2 = daInfo.name) != null) {
                            sb.append(str2);
                            sb.append(",");
                        }
                        s20.LJ.add(sellingItem);
                        int i2 = sellingItem.sellingItemType;
                        if (i2 != 3) {
                            if (i2 != 7) {
                                s20.LIZLLL(C71428S1o.LIZ(s20.LIZJ, str, s20.LJFF));
                            } else {
                                s20.LIZLLL(C71428S1o.LIZIZ(s20.LIZJ, str, s20.LJFF));
                            }
                        } else {
                            String str3 = sellingItem.optShowText;
                            if (str3 == null) {
                                StringBuilder LJFF = C72972SkS.LJFF(str, ' ');
                                LJFF.append(s20.LIZJ.getResources().getString(R.string.f9u));
                                str3 = X1D.LIZIZ(LJFF);
                            }
                            s20.LIZLLL(C71428S1o.LIZ(s20.LIZJ, str3, s20.LJFF));
                        }
                    }
                }
                if (sb.length() > 0) {
                    if (',' == sb.charAt(sb.length() - 1)) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    java.util.Map<String, String> map = s20.LIZLLL;
                    if (map != null) {
                        String sb2 = sb.toString();
                        o.LJIIIIZZ(sb2, "sb.toString()");
                        map.put("pos_selling_point", sb2);
                    }
                }
                if (((ViewGroup) s20.LIZ).getChildCount() > 0) {
                    z4 = true;
                }
                s20.LIZJ(z4);
            }
        }
        this.LJLLILLLL.LIZIZ = new C71447S2h(this);
        LJJZ();
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.cm9);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark;
        c2068389v.LJ = Integer.valueOf(R.attr.dl);
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.ok);
        c2068389v.LIZJ = dimensionPixelOffset;
        c2068389v.LIZIZ = dimensionPixelOffset;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        SY9 LIZ2 = c2068389v.LIZ(context);
        C71899SJr c71899SJr = new C71899SJr();
        int dimensionPixelOffset2 = getContext().getResources().getDimensionPixelOffset(R.dimen.ok);
        c71899SJr.LIZ = dimensionPixelOffset2;
        c71899SJr.LIZIZ = dimensionPixelOffset2;
        c71899SJr.LIZLLL = Integer.valueOf(R.attr.d4);
        c71899SJr.LJ = Float.valueOf(0.1f);
        c71899SJr.LJFF = Float.valueOf(0.0f);
        c71899SJr.LJI = EnumC71803SFz.RADIAL;
        c71899SJr.LJII = EnumC71900SJs.EASE_IN;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        appCompatImageView.setImageDrawable(C26338AVi.LJIIJ(LIZ2, c71899SJr.LIZ(context2)));
        View ecommercelive_icon_close = _$_findCachedViewById(R.id.cm9);
        o.LJIIIIZZ(ecommercelive_icon_close, "ecommercelive_icon_close");
        C16880lQ.LJIIJ(new Au2S20S0100000_12((InterfaceC65784Pro) interfaceC65784Pro, 70), ecommercelive_icon_close);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 72, 42, 42), this.LJLJLLL.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 73, 42, 42), this.LJLJL.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 74, 42, 42), this);
    }
}
