package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.V4l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79147V4l extends ProtoAdapter<C79143V4h> {
    public C79147V4l() {
        super(FieldEncoding.LENGTH_DELIMITED, C79143V4h.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79143V4h decode(ProtoReader protoReader) {
        V35 v35 = new V35();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        v35.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        v35.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    v35.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v35.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79143V4h c79143V4h) {
        C79143V4h c79143V4h2 = c79143V4h;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c79143V4h2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c79143V4h2.height) + protoAdapter.encodedSizeWithTag(1, c79143V4h2.width);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79143V4h redact(C79143V4h c79143V4h) {
        Message.Builder<C79143V4h, V35> newBuilder2 = c79143V4h.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C79143V4h c79143V4h) {
        C79143V4h c79143V4h2 = c79143V4h;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c79143V4h2.width);
        protoAdapter.encodeWithTag(protoWriter, 2, c79143V4h2.height);
        protoWriter.writeBytes(c79143V4h2.unknownFields());
    }
}
