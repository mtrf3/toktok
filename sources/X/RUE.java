package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RUE extends ProtoAdapter<RUF> {
    public RUE() {
        super(FieldEncoding.LENGTH_DELIMITED, RUF.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RUF decode(ProtoReader protoReader) {
        RUG rug = new RUG();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rug.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rug.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rug.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RUF ruf) {
        RUF ruf2 = ruf;
        return ruf2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, ruf2.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RUF redact(RUF ruf) {
        Message.Builder<RUF, RUG> newBuilder2 = ruf.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RUF ruf) {
        RUF ruf2 = ruf;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ruf2.text);
        protoWriter.writeBytes(ruf2.unknownFields());
    }
}
