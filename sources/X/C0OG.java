package X;

/* renamed from: X.0OG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OG {
    public static final Object LIZ = new Object();

    public static final void LIZ(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("index (");
        LIZ2.append(i);
        LIZ2.append(") is out of bound of [0, ");
        LIZ2.append(i2);
        LIZ2.append(')');
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LIZ2));
    }
}
