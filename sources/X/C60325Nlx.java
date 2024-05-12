package X;

import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nlx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60325Nlx implements InterfaceC39974FmU {
    public final C60355NmR LJLIL;
    public final C60356NmS LJLILLLLZI;
    public final InterfaceC60362NmY LJLJI;
    public final InterfaceC60351NmN LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final String LJLJJLL;

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LJLJJL.getValue();
    }

    public C60325Nlx(InterfaceC60330Nm2 config, String bid) {
        o.LJIIJ(config, "config");
        o.LJIIJ(bid, "bid");
        this.LJLJJLL = bid;
        config.LIZLLL();
        this.LJLIL = new C60355NmR(3);
        config.LIZ();
        this.LJLILLLLZI = new C60356NmS(3);
        this.LJLJI = config.LIZJ();
        this.LJLJJI = config.LIZIZ();
        C221108m2.LIZIZ(C60326Nly.INSTANCE);
        this.LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 464));
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
