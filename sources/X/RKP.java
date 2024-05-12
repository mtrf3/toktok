package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RKP extends ProtoAdapter<RKQ> {
    public RKP() {
        super(FieldEncoding.LENGTH_DELIMITED, RKQ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RKQ decode(ProtoReader protoReader) {
        RKQ rkq = new RKQ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    rkq.biz_permissions.add(RKO.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rkq;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RKQ rkq) {
        RKQ rkq2 = rkq;
        return rkq2.unknownFields().size() + RKO.ADAPTER.asRepeated().encodedSizeWithTag(1, rkq2.biz_permissions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RKQ rkq) {
        RKQ rkq2 = rkq;
        RKO.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, rkq2.biz_permissions);
        protoWriter.writeBytes(rkq2.unknownFields());
    }
}
