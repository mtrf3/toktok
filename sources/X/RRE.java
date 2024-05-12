package X;

import com.bytedance.im.core.proto.AckMessageResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRE extends ProtoAdapter<AckMessageResponseBody> {
    public RRE() {
        super(FieldEncoding.LENGTH_DELIMITED, AckMessageResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final AckMessageResponseBody decode(ProtoReader protoReader) {
        RRF rrf = new RRF();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rrf.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rrf.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rrf.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(AckMessageResponseBody ackMessageResponseBody) {
        AckMessageResponseBody ackMessageResponseBody2 = ackMessageResponseBody;
        return ackMessageResponseBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(1, ackMessageResponseBody2.backend_e2e_latency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AckMessageResponseBody ackMessageResponseBody) {
    }
}
