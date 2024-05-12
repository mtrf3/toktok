package X;

import com.bytedance.im.core.proto.MessagesPerUserRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63489Ovt extends ProtoAdapter<MessagesPerUserRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MessagesPerUserRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63489Ovt() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesPerUserRequestBody messagesPerUserRequestBody) {
        MessagesPerUserRequestBody messagesPerUserRequestBody2 = messagesPerUserRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, messagesPerUserRequestBody2.cursor);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return messagesPerUserRequestBody2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(4, messagesPerUserRequestBody2.new_user) + protoAdapter.encodedSizeWithTag(3, messagesPerUserRequestBody2.interval) + protoAdapter2.encodedSizeWithTag(2, messagesPerUserRequestBody2.limit) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessagesPerUserRequestBody messagesPerUserRequestBody) {
        MessagesPerUserRequestBody messagesPerUserRequestBody2 = messagesPerUserRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, messagesPerUserRequestBody2.cursor);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 2, messagesPerUserRequestBody2.limit);
        protoAdapter.encodeWithTag(protoWriter, 3, messagesPerUserRequestBody2.interval);
        protoAdapter2.encodeWithTag(protoWriter, 4, messagesPerUserRequestBody2.new_user);
        protoWriter.writeBytes(messagesPerUserRequestBody2.unknownFields());
    }
}
