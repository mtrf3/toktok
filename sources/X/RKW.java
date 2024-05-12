package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RKW extends ProtoAdapter<RKX> {
    public RKW() {
        super(FieldEncoding.LENGTH_DELIMITED, RKX.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RKX decode(ProtoReader protoReader) {
        RKX rkx = new RKX();
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
                                rkx.breathe_times = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            rkx.type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rkx.search_word = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rkx.word = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rkx;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RKX rkx) {
        RKX rkx2 = rkx;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, rkx2.search_word) + protoAdapter.encodedSizeWithTag(1, rkx2.word);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return rkx2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(4, rkx2.breathe_times) + protoAdapter2.encodedSizeWithTag(3, rkx2.type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RKX rkx) {
        RKX rkx2 = rkx;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rkx2.word);
        protoAdapter.encodeWithTag(protoWriter, 2, rkx2.search_word);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, rkx2.type);
        protoAdapter2.encodeWithTag(protoWriter, 4, rkx2.breathe_times);
        protoWriter.writeBytes(rkx2.unknownFields());
    }
}
