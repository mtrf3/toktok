package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RMD extends ProtoAdapter<RME> {
    public RMD() {
        super(FieldEncoding.LENGTH_DELIMITED, RME.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RME decode(ProtoReader protoReader) {
        RME rme = new RME();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 2) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    rme.impr_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rme;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RME rme) {
        RME rme2 = rme;
        return rme2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, rme2.impr_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RME rme) {
        RME rme2 = rme;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rme2.impr_id);
        protoWriter.writeBytes(rme2.unknownFields());
    }
}
