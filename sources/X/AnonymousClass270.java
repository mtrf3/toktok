package X;

import android.content.Context;

/* renamed from: X.270, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass270 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<Context, T> LJLIL;
    public final /* synthetic */ InterfaceC07790Sh LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<T, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass270(InterfaceC88472Yns<? super Context, ? extends T> interfaceC88472Yns, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns2, int i, int i2) {
        super(2);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = interfaceC07790Sh;
        this.LJLJI = interfaceC88472Yns2;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C24920yO.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
