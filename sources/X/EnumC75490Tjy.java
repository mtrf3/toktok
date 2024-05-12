package X;

/* renamed from: X.Tjy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75490Tjy {
    STALL_LIVE_TO_LINKMIC(1),
    STALL_LINKMIC_TO_LIVE(2),
    STALL_LINKMIC_CHANGE_LAYOUT(3),
    STALL_LINKMIC_TO_LINKMIC(4),
    STALL_OTHER(5),
    STALL_ROOM_EXIT(6);

    public final int LJLIL;

    public static EnumC75490Tjy valueOf(String str) {
        return (EnumC75490Tjy) V0N.LJJJ(EnumC75490Tjy.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC75490Tjy(int i) {
        this.LJLIL = i;
    }
}
