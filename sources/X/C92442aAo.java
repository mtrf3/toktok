package X;

import java.util.List;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS42S0300000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aAo, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92442aAo extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC10220ag, C76800UCe> {
    public final /* synthetic */ List<String> LJLIL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ float LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92442aAo(List<String> list, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, int i, float f) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC24760y8;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = i;
        this.LJLJJL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC10220ag interfaceC10220ag) {
        InterfaceC10220ag LazyColumn = interfaceC10220ag;
        o.LJIIIZ(LazyColumn, "$this$LazyColumn");
        List<String> list = this.LJLIL;
        LazyColumn.LIZIZ(list.size(), null, new IDqS418S0100000_31(list, 5), C1DJ.LJFF(new IDqS42S0300000_31(list, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, 0), -1091073711, true));
        LazyColumn.LIZ(null, null, C1DJ.LJFF(new C92422aAU(this.LJLJJL), -985542411, true));
        return C76800UCe.LIZ;
    }
}
