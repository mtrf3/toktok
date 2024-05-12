package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFB extends ProtoAdapter<RHG> {
    public RFB() {
        super(FieldEncoding.LENGTH_DELIMITED, RHG.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHG decode(ProtoReader protoReader) {
        RHG rhg = new RHG();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhg.avatar = C69277RGv.ADAPTER.decode(protoReader);
                        }
                    } else {
                        rhg.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhg.id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhg;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHG rhg) {
        RHG rhg2 = rhg;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhg2.unknownFields().size() + C69277RGv.ADAPTER.encodedSizeWithTag(3, rhg2.avatar) + protoAdapter.encodedSizeWithTag(2, rhg2.name) + protoAdapter.encodedSizeWithTag(1, rhg2.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHG rhg) {
        RHG rhg2 = rhg;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhg2.id);
        protoAdapter.encodeWithTag(protoWriter, 2, rhg2.name);
        C69277RGv.ADAPTER.encodeWithTag(protoWriter, 3, rhg2.avatar);
        protoWriter.writeBytes(rhg2.unknownFields());
    }
}
