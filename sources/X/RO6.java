package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RO6 extends ProtoAdapter<RO7> {
    public RO6() {
        super(FieldEncoding.LENGTH_DELIMITED, RO7.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RO7 decode(ProtoReader protoReader) {
        RO7 ro7 = new RO7();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    ro7.poi_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return ro7;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RO7 ro7) {
        RO7 ro72 = ro7;
        return ro72.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, ro72.poi_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RO7 ro7) {
        RO7 ro72 = ro7;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ro72.poi_id);
        protoWriter.writeBytes(ro72.unknownFields());
    }
}
