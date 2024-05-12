package X;

/* renamed from: X.RxF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC71217RxF {
    AUDIENCE("audience"),
    ANCHOR_AS_AUDIENCE("anchor_as_audience"),
    ROOM_OWNER("roomOwner"),
    MODERATOR("moderator");

    public final String LJLIL;

    public static EnumC71217RxF valueOf(String str) {
        return (EnumC71217RxF) V0N.LJJJ(EnumC71217RxF.class, str);
    }

    public final String getRoleStr() {
        return this.LJLIL;
    }

    EnumC71217RxF(String str) {
        this.LJLIL = str;
    }
}
