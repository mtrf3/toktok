package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.model.PaidCollectionPaymentResponse;
import com.ss.android.ugc.aweme.service.PaidContentPaymentServiceImpl;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class A3T<T> implements InterfaceC64592gB {
    public final /* synthetic */ PaidContentPaymentServiceImpl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Long LJLJJLL;

    public A3T(PaidContentPaymentServiceImpl paidContentPaymentServiceImpl, String str, Long l, Activity activity, String str2, Long l2) {
        this.LJLIL = paidContentPaymentServiceImpl;
        this.LJLILLLLZI = str;
        this.LJLJI = l;
        this.LJLJJI = activity;
        this.LJLJJL = str2;
        this.LJLJJLL = l2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Long l;
        Long l2;
        String str;
        Long l3;
        PaidCollectionPaymentResponse paidCollectionPaymentResponse = (PaidCollectionPaymentResponse) obj;
        this.LJLIL.LIZLLL.onNext(A3X.LIZ);
        int i = A3S.LIZ[paidCollectionPaymentResponse.voucherUseStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || (str = this.LJLJJL) == null || (l3 = this.LJLJJLL) == null) {
                    return;
                }
                this.LJLIL.LIZLLL(this.LJLJJI, paidCollectionPaymentResponse.orderId, str, l3.toString());
                return;
            }
            PaidContentPaymentServiceImpl paidContentPaymentServiceImpl = this.LJLIL;
            Activity activity = this.LJLJJI;
            paidContentPaymentServiceImpl.getClass();
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIIZZ(R.string.s9a);
            c26045AKb.LJIIJ();
            String str2 = this.LJLILLLLZI;
            if (str2 == null || (l2 = this.LJLJI) == null) {
                return;
            }
            this.LJLIL.LIZLLL(this.LJLJJI, paidCollectionPaymentResponse.orderId, str2, l2.toString());
            return;
        }
        String str3 = this.LJLILLLLZI;
        if (str3 == null || (l = this.LJLJI) == null) {
            return;
        }
        this.LJLIL.LIZLLL(this.LJLJJI, paidCollectionPaymentResponse.orderId, str3, l.toString());
    }
}
