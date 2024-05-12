package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFN extends ProtoAdapter<RHJ> {
    public RFN() {
        super(FieldEncoding.LENGTH_DELIMITED, RHJ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHJ decode(ProtoReader protoReader) {
        RHJ rhj = new RHJ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                C1EW.LIZJ(protoReader, protoReader);
                            } else {
                                rhj.external_song_key = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rhj.partner_song_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rhj.partner_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhj.h5_url = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhj;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHJ rhj) {
        RHJ rhj2 = rhj;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhj2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rhj2.external_song_key) + protoAdapter.encodedSizeWithTag(3, rhj2.partner_song_id) + protoAdapter.encodedSizeWithTag(2, rhj2.partner_name) + protoAdapter.encodedSizeWithTag(1, rhj2.h5_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHJ rhj) {
        RHJ rhj2 = rhj;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhj2.h5_url);
        protoAdapter.encodeWithTag(protoWriter, 2, rhj2.partner_name);
        protoAdapter.encodeWithTag(protoWriter, 3, rhj2.partner_song_id);
        protoAdapter.encodeWithTag(protoWriter, 4, rhj2.external_song_key);
        protoWriter.writeBytes(rhj2.unknownFields());
    }
}
