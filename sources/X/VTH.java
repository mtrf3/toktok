package X;

/* loaded from: classes15.dex */
public enum VTH {
    COMPLETION,
    START,
    REPEAT,
    CANCEL,
    READY,
    UPDATE,
    ERROR,
    FPS;

    public static VTH valueOf(String str) {
        return (VTH) V0N.LJJJ(VTH.class, str);
    }
}
