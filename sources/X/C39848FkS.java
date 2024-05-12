package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FkS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39848FkS implements InterfaceC39049FUf {
    @Override // X.InterfaceC39049FUf
    public final void LIZ(String msg, EnumC39866Fkk logLevel, String tag) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(logLevel, "logLevel");
        o.LJIIIZ(tag, "tag");
        int i = C39864Fki.LIZ[logLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        C15280iq.LIZJ(tag, msg);
                        return;
                    }
                    C15280iq.LJII(tag, msg);
                    return;
                }
                C15280iq.LJ(tag, msg);
                return;
            }
            C15280iq.LJI(tag, msg);
            return;
        }
        C15280iq.LIZIZ(tag, msg);
    }

    @Override // X.InterfaceC39049FUf
    public final void LIZIZ(String extraMsg, String tag, Throwable e) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(extraMsg, "extraMsg");
        o.LJIIIZ(tag, "tag");
        C15280iq.LIZJ(tag, extraMsg);
    }
}
