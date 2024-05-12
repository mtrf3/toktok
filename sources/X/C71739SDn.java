package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SDn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71739SDn extends C71742SDq {
    public AbstractC38911fr LJLJLLL = new C71709SCj();
    public PaymentMethod LJLL;
    public ElementDTO LJLLI;

    public final void LJ(InterfaceC71722SCw s) {
        String str;
        o.LJIIIZ(s, "s");
        LIZJ(this.LJLJJI, new AqS178S0100000_12(s, 370));
        if (s instanceof C71663SAp) {
            PaymentMethod LIZIZ = SEY.LIZ.LIZIZ(((C71663SAp) s).value().toString());
            LIZLLL(new C71707SCh(LIZIZ, this.LJLL));
            this.LJLL = LIZIZ;
            if (LIZIZ != null) {
                str = LIZIZ.iconUrl;
            } else {
                str = null;
            }
            LIZIZ(this.LJLJJI, new AqS35S1000000_12(str, 31));
        }
    }
}
