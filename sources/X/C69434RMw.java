package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RMw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69434RMw extends ProtoAdapter<C69435RMx> {
    public C69434RMw() {
        super(FieldEncoding.LENGTH_DELIMITED, C69435RMx.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69435RMx decode(ProtoReader protoReader) {
        C69435RMx c69435RMx = new C69435RMx();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69435RMx.auth_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69435RMx.auth_status = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69435RMx;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69435RMx c69435RMx) {
        C69435RMx c69435RMx2 = c69435RMx;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c69435RMx2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c69435RMx2.auth_type) + protoAdapter.encodedSizeWithTag(1, c69435RMx2.auth_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69435RMx c69435RMx) {
        C69435RMx c69435RMx2 = c69435RMx;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69435RMx2.auth_status);
        protoAdapter.encodeWithTag(protoWriter, 2, c69435RMx2.auth_type);
        protoWriter.writeBytes(c69435RMx2.unknownFields());
    }
}
