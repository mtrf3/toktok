package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RNK extends ProtoAdapter<RNL> {
    public RNK() {
        super(FieldEncoding.LENGTH_DELIMITED, RNL.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RNL decode(ProtoReader protoReader) {
        RNL rnl = new RNL();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rnl.file_type = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rnl.material_url = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rnl;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RNL rnl) {
        RNL rnl2 = rnl;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rnl2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rnl2.file_type) + protoAdapter.encodedSizeWithTag(1, rnl2.material_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RNL rnl) {
        RNL rnl2 = rnl;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rnl2.material_url);
        protoAdapter.encodeWithTag(protoWriter, 2, rnl2.file_type);
        protoWriter.writeBytes(rnl2.unknownFields());
    }
}
