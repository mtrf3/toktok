package X;

/* renamed from: X.OqU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63154OqU {
    COLUMN_MSG_ID("msg_uuid", "TEXT PRIMARY KEY"),
    COLUMN_SERVER_ID("msg_server_id", "BIGINT"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_CONVERSATION_SHORT_ID("conversation_short_id", "BIGINT"),
    COLUMN_CONVERSATION_TYPE("conversation_type", "INTEGER"),
    COLUMN_MSG_TYPE("type", "INTEGER"),
    COLUMN_INNER_INDEX("index_in_conversation", "BIGINT"),
    COLUMN_ORDER_INDEX("order_index", "BIGINT"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_NET_STATUS("net_status", "INTEGER"),
    COLUMN_VERSION("version", "INTEGER"),
    COLUMN_DELETED("deleted", "INTEGER"),
    COLUMN_CREATE_TIME("created_time", "INTEGER"),
    COLUMN_SENDER("sender", "BIGINT"),
    COLUMN_CONTENT("content", "TEXT"),
    COLUMN_CONTENT_PB("content_pb", "BLOB"),
    COLUMN_SCENE(WM7.SCENE_SERVICE, "TEXT"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_LOCAL_INFO("local_info", "TEXT"),
    COLUMN_READ_STATUS("read_status", "INTEGER"),
    COLUMN_SEC_SENDER("sec_sender", "TEXT"),
    COLUMN_PROPERTY_LIST("property_list", "TEXT"),
    COLUMN_INDEX_IN_CONVERSATION_V2("index_in_conversation_v2", "BIGINT default -1"),
    COLUMN_TABLE_FLAG("table_flag", "BIGINT default 0"),
    COLUMN_CONV_RANK_UPDATE_RULE("conv_rank_update_rule", "INTEGER default 0");

    public String key;
    public String type;

    public static EnumC63154OqU valueOf(String str) {
        return (EnumC63154OqU) V0N.LJJJ(EnumC63154OqU.class, str);
    }

    EnumC63154OqU(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
