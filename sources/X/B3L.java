package X;

/* loaded from: classes6.dex */
public final class B3L {
    public static final B5C LIZ = new B5C("system_exit_player_error", "error_init_player", "Player error, there is some problem while starting player.");
    public static final B5C LIZIZ = new B5C("system_exit_kick_out_by_device", "", "This user is kicked out by other device.");
    public static final B5C LIZJ = new B5C("system_exit_fetch_room_failed", "error_live_ended", "Live has ended.");
    public static final B5C LIZLLL = new B5C("system_exit_enter_room_failed", "error_enter_failed", "Fail to enter the room.");
    public static final B5C LJ = new B5C("system_exit_host_kick_out", "error_host_kick_out", "Blocked by the host.");
    public static final B5C LJFF;
    public static final B5C LJI;
    public static final B5C LJII;

    static {
        new B5C("system_exit_ping_kick_out", "error_ping_kick_out", "Ping kick out.");
        new B5C("system_exit_audience_ping_error", "error_audience_ping_error", "Audience Ping error.");
        new B5C("system_exit_lost_audio_background", "error_no_back", "The live view isn't resumed and lost audio");
        LJFF = new B5C("system_exit_anchor_access_recall", "error_anchor_access_recall", "The anchor's access is recalled");
        LJI = new B5C("system_exit_other_reason", "error_jump_other_room", "Jump to other room");
        LJII = new B5C("system_exit_enter_room_finished", "error_enter_room_finished", "Room finish, live_end");
    }
}
