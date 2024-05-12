package X;

/* renamed from: X.9SO, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9SO {
    DOWNLOAD_FINISH(0),
    USER_PAUSE(1),
    CLEAR_CACHE(2),
    NOT_WIFI(3),
    NO_NET(4),
    STORAGE_NOT_ENOUGH(5),
    OTHERS(6);

    public static final C9SQ Companion = new Object() { // from class: X.9SQ
    };
    public final int LJLIL;

    public static C9SO valueOf(String str) {
        return (C9SO) V0N.LJJJ(C9SO.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C9SO(int i) {
        this.LJLIL = i;
    }
}
