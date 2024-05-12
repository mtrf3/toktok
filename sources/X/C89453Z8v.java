package X;

import android.util.Pair;
import com.bytedance.im.core.proto.AckMessageRequestBody;
import com.bytedance.im.core.proto.BatchAckMessageRequestBody;
import com.bytedance.im.core.proto.BatchDeleteConversationRequestBody;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.bytedance.im.core.proto.BatchGetMessagesRequestBody;
import com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody;
import com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody;
import com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody;
import com.bytedance.im.core.proto.BlockConversationRequestBody;
import com.bytedance.im.core.proto.BlockMembersRequestBody;
import com.bytedance.im.core.proto.BroadcastUserCounterRequestBody;
import com.bytedance.im.core.proto.CheckMessagePerUserRequestBody;
import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.bytedance.im.core.proto.ClientBatchACKRequestBody;
import com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody;
import com.bytedance.im.core.proto.ConversationLeaveRequestBody;
import com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody;
import com.bytedance.im.core.proto.ConversationMessageSearchRequestBody;
import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody;
import com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody;
import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteMultiStrangerConversationRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.im.core.proto.DissolveConversationRequestBody;
import com.bytedance.im.core.proto.GetCmdMessageReqBody;
import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.bytedance.im.core.proto.GetConversationsCheckInfoV2RequestBody;
import com.bytedance.im.core.proto.GetMessageByIdRequestBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody;
import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody;
import com.bytedance.im.core.proto.GetMessagesCheckInfoV2RequestBody;
import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.GetRecentMessageReqBody;
import com.bytedance.im.core.proto.GetStrangerConversationListRequestBody;
import com.bytedance.im.core.proto.GetStrangerMessagesRequestBody;
import com.bytedance.im.core.proto.GetTicketRequestBody;
import com.bytedance.im.core.proto.GetUserConversationListRequestBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.bytedance.im.core.proto.MarkMessageRequestBody;
import com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody;
import com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody;
import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadRequestBody;
import com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody;
import com.bytedance.im.core.proto.MessageByInitRequestBody;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserComboInboxTypeRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserInitComboInboxTypeRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody;
import com.bytedance.im.core.proto.MessagesPerUserRequestBody;
import com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody;
import com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody;
import com.bytedance.im.core.proto.PullMarkMessageRequestBody;
import com.bytedance.im.core.proto.RecallMessageRequestBody;
import com.bytedance.im.core.proto.ReportClientMetricsRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SendInputStatusRequestBody;
import com.bytedance.im.core.proto.SendMessageP2PRequestBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.bytedance.im.core.proto.SendUserActionRequestBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.UnReadCountReportRequestBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.HashMap;

/* renamed from: X.Z8v, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89453Z8v extends Message.Builder<RequestBody, C89453Z8v> {
    public SendMessageRequestBody LIZLLL;
    public MessagesPerUserRequestBody LJ;
    public MessagesPerUserInitV2RequestBody LJFF;
    public MessagesPerUserComboInboxTypeRequestBody LJI;
    public MessagesPerUserInitComboInboxTypeRequestBody LJII;
    public CheckMessagePerUserRequestBody LJIIIIZZ;
    public GetMessageByIdRequestBody LJIIIZ;
    public MessagesInConversationRequestBody LJIIJ;
    public GetMessagesCheckInfoInConversationRequestBody LJIIJJI;
    public GetMessagesCheckInfoV2RequestBody LJIIL;
    public SendUserActionRequestBody LJIILIIL;
    public SendInputStatusRequestBody LJIILJJIL;
    public DeleteConversationRequestBody LJIILL;
    public MarkConversationReadRequestBody LJIILLIIL;
    public ConversationParticipantsListRequestBody LJIIZILJ;
    public GetConversationInfoV2RequestBody LJIJ;
    public CreateConversationV2RequestBody LJIJI;
    public GetConversationInfoListV2RequestBody LJIJJ;
    public ConversationsPerUserByFavoriteV2RequestBody LJIJJLI;
    public ConversationsPerUserByTopV2RequestBody LJIL;
    public BatchMarkConversationReadRequestBody LJJ;
    public DissolveConversationRequestBody LJJI;
    public C63502Ow6 LJJIFFI;
    public GetConversationsCheckInfoV2RequestBody LJJII;
    public BatchDeleteConversationRequestBody LJJIII;
    public ConversationAddParticipantsRequestBody LJJIIJ;
    public ConversationRemoveParticipantsRequestBody LJJIIJZLJL;
    public ConversationLeaveRequestBody LJJIIZ;
    public UpdateConversationParticipantRequestBody LJJIIZI;
    public BatchUpdateConversationParticipantRequestBody LJJIJ;
    public DeleteMessageRequestBody LJJIJIIJI;
    public RecallMessageRequestBody LJJIJIIJIL;
    public ModifyMessagePropertyRequestBody LJJIJIL;
    public AckMessageRequestBody LJJIJL;
    public BatchAckMessageRequestBody LJJIJLIJ;
    public SetConversationCoreInfoRequestBody LJJIL;
    public UpsertConversationCoreExtInfoRequestBody LJJIZ;
    public SetConversationSettingInfoRequestBody LJJJ;
    public UpsertConversationSettingExtInfoRequestBody LJJJI;
    public GetStrangerConversationListRequestBody LJJJIL;
    public GetStrangerMessagesRequestBody LJJJJ;
    public DeleteStrangerMessageRequestBody LJJJJI;
    public DeleteStrangerConversationRequestBody LJJJJIZL;
    public RQI LJJJJJ;
    public MarkStrangerConversationReadRequestBody LJJJJJL;
    public RQN LJJJJL;
    public DeleteMultiStrangerConversationRequestBody LJJJJLI;
    public MarkMultiStrangerConversationReadRequestBody LJJJJLL;
    public GetConversationParticipantsReadIndexV3RequestBody LJJJJZ;
    public GetConversationParticipantsMinIndexV3RequestBody LJJJJZI;
    public GetTicketRequestBody LJJJLIIL;
    public GetUserConversationListRequestBody LJJJLL;
    public BroadcastUserCounterRequestBody LJJJLZIJ;
    public ClientACKRequestBody LJJJZ;
    public ReportClientMetricsRequestBody LJJL;
    public C63499Ow3 LJJLI;
    public UnReadCountReportRequestBody LJJLIIIIJ;
    public BlockMembersRequestBody LJJLIIIJ;
    public BlockConversationRequestBody LJJLIIIJILLIZJL;
    public SendMessageP2PRequestBody LJJLIIIJJI;
    public GetMessageInfoByIndexV2RequestBody LJJLIIIJJIZ;
    public MarkMessageRequestBody LJJLIIIJL;
    public PullMarkMessageRequestBody LJJLIIIJLJLI;
    public BatchGetConversationParticipantsReadIndexRequestBody LJJLIIIJLLLLLLLZ;
    public GetRecentMessageReqBody LJJLIIJ;
    public GetCmdMessageReqBody LJJLIL;
    public GetMessageInfoByIndexV2RangeRequestBody LJJLJ;
    public MessageByInitRequestBody LJJLJLI;
    public PreviewerMessagesInConversationRequestBody LJJLL;
    public PreviewerGetConversationInfoListRequestBody LJJZ;
    public MarkMsgUnreadCountReportRequestBody LJJZZI;
    public MarkMsgGetUnreadCountRequestBody LJJZZIII;
    public BatchUnmarkMessageRequestBody LJL;
    public ClientBatchACKRequestBody LJLI;
    public ConversationMessageSearchRequestBody LJLIIIL;
    public ConversationMessagePreViewRequestBody LJLIIL;
    public GetMessagesRequestBody LJLIL;
    public BatchGetMessagesRequestBody LJLILLLLZI;
    public HashMap<Integer, Pair<ProtoAdapter, Message>> LJLJI = new HashMap<>();
    public HashMap<String, Object> LJLJJI = new HashMap<>();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final RequestBody build() {
        return new RequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, this.LJJIFFI, this.LJJII, this.LJJIII, this.LJJIIJ, this.LJJIIJZLJL, this.LJJIIZ, this.LJJIIZI, this.LJJIJ, this.LJJIJIIJI, this.LJJIJIIJIL, this.LJJIJIL, this.LJJIJL, this.LJJIJLIJ, this.LJJIL, this.LJJIZ, this.LJJJ, this.LJJJI, this.LJJJIL, this.LJJJJ, this.LJJJJI, this.LJJJJIZL, this.LJJJJJ, this.LJJJJJL, this.LJJJJL, this.LJJJJLI, this.LJJJJLL, this.LJJJJZ, this.LJJJJZI, this.LJJJLIIL, this.LJJJLL, this.LJJJLZIJ, this.LJJJZ, this.LJJL, this.LJJLI, this.LJJLIIIIJ, this.LJJLIIIJ, this.LJJLIIIJILLIZJL, this.LJJLIIIJJI, this.LJJLIIIJJIZ, this.LJJLIIIJL, this.LJJLIIIJLJLI, this.LJJLIIIJLLLLLLLZ, this.LJJLIIJ, this.LJJLIL, this.LJJLJ, this.LJJLJLI, this.LJJLL, this.LJJZ, this.LJJZZI, this.LJJZZIII, this.LJL, this.LJLI, this.LJLIIIL, this.LJLIIL, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, buildUnknownFields());
    }

    public final void LIZIZ(int i, ProtoAdapter protoAdapter, Message message) {
        this.LJLJI.put(Integer.valueOf(i), new Pair<>(protoAdapter, message));
        this.LJLJJI.put(C16880lQ.LJLLJ(message.getClass()), message);
    }
}