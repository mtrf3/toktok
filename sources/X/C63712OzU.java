package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OzU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63712OzU extends ProtoAdapter<C63714OzW> {
    public C63712OzU() {
        super(FieldEncoding.LENGTH_DELIMITED, C63714OzW.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C63714OzW decode(ProtoReader protoReader) {
        C63713OzV c63713OzV = new C63713OzV();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c63713OzV.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c63713OzV.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c63713OzV.LJ = EnumC62835OlL.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c63713OzV.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    c63713OzV.LIZLLL.add(ProtoAdapter.STRING.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63713OzV.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C63714OzW c63714OzW) {
        C63714OzW c63714OzW2 = c63714OzW;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c63714OzW2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, c63714OzW2.name) + EnumC62835OlL.ADAPTER.encodedSizeWithTag(2, c63714OzW2.action_type) + protoAdapter.asRepeated().encodedSizeWithTag(1, c63714OzW2.url_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C63714OzW redact(C63714OzW c63714OzW) {
        Message.Builder<C63714OzW, C63713OzV> newBuilder2 = c63714OzW.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C63714OzW c63714OzW) {
        C63714OzW c63714OzW2 = c63714OzW;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c63714OzW2.url_list);
        EnumC62835OlL.ADAPTER.encodeWithTag(protoWriter, 2, c63714OzW2.action_type);
        protoAdapter.encodeWithTag(protoWriter, 3, c63714OzW2.name);
        protoWriter.writeBytes(c63714OzW2.unknownFields());
    }
}
