package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RNW extends ProtoAdapter<RNX> {
    public RNW() {
        super(FieldEncoding.LENGTH_DELIMITED, RNX.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RNX decode(ProtoReader protoReader) {
        RNX rnx = new RNX();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rnx.message = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rnx.state = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rnx;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RNX rnx) {
        RNX rnx2 = rnx;
        return rnx2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, rnx2.message) + ProtoAdapter.INT32.encodedSizeWithTag(1, rnx2.state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RNX rnx) {
        RNX rnx2 = rnx;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rnx2.state);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rnx2.message);
        protoWriter.writeBytes(rnx2.unknownFields());
    }
}
