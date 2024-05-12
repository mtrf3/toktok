package X;

import com.bytedance.im.core.proto.AckMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OyD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63633OyD extends ProtoAdapter<AckMessageRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ AckMessageRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63633OyD() {
        super(FieldEncoding.LENGTH_DELIMITED, AckMessageRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(AckMessageRequestBody ackMessageRequestBody) {
        AckMessageRequestBody ackMessageRequestBody2 = ackMessageRequestBody;
        return ackMessageRequestBody2.unknownFields().size() + EnumC63625Oy5.ADAPTER.encodedSizeWithTag(6, ackMessageRequestBody2.cmd) + EnumC63641OyL.ADAPTER.encodedSizeWithTag(5, ackMessageRequestBody2.push_type) + EnumC63179Oqt.ADAPTER.encodedSizeWithTag(4, ackMessageRequestBody2.msg_type) + EnumC63506OwA.ADAPTER.encodedSizeWithTag(3, ackMessageRequestBody2.conv_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, ackMessageRequestBody2.id) + ProtoAdapter.INT64.encodedSizeWithTag(1, ackMessageRequestBody2.start_timestamp);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, AckMessageRequestBody ackMessageRequestBody) {
        AckMessageRequestBody ackMessageRequestBody2 = ackMessageRequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, ackMessageRequestBody2.start_timestamp);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ackMessageRequestBody2.id);
        EnumC63506OwA.ADAPTER.encodeWithTag(protoWriter, 3, ackMessageRequestBody2.conv_type);
        EnumC63179Oqt.ADAPTER.encodeWithTag(protoWriter, 4, ackMessageRequestBody2.msg_type);
        EnumC63641OyL.ADAPTER.encodeWithTag(protoWriter, 5, ackMessageRequestBody2.push_type);
        EnumC63625Oy5.ADAPTER.encodeWithTag(protoWriter, 6, ackMessageRequestBody2.cmd);
        protoWriter.writeBytes(ackMessageRequestBody2.unknownFields());
    }
}
