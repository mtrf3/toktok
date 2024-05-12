package X;

import com.bytedance.im.core.proto.GetTicketRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RT9 extends ProtoAdapter<GetTicketRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetTicketRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RT9() {
        super(FieldEncoding.LENGTH_DELIMITED, GetTicketRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetTicketRequestBody getTicketRequestBody) {
        GetTicketRequestBody getTicketRequestBody2 = getTicketRequestBody;
        int encodedSizeWithTag = EnumC63506OwA.ADAPTER.encodedSizeWithTag(2, getTicketRequestBody2.conversation_type) + EnumC69900Rc0.ADAPTER.encodedSizeWithTag(1, getTicketRequestBody2.ticket_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return getTicketRequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(6, getTicketRequestBody2.customed_conversation_type) + this.LJ.encodedSizeWithTag(10, getTicketRequestBody2.ext) + protoAdapter.encodedSizeWithTag(5, getTicketRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(4, getTicketRequestBody2.to_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetTicketRequestBody getTicketRequestBody) {
        GetTicketRequestBody getTicketRequestBody2 = getTicketRequestBody;
        EnumC69900Rc0.ADAPTER.encodeWithTag(protoWriter, 1, getTicketRequestBody2.ticket_type);
        EnumC63506OwA.ADAPTER.encodeWithTag(protoWriter, 2, getTicketRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 4, getTicketRequestBody2.to_id);
        protoAdapter.encodeWithTag(protoWriter, 5, getTicketRequestBody2.conversation_short_id);
        this.LJ.encodeWithTag(protoWriter, 10, getTicketRequestBody2.ext);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getTicketRequestBody2.customed_conversation_type);
        protoWriter.writeBytes(getTicketRequestBody2.unknownFields());
    }
}
