package X;

import com.bytedance.im.core.proto.CheckMessagePerUserRequestBody;
import com.bytedance.im.core.proto.InboxMessagesPerUser;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRI extends ProtoAdapter<CheckMessagePerUserRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ CheckMessagePerUserRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RRI() {
        super(FieldEncoding.LENGTH_DELIMITED, CheckMessagePerUserRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
        CheckMessagePerUserRequestBody checkMessagePerUserRequestBody2 = checkMessagePerUserRequestBody;
        return checkMessagePerUserRequestBody2.unknownFields().size() + InboxMessagesPerUser.ADAPTER.asRepeated().encodedSizeWithTag(1, checkMessagePerUserRequestBody2.checks);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
        CheckMessagePerUserRequestBody checkMessagePerUserRequestBody2 = checkMessagePerUserRequestBody;
        InboxMessagesPerUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, checkMessagePerUserRequestBody2.checks);
        protoWriter.writeBytes(checkMessagePerUserRequestBody2.unknownFields());
    }
}
