package X;

/* loaded from: classes12.dex */
public enum QLI {
    PAGE_START,
    PAGE_END,
    EVENT,
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE_SAMPLE,
    CONFIG_UPDATE,
    /* JADX INFO: Fake field, exist only in values array */
    API_SAMPLE,
    /* JADX INFO: Fake field, exist only in values array */
    UA_UPDATE,
    /* JADX INFO: Fake field, exist only in values array */
    SAVE_ANR_TAG,
    /* JADX INFO: Fake field, exist only in values array */
    SAVE_DNS_REPORT,
    SAVE_MISC_LOG,
    DEVICE_ID_UPDATE,
    CUSTOMER_HEADER_UPDATE,
    UPDATE_GOOGLE_AID,
    /* JADX INFO: Fake field, exist only in values array */
    UPDATE_APP_LANGUAGE_REGION,
    CLEAR_WHEN_SWITCH_CHILD_MODE,
    RESET_WHEN_SWITCH_CHILD_MODE,
    FLUSH_EVENT,
    /* JADX INFO: Fake field, exist only in values array */
    UPDATE_USER_UNIQUE_ID,
    DELAY_START_LOG_REAPER;

    public static QLI valueOf(String str) {
        return (QLI) V0N.LJJJ(QLI.class, str);
    }
}
