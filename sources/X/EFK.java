package X;

/* loaded from: classes7.dex */
public enum EFK {
    MAIN,
    BACKGROUND,
    SPARSE,
    BOOT_FINISH,
    APP_BACKGROUND,
    IDLE;

    public static EFK valueOf(String str) {
        return (EFK) V0N.LJJJ(EFK.class, str);
    }
}
