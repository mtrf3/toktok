package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RO0 extends ProtoAdapter<RO1> {
    public RO0() {
        super(FieldEncoding.LENGTH_DELIMITED, RO1.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RO1 decode(ProtoReader protoReader) {
        RO1 ro1 = new RO1();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            ro1.url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        ro1.lang = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    ro1.keyword = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return ro1;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RO1 ro1) {
        RO1 ro12 = ro1;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return ro12.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, ro12.url) + protoAdapter.encodedSizeWithTag(2, ro12.lang) + protoAdapter.encodedSizeWithTag(1, ro12.keyword);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RO1 ro1) {
        RO1 ro12 = ro1;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, ro12.keyword);
        protoAdapter.encodeWithTag(protoWriter, 2, ro12.lang);
        protoAdapter.encodeWithTag(protoWriter, 3, ro12.url);
        protoWriter.writeBytes(ro12.unknownFields());
    }
}
