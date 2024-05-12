package X;

import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Owl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63543Owl extends ProtoAdapter<SendMessageRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;
    public final ProtoAdapter<java.util.Map<String, String>> LJFF;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ SendMessageRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63543Owl() {
        super(FieldEncoding.LENGTH_DELIMITED, SendMessageRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        this.LJFF = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SendMessageRequestBody sendMessageRequestBody) {
        SendMessageRequestBody sendMessageRequestBody2 = sendMessageRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, sendMessageRequestBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, sendMessageRequestBody2.conversation_type) + encodedSizeWithTag;
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        return sendMessageRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(14, sendMessageRequestBody2.scene) + ProtoAdapter.BYTES.encodedSizeWithTag(13, sendMessageRequestBody2.content_pb) + this.LJFF.encodedSizeWithTag(12, sendMessageRequestBody2.client_ext) + ReferencedMessageInfo.ADAPTER.encodedSizeWithTag(11, sendMessageRequestBody2.ref_msg_info) + ProtoAdapter.BOOL.encodedSizeWithTag(10, sendMessageRequestBody2.ignore_badge_count) + protoAdapter3.asRepeated().encodedSizeWithTag(9, sendMessageRequestBody2.mentioned_users) + protoAdapter.encodedSizeWithTag(8, sendMessageRequestBody2.client_message_id) + protoAdapter.encodedSizeWithTag(7, sendMessageRequestBody2.ticket) + protoAdapter2.encodedSizeWithTag(6, sendMessageRequestBody2.message_type) + this.LJ.encodedSizeWithTag(5, sendMessageRequestBody2.ext) + protoAdapter.encodedSizeWithTag(4, sendMessageRequestBody2.content) + protoAdapter3.encodedSizeWithTag(3, sendMessageRequestBody2.conversation_short_id) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, SendMessageRequestBody sendMessageRequestBody) {
        SendMessageRequestBody sendMessageRequestBody2 = sendMessageRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, sendMessageRequestBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 2, sendMessageRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 3, sendMessageRequestBody2.conversation_short_id);
        protoAdapter.encodeWithTag(protoWriter, 4, sendMessageRequestBody2.content);
        this.LJ.encodeWithTag(protoWriter, 5, sendMessageRequestBody2.ext);
        protoAdapter2.encodeWithTag(protoWriter, 6, sendMessageRequestBody2.message_type);
        protoAdapter.encodeWithTag(protoWriter, 7, sendMessageRequestBody2.ticket);
        protoAdapter.encodeWithTag(protoWriter, 8, sendMessageRequestBody2.client_message_id);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 9, sendMessageRequestBody2.mentioned_users);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, sendMessageRequestBody2.ignore_badge_count);
        ReferencedMessageInfo.ADAPTER.encodeWithTag(protoWriter, 11, sendMessageRequestBody2.ref_msg_info);
        this.LJFF.encodeWithTag(protoWriter, 12, sendMessageRequestBody2.client_ext);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 13, sendMessageRequestBody2.content_pb);
        protoAdapter.encodeWithTag(protoWriter, 14, sendMessageRequestBody2.scene);
        protoWriter.writeBytes(sendMessageRequestBody2.unknownFields());
    }
}
