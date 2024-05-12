package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RLX extends ProtoAdapter<RLY> {
    public RLX() {
        super(FieldEncoding.LENGTH_DELIMITED, RLY.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RLY decode(ProtoReader protoReader) {
        RLY rly = new RLY();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rly.external_username = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rly.hashed_phone_number = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rly.reason = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rly;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RLY rly) {
        RLY rly2 = rly;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rly2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rly2.external_username) + protoAdapter.encodedSizeWithTag(2, rly2.hashed_phone_number) + protoAdapter.encodedSizeWithTag(1, rly2.reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RLY rly) {
        RLY rly2 = rly;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rly2.reason);
        protoAdapter.encodeWithTag(protoWriter, 2, rly2.hashed_phone_number);
        protoAdapter.encodeWithTag(protoWriter, 3, rly2.external_username);
        protoWriter.writeBytes(rly2.unknownFields());
    }
}
