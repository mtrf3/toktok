package X;

import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import java.util.LinkedHashMap;

/* renamed from: X.aET, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92669aET extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C92220a7E LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<PaymentMethod, C91944a2m, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92669aET(C92220a7E c92220a7E, InterfaceC88471Ynr<? super PaymentMethod, ? super C91944a2m, C76800UCe> interfaceC88471Ynr) {
        super(0);
        this.LJLIL = c92220a7E;
        this.LJLILLLLZI = interfaceC88471Ynr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C91944a2m c91944a2m;
        PaymentMethod LIZLLL = this.LJLIL.LIZLLL();
        C92220a7E c92220a7E = this.LJLIL;
        c92220a7E.getClass();
        try {
            c91944a2m = new C91944a2m(null, null, null);
            for (InterfaceC91938a2g interfaceC91938a2g : ((LinkedHashMap) c92220a7E.LIZIZ).values()) {
                if (interfaceC91938a2g instanceof C92363a9X) {
                    C92363a9X c92363a9X = (C92363a9X) interfaceC91938a2g;
                    c91944a2m = C91944a2m.LIZ(c91944a2m, c92363a9X.LJIL.LIZ((String) c92363a9X.LJII.getValue()), null, null, 6);
                } else if (interfaceC91938a2g instanceof C92354a9O) {
                    C92354a9O c92354a9O = (C92354a9O) interfaceC91938a2g;
                    c91944a2m = C91944a2m.LIZ(c91944a2m, null, c92354a9O.LJIIZILJ.LIZ((String) c92354a9O.LJII.getValue()), null, 5);
                } else if (interfaceC91938a2g instanceof C92188a6i) {
                    C92188a6i c92188a6i = (C92188a6i) interfaceC91938a2g;
                    c91944a2m = C91944a2m.LIZ(c91944a2m, null, null, c92188a6i.LIZLLL.LIZ(((C91741ZzV) c92188a6i.LJ.getValue()).toString()), 3);
                }
            }
        } catch (Throwable unused) {
            c91944a2m = new C91944a2m(null, null, null);
        }
        this.LJLILLLLZI.invoke(LIZLLL, c91944a2m);
        return C76800UCe.LIZ;
    }
}
