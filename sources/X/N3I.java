package X;

/* loaded from: classes11.dex */
public class N3I {
    public final Class<?> LIZ;
    public final boolean LIZIZ;

    public N3I() {
        throw null;
    }

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.LIZIZ).hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N3I)) {
            return false;
        }
        N3I n3i = (N3I) obj;
        if (!n3i.LIZ.equals(this.LIZ) || n3i.LIZIZ != this.LIZIZ) {
            return false;
        }
        return true;
    }

    public N3I(Class cls, boolean z) {
        this.LIZ = cls;
        this.LIZIZ = z;
    }
}
