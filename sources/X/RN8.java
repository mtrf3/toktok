package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RN8 extends ProtoAdapter<RN9> {
    public RN8() {
        super(FieldEncoding.LENGTH_DELIMITED, RN9.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RN9 decode(ProtoReader protoReader) {
        RN9 rn9 = new RN9();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rn9.web_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rn9.title = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rn9;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RN9 rn9) {
        RN9 rn92 = rn9;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rn92.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rn92.web_url) + protoAdapter.encodedSizeWithTag(1, rn92.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RN9 rn9) {
        RN9 rn92 = rn9;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rn92.title);
        protoAdapter.encodeWithTag(protoWriter, 2, rn92.web_url);
        protoWriter.writeBytes(rn92.unknownFields());
    }
}
