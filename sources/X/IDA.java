package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IDA implements F4V {
    public final /* synthetic */ AbstractC46244ICy LJLIL;

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    public IDA(AbstractC46244ICy abstractC46244ICy) {
        this.LJLIL = abstractC46244ICy;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        this.LJLIL.LLIFFJFJJ.LJII(session);
        ERS LIZ = ern.LIZ(session);
        if ((session instanceof T4Q) && this.LJLIL.g20((T4Q) session)) {
            this.LJLIL.LJJLL();
        }
        this.LJLIL.uc0(false);
        return LIZ;
    }
}
