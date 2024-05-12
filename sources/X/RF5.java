package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RF5 extends ProtoAdapter<RHC> {
    public RF5() {
        super(FieldEncoding.LENGTH_DELIMITED, RHC.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHC decode(ProtoReader protoReader) {
        RHC rhc = new RHC();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhc.priority = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rhc.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rhc.name = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHC rhc) {
        RHC rhc2 = rhc;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, rhc2.name);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rhc2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rhc2.priority) + protoAdapter.encodedSizeWithTag(2, rhc2.type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHC rhc) {
        RHC rhc2 = rhc;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rhc2.name);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, rhc2.type);
        protoAdapter.encodeWithTag(protoWriter, 3, rhc2.priority);
        protoWriter.writeBytes(rhc2.unknownFields());
    }
}
