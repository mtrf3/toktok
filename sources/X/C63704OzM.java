package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OzM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63704OzM extends ProtoAdapter<SendMessageResponseBody> {
    public C63704OzM() {
        super(FieldEncoding.LENGTH_DELIMITED, SendMessageResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final SendMessageResponseBody decode(ProtoReader protoReader) {
        C63705OzN c63705OzN = new C63705OzN();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63705OzN.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c63705OzN.LJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c63705OzN.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c63705OzN.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c63705OzN.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c63705OzN.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c63705OzN.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c63705OzN.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 9:
                        c63705OzN.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        c63705OzN.LJIIL = ConversationInfoV2.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63705OzN.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                    case 12:
                        try {
                            c63705OzN.LJIILIIL = C4YY.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c63705OzN.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        try {
                            c63705OzN.LJIILJJIL = EnumC1045048g.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            c63705OzN.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63705OzN.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SendMessageResponseBody sendMessageResponseBody) {
        SendMessageResponseBody sendMessageResponseBody2 = sendMessageResponseBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, sendMessageResponseBody2.server_message_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return sendMessageResponseBody2.unknownFields().size() + EnumC1045048g.ADAPTER.encodedSizeWithTag(13, sendMessageResponseBody2.filter_reason) + C4YY.ADAPTER.encodedSizeWithTag(12, sendMessageResponseBody2.inboxPageCategory) + ConversationInfoV2.ADAPTER.encodedSizeWithTag(10, sendMessageResponseBody2.conversation) + protoAdapter2.encodedSizeWithTag(9, sendMessageResponseBody2.new_ticket) + ProtoAdapter.BOOL.encodedSizeWithTag(8, sendMessageResponseBody2.is_async_send) + protoAdapter2.encodedSizeWithTag(7, sendMessageResponseBody2.filtered_content) + protoAdapter2.encodedSizeWithTag(6, sendMessageResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(5, sendMessageResponseBody2.check_code) + protoAdapter2.encodedSizeWithTag(4, sendMessageResponseBody2.client_message_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, sendMessageResponseBody2.status) + protoAdapter2.encodedSizeWithTag(2, sendMessageResponseBody2.extra_info) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, SendMessageResponseBody sendMessageResponseBody) {
    }
}
