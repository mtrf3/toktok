package X;

/* loaded from: classes6.dex */
public enum BKI {
    NOT_SUB_ONLY_LIVE,
    SUBSCRIBER_NORMAL_LIVE,
    NON_SUBSCRIBER_TRIAL_LIVE,
    NON_SUBSCRIBER_FORBIDDEN_LIVE,
    MODERATOR_NORMAL_LIVE;

    public static BKI valueOf(String str) {
        return (BKI) V0N.LJJJ(BKI.class, str);
    }
}
