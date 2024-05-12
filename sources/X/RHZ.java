package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RHZ extends ProtoAdapter<RHY> {
    public RHZ() {
        super(FieldEncoding.LENGTH_DELIMITED, RHY.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHY decode(ProtoReader protoReader) {
        RHY rhy = new RHY();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 5) {
                                C1EW.LIZJ(protoReader, protoReader);
                            } else {
                                rhy.data = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rhy.item_like_egg = RNL.ADAPTER.decode(protoReader);
                        }
                    } else {
                        rhy.priority = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rhy.type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhy;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHY rhy) {
        RHY rhy2 = rhy;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rhy2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(5, rhy2.data) + RNL.ADAPTER.encodedSizeWithTag(3, rhy2.item_like_egg) + protoAdapter.encodedSizeWithTag(2, rhy2.priority) + protoAdapter.encodedSizeWithTag(1, rhy2.type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHY rhy) {
        RHY rhy2 = rhy;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rhy2.type);
        protoAdapter.encodeWithTag(protoWriter, 2, rhy2.priority);
        RNL.ADAPTER.encodeWithTag(protoWriter, 3, rhy2.item_like_egg);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, rhy2.data);
        protoWriter.writeBytes(rhy2.unknownFields());
    }
}
