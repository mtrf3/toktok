package X;

import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import java.util.List;

/* renamed from: X.a9S, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92358a9S extends C92219a7D {
    public final String LJIIZILJ;
    public final boolean LJIJ;
    public Integer LJIJI;
    public final Elements LJIJJ;
    public final Elements LJIJJLI;
    public final InterfaceC88472Yns<String, C76800UCe> LJIL;

    public C92358a9S() {
        this(null, null, null, null, null, 127);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final List<PaymentElements> LIZIZ() {
        if (((String) this.LJIIIIZZ.getValue()).length() == 11) {
            return C47261Igj.LJJIJ(new PaymentElements(this.LJIJJ.getElement(), this.LJIJJ.getParamName(), (String) this.LJIIIIZZ.getValue()));
        }
        return C47261Igj.LJJIJ(new PaymentElements(this.LJIJJLI.getElement(), this.LJIJJLI.getParamName(), (String) this.LJIIIIZZ.getValue()));
    }

    @Override // X.C92219a7D
    public final String LJFF() {
        return this.LJIIZILJ;
    }

    @Override // X.C92219a7D
    public final Integer LJII() {
        return this.LJIJI;
    }

    @Override // X.C92219a7D
    public final boolean LJIIJ() {
        return this.LJIJ;
    }

    @Override // X.C92219a7D
    public final void LJIIJJI(Integer num) {
        this.LJIJI = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C92358a9S(java.lang.String r39, com.bytedance.pipo.checkout.api.network.model.response.Elements r40, com.bytedance.pipo.checkout.api.network.model.response.Elements r41, X.InterfaceC88472Yns r42, X.C92229a7N r43, int r44) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92358a9S.<init>(java.lang.String, com.bytedance.pipo.checkout.api.network.model.response.Elements, com.bytedance.pipo.checkout.api.network.model.response.Elements, X.Yns, X.a7N, int):void");
    }
}
