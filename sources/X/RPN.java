package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RPN extends ProtoAdapter<RPO> {
    public RPN() {
        super(FieldEncoding.LENGTH_DELIMITED, RPO.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RPO decode(ProtoReader protoReader) {
        RPO rpo = new RPO();
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
                                    rpo.log_pb = RPL.ADAPTER.decode(protoReader);
                                }
                            } else {
                                rpo.awemes.add(RCZ.ADAPTER.decode(protoReader));
                            }
                        } else {
                            rpo.has_more = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rpo.status_msg = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rpo.status_code = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rpo;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RPO rpo) {
        RPO rpo2 = rpo;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rpo2.unknownFields().size() + RPL.ADAPTER.encodedSizeWithTag(5, rpo2.log_pb) + RCZ.ADAPTER.asRepeated().encodedSizeWithTag(4, rpo2.awemes) + protoAdapter.encodedSizeWithTag(3, rpo2.has_more) + ProtoAdapter.STRING.encodedSizeWithTag(2, rpo2.status_msg) + protoAdapter.encodedSizeWithTag(1, rpo2.status_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RPO rpo) {
        RPO rpo2 = rpo;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rpo2.status_code);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rpo2.status_msg);
        protoAdapter.encodeWithTag(protoWriter, 3, rpo2.has_more);
        RCZ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, rpo2.awemes);
        RPL.ADAPTER.encodeWithTag(protoWriter, 5, rpo2.log_pb);
        protoWriter.writeBytes(rpo2.unknownFields());
    }
}
