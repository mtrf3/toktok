package X;

import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CsI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32690CsI extends AbstractC32677Cs5 {
    public final String LJZI;
    public boolean LJZL;
    public final C32334CmY LL;
    public final C29701Eo LLD;
    public final C47061t0 LLF;
    public final C47121t6 LLFF;
    public final C47061t0 LLFFF;
    public final C47121t6 LLFII;
    public final ImageView LLFZ;

    public final void h0() {
        boolean z;
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJLJ;
        if (abstractC32698CsQ != null) {
            z = abstractC32698CsQ.LIZJ;
        } else {
            z = false;
        }
        C32457CoX.LJFF(z, this.LLD, this.LJLJJL, this.LLFFF, this.LLF);
        C32457CoX.LIZLLL(z, this.LL);
        C32457CoX.LJIIIIZZ(z, this.LLFF);
        C32457CoX.LJI(z, this.LJLJJI);
        C32457CoX.LJ(this.LLFZ, this.LLFII);
        C32457CoX.LJII(this.LJLLJ);
    }

    @Override // X.AbstractC32677Cs5
    public final void U() {
        super.U();
        C0NB.LIZIZ(this.LJZI, "onSelected landscape");
        h0();
    }

    @Override // X.AbstractC32677Cs5
    public final void X() {
        super.X();
        C0NB.LIZIZ(this.LJZI, "onUnSelected landscape");
        h0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32690CsI(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJZI = "LiveGiftRechargeViewHolder";
        this.LJZL = true;
        this.LLFFF = (C47061t0) this.LJLIL.findViewById(R.id.dsp);
        C47121t6 c47121t6 = (C47121t6) this.LJLIL.findViewById(R.id.gzf);
        this.LLFII = c47121t6;
        this.LLFZ = (ImageView) this.LJLIL.findViewById(R.id.bgf);
        this.LL = (C32334CmY) itemView.findViewById(R.id.l7t);
        C47121t6 c47121t62 = (C47121t6) itemView.findViewById(R.id.lft);
        this.LLFF = c47121t62;
        this.LLD = (C29701Eo) itemView.findViewById(R.id.dan);
        this.LLF = (C47061t0) itemView.findViewById(R.id.ejf);
        if (c47121t62 != null) {
            c47121t62.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        }
        if (c47121t6 != null) {
            c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        }
        itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC32707CsZ(this, itemView));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    @Override // X.AbstractC32677Cs5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(X.AbstractC32698CsQ<?> r10, com.bytedance.ies.sdk.datachannel.DataChannel r11, int r12) {
        /*
            r9 = this;
            super.L(r10, r11, r12)
            X.CsQ<?> r2 = r9.LJLJLJ
            r3 = 0
            if (r2 == 0) goto L17
            com.bytedance.android.live.base.model.ImageModel r0 = r2.LJ
            if (r0 == 0) goto L19
        Lc:
            java.lang.String r1 = r9.LJZI
            java.lang.String r0 = "bindView landscape"
            X.C0NB.LIZIZ(r1, r0)
            r9.h0()
            return
        L17:
            r1 = r3
            goto L1d
        L19:
            if (r2 == 0) goto L17
            T extends X.CAq r1 = r2.LIZIZ
        L1d:
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.Gift
            if (r0 == 0) goto L49
            com.bytedance.android.livesdk.model.Gift r1 = (com.bytedance.android.livesdk.model.Gift) r1
            if (r1 == 0) goto L4a
            com.bytedance.android.live.base.model.ImageModel r6 = r1.previewImage
        L27:
            if (r2 == 0) goto L4c
            boolean r0 = r2.LJI()
            r8 = 1
            if (r0 != r8) goto L4c
            if (r6 == 0) goto Lc
            if (r1 == 0) goto L46
            long r0 = r1.id
        L36:
            X.1t0 r5 = r9.LLFFF
            r2 = -1
            r4 = 2131235448(0x7f081278, float:1.808709E38)
            X.Csk r7 = new X.Csk
            r7.<init>(r0, r9)
            r3 = r2
            X.C15640jQ.LIZJ(r2, r3, r4, r5, r6, r7, r8)
            goto Lc
        L46:
            r0 = 0
            goto L36
        L49:
            r1 = r3
        L4a:
            r6 = r3
            goto L27
        L4c:
            if (r1 == 0) goto L50
            com.bytedance.android.live.base.model.ImageModel r3 = r1.image
        L50:
            X.CsQ<?> r1 = r9.LJLJLJ
            if (r1 == 0) goto L5c
            com.bytedance.android.live.base.model.ImageModel r0 = r1.LJFF
            if (r0 == 0) goto L5c
            if (r1 == 0) goto Lc
            com.bytedance.android.live.base.model.ImageModel r3 = r1.LJFF
        L5c:
            if (r3 == 0) goto Lc
            X.1t0 r2 = r9.LLFFF
            X.Csh r1 = new X.Csh
            r1.<init>(r9)
            r0 = 2131235447(0x7f081277, float:1.8087088E38)
            X.C15640jQ.LJFF(r2, r3, r0, r1)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32690CsI.L(X.CsQ, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }
}
