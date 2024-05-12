package X;

import com.bytedance.im.core.proto.MarkMessageResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYJ extends ProtoAdapter<MarkMessageResponseBody> {
    public YYJ() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkMessageResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MarkMessageResponseBody decode(ProtoReader protoReader) {
        YYK yyk = new YYK();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                yyk.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    yyk.LJI = EnumC63552Owu.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    yyk.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            yyk.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        yyk.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    yyk.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yyk.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkMessageResponseBody markMessageResponseBody) {
        MarkMessageResponseBody markMessageResponseBody2 = markMessageResponseBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return markMessageResponseBody2.unknownFields().size() + EnumC63552Owu.ADAPTER.encodedSizeWithTag(4, markMessageResponseBody2.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, markMessageResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(2, markMessageResponseBody2.check_code) + protoAdapter.encodedSizeWithTag(1, markMessageResponseBody2.server_message_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MarkMessageResponseBody markMessageResponseBody) {
    }
}
