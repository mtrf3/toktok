package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RPm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69502RPm extends ProtoAdapter<C69503RPn> {
    public C69502RPm() {
        super(FieldEncoding.LENGTH_DELIMITED, C69503RPn.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69503RPn decode(ProtoReader protoReader) {
        C69503RPn c69503RPn = new C69503RPn();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69503RPn.actions.add(C69500RPk.ADAPTER.decode(protoReader));
                    }
                } else {
                    c69503RPn.type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69503RPn;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69503RPn c69503RPn) {
        C69503RPn c69503RPn2 = c69503RPn;
        return c69503RPn2.unknownFields().size() + C69500RPk.ADAPTER.asRepeated().encodedSizeWithTag(2, c69503RPn2.actions) + ProtoAdapter.INT32.encodedSizeWithTag(1, c69503RPn2.type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69503RPn c69503RPn) {
        C69503RPn c69503RPn2 = c69503RPn;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69503RPn2.type);
        C69500RPk.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c69503RPn2.actions);
        protoWriter.writeBytes(c69503RPn2.unknownFields());
    }
}
