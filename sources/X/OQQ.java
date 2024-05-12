package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQQ implements Comparable<OQQ> {
    public final short LJLIL;

    public final int hashCode() {
        return this.LJLIL;
    }

    public final String toString() {
        return String.valueOf(this.LJLIL & 65535);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(OQQ oqq) {
        return o.LJIIJJI(this.LJLIL & 65535, oqq.LJLIL & 65535);
    }

    public final boolean equals(Object obj) {
        short s = this.LJLIL;
        if (!(obj instanceof OQQ) || s != ((OQQ) obj).LJLIL) {
            return false;
        }
        return true;
    }
}
