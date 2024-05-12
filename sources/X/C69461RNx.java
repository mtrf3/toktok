package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RNx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69461RNx extends ProtoAdapter<C69462RNy> {
    public C69461RNx() {
        super(FieldEncoding.LENGTH_DELIMITED, C69462RNy.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69462RNy decode(ProtoReader protoReader) {
        C69462RNy c69462RNy = new C69462RNy();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69462RNy.total = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69462RNy;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69462RNy c69462RNy) {
        C69462RNy c69462RNy2 = c69462RNy;
        return c69462RNy2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(1, c69462RNy2.total);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69462RNy c69462RNy) {
        C69462RNy c69462RNy2 = c69462RNy;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69462RNy2.total);
        protoWriter.writeBytes(c69462RNy2.unknownFields());
    }
}
