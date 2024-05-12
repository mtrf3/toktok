package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RU8 extends ProtoAdapter<RU9> {
    public RU8() {
        super(FieldEncoding.LENGTH_DELIMITED, RU9.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RU9 decode(ProtoReader protoReader) {
        RUA rua = new RUA();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rua.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rua.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rua.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RU9 ru9) {
        RU9 ru92 = ru9;
        return ru92.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(1, ru92.expired_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RU9 redact(RU9 ru9) {
        Message.Builder<RU9, RUA> newBuilder2 = ru9.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RU9 ru9) {
        RU9 ru92 = ru9;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, ru92.expired_at);
        protoWriter.writeBytes(ru92.unknownFields());
    }
}
