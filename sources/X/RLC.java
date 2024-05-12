package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RLC extends ProtoAdapter<RLD> {
    public RLC() {
        super(FieldEncoding.LENGTH_DELIMITED, RLD.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RLD decode(ProtoReader protoReader) {
        RLD rld = new RLD();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rld.interaction_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rld.disable_toast = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rld.status = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rld;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RLD rld) {
        RLD rld2 = rld;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, rld2.status);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rld2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rld2.interaction_text) + protoAdapter.encodedSizeWithTag(2, rld2.disable_toast) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RLD rld) {
        RLD rld2 = rld;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rld2.status);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rld2.disable_toast);
        protoAdapter.encodeWithTag(protoWriter, 3, rld2.interaction_text);
        protoWriter.writeBytes(rld2.unknownFields());
    }
}
