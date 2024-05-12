package Y;

import X.C28068Azw;
import X.C28087B0p;
import X.C28104B1g;
import X.C28106B1i;
import X.C28107B1j;
import X.C78565UsT;
import X.C78613UtF;
import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;

/* loaded from: classes5.dex */
public class AfS0S4100000_4 implements InterfaceC64592gB {
    public final int $t;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S4100000_4 afS0S4100000_4, Object obj) {
        Response response = (Response) obj;
        if (response.isCodeOK()) {
            PaymentViewModel paymentViewModel = (PaymentViewModel) afS0S4100000_4.l4;
            paymentViewModel.setState(C28104B1g.LJLIL);
            C78565UsT.LJJIJ(paymentViewModel, C78613UtF.LIZJ, new C28087B0p(paymentViewModel, null));
            C28068Azw.LIZLLL(afS0S4100000_4.s0, afS0S4100000_4.s1, null, afS0S4100000_4.s2, afS0S4100000_4.s3, true);
            return;
        }
        C28068Azw.LIZLLL(afS0S4100000_4.s0, afS0S4100000_4.s1, response.message, afS0S4100000_4.s2, afS0S4100000_4.s3, false);
        ((PaymentViewModel) afS0S4100000_4.l4).setState(C28106B1i.LJLIL);
    }

    public static final void accept$1(AfS0S4100000_4 afS0S4100000_4, Object obj) {
        C28068Azw.LIZLLL(afS0S4100000_4.s0, afS0S4100000_4.s1, ((Throwable) obj).getMessage(), afS0S4100000_4.s2, afS0S4100000_4.s3, false);
        ((PaymentViewModel) afS0S4100000_4.l4).setState(C28107B1j.LJLIL);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S4100000_4(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            switch(r7) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r3
            r0.s1 = r4
            r0.s2 = r5
            r0.s3 = r6
            r0.l4 = r2
        L10:
            r0.<init>()
            return
        L14:
            r0 = r1
            r0.l4 = r2
            r0.s0 = r3
            r0.s1 = r4
            r0.s2 = r5
            r0.s3 = r6
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S4100000_4.<init>(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
