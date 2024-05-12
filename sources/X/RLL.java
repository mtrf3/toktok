package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RLL extends ProtoAdapter<RLM> {
    public RLL() {
        super(FieldEncoding.LENGTH_DELIMITED, RLM.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RLM decode(ProtoReader protoReader) {
        RLM rlm = new RLM();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    rlm.play_addr = REV.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rlm;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RLM rlm) {
        RLM rlm2 = rlm;
        return rlm2.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(1, rlm2.play_addr);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RLM rlm) {
        RLM rlm2 = rlm;
        REV.ADAPTER.encodeWithTag(protoWriter, 1, rlm2.play_addr);
        protoWriter.writeBytes(rlm2.unknownFields());
    }
}
