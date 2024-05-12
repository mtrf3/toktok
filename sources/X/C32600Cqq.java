package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Cqq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32600Cqq extends AbstractC32678Cs6 {
    public final String LLFII;
    public boolean LLFZ;
    public final C32334CmY LLI;
    public final C29701Eo LLIFFJFJJ;
    public final C47061t0 LLII;
    public final C47121t6 LLIIII;

    @Override // X.AbstractC32678Cs6
    public final String Q() {
        return this.LLFII;
    }

    public C32600Cqq(View view) {
        super(view);
        this.LLFII = "LiveGiftFirstRechargeViewHolderV2";
        this.LLFZ = true;
        this.LLI = (C32334CmY) this.itemView.findViewById(R.id.l7t);
        C47121t6 c47121t6 = (C47121t6) this.itemView.findViewById(R.id.lft);
        this.LLIIII = c47121t6;
        this.LLIFFJFJJ = (C29701Eo) this.itemView.findViewById(R.id.dan);
        this.LLII = (C47061t0) this.itemView.findViewById(R.id.ejf);
        if (c47121t6 != null) {
            c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        }
        this.itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC32601Cqr(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r2 != null) goto L10;
     */
    @Override // X.AbstractC32678Cs6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(X.AbstractC32698CsQ<? extends X.C30896CAq> r6, com.bytedance.ies.sdk.datachannel.DataChannel r7, int r8) {
        /*
            r5 = this;
            super.N(r6, r7, r8)
            java.lang.String r1 = r5.LLFII
            java.lang.String r0 = "bindView portrait"
            X.C0NB.LIZIZ(r1, r0)
            X.CsQ<? extends X.CAq> r2 = r5.LJZ
            r4 = 0
            if (r2 == 0) goto L20
            boolean r1 = r2.LIZJ
            r0 = 1
            if (r1 != r0) goto L1e
            X.CjE r1 = X.C32129CjF.LIZ
            boolean r0 = r1.LJI
            if (r0 == 0) goto L1c
            r1.LJI = r4
        L1c:
            if (r2 == 0) goto L20
        L1e:
            boolean r4 = r2.LIZJ
        L20:
            X.1Eo r3 = r5.LLIFFJFJJ
            X.1t0 r2 = r5.LJLJJLL
            X.1t0 r1 = r5.LJLJLJ
            X.1t0 r0 = r5.LLII
            X.C32457CoX.LJFF(r4, r3, r2, r1, r0)
            X.CmY r0 = r5.LLI
            X.C32457CoX.LIZLLL(r4, r0)
            X.1t6 r0 = r5.LLIIII
            X.C32457CoX.LJIIIIZZ(r4, r0)
            X.1t6 r0 = r5.LJLJJI
            X.C32457CoX.LJI(r4, r0)
            android.widget.ImageView r1 = r5.LJLL
            X.1t6 r0 = r5.LJLJLLL
            X.C32457CoX.LJ(r1, r0)
            X.1t6 r0 = r5.LJLLLL
            X.C32457CoX.LJII(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32600Cqq.N(X.CsQ, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }
}
