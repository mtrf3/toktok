package X;

import Y.IDObjectS0S0101000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.99b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2321199b extends LinearLayout {
    public InterfaceC88472Yns<? super Aweme, C76800UCe> LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final java.util.Map<View, Boolean> LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2321199b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void setAllLoadCompleteListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = listener;
    }

    public final void setOnItemClickListener(InterfaceC88472Yns<? super Aweme, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        if (childAt == null || (measuredWidth = childAt.getMeasuredWidth()) == childAt.getLayoutParams().height) {
            return;
        }
        Iterator<View> it = C78924UyG.LIZLLL(this).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                View view = (View) iDObjectS0S0101000.next();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = measuredWidth;
                    view.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                super.onMeasure(i, i2);
                return;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2321199b(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            r0 = r9 & 2
            if (r0 == 0) goto L5
            r8 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r7, r0)
            r5 = 0
            r6.<init>(r7, r8, r5)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r6.LJLJI = r0
            r4 = 0
        L16:
            com.bytedance.lighten.loader.SmartImageView r3 = new com.bytedance.lighten.loader.SmartImageView
            r3.<init>(r7)
            X.4Vt r1 = new X.4Vt
            r1.<init>()
            r0 = 2130968604(0x7f04001c, float:1.7545866E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZIZ = r0
            android.graphics.drawable.Drawable r0 = r1.LIZ(r7)
            r3.setBackground(r0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r0 = 112(0x70, float:1.57E-43)
            int r1 = X.C7MY.LIZIZ(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r5, r1, r0)
            r6.addView(r3, r2)
            int r4 = r4 + 1
            r0 = 3
            if (r4 >= r0) goto L46
            goto L16
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2321199b.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
