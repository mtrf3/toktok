package X;

/* renamed from: X.9SV, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9SV {
    ACTION_NOT_AVAILABLE_TOAST,
    SCREEN_RECORDING_TOAST,
    WATCH_ALL_OFFLINE_VIDEOS_TOAST("watch_all_offline_videos");

    public final String LJLIL;

    public static C9SV valueOf(String str) {
        return (C9SV) V0N.LJJJ(C9SV.class, str);
    }

    public final String getMobName() {
        return this.LJLIL;
    }

    /* synthetic */ C9SV() {
        this("");
    }

    C9SV(String str) {
        this.LJLIL = str;
    }
}
