package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RMn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69425RMn extends ProtoAdapter<C69426RMo> {
    public C69425RMn() {
        super(FieldEncoding.LENGTH_DELIMITED, C69426RMo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69426RMo decode(ProtoReader protoReader) {
        C69426RMo c69426RMo = new C69426RMo();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69426RMo.is_collected = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69426RMo.status = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69426RMo;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69426RMo c69426RMo) {
        C69426RMo c69426RMo2 = c69426RMo;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c69426RMo2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69426RMo2.is_collected) + protoAdapter.encodedSizeWithTag(1, c69426RMo2.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69426RMo c69426RMo) {
        C69426RMo c69426RMo2 = c69426RMo;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69426RMo2.status);
        protoAdapter.encodeWithTag(protoWriter, 2, c69426RMo2.is_collected);
        protoWriter.writeBytes(c69426RMo2.unknownFields());
    }
}
