package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQW implements Comparable<OQW> {
    public final byte LJLIL;

    public final int hashCode() {
        return this.LJLIL;
    }

    public final String toString() {
        return String.valueOf(this.LJLIL & 255);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(OQW oqw) {
        return o.LJIIJJI(this.LJLIL & 255, oqw.LJLIL & 255);
    }

    public final boolean equals(Object obj) {
        byte b = this.LJLIL;
        if (!(obj instanceof OQW) || b != ((OQW) obj).LJLIL) {
            return false;
        }
        return true;
    }
}
