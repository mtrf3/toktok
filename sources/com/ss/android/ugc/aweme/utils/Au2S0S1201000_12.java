package com.ss.android.ugc.aweme.utils;

import X.C70795RqR;
import X.C70796RqS;
import X.TAT;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS7S1301000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S0S1201000_12 extends TAT {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:93|(1:95)|96|(1:98)|99|(1:101)|102|(1:104)(1:179)|105|(1:107)|108|(1:110)|111|(1:113)(1:178)|114|(3:(1:177)(1:173)|174|(22:176|117|(1:119)|120|(1:122)(1:169)|123|124|125|126|127|(1:163)(1:129)|130|(1:132)(1:160)|133|(1:135)|(1:137)|(1:139)|140|(1:142)|143|(3:145|(4:148|(5:150|151|(1:153)|154|155)(1:157)|156|146)|158)|159))|116|117|(0)|120|(0)(0)|123|124|125|126|127|(13:161|163|130|(0)(0)|133|(0)|(0)|(0)|140|(0)|143|(0)|159)|129|130|(0)(0)|133|(0)|(0)|(0)|140|(0)|143|(0)|159) */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04bc, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04b9, code lost:
    
        r32 = r12;
        r4 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(com.ss.android.ugc.aweme.utils.Au2S0S1201000_12 r32, android.view.View r33) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S0S1201000_12.LIZ$0(com.ss.android.ugc.aweme.utils.Au2S0S1201000_12, android.view.View):void");
    }

    public static final void LIZ$1(Au2S0S1201000_12 au2S0S1201000_12, View view) {
        if (view != null) {
            ReviewFragmentV1 reviewFragmentV1 = (ReviewFragmentV1) au2S0S1201000_12.l1;
            reviewFragmentV1.withState(reviewFragmentV1.Al(), new AqS7S1301000_12((ReviewFilterStruct) au2S0S1201000_12.l2, (ReviewFragmentV1) au2S0S1201000_12.l1, view, au2S0S1201000_12.i3, au2S0S1201000_12.s0, 0));
            ((C70795RqR) ((ReviewFragmentV1) au2S0S1201000_12.l1)._$_findCachedViewById(R.id.j0r)).LIZ((ReviewFilterStruct) au2S0S1201000_12.l2);
        }
    }

    public static final void LIZ$2(Au2S0S1201000_12 au2S0S1201000_12, View view) {
        if (view != null) {
            ReviewFragment reviewFragment = (ReviewFragment) au2S0S1201000_12.l1;
            reviewFragment.withState(reviewFragment.xl(), new AqS7S1301000_12((ReviewFilterStruct) au2S0S1201000_12.l2, (ReviewFragment) au2S0S1201000_12.l1, view, au2S0S1201000_12.i3, au2S0S1201000_12.s0, 1));
            C70796RqS review_filter_view = (C70796RqS) ((ReviewFragment) au2S0S1201000_12.l1)._$_findCachedViewById(R.id.j0q);
            o.LJIIIIZZ(review_filter_view, "review_filter_view");
            C70796RqS.LIZ(review_filter_view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S1201000_12(int i, Object obj, Object obj2, String str, int i2) {
        super(700L);
        this.$t = i2;
        this.i3 = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
