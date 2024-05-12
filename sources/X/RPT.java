package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RPT extends ProtoAdapter<RPU> {
    public RPT() {
        super(FieldEncoding.LENGTH_DELIMITED, RPU.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RPU decode(ProtoReader protoReader) {
        RPU rpu = new RPU();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rpu.species_schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rpu.species_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rpu.species_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rpu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RPU rpu) {
        RPU rpu2 = rpu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rpu2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rpu2.species_schema) + protoAdapter.encodedSizeWithTag(2, rpu2.species_name) + protoAdapter.encodedSizeWithTag(1, rpu2.species_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RPU rpu) {
        RPU rpu2 = rpu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rpu2.species_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rpu2.species_name);
        protoAdapter.encodeWithTag(protoWriter, 3, rpu2.species_schema);
        protoWriter.writeBytes(rpu2.unknownFields());
    }
}
