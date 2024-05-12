package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RPH extends ProtoAdapter<RPI> {
    public RPH() {
        super(FieldEncoding.LENGTH_DELIMITED, RPI.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RPI decode(ProtoReader protoReader) {
        RPI rpi = new RPI();
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
                                    rpi.log_pb = RPF.ADAPTER.decode(protoReader);
                                }
                            } else {
                                rpi.awemes.add(RCZ.ADAPTER.decode(protoReader));
                            }
                        } else {
                            rpi.has_more = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rpi.status_msg = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rpi.status_code = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rpi;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RPI rpi) {
        RPI rpi2 = rpi;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rpi2.unknownFields().size() + RPF.ADAPTER.encodedSizeWithTag(5, rpi2.log_pb) + RCZ.ADAPTER.asRepeated().encodedSizeWithTag(4, rpi2.awemes) + protoAdapter.encodedSizeWithTag(3, rpi2.has_more) + ProtoAdapter.STRING.encodedSizeWithTag(2, rpi2.status_msg) + protoAdapter.encodedSizeWithTag(1, rpi2.status_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RPI rpi) {
        RPI rpi2 = rpi;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rpi2.status_code);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rpi2.status_msg);
        protoAdapter.encodeWithTag(protoWriter, 3, rpi2.has_more);
        RCZ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, rpi2.awemes);
        RPF.ADAPTER.encodeWithTag(protoWriter, 5, rpi2.log_pb);
        protoWriter.writeBytes(rpi2.unknownFields());
    }
}
