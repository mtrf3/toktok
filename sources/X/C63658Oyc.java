package X;

import com.bytedance.im.core.proto.SendInputStatusRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Oyc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63658Oyc extends ProtoAdapter<SendInputStatusRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ SendInputStatusRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63658Oyc() {
        super(FieldEncoding.LENGTH_DELIMITED, SendInputStatusRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SendInputStatusRequestBody sendInputStatusRequestBody) {
        SendInputStatusRequestBody sendInputStatusRequestBody2 = sendInputStatusRequestBody;
        return sendInputStatusRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(5, sendInputStatusRequestBody2.extra) + EnumC63669Oyn.ADAPTER.encodedSizeWithTag(4, sendInputStatusRequestBody2.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, sendInputStatusRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendInputStatusRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, sendInputStatusRequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, SendInputStatusRequestBody sendInputStatusRequestBody) {
        SendInputStatusRequestBody sendInputStatusRequestBody2 = sendInputStatusRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendInputStatusRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendInputStatusRequestBody2.conversation_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, sendInputStatusRequestBody2.conversation_short_id);
        EnumC63669Oyn.ADAPTER.encodeWithTag(protoWriter, 4, sendInputStatusRequestBody2.status);
        this.LJ.encodeWithTag(protoWriter, 5, sendInputStatusRequestBody2.extra);
        protoWriter.writeBytes(sendInputStatusRequestBody2.unknownFields());
    }
}
