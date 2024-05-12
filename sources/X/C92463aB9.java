package X;

import android.view.View;
import java.util.List;

/* renamed from: X.aB9, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92463aB9 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ List<String> LJLJJLL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92463aB9(String str, boolean z, int i, InterfaceC70422pa interfaceC70422pa, View view, List<String> list, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = interfaceC70422pa;
        this.LJLJJL = view;
        this.LJLJJLL = list;
        this.LJLJL = interfaceC24760y8;
        this.LJLJLJ = interfaceC88472Yns;
        this.LJLJLLL = interfaceC65784Pro;
        this.LJLL = interfaceC65784Pro2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            InterfaceC91775a03 formPrefix = C91665ZyH.LIZ().getFormPrefix();
            String str = this.LJLIL;
            boolean z = this.LJLILLLLZI;
            formPrefix.LIZ(str, !z, new C92461aB7(z, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL), interfaceC24520xk2, ((this.LJLJI >> 3) & 14) | 4096);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
