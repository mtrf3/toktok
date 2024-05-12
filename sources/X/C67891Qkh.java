package X;

/* renamed from: X.Qkh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67891Qkh<L> {
    public final L LIZ;
    public final String LIZIZ = "castDeviceControllerListenerKey";

    /* JADX WARN: Multi-variable type inference failed */
    public C67891Qkh(Object obj) {
        this.LIZ = obj;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (System.identityHashCode(this.LIZ) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67891Qkh)) {
            return false;
        }
        C67891Qkh c67891Qkh = (C67891Qkh) obj;
        if (this.LIZ == c67891Qkh.LIZ && this.LIZIZ.equals(c67891Qkh.LIZIZ)) {
            return true;
        }
        return false;
    }
}
