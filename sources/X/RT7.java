package X;

import com.bytedance.im.core.proto.ConvCountReport;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RT7 extends ProtoAdapter<ConvCountReport> {
    public RT7() {
        super(FieldEncoding.LENGTH_DELIMITED, ConvCountReport.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConvCountReport decode(ProtoReader protoReader) {
        RT8 rt8 = new RT8();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                rt8.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                rt8.LJI = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            try {
                                rt8.LJFF = EnumC63506OwA.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                rt8.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        rt8.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rt8.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rt8.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConvCountReport convCountReport) {
        ConvCountReport convCountReport2 = convCountReport;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return convCountReport2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(4, convCountReport2.customed_conversation_type) + EnumC63506OwA.ADAPTER.encodedSizeWithTag(3, convCountReport2.conversation_type) + protoAdapter.encodedSizeWithTag(2, convCountReport2.unread_count) + protoAdapter.encodedSizeWithTag(1, convCountReport2.conv_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConvCountReport convCountReport) {
        ConvCountReport convCountReport2 = convCountReport;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, convCountReport2.conv_short_id);
        protoAdapter.encodeWithTag(protoWriter, 2, convCountReport2.unread_count);
        EnumC63506OwA.ADAPTER.encodeWithTag(protoWriter, 3, convCountReport2.conversation_type);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, convCountReport2.customed_conversation_type);
        protoWriter.writeBytes(convCountReport2.unknownFields());
    }
}
