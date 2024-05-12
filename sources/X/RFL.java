package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFL extends ProtoAdapter<RH3> {
    public RFL() {
        super(FieldEncoding.LENGTH_DELIMITED, RH3.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RH3 decode(ProtoReader protoReader) {
        RH3 rh3 = new RH3();
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
                                rh3.video_duration_precision = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            rh3.audition_duration_precision = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        rh3.shoot_duration_precision = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    rh3.duration_precision = ProtoAdapter.DOUBLE.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rh3;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RH3 rh3) {
        RH3 rh32 = rh3;
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        return rh32.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, rh32.video_duration_precision) + protoAdapter.encodedSizeWithTag(3, rh32.audition_duration_precision) + protoAdapter.encodedSizeWithTag(2, rh32.shoot_duration_precision) + protoAdapter.encodedSizeWithTag(1, rh32.duration_precision);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RH3 rh3) {
        RH3 rh32 = rh3;
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, rh32.duration_precision);
        protoAdapter.encodeWithTag(protoWriter, 2, rh32.shoot_duration_precision);
        protoAdapter.encodeWithTag(protoWriter, 3, rh32.audition_duration_precision);
        protoAdapter.encodeWithTag(protoWriter, 4, rh32.video_duration_precision);
        protoWriter.writeBytes(rh32.unknownFields());
    }
}
