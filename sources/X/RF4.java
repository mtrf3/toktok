package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RF4 extends ProtoAdapter<RH9> {
    public RF4() {
        super(FieldEncoding.LENGTH_DELIMITED, RH9.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH9 decode(ProtoReader protoReader) {
        RH9 rh9 = new RH9();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rh9.label_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rh9.label_url = REV.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh9;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH9 rh9) {
        RH9 rh92 = rh9;
        return rh92.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, rh92.label_type) + REV.ADAPTER.encodedSizeWithTag(1, rh92.label_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH9 rh9) {
        RH9 rh92 = rh9;
        REV.ADAPTER.encodeWithTag(protoWriter, 1, rh92.label_url);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, rh92.label_type);
        protoWriter.writeBytes(rh92.unknownFields());
    }
}
