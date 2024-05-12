package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RKK extends ProtoAdapter<RKL> {
    public RKK() {
        super(FieldEncoding.LENGTH_DELIMITED, RKL.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RKL decode(ProtoReader protoReader) {
        RKL rkl = new RKL();
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
                                rkl.leading = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            rkl.bottom = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rkl.trailing = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rkl.top = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rkl;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RKL rkl) {
        RKL rkl2 = rkl;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rkl2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rkl2.leading) + protoAdapter.encodedSizeWithTag(3, rkl2.bottom) + protoAdapter.encodedSizeWithTag(2, rkl2.trailing) + protoAdapter.encodedSizeWithTag(1, rkl2.top);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RKL rkl) {
        RKL rkl2 = rkl;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rkl2.top);
        protoAdapter.encodeWithTag(protoWriter, 2, rkl2.trailing);
        protoAdapter.encodeWithTag(protoWriter, 3, rkl2.bottom);
        protoAdapter.encodeWithTag(protoWriter, 4, rkl2.leading);
        protoWriter.writeBytes(rkl2.unknownFields());
    }
}
