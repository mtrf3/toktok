package X;

import com.bytedance.scalpel.protos.BigJankMsg;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYu, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87580YYu extends ProtoAdapter<BigJankMsg> {
    public C87580YYu() {
        super(FieldEncoding.LENGTH_DELIMITED, BigJankMsg.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BigJankMsg decode(ProtoReader protoReader) {
        return new C87581YYv().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BigJankMsg bigJankMsg) {
        BigJankMsg bigJankMsg2 = bigJankMsg;
        return bigJankMsg2.unknownFields().size() + BigJankMsg.MessageDispatch.ADAPTER.asRepeated().encodedSizeWithTag(2, bigJankMsg2.bigJankMsg) + ProtoAdapter.STRING.encodedSizeWithTag(1, bigJankMsg2.methodMapping);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BigJankMsg bigJankMsg) {
        BigJankMsg bigJankMsg2 = bigJankMsg;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bigJankMsg2.methodMapping);
        BigJankMsg.MessageDispatch.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, bigJankMsg2.bigJankMsg);
        protoWriter.writeBytes(bigJankMsg2.unknownFields());
    }
}
