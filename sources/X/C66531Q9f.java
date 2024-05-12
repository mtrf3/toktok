package X;

/* renamed from: X.Q9f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66531Q9f<T> {
    public static final /* synthetic */ int LIZLLL = 0;
    public final int LIZ;
    public final String LIZIZ;
    public final T LIZJ;

    static {
        new C66532Q9g();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SDKCallResult(code=");
        LIZ.append(this.LIZ);
        LIZ.append(", message=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", data=");
        return U26.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C66531Q9f(int i, String str, T t) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = t;
    }
}
