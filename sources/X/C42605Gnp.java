package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gnp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42605Gnp extends C43976HNs {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @Override // X.C43976HNs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(android.view.ViewGroup r6) {
        /*
            r5 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 1115684864(0x42800000, float:64.0)
            float r0 = X.C74275TDb.LIZIZ(r1, r0)
            int r4 = (int) r0
            boolean r0 = X.HOC.LIZJ()
            if (r0 == 0) goto L74
            double r2 = (double) r4
            r0 = 4608683618675807573(0x3ff5555555555555, double:1.3333333333333333)
        L21:
            double r2 = r2 / r0
            int r0 = (int) r2
        L23:
            r5.P(r0, r4, r6)
            boolean r0 = X.HOC.LIZJ()
            r3 = 2131099681(0x7f060021, float:1.7811722E38)
            if (r0 == 0) goto L44
            com.bytedance.tux.input.TuxTextView r1 = r5.LJLJJLL
            r0 = 71
            r1.setTuxFont(r0)
            com.bytedance.tux.input.TuxTextView r1 = r5.LJLJJLL
            android.content.Context r0 = r6.getContext()
            int r0 = X.C04330Ez.LIZIZ(r0, r3)
            r1.setTextColor(r0)
        L43:
            return
        L44:
            boolean r0 = X.HOC.LIZLLL()
            if (r0 == 0) goto L43
            com.bytedance.tux.input.TuxTextView r0 = r5.LJLJJLL
            r2 = 81
            r0.setTuxFont(r2)
            com.bytedance.tux.input.TuxTextView r1 = r5.LJLJJLL
            android.content.Context r0 = r6.getContext()
            int r0 = X.C04330Ez.LIZIZ(r0, r3)
            r1.setTextColor(r0)
            com.bytedance.tux.input.TuxTextView r1 = r5.LJLJJLL
            r0 = 0
            r1.setPadding(r0, r0, r0, r0)
            com.bytedance.tux.input.TuxTextView r0 = r5.LJLJJLL
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            kotlin.jvm.internal.o.LJII(r1, r0)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.gravity = r2
            goto L43
        L74:
            boolean r0 = X.HOC.LIZLLL()
            if (r0 == 0) goto L81
            double r2 = (double) r4
            r0 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            goto L21
        L81:
            r0 = r4
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42605Gnp.N(android.view.ViewGroup):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42605Gnp(C41259GHf c41259GHf, ViewGroup parent) {
        super(c41259GHf, parent, null);
        o.LJIIIZ(parent, "parent");
    }

    @Override // X.C43976HNs
    public final void M(MyMediaModel mediaModel, C43976HNs holder) {
        o.LJIIIZ(mediaModel, "mediaModel");
        o.LJIIIZ(holder, "holder");
        if (HOC.LIZIZ()) {
            View view = this.itemView;
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.d4);
            c110614Vt.LIZJ = C61328O5c.LIZJ(2);
            C71313Ryn.LIZIZ(this.itemView, "itemView.context", c110614Vt, view);
        }
        super.M(mediaModel, holder);
    }
}
