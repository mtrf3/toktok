package com.google.android.play.core.assetpacks;

import X.C40632Fx6;
import X.C40648FxM;
import X.C40666Fxe;
import X.InterfaceC153055zZ;
import X.InterfaceC38408F5o;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class u1 implements InterfaceC153055zZ<t1> {
    public final InterfaceC153055zZ<y> LJLIL;
    public final InterfaceC153055zZ<s2> LJLILLLLZI;
    public final InterfaceC153055zZ<c1> LJLJI;
    public final InterfaceC153055zZ<Executor> LJLJJI;
    public final InterfaceC153055zZ<q0> LJLJJL;
    public final InterfaceC153055zZ<C40648FxM> LJLJJLL;

    public u1(InterfaceC153055zZ interfaceC153055zZ, C40632Fx6 c40632Fx6, InterfaceC153055zZ interfaceC153055zZ2, InterfaceC153055zZ interfaceC153055zZ3, InterfaceC153055zZ interfaceC153055zZ4, InterfaceC153055zZ interfaceC153055zZ5) {
        this.LJLIL = interfaceC153055zZ;
        this.LJLILLLLZI = c40632Fx6;
        this.LJLJI = interfaceC153055zZ2;
        this.LJLJJI = interfaceC153055zZ3;
        this.LJLJJL = interfaceC153055zZ4;
        this.LJLJJLL = interfaceC153055zZ5;
    }

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ t1 a() {
        y a = this.LJLIL.a();
        InterfaceC38408F5o LIZIZ = C40666Fxe.LIZIZ(this.LJLILLLLZI);
        c1 a2 = this.LJLJI.a();
        return new t1(a, LIZIZ, a2, C40666Fxe.LIZIZ(this.LJLJJI), this.LJLJJL.a(), this.LJLJJLL.a());
    }
}
