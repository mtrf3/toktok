package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RU1 extends ProtoAdapter<RU2> {
    public RU1() {
        super(FieldEncoding.LENGTH_DELIMITED, RU2.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RU2 decode(ProtoReader protoReader) {
        RU3 ru3 = new RU3();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    ru3.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    ru3.LIZLLL = RU0.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return ru3.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RU2 ru2) {
        RU2 ru22 = ru2;
        return ru22.unknownFields().size() + RU0.ADAPTER.encodedSizeWithTag(1, ru22.query_data);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.RU3, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final RU2 redact(RU2 ru2) {
        ?? newBuilder2 = ru2.newBuilder2();
        RU0 ru0 = newBuilder2.LIZLLL;
        if (ru0 != null) {
            newBuilder2.LIZLLL = RU0.ADAPTER.redact(ru0);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RU2 ru2) {
        RU2 ru22 = ru2;
        RU0.ADAPTER.encodeWithTag(protoWriter, 1, ru22.query_data);
        protoWriter.writeBytes(ru22.unknownFields());
    }
}
