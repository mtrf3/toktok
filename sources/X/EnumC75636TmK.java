package X;

/* renamed from: X.TmK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75636TmK {
    DISABLED(1),
    MATCH(10),
    INVITING(11),
    APPLYING(12),
    STATE_WAITING(15),
    CONNECTION_START(20),
    CONNECTION_SUCCEED(21),
    STATE_ONLINE(21),
    CONNECTION_FINISH(30),
    CONNECTION_FINISH_SUCCEED(31),
    STATE_OFFLINE(31),
    UNLOADED(40);

    public int LJLIL;

    public static EnumC75636TmK valueOf(String str) {
        return (EnumC75636TmK) V0N.LJJJ(EnumC75636TmK.class, str);
    }

    public final int getState() {
        return this.LJLIL;
    }

    public final void setState(int i) {
        this.LJLIL = i;
    }

    EnumC75636TmK(int i) {
        this.LJLIL = i;
    }
}
