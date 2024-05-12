package X;

/* loaded from: classes12.dex */
public final class RAP implements RAT {
    public static RAP LIZ;

    public static RAT LIZ() {
        if (LIZ == null) {
            synchronized (RAP.class) {
                if (LIZ == null) {
                    LIZ = new RAP();
                }
            }
        }
        return LIZ;
    }
}
