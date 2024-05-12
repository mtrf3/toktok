package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RNu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69458RNu extends ProtoAdapter<C69459RNv> {
    public C69458RNu() {
        super(FieldEncoding.LENGTH_DELIMITED, C69459RNv.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69459RNv decode(ProtoReader protoReader) {
        C69459RNv c69459RNv = new C69459RNv();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69459RNv.user_now_status = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69459RNv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69459RNv c69459RNv) {
        C69459RNv c69459RNv2 = c69459RNv;
        return c69459RNv2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(1, c69459RNv2.user_now_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69459RNv c69459RNv) {
        C69459RNv c69459RNv2 = c69459RNv;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69459RNv2.user_now_status);
        protoWriter.writeBytes(c69459RNv2.unknownFields());
    }
}
