package X;

import com.bytedance.im.core.proto.MsgTrace;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RTB extends ProtoAdapter<MsgTrace> {
    public final ProtoAdapter<java.util.Map<Integer, Long>> LJ;

    public RTB() {
        super(FieldEncoding.LENGTH_DELIMITED, MsgTrace.class);
        this.LJ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.INT64);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MsgTrace decode(ProtoReader protoReader) {
        RTC rtc = new RTC();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        rtc.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            rtc.LJ = EnumC69901Rc1.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            rtc.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    rtc.LIZLLL.putAll(this.LJ.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rtc.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MsgTrace msgTrace) {
        MsgTrace msgTrace2 = msgTrace;
        return msgTrace2.unknownFields().size() + EnumC69901Rc1.ADAPTER.encodedSizeWithTag(2, msgTrace2.path) + this.LJ.encodedSizeWithTag(1, msgTrace2.metrics);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MsgTrace msgTrace) {
        MsgTrace msgTrace2 = msgTrace;
        this.LJ.encodeWithTag(protoWriter, 1, msgTrace2.metrics);
        EnumC69901Rc1.ADAPTER.encodeWithTag(protoWriter, 2, msgTrace2.path);
        protoWriter.writeBytes(msgTrace2.unknownFields());
    }
}
