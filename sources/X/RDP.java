package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDP extends ProtoAdapter<REW> {
    public RDP() {
        super(FieldEncoding.LENGTH_DELIMITED, REW.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final REW decode(ProtoReader protoReader) {
        REW rew = new REW();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rew.topic_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        rew.from_item_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rew.text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rew.user_avatars.add(RHA.ADAPTER.decode(protoReader));
                        break;
                    case 5:
                        rew.videos_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        rew.from_question = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        rew.add_yours_invitees.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 8:
                        rew.viewer_is_invited = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 9:
                        rew.shark_status = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rew;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(REW rew) {
        REW rew2 = rew;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, rew2.videos_count) + RHA.ADAPTER.asRepeated().encodedSizeWithTag(4, rew2.user_avatars) + ProtoAdapter.STRING.encodedSizeWithTag(3, rew2.text) + protoAdapter.encodedSizeWithTag(2, rew2.from_item_id) + protoAdapter.encodedSizeWithTag(1, rew2.topic_id);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return rew2.unknownFields().size() + protoAdapter.encodedSizeWithTag(9, rew2.shark_status) + protoAdapter2.encodedSizeWithTag(8, rew2.viewer_is_invited) + protoAdapter.asRepeated().encodedSizeWithTag(7, rew2.add_yours_invitees) + protoAdapter2.encodedSizeWithTag(6, rew2.from_question) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, REW rew) {
        REW rew2 = rew;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, rew2.topic_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rew2.from_item_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rew2.text);
        RHA.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, rew2.user_avatars);
        protoAdapter.encodeWithTag(protoWriter, 5, rew2.videos_count);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 6, rew2.from_question);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, rew2.add_yours_invitees);
        protoAdapter2.encodeWithTag(protoWriter, 8, rew2.viewer_is_invited);
        protoAdapter.encodeWithTag(protoWriter, 9, rew2.shark_status);
        protoWriter.writeBytes(rew2.unknownFields());
    }
}
