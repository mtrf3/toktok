package X;

import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.im.core.proto.AckMessageResponseBody;
import com.bytedance.im.core.proto.BatchDeleteConversationResponseBody;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody;
import com.bytedance.im.core.proto.BatchGetMessagesResponseBody;
import com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody;
import com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody;
import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.BlockMembersResponseBody;
import com.bytedance.im.core.proto.BroadcastUserCounterResponseBody;
import com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody;
import com.bytedance.im.core.proto.ConversationParticipantsListResponseBody;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.bytedance.im.core.proto.DeleteMultiStrangerConversationResponseBody;
import com.bytedance.im.core.proto.GetCmdMessageRespBody;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody;
import com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody;
import com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody;
import com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody;
import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody;
import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody;
import com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody;
import com.bytedance.im.core.proto.GetConversationsCheckInfoV2ResponseBody;
import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody;
import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody;
import com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody;
import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.GetStrangerMessagesResponseBody;
import com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody;
import com.bytedance.im.core.proto.GetTicketResponseBody;
import com.bytedance.im.core.proto.GetUserConversationListResponseBody;
import com.bytedance.im.core.proto.InputStatusNotify;
import com.bytedance.im.core.proto.MarkConversationReadNotify;
import com.bytedance.im.core.proto.MarkMessageResponseBody;
import com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody;
import com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody;
import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadResponseBody;
import com.bytedance.im.core.proto.MessageByInitResponseBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserComboInboxTypeResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserInitComboInboxTypeResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody;
import com.bytedance.im.core.proto.NewDirectPushNotify;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody;
import com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody;
import com.bytedance.im.core.proto.PullMarkMessageResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SendInputStatusResponseBody;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.bytedance.im.core.proto.StrangerNewMessageNotify;
import com.bytedance.im.core.proto.UnReadCountReportResponseBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Z8u, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89452Z8u extends ProtoAdapter<ResponseBody> {
    public static final HashMap<Integer, ProtoAdapter> LJ = new HashMap<>();

    public C89452Z8u() {
        super(FieldEncoding.LENGTH_DELIMITED, ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ResponseBody decode(ProtoReader protoReader) {
        C89454Z8w c89454Z8w = new C89454Z8w();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 100:
                        c89454Z8w.LIZLLL = SendMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 200:
                        c89454Z8w.LJ = MessagesPerUserResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 203:
                        c89454Z8w.LJFF = MessagesPerUserInitV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 204:
                        c89454Z8w.LJI = MessagesPerUserComboInboxTypeResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 205:
                        c89454Z8w.LJII = MessagesPerUserInitComboInboxTypeResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 210:
                        c89454Z8w.LJIIIIZZ = CheckMessagesPerUserResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 211:
                        c89454Z8w.LJIIIZ = GetMessageByIdResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 301:
                        c89454Z8w.LJIIJ = MessagesInConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 302:
                        c89454Z8w.LJIIJJI = GetMessagesCheckInfoInConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 303:
                        c89454Z8w.LJIIL = GetMessagesCheckInfoV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 410:
                        c89454Z8w.LJIILIIL = RR0.ADAPTER.decode(protoReader);
                        break;
                    case 411:
                        c89454Z8w.LJIILJJIL = SendInputStatusResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case LiveMaxRetainAlogMessageSizeSetting.DEFAULT /* 500 */:
                        c89454Z8w.LJIILL = NewMessageNotify.ADAPTER.decode(protoReader);
                        break;
                    case 501:
                        c89454Z8w.LJIILLIIL = MarkConversationReadNotify.ADAPTER.decode(protoReader);
                        break;
                    case 503:
                        c89454Z8w.LJIIZILJ = StrangerNewMessageNotify.ADAPTER.decode(protoReader);
                        break;
                    case 504:
                        c89454Z8w.LJIJ = NewDirectPushNotify.ADAPTER.decode(protoReader);
                        break;
                    case 510:
                        c89454Z8w.LJIJI = InputStatusNotify.ADAPTER.decode(protoReader);
                        break;
                    case 605:
                        c89454Z8w.LJJIIJZLJL = ConversationParticipantsListResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 608:
                        c89454Z8w.LJJI = GetConversationInfoV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 609:
                        c89454Z8w.LJJIFFI = CreateConversationV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 610:
                        c89454Z8w.LJJII = GetConversationInfoListV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 611:
                        c89454Z8w.LJJIII = GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 612:
                        c89454Z8w.LJJIIJ = GetConversationInfoListByTopV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 613:
                        c89454Z8w.LJIJJ = BatchMarkConversationReadResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 615:
                        c89454Z8w.LJIJJLI = GetConversationsCheckInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 616:
                        c89454Z8w.LJIL = GetConversationsCheckInfoV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 617:
                        c89454Z8w.LJJ = BatchDeleteConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 650:
                        c89454Z8w.LJJIIZ = ConversationAddParticipantsResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 651:
                        c89454Z8w.LJJIIZI = ConversationRemoveParticipantsResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 655:
                        c89454Z8w.LJJIJ = UpdateConversationParticipantResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 656:
                        c89454Z8w.LJJIJIIJI = BatchUpdateConversationParticipantResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 702:
                        c89454Z8w.LJJIJIIJIL = C69533RQr.ADAPTER.decode(protoReader);
                        break;
                    case 705:
                        c89454Z8w.LJJIJIL = ModifyMessagePropertyResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 706:
                        c89454Z8w.LJJIJL = AckMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 707:
                        c89454Z8w.LJJIJLIJ = RQU.ADAPTER.decode(protoReader);
                        break;
                    case 902:
                        c89454Z8w.LJJIL = SetConversationCoreInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 904:
                        c89454Z8w.LJJIZ = UpsertConversationCoreExtInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 921:
                        c89454Z8w.LJJJ = SetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 922:
                        c89454Z8w.LJJJI = UpsertConversationSettingExtInfoResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 1000:
                        c89454Z8w.LJJJIL = GetStrangerConversationListResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 1001:
                        c89454Z8w.LJJJJ = GetStrangerMessagesResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 1002:
                        c89454Z8w.LJJJJI = C69536RQu.ADAPTER.decode(protoReader);
                        break;
                    case 1003:
                        c89454Z8w.LJJJJIZL = C69530RQo.ADAPTER.decode(protoReader);
                        break;
                    case 1004:
                        c89454Z8w.LJJJJJ = C69527RQl.ADAPTER.decode(protoReader);
                        break;
                    case 1005:
                        c89454Z8w.LJJJJJL = C69518RQc.ADAPTER.decode(protoReader);
                        break;
                    case 1006:
                        c89454Z8w.LJJJJL = RQZ.ADAPTER.decode(protoReader);
                        break;
                    case 1007:
                        c89454Z8w.LJJJJLI = GetStrangerUnreadCountResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 1009:
                        c89454Z8w.LJJJJLL = DeleteMultiStrangerConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 1010:
                        c89454Z8w.LJJJJZ = MarkMultiStrangerConversationReadResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case LiveNetAdaptiveHurryTimeSetting.DEFAULT /* 2000 */:
                        c89454Z8w.LJJJJZI = GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2001:
                        c89454Z8w.LJJJLIIL = GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2005:
                        c89454Z8w.LJJJLL = GetTicketResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2006:
                        c89454Z8w.LJJJLZIJ = GetUserConversationListResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2009:
                        c89454Z8w.LJJJZ = BroadcastUserCounterResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2016:
                        c89454Z8w.LJJL = C69539RQx.ADAPTER.decode(protoReader);
                        break;
                    case 2017:
                        c89454Z8w.LJJLI = GetConfigsResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2018:
                        c89454Z8w.LJJLIIIIJ = UnReadCountReportResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2019:
                        c89454Z8w.LJJLIIIJ = BlockMembersResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2020:
                        c89454Z8w.LJJLIIIJILLIZJL = C69521RQf.ADAPTER.decode(protoReader);
                        break;
                    case 2035:
                        c89454Z8w.LJJLIIIJJI = GetMessageInfoByIndexV2ResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2036:
                        c89454Z8w.LJJLIIIJJIZ = MarkMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2037:
                        c89454Z8w.LJJLIIIJL = PullMarkMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2038:
                        c89454Z8w.LJJLIIIJLJLI = BatchGetConversationParticipantsReadIndexResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2039:
                        c89454Z8w.LJJLIIIJLLLLLLLZ = GetRecentMessageRespBody.ADAPTER.decode(protoReader);
                        break;
                    case 2040:
                        c89454Z8w.LJJLIIJ = GetCmdMessageRespBody.ADAPTER.decode(protoReader);
                        break;
                    case 2041:
                        c89454Z8w.LJJLIL = GetMessageInfoByIndexV2RangeResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2043:
                        c89454Z8w.LJJLJ = MessageByInitResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2044:
                        c89454Z8w.LJJLJLI = PreviewerMessagesInConversationResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2045:
                        c89454Z8w.LJJLL = PreviewerGetConversationInfoListResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2054:
                        c89454Z8w.LJJZ = MarkMsgUnreadCountReportResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2055:
                        c89454Z8w.LJJZZI = MarkMsgGetUnreadCountResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2056:
                        c89454Z8w.LJJZZIII = BatchUnmarkMessageResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2057:
                        c89454Z8w.LJL = C69524RQi.ADAPTER.decode(protoReader);
                        break;
                    case 2103:
                        c89454Z8w.LJLI = ConversationMessagePreViewResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2200:
                        c89454Z8w.LJLIIIL = GetMessagesResponseBody.ADAPTER.decode(protoReader);
                        break;
                    case 2201:
                        c89454Z8w.LJLIIL = BatchGetMessagesResponseBody.ADAPTER.decode(protoReader);
                        break;
                    default:
                        HashMap<Integer, ProtoAdapter> hashMap = LJ;
                        if (hashMap.get(Integer.valueOf(nextTag)) == null) {
                            break;
                        } else {
                            ProtoAdapter protoAdapter = hashMap.get(Integer.valueOf(nextTag));
                            Object decode = hashMap.get(Integer.valueOf(nextTag)).decode(protoReader);
                            c89454Z8w.LJLIL.put(Integer.valueOf(nextTag), new Pair<>(protoAdapter, decode));
                            c89454Z8w.LJLILLLLZI.put(C16880lQ.LJLLJ(decode.getClass()), decode);
                            break;
                        }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c89454Z8w.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ResponseBody responseBody) {
        ResponseBody responseBody2 = responseBody;
        int size = responseBody2.unknownFields().size() + BatchGetMessagesResponseBody.ADAPTER.encodedSizeWithTag(2201, responseBody2.batch_get_messages_body) + GetMessagesResponseBody.ADAPTER.encodedSizeWithTag(2200, responseBody2.get_messages_body) + ConversationMessagePreViewResponseBody.ADAPTER.encodedSizeWithTag(2103, responseBody2.conversation_message_pre_view_body) + C69524RQi.ADAPTER.encodedSizeWithTag(2057, responseBody2.client_batch_ack_body) + BatchUnmarkMessageResponseBody.ADAPTER.encodedSizeWithTag(2056, responseBody2.batch_unmark_message) + MarkMsgGetUnreadCountResponseBody.ADAPTER.encodedSizeWithTag(2055, responseBody2.mark_msg_get_unread_count) + MarkMsgUnreadCountReportResponseBody.ADAPTER.encodedSizeWithTag(2054, responseBody2.mark_msg_unread_count_report) + PreviewerGetConversationInfoListResponseBody.ADAPTER.encodedSizeWithTag(2045, responseBody2.previewer_get_conversation_info_list_body) + PreviewerMessagesInConversationResponseBody.ADAPTER.encodedSizeWithTag(2044, responseBody2.previewer_messages_in_conversation_body) + MessageByInitResponseBody.ADAPTER.encodedSizeWithTag(2043, responseBody2.message_by_init) + GetMessageInfoByIndexV2RangeResponseBody.ADAPTER.encodedSizeWithTag(2041, responseBody2.get_message_info_by_index_v2_range_body) + GetCmdMessageRespBody.ADAPTER.encodedSizeWithTag(2040, responseBody2.get_cmd_message_body) + GetRecentMessageRespBody.ADAPTER.encodedSizeWithTag(2039, responseBody2.get_recent_message_body) + BatchGetConversationParticipantsReadIndexResponseBody.ADAPTER.encodedSizeWithTag(2038, responseBody2.batch_get_conversation_participants_readindex) + PullMarkMessageResponseBody.ADAPTER.encodedSizeWithTag(2037, responseBody2.pull_mark_message_body) + MarkMessageResponseBody.ADAPTER.encodedSizeWithTag(2036, responseBody2.mark_message_body) + GetMessageInfoByIndexV2ResponseBody.ADAPTER.encodedSizeWithTag(2035, responseBody2.get_message_info_by_index_v2_body) + C69521RQf.ADAPTER.encodedSizeWithTag(2020, responseBody2.block_conversation_body) + BlockMembersResponseBody.ADAPTER.encodedSizeWithTag(2019, responseBody2.block_members_body) + UnReadCountReportResponseBody.ADAPTER.encodedSizeWithTag(2018, responseBody2.unread_count_report_body) + GetConfigsResponseBody.ADAPTER.encodedSizeWithTag(2017, responseBody2.get_configs_body) + C69539RQx.ADAPTER.encodedSizeWithTag(2016, responseBody2.report_client_metrics_body) + BroadcastUserCounterResponseBody.ADAPTER.encodedSizeWithTag(2009, responseBody2.broadcast_user_counter_body) + GetUserConversationListResponseBody.ADAPTER.encodedSizeWithTag(2006, responseBody2.get_conversation_list_body) + GetTicketResponseBody.ADAPTER.encodedSizeWithTag(2005, responseBody2.get_ticket_body) + GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(2001, responseBody2.participants_min_index_body) + GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(LiveNetAdaptiveHurryTimeSetting.DEFAULT, responseBody2.participants_read_index_body) + MarkMultiStrangerConversationReadResponseBody.ADAPTER.encodedSizeWithTag(1010, responseBody2.mark_multi_stranger_conversation_read_body) + DeleteMultiStrangerConversationResponseBody.ADAPTER.encodedSizeWithTag(1009, responseBody2.delete_multi_stranger_conversation_body) + GetStrangerUnreadCountResponseBody.ADAPTER.encodedSizeWithTag(1007, responseBody2.get_stranger_unread_count_body) + RQZ.ADAPTER.encodedSizeWithTag(1006, responseBody2.mark_stranger_all_conversation_read_body) + C69518RQc.ADAPTER.encodedSizeWithTag(1005, responseBody2.mark_stranger_conversation_read_body) + C69527RQl.ADAPTER.encodedSizeWithTag(1004, responseBody2.delete_stranger_all_conversation_body) + C69530RQo.ADAPTER.encodedSizeWithTag(1003, responseBody2.delete_stranger_conversation_body) + C69536RQu.ADAPTER.encodedSizeWithTag(1002, responseBody2.delete_stranger_message_body) + GetStrangerMessagesResponseBody.ADAPTER.encodedSizeWithTag(1001, responseBody2.get_stranger_messages_body) + GetStrangerConversationListResponseBody.ADAPTER.encodedSizeWithTag(1000, responseBody2.get_stranger_conversation_body) + UpsertConversationSettingExtInfoResponseBody.ADAPTER.encodedSizeWithTag(922, responseBody2.upsert_conversation_setting_ext_info_body) + SetConversationSettingInfoResponseBody.ADAPTER.encodedSizeWithTag(921, responseBody2.set_conversation_setting_info_body) + UpsertConversationCoreExtInfoResponseBody.ADAPTER.encodedSizeWithTag(904, responseBody2.upsert_conversation_core_ext_info_body) + SetConversationCoreInfoResponseBody.ADAPTER.encodedSizeWithTag(902, responseBody2.set_conversation_core_info_body) + RQU.ADAPTER.encodedSizeWithTag(707, responseBody2.batch_ack_message_body) + AckMessageResponseBody.ADAPTER.encodedSizeWithTag(706, responseBody2.ack_message_body) + ModifyMessagePropertyResponseBody.ADAPTER.encodedSizeWithTag(705, responseBody2.modify_message_property_body) + C69533RQr.ADAPTER.encodedSizeWithTag(702, responseBody2.recall_message_body) + BatchUpdateConversationParticipantResponseBody.ADAPTER.encodedSizeWithTag(656, responseBody2.batch_update_conversation_participant_body) + UpdateConversationParticipantResponseBody.ADAPTER.encodedSizeWithTag(655, responseBody2.update_conversation_participant_body) + ConversationRemoveParticipantsResponseBody.ADAPTER.encodedSizeWithTag(651, responseBody2.conversation_remove_participants_body) + ConversationAddParticipantsResponseBody.ADAPTER.encodedSizeWithTag(650, responseBody2.conversation_add_participants_body) + ConversationParticipantsListResponseBody.ADAPTER.encodedSizeWithTag(605, responseBody2.conversation_participants_body) + GetConversationInfoListByTopV2ResponseBody.ADAPTER.encodedSizeWithTag(612, responseBody2.get_conversation_info_list_by_top_v2_body) + GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.encodedSizeWithTag(611, responseBody2.get_conversation_info_list_by_favorite_v2_body) + GetConversationInfoListV2ResponseBody.ADAPTER.encodedSizeWithTag(610, responseBody2.get_conversation_info_list_v2_body) + CreateConversationV2ResponseBody.ADAPTER.encodedSizeWithTag(609, responseBody2.create_conversation_v2_body) + GetConversationInfoV2ResponseBody.ADAPTER.encodedSizeWithTag(608, responseBody2.get_conversation_info_v2_body) + BatchDeleteConversationResponseBody.ADAPTER.encodedSizeWithTag(617, responseBody2.batch_delete_conversation_body) + GetConversationsCheckInfoV2ResponseBody.ADAPTER.encodedSizeWithTag(616, responseBody2.get_conversations_check_info_v2_body) + GetConversationsCheckInfoResponseBody.ADAPTER.encodedSizeWithTag(615, responseBody2.get_conversations_checkinfo_body) + BatchMarkConversationReadResponseBody.ADAPTER.encodedSizeWithTag(613, responseBody2.batch_mark_read_body) + InputStatusNotify.ADAPTER.encodedSizeWithTag(510, responseBody2.input_status_notify) + NewDirectPushNotify.ADAPTER.encodedSizeWithTag(504, responseBody2.has_new_direct_push_notify) + StrangerNewMessageNotify.ADAPTER.encodedSizeWithTag(503, responseBody2.stranger_has_new_message_notify) + MarkConversationReadNotify.ADAPTER.encodedSizeWithTag(501, responseBody2.mark_conversation_read_notify) + NewMessageNotify.ADAPTER.encodedSizeWithTag(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, responseBody2.has_new_message_notify) + SendInputStatusResponseBody.ADAPTER.encodedSizeWithTag(411, responseBody2.send_input_status_body) + RR0.ADAPTER.encodedSizeWithTag(410, responseBody2.send_user_action_body) + GetMessagesCheckInfoV2ResponseBody.ADAPTER.encodedSizeWithTag(303, responseBody2.get_message_check_info_v2_body) + GetMessagesCheckInfoInConversationResponseBody.ADAPTER.encodedSizeWithTag(302, responseBody2.get_messages_checkinfo_in_conversation_body) + MessagesInConversationResponseBody.ADAPTER.encodedSizeWithTag(301, responseBody2.messages_in_conversation_body) + GetMessageByIdResponseBody.ADAPTER.encodedSizeWithTag(211, responseBody2.get_message_by_id_body) + CheckMessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(210, responseBody2.check_messages_per_user_body) + MessagesPerUserInitComboInboxTypeResponseBody.ADAPTER.encodedSizeWithTag(205, responseBody2.messages_per_user_init_combo_inbox_type_body) + MessagesPerUserComboInboxTypeResponseBody.ADAPTER.encodedSizeWithTag(204, responseBody2.messages_per_user_combo_inbox_type_body) + MessagesPerUserInitV2ResponseBody.ADAPTER.encodedSizeWithTag(203, responseBody2.messages_per_user_init_v2_body) + MessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(200, responseBody2.messages_per_user_body) + SendMessageResponseBody.ADAPTER.encodedSizeWithTag(100, responseBody2.send_message_body);
        for (Map.Entry<Integer, ProtoAdapter> entry : LJ.entrySet()) {
            if (responseBody2.extensions.get(entry.getKey()) != null) {
                size += entry.getValue().encodedSizeWithTag(entry.getKey().intValue(), responseBody2.extensions.get(entry.getKey()).second);
            }
        }
        return size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ResponseBody responseBody) {
    }
}
