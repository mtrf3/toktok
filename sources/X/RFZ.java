package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RFZ extends ProtoAdapter<C69265RGj> {
    public RFZ() {
        super(FieldEncoding.LENGTH_DELIMITED, C69265RGj.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69265RGj decode(ProtoReader protoReader) {
        C69265RGj c69265RGj = new C69265RGj();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69265RGj.ttec_suggest_words.add(RFS.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69265RGj;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69265RGj c69265RGj) {
        C69265RGj c69265RGj2 = c69265RGj;
        return c69265RGj2.unknownFields().size() + RFS.ADAPTER.asRepeated().encodedSizeWithTag(1, c69265RGj2.ttec_suggest_words);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69265RGj c69265RGj) {
        C69265RGj c69265RGj2 = c69265RGj;
        RFS.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c69265RGj2.ttec_suggest_words);
        protoWriter.writeBytes(c69265RGj2.unknownFields());
    }
}
