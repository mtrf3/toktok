package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDV extends ProtoAdapter<RG3> {
    public RDV() {
        super(FieldEncoding.LENGTH_DELIMITED, RG3.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RG3 decode(ProtoReader protoReader) {
        RG3 rg3 = new RG3();
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
                                    rg3.audio = RGC.ADAPTER.decode(protoReader);
                                }
                            } else {
                                rg3.video_control = C69235RFf.ADAPTER.decode(protoReader);
                            }
                        } else {
                            rg3.trailer_start_time = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        rg3.long_video_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rg3.video = C69159RCh.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rg3;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RG3 rg3) {
        RG3 rg32 = rg3;
        return rg32.unknownFields().size() + RGC.ADAPTER.encodedSizeWithTag(5, rg32.audio) + C69235RFf.ADAPTER.encodedSizeWithTag(4, rg32.video_control) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, rg32.trailer_start_time) + ProtoAdapter.INT32.encodedSizeWithTag(2, rg32.long_video_type) + C69159RCh.ADAPTER.encodedSizeWithTag(1, rg32.video);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RG3 rg3) {
        RG3 rg32 = rg3;
        C69159RCh.ADAPTER.encodeWithTag(protoWriter, 1, rg32.video);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, rg32.long_video_type);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, rg32.trailer_start_time);
        C69235RFf.ADAPTER.encodeWithTag(protoWriter, 4, rg32.video_control);
        RGC.ADAPTER.encodeWithTag(protoWriter, 5, rg32.audio);
        protoWriter.writeBytes(rg32.unknownFields());
    }
}
