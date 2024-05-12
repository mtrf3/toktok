package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RLO extends ProtoAdapter<RLP> {
    public RLO() {
        super(FieldEncoding.LENGTH_DELIMITED, RLP.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RLP decode(ProtoReader protoReader) {
        RLP rlp = new RLP();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rlp.open_url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rlp.web_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rlp.desc = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rlp;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RLP rlp) {
        RLP rlp2 = rlp;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rlp2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rlp2.open_url) + protoAdapter.encodedSizeWithTag(2, rlp2.web_url) + protoAdapter.encodedSizeWithTag(1, rlp2.desc);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RLP rlp) {
        RLP rlp2 = rlp;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rlp2.desc);
        protoAdapter.encodeWithTag(protoWriter, 2, rlp2.web_url);
        protoAdapter.encodeWithTag(protoWriter, 3, rlp2.open_url);
        protoWriter.writeBytes(rlp2.unknownFields());
    }
}
