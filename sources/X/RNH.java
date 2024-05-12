package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RNH extends ProtoAdapter<RNI> {
    public RNH() {
        super(FieldEncoding.LENGTH_DELIMITED, RNI.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RNI decode(ProtoReader protoReader) {
        RNI rni = new RNI();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rni.url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rni.keyword = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rni;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RNI rni) {
        RNI rni2 = rni;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rni2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rni2.url) + protoAdapter.encodedSizeWithTag(1, rni2.keyword);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RNI rni) {
        RNI rni2 = rni;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rni2.keyword);
        protoAdapter.encodeWithTag(protoWriter, 2, rni2.url);
        protoWriter.writeBytes(rni2.unknownFields());
    }
}
