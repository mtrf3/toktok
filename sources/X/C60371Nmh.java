package X;

import Y.ACallableS111S0100000_8;
import kotlin.jvm.internal.AqS65S1200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nmh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60371Nmh extends C60379Nmp implements InterfaceC39975FmV {
    public final InterfaceC60372Nmi LJLJI;

    public C60371Nmh(C60347NmJ c60347NmJ) {
        this.LJLJI = c60347NmJ;
    }

    @Override // X.InterfaceC39975FmV
    public final void LJIILJJIL(String msg, EnumC39958FmE level) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(level, "level");
        C10K.LIZIZ(new ACallableS111S0100000_8(new AqS65S1200000_10(this, level, msg, 4), 18), C10K.LJI, null);
    }

    @Override // X.InterfaceC39975FmV
    public final void LJJIFFI(String extraMsg, Throwable e) {
        o.LJIIJ(e, "e");
        o.LJIIJ(extraMsg, "extraMsg");
        C10K.LIZIZ(new ACallableS111S0100000_8(new AqS65S1200000_10(this, e, extraMsg, 5), 18), C10K.LJI, null);
    }
}
