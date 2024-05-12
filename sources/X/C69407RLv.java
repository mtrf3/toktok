package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RLv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69407RLv extends ProtoAdapter<C69408RLw> {
    public C69407RLv() {
        super(FieldEncoding.LENGTH_DELIMITED, C69408RLw.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69408RLw decode(ProtoReader protoReader) {
        C69408RLw c69408RLw = new C69408RLw();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69408RLw.horizontal = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                } else {
                    c69408RLw.vertical.add(ProtoAdapter.FLOAT.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69408RLw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69408RLw c69408RLw) {
        C69408RLw c69408RLw2 = c69408RLw;
        ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
        return c69408RLw2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69408RLw2.horizontal) + protoAdapter.asRepeated().encodedSizeWithTag(1, c69408RLw2.vertical);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69408RLw c69408RLw) {
        C69408RLw c69408RLw2 = c69408RLw;
        ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c69408RLw2.vertical);
        protoAdapter.encodeWithTag(protoWriter, 2, c69408RLw2.horizontal);
        protoWriter.writeBytes(c69408RLw2.unknownFields());
    }
}
