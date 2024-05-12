package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RMb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69413RMb extends ProtoAdapter<C69414RMc> {
    public C69413RMb() {
        super(FieldEncoding.LENGTH_DELIMITED, C69414RMc.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69414RMc decode(ProtoReader protoReader) {
        C69414RMc c69414RMc = new C69414RMc();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 2) {
                    if (nextTag != 3) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69414RMc.original_item_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69414RMc.original_item_duetted_count = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69414RMc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69414RMc c69414RMc) {
        C69414RMc c69414RMc2 = c69414RMc;
        return c69414RMc2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(3, c69414RMc2.original_item_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c69414RMc2.original_item_duetted_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69414RMc c69414RMc) {
        C69414RMc c69414RMc2 = c69414RMc;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c69414RMc2.original_item_duetted_count);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c69414RMc2.original_item_id);
        protoWriter.writeBytes(c69414RMc2.unknownFields());
    }
}
