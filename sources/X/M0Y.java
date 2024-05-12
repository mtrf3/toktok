package X;

/* loaded from: classes10.dex */
public enum M0Y {
    IDLE,
    API_REQUEST_START,
    API_RESPONSE_PROCESS_START,
    ICON_UPDATE_START,
    ICON_SHOW_ANIMATION_START,
    ICON_SHOW_ANIMATION_END,
    ICON_STAY_START,
    ICON_STAY_END,
    ICON_HIDE_ANIMATION_START,
    ICON_HIDE_ANIMATION_END,
    ICON_UPDATE_END,
    DOT_UPDATE_START,
    DOT_UPDATE_END,
    COMPLETE;

    public static M0Y valueOf(String str) {
        return (M0Y) V0N.LJJJ(M0Y.class, str);
    }
}
