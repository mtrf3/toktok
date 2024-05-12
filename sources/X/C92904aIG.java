package X;

import java.util.List;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aIG, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92904aIG extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC10220ag, C76800UCe> {
    public final /* synthetic */ List<InterfaceC91996a3c> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC91996a3c, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92904aIG(List<? extends InterfaceC91996a3c> list, InterfaceC88472Yns<? super InterfaceC91996a3c, C76800UCe> interfaceC88472Yns, int i) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC10220ag interfaceC10220ag) {
        InterfaceC10220ag LazyColumn = interfaceC10220ag;
        o.LJIIIZ(LazyColumn, "$this$LazyColumn");
        List<InterfaceC91996a3c> list = this.LJLIL;
        InterfaceC88472Yns<InterfaceC91996a3c, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        int i = this.LJLJI;
        LazyColumn.LIZIZ(list.size(), null, new IDqS174S0200000_31(C92902aIE.INSTANCE, list, 21), C1DJ.LJFF(new C92903aIF(list, interfaceC88472Yns, i), -632812321, true));
        return C76800UCe.LIZ;
    }
}
