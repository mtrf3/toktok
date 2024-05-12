package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.MuteBadgeCountInfo;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P13 extends ProtoAdapter<NewMessageNotify> {
    public P13() {
        super(FieldEncoding.LENGTH_DELIMITED, NewMessageNotify.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final NewMessageNotify decode(ProtoReader protoReader) {
        P14 p14 = new P14();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 2:
                        p14.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        p14.LJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        try {
                            p14.LJFF = P15.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            p14.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 5:
                        p14.LJI = MessageBody.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        p14.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        p14.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        p14.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 9:
                        p14.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 10:
                        p14.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        p14.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 12:
                        p14.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        p14.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 14:
                        p14.LJIILL = MsgTrace.ADAPTER.decode(protoReader);
                        break;
                    case 15:
                        p14.LJIILLIIL = ReferenceInfo.ADAPTER.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        p14.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 17:
                        p14.LJIJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 18:
                        p14.LJIJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 19:
                        p14.LJIJJ = MuteBadgeCountInfo.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        p14.LJIJJLI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 21:
                        p14.LJIL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        p14.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p14.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(NewMessageNotify newMessageNotify) {
        NewMessageNotify newMessageNotify2 = newMessageNotify;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, newMessageNotify2.conversation_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = MessageBody.ADAPTER.encodedSizeWithTag(5, newMessageNotify2.message) + P15.ADAPTER.encodedSizeWithTag(4, newMessageNotify2.notify_type) + protoAdapter2.encodedSizeWithTag(3, newMessageNotify2.conversation_type) + encodedSizeWithTag;
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        return newMessageNotify2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(21, newMessageNotify2.badge_count_v2) + protoAdapter.encodedSizeWithTag(20, newMessageNotify2.push_preview) + MuteBadgeCountInfo.ADAPTER.encodedSizeWithTag(19, newMessageNotify2.mute_badge_count_info) + protoAdapter3.encodedSizeWithTag(18, newMessageNotify2.pre_readconv_version) + protoAdapter3.encodedSizeWithTag(17, newMessageNotify2.readconv_version) + protoAdapter3.encodedSizeWithTag(16, newMessageNotify2.previous_msg_index_in_conv) + ReferenceInfo.ADAPTER.encodedSizeWithTag(15, newMessageNotify2.ref_msg_info) + MsgTrace.ADAPTER.encodedSizeWithTag(14, newMessageNotify2.trace) + protoAdapter2.encodedSizeWithTag(13, newMessageNotify2.badge_count) + protoAdapter3.encodedSizeWithTag(12, newMessageNotify2.cmd_message_index) + protoAdapter3.encodedSizeWithTag(11, newMessageNotify2.previous_conversation_version) + protoAdapter3.encodedSizeWithTag(10, newMessageNotify2.conversation_version) + protoAdapter3.encodedSizeWithTag(9, newMessageNotify2.index_in_conversation_v2) + protoAdapter3.encodedSizeWithTag(8, newMessageNotify2.index_in_conversation) + protoAdapter3.encodedSizeWithTag(7, newMessageNotify2.next_cursor) + protoAdapter3.encodedSizeWithTag(6, newMessageNotify2.previous_cursor) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, NewMessageNotify newMessageNotify) {
        NewMessageNotify newMessageNotify2 = newMessageNotify;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, newMessageNotify2.conversation_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, newMessageNotify2.conversation_type);
        P15.ADAPTER.encodeWithTag(protoWriter, 4, newMessageNotify2.notify_type);
        MessageBody.ADAPTER.encodeWithTag(protoWriter, 5, newMessageNotify2.message);
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 6, newMessageNotify2.previous_cursor);
        protoAdapter3.encodeWithTag(protoWriter, 7, newMessageNotify2.next_cursor);
        protoAdapter3.encodeWithTag(protoWriter, 8, newMessageNotify2.index_in_conversation);
        protoAdapter3.encodeWithTag(protoWriter, 9, newMessageNotify2.index_in_conversation_v2);
        protoAdapter3.encodeWithTag(protoWriter, 10, newMessageNotify2.conversation_version);
        protoAdapter3.encodeWithTag(protoWriter, 11, newMessageNotify2.previous_conversation_version);
        protoAdapter3.encodeWithTag(protoWriter, 12, newMessageNotify2.cmd_message_index);
        protoAdapter2.encodeWithTag(protoWriter, 13, newMessageNotify2.badge_count);
        MsgTrace.ADAPTER.encodeWithTag(protoWriter, 14, newMessageNotify2.trace);
        ReferenceInfo.ADAPTER.encodeWithTag(protoWriter, 15, newMessageNotify2.ref_msg_info);
        protoAdapter3.encodeWithTag(protoWriter, 16, newMessageNotify2.previous_msg_index_in_conv);
        protoAdapter3.encodeWithTag(protoWriter, 17, newMessageNotify2.readconv_version);
        protoAdapter3.encodeWithTag(protoWriter, 18, newMessageNotify2.pre_readconv_version);
        MuteBadgeCountInfo.ADAPTER.encodeWithTag(protoWriter, 19, newMessageNotify2.mute_badge_count_info);
        protoAdapter.encodeWithTag(protoWriter, 20, newMessageNotify2.push_preview);
        protoAdapter2.encodeWithTag(protoWriter, 21, newMessageNotify2.badge_count_v2);
        protoWriter.writeBytes(newMessageNotify2.unknownFields());
    }
}
