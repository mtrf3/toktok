package X;

import com.bytedance.im.core.proto.SendMessageP2PRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0T extends ProtoAdapter<SendMessageP2PRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ SendMessageP2PRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public P0T() {
        super(FieldEncoding.LENGTH_DELIMITED, SendMessageP2PRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SendMessageP2PRequestBody sendMessageP2PRequestBody) {
        SendMessageP2PRequestBody sendMessageP2PRequestBody2 = sendMessageP2PRequestBody;
        int encodedSizeWithTag = EnumC63735Ozr.ADAPTER.encodedSizeWithTag(1, sendMessageP2PRequestBody2.send_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, sendMessageP2PRequestBody2.conversation_id) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(3, sendMessageP2PRequestBody2.conversation_type) + encodedSizeWithTag2;
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        return sendMessageP2PRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(10, sendMessageP2PRequestBody2.client_message_id) + this.LJ.encodedSizeWithTag(9, sendMessageP2PRequestBody2.ext) + protoAdapter.encodedSizeWithTag(8, sendMessageP2PRequestBody2.content) + protoAdapter2.encodedSizeWithTag(7, sendMessageP2PRequestBody2.message_type) + protoAdapter3.asRepeated().encodedSizeWithTag(6, sendMessageP2PRequestBody2.invisible_user) + protoAdapter3.asRepeated().encodedSizeWithTag(5, sendMessageP2PRequestBody2.visible_user) + protoAdapter3.encodedSizeWithTag(4, sendMessageP2PRequestBody2.conversation_short_id) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, SendMessageP2PRequestBody sendMessageP2PRequestBody) {
        SendMessageP2PRequestBody sendMessageP2PRequestBody2 = sendMessageP2PRequestBody;
        EnumC63735Ozr.ADAPTER.encodeWithTag(protoWriter, 1, sendMessageP2PRequestBody2.send_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, sendMessageP2PRequestBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, sendMessageP2PRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 4, sendMessageP2PRequestBody2.conversation_short_id);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 5, sendMessageP2PRequestBody2.visible_user);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 6, sendMessageP2PRequestBody2.invisible_user);
        protoAdapter2.encodeWithTag(protoWriter, 7, sendMessageP2PRequestBody2.message_type);
        protoAdapter.encodeWithTag(protoWriter, 8, sendMessageP2PRequestBody2.content);
        this.LJ.encodeWithTag(protoWriter, 9, sendMessageP2PRequestBody2.ext);
        protoAdapter.encodeWithTag(protoWriter, 10, sendMessageP2PRequestBody2.client_message_id);
        protoWriter.writeBytes(sendMessageP2PRequestBody2.unknownFields());
    }
}
