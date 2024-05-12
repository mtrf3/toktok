package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYZ extends ProtoAdapter<ConversationCoreInfo> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public YYZ() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationCoreInfo.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationCoreInfo decode(ProtoReader protoReader) {
        C87560YYa c87560YYa = new C87560YYa();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c87560YYa.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c87560YYa.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c87560YYa.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c87560YYa.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c87560YYa.LJII = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c87560YYa.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c87560YYa.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c87560YYa.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        c87560YYa.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c87560YYa.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c87560YYa.LJIIL.putAll(this.LJ.decode(protoReader));
                        break;
                    case 12:
                        c87560YYa.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c87560YYa.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        try {
                            c87560YYa.LJIILL = EnumC63751P0h.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c87560YYa.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 15:
                        c87560YYa.LJIILLIIL = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c87560YYa.LJIIZILJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 17:
                        c87560YYa.LJIJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 18:
                        c87560YYa.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c87560YYa.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationCoreInfo conversationCoreInfo) {
        ConversationCoreInfo conversationCoreInfo2 = conversationCoreInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, conversationCoreInfo2.conversation_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, conversationCoreInfo2.conversation_short_id) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return conversationCoreInfo2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(17, conversationCoreInfo2.creator_uid) + protoAdapter3.encodedSizeWithTag(18, conversationCoreInfo2.status) + protoAdapter3.encodedSizeWithTag(16, conversationCoreInfo2.mode) + ProtoAdapter.BOOL.encodedSizeWithTag(15, conversationCoreInfo2.block_normal_only) + EnumC63751P0h.ADAPTER.encodedSizeWithTag(14, conversationCoreInfo2.block_status) + protoAdapter.encodedSizeWithTag(13, conversationCoreInfo2.sec_owner) + protoAdapter2.encodedSizeWithTag(12, conversationCoreInfo2.owner) + this.LJ.encodedSizeWithTag(11, conversationCoreInfo2.ext) + protoAdapter.encodedSizeWithTag(9, conversationCoreInfo2.notice) + protoAdapter3.encodedSizeWithTag(8, conversationCoreInfo2.inbox_type) + protoAdapter.encodedSizeWithTag(7, conversationCoreInfo2.icon) + protoAdapter.encodedSizeWithTag(6, conversationCoreInfo2.desc) + protoAdapter.encodedSizeWithTag(5, conversationCoreInfo2.name) + protoAdapter2.encodedSizeWithTag(4, conversationCoreInfo2.info_version) + protoAdapter3.encodedSizeWithTag(3, conversationCoreInfo2.conversation_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationCoreInfo conversationCoreInfo) {
        ConversationCoreInfo conversationCoreInfo2 = conversationCoreInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, conversationCoreInfo2.conversation_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, conversationCoreInfo2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 3, conversationCoreInfo2.conversation_type);
        protoAdapter2.encodeWithTag(protoWriter, 4, conversationCoreInfo2.info_version);
        protoAdapter.encodeWithTag(protoWriter, 5, conversationCoreInfo2.name);
        protoAdapter.encodeWithTag(protoWriter, 6, conversationCoreInfo2.desc);
        protoAdapter.encodeWithTag(protoWriter, 7, conversationCoreInfo2.icon);
        protoAdapter3.encodeWithTag(protoWriter, 8, conversationCoreInfo2.inbox_type);
        protoAdapter.encodeWithTag(protoWriter, 9, conversationCoreInfo2.notice);
        this.LJ.encodeWithTag(protoWriter, 11, conversationCoreInfo2.ext);
        protoAdapter2.encodeWithTag(protoWriter, 12, conversationCoreInfo2.owner);
        protoAdapter.encodeWithTag(protoWriter, 13, conversationCoreInfo2.sec_owner);
        EnumC63751P0h.ADAPTER.encodeWithTag(protoWriter, 14, conversationCoreInfo2.block_status);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, conversationCoreInfo2.block_normal_only);
        protoAdapter3.encodeWithTag(protoWriter, 16, conversationCoreInfo2.mode);
        protoAdapter3.encodeWithTag(protoWriter, 18, conversationCoreInfo2.status);
        protoAdapter2.encodeWithTag(protoWriter, 17, conversationCoreInfo2.creator_uid);
        protoWriter.writeBytes(conversationCoreInfo2.unknownFields());
    }
}
