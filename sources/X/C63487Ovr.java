package X;

import com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63487Ovr extends ProtoAdapter<MessagesPerUserInitV2RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MessagesPerUserInitV2RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63487Ovr() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserInitV2RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
        MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody2 = messagesPerUserInitV2RequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, messagesPerUserInitV2RequestBody2.cursor);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return messagesPerUserInitV2RequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, messagesPerUserInitV2RequestBody2.init_sub_type) + protoAdapter.encodedSizeWithTag(2, messagesPerUserInitV2RequestBody2.new_user) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
        MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody2 = messagesPerUserInitV2RequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesPerUserInitV2RequestBody2.cursor);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, messagesPerUserInitV2RequestBody2.new_user);
        protoAdapter.encodeWithTag(protoWriter, 3, messagesPerUserInitV2RequestBody2.init_sub_type);
        protoWriter.writeBytes(messagesPerUserInitV2RequestBody2.unknownFields());
    }
}
