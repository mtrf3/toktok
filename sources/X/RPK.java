package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RPK extends ProtoAdapter<RPL> {
    public RPK() {
        super(FieldEncoding.LENGTH_DELIMITED, RPL.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RPL decode(ProtoReader protoReader) {
        RPL rpl = new RPL();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 2) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    rpl.impr_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rpl;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RPL rpl) {
        RPL rpl2 = rpl;
        return rpl2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, rpl2.impr_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RPL rpl) {
        RPL rpl2 = rpl;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rpl2.impr_id);
        protoWriter.writeBytes(rpl2.unknownFields());
    }
}
