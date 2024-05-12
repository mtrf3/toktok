package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.1XZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XZ implements InterfaceC14950iJ {
    public final InterfaceC14950iJ LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC14950iJ
    public final int LIZ(int i) {
        int LIZ = this.LIZIZ.LIZ(i);
        if (LIZ >= 0 && LIZ <= this.LIZJ) {
            return LIZ;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("OffsetMapping.transformedToOriginal returned invalid mapping: ", i, " -> ", LIZ, " is not in range of original text [0, ");
        String LIZJ2 = b0.LIZJ(LIZJ, this.LIZJ, ']', LIZJ);
        LIZJ2.toString();
        throw new IllegalStateException(LIZJ2);
    }

    @Override // X.InterfaceC14950iJ
    public final int LIZIZ(int i) {
        int LIZIZ = this.LIZIZ.LIZIZ(i);
        if (LIZIZ >= 0 && LIZIZ <= this.LIZLLL) {
            return LIZIZ;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("OffsetMapping.originalToTransformed returned invalid mapping: ", i, " -> ", LIZIZ, " is not in range of transformed text [0, ");
        String LIZJ2 = b0.LIZJ(LIZJ, this.LIZLLL, ']', LIZJ);
        LIZJ2.toString();
        throw new IllegalStateException(LIZJ2);
    }

    public C1XZ(InterfaceC14950iJ delegate, int i, int i2) {
        o.LJIIIZ(delegate, "delegate");
        this.LIZIZ = delegate;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
