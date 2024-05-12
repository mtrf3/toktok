package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175746v4 extends AbstractC65781Prl implements InterfaceC88472Yns<C175886vI, C175886vI> {
    public final /* synthetic */ List<String> LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;
    public final /* synthetic */ java.util.Set<String> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C175746v4(List<String> list, List<String> list2, java.util.Set<String> set, int i, int i2) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = set;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C175886vI invoke(C175886vI c175886vI) {
        C175886vI setState = c175886vI;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, null, null, new C43I(new C175646uu(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL)), null, false, 55);
    }
}
