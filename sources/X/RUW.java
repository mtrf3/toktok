package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RUW extends ProtoAdapter<RUV> {
    public RUW() {
        super(FieldEncoding.LENGTH_DELIMITED, RUV.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RUV decode(ProtoReader protoReader) {
        RUX rux = new RUX();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        rux.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        rux.LJ.add(RUF.ADAPTER.decode(protoReader));
                    }
                } else {
                    rux.LIZLLL = RUF.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rux.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RUV ruv) {
        RUV ruv2 = ruv;
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        return ruv2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(2, ruv2.contents) + protoAdapter.encodedSizeWithTag(1, ruv2.description);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.RUX, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final RUV redact(RUV ruv) {
        ?? newBuilder2 = ruv.newBuilder2();
        RUF ruf = newBuilder2.LIZLLL;
        if (ruf != null) {
            newBuilder2.LIZLLL = RUF.ADAPTER.redact(ruf);
        }
        C63685Oz3.LJIIIZ(newBuilder2.LJ, RUF.ADAPTER);
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RUV ruv) {
        RUV ruv2 = ruv;
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, ruv2.description);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, ruv2.contents);
        protoWriter.writeBytes(ruv2.unknownFields());
    }
}
