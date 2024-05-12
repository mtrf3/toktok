package X;

/* loaded from: classes14.dex */
public enum UCK {
    NONE("None"),
    PREVIEW("Preview"),
    PROGRESS("Progress"),
    PROGRESS_RESULT("ProgressResult"),
    REWARD("Reward"),
    REWARD_RESULT("RewardResult"),
    STRIKE_CARD("StrikeCard"),
    SMOKE_CARD("SmokeCard");

    public final String LJLIL;

    public static UCK valueOf(String str) {
        return (UCK) V0N.LJJJ(UCK.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    UCK(String str) {
        this.LJLIL = str;
    }
}
