package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RF8 extends ProtoAdapter<RHF> {
    public RF8() {
        super(FieldEncoding.LENGTH_DELIMITED, RHF.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHF decode(ProtoReader protoReader) {
        RHF rhf = new RHF();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhf.region = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rhf.end_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rhf.target_vv = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhf;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHF rhf) {
        RHF rhf2 = rhf;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return rhf2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(3, rhf2.region) + protoAdapter.encodedSizeWithTag(2, rhf2.end_time) + protoAdapter.encodedSizeWithTag(1, rhf2.target_vv);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHF rhf) {
        RHF rhf2 = rhf;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, rhf2.target_vv);
        protoAdapter.encodeWithTag(protoWriter, 2, rhf2.end_time);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rhf2.region);
        protoWriter.writeBytes(rhf2.unknownFields());
    }
}
