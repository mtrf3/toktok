package X;

/* renamed from: X.QfI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67556QfI extends AbstractC67558QfK {
    public final long LIZ;

    public C67556QfI(long j) {
        this.LIZ = j;
    }

    @Override // X.AbstractC67558QfK
    public final void LIZ() {
    }

    @Override // X.AbstractC67558QfK
    public final long LIZIZ() {
        return this.LIZ;
    }

    public final int hashCode() {
        long j = this.LIZ;
        return (-724379968) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.LIZ + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC67558QfK) {
            AbstractC67558QfK abstractC67558QfK = (AbstractC67558QfK) obj;
            abstractC67558QfK.LIZ();
            if (this.LIZ == abstractC67558QfK.LIZIZ()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
