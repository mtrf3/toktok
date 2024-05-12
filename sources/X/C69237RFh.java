package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RFh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69237RFh extends ProtoAdapter<RHD> {
    public C69237RFh() {
        super(FieldEncoding.LENGTH_DELIMITED, RHD.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHD decode(ProtoReader protoReader) {
        RHD rhd = new RHD();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhd.duration = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        rhd.end = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    rhd.start = ProtoAdapter.DOUBLE.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhd;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHD rhd) {
        RHD rhd2 = rhd;
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        return rhd2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rhd2.duration) + protoAdapter.encodedSizeWithTag(2, rhd2.end) + protoAdapter.encodedSizeWithTag(1, rhd2.start);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHD rhd) {
        RHD rhd2 = rhd;
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, rhd2.start);
        protoAdapter.encodeWithTag(protoWriter, 2, rhd2.end);
        protoAdapter.encodeWithTag(protoWriter, 3, rhd2.duration);
        protoWriter.writeBytes(rhd2.unknownFields());
    }
}
