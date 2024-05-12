package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFY extends ProtoAdapter<RHO> {
    public RFY() {
        super(FieldEncoding.LENGTH_DELIMITED, RHO.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHO decode(ProtoReader protoReader) {
        RHO rho = new RHO();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rho.desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rho.rec_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rho;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHO rho) {
        RHO rho2 = rho;
        return rho2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, rho2.desc) + ProtoAdapter.INT32.encodedSizeWithTag(1, rho2.rec_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHO rho) {
        RHO rho2 = rho;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rho2.rec_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rho2.desc);
        protoWriter.writeBytes(rho2.unknownFields());
    }
}
