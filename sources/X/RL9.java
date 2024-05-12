package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RL9 extends ProtoAdapter<RLA> {
    public RL9() {
        super(FieldEncoding.LENGTH_DELIMITED, RLA.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RLA decode(ProtoReader protoReader) {
        RLA rla = new RLA();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rla.log_extra = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rla.ad_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rla.creative_id = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rla;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RLA rla) {
        RLA rla2 = rla;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return rla2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(3, rla2.log_extra) + protoAdapter.encodedSizeWithTag(2, rla2.ad_id) + protoAdapter.encodedSizeWithTag(1, rla2.creative_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RLA rla) {
        RLA rla2 = rla;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, rla2.creative_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rla2.ad_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rla2.log_extra);
        protoWriter.writeBytes(rla2.unknownFields());
    }
}
