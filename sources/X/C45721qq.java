package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45721qq extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C40431iJ LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ Object LJLJJL;
    public final /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45721qq(C40431iJ c40431iJ, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(2);
        this.LJLIL = c40431iJ;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
        this.LJLJJL = obj4;
        this.LJLJJLL = obj5;
        this.LJLJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk nc = interfaceC24520xk;
        num.intValue();
        o.LJIIIZ(nc, "nc");
        this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, nc, this.LJLJL | 1);
        return C76800UCe.LIZ;
    }
}
