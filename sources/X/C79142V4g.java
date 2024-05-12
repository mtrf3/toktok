package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.V4g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79142V4g extends ProtoAdapter<C79141V4f> {
    public C79142V4g() {
        super(FieldEncoding.LENGTH_DELIMITED, C79141V4f.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79141V4f decode(ProtoReader protoReader) {
        C79151V4p c79151V4p = new C79151V4p();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 4) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c79151V4p.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c79151V4p.LJFF = C63714OzW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c79151V4p.LJ = RU5.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79151V4p.LIZLLL = RUF.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79151V4p.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79141V4f c79141V4f) {
        C79141V4f c79141V4f2 = c79141V4f;
        return c79141V4f2.unknownFields().size() + C63714OzW.ADAPTER.encodedSizeWithTag(4, c79141V4f2.link_info) + RU5.ADAPTER.encodedSizeWithTag(2, c79141V4f2.style) + RUF.ADAPTER.encodedSizeWithTag(1, c79141V4f2.text);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V4p, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79141V4f redact(C79141V4f c79141V4f) {
        ?? newBuilder2 = c79141V4f.newBuilder2();
        RUF ruf = newBuilder2.LIZLLL;
        if (ruf != null) {
            newBuilder2.LIZLLL = RUF.ADAPTER.redact(ruf);
        }
        RU5 ru5 = newBuilder2.LJ;
        if (ru5 != null) {
            newBuilder2.LJ = RU5.ADAPTER.redact(ru5);
        }
        C63714OzW c63714OzW = newBuilder2.LJFF;
        if (c63714OzW != null) {
            newBuilder2.LJFF = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C79141V4f c79141V4f) {
        C79141V4f c79141V4f2 = c79141V4f;
        RUF.ADAPTER.encodeWithTag(protoWriter, 1, c79141V4f2.text);
        RU5.ADAPTER.encodeWithTag(protoWriter, 2, c79141V4f2.style);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 4, c79141V4f2.link_info);
        protoWriter.writeBytes(c79141V4f2.unknownFields());
    }
}
