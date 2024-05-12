package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RFg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69236RFg extends ProtoAdapter<RHN> {
    public C69236RFg() {
        super(FieldEncoding.LENGTH_DELIMITED, RHN.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHN decode(ProtoReader protoReader) {
        RHN rhn = new RHN();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rhn.end = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rhn.begin = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhn;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHN rhn) {
        RHN rhn2 = rhn;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rhn2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rhn2.end) + protoAdapter.encodedSizeWithTag(1, rhn2.begin);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHN rhn) {
        RHN rhn2 = rhn;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rhn2.begin);
        protoAdapter.encodeWithTag(protoWriter, 2, rhn2.end);
        protoWriter.writeBytes(rhn2.unknownFields());
    }
}
