package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REO extends ProtoAdapter<RG9> {
    public REO() {
        super(FieldEncoding.LENGTH_DELIMITED, RG9.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RG9 decode(ProtoReader protoReader) {
        RG9 rg9 = new RG9();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rg9.extra = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rg9.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rg9.user_list.add(C69255RFz.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rg9;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RG9 rg9) {
        RG9 rg92 = rg9;
        return rg92.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(3, rg92.extra) + ProtoAdapter.INT32.encodedSizeWithTag(2, rg92.type) + C69255RFz.ADAPTER.asRepeated().encodedSizeWithTag(1, rg92.user_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RG9 rg9) {
        RG9 rg92 = rg9;
        C69255RFz.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, rg92.user_list);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, rg92.type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rg92.extra);
        protoWriter.writeBytes(rg92.unknownFields());
    }
}
