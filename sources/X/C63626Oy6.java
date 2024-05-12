package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.Oy6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63626Oy6 {
    public static String LIZ(int i) {
        EnumC63625Oy5 fromValue = EnumC63625Oy5.fromValue(i);
        if (fromValue != null) {
            if (fromValue == EnumC63625Oy5.SEND_MESSAGE) {
                return "v1/message/send";
            }
            if (fromValue == EnumC63625Oy5.REACTION_MESSAGE) {
                return "v1/message/reaction";
            }
            if (fromValue == EnumC63625Oy5.GET_MESSAGES_BY_USER) {
                return "v1/message/get_by_user";
            }
            if (fromValue == EnumC63625Oy5.REPORT_GET_MESSAGES_CURSOR) {
                return "v1/message/report_cursor";
            }
            if (fromValue == EnumC63625Oy5.GET_MESSAGES_BY_USER_INIT_V2) {
                return "v2/message/get_by_user_init";
            }
            if (fromValue == EnumC63625Oy5.CHECK_MESSAGES_BY_USER) {
                return "v1/message/check_by_user";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_LIST) {
                return "v1/conversation/get_list";
            }
            if (fromValue == EnumC63625Oy5.GET_MESSAGES_BY_CONVERSATION) {
                return "v1/message/get_by_conversation";
            }
            if (fromValue == EnumC63625Oy5.SEND_ONLINE) {
                return "v1/account/online";
            }
            if (fromValue == EnumC63625Oy5.SEND_OFFLINE) {
                return "v1/account/offline";
            }
            if (fromValue == EnumC63625Oy5.MARK_CONVERSATION_DELETE) {
                return "v1/conversation/delete";
            }
            if (fromValue == EnumC63625Oy5.MARK_CONVERSATION_READ) {
                return "v1/conversation/mark_read";
            }
            if (fromValue == EnumC63625Oy5.BATCH_MARK_CONVERSATION_READ) {
                return "v2/conversation/batch_mark_read";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_INFO_V2) {
                return "v2/conversation/get_info";
            }
            if (fromValue == EnumC63625Oy5.CREATE_CONVERSATION_V2) {
                return "v2/conversation/create";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_INFO_LIST_V2) {
                return "v2/conversation/get_info_list";
            }
            if (fromValue == EnumC63625Oy5.CONVERSATION_PARTICIPANTS_LIST) {
                return "v1/conversation/participants_list";
            }
            if (fromValue == EnumC63625Oy5.ADD_CONVERSATION_PARTICIPANTS) {
                return "v1/conversation/add_participants";
            }
            if (fromValue == EnumC63625Oy5.REMOVE_CONVERSATION_PARTICIPANTS) {
                return "v1/conversation/remove_participants";
            }
            if (fromValue == EnumC63625Oy5.LEAVE_CONVERSATION) {
                return "v1/conversation/leave";
            }
            if (fromValue == EnumC63625Oy5.MGET_CONVERSATION_PARTICIPANTS) {
                return "v1/conversation/mget_participants";
            }
            if (fromValue == EnumC63625Oy5.UPDATE_CONVERSATION_PARTICIPANT) {
                return "v1/conversation/update_participant";
            }
            if (fromValue == EnumC63625Oy5.DELETE_MESSAGE) {
                return "v1/message/delete";
            }
            if (fromValue == EnumC63625Oy5.RECALL_MESSAGE) {
                return "v1/message/recall";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_CORE_INFO) {
                return "v1/conversation/get_core_info";
            }
            if (fromValue == EnumC63625Oy5.SET_CONVERSATION_CORE_INFO) {
                return "v1/conversation/set_core_info";
            }
            if (fromValue == EnumC63625Oy5.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return "v1/conversation/upsert_core_ext_info";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_SETTING_INFO) {
                return "v1/conversation/get_setting_info";
            }
            if (fromValue == EnumC63625Oy5.SET_CONVERSATION_SETTING_INFO) {
                return "v1/conversation/set_setting_info";
            }
            if (fromValue == EnumC63625Oy5.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return "v1/conversation/upsert_settings_ext";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2) {
                return "v2/conversation/get_by_favorite";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_INFO_LIST_BY_TOP_V2) {
                return "v2/conversation/get_by_top";
            }
            if (fromValue == EnumC63625Oy5.GET_STRANGER_CONVERSATION_LIST) {
                return "v1/stranger/get_conversation_list";
            }
            if (fromValue == EnumC63625Oy5.GET_STRANGER_MESSAGES_IN_CONVERSATION) {
                return "v1/stranger/get_messages";
            }
            if (fromValue == EnumC63625Oy5.DELETE_STRANGER_MESSAGE) {
                return "v1/stranger/delete_message";
            }
            if (fromValue == EnumC63625Oy5.DELETE_STRANGER_CONVERSATION) {
                return "v1/stranger/delete_conversation";
            }
            if (fromValue == EnumC63625Oy5.DELETE_ALL_STRANGER_CONVERSATIONS) {
                return "v1/stranger/delete_all_conversations";
            }
            if (fromValue == EnumC63625Oy5.MARK_STRANGER_CONVERSATION_READ) {
                return "v1/stranger/mark_read_conversation";
            }
            if (fromValue == EnumC63625Oy5.MARK_ALL_STRANGER_CONVERSATIONS_READ) {
                return "v1/stranger/mark_read_all_conversations";
            }
            if (fromValue == EnumC63625Oy5.SEND_USER_ACTION) {
                return "v1/client/user_action";
            }
            if (fromValue == EnumC63625Oy5.SEND_INPUT_STATUS) {
                return "v1/client/input_status";
            }
            if (fromValue == EnumC63625Oy5.DISSOLVE_CONVERSATION) {
                return "v1/conversation/dissolve";
            }
            if (fromValue == EnumC63625Oy5.SET_MESSAGE_PROPERTY) {
                return "v1/message/set_property";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3) {
                return "v3/conversation/get_read_index";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3) {
                return "v3/conversation/get_min_index";
            }
            if (fromValue == EnumC63625Oy5.MARK_CONVERSATION_READ_V3) {
                return "v3/conversation/mark_read";
            }
            if (fromValue == EnumC63625Oy5.GET_MEDIA_UPLOAD_TOKEN) {
                return "v1/media/get_upload_token";
            }
            if (fromValue == EnumC63625Oy5.GET_MEDIA_URLS) {
                return "v1/media/get_urls";
            }
            if (fromValue == EnumC63625Oy5.GET_USER_CONVERSATION_LIST) {
                return "v1/conversation/list";
            }
            if (fromValue == EnumC63625Oy5.BROADCAST_SEND_MESSAGE) {
                return "v1/broadcast/send_message";
            }
            if (fromValue == EnumC63625Oy5.BROADCAST_RECV_MESSAGE) {
                return "v1/broadcast/recv_message";
            }
            if (fromValue == EnumC63625Oy5.BROADCAST_USER_COUNTER) {
                return "v1/broadcast/user_counter";
            }
            if (fromValue == EnumC63625Oy5.CLIENT_ACK) {
                return "v1/client/ack";
            }
            if (fromValue == EnumC63625Oy5.PROFILE_GET_INFO) {
                return "v1/profile/get_info";
            }
            if (fromValue == EnumC63625Oy5.CREATE_VOIP) {
                return "v1/voip/create";
            }
            if (fromValue == EnumC63625Oy5.CALL_VOIP) {
                return "v1/voip/call";
            }
            if (fromValue == EnumC63625Oy5.UPDATE_VOIP) {
                return "v1/voip/update";
            }
            if (fromValue == EnumC63625Oy5.HEARTBEAT_CHANNEL) {
                return "v1/channel/heartbeat";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATIONS_CHECKINFO) {
                return "v1/conversation/get_checkinfo";
            }
            if (fromValue == EnumC63625Oy5.GET_MESSAGES_CHECKINFO_IN_CONVERSATION) {
                return "v1/message/get_checkinfo";
            }
            if (fromValue == EnumC63625Oy5.REPORT_CLIENT_METRICS) {
                return "v1/client/report_metrics";
            }
            if (fromValue == EnumC63625Oy5.GET_CONFIGS) {
                return "v1/config/get";
            }
            if (fromValue == EnumC63625Oy5.UNREAD_COUNT_REPORT) {
                return "v1/client/unread_count";
            }
            if (fromValue == EnumC63625Oy5.BATCH_UPDATE_CONVERSATION_PARTICIPANT) {
                return "v1/conversation/batch_update_participant";
            }
            if (fromValue == EnumC63625Oy5.GET_TICKET) {
                return "v1/conversation/get_ticket";
            }
            if (fromValue == EnumC63625Oy5.BLOCK_MEMBERS) {
                return "v1/conversation/block_member";
            }
            if (fromValue == EnumC63625Oy5.BLOCK_CONVERSATION) {
                return "v1/conversation/block_conversation";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_AUDIT_SWITCH) {
                return "v1/conversation/get_audit";
            }
            if (fromValue == EnumC63625Oy5.UPDATE_CONVERSATION_AUDIT_SWITCH) {
                return "v1/conversation/update_audit";
            }
            if (fromValue == EnumC63625Oy5.SEND_CONVERSATION_APPLY) {
                return "v1/conversation/send_apply";
            }
            if (fromValue == EnumC63625Oy5.ACK_CONVERSATION_APPLY) {
                return "v1/conversation/ack_apply";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_AUDIT_LIST) {
                return "v1/conversation/get_audit_list";
            }
            if (fromValue == EnumC63625Oy5.GET_CONVERSATION_AUDIT_UNREAD) {
                return "v1/conversation/get_audit_unread";
            }
            if (fromValue == EnumC63625Oy5.CLEAR_CONVERSATION_AUDIT_UNREAD) {
                return "v1/conversation/clear_audit_unread";
            }
            if (fromValue == EnumC63625Oy5.SEND_MESSAGE_P2P) {
                return "v1/send_message/p2p";
            }
            if (fromValue == EnumC63625Oy5.GET_BLOCKLIST) {
                return "v1/blacklist/get";
            }
            if (fromValue == EnumC63625Oy5.SET_BLOCKLIST) {
                return "v1/blacklist/set";
            }
            if (fromValue == EnumC63625Oy5.CHECK_IN_BLOCKLIST) {
                return "v1/blacklist/check";
            }
            if (fromValue == EnumC63625Oy5.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX) {
                return "v1/conversation/batch_get_conversation_participants_readindex";
            }
            if (fromValue == EnumC63625Oy5.MARK_MESSAGE) {
                return "v1/message/mark";
            }
            if (fromValue == EnumC63625Oy5.PULL_MARK_MESSAGE) {
                return "v1/message/pull_mark";
            }
            if (fromValue == EnumC63625Oy5.GET_RECENT_MESSAGE) {
                return "v1/message/get_recent_message/";
            }
            if (fromValue == EnumC63625Oy5.GET_CMD_MESSAGE) {
                return "v1/message/get_cmd_message/";
            }
            if (fromValue == EnumC63625Oy5.GET_MESSAGE_INFO_BY_INDEX_V2_RANGE) {
                return "v1/message/get_message_by_index_v2_range/";
            }
            if (fromValue == EnumC63625Oy5.GET_MESSAGE_INFO_BY_SERVER_ID) {
                return "v1/message/get_message_by_server_id";
            }
            if (fromValue == EnumC63625Oy5.BATCH_GET_CONVERSATION_AUDIT_UNREAD) {
                return "v1/conversation/batch_get_audit_unread";
            }
            if (fromValue == EnumC63625Oy5.BATCH_UNMARK_MESSAGE) {
                return "v1/message/batch_unmark";
            }
            if (fromValue == EnumC63625Oy5.MARK_MSG_UNREAD_COUNT_REPORT) {
                return "v1/message/report_mark_count";
            }
            if (fromValue == EnumC63625Oy5.MARK_MSG_GET_UNREAD_COUNT) {
                return "v1/message/get_mark_count";
            }
            if (fromValue == EnumC63625Oy5.CLIENT_BATCH_ACK) {
                return "v1/client/batch_ack";
            }
            if (fromValue == EnumC63625Oy5.JOIN_VOIP) {
                return "v1/voip/join";
            }
            switch (C63627Oy7.LIZ[fromValue.ordinal()]) {
                case 1:
                    return "v1/message/previewer_get_by_conversation";
                case 2:
                    return "v2/conversation/previewer_get_info_list";
                case 3:
                    return "v1/profile/batch_get_info";
                case 4:
                    return "v1/friend/delete";
                case 5:
                    return "v1/friend/get_list";
                case 6:
                    return "v1/friend/reply_apply";
                case 7:
                    return "v1/friend/get_receive_apply_list";
                case 8:
                    return "v1/friend/get_apply_list";
                case 9:
                    return "v1/friend/send_apply";
                case 10:
                    return "v1/profile/search_info";
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    return "v1/message/get";
                case 12:
                    return "v1/message/batch_get";
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    return "v1/message/ack";
                case 14:
                    return "v2/conversation/get_check_info";
                case 15:
                    return "v2/message/get_check_info";
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    return "v1/message/batch_ack";
                case 17:
                    return "v1/conversation/batch_delete";
                default:
                    throw new IllegalArgumentException("cmd not find!");
            }
        }
        throw new NullPointerException("cmd is null");
    }
}
