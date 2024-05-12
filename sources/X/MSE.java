package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class MSE extends RecyclerView.ViewHolder {
    public C191537fR LJLIL;
    public final /* synthetic */ MK7 LJLILLLLZI;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            r12 = this;
            android.view.View r5 = r12.itemView
            java.lang.String r7 = "null cannot be cast to non-null type com.bytedance.tux.table.footer.TuxStatusFooter"
            kotlin.jvm.internal.o.LJII(r5, r7)
            X.MSD r5 = (X.MSD) r5
            X.MK7 r0 = r12.LJLILLLLZI
            X.MK8 r0 = r0.mmLoadMoreState
            java.lang.CharSequence r0 = r0.LIZIZ
            r5.setEmptyText(r0)
            X.MK7 r0 = r12.LJLILLLLZI
            X.MK8 r0 = r0.mmLoadMoreState
            java.lang.CharSequence r0 = r0.LJ
            r5.setErrorText(r0)
            X.MK7 r0 = r12.LJLILLLLZI
            X.MK8 r0 = r0.mmLoadMoreState
            java.lang.Integer r0 = r0.LIZJ
            if (r0 == 0) goto L2a
            int r0 = r0.intValue()
            r5.setEmptyTextColor(r0)
        L2a:
            X.MK7 r0 = r12.LJLILLLLZI
            X.MK8 r0 = r0.mmLoadMoreState
            java.lang.Integer r0 = r0.LJFF
            if (r0 == 0) goto L39
            int r0 = r0.intValue()
            r5.setErrorTextColor(r0)
        L39:
            X.MK7 r0 = r12.LJLILLLLZI
            X.MK8 r0 = r0.mmLoadMoreState
            android.text.method.MovementMethod r0 = r0.LIZLLL
            if (r0 == 0) goto L44
            r5.setEmptyMovementMethod(r0)
        L44:
            X.MK7 r6 = r12.LJLILLLLZI
            X.MK8 r0 = r6.mmLoadMoreState
            int r2 = r0.LIZ
            r1 = -1
            r0 = 4
            r4 = 1
            if (r2 == r1) goto L9d
            r3 = 0
            if (r2 == 0) goto L93
            if (r2 == r4) goto L8c
            r0 = 2
            if (r2 == r0) goto L58
        L57:
            return
        L58:
            androidx.recyclerview.widget.RecyclerView r2 = r6.mmRecyclerView
            android.view.View r6 = r12.itemView
            kotlin.jvm.internal.o.LJII(r6, r7)
            X.MSD r6 = (X.MSD) r6
            r6.LJ()
            java.lang.CharSequence r7 = r6.LJLJI
            android.text.method.MovementMethod r8 = r6.LJLJLLL
            android.view.View$OnClickListener r9 = r6.LJLLI
            int r10 = r6.LJLJL
            int r11 = r6.LJLJJLL
            r6.LIZLLL(r7, r8, r9, r10, r11)
            X.7fR r0 = r12.LJLIL
            if (r0 == 0) goto L7b
            r0.LJLJI = r4
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L88
        L7b:
            X.MK7 r0 = r12.LJLILLLLZI
            X.7fR r1 = new X.7fR
            X.7fS r0 = r0.mmLoadMoreListener
            r1.<init>(r2, r0)
            r1.LJLJI = r4
            r12.LJLIL = r1
        L88:
            r5.setVisibility(r3)
            goto L57
        L8c:
            r5.LIZJ(r3)
            r5.setVisibility(r3)
            goto L57
        L93:
            r5.setVisibility(r0)
            r5.LIZIZ()
            r5.setVisibility(r3)
            goto L57
        L9d:
            r5.LIZJ(r4)
            r5.setVisibility(r0)
            X.MK7 r0 = r12.LJLILLLLZI
            X.7fS r0 = r0.mmLoadMoreListener
            if (r0 == 0) goto L57
            r0.LJIIJJI()
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MSE.L():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MSE(X.MK7 r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r4.LJLILLLLZI = r5
            X.MSD r2 = new X.MSD
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r4.<init>(r2)
            android.view.View r3 = r4.itemView
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.tux.table.footer.TuxStatusFooter"
            kotlin.jvm.internal.o.LJII(r3, r0)
            X.MSD r3 = (X.MSD) r3
            androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r1 = -1
            r0 = -2
            r2.<init>(r1, r0)
            r3.setLayoutParams(r2)
            android.content.Context r1 = r3.getContext()
            r0 = 2131832324(0x7f112e04, float:1.9297699E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setEmptyText(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131842963(0x7f115793, float:1.9319277E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setErrorText(r0)
            Y.ACListenerS44S0200000_9 r1 = new Y.ACListenerS44S0200000_9
            r0 = 24
            r1.<init>(r4, r5, r0)
            r3.setErrorOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MSE.<init>(X.MK7, android.view.ViewGroup):void");
    }
}
