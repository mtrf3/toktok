package X;

import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.IDqS418S0100000_31;
import ujb.o;
import ujb.s;

/* renamed from: X.a9V, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92361a9V extends C92219a7D {
    public final boolean LJIIZILJ;
    public final String LJIJ;
    public final InterfaceC88472Yns<String, C76800UCe> LJIJI;

    public C92361a9V() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final List<PaymentElements> LIZIZ() {
        String str;
        if (this.LJIIZILJ && o.LJJJLIIL((String) this.LJIIIIZZ.getValue(), "8", false)) {
            str = kotlin.jvm.internal.o.LJIILLIIL(this.LJIIIIZZ.getValue(), CardStruct.IStatusCode.DEFAULT);
        } else {
            str = (String) this.LJIIIIZZ.getValue();
        }
        return C47261Igj.LJJIJ(new PaymentElements(this.LIZ.getElement(), this.LIZ.getParamName(), str));
    }

    @Override // X.C92219a7D
    public final String LJIIIIZZ() {
        if (this.LJIIZILJ) {
            return C92054a4Y.LIZ("pipo_cashier_form_placeholder_walletID_OVO", new String[0]);
        }
        return super.LJIIIIZZ();
    }

    public C92361a9V(InterfaceC88472Yns interfaceC88472Yns, Elements elements, String str) {
        super(elements, 12, true, "", interfaceC88472Yns, null, null, 418);
        boolean LJJJLZIJ = s.LJJJLZIJ(str, "pm_pi_ew_ovo_c_", false);
        this.LJIIZILJ = LJJJLZIJ;
        this.LJIJ = LJJJLZIJ ? "62" : "";
        this.LJIJI = new IDqS418S0100000_31(this, 57);
        this.LJ = ORZ.LLIIJI(C92191a6l.LIZ, this.LJ);
    }
}
