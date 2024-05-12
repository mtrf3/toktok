package X;

/* renamed from: X.9SN, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9SN {
    UNINITIALIZED(-1),
    USER_PAUSE(0),
    DOWNLOADING(1),
    PAUSE_NO_NETWORK(2),
    PAUSE_NOT_WIFI(3),
    PAUSE_STORAGE(4),
    DOWNLOADED(5);

    public static final C9SP Companion = new Object() { // from class: X.9SP
    };
    public final int LJLIL;

    public static C9SN valueOf(String str) {
        return (C9SN) V0N.LJJJ(C9SN.class, str);
    }

    public final boolean isPauseByNet() {
        return C47261Igj.LJJIJIIJI(PAUSE_NOT_WIFI, PAUSE_NO_NETWORK).contains(this);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C9SN(int i) {
        this.LJLIL = i;
    }
}
