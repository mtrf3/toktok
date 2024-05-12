package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.35m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C783035m extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC99673vf, C76800UCe> {
    public final /* synthetic */ C109544Rq LJLIL;
    public final /* synthetic */ java.util.Map<String, List<C32H>> LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, List<C32H>> LJLJI;
    public final /* synthetic */ Long LJLJJI;
    public final /* synthetic */ Long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783035m(C109544Rq c109544Rq, java.util.Map<String, List<C32H>> map, java.util.Map<String, List<C32H>> map2, Long l, Long l2) {
        super(1);
        this.LJLIL = c109544Rq;
        this.LJLILLLLZI = map;
        this.LJLJI = map2;
        this.LJLJJI = l;
        this.LJLJJL = l2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC99673vf interfaceC99673vf) {
        InterfaceC99673vf it = interfaceC99673vf;
        o.LJIIIZ(it, "it");
        it.v6(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
