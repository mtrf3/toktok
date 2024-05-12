package X;

/* loaded from: classes16.dex */
public abstract class XJU {
    public abstract XJV<?> LIZ();

    public abstract Object LIZJ(Object obj);

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append('@');
        LIZ.append(C65314PkE.LJI(this));
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LIZIZ(XJU xju) {
        XJV<?> LIZ;
        XJV<?> LIZ2 = LIZ();
        if (LIZ2 == null || (LIZ = xju.LIZ()) == null || LIZ2.LJFF() >= LIZ.LJFF()) {
            return false;
        }
        return true;
    }
}
