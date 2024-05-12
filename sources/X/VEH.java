package X;

/* loaded from: classes15.dex */
public final class VEH<T> {
    public final Throwable LIZ;
    public int LIZIZ;
    public final T LIZJ;

    public VEH(T t) {
        this.LIZJ = t;
    }

    public static <T> VEH<T> LIZ(T t) {
        VEH<T> veh = new VEH<>(t);
        veh.LIZIZ = 0;
        return veh;
    }

    public VEH(int i, Throwable th) {
        this.LIZIZ = i;
        this.LIZ = th;
    }
}
