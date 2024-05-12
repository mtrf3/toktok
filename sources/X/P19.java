package X;

import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P19 extends ProtoAdapter<ConversationApplyInfo> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public P19() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationApplyInfo.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationApplyInfo decode(ProtoReader protoReader) {
        P1A p1a = new P1A();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        p1a.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        p1a.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        p1a.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        try {
                            p1a.LJI = EnumC115774gX.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            p1a.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 5:
                        p1a.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        p1a.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        p1a.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        p1a.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 9:
                        p1a.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        p1a.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        p1a.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 12:
                        p1a.LJIILJJIL.putAll(this.LJ.decode(protoReader));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        p1a.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        p1a.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p1a.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationApplyInfo conversationApplyInfo) {
        ConversationApplyInfo conversationApplyInfo2 = conversationApplyInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(8, conversationApplyInfo2.modify_user) + protoAdapter.encodedSizeWithTag(7, conversationApplyInfo2.modify_time) + protoAdapter.encodedSizeWithTag(6, conversationApplyInfo2.create_time) + protoAdapter.encodedSizeWithTag(5, conversationApplyInfo2.apply_id) + EnumC115774gX.ADAPTER.encodedSizeWithTag(4, conversationApplyInfo2.apply_status) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationApplyInfo2.conversation_type) + protoAdapter.encodedSizeWithTag(2, conversationApplyInfo2.conv_short_id) + protoAdapter.encodedSizeWithTag(1, conversationApplyInfo2.user_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return conversationApplyInfo2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(13, conversationApplyInfo2.apply_reason) + this.LJ.encodedSizeWithTag(12, conversationApplyInfo2.ext) + protoAdapter2.encodedSizeWithTag(11, conversationApplyInfo2.sec_invite_uid) + protoAdapter.encodedSizeWithTag(10, conversationApplyInfo2.invite_user_id) + protoAdapter2.encodedSizeWithTag(9, conversationApplyInfo2.sec_uid) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationApplyInfo conversationApplyInfo) {
        ConversationApplyInfo conversationApplyInfo2 = conversationApplyInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, conversationApplyInfo2.user_id);
        protoAdapter.encodeWithTag(protoWriter, 2, conversationApplyInfo2.conv_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationApplyInfo2.conversation_type);
        EnumC115774gX.ADAPTER.encodeWithTag(protoWriter, 4, conversationApplyInfo2.apply_status);
        protoAdapter.encodeWithTag(protoWriter, 5, conversationApplyInfo2.apply_id);
        protoAdapter.encodeWithTag(protoWriter, 6, conversationApplyInfo2.create_time);
        protoAdapter.encodeWithTag(protoWriter, 7, conversationApplyInfo2.modify_time);
        protoAdapter.encodeWithTag(protoWriter, 8, conversationApplyInfo2.modify_user);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 9, conversationApplyInfo2.sec_uid);
        protoAdapter.encodeWithTag(protoWriter, 10, conversationApplyInfo2.invite_user_id);
        protoAdapter2.encodeWithTag(protoWriter, 11, conversationApplyInfo2.sec_invite_uid);
        this.LJ.encodeWithTag(protoWriter, 12, conversationApplyInfo2.ext);
        protoAdapter2.encodeWithTag(protoWriter, 13, conversationApplyInfo2.apply_reason);
        protoWriter.writeBytes(conversationApplyInfo2.unknownFields());
    }
}
