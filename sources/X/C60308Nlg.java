package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nlg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60308Nlg implements InterfaceC60323Nlv {
    public final C39976FmW LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC60302Nla LJLJI;

    @Override // X.InterfaceC60323Nlv
    public final InterfaceC60302Nla Zf() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC60323Nlv
    public final String getBid() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC60323Nlv
    public final <T> T LLLIIL(Class<T> cls) {
        return (T) Zf().LLLIIL(cls);
    }

    @Override // X.InterfaceC60323Nlv
    public final <T extends InterfaceC60387Nmx> T getService(Class<T> cls) {
        return (T) C60299NlX.LIZ(this, cls);
    }

    public C60308Nlg(String str, InterfaceC60302Nla serviceContext) {
        o.LJIIJ(serviceContext, "serviceContext");
        this.LJLILLLLZI = str;
        this.LJLJI = serviceContext;
        this.LJLIL = new C39976FmW((InterfaceC39975FmV) C60373Nmj.LIZIZ().LIZJ(InterfaceC39975FmV.class, str), "Token");
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }
}
