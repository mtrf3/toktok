package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1QP;
import X.C70414RkI;
import X.C70691Rol;
import X.C70795RqR;
import X.C76800UCe;
import X.InterfaceC88473Ynt;
import X.MKQ;
import X.S22;
import X.S29;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.review.Option;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class IDqS186S0200000_12 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS186S0200000_12(S22 s22, S22<ViewGroup> s222, PromotionItem promotionItem) {
        super(3);
        this.$t = promotionItem;
        this.l0 = s22;
        this.l1 = s222;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS186S0200000_12(S29 s29, S29<T> s292, PromotionItem promotionItem) {
        super(3);
        this.$t = promotionItem;
        this.l0 = s29;
        this.l1 = s292;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS186S0200000_12(PdpViewModel pdpViewModel, FlashSale flashSale, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = flashSale;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS186S0200000_12(PdpBodyWidget pdpBodyWidget, MKQ mkq, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpBodyWidget;
        this.l1 = mkq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS186S0200000_12(ReviewFragment reviewFragment, Option option, int i) {
        super(3);
        this.$t = i;
        this.l0 = reviewFragment;
        this.l1 = option;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS186S0200000_12(ReviewFragmentV1 reviewFragmentV1, ReviewFilterStruct reviewFilterStruct, int i) {
        super(3);
        this.$t = i;
        this.l0 = reviewFragmentV1;
        this.l1 = reviewFilterStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS186S0200000_12(List list, List<ReviewFilterStruct> list2, ReviewFragmentV1 reviewFragmentV1) {
        super(3);
        this.$t = reviewFragmentV1;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS186S0200000_12(C1QP c1qp, MentionFavoriteVideoVM mentionFavoriteVideoVM, int i, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = c1qp;
        this.l1 = mentionFavoriteVideoVM;
    }

    public static final Object invoke$0(IDqS186S0200000_12 iDqS186S0200000_12, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        long longValue = ((Number) obj3).longValue();
        C70414RkI c70414RkI = ((PdpViewModel) iDqS186S0200000_12.l0).LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJIILJJIL = Long.valueOf(longValue);
        }
        if (intValue2 != intValue) {
            ProductPackStruct productPackStruct = null;
            if (intValue != 2) {
                if (intValue == 3) {
                    C70414RkI c70414RkI2 = ((PdpViewModel) iDqS186S0200000_12.l0).LLFII;
                    if (c70414RkI2 != null) {
                        c70414RkI2.LJIILIIL = 3;
                    }
                    PdpViewModel pdpViewModel = (PdpViewModel) iDqS186S0200000_12.l0;
                    ProductPackStruct productPackStruct2 = pdpViewModel.LJLJLLL;
                    if (productPackStruct2 != null) {
                        productPackStruct = ProductPackStruct.LIZ(productPackStruct2, null, null, FlashSale.LIZ((FlashSale) iDqS186S0200000_12.l1, 3, 16381), null, null, null, null, null, -4194305, -1);
                    }
                    pdpViewModel.LJLJLLL = productPackStruct;
                    PdpViewModel pdpViewModel2 = (PdpViewModel) iDqS186S0200000_12.l0;
                    C70414RkI c70414RkI3 = pdpViewModel2.LLFII;
                    if (c70414RkI3 != null) {
                        c70414RkI3.LJJLIL(pdpViewModel2.LJLJLLL);
                    }
                    PdpViewModel pdpViewModel3 = (PdpViewModel) iDqS186S0200000_12.l0;
                    ((PdpViewModel) iDqS186S0200000_12.l0).setState(new AqS33S0100100_12(PdpViewModel.Uv0(pdpViewModel3, pdpViewModel3.LJLJLLL, false, 30), (List<? extends Object>) longValue, 1));
                }
            } else {
                PdpViewModel pdpViewModel4 = (PdpViewModel) iDqS186S0200000_12.l0;
                ProductPackStruct productPackStruct3 = pdpViewModel4.LJLJLLL;
                if (productPackStruct3 != null) {
                    productPackStruct = ProductPackStruct.LIZ(productPackStruct3, null, null, FlashSale.LIZ((FlashSale) iDqS186S0200000_12.l1, 2, 15357), null, null, null, null, null, -4194305, -1);
                }
                pdpViewModel4.LJLJLLL = productPackStruct;
                PdpViewModel pdpViewModel5 = (PdpViewModel) iDqS186S0200000_12.l0;
                C70414RkI c70414RkI4 = pdpViewModel5.LLFII;
                if (c70414RkI4 != null) {
                    c70414RkI4.LJJLIL(pdpViewModel5.LJLJLLL);
                }
                PdpViewModel pdpViewModel6 = (PdpViewModel) iDqS186S0200000_12.l0;
                ((PdpViewModel) iDqS186S0200000_12.l0).setState(new AqS33S0100100_12(PdpViewModel.Uv0(pdpViewModel6, pdpViewModel6.LJLJLLL, true, 28), (List<? extends Object>) longValue, 0));
                C70414RkI c70414RkI5 = ((PdpViewModel) iDqS186S0200000_12.l0).LLFII;
                if (c70414RkI5 != null) {
                    c70414RkI5.LJIILIIL = 2;
                }
            }
            PdpViewModel.bx0((PdpViewModel) iDqS186S0200000_12.l0, false, true, null, null, 28);
        }
        ((PdpViewModel) iDqS186S0200000_12.l0).setState(new AqS19S0000100_12(longValue, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS186S0200000_12 iDqS186S0200000_12, Object selectSubscribe, Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((PdpBodyWidget) iDqS186S0200000_12.l0).trackImpression((MKQ) iDqS186S0200000_12.l1);
        ((PdpBodyWidget) iDqS186S0200000_12.l0).translatePromotionBanner(floatValue, intValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS186S0200000_12 iDqS186S0200000_12, Object obj, Object obj2, Object obj3) {
        String str;
        String quitType = (String) obj2;
        long longValue = ((Number) obj3).longValue();
        o.LJIIIZ(quitType, "quitType");
        if (((ReviewFragmentV1) iDqS186S0200000_12.l0).Al().LJLLILLLL != null) {
            ReviewFragmentV1 reviewFragmentV1 = (ReviewFragmentV1) iDqS186S0200000_12.l0;
            ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) iDqS186S0200000_12.l1;
            if (reviewFilterStruct != null) {
                str = reviewFilterStruct.nameEng;
            } else {
                str = null;
            }
            C70691Rol.LJII(reviewFragmentV1, "select_star", quitType, longValue, str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS186S0200000_12 iDqS186S0200000_12, Object obj, Object obj2, Object obj3) {
        String str;
        String quitType = (String) obj2;
        long longValue = ((Number) obj3).longValue();
        o.LJIIIZ(quitType, "quitType");
        if (((ReviewFragment) iDqS186S0200000_12.l0).xl().LJLLILLLL != null) {
            ReviewFragment reviewFragment = (ReviewFragment) iDqS186S0200000_12.l0;
            Option option = (Option) iDqS186S0200000_12.l1;
            if (option != null) {
                str = option.valueForEvent;
            } else {
                str = null;
            }
            C70691Rol.LJII(reviewFragment, "select_star", quitType, longValue, str);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(IDqS186S0200000_12 iDqS186S0200000_12, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        OptionV1 option = (OptionV1) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(view, "view");
        o.LJIIIZ(option, "option");
        if (!option.isSelected) {
            List list = (List) iDqS186S0200000_12.l0;
            ReviewFilterStruct reviewFilterStruct = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (o.LJ(((ReviewFilterStruct) next).filterId, option.filter.filterId)) {
                        reviewFilterStruct = next;
                        break;
                    }
                }
                reviewFilterStruct = reviewFilterStruct;
            }
            ((C70795RqR) ((ReviewFragmentV1) iDqS186S0200000_12.l1)._$_findCachedViewById(R.id.j0r)).LIZ(reviewFilterStruct);
            ProductReviewViewModel.Uv0(((ReviewFragmentV1) iDqS186S0200000_12.l1).Al(), view, intValue + 1, reviewFilterStruct, null, "rate_review", 8);
            ((C70795RqR) ((ReviewFragmentV1) iDqS186S0200000_12.l1)._$_findCachedViewById(R.id.j0r)).LIZIZ(option.filter);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r6 == X.C24500xi.LIZIZ) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.IDqS186S0200000_12 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r7 = r10
            r3 = r9
            X.V6O r3 = (X.V6O) r3
            X.0xk r7 = (X.InterfaceC24520xk) r7
            java.lang.Number r11 = (java.lang.Number) r11
            int r2 = r11.intValue()
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r0 = r2 & 14
            if (r0 != 0) goto L1d
            boolean r0 = r7.LJIJJ(r3)
            if (r0 == 0) goto L67
            r0 = 4
        L1c:
            r2 = r2 | r0
        L1d:
            r1 = r2 & 91
            r0 = 18
            if (r1 != r0) goto L29
            boolean r0 = r7.LIZ()
            if (r0 != 0) goto L63
        L29:
            java.lang.Object r4 = r8.l0
            X.1QP r4 = (X.C1QP) r4
            r5 = 0
            java.lang.Object r1 = r8.l1
            com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM r1 = (com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM) r1
            r0 = 1157296644(0x44faf204, float:2007.563)
            r7.LJJIIJ(r0)
            boolean r0 = r7.LJIJJ(r1)
            java.lang.Object r6 = r7.LJIILL()
            if (r0 != 0) goto L4b
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r6 != r0) goto L55
        L4b:
            kotlin.jvm.internal.AqS162S0100000_12 r6 = new kotlin.jvm.internal.AqS162S0100000_12
            r0 = 1239(0x4d7, float:1.736E-42)
            r6.<init>(r1, r0)
            r7.LJJIII(r6)
        L55:
            r7.LJJIJIIJIL()
            X.Pro r6 = (X.InterfaceC65784Pro) r6
            r8 = r2 & 14
            r9 = 4
            X.C79162V5a.LIZIZ(r3, r4, r5, r6, r7, r8, r9)
        L60:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L63:
            r7.LIZLLL()
            goto L60
        L67:
            r0 = 2
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS186S0200000_12.invoke$5(kotlin.jvm.internal.IDqS186S0200000_12, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(IDqS186S0200000_12 iDqS186S0200000_12, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((S22) iDqS186S0200000_12.l0).LIZLLL(intValue, (PromotionItem) iDqS186S0200000_12.l1, ((Number) obj3).longValue(), false);
        S22 s22 = (S22) iDqS186S0200000_12.l0;
        if (!s22.LJII) {
            boolean z = true;
            s22.LJII = true;
            if (((ViewGroup) s22.LIZ).getChildCount() <= 0) {
                z = false;
            }
            s22.LIZJ(z);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS186S0200000_12 iDqS186S0200000_12, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long longValue = ((Number) obj3).longValue();
        S29 s29 = (S29) iDqS186S0200000_12.l0;
        if (!s29.LJI) {
            s29.LJIIL(intValue, (PromotionItem) iDqS186S0200000_12.l1, longValue);
            S29 s292 = (S29) iDqS186S0200000_12.l0;
            s292.LIZJ(s292.LJ);
        }
        return C76800UCe.LIZ;
    }
}
