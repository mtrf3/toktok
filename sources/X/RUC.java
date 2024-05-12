package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RUC extends ProtoAdapter<RUB> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public RUC() {
        super(FieldEncoding.LENGTH_DELIMITED, RUB.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RUB decode(ProtoReader protoReader) {
        RUD rud = new RUD();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                rud.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                rud.LJI.putAll(this.LJ.decode(protoReader));
                            }
                        } else {
                            rud.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rud.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    rud.LIZLLL = RU9.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rud.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RUB rub) {
        RUB rub2 = rub;
        return rub2.unknownFields().size() + this.LJ.encodedSizeWithTag(4, rub2.extra) + ProtoAdapter.INT64.encodedSizeWithTag(3, rub2.min_version) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, rub2.context_menu) + RU9.ADAPTER.encodedSizeWithTag(1, rub2.ttl);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.RUD, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final RUB redact(RUB rub) {
        ?? newBuilder2 = rub.newBuilder2();
        RU9 ru9 = newBuilder2.LIZLLL;
        if (ru9 != null) {
            newBuilder2.LIZLLL = RU9.ADAPTER.redact(ru9);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RUB rub) {
        RUB rub2 = rub;
        RU9.ADAPTER.encodeWithTag(protoWriter, 1, rub2.ttl);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, rub2.context_menu);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, rub2.min_version);
        this.LJ.encodeWithTag(protoWriter, 4, rub2.extra);
        protoWriter.writeBytes(rub2.unknownFields());
    }
}
