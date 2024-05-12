package X;

import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSS extends ProtoAdapter<ParticipantMinIndex> {
    public RSS() {
        super(FieldEncoding.LENGTH_DELIMITED, ParticipantMinIndex.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ParticipantMinIndex decode(ProtoReader protoReader) {
        RST rst = new RST();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                rst.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                rst.LJI = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            rst.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rst.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rst.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rst.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ParticipantMinIndex participantMinIndex) {
        ParticipantMinIndex participantMinIndex2 = participantMinIndex;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return participantMinIndex2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, participantMinIndex2.index_v2) + protoAdapter.encodedSizeWithTag(3, participantMinIndex2.index) + ProtoAdapter.STRING.encodedSizeWithTag(2, participantMinIndex2.sec_uid) + protoAdapter.encodedSizeWithTag(1, participantMinIndex2.user_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ParticipantMinIndex participantMinIndex) {
        ParticipantMinIndex participantMinIndex2 = participantMinIndex;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, participantMinIndex2.user_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, participantMinIndex2.sec_uid);
        protoAdapter.encodeWithTag(protoWriter, 3, participantMinIndex2.index);
        protoAdapter.encodeWithTag(protoWriter, 4, participantMinIndex2.index_v2);
        protoWriter.writeBytes(participantMinIndex2.unknownFields());
    }
}
