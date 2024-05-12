package X;

import kotlin.jvm.internal.AqS175S0100000_9;

/* loaded from: classes10.dex */
public final class M2O implements InterfaceC73463SsN<Object> {
    public final /* synthetic */ XJL<Object> LJLIL;

    public M2O(XKS xks) {
        this.LJLIL = xks;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        XJL<Object> xjl = this.LJLIL;
        C3C4 LIZ = C141335gf.LIZ(th);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.LJIILIIL(new AqS175S0100000_9(interfaceC92693kP, 18));
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(Object obj) {
        XJL<Object> xjl = this.LJLIL;
        C3C5.m7constructorimpl(obj);
        xjl.resumeWith(obj);
    }
}
