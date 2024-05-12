package X;

import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nmp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60379Nmp implements InterfaceC60387Nmx, InterfaceC39974FmU {
    public String LJLIL = "default_bid";
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 527));

    @Override // X.InterfaceC39974FmU
    public C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC60387Nmx
    public void onUnRegister() {
    }

    @Override // X.InterfaceC60387Nmx
    public final String getBid() {
        return this.LJLIL;
    }

    public final <T extends InterfaceC60387Nmx> T getService(Class<T> cls) {
        return (T) C60373Nmj.LIZIZ().LIZJ(cls, this.LJLIL);
    }

    @Override // X.InterfaceC60387Nmx
    public void onRegister(String bid) {
        o.LJIIJ(bid, "bid");
        this.LJLIL = bid;
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
