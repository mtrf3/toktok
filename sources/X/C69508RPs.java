package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RPs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69508RPs extends ProtoAdapter<C69509RPt> {
    public C69508RPs() {
        super(FieldEncoding.LENGTH_DELIMITED, C69509RPt.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69509RPt decode(ProtoReader protoReader) {
        C69509RPt c69509RPt = new C69509RPt();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69509RPt.max_lines = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69509RPt.texts.add(C69512RPw.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69509RPt;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69509RPt c69509RPt) {
        C69509RPt c69509RPt2 = c69509RPt;
        return c69509RPt2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, c69509RPt2.max_lines) + C69512RPw.ADAPTER.asRepeated().encodedSizeWithTag(1, c69509RPt2.texts);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69509RPt c69509RPt) {
        C69509RPt c69509RPt2 = c69509RPt;
        C69512RPw.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c69509RPt2.texts);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c69509RPt2.max_lines);
        protoWriter.writeBytes(c69509RPt2.unknownFields());
    }
}
