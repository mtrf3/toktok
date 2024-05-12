package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RNT extends ProtoAdapter<RNU> {
    public RNT() {
        super(FieldEncoding.LENGTH_DELIMITED, RNU.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RNU decode(ProtoReader protoReader) {
        RNU rnu = new RNU();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rnu.redirect_uri = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rnu.button_label = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rnu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RNU rnu) {
        RNU rnu2 = rnu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rnu2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rnu2.redirect_uri) + protoAdapter.encodedSizeWithTag(1, rnu2.button_label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RNU rnu) {
        RNU rnu2 = rnu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rnu2.button_label);
        protoAdapter.encodeWithTag(protoWriter, 2, rnu2.redirect_uri);
        protoWriter.writeBytes(rnu2.unknownFields());
    }
}
