package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RM0 extends ProtoAdapter<RM1> {
    public RM0() {
        super(FieldEncoding.LENGTH_DELIMITED, RM1.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RM1 decode(ProtoReader protoReader) {
        RM1 rm1 = new RM1();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rm1.links.add(C69411RLz.ADAPTER.decode(protoReader));
                    }
                } else {
                    rm1.text = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rm1;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RM1 rm1) {
        RM1 rm12 = rm1;
        return rm12.unknownFields().size() + C69411RLz.ADAPTER.asRepeated().encodedSizeWithTag(2, rm12.links) + ProtoAdapter.STRING.encodedSizeWithTag(1, rm12.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RM1 rm1) {
        RM1 rm12 = rm1;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rm12.text);
        C69411RLz.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, rm12.links);
        protoWriter.writeBytes(rm12.unknownFields());
    }
}
