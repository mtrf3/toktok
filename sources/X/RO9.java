package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RO9 extends ProtoAdapter<ROA> {
    public RO9() {
        super(FieldEncoding.LENGTH_DELIMITED, ROA.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ROA decode(ProtoReader protoReader) {
        ROA roa = new ROA();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 2) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    roa.impr_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return roa;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ROA roa) {
        ROA roa2 = roa;
        return roa2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, roa2.impr_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ROA roa) {
    }
}
