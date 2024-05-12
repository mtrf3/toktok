package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RFu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69250RFu extends ProtoAdapter<C69264RGi> {
    public C69250RFu() {
        super(FieldEncoding.LENGTH_DELIMITED, C69264RGi.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69264RGi decode(ProtoReader protoReader) {
        C69264RGi c69264RGi = new C69264RGi();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69264RGi.suggest_words.add(C69249RFt.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69264RGi;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69264RGi c69264RGi) {
        C69264RGi c69264RGi2 = c69264RGi;
        return c69264RGi2.unknownFields().size() + C69249RFt.ADAPTER.asRepeated().encodedSizeWithTag(1, c69264RGi2.suggest_words);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69264RGi c69264RGi) {
        C69264RGi c69264RGi2 = c69264RGi;
        C69249RFt.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c69264RGi2.suggest_words);
        protoWriter.writeBytes(c69264RGi2.unknownFields());
    }
}
