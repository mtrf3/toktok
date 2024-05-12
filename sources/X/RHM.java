package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RHM extends ProtoAdapter<RHL> {
    public RHM() {
        super(FieldEncoding.LENGTH_DELIMITED, RHL.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHL decode(ProtoReader protoReader) {
        RHL rhl = new RHL();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    rhl.primary_btn = RN6.ADAPTER.decode(protoReader);
                                }
                            } else {
                                rhl.content = C69390RLe.ADAPTER.decode(protoReader);
                            }
                        } else {
                            rhl.schema_url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rhl.show_delay_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rhl.activity_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhl;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHL rhl) {
        RHL rhl2 = rhl;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhl2.unknownFields().size() + RN6.ADAPTER.encodedSizeWithTag(5, rhl2.primary_btn) + C69390RLe.ADAPTER.encodedSizeWithTag(4, rhl2.content) + protoAdapter.encodedSizeWithTag(3, rhl2.schema_url) + ProtoAdapter.INT64.encodedSizeWithTag(2, rhl2.show_delay_time) + protoAdapter.encodedSizeWithTag(1, rhl2.activity_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHL rhl) {
        RHL rhl2 = rhl;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhl2.activity_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, rhl2.show_delay_time);
        protoAdapter.encodeWithTag(protoWriter, 3, rhl2.schema_url);
        C69390RLe.ADAPTER.encodeWithTag(protoWriter, 4, rhl2.content);
        RN6.ADAPTER.encodeWithTag(protoWriter, 5, rhl2.primary_btn);
        protoWriter.writeBytes(rhl2.unknownFields());
    }
}
