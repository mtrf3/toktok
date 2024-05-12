package X;

/* loaded from: classes6.dex */
public enum BQU {
    L0_HOST_WITH_LIVE_TASK_UNFINISHED_KEY("pm_LOPV2_goLIVEPage_goLIVEBanner"),
    L0_HOST_WITH_AGE_CHECK_UNFINISHED_KEY("pm_LOPV3_goLIVEPage_ageBanner"),
    L1_HOST_FIRST_ENTER_PREVIEW_LIVE_KEY("pm_LOPV4_goLIVEPage_completeBanner"),
    HOST_WITH_SCREEN_SHOT_BANNED_KEY("pm_LOPV5_goLIVEPage_progressHoldBanner");

    public final String LJLIL;

    public static BQU valueOf(String str) {
        return (BQU) V0N.LJJJ(BQU.class, str);
    }

    public final String getKey() {
        return this.LJLIL;
    }

    BQU(String str) {
        this.LJLIL = str;
    }
}
