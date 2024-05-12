package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.QDl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66641QDl extends ProtoAdapter<C66640QDk> {
    public C66641QDl() {
        super(FieldEncoding.LENGTH_DELIMITED, C66640QDk.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C66640QDk decode(ProtoReader protoReader) {
        C66642QDm c66642QDm = new C66642QDm();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c66642QDm.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c66642QDm.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c66642QDm.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c66642QDm.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C66640QDk c66640QDk) {
        C66640QDk c66640QDk2 = c66640QDk;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c66640QDk2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, c66640QDk2.value) + protoAdapter.encodedSizeWithTag(1, c66640QDk2.key);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.QDm, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C66640QDk redact(C66640QDk c66640QDk) {
        ?? newBuilder2 = c66640QDk.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C66640QDk c66640QDk) {
        C66640QDk c66640QDk2 = c66640QDk;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c66640QDk2.key);
        protoAdapter.encodeWithTag(protoWriter, 2, c66640QDk2.value);
        protoWriter.writeBytes(c66640QDk2.unknownFields());
    }
}
