package X;

/* renamed from: X.0Kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC05740Kk {
    LIBRARY(0),
    SEARCH(1),
    QUEUE(2),
    REQUEST(3),
    UNKNOWN(-1);

    public static final C05730Kj Companion = new Object() { // from class: X.0Kj
    };
    public final long LJLIL;

    public static EnumC05740Kk valueOf(String str) {
        return (EnumC05740Kk) V0N.LJJJ(EnumC05740Kk.class, str);
    }

    public final long getValue() {
        return this.LJLIL;
    }

    EnumC05740Kk(long j) {
        this.LJLIL = j;
    }
}
