package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RKh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69367RKh extends ProtoAdapter<C69368RKi> {
    public C69367RKh() {
        super(FieldEncoding.LENGTH_DELIMITED, C69368RKi.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69368RKi decode(ProtoReader protoReader) {
        C69368RKi c69368RKi = new C69368RKi();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69368RKi.pop_content.add(C69366RKg.ADAPTER.decode(protoReader));
                    }
                } else {
                    c69368RKi.pop_title = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69368RKi;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69368RKi c69368RKi) {
        C69368RKi c69368RKi2 = c69368RKi;
        return c69368RKi2.unknownFields().size() + C69366RKg.ADAPTER.asRepeated().encodedSizeWithTag(2, c69368RKi2.pop_content) + ProtoAdapter.STRING.encodedSizeWithTag(1, c69368RKi2.pop_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69368RKi c69368RKi) {
        C69368RKi c69368RKi2 = c69368RKi;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c69368RKi2.pop_title);
        C69366RKg.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c69368RKi2.pop_content);
        protoWriter.writeBytes(c69368RKi2.unknownFields());
    }
}
