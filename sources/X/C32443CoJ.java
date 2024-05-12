package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CoJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32443CoJ implements InterfaceC32416Cns {
    public final /* synthetic */ C32442CoI LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<C78163Ulz, C76800UCe> LJLJI;

    @Override // X.InterfaceC32416Cns
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC32416Cns
    public final void LIZ(long j) {
        this.LJLIL.LJ = Boolean.FALSE;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResourceFetcher#onCancel resourceId=");
        LIZ.append(j);
        C32444CoK.LIZIZ(null, X1D.LIZIZ(LIZ));
        this.LJLJI.invoke(new C78163Ulz(-14, (String) null, 6));
    }

    @Override // X.InterfaceC32416Cns
    public final void onFailed(Throwable th) {
        String str;
        this.LJLIL.LJ = Boolean.FALSE;
        InterfaceC32445CoL interfaceC32445CoL = C32245Cl7.LIZ;
        if (interfaceC32445CoL != null) {
            interfaceC32445CoL.e("ttlive_gift_render", "ResourceFetcher#onFailed", th);
        }
        InterfaceC88472Yns<C78163Ulz, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (th == null || (str = th.getMessage()) == null) {
            str = "";
        }
        interfaceC88472Yns.invoke(new C78163Ulz(-13, str, th));
    }

    @Override // X.InterfaceC32416Cns
    public final void LIZLLL(long j, String path) {
        o.LJIIIZ(path, "path");
        C32442CoI c32442CoI = this.LJLIL;
        c32442CoI.LJ = Boolean.TRUE;
        c32442CoI.LIZIZ = path;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResourceFetcher#onResult resourceId=");
        LIZ.append(j);
        LIZ.append(", path = ");
        LIZ.append(path);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.invoke(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C32443CoJ(C32442CoI c32442CoI, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super C78163Ulz, C76800UCe> interfaceC88472Yns2) {
        this.LJLIL = c32442CoI;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC88472Yns2;
    }
}
