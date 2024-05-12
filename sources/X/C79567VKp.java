package X;

/* renamed from: X.VKp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79567VKp {
    public final Object LIZ;
    public final int LIZIZ;

    public C79567VKp(int i, YIH yih) {
        this.LIZ = yih;
        this.LIZIZ = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.LIZ) * 65535) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C79567VKp)) {
            return false;
        }
        C79567VKp c79567VKp = (C79567VKp) obj;
        if (this.LIZ != c79567VKp.LIZ || this.LIZIZ != c79567VKp.LIZIZ) {
            return false;
        }
        return true;
    }
}
