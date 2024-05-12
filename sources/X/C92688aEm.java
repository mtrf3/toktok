package X;

import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import java.util.List;

/* renamed from: X.aEm, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92688aEm extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List<Methods> LJLIL;
    public final /* synthetic */ InterfaceC91961a33 LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<String, Boolean, C76800UCe> LJLJI;
    public final /* synthetic */ C92283a8F LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC91961a33, C76800UCe> LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92688aEm(List<Methods> list, InterfaceC91961a33 interfaceC91961a33, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr, C92283a8F c92283a8F, InterfaceC88472Yns<? super InterfaceC91961a33, C76800UCe> interfaceC88472Yns, int i) {
        super(2);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC91961a33;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = c92283a8F;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91864a1U.LIZJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk, this.LJLJJLL | 1);
        return C76800UCe.LIZ;
    }
}
