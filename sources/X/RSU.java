package X;

import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSU extends ProtoAdapter<ParticipantReadIndex> {
    public RSU() {
        super(FieldEncoding.LENGTH_DELIMITED, ParticipantReadIndex.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ParticipantReadIndex decode(ProtoReader protoReader) {
        RSV rsv = new RSV();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    rsv.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    rsv.LJII = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                rsv.LJI = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            rsv.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rsv.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rsv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rsv.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ParticipantReadIndex participantReadIndex) {
        ParticipantReadIndex participantReadIndex2 = participantReadIndex;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return participantReadIndex2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, participantReadIndex2.index_min) + protoAdapter.encodedSizeWithTag(4, participantReadIndex2.index_v2) + protoAdapter.encodedSizeWithTag(3, participantReadIndex2.index) + ProtoAdapter.STRING.encodedSizeWithTag(2, participantReadIndex2.sec_uid) + protoAdapter.encodedSizeWithTag(1, participantReadIndex2.user_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ParticipantReadIndex participantReadIndex) {
        ParticipantReadIndex participantReadIndex2 = participantReadIndex;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, participantReadIndex2.user_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, participantReadIndex2.sec_uid);
        protoAdapter.encodeWithTag(protoWriter, 3, participantReadIndex2.index);
        protoAdapter.encodeWithTag(protoWriter, 4, participantReadIndex2.index_v2);
        protoAdapter.encodeWithTag(protoWriter, 5, participantReadIndex2.index_min);
        protoWriter.writeBytes(participantReadIndex2.unknownFields());
    }
}
