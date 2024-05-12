package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gbh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41853Gbh extends AbstractC41869Gbx {
    public final AbstractC42983Gtv LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(" Msg-BeforeCancel cause:");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41853Gbh(Object sourceTag, C41875Gc3 c41875Gc3, AbstractC42983Gtv cause) {
        super(sourceTag, null, c41875Gc3);
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        this.LIZLLL = cause;
    }
}
