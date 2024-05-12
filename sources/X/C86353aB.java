package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3aB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86353aB extends AbstractC65781Prl implements InterfaceC88472Yns<C86393aF, C86393aF> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ List<C785736n> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86353aB(int i, long j, String str, List list) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = list;
        this.LJLJI = j;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C86393aF invoke(C86393aF setState) {
        boolean z;
        o.LJIIIZ(setState, "$this$setState");
        if (this.LJLIL.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        List<C785736n> list = this.LJLILLLLZI;
        return new C86393aF(this.LJLJJI, this.LJLJI, list, z);
    }
}
