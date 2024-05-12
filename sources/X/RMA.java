package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RMA extends ProtoAdapter<RMB> {
    public RMA() {
        super(FieldEncoding.LENGTH_DELIMITED, RMB.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RMB decode(ProtoReader protoReader) {
        RMB rmb = new RMB();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    rmb.status = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rmb;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RMB rmb) {
        RMB rmb2 = rmb;
        return rmb2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(1, rmb2.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RMB rmb) {
        RMB rmb2 = rmb;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rmb2.status);
        protoWriter.writeBytes(rmb2.unknownFields());
    }
}
