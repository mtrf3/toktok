package X;

/* loaded from: classes9.dex */
public enum J72 {
    NO_ERROR,
    ERR_MEMORY_ALLOC,
    NOT_IMPLEMENTED,
    ERR_UNEXPECTED,
    ERR_DATANOMATCH,
    INPUT_DATA_ERROR,
    CALL_BACK_STOP,
    BACKEND_FALLBACK,
    NULL_POINTER,
    INVALID_POINTER,
    INVALID_MODEL,
    INFER_SIZE_ERROR,
    NOT_SUPPORT,
    DESTROYED_ERROR,
    WRONG_LICENSE,
    BROKEN_MODEL,
    EARLY_STOP;

    public static J72 valueOf(String str) {
        return (J72) V0N.LJJJ(J72.class, str);
    }
}
