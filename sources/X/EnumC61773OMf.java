package X;

/* renamed from: X.OMf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC61773OMf {
    SUBMIT(1),
    INTERVAL(2),
    CANCEL(3),
    DISLIKE(4),
    PRIORITY(5),
    SWIPE(6),
    CLICK_BLANK(7),
    BACK(8),
    CLICK_VIDEO(9),
    BACKGROUND(10),
    SECONDARY_SUBMIT(21),
    SECONDARY_CANCEL(23);

    public final int LJLIL;

    public static EnumC61773OMf valueOf(String str) {
        return (EnumC61773OMf) V0N.LJJJ(EnumC61773OMf.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC61773OMf(int i) {
        this.LJLIL = i;
    }
}
