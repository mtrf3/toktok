package X;

/* renamed from: X.OqC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63136OqC {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_SHORT_ID("short_id", "BIGINT"),
    COLUMN_CONVERSATION_TYPE("type", "INTEGER"),
    COLUMN_LAST_MSG_INDEX("last_msg_index", "BIGINT"),
    COLUMN_LAST_MSG_UUID("last_msg_uuid", "TEXT"),
    COLUMN_UPDATE_TIME("updated_time", "INTEGER"),
    COLUMN_UNREAD_COUNT("unread_count", "INTEGER"),
    COLUMN_READ_INDEX("read_index", "BIGINT"),
    COLUMN_INBOX("inbox", "INTEGER"),
    COLUMN_MIN_INDEX("min_index", "BIGINT"),
    COLUMN_DRAFT_TIME("drafted_time", "INTEGER"),
    COLUMN_DRAFT_CONTENT("draft_content", "TEXT"),
    COLUMN_LOCAL_INFO("local_info", "TEXT"),
    COLUMN_IS_MEMBER("is_member", "INTEGER"),
    COLUMN_HAS_MORE("has_more", "INTEGER"),
    COLUMN_MEMBER_COUNT("member_count", "INTEGER"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_PARTICIPANT("participant", "TEXT"),
    COLUMN_LAST_MSG_ORDER_INDEX("last_msg_order_index", "BIGINT"),
    COLUMN_STRANGER("stranger", "INTEGER default 0"),
    COLUMN_STRANGER_REQUEST_FILTERED("stranger_request_filtered", "INTEGER default 0"),
    COLUMN_SORT_ORDER("sort_order", "INTEGER"),
    COLUMN_MIN_INDEX_V2("min_index_v2", "BIGINT"),
    COLUMN_MAX_INDEX_V2("max_index_v2", "BIGINT"),
    COLUMN_READ_INDEX_V2("read_index_v2", "BIGINT"),
    COLUMN_BADGE_COUNT("badge_count", "INTEGER"),
    COLUMN_READ_BADGE_COUNT("read_badge_count", "INTEGER"),
    COLUMN_IS_IN_BOX("is_in_box", "INTEGER DEFAULT 0");

    public String key;
    public String type;

    public static EnumC63136OqC valueOf(String str) {
        return (EnumC63136OqC) V0N.LJJJ(EnumC63136OqC.class, str);
    }

    EnumC63136OqC(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
