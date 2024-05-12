package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FPx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38937FPx extends F9E {
    public final String LJLIL;
    public final Object LJLILLLLZI;
    public final InterfaceC38189Eyn LJLJI;
    public final InterfaceC88472Yns<Throwable, C76800UCe> LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38937FPx(String funcName, Object params, InterfaceC38189Eyn interfaceC38189Eyn, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        o.LJIIJ(funcName, "funcName");
        o.LJIIJ(params, "params");
        this.LJLIL = funcName;
        this.LJLILLLLZI = params;
        this.LJLJI = interfaceC38189Eyn;
        this.LJLJJI = interfaceC88472Yns;
    }
}
