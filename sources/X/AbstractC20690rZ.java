package X;

/* renamed from: X.0rZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20690rZ {
    public abstract void LIZ();

    public abstract boolean LIZJ();

    public final String LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append('@');
        LIZ.append(Integer.toHexString(hashCode()));
        return X1D.LIZIZ(LIZ);
    }

    public String toString() {
        return LIZIZ();
    }
}
