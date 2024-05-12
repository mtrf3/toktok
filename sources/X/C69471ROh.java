package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.ROh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69471ROh extends ProtoAdapter<C69472ROi> {
    public C69471ROh() {
        super(FieldEncoding.LENGTH_DELIMITED, C69472ROi.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69472ROi decode(ProtoReader protoReader) {
        C69472ROi c69472ROi = new C69472ROi();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69472ROi.effect = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69472ROi.type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69472ROi;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69472ROi c69472ROi) {
        C69472ROi c69472ROi2 = c69472ROi;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c69472ROi2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69472ROi2.effect) + protoAdapter.encodedSizeWithTag(1, c69472ROi2.type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69472ROi c69472ROi) {
        C69472ROi c69472ROi2 = c69472ROi;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69472ROi2.type);
        protoAdapter.encodeWithTag(protoWriter, 2, c69472ROi2.effect);
        protoWriter.writeBytes(c69472ROi2.unknownFields());
    }
}
