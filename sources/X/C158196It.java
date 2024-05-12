package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.6It, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158196It extends LinearLayout {
    public final View LJLIL;
    public final TuxTextView LJLILLLLZI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C158196It(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void setTitle(CharSequence charSequence) {
        this.LJLILLLLZI.setMovementMethod(new LinkMovementMethod());
        if (charSequence != null && charSequence.length() > 0) {
            this.LJLILLLLZI.setText(charSequence);
            this.LJLILLLLZI.setVisibility(0);
        } else {
            this.LJLILLLLZI.setVisibility(8);
        }
    }

    public final void setTitleAllCap(boolean z) {
        this.LJLILLLLZI.setAllCaps(z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C158196It(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r2 = r18
            r5 = 2
            r0 = r19 & 2
            r12 = 0
            if (r0 == 0) goto L9
            r2 = r12
        L9:
            java.lang.String r0 = "context"
            r3 = r17
            defpackage.a1.LJFF(r3, r0)
            r4 = 0
            r10 = r16
            r10.<init>(r3, r2, r4)
            r1 = 1
            r10.setOrientation(r1)
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r15 = 26
            r14 = r12
            X.C26338AVi.LJIIIZ(r10, r11, r12, r13, r14, r15)
            android.view.View r6 = new android.view.View
            r6.<init>(r3)
            r10.LJLIL = r6
            com.bytedance.tux.input.TuxTextView r8 = new com.bytedance.tux.input.TuxTextView
            r0 = 6
            r8.<init>(r3, r12, r0, r4)
            r10.LJLILLLLZI = r8
            r0 = 2130968606(0x7f04001e, float:1.754587E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r3)
            if (r0 == 0) goto L55
            int r0 = r0.intValue()
            r10.setBackgroundColor(r0)
        L55:
            r0 = 4
            int r9 = X.C7MY.LIZIZ(r0)
            r0 = 2130968653(0x7f04004d, float:1.7545966E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r3)
            if (r0 == 0) goto L6a
            int r0 = r0.intValue()
            r6.setBackgroundColor(r0)
        L6a:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r0 = -1
            r7.<init>(r0, r1)
            r7.topMargin = r9
            r7.bottomMargin = r9
            r10.addView(r6, r7)
            r0 = 2130968764(0x7f0400bc, float:1.754619E38)
            r8.setTextColorRes(r0)
            r0 = 62
            r8.setTuxFont(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r0 = -2
            r7.<init>(r0, r0)
            r0 = 18
            int r0 = X.C7MY.LIZIZ(r0)
            r7.topMargin = r0
            r7.bottomMargin = r9
            r10.addView(r8, r7)
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x00c2: FILL_ARRAY_DATA , data: [2130969868, 2130971271, 2130971596} // fill-array
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r2, r0)
            java.lang.String r0 = "context.obtainStyledAttr…styleable.SettingDivider)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.String r2 = X.C16880lQ.LLLZLZ(r3, r4)
            boolean r1 = r3.getBoolean(r1, r1)
            boolean r0 = r3.getBoolean(r5, r4)
            r3.recycle()
            if (r1 == 0) goto Lbf
        Lb5:
            r6.setVisibility(r4)
            r10.setTitle(r2)
            r10.setTitleAllCap(r0)
            return
        Lbf:
            r4 = 8
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158196It.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
