package X;

/* renamed from: X.OGr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC61629OGr {
    DEFAULT(-1),
    TAB_TYPE_DISCOVER(0),
    TAB_TYPE_FOR_YOU(0),
    TAB_TYPE_COLLECT(1),
    TAB_TYPE_LOCAL(2),
    TAB_TYPE_MORE(2);

    public final int LJLIL;

    public static EnumC61629OGr valueOf(String str) {
        return (EnumC61629OGr) V0N.LJJJ(EnumC61629OGr.class, str);
    }

    public final int getPosition() {
        return this.LJLIL;
    }

    EnumC61629OGr(int i) {
        this.LJLIL = i;
    }
}
