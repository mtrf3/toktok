package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RMS extends ProtoAdapter<RMT> {
    public RMS() {
        super(FieldEncoding.LENGTH_DELIMITED, RMT.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RMT decode(ProtoReader protoReader) {
        RMT rmt = new RMT();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rmt.notify_msg = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rmt.platforms.add(ProtoAdapter.STRING.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rmt;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RMT rmt) {
        RMT rmt2 = rmt;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rmt2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rmt2.notify_msg) + protoAdapter.asRepeated().encodedSizeWithTag(1, rmt2.platforms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RMT rmt) {
        RMT rmt2 = rmt;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, rmt2.platforms);
        protoAdapter.encodeWithTag(protoWriter, 2, rmt2.notify_msg);
        protoWriter.writeBytes(rmt2.unknownFields());
    }
}
