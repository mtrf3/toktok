package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OzO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63706OzO extends ProtoAdapter<ConversationSettingInfo> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public C63706OzO() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationSettingInfo.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationSettingInfo decode(ProtoReader protoReader) {
        C63707OzP c63707OzP = new C63707OzP();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63707OzP.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c63707OzP.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c63707OzP.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c63707OzP.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c63707OzP.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c63707OzP.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        c63707OzP.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        c63707OzP.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        c63707OzP.LJIIJJI.putAll(this.LJ.decode(protoReader));
                        break;
                    case 10:
                        c63707OzP.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c63707OzP.LJIILIIL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 12:
                        c63707OzP.LJIILJJIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c63707OzP.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 14:
                        c63707OzP.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 15:
                        c63707OzP.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c63707OzP.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 17:
                        c63707OzP.LJIJI = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 18:
                        try {
                            c63707OzP.LJIJJ = EnumC96103pu.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c63707OzP.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63707OzP.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63707OzP.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationSettingInfo conversationSettingInfo) {
        ConversationSettingInfo conversationSettingInfo2 = conversationSettingInfo;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, conversationSettingInfo2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, conversationSettingInfo2.conversation_short_id) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return conversationSettingInfo2.unknownFields().size() + EnumC96103pu.ADAPTER.encodedSizeWithTag(18, conversationSettingInfo2.category) + protoAdapter2.encodedSizeWithTag(17, conversationSettingInfo2.read_badge_count_v2) + protoAdapter2.encodedSizeWithTag(16, conversationSettingInfo2.read_badge_count) + protoAdapter.encodedSizeWithTag(15, conversationSettingInfo2.min_index_v2) + protoAdapter.encodedSizeWithTag(14, conversationSettingInfo2.read_index_v2) + protoAdapter.encodedSizeWithTag(13, conversationSettingInfo2.set_favorite_time) + protoAdapter.encodedSizeWithTag(12, conversationSettingInfo2.set_top_time) + protoAdapter2.encodedSizeWithTag(11, conversationSettingInfo2.favorite) + protoAdapter.encodedSizeWithTag(10, conversationSettingInfo2.setting_version) + this.LJ.encodedSizeWithTag(9, conversationSettingInfo2.ext) + protoAdapter2.encodedSizeWithTag(8, conversationSettingInfo2.inbox_type) + protoAdapter2.encodedSizeWithTag(7, conversationSettingInfo2.stick_on_top) + protoAdapter2.encodedSizeWithTag(6, conversationSettingInfo2.mute) + protoAdapter.encodedSizeWithTag(5, conversationSettingInfo2.read_index) + protoAdapter.encodedSizeWithTag(4, conversationSettingInfo2.min_index) + protoAdapter2.encodedSizeWithTag(3, conversationSettingInfo2.conversation_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationSettingInfo conversationSettingInfo) {
        ConversationSettingInfo conversationSettingInfo2 = conversationSettingInfo;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationSettingInfo2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, conversationSettingInfo2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, conversationSettingInfo2.conversation_type);
        protoAdapter.encodeWithTag(protoWriter, 4, conversationSettingInfo2.min_index);
        protoAdapter.encodeWithTag(protoWriter, 5, conversationSettingInfo2.read_index);
        protoAdapter2.encodeWithTag(protoWriter, 6, conversationSettingInfo2.mute);
        protoAdapter2.encodeWithTag(protoWriter, 7, conversationSettingInfo2.stick_on_top);
        protoAdapter2.encodeWithTag(protoWriter, 8, conversationSettingInfo2.inbox_type);
        this.LJ.encodeWithTag(protoWriter, 9, conversationSettingInfo2.ext);
        protoAdapter.encodeWithTag(protoWriter, 10, conversationSettingInfo2.setting_version);
        protoAdapter2.encodeWithTag(protoWriter, 11, conversationSettingInfo2.favorite);
        protoAdapter.encodeWithTag(protoWriter, 12, conversationSettingInfo2.set_top_time);
        protoAdapter.encodeWithTag(protoWriter, 13, conversationSettingInfo2.set_favorite_time);
        protoAdapter.encodeWithTag(protoWriter, 14, conversationSettingInfo2.read_index_v2);
        protoAdapter.encodeWithTag(protoWriter, 15, conversationSettingInfo2.min_index_v2);
        protoAdapter2.encodeWithTag(protoWriter, 16, conversationSettingInfo2.read_badge_count);
        protoAdapter2.encodeWithTag(protoWriter, 17, conversationSettingInfo2.read_badge_count_v2);
        EnumC96103pu.ADAPTER.encodeWithTag(protoWriter, 18, conversationSettingInfo2.category);
        protoWriter.writeBytes(conversationSettingInfo2.unknownFields());
    }
}
