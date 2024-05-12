package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RKo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69374RKo extends ProtoAdapter<C69375RKp> {
    public C69374RKo() {
        super(FieldEncoding.LENGTH_DELIMITED, C69375RKp.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69375RKp decode(ProtoReader protoReader) {
        C69375RKp c69375RKp = new C69375RKp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69375RKp.card_material = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c69375RKp.card_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c69375RKp.card_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69375RKp;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69375RKp c69375RKp) {
        C69375RKp c69375RKp2 = c69375RKp;
        return c69375RKp2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(3, c69375RKp2.card_material) + ProtoAdapter.INT64.encodedSizeWithTag(2, c69375RKp2.card_id) + ProtoAdapter.INT32.encodedSizeWithTag(1, c69375RKp2.card_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69375RKp c69375RKp) {
        C69375RKp c69375RKp2 = c69375RKp;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69375RKp2.card_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c69375RKp2.card_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c69375RKp2.card_material);
        protoWriter.writeBytes(c69375RKp2.unknownFields());
    }
}
