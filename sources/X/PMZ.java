package X;

/* loaded from: classes12.dex */
public final class PMZ extends C79359VCp {
    public static volatile PMZ LIZJ;

    public PMZ() {
        super(3);
        this.LIZ = "TypeNetworkFeature";
        Object obj = this.LIZIZ;
        if (obj != null) {
            ((VD4) obj).LIZ = "TypeNetworkFeature";
        }
    }

    public static PMZ LIZJ() {
        if (LIZJ == null) {
            synchronized (PMZ.class) {
                if (LIZJ == null) {
                    LIZJ = new PMZ();
                }
            }
        }
        return LIZJ;
    }
}
