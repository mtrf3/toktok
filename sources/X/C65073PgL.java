package X;

import Y.ARunnableS30S0200000_11;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.SsHttpCall;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.PgL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65073PgL<T> implements InterfaceC37346ElC<T> {
    public final /* synthetic */ InterfaceC36621EYv LJLIL;
    public final /* synthetic */ C65072PgK LJLILLLLZI;

    @Override // X.InterfaceC37346ElC
    public final void LJIIIIZZ(RequestBuilder requestBuilder) {
        InterfaceC36621EYv interfaceC36621EYv = this.LJLIL;
        if (interfaceC36621EYv instanceof InterfaceC37346ElC) {
            ((InterfaceC37346ElC) interfaceC36621EYv).LJIIIIZZ(requestBuilder);
        }
    }

    public C65073PgL(C65072PgK c65072PgK, InterfaceC36621EYv interfaceC36621EYv) {
        this.LJLILLLLZI = c65072PgK;
        this.LJLIL = interfaceC36621EYv;
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<T> interfaceC37276Ek4, Throwable th) {
        this.LJLILLLLZI.LJLIL.execute(new ARunnableS30S0200000_11(this, th, 9));
    }

    @Override // X.InterfaceC37346ElC
    public final void LJ(SsHttpCall ssHttpCall, C64797Pbt c64797Pbt) {
        InterfaceC36621EYv interfaceC36621EYv = this.LJLIL;
        if (interfaceC36621EYv instanceof InterfaceC37346ElC) {
            ((InterfaceC37346ElC) interfaceC36621EYv).LJ(ssHttpCall, c64797Pbt);
        }
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<T> interfaceC37276Ek4, C64797Pbt<T> c64797Pbt) {
        this.LJLILLLLZI.LJLIL.execute(new ARunnableS30S0200000_11(this, c64797Pbt, 8));
    }
}
