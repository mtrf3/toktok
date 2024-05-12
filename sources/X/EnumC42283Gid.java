package X;

/* renamed from: X.Gid, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42283Gid {
    OTHER(0),
    PROGRESS(1),
    PROGRESS_WITH_MESSAGE(2),
    DUAL_BALL(3),
    DUAL_BALL_WITH_MESSAGE(4);

    public final int LJLIL;

    public static EnumC42283Gid valueOf(String str) {
        return (EnumC42283Gid) V0N.LJJJ(EnumC42283Gid.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC42283Gid(int i) {
        this.LJLIL = i;
    }
}
