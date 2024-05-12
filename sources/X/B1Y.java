package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class B1Y extends TAT {
    public final /* synthetic */ B1W LJLJJI;
    public final /* synthetic */ B1R LJLJJL;
    public final /* synthetic */ PaymentMethod LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ C34K LJLL;

    @Override // X.TAT
    public final void LIZ(View view) {
        String str;
        Availability availability;
        if (view == null || this.LJLJJI.LIZ(R.id.fge).isSelected()) {
            return;
        }
        this.LJLJJL.LIZJ();
        this.LJLJJI.setChecked(true);
        this.LJLJJL.getOnSubPaymentClickListener().invoke(this.LJLJJLL);
        String str2 = this.LJLJL;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.LJLJLJ;
        int i = this.LJLJLLL;
        boolean LJJJZ = C78685UuP.LJJJZ(this.LJLJJLL.extraInfo);
        PaymentMethod paymentMethod = this.LJLJJL.getPaymentMethod();
        if (paymentMethod != null && (availability = paymentMethod.availability) != null) {
            str = availability.statusCode;
        } else {
            str = null;
        }
        C27949Ay1.LJJIZ(str2, str3, i, LJJJZ, str, Boolean.valueOf(this.LJLL.element), null, null, null, 3968);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1Y(B1W b1w, B1R b1r, PaymentMethod paymentMethod, String str, String str2, int i, C34K c34k) {
        super(700L);
        this.LJLJJI = b1w;
        this.LJLJJL = b1r;
        this.LJLJJLL = paymentMethod;
        this.LJLJL = str;
        this.LJLJLJ = str2;
        this.LJLJLLL = i;
        this.LJLL = c34k;
    }
}
