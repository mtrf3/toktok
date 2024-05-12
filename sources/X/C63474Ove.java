package X;

import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.bytedance.im.core.proto.ClientBatchACKRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ove, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63474Ove extends ProtoAdapter<ClientBatchACKRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ClientBatchACKRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63474Ove() {
        super(FieldEncoding.LENGTH_DELIMITED, ClientBatchACKRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ClientBatchACKRequestBody clientBatchACKRequestBody) {
        ClientBatchACKRequestBody clientBatchACKRequestBody2 = clientBatchACKRequestBody;
        return clientBatchACKRequestBody2.unknownFields().size() + ClientACKRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, clientBatchACKRequestBody2.ack_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ClientBatchACKRequestBody clientBatchACKRequestBody) {
        ClientBatchACKRequestBody clientBatchACKRequestBody2 = clientBatchACKRequestBody;
        ClientACKRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, clientBatchACKRequestBody2.ack_list);
        protoWriter.writeBytes(clientBatchACKRequestBody2.unknownFields());
    }
}
