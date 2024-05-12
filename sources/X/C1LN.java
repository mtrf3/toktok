package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1LN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LN extends AbstractC07660Ru {
    public final EnumC07520Rg LIZ;
    public final EnumC07530Rh LIZIZ;
    public final double LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1LN)) {
            return false;
        }
        C1LN c1ln = (C1LN) obj;
        return this.LIZ == c1ln.LIZ && this.LIZIZ == c1ln.LIZIZ && Double.compare(this.LIZJ, c1ln.LIZJ) == 0;
    }

    public final int hashCode() {
        return C16880lQ.LLJI(this.LIZJ) + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateKaraokeSetting(lyricsState=");
        LIZ.append(this.LIZ);
        LIZ.append(", originalState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", toneValue=");
        return C07670Rv.LIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C1LN(EnumC07520Rg lyricsState, EnumC07530Rh originalState, double d) {
        o.LJIIIZ(lyricsState, "lyricsState");
        o.LJIIIZ(originalState, "originalState");
        this.LIZ = lyricsState;
        this.LIZIZ = originalState;
        this.LIZJ = d;
    }
}
