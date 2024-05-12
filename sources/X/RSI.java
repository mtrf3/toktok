package X;

import com.bytedance.im.core.proto.GetTicketResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSI extends ProtoAdapter<GetTicketResponseBody> {
    public RSI() {
        super(FieldEncoding.LENGTH_DELIMITED, GetTicketResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetTicketResponseBody decode(ProtoReader protoReader) {
        RSJ rsj = new RSJ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rsj.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rsj.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rsj.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetTicketResponseBody getTicketResponseBody) {
        GetTicketResponseBody getTicketResponseBody2 = getTicketResponseBody;
        return getTicketResponseBody2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, getTicketResponseBody2.ticket);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetTicketResponseBody getTicketResponseBody) {
    }
}
