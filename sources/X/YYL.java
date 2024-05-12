package X;

import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYL extends ProtoAdapter<TimeStampRange> {
    public YYL() {
        super(FieldEncoding.LENGTH_DELIMITED, TimeStampRange.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final TimeStampRange decode(ProtoReader protoReader) {
        return new YYM().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(TimeStampRange timeStampRange) {
        TimeStampRange timeStampRange2 = timeStampRange;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return timeStampRange2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, timeStampRange2.endTimestamp) + protoAdapter.encodedSizeWithTag(1, timeStampRange2.startTimestamp);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, TimeStampRange timeStampRange) {
        TimeStampRange timeStampRange2 = timeStampRange;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, timeStampRange2.startTimestamp);
        protoAdapter.encodeWithTag(protoWriter, 2, timeStampRange2.endTimestamp);
        protoWriter.writeBytes(timeStampRange2.unknownFields());
    }
}
