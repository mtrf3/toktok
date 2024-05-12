package X;

import com.bytedance.im.core.proto.SendInputStatusResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RTD extends ProtoAdapter<SendInputStatusResponseBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public RTD() {
        super(FieldEncoding.LENGTH_DELIMITED, SendInputStatusResponseBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final SendInputStatusResponseBody decode(ProtoReader protoReader) {
        RTE rte = new RTE();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        rte.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        rte.LJ.putAll(this.LJ.decode(protoReader));
                    }
                } else {
                    try {
                        rte.LIZLLL = EnumC69908Rc8.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        rte.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rte.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SendInputStatusResponseBody sendInputStatusResponseBody) {
        SendInputStatusResponseBody sendInputStatusResponseBody2 = sendInputStatusResponseBody;
        return sendInputStatusResponseBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(2, sendInputStatusResponseBody2.extra) + EnumC69908Rc8.ADAPTER.encodedSizeWithTag(1, sendInputStatusResponseBody2.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, SendInputStatusResponseBody sendInputStatusResponseBody) {
    }
}
