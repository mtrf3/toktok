package X;

import Y.IDCListenerS258S0100000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingView;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.settings.PinCardRefactorSettings;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2L extends S2Q {
    public int LJLJL;
    public int LJLJLJ;
    public final C71437S1x LJLJLLL;
    public final S2Y LJLL;
    public final C71434S1u LJLLI;
    public final S2X<C119774mz> LJLLILLLL;
    public final S2O LJLLJ;
    public final S36<ConstraintLayout> LJLLL;
    public final C71455S2p LJLLLL;
    public final S2I LJLLLLLL;
    public final C71453S2n LJLZ;
    public final java.util.Map<Integer, View> LJZ;

    public static /* synthetic */ void getLivePinCardMinimalism$annotations() {
    }

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJZ;
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

    private final View getVisibleBtn() {
        S2R s2r;
        if (this.LJLZ.LIZ()) {
            s2r = this.LJLZ;
        } else {
            s2r = this.LJLL;
        }
        return s2r.LIZ;
    }

    @Override // X.InterfaceC71133Rvt
    public final void LJIILLIIL() {
        boolean z;
        int i;
        InterfaceC71446S2g popCardViewCallback;
        S2O s2o = this.LJLLJ;
        PopupCardVO popupCardVO = this.LJLJJLL;
        if (popupCardVO != null && true == popupCardVO.isInStock()) {
            z = true;
        } else {
            z = false;
        }
        s2o.LJIIIIZZ = true;
        C69652RVg c69652RVg = new C69652RVg(0);
        if (PinCardRefactorSettings.LIZ().getAtmosphereEnable()) {
            Iterator<AbstractC71456S2q> it = s2o.LJI.iterator();
            while (true) {
                if (it.hasNext()) {
                    AbstractC71456S2q next = it.next();
                    if (next.LJIIIIZZ == null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("showAtmosphereTagAsPriority getData is null, type = ");
                        LIZ.append(next.LIZLLL);
                        C36746EbW.LIZ(5, X1D.LIZIZ(LIZ));
                    } else {
                        S31 LJIIIIZZ = next.LJIIIIZZ(z);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("showAtmosphereTagAsPriority type = ");
                        LIZ2.append(next.LIZLLL);
                        LIZ2.append(",needShow = ");
                        LIZ2.append(LJIIIIZZ.LIZ);
                        LIZ2.append(" ,showChanged = ");
                        C1DI.LIZJ(LIZ2, LJIIIIZZ.LIZIZ, LIZ2, 4);
                        if (LJIIIIZZ.LIZ) {
                            if (LJIIIIZZ.LIZIZ) {
                                s2o.LIZLLL = next.LJIIIIZZ;
                                s2o.LJ++;
                                c69652RVg.LIZIZ = true;
                                c69652RVg.LIZJ = S2O.LIZLLL(s2o);
                            }
                            i = next.LIZLLL;
                            c69652RVg.LIZ = true;
                        }
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            SparseArray<AbstractC71456S2q> sparseArray = s2o.LJII;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                AbstractC71456S2q valueAt = sparseArray.valueAt(i2);
                if (keyAt != i) {
                    valueAt.LJII();
                }
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("showAtmosphere result needShow = ");
        LIZ3.append(c69652RVg.LIZ);
        LIZ3.append(" , showChanged = ");
        C1DI.LIZJ(LIZ3, c69652RVg.LIZIZ, LIZ3, 4);
        boolean z2 = c69652RVg.LIZ;
        if (z2) {
            this.LJLLL.LJIIJ(!z2);
            java.util.Map<String, String> map = c69652RVg.LIZJ;
            if (c69652RVg.LIZIZ && map != null && (popCardViewCallback = getPopCardViewCallback()) != null) {
                popCardViewCallback.LIZIZ(map);
            }
            this.LJLLJ.LJFF(this.LJLJJL);
        }
    }

    public final void LJJZZI() {
        if (this.LJLJJI) {
            if (this.LJLJL >= 1) {
                ((TextView) this.LJLLI.LIZ).setMaxLines(1);
                return;
            } else {
                ((TextView) this.LJLLI.LIZ).setMaxLines(2);
                return;
            }
        }
        if (this.LJLJL >= 2) {
            ((TextView) this.LJLLI.LIZ).setMaxLines(1);
        } else {
            ((TextView) this.LJLLI.LIZ).setMaxLines(2);
        }
    }

    @Override // X.AbstractC71212RxA
    public java.util.Map<String, String> getEventParamForContentShow() {
        String str;
        this.LJLJJL.remove("flashsale_status");
        this.LJLJJL.remove("countdown_type");
        String LJIIIZ = this.LJLLLLLL.LJIIIZ();
        if (LJIIIZ != null) {
            this.LJLJJL.put("flashsale_status", LJIIIZ);
        }
        String LJIIIIZZ = this.LJLLLLLL.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            this.LJLJJL.put("countdown_type", LJIIIIZZ);
        }
        java.util.Map<String, String> map = this.LJLJJL;
        if (this.LJLLLLLL.LIZLLL) {
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
        return this.LJLLI.LIZLLL;
    }

    private final void setBuyButtonVisible(boolean z) {
        this.LJLL.LIZJ(z);
    }

    private final void setCloseBtnVisible(boolean z) {
        int i;
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.cm9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    private final void setPopCardStyle(PopupCardVO popupCardVO) {
        C78685UuP l3n;
        int liveBagAndPinCardType = popupCardVO.getLiveBagAndPinCardType();
        if (liveBagAndPinCardType != 2) {
            if (liveBagAndPinCardType != 3) {
                if (liveBagAndPinCardType != 4) {
                    l3n = new C78685UuP();
                } else {
                    l3n = new L3L();
                }
            } else {
                l3n = new L3M();
            }
        } else {
            l3n = new L3N();
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(l3n.LJJIJLIJ().LIZ());
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setBackground(c110614Vt.LIZ(context));
        setPaddingRelative(0, 0, 0, l3n.LJJIJLIJ().LIZIZ());
        this.LJLLL.LJIIJJI(l3n.LJJJ());
        C71434S1u c71434S1u = this.LJLLI;
        InterfaceC71436S1w style = l3n.LJJIZ();
        c71434S1u.getClass();
        o.LJIIIZ(style, "style");
        c71434S1u.LJ = style;
        C45804HyK.LJJLI(style.LIZ(), c71434S1u.LIZ);
        this.LJLL.LJI(l3n.LJJIIZ());
        this.LJLJLLL.LJI(l3n.LJJJJIZL());
        this.LJLLILLLL.LJIIIZ(l3n.LJJIL());
        S2I s2i = this.LJLLLLLL;
        java.util.Map<L3F, ? extends S2E> style2 = l3n.LJJJIL();
        s2i.getClass();
        o.LJIIIZ(style2, "style");
        s2i.LJIIJ = style2;
        S2O s2o = this.LJLLJ;
        S3R style3 = l3n.LJJIIJ();
        s2o.getClass();
        o.LJIIIZ(style3, "style");
        s2o.LJFF = style3;
    }

    @Override // X.InterfaceC71247Rxj
    public final void LJJLIIIIJ(boolean z) {
        if (!isAttachedToWindow()) {
            C36746EbW.LIZ(6, "not shown, don't refresh stock");
        } else if (this.LJLL.LIZ() && this.LJLJJLL != null) {
            this.LJLL.LJII(new C53608L2e(z, getContext().getString(R.string.t5), getContext().getString(R.string.t7)));
        }
    }

    @Override // X.S2Q, X.AbstractC71212RxA
    public void setAtmosphereTags(List<AtmosphereTag> atmosphereTags) {
        AbstractC71456S2q LJ;
        o.LJIIIZ(atmosphereTags, "atmosphereTags");
        S2O s2o = this.LJLLJ;
        s2o.getClass();
        if (!PinCardRefactorSettings.LIZ().getAtmosphereEnable()) {
            return;
        }
        s2o.LJI.clear();
        s2o.LJII.clear();
        for (AtmosphereTag atmosphereTag : atmosphereTags) {
            if (s2o.LJII.get(atmosphereTag.tagType) == null && (LJ = s2o.LJ(atmosphereTag.tagType)) != null) {
                LJ.LJIIIIZZ = atmosphereTag;
            }
        }
        s2o.LJ = 0;
        s2o.LIZLLL = null;
        s2o.LJIIIIZZ = false;
    }

    public static void LJJZZIII(View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C018905p c018905p = (C018905p) layoutParams;
        if (c018905p.endToStart != -1 || c018905p.endToEnd != view2.getId()) {
            c018905p.endToStart = -1;
            c018905p.endToEnd = view2.getId();
            c018905p.setMarginEnd(0);
            view.setLayoutParams(c018905p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    @Override // X.InterfaceC71133Rvt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(int r14, com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag r15) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S2L.LJJIL(int, com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag):void");
    }

    @Override // X.InterfaceC71247Rxj
    public final void LJJJJZ(String str, com.bytedance.android.livesdk.model.message.Img img) {
        if (!isAttachedToWindow()) {
            C36746EbW.LIZ(6, "not shown, don't refresh title");
            return;
        }
        PopupCardVO popupCardVO = this.LJLJJLL;
        if (popupCardVO != null) {
            if (str != null && str.length() != 0) {
                this.LJLLI.LIZLLL(new C69876Rbc(str, popupCardVO.getPromotionLogos()));
            }
            if (img != null && C78857UxB.LJJJIL(img.url)) {
                int LJIIL = C43001GuD.LJIIL(this.LJLJLJ);
                String str2 = img.url;
                o.LJIIIIZZ(str2, "cover.url");
                String LJJIIZ = C1E4.LJJIIZ(str2, LJIIL, LJIIL, EnumC70569Rmn.LIVE_POP_CARD);
                S36<ConstraintLayout> s36 = this.LJLLL;
                String str3 = img.key;
                o.LJIIIIZZ(str3, "cover.key");
                s36.LJII(null, LJJIIZ, str3);
            }
            requestLayout();
        }
    }

    public final void LJJLL(View view, View view2) {
        if (view.getVisibility() == 0) {
            int bottom = view.getBottom();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (C87277YNd.LJI(4, context) + bottom <= view2.getTop()) {
                LJJZZIII(view, view2);
                return;
            } else {
                LJL(view, view2);
                return;
            }
        }
        C36746EbW.LIZ(5, "only visible benefitView need check");
    }

    public final void LJL(View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C018905p c018905p = (C018905p) layoutParams;
        if (c018905p.endToEnd != -1 || c018905p.endToStart != view2.getId()) {
            c018905p.endToEnd = -1;
            c018905p.endToStart = view2.getId();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            c018905p.setMarginEnd(C87277YNd.LJI(8, context));
            view.setLayoutParams(c018905p);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2L(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LJZ = C62850Ola.LJFF(context, "context");
        this.LJLJLJ = 1;
        C16880lQ.LLLZIIL(R.layout.ar6, C16880lQ.LLZIL(context).cloneInContext(new ContextThemeWrapper(context, R.style.a7j)), this);
        ViewGroup ecommercelive_product_price_layout = (ViewGroup) _$_findCachedViewById(R.id.cmu);
        o.LJIIIIZZ(ecommercelive_product_price_layout, "ecommercelive_product_price_layout");
        this.LJLLILLLL = new S2X<>(ecommercelive_product_price_layout, new C71479S3n());
        C119754mx selling_point_view = (C119754mx) _$_findCachedViewById(R.id.jnz);
        o.LJIIIIZZ(selling_point_view, "selling_point_view");
        this.LJLJLLL = new C71437S1x(selling_point_view, this.LJLJJL);
        TuxTextView ecommercelive_btn_buy = (TuxTextView) _$_findCachedViewById(R.id.cm3);
        o.LJIIIIZZ(ecommercelive_btn_buy, "ecommercelive_btn_buy");
        this.LJLL = new S2Y(ecommercelive_btn_buy);
        SG5 ecommercelive_product_desc = (SG5) _$_findCachedViewById(R.id.cmo);
        o.LJIIIIZZ(ecommercelive_product_desc, "ecommercelive_product_desc");
        this.LJLLI = new C71434S1u(ecommercelive_product_desc);
        ViewGroup ecommercelive_product_main_image_layout = (ViewGroup) _$_findCachedViewById(R.id.cmr);
        o.LJIIIIZZ(ecommercelive_product_main_image_layout, "ecommercelive_product_main_image_layout");
        this.LJLLL = new S36<>(ecommercelive_product_main_image_layout, new S3C());
        S2O s2o = new S2O(this);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.cmr).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            s2o.LJIIIZ = marginLayoutParams.getMarginStart() + marginLayoutParams.width;
        }
        this.LJLLJ = s2o;
        C119754mx ecommercelive_promotion_layout = (C119754mx) _$_findCachedViewById(R.id.cmy);
        o.LJIIIIZZ(ecommercelive_promotion_layout, "ecommercelive_promotion_layout");
        S2I s2i = new S2I(ecommercelive_promotion_layout);
        this.LJLLLLLL = s2i;
        FrameLayout ecommercelive_fans_tag = (FrameLayout) _$_findCachedViewById(R.id.cm7);
        o.LJIIIIZZ(ecommercelive_fans_tag, "ecommercelive_fans_tag");
        this.LJLLLL = new C71455S2p(ecommercelive_fans_tag);
        TuxIconView ecommercelive_icon_assistant = (TuxIconView) _$_findCachedViewById(R.id.cm8);
        o.LJIIIIZZ(ecommercelive_icon_assistant, "ecommercelive_icon_assistant");
        this.LJLZ = new C71453S2n(ecommercelive_icon_assistant);
        getControllerLifecycleManager().LIZ.add(s2i);
    }

    public final void LJJZ(PopupCardVO popupCardVO, boolean z, String str, boolean z2) {
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = System.currentTimeMillis();
        this.LJLLL.LJII(new S2T(c72242sW, this, popupCardVO, z, z2), str, popupCardVO.getImageUrlKey());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        View visibleBtn = getVisibleBtn();
        LJJLL(this.LJLLLLLL.LIZ, visibleBtn);
        LJJLL(this.LJLJLLL.LIZ, visibleBtn);
        if (!getShown()) {
            setShown(true);
            this.LJLLLLLL.LJIIJJI(this.LJLJJL);
            this.LJLJLLL.LJ();
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
                if (this.LJLJJLL != null) {
                    LJJZZI();
                }
            }
        }
        S2X<C119774mz> s2x = this.LJLLILLLL;
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

    /* JADX WARN: Type inference failed for: r3v14, types: [int, boolean] */
    @Override // X.AbstractC71212RxA
    public final void LJJLJLI(PopupCardVO popupCardVO, C48502J1u c48502J1u, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, boolean z2, int i) {
        boolean z3;
        PromotionItem promotionItem;
        TuxTextView tuxTextView;
        List<SellingItem> list;
        List<PromotionItem> list2;
        Integer style;
        Integer style2;
        String str;
        setPopCardStyle(popupCardVO);
        if (z2) {
            setBuyButtonVisible(false);
            setCloseBtnVisible(false);
        }
        getControllerLifecycleManager().LIZ();
        this.LJLJJLL = popupCardVO;
        this.LJLJLJ = i;
        int LJIIL = C43001GuD.LJIIL(i);
        String LJJIIZ = C1E4.LJJIIZ(popupCardVO.getImageUrl(), LJIIL, LJIIL, EnumC70569Rmn.LIVE_POP_CARD);
        InterfaceC43919HLn<C76800UCe> interfaceC43919HLn = C70870Rre.LIZ.get(LJJIIZ);
        if (interfaceC43919HLn != null && interfaceC43919HLn.isCompleted()) {
            z3 = true;
        } else {
            z3 = false;
        }
        List<PromotionItem> list3 = null;
        if (z3) {
            LJJZ(popupCardVO, z, LJJIIZ, true);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C71275RyB(interfaceC43919HLn, this, popupCardVO, z, LJJIIZ, null), 3);
        }
        this.LJLLL.LJIIIZ(popupCardVO.getBagIndex(), Integer.valueOf(popupCardVO.getPlatform()), popupCardVO.getSource());
        ((LinkedHashMap) this.LJLJJL).clear();
        this.LJLL.LJII(new C53608L2e(popupCardVO.isSoldOut(), getContext().getString(R.string.t5), getContext().getString(R.string.t7)));
        C71453S2n c71453S2n = this.LJLZ;
        Boolean assistantSwitch = popupCardVO.getAssistantSwitch();
        List<Object> assistantModules = popupCardVO.getAssistantModules();
        c71453S2n.getClass();
        if (!PinCardRefactorSettings.LIZ().getAssistantEnable()) {
            c71453S2n.LIZJ(false);
        } else if (o.LJ(assistantSwitch, Boolean.TRUE)) {
            c71453S2n.LIZJ(true);
            if (assistantModules == null || assistantModules.isEmpty()) {
                c71453S2n.LIZLLL.setTintColorRes(R.attr.dw);
            } else {
                c71453S2n.LIZLLL.setTintColorRes(R.attr.gu);
            }
        } else {
            c71453S2n.LIZJ(false);
        }
        if (this.LJLZ.LIZ()) {
            this.LJLL.LIZJ(false);
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 55, 42, 42), this.LJLZ.LIZ);
            java.util.Map<String, String> map = this.LJLJJL;
            map.put("has_live_helper", "1");
            map.put("user_type", "moderator");
            if (c48502J1u == null || (str = c48502J1u.LIZJ("author_id")) == null) {
                str = "";
            }
            map.put("moderator_id", str);
        } else {
            this.LJLL.LIZJ(true);
        }
        this.LJLJJI = LiveOuterService.LJJJLL().LJJIIJZLJL().ta0();
        ArrayList arrayList = new ArrayList();
        PromotionView promotionView = popupCardVO.getPromotionView();
        if (promotionView != null && (list2 = promotionView.promotion_items) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (PromotionItem promotionItem2 : list2) {
                if (!ORZ.LJLJJI(promotionItem2.getType(), S2P.LIZIZ)) {
                    arrayList2.add(promotionItem2);
                }
            }
            Iterator it = arrayList2.iterator();
            promotionItem = null;
            while (it.hasNext()) {
                PromotionItem promotionItem3 = (PromotionItem) it.next();
                Integer type = promotionItem3.getType();
                if (type == null || 3 != type.intValue() || (((style = promotionItem3.getStyle()) == null || 1 != style.intValue()) && ((style2 = promotionItem3.getStyle()) == null || 3 != style2.intValue()))) {
                    arrayList.add(promotionItem3);
                } else {
                    promotionItem = promotionItem3;
                }
            }
        } else {
            promotionItem = null;
        }
        this.LJLJL = 0;
        C71455S2p c71455S2p = this.LJLLLL;
        c71455S2p.getClass();
        if (!PinCardRefactorSettings.LIZ().getFansExclusiveEnable()) {
            c71455S2p.LIZJ(false);
        } else if (promotionItem != null) {
            ((ViewGroup) c71455S2p.LIZ).addView(C70648Ro4.LIZLLL(c71455S2p.LIZJ, promotionItem, EnumC70206Rgw.POP_CARD, new FrameLayout.LayoutParams(-2, -1), AnonymousClass391.LIZJ(4), 81, null));
            c71455S2p.LIZJ(true);
        } else {
            c71455S2p.LIZJ(false);
        }
        if (this.LJLLLL.LIZ()) {
            this.LJLJL++;
        }
        SellingView sellingView = popupCardVO.getSellingView();
        if (sellingView != null && (list = sellingView.sellingItems) != null) {
            this.LJLJLLL.LJFF(new C71438S1y(list, -1));
        }
        if (this.LJLJLLL.LIZ()) {
            this.LJLJL++;
        }
        if (this.LJLJL < 2) {
            S2I s2i = this.LJLLLLLL;
            S2G s2g = new S2G(arrayList, popupCardVO.getCreateTime(), popupCardVO.getServerTime(), false, 24);
            s2i.getClass();
            if (!PinCardRefactorSettings.LIZ().getPromotionEnable()) {
                s2i.LIZJ(false);
            } else {
                s2i.LIZLLL = false;
                s2i.LJFF = false;
                s2i.LJ = false;
                s2i.LJIIIIZZ.clear();
                ((ViewGroup) s2i.LIZ).removeAllViews();
                int i2 = s2g.LJLJJL;
                if (i2 > 0) {
                    ((C119754mx) s2i.LIZ).setMaxTagCount(i2);
                }
                List<PromotionItem> list4 = s2g.LJLIL;
                if (!list4.isEmpty()) {
                    PromotionItem promotionItem4 = (PromotionItem) ListProtector.get(list4, 0);
                    if (S29.LJFF(promotionItem4)) {
                        s2i.LJFF = true;
                        s2i.LJIIIIZZ.add(promotionItem4);
                        C68772mv LIZ = C68782mw.LIZ(s2g.LJLILLLLZI, s2g.LJLJI, promotionItem4.getStartTime(), promotionItem4.getEndTime());
                        if (LIZ != null) {
                            s2i.LIZLLL(promotionItem4, LIZ);
                        }
                    } else if (S29.LJ(promotionItem4)) {
                        s2i.LJIIIIZZ.add(promotionItem4);
                        s2i.LJI(promotionItem4);
                    } else {
                        for (PromotionItem promotionItem5 : list4) {
                            Integer type2 = promotionItem5.getType();
                            if (type2 != null && type2.intValue() == 8) {
                                s2i.LIZLLL = true;
                            }
                            if (!S29.LJFF(promotionItem5) && !S29.LJ(promotionItem5)) {
                                s2i.LJIIIIZZ.add(promotionItem5);
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) s2i.LIZ;
                        ArrayList<PromotionItem> arrayList3 = s2i.LJIIIIZZ;
                        EnumC70206Rgw enumC70206Rgw = EnumC70206Rgw.POP_CARD;
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
                        S2E s2e = s2i.LJIIJ.get(L3F.DEFAULT);
                        if (s2e == null) {
                            s2e = new L3A();
                        }
                        C70648Ro4.LIZIZ(viewGroup, arrayList3, enumC70206Rgw, marginLayoutParams, s2e.getTextFont(), s2i.LJIIJ());
                    }
                    if (((ViewGroup) s2i.LIZ).getChildCount() > 0) {
                        s2i.LIZJ(true);
                    }
                } else {
                    s2i.LIZJ(false);
                }
            }
            if (this.LJLLLLLL.LIZ()) {
                this.LJLJL++;
            }
            this.LJLLLLLL.LIZIZ = new S2S(this);
        } else {
            this.LJLLLLLL.LIZJ(false);
        }
        if (this.LJLJL >= 2) {
            ?? LIZ2 = this.LJLLLL.LIZ();
            int i3 = LIZ2;
            if (this.LJLLLLLL.LIZ()) {
                if (LIZ2 >= 1) {
                    LJL(this.LJLLLLLL.LIZ, getVisibleBtn());
                } else {
                    LJJZZIII(this.LJLLLLLL.LIZ, getVisibleBtn());
                }
                i3 = LIZ2 + 1;
            }
            if (this.LJLJLLL.LIZ()) {
                if (i3 >= 1) {
                    LJL(this.LJLJLLL.LIZ, getVisibleBtn());
                } else {
                    LJJZZIII(this.LJLLLLLL.LIZ, getVisibleBtn());
                }
            }
        }
        LJJZZI();
        PromotionView promotionView2 = popupCardVO.getPromotionView();
        if (promotionView2 != null) {
            list3 = promotionView2.promotion_items;
        }
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (PromotionItem promotionItem6 : list3) {
                PromotionItem promotionItem7 = promotionItem6;
                if (ORZ.LJLJJI(promotionItem7.getType(), S2P.LIZIZ) && promotionItem7.getWaistImg() != null) {
                    arrayList4.add(promotionItem6);
                }
            }
            S36<ConstraintLayout> s36 = this.LJLLL;
            java.util.Map<String, String> eventParamForContentShow = this.LJLJJL;
            s36.getClass();
            o.LJIIIZ(eventParamForContentShow, "eventParamForContentShow");
            PromotionItem promotionItem8 = (PromotionItem) ORZ.LJLLLL(arrayList4);
            if (promotionItem8 != null) {
                s36.LJFF().LJII((SmartImageView) s36.LJIIJ.getValue(), promotionItem8);
            }
            if (!arrayList4.isEmpty()) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    HashMap<String, Object> LJII = C27739Aud.LJII(((PromotionItem) it2.next()).getLog_extra());
                    if (LJII != null) {
                        for (String str2 : S2P.LIZ) {
                            Object obj = LJII.get(str2);
                            if (obj != null) {
                                String str3 = (String) ((LinkedHashMap) eventParamForContentShow).get(str2);
                                if (str3 == null) {
                                    eventParamForContentShow.put(str2, String.valueOf(obj));
                                } else {
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append(str3);
                                    LIZ3.append(',');
                                    LIZ3.append(obj);
                                    eventParamForContentShow.put(str2, X1D.LIZIZ(LIZ3));
                                }
                            }
                        }
                    }
                }
                String LLD = ORZ.LLD(arrayList4, ",", null, null, C69891Rbr.LJLIL, 30);
                int size = arrayList4.size();
                eventParamForContentShow.put("rights_content", LLD);
                eventParamForContentShow.put("rights_cnt", String.valueOf(size));
            }
        }
        this.LJLLI.LIZLLL(new C69876Rbc(popupCardVO.getTitle(), popupCardVO.getPromotionLogos()));
        setAtmosphereTags(popupCardVO.getAtmosphereTags());
        this.LJLLILLLL.LJIIIIZZ(new C71451S2l(popupCardVO.getFormatOriginPrice(), popupCardVO.getFormatAvailablePrice(), popupCardVO.getPrice(), popupCardVO.getPricePrefix(), popupCardVO.getDiscount(), 32));
        View ecommercelive_icon_close = _$_findCachedViewById(R.id.cm9);
        o.LJIIIIZZ(ecommercelive_icon_close, "ecommercelive_icon_close");
        C16880lQ.LJIIJ(new Au2S20S0100000_12((InterfaceC65784Pro) interfaceC65784Pro, 54), ecommercelive_icon_close);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 56, 42, 42), this.LJLLL.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 57, 42, 42), this.LJLLI.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 58, 42, 42), this.LJLL.LIZ);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 59, 42, 42), this);
        S2X<C119774mz> s2x = this.LJLLILLLL;
        TuxTextView tuxTextView2 = s2x.LJII;
        if ((tuxTextView2 != null && tuxTextView2.getVisibility() == 0) || ((tuxTextView = s2x.LJIIIIZZ) != null && tuxTextView.getVisibility() == 0)) {
            s2x.LIZ.addOnLayoutChangeListener(new IDCListenerS258S0100000_12(s2x, 6));
        } else {
            C36746EbW.LIZ(5, "origin price and discount not show");
        }
    }
}
