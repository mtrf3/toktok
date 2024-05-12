package X;

import com.bytedance.retrofit2.mime.TypedInput;

/* loaded from: classes19.dex */
public class ZUO implements InterfaceC36621EYv<TypedInput> {
    public final /* synthetic */ ZUU LJLIL;

    public ZUO(ZUU zuu) {
        this.LJLIL = zuu;
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, Throwable th) {
        if (th instanceof C64802Pby) {
            C64802Pby c64802Pby = (C64802Pby) th;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFailure: ");
            LIZ.append(c64802Pby.getStatusCode());
            LIZ.append("----");
            LIZ.append(c64802Pby.getMessage());
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BytebenchV2");
        }
        C47261Igj.LJIILJJIL("BytebenchV2");
        this.LJLIL.LIZ.LIZ(103, -1, th.getMessage());
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, C64797Pbt<TypedInput> c64797Pbt) {
        C89999ZTv.LIZ(new ZU7(this, c64797Pbt, interfaceC37276Ek4), C89999ZTv.LJ);
    }
}
