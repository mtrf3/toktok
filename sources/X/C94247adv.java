package X;

/* renamed from: X.adv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94247adv extends AbstractC93769aWD {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C94247adv) && this.LIZ == ((C94247adv) obj).LIZ;
        }
        return true;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DRAFTUPGRADE_ONCOMPLETE(resultCode=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C94247adv(int i) {
        this.LIZ = i;
    }
}
