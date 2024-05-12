package X;

/* loaded from: classes6.dex */
public enum B5T {
    LIST_PROVIDER_NULL(1),
    USER_IS_HOSTING(2),
    PLAY_FRAGMENT_IS_NULL(3),
    IS_MINOR_AGE(4),
    ROOM_IS_PAID_EVENT(5),
    ROOM_LIVING_SELF(6),
    ROOM_ENTER_API_BROADCASTING(7),
    ENTER_LIVE_PERMISSION_ERROR(8),
    LIVE_SKIP_PAUSE(9),
    LIVE_SKIP_NO_STREAM(10),
    UNSTABLE_CONNECTION(11),
    SUB_ONLY_ERROR(12),
    USER_FETCH_FAILED(13),
    LIVE_PLAYER_ERROR(14),
    ENTER_LIVE_SERVER_ERROR(15),
    ENTER_ROOM_FAIL_OTHER(19),
    USER_REPORT_SUCCESS(21),
    USER_KICK_OUT(22),
    ROOM_FORBIDDEN(23),
    USER_BLOCKED_ANCHOR(24),
    LIVE_ACCESS_RECALL(25),
    USER_KICK_OUT_BY_CREATOR_OR_ADMIN(26),
    REGION_BLOCK(27),
    CRASH_DEFAULT_TYPE(41);

    public final int LJLIL;

    public static B5T valueOf(String str) {
        return (B5T) V0N.LJJJ(B5T.class, str);
    }

    public final int getDetailCode() {
        return this.LJLIL;
    }

    B5T(int i) {
        this.LJLIL = i;
    }
}
