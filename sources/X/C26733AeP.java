package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode.USLogisticSelectByZipcodeVH;

/* renamed from: X.AeP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26733AeP implements TextView.OnEditorActionListener {
    public final /* synthetic */ USLogisticSelectByZipcodeVH LJLIL;
    public final /* synthetic */ T5T LJLILLLLZI;
    public final /* synthetic */ C26735AeR LJLJI;

    public C26733AeP(USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH, T5T t5t, C26735AeR c26735AeR) {
        this.LJLIL = uSLogisticSelectByZipcodeVH;
        this.LJLILLLLZI = t5t;
        this.LJLJI = c26735AeR;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH = this.LJLIL;
            T5T t5t = this.LJLILLLLZI;
            uSLogisticSelectByZipcodeVH.getClass();
            USLogisticSelectByZipcodeVH.L(t5t);
            this.LJLILLLLZI.clearFocus();
            USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH2 = this.LJLIL;
            uSLogisticSelectByZipcodeVH2.LJLJJI = true;
            uSLogisticSelectByZipcodeVH2.M().Iv0(this.LJLJI.LIZ, true);
            return true;
        }
        return false;
    }
}
