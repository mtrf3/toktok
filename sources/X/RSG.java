package X;

import com.bytedance.im.core.proto.SendUserActionRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSG extends ProtoAdapter<SendUserActionRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ SendUserActionRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RSG() {
        super(FieldEncoding.LENGTH_DELIMITED, SendUserActionRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SendUserActionRequestBody sendUserActionRequestBody) {
        SendUserActionRequestBody sendUserActionRequestBody2 = sendUserActionRequestBody;
        return sendUserActionRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(5, sendUserActionRequestBody2.extra) + EnumC69902Rc2.ADAPTER.encodedSizeWithTag(4, sendUserActionRequestBody2.action_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, sendUserActionRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendUserActionRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, sendUserActionRequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, SendUserActionRequestBody sendUserActionRequestBody) {
        SendUserActionRequestBody sendUserActionRequestBody2 = sendUserActionRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendUserActionRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendUserActionRequestBody2.conversation_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, sendUserActionRequestBody2.conversation_short_id);
        EnumC69902Rc2.ADAPTER.encodeWithTag(protoWriter, 4, sendUserActionRequestBody2.action_type);
        this.LJ.encodeWithTag(protoWriter, 5, sendUserActionRequestBody2.extra);
        protoWriter.writeBytes(sendUserActionRequestBody2.unknownFields());
    }
}
