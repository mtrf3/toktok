package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RNY extends ProtoAdapter<RNZ> {
    public RNY() {
        super(FieldEncoding.LENGTH_DELIMITED, RNZ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RNZ decode(ProtoReader protoReader) {
        RNZ rnz = new RNZ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rnz.blur_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rnz.forced_visibility = RNX.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rnz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RNZ rnz) {
        RNZ rnz2 = rnz;
        return rnz2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, rnz2.blur_type) + RNX.ADAPTER.encodedSizeWithTag(1, rnz2.forced_visibility);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RNZ rnz) {
        RNZ rnz2 = rnz;
        RNX.ADAPTER.encodeWithTag(protoWriter, 1, rnz2.forced_visibility);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, rnz2.blur_type);
        protoWriter.writeBytes(rnz2.unknownFields());
    }
}
