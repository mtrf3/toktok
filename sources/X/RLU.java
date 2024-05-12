package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RLU extends ProtoAdapter<RLV> {
    public RLU() {
        super(FieldEncoding.LENGTH_DELIMITED, RLV.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RLV decode(ProtoReader protoReader) {
        RLV rlv = new RLV();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rlv.download_url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rlv.token = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rlv.schema = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rlv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RLV rlv) {
        RLV rlv2 = rlv;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rlv2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rlv2.download_url) + protoAdapter.encodedSizeWithTag(2, rlv2.token) + protoAdapter.encodedSizeWithTag(1, rlv2.schema);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RLV rlv) {
        RLV rlv2 = rlv;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rlv2.schema);
        protoAdapter.encodeWithTag(protoWriter, 2, rlv2.token);
        protoAdapter.encodeWithTag(protoWriter, 3, rlv2.download_url);
        protoWriter.writeBytes(rlv2.unknownFields());
    }
}
