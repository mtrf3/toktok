package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PropertyItemList;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OxK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63578OxK extends ProtoAdapter<MessageBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;
    public final ProtoAdapter<java.util.Map<String, PropertyItemList>> LJFF;
    public final ProtoAdapter<java.util.Map<String, String>> LJI;

    public C63578OxK() {
        super(FieldEncoding.LENGTH_DELIMITED, MessageBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        this.LJFF = ProtoAdapter.newMapAdapter(protoAdapter, PropertyItemList.ADAPTER);
        this.LJI = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessageBody decode(ProtoReader protoReader) {
        C63579OxL c63579OxL = new C63579OxL();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63579OxL.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c63579OxL.LJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c63579OxL.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c63579OxL.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c63579OxL.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c63579OxL.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        c63579OxL.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        c63579OxL.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        c63579OxL.LJIIJJI.putAll(this.LJ.decode(protoReader));
                        break;
                    case 10:
                        c63579OxL.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c63579OxL.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 12:
                        c63579OxL.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c63579OxL.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 14:
                        c63579OxL.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 15:
                        c63579OxL.LJIIZILJ.putAll(this.LJFF.decode(protoReader));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c63579OxL.LJIJ.putAll(this.LJI.decode(protoReader));
                        break;
                    case 17:
                        c63579OxL.LJIJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 18:
                        c63579OxL.LJIJJ = ReferenceInfo.ADAPTER.decode(protoReader);
                        break;
                    case 19:
                        c63579OxL.LJIJJLI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 20:
                        c63579OxL.LJIL = ProtoAdapter.BYTES.decode(protoReader);
                        break;
                    case 21:
                        c63579OxL.LJJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 22:
                        try {
                            c63579OxL.LJJI = EnumC96123pw.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c63579OxL.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63579OxL.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63579OxL.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessageBody messageBody) {
        MessageBody messageBody2 = messageBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, messageBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, messageBody2.conversation_type) + encodedSizeWithTag;
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        return messageBody2.unknownFields().size() + EnumC96123pw.ADAPTER.encodedSizeWithTag(22, messageBody2.conv_rank_update_rule) + protoAdapter.encodedSizeWithTag(21, messageBody2.scene) + ProtoAdapter.BYTES.encodedSizeWithTag(20, messageBody2.content_pb) + protoAdapter3.encodedSizeWithTag(19, messageBody2.index_in_conversation_v1) + ReferenceInfo.ADAPTER.encodedSizeWithTag(18, messageBody2.reference_info) + protoAdapter3.encodedSizeWithTag(17, messageBody2.index_in_conversation_v2) + this.LJI.encodedSizeWithTag(16, messageBody2.user_profile) + this.LJFF.encodedSizeWithTag(15, messageBody2.property_list) + protoAdapter.encodedSizeWithTag(14, messageBody2.sec_sender) + protoAdapter3.encodedSizeWithTag(13, messageBody2.order_in_conversation) + protoAdapter2.encodedSizeWithTag(12, messageBody2.status) + protoAdapter3.encodedSizeWithTag(11, messageBody2.version) + protoAdapter3.encodedSizeWithTag(10, messageBody2.create_time) + this.LJ.encodedSizeWithTag(9, messageBody2.ext) + protoAdapter.encodedSizeWithTag(8, messageBody2.content) + protoAdapter3.encodedSizeWithTag(7, messageBody2.sender) + protoAdapter2.encodedSizeWithTag(6, messageBody2.message_type) + protoAdapter3.encodedSizeWithTag(5, messageBody2.conversation_short_id) + protoAdapter3.encodedSizeWithTag(4, messageBody2.index_in_conversation) + protoAdapter3.encodedSizeWithTag(3, messageBody2.server_message_id) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessageBody messageBody) {
        MessageBody messageBody2 = messageBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, messageBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 2, messageBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 3, messageBody2.server_message_id);
        protoAdapter3.encodeWithTag(protoWriter, 4, messageBody2.index_in_conversation);
        protoAdapter3.encodeWithTag(protoWriter, 5, messageBody2.conversation_short_id);
        protoAdapter2.encodeWithTag(protoWriter, 6, messageBody2.message_type);
        protoAdapter3.encodeWithTag(protoWriter, 7, messageBody2.sender);
        protoAdapter.encodeWithTag(protoWriter, 8, messageBody2.content);
        this.LJ.encodeWithTag(protoWriter, 9, messageBody2.ext);
        protoAdapter3.encodeWithTag(protoWriter, 10, messageBody2.create_time);
        protoAdapter3.encodeWithTag(protoWriter, 11, messageBody2.version);
        protoAdapter2.encodeWithTag(protoWriter, 12, messageBody2.status);
        protoAdapter3.encodeWithTag(protoWriter, 13, messageBody2.order_in_conversation);
        protoAdapter.encodeWithTag(protoWriter, 14, messageBody2.sec_sender);
        this.LJFF.encodeWithTag(protoWriter, 15, messageBody2.property_list);
        this.LJI.encodeWithTag(protoWriter, 16, messageBody2.user_profile);
        protoAdapter3.encodeWithTag(protoWriter, 17, messageBody2.index_in_conversation_v2);
        ReferenceInfo.ADAPTER.encodeWithTag(protoWriter, 18, messageBody2.reference_info);
        protoAdapter3.encodeWithTag(protoWriter, 19, messageBody2.index_in_conversation_v1);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 20, messageBody2.content_pb);
        protoAdapter.encodeWithTag(protoWriter, 21, messageBody2.scene);
        EnumC96123pw.ADAPTER.encodeWithTag(protoWriter, 22, messageBody2.conv_rank_update_rule);
        protoWriter.writeBytes(messageBody2.unknownFields());
    }
}
