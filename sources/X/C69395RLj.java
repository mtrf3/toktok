package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RLj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69395RLj extends ProtoAdapter<C69396RLk> {
    public C69395RLj() {
        super(FieldEncoding.LENGTH_DELIMITED, C69396RLk.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69396RLk decode(ProtoReader protoReader) {
        C69396RLk c69396RLk = new C69396RLk();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69396RLk.head_model_score = ProtoAdapter.DOUBLE.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69396RLk;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69396RLk c69396RLk) {
        C69396RLk c69396RLk2 = c69396RLk;
        return c69396RLk2.unknownFields().size() + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, c69396RLk2.head_model_score);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69396RLk c69396RLk) {
        C69396RLk c69396RLk2 = c69396RLk;
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, c69396RLk2.head_model_score);
        protoWriter.writeBytes(c69396RLk2.unknownFields());
    }
}
