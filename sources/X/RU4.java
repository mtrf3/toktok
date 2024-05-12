package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RU4 extends ProtoAdapter<RU5> {
    public RU4() {
        super(FieldEncoding.LENGTH_DELIMITED, RU5.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RU5 decode(ProtoReader protoReader) {
        RU6 ru6 = new RU6();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        ru6.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        ru6.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    ru6.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return ru6.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RU5 ru5) {
        RU5 ru52 = ru5;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return ru52.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, ru52.width) + protoAdapter.encodedSizeWithTag(1, ru52.height);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.RU6, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final RU5 redact(RU5 ru5) {
        ?? newBuilder2 = ru5.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RU5 ru5) {
        RU5 ru52 = ru5;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, ru52.height);
        protoAdapter.encodeWithTag(protoWriter, 2, ru52.width);
        protoWriter.writeBytes(ru52.unknownFields());
    }
}
