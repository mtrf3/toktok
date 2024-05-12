package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RMY extends ProtoAdapter<RMZ> {
    public RMY() {
        super(FieldEncoding.LENGTH_DELIMITED, RMZ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RMZ decode(ProtoReader protoReader) {
        RMZ rmz = new RMZ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rmz.topic_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rmz.topic_id = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rmz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RMZ rmz) {
        RMZ rmz2 = rmz;
        return rmz2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, rmz2.topic_text) + ProtoAdapter.INT64.encodedSizeWithTag(1, rmz2.topic_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RMZ rmz) {
        RMZ rmz2 = rmz;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, rmz2.topic_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rmz2.topic_text);
        protoWriter.writeBytes(rmz2.unknownFields());
    }
}
