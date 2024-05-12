package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RPQ extends ProtoAdapter<RPR> {
    public RPQ() {
        super(FieldEncoding.LENGTH_DELIMITED, RPR.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RPR decode(ProtoReader protoReader) {
        RPR rpr = new RPR();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    rpr.nature_species_info = RPU.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rpr;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RPR rpr) {
        RPR rpr2 = rpr;
        return rpr2.unknownFields().size() + RPU.ADAPTER.encodedSizeWithTag(1, rpr2.nature_species_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RPR rpr) {
        RPR rpr2 = rpr;
        RPU.ADAPTER.encodeWithTag(protoWriter, 1, rpr2.nature_species_info);
        protoWriter.writeBytes(rpr2.unknownFields());
    }
}
