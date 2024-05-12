package X;

import com.bytedance.im.core.proto.MuteBadgeCountInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RTF extends ProtoAdapter<MuteBadgeCountInfo> {
    public RTF() {
        super(FieldEncoding.LENGTH_DELIMITED, MuteBadgeCountInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MuteBadgeCountInfo decode(ProtoReader protoReader) {
        RTG rtg = new RTG();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        rtg.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        rtg.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    try {
                        rtg.LIZLLL = EnumC69903Rc3.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        rtg.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rtg.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MuteBadgeCountInfo muteBadgeCountInfo) {
        MuteBadgeCountInfo muteBadgeCountInfo2 = muteBadgeCountInfo;
        return muteBadgeCountInfo2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, muteBadgeCountInfo2.badge_count) + EnumC69903Rc3.ADAPTER.encodedSizeWithTag(1, muteBadgeCountInfo2.message_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MuteBadgeCountInfo muteBadgeCountInfo) {
        MuteBadgeCountInfo muteBadgeCountInfo2 = muteBadgeCountInfo;
        EnumC69903Rc3.ADAPTER.encodeWithTag(protoWriter, 1, muteBadgeCountInfo2.message_type);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, muteBadgeCountInfo2.badge_count);
        protoWriter.writeBytes(muteBadgeCountInfo2.unknownFields());
    }
}
