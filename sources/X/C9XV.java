package X;

/* renamed from: X.9XV, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9XV {
    LONG_PRESS(0),
    SCREEN_RECORD(1),
    CLICK_EXIT(2),
    SWITCH_PAGE(3),
    PINCH_ZOOM(4);

    public final int LJLIL;

    public static C9XV valueOf(String str) {
        return (C9XV) V0N.LJJJ(C9XV.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    C9XV(int i) {
        this.LJLIL = i;
    }
}
