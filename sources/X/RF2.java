package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RF2 extends ProtoAdapter<C69256RGa> {
    public RF2() {
        super(FieldEncoding.LENGTH_DELIMITED, C69256RGa.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69256RGa decode(ProtoReader protoReader) {
        C69256RGa c69256RGa = new C69256RGa();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69256RGa.text_extra.add(C69204REa.ADAPTER.decode(protoReader));
                    }
                } else {
                    c69256RGa.markup_text = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69256RGa;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69256RGa c69256RGa) {
        C69256RGa c69256RGa2 = c69256RGa;
        return c69256RGa2.unknownFields().size() + C69204REa.ADAPTER.asRepeated().encodedSizeWithTag(2, c69256RGa2.text_extra) + ProtoAdapter.STRING.encodedSizeWithTag(1, c69256RGa2.markup_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69256RGa c69256RGa) {
        C69256RGa c69256RGa2 = c69256RGa;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c69256RGa2.markup_text);
        C69204REa.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c69256RGa2.text_extra);
        protoWriter.writeBytes(c69256RGa2.unknownFields());
    }
}
