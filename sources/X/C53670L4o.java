package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.L4o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53670L4o extends AbstractC53666L4k<TuxTextView> {
    @Override // X.AbstractC53666L4k
    public final View LIZIZ(Context context, View view) {
        if (!(view instanceof TuxTextView) || view == null) {
            return new TuxTextView(context, null, 6, 0);
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r5.setText(r0);
        r2 = X.C78929UyL.LJ(r11);
        r5.setTuxFont(r4.LIZLLL.invoke(r2).intValue());
        r0 = r4.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r1 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r5.setTextColorRes(r1);
        r1 = r5.getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "context");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        r3 = r1.getDrawable(r4.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r0 == null) goto L19;
     */
    @Override // X.L52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r8, android.content.Context r9, X.C71799SFv r10, X.L69 r11, X.L4W r12) {
        /*
            r7 = this;
            java.lang.String r0 = "avatarView"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            X.L4P r0 = r12.LIZJ
            X.KyY r1 = r0.LIZ()
            boolean r0 = r1 instanceof X.C53461KyX
            r3 = 0
            if (r0 == 0) goto Le1
            X.KyX r1 = (X.C53461KyX) r1
            if (r1 == 0) goto Le1
            X.L50 r4 = r1.LIZIZ
        L1b:
            boolean r0 = r4 instanceof X.C53514KzO
            if (r0 == 0) goto L23
            X.KzO r4 = (X.C53514KzO) r4
            if (r4 != 0) goto L24
        L23:
            return
        L24:
            boolean r0 = r8 instanceof com.bytedance.tux.input.TuxTextView
            if (r0 != 0) goto L29
            goto L23
        L29:
            r5 = r8
            com.bytedance.tux.input.TuxTextView r5 = (com.bytedance.tux.input.TuxTextView) r5
            r0 = 17
            r5.setGravity(r0)
            android.content.Context r2 = r5.getContext()
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r6)
            java.lang.String r0 = r4.LIZ
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            r1 = -1
            if (r0 == 0) goto L75
            java.lang.String r0 = r4.LIZ
            if (r0 != 0) goto L49
        L47:
            java.lang.String r0 = ""
        L49:
            r5.setText(r0)
            X.KyJ r2 = X.C78929UyL.LJ(r11)
            X.Yns<X.KyJ, java.lang.Integer> r0 = r4.LIZLLL
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.setTuxFont(r0)
            java.lang.Integer r0 = r4.LJ
            if (r0 == 0) goto L67
            int r1 = r0.intValue()
        L67:
            r5.setTextColorRes(r1)
            android.content.Context r1 = r5.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r6)
            int r0 = r4.LIZJ
            goto L86
        L75:
            java.lang.Integer r0 = r4.LIZIZ
            if (r0 == 0) goto L84
            int r0 = r0.intValue()
        L7d:
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L49
            goto L47
        L84:
            r0 = -1
            goto L7d
        L86:
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: java.lang.Exception -> L8a
        L8a:
            r5.setBackground(r3)
            X.Yns<X.KyJ, java.lang.Integer> r0 = r4.LJFF
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            X.Yns<X.KyJ, java.lang.Integer> r0 = r4.LJI
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            boolean r0 = X.C26338AVi.LIZLLL(r11)
            if (r0 == 0) goto Ld5
            int r1 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r2, r1, r3, r0)
        Lb6:
            android.text.TextUtils$TruncateAt r0 = r4.LJIIIZ
            r5.setEllipsize(r0)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            if (r1 == 0) goto Le4
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            X.KyR r0 = r4.LJIIL
            X.AbstractC53666L4k.LIZLLL(r1, r11, r0)
            X.KzP r0 = r4.LJIIJ
            int r0 = r0.LIZIZ()
            r1.gravity = r0
            r8.setLayoutParams(r1)
            goto L23
        Ld5:
            int r1 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r3, r1, r2, r0)
            goto Lb6
        Le1:
            r4 = r3
            goto L1b
        Le4:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53670L4o.LIZ(android.view.View, android.content.Context, X.SFv, X.L69, X.L4W):void");
    }
}
