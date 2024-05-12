package X;

import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0V extends ProtoAdapter<ParticipantsPage> {
    public P0V() {
        super(FieldEncoding.LENGTH_DELIMITED, ParticipantsPage.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ParticipantsPage decode(ProtoReader protoReader) {
        P0W p0w = new P0W();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            p0w.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            p0w.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        p0w.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    p0w.LIZLLL.add(Participant.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0w.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ParticipantsPage participantsPage) {
        ParticipantsPage participantsPage2 = participantsPage;
        return participantsPage2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(3, participantsPage2.cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(2, participantsPage2.has_more) + Participant.ADAPTER.asRepeated().encodedSizeWithTag(1, participantsPage2.participants);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ParticipantsPage participantsPage) {
        ParticipantsPage participantsPage2 = participantsPage;
        Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, participantsPage2.participants);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, participantsPage2.has_more);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, participantsPage2.cursor);
        protoWriter.writeBytes(participantsPage2.unknownFields());
    }
}
