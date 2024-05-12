package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFO extends ProtoAdapter<RHK> {
    public RFO() {
        super(FieldEncoding.LENGTH_DELIMITED, RHK.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHK decode(ProtoReader protoReader) {
        RHK rhk = new RHK();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    rhk.redirection_schema = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                rhk.genus_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rhk.genus_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rhk.species_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhk.species_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhk;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHK rhk) {
        RHK rhk2 = rhk;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhk2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, rhk2.redirection_schema) + protoAdapter.encodedSizeWithTag(4, rhk2.genus_name) + protoAdapter.encodedSizeWithTag(3, rhk2.genus_id) + protoAdapter.encodedSizeWithTag(2, rhk2.species_name) + protoAdapter.encodedSizeWithTag(1, rhk2.species_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHK rhk) {
        RHK rhk2 = rhk;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhk2.species_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rhk2.species_name);
        protoAdapter.encodeWithTag(protoWriter, 3, rhk2.genus_id);
        protoAdapter.encodeWithTag(protoWriter, 4, rhk2.genus_name);
        protoAdapter.encodeWithTag(protoWriter, 5, rhk2.redirection_schema);
        protoWriter.writeBytes(rhk2.unknownFields());
    }
}
