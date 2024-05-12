package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Q8g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66506Q8g extends ProtoAdapter<C66507Q8h> {
    public C66506Q8g() {
        super(FieldEncoding.LENGTH_DELIMITED, C66507Q8h.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C66507Q8h decode(ProtoReader protoReader) {
        Q3O q3o = new Q3O();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        q3o.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        q3o.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    q3o.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return q3o.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C66507Q8h c66507Q8h) {
        C66507Q8h c66507Q8h2 = c66507Q8h;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c66507Q8h2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c66507Q8h2.value) + protoAdapter.encodedSizeWithTag(1, c66507Q8h2.key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C66507Q8h redact(C66507Q8h c66507Q8h) {
        Message.Builder<C66507Q8h, Q3O> newBuilder2 = c66507Q8h.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C66507Q8h c66507Q8h) {
        C66507Q8h c66507Q8h2 = c66507Q8h;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c66507Q8h2.key);
        protoAdapter.encodeWithTag(protoWriter, 2, c66507Q8h2.value);
        protoWriter.writeBytes(c66507Q8h2.unknownFields());
    }
}
