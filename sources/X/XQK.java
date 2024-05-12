package X;

/* loaded from: classes16.dex */
public abstract class XQK<T> {
    public abstract boolean LIZ(T t, T t2);

    public abstract int LIZIZ(T t);

    public final boolean LIZJ(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return LIZ(t, t2);
    }
}
