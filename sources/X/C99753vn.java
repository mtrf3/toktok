package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99753vn extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC99673vf, C76800UCe> {
    public final /* synthetic */ List<C109544Rq> LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C99753vn(List<C109544Rq> list, int i, String str) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC99673vf interfaceC99673vf) {
        InterfaceC99673vf it = interfaceC99673vf;
        o.LJIIIZ(it, "it");
        it.K7(this.LJLILLLLZI, this.LJLJI, this.LJLIL);
        return C76800UCe.LIZ;
    }
}
