package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RP7 extends ProtoAdapter<RP6> {
    public RP7() {
        super(FieldEncoding.LENGTH_DELIMITED, RP6.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RP6 decode(ProtoReader protoReader) {
        RP6 rp6 = new RP6();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                C1EW.LIZJ(protoReader, protoReader);
                            } else {
                                rp6.tracer_info = RP9.ADAPTER.decode(protoReader);
                            }
                        } else {
                            rp6.customized_info = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rp6.standard_ui = C69506RPq.ADAPTER.decode(protoReader);
                    }
                } else {
                    rp6.key = RPC.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rp6;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RP6 rp6) {
        RP6 rp62 = rp6;
        return rp62.unknownFields().size() + RP9.ADAPTER.encodedSizeWithTag(4, rp62.tracer_info) + ProtoAdapter.STRING.encodedSizeWithTag(3, rp62.customized_info) + C69506RPq.ADAPTER.encodedSizeWithTag(2, rp62.standard_ui) + RPC.ADAPTER.encodedSizeWithTag(1, rp62.key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RP6 rp6) {
        RP6 rp62 = rp6;
        RPC.ADAPTER.encodeWithTag(protoWriter, 1, rp62.key);
        C69506RPq.ADAPTER.encodeWithTag(protoWriter, 2, rp62.standard_ui);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rp62.customized_info);
        RP9.ADAPTER.encodeWithTag(protoWriter, 4, rp62.tracer_info);
        protoWriter.writeBytes(rp62.unknownFields());
    }
}
