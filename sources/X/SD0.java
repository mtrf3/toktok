package X;

import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SD0 extends C96493qX {
    public final /* synthetic */ SD1 LJLJJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SD0(X.SD1 r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            r2.LJLJJL = r3
            android.widget.EditText r4 = (android.widget.EditText) r4
            java.lang.String r0 = "inputWithIndicatorEditText"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r1 = 4
            java.lang.String r0 = " "
            r2.<init>(r4, r1, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SD0.<init>(X.SD1, android.view.View, int):void");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s, int i, int i2, int i3) {
        String str;
        o.LJIIIZ(s, "s");
        if (TextUtils.isEmpty(s)) {
            this.LJLJJL.setInputType("");
        } else if (i2 == 1 || i3 == 1) {
            this.LJLJJL.setInputType("normal");
        }
        int i4 = 0;
        C24050wz LIZIZ = C22780uw.LIZ.LIZIZ(((PaymentElement) ListProtector.get(this.LJLJJL.getValue(), 0)).getParamValue());
        PaymentMethod paymentMethod = null;
        if (LIZIZ != null) {
            str = LIZIZ.LJI;
        } else {
            str = null;
        }
        this.LJLJJL.LJFF(str);
        if (!o.LJ(str, this.LJLJJL.getCurrentPaymentId())) {
            InterfaceC88472Yns<PaymentMethod, C76800UCe> onPaymentMethodIdentify = this.LJLJJL.getOnPaymentMethodIdentify();
            List<PaymentMethod> paymentList = this.LJLJJL.getPaymentList();
            if (paymentList != null) {
                Iterator<PaymentMethod> it = paymentList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PaymentMethod next = it.next();
                    if (o.LJ(next.id, str)) {
                        paymentMethod = next;
                        break;
                    }
                }
            }
            onPaymentMethodIdentify.invoke(paymentMethod);
        }
        this.LJLJJL.setCurrentPaymentId(str);
        this.LJLJJL.getOnValueChange().invoke(this.LJLJJL.getValue());
        if (TextUtils.isEmpty(s)) {
            ((ImageView) this.LJLJJL.LIZIZ(R.id.ea2)).setVisibility(8);
        } else {
            ((ImageView) this.LJLJJL.LIZIZ(R.id.ea2)).setVisibility(0);
        }
        ImageView iconScanning = (ImageView) this.LJLJJL.LIZIZ(R.id.eae);
        o.LJIIIIZZ(iconScanning, "iconScanning");
        if (!TextUtils.isEmpty(s) || !C52969Kqb.LIZ()) {
            i4 = 8;
        }
        iconScanning.setVisibility(i4);
        if (this.LJLJJL.getCurrentPaymentId() != null) {
            SD1 sd1 = this.LJLJJL;
            sd1.LJFF(sd1.getCurrentPaymentId());
        }
    }
}
