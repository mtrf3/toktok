package X;

import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63452OvI extends ProtoAdapter<ClientACKRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ClientACKRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63452OvI() {
        super(FieldEncoding.LENGTH_DELIMITED, ClientACKRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ClientACKRequestBody clientACKRequestBody) {
        ClientACKRequestBody clientACKRequestBody2 = clientACKRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return clientACKRequestBody2.unknownFields().size() + EnumC63359Otn.ADAPTER.encodedSizeWithTag(7, clientACKRequestBody2.type) + protoAdapter.encodedSizeWithTag(6, clientACKRequestBody2.server_message_id) + protoAdapter.encodedSizeWithTag(5, clientACKRequestBody2.client_time_stamp) + ProtoAdapter.STRING.encodedSizeWithTag(4, clientACKRequestBody2.logid) + EnumC48299IxT.ADAPTER.encodedSizeWithTag(3, clientACKRequestBody2.network_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, clientACKRequestBody2.cmd) + protoAdapter.encodedSizeWithTag(1, clientACKRequestBody2.start_time_stamp);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ClientACKRequestBody clientACKRequestBody) {
        ClientACKRequestBody clientACKRequestBody2 = clientACKRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, clientACKRequestBody2.start_time_stamp);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, clientACKRequestBody2.cmd);
        EnumC48299IxT.ADAPTER.encodeWithTag(protoWriter, 3, clientACKRequestBody2.network_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, clientACKRequestBody2.logid);
        protoAdapter.encodeWithTag(protoWriter, 5, clientACKRequestBody2.client_time_stamp);
        protoAdapter.encodeWithTag(protoWriter, 6, clientACKRequestBody2.server_message_id);
        EnumC63359Otn.ADAPTER.encodeWithTag(protoWriter, 7, clientACKRequestBody2.type);
        protoWriter.writeBytes(clientACKRequestBody2.unknownFields());
    }
}
