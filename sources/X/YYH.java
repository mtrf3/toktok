package X;

import com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYH extends ProtoAdapter<BatchUnmarkMessageResponseBody> {
    public YYH() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchUnmarkMessageResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BatchUnmarkMessageResponseBody decode(ProtoReader protoReader) {
        YYI yyi = new YYI();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                yyi.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    yyi.LJI = EnumC63552Owu.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    yyi.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            yyi.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        yyi.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    yyi.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yyi.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody) {
        BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody2 = batchUnmarkMessageResponseBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return batchUnmarkMessageResponseBody2.unknownFields().size() + EnumC63552Owu.ADAPTER.encodedSizeWithTag(4, batchUnmarkMessageResponseBody2.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, batchUnmarkMessageResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(2, batchUnmarkMessageResponseBody2.check_code) + protoAdapter.encodedSizeWithTag(1, batchUnmarkMessageResponseBody2.server_message_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody) {
    }
}
