package X;

import com.bytedance.im.core.proto.MessageByInitRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQB extends ProtoAdapter<MessageByInitRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MessageByInitRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQB() {
        super(FieldEncoding.LENGTH_DELIMITED, MessageByInitRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessageByInitRequestBody messageByInitRequestBody) {
        MessageByInitRequestBody messageByInitRequestBody2 = messageByInitRequestBody;
        return messageByInitRequestBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(1, messageByInitRequestBody2.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessageByInitRequestBody messageByInitRequestBody) {
        MessageByInitRequestBody messageByInitRequestBody2 = messageByInitRequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messageByInitRequestBody2.version);
        protoWriter.writeBytes(messageByInitRequestBody2.unknownFields());
    }
}
