package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RPE extends ProtoAdapter<RPF> {
    public RPE() {
        super(FieldEncoding.LENGTH_DELIMITED, RPF.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RPF decode(ProtoReader protoReader) {
        RPF rpf = new RPF();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    rpf.impr_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rpf;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RPF rpf) {
        RPF rpf2 = rpf;
        return rpf2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, rpf2.impr_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RPF rpf) {
        RPF rpf2 = rpf;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rpf2.impr_id);
        protoWriter.writeBytes(rpf2.unknownFields());
    }
}
