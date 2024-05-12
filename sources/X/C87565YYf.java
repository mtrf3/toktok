package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYf, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87565YYf extends ProtoAdapter<ConversationInfoV2> {
    public C87565YYf() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationInfoV2.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationInfoV2 decode(ProtoReader protoReader) {
        C87566YYg c87566YYg = new C87566YYg();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 20) {
                                    if (nextTag != 50) {
                                        if (nextTag != 51) {
                                            switch (nextTag) {
                                                case 6:
                                                    c87566YYg.LJII = ParticipantsPage.ADAPTER.decode(protoReader);
                                                    break;
                                                case 7:
                                                    c87566YYg.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                                                    break;
                                                case 8:
                                                    c87566YYg.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                                                    break;
                                                case 9:
                                                    c87566YYg.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                                                    break;
                                                case 10:
                                                    c87566YYg.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                                                    break;
                                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                    c87566YYg.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                                                    break;
                                                default:
                                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                                    c87566YYg.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                    break;
                                            }
                                        } else {
                                            c87566YYg.LJIILL = ConversationSettingInfo.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c87566YYg.LJIILJJIL = ConversationCoreInfo.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c87566YYg.LJIILIIL = Participant.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c87566YYg.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c87566YYg.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c87566YYg.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c87566YYg.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c87566YYg.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationInfoV2 conversationInfoV2) {
        ConversationInfoV2 conversationInfoV22 = conversationInfoV2;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, conversationInfoV22.conversation_short_id) + protoAdapter.encodedSizeWithTag(1, conversationInfoV22.conversation_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return conversationInfoV22.unknownFields().size() + ConversationSettingInfo.ADAPTER.encodedSizeWithTag(51, conversationInfoV22.conversation_setting_info) + ConversationCoreInfo.ADAPTER.encodedSizeWithTag(50, conversationInfoV22.conversation_core_info) + Participant.ADAPTER.encodedSizeWithTag(20, conversationInfoV22.user_info) + protoAdapter2.encodedSizeWithTag(11, conversationInfoV22.badge_count_v2) + protoAdapter2.encodedSizeWithTag(10, conversationInfoV22.badge_count) + protoAdapter2.encodedSizeWithTag(9, conversationInfoV22.inbox_type) + ProtoAdapter.BOOL.encodedSizeWithTag(8, conversationInfoV22.is_participant) + protoAdapter2.encodedSizeWithTag(7, conversationInfoV22.participants_count) + ParticipantsPage.ADAPTER.encodedSizeWithTag(6, conversationInfoV22.first_page_participants) + protoAdapter.encodedSizeWithTag(4, conversationInfoV22.ticket) + protoAdapter2.encodedSizeWithTag(3, conversationInfoV22.conversation_type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationInfoV2 conversationInfoV2) {
        ConversationInfoV2 conversationInfoV22 = conversationInfoV2;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, conversationInfoV22.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationInfoV22.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, conversationInfoV22.conversation_type);
        protoAdapter.encodeWithTag(protoWriter, 4, conversationInfoV22.ticket);
        ParticipantsPage.ADAPTER.encodeWithTag(protoWriter, 6, conversationInfoV22.first_page_participants);
        protoAdapter2.encodeWithTag(protoWriter, 7, conversationInfoV22.participants_count);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, conversationInfoV22.is_participant);
        protoAdapter2.encodeWithTag(protoWriter, 9, conversationInfoV22.inbox_type);
        protoAdapter2.encodeWithTag(protoWriter, 10, conversationInfoV22.badge_count);
        protoAdapter2.encodeWithTag(protoWriter, 11, conversationInfoV22.badge_count_v2);
        Participant.ADAPTER.encodeWithTag(protoWriter, 20, conversationInfoV22.user_info);
        ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 50, conversationInfoV22.conversation_core_info);
        ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 51, conversationInfoV22.conversation_setting_info);
        protoWriter.writeBytes(conversationInfoV22.unknownFields());
    }
}
