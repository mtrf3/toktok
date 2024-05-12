package X;

/* renamed from: X.R1f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68871R1f {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        switch (i) {
            case 100:
                return "foreground_online_time";
            case 101:
                return "foreground_offline_time";
            case 102:
                return "foreground_close_time";
            case 103:
                return "background_online_time";
            case 104:
                return "background_offline_time";
            case 105:
                return "background_close_time";
            default:
                return "prepare_time";
        }
    }

    public static String LIZIZ(int i) {
        return i != 1 ? i != 2 ? "SCENE_NONE" : "SCENE_INBOX_TAB" : "SCENE_CHAT_ROOM";
    }

    public static String LIZJ(int i) {
        switch (i) {
            case 100:
                return "STATE_FOREGROUND_CONNECTED";
            case 101:
                return "STATE_FOREGROUND_DISCONNECTED";
            case 102:
                return "STATE_FOREGROUND_ACTIVELY_DISCONNECTED";
            case 103:
                return "STATE_BACKGROUND_CONNECTED";
            case 104:
                return "STATE_BACKGROUND_DISCONNECTED";
            case 105:
                return "STATE_BACKGROUND_ACTIVELY_DISCONNECTED";
            default:
                return "STATE_UNKNOWN";
        }
    }
}
