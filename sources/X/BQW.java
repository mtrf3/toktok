package X;

/* loaded from: classes6.dex */
public enum BQW {
    L0_FIRST_ENTER_KEY("pm_onboard_full_exp_title"),
    L0_TASK_KEY("pm_onboard_task_to_complete_stage_1"),
    L1_COMPLETE_KEY("pm_onboard_stage_1_completed_banner"),
    L1_TASK_KEY("pm_onboard_task_to_complete_stage_2"),
    L2_COMPLETE_KEY("pm_onboard_stage_2_completed_banner"),
    TNS_STAGE1_KEY("pm_onboard_unable_complete_stage_1_banner"),
    TNS_STAGE2_KEY("pm_onboard_unable_complete_stage_2_banner");

    public final String LJLIL;

    public static BQW valueOf(String str) {
        return (BQW) V0N.LJJJ(BQW.class, str);
    }

    public final String getKey() {
        return this.LJLIL;
    }

    BQW(String str) {
        this.LJLIL = str;
    }
}
