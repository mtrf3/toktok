package X;

import X.InterfaceC40516FvE;
import X.InterfaceC60227NkN;
import X.InterfaceC60281NlF;
import X.InterfaceC60282NlG;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NlO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60290NlO<S extends InterfaceC60282NlG, T extends InterfaceC60281NlF, U extends InterfaceC40516FvE, V extends InterfaceC60227NkN> implements InterfaceC60250Nkk<S, T, U, V>, InterfaceC60323Nlv {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS160S0100000_10((AbstractC60290NlO) this, 477));
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;

    @Override // X.InterfaceC60250Nkk
    public String LLLJIL() {
        return "";
    }

    @Override // X.InterfaceC60250Nkk
    public boolean LLLLIILL() {
        return false;
    }

    @Override // X.InterfaceC60323Nlv
    public final InterfaceC60302Nla Zf() {
        return (InterfaceC60302Nla) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC60323Nlv
    public final String getBid() {
        return (String) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LJLJI.getValue();
    }

    public AbstractC60290NlO() {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10((AbstractC60290NlO) this, 479));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10((AbstractC60290NlO) this, 478));
    }

    @Override // X.InterfaceC60323Nlv
    public final <T> T LLLIIL(Class<T> cls) {
        return (T) Zf().LLLIIL(cls);
    }

    /* JADX WARN: Incorrect return type in method signature: <T::LX/Nmx;>(Ljava/lang/Class<TT;>;)TT; */
    @Override // X.InterfaceC60323Nlv
    public final InterfaceC60387Nmx getService(Class cls) {
        return C60299NlX.LIZ(this, cls);
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
