package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C26695Adn;
import X.C26696Ado;
import X.C26699Adr;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS79S0400000_12 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS79S0400000_12 aqS79S0400000_12, Object obj, Object obj2) {
        ReviewFilterStruct reviewFilterStruct;
        int intValue = ((Number) obj).intValue();
        ProductReviewViewModel Hl = ((ProductReviewFragment) aqS79S0400000_12.l0).Hl();
        C26696Ado c26696Ado = (C26696Ado) aqS79S0400000_12.l1;
        if (intValue < 0) {
            reviewFilterStruct = null;
        } else {
            reviewFilterStruct = (ReviewFilterStruct) ListProtector.get((List) aqS79S0400000_12.l2, intValue);
        }
        ProductReviewViewModel.Uv0(Hl, c26696Ado, intValue, reviewFilterStruct, null, null, 24);
        C26699Adr c26699Adr = (C26699Adr) aqS79S0400000_12.l3;
        c26699Adr.getClass();
        int childCount = c26699Adr.LJLIL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c26699Adr.LJLIL.getChildAt(i);
            o.LJII(childAt, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.view.ReviewFilterItemView");
            ((C26695Adn) childAt).LIZIZ(true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS79S0400000_12 aqS79S0400000_12, Object obj, Object obj2) {
        int i;
        ReviewFilterStruct reviewFilterStruct;
        int intValue = ((Number) obj).intValue();
        ProductReviewViewModel Hl = ((ProductReviewFragment) aqS79S0400000_12.l0).Hl();
        C26699Adr c26699Adr = (C26699Adr) aqS79S0400000_12.l1;
        if (intValue > -1) {
            i = intValue + 1;
            reviewFilterStruct = (ReviewFilterStruct) ListProtector.get((List) aqS79S0400000_12.l2, intValue);
        } else {
            i = intValue;
            reviewFilterStruct = null;
        }
        ProductReviewViewModel.Uv0(Hl, c26699Adr, i, reviewFilterStruct, null, null, 24);
        C26696Ado c26696Ado = (C26696Ado) aqS79S0400000_12.l3;
        c26696Ado.getClass();
        int childCount = c26696Ado.LJLIL.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c26696Ado.LJLIL.getChildAt(i2);
            o.LJII(childAt, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.view.ReviewFilterItemView");
            ((C26695Adn) childAt).LIZIZ(false);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS79S0400000_12(com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment r3, X.C26696Ado r4, X.C26699Adr r5, java.util.List r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r6
            r1.l3 = r4
            r0 = 2
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r5
            r0 = 2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS79S0400000_12.<init>(com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment, X.Ado, X.Adr, java.util.List, int):void");
    }
}
