package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.LinkedList;

/* renamed from: X.RqR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70795RqR extends HorizontalScrollView {
    public final LinearLayout LJLIL;
    public boolean LJLILLLLZI;
    public View LJLJI;
    public final LinkedList<LinearLayout> LJLJJI;
    public ReviewFilterStruct LJLJJL;

    public final ReviewFilterStruct getRatingFilterTag() {
        Object tag = this.LJLIL.getChildAt(0).getTag();
        if (tag instanceof ReviewFilterStruct) {
            return (ReviewFilterStruct) tag;
        }
        return null;
    }

    public final ReviewFilterStruct getSelectedFilterTag() {
        Object obj;
        View view = this.LJLJI;
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof ReviewFilterStruct)) {
            return null;
        }
        return (ReviewFilterStruct) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r0.intValue() == 2) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r9) {
        /*
            r8 = this;
            android.widget.LinearLayout r0 = r8.LJLIL
            int r6 = r0.getChildCount()
            r5 = 0
            r4 = 0
        L8:
            if (r4 >= r6) goto L56
            android.widget.LinearLayout r0 = r8.LJLIL
            android.view.View r3 = r0.getChildAt(r4)
            if (r3 == 0) goto L37
            java.lang.Object r7 = r3.getTag()
            boolean r1 = r7 instanceof com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct
            r0 = 0
            if (r1 == 0) goto L54
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r7 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r7
        L1d:
            r2 = 1
            if (r7 == 0) goto L24
            java.lang.Integer r0 = r7.type
            if (r0 != 0) goto L42
        L24:
            java.lang.Object r1 = r3.getTag()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r1 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r1
            if (r1 == 0) goto L34
            java.lang.Integer r0 = r1.type
            if (r0 != 0) goto L3a
        L34:
            LIZJ(r3, r5)
        L37:
            int r4 = r4 + 1
            goto L8
        L3a:
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L34
            goto L49
        L42:
            int r1 = r0.intValue()
            r0 = 4
            if (r1 != r0) goto L24
        L49:
            if (r9 == 0) goto L34
            r8.LIZIZ(r9)
            r8.LJLJI = r3
            LIZJ(r3, r2)
            goto L37
        L54:
            r7 = r0
            goto L1d
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70795RqR.LIZ(com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct):void");
    }

    public final void LIZIZ(ReviewFilterStruct reviewFilterStruct) {
        if (reviewFilterStruct != null) {
            View childAt = this.LJLIL.getChildAt(0);
            childAt.setTag(reviewFilterStruct);
            TextView textView = (TextView) childAt.findViewById(R.id.bo4);
            String str = reviewFilterStruct.nameMapping;
            if (str == null) {
                str = reviewFilterStruct.name;
            }
            textView.setText(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70795RqR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(8388611);
        this.LJLIL = linearLayout;
        this.LJLILLLLZI = true;
        addView(linearLayout);
        this.LJLJJI = new LinkedList<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
    
        if (r0.intValue() == 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.view.View r3, boolean r4) {
        /*
            java.lang.Object r2 = r3.getTag()
            boolean r1 = r2 instanceof com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct
            r0 = 0
            if (r1 == 0) goto L6d
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r2 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r2
        Lb:
            if (r2 == 0) goto L11
            java.lang.Integer r0 = r2.type
            if (r0 != 0) goto L36
        L11:
            java.lang.Object r1 = r3.getTag()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct
            if (r0 == 0) goto L21
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r1 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r1
            if (r1 == 0) goto L21
            java.lang.Integer r0 = r1.type
            if (r0 != 0) goto L2e
        L21:
            r0 = 2131364698(0x7f0a0b5a, float:1.834924E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setSelected(r4)
            return
        L2e:
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L21
            goto L3d
        L36:
            int r1 = r0.intValue()
            r0 = 4
            if (r1 != r0) goto L11
        L3d:
            r0 = 2131364696(0x7f0a0b58, float:1.8349236E38)
            android.view.View r2 = r3.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r2 = (com.bytedance.tux.icon.TuxIconView) r2
            r2.setSelected(r4)
            r1 = 2130968766(0x7f0400be, float:1.7546195E38)
            if (r4 == 0) goto L69
            r0 = 2130968757(0x7f0400b5, float:1.7546177E38)
        L51:
            r2.setTintColorRes(r0)
            r0 = 2131364697(0x7f0a0b59, float:1.8349238E38)
            android.view.View r0 = r3.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            r0.setSelected(r4)
            if (r4 == 0) goto L65
            r1 = 2130968757(0x7f0400b5, float:1.7546177E38)
        L65:
            r0.setTintColorRes(r1)
            goto L21
        L69:
            r0 = 2130968766(0x7f0400be, float:1.7546195E38)
            goto L51
        L6d:
            r2 = r0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70795RqR.LIZJ(android.view.View, boolean):void");
    }
}
