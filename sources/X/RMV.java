package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RMV extends ProtoAdapter<RMW> {
    public RMV() {
        super(FieldEncoding.LENGTH_DELIMITED, RMW.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RMW decode(ProtoReader protoReader) {
        RMW rmw = new RMW();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rmw.GroupdIdList1.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    rmw.GroupdIdList0.add(ProtoAdapter.INT64.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rmw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RMW rmw) {
        RMW rmw2 = rmw;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return rmw2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(2, rmw2.GroupdIdList1) + protoAdapter.asRepeated().encodedSizeWithTag(1, rmw2.GroupdIdList0);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RMW rmw) {
        RMW rmw2 = rmw;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, rmw2.GroupdIdList0);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, rmw2.GroupdIdList1);
        protoWriter.writeBytes(rmw2.unknownFields());
    }
}
