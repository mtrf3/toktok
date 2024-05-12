package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RHR extends ProtoAdapter<RHS> {
    public RHR() {
        super(FieldEncoding.LENGTH_DELIMITED, RHS.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHS decode(ProtoReader protoReader) {
        RHS rhs = new RHS();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhs.total = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rhs.user_list.add(RHQ.ADAPTER.decode(protoReader));
                    }
                } else {
                    rhs.mutual_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhs;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHS rhs) {
        RHS rhs2 = rhs;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rhs2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rhs2.total) + RHQ.ADAPTER.asRepeated().encodedSizeWithTag(2, rhs2.user_list) + protoAdapter.encodedSizeWithTag(1, rhs2.mutual_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHS rhs) {
        RHS rhs2 = rhs;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rhs2.mutual_type);
        RHQ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, rhs2.user_list);
        protoAdapter.encodeWithTag(protoWriter, 3, rhs2.total);
        protoWriter.writeBytes(rhs2.unknownFields());
    }
}
