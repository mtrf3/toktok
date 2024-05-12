package X;

/* loaded from: classes10.dex */
public enum MTT {
    ERROR_STATUS,
    EMPTY_STATUS,
    FIRST_LOADING_STATUS,
    TOP_LOADING_STATUS,
    REFRESH_LOADING_STATUS,
    LOAD_MORE_LOADING_STATUS,
    SUCCESS;

    public static MTT valueOf(String str) {
        return (MTT) V0N.LJJJ(MTT.class, str);
    }
}
