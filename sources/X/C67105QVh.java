package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.QVh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67105QVh extends ProtoAdapter<C67101QVd> {
    public C67105QVh() {
        super(FieldEncoding.LENGTH_DELIMITED, C67101QVd.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C67101QVd decode(ProtoReader protoReader) {
        C67111QVn c67111QVn = new C67111QVn();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c67111QVn.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c67111QVn.LJ.add(QVZ.ADAPTER.decode(protoReader));
                    }
                } else {
                    c67111QVn.LIZLLL = C67098QVa.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c67111QVn.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C67101QVd c67101QVd) {
        C67101QVd c67101QVd2 = c67101QVd;
        return c67101QVd2.unknownFields().size() + QVZ.ADAPTER.asRepeated().encodedSizeWithTag(2, c67101QVd2.topics) + C67098QVa.ADAPTER.encodedSizeWithTag(1, c67101QVd2.header);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.QVn] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C67101QVd redact(C67101QVd c67101QVd) {
        ?? newBuilder2 = c67101QVd.newBuilder2();
        newBuilder2.LIZLLL = C67098QVa.ADAPTER.redact(newBuilder2.LIZLLL);
        C63685Oz3.LJIIIZ(newBuilder2.LJ, QVZ.ADAPTER);
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C67101QVd c67101QVd) {
        C67101QVd c67101QVd2 = c67101QVd;
        C67098QVa.ADAPTER.encodeWithTag(protoWriter, 1, c67101QVd2.header);
        QVZ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c67101QVd2.topics);
        protoWriter.writeBytes(c67101QVd2.unknownFields());
    }
}
