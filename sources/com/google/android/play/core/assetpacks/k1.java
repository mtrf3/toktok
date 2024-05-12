package com.google.android.play.core.assetpacks;

import X.C16880lQ;
import X.C40632Fx6;
import X.C40666Fxe;
import X.InterfaceC153055zZ;
import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class k1 implements InterfaceC153055zZ<j1> {
    public final InterfaceC153055zZ<String> LJLIL;
    public final InterfaceC153055zZ<t> LJLILLLLZI;
    public final InterfaceC153055zZ<q0> LJLJI;
    public final InterfaceC153055zZ<Context> LJLJJI;
    public final InterfaceC153055zZ<v1> LJLJJL;
    public final InterfaceC153055zZ<Executor> LJLJJLL;

    public k1(InterfaceC153055zZ interfaceC153055zZ, C40632Fx6 c40632Fx6, InterfaceC153055zZ interfaceC153055zZ2, p2 p2Var, InterfaceC153055zZ interfaceC153055zZ3, InterfaceC153055zZ interfaceC153055zZ4) {
        this.LJLIL = interfaceC153055zZ;
        this.LJLILLLLZI = c40632Fx6;
        this.LJLJI = interfaceC153055zZ2;
        this.LJLJJI = p2Var;
        this.LJLJJL = interfaceC153055zZ3;
        this.LJLJJLL = interfaceC153055zZ4;
    }

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ j1 a() {
        String a = this.LJLIL.a();
        t a2 = this.LJLILLLLZI.a();
        this.LJLJI.a();
        Context a3 = ((p2) this.LJLJJI).a();
        v1 a4 = this.LJLJJL.a();
        return new j1(a != null ? new File(C16880lQ.LLIIJI(a3, null), a) : C16880lQ.LLIIJI(a3, null), a2, a3, a4, C40666Fxe.LIZIZ(this.LJLJJLL));
    }
}
