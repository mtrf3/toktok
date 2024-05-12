package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RD3 extends ProtoAdapter<RDU> {
    public RD3() {
        super(FieldEncoding.LENGTH_DELIMITED, RDU.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RDU decode(ProtoReader protoReader) {
        RDU rdu = new RDU();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rdu.audio_is_listenable = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 2:
                        rdu.audio_is_podcast = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 3:
                        rdu.follow_display = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rdu.background_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rdu.audio_is_audible = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 6:
                        rdu.is_podcast_preview = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        rdu.podcast_episode_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        rdu.podcast_episode_authors.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 9:
                        rdu.podcast_episode_play_addr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        rdu.podcast_episode_cover_image = REV.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rdu.podcast_episode_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 12:
                        rdu.podcast_episode_is_branded_content = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rdu.podcast_episode_duration_milliseconds = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 14:
                        rdu.podcast_feed_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rdu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RDU rdu) {
        RDU rdu2 = rdu;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(3, rdu2.follow_display) + protoAdapter.encodedSizeWithTag(2, rdu2.audio_is_podcast) + protoAdapter.encodedSizeWithTag(1, rdu2.audio_is_listenable);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(6, rdu2.is_podcast_preview) + protoAdapter.encodedSizeWithTag(5, rdu2.audio_is_audible) + protoAdapter2.encodedSizeWithTag(4, rdu2.background_color) + encodedSizeWithTag;
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        int encodedSizeWithTag3 = protoAdapter2.asRepeated().encodedSizeWithTag(8, rdu2.podcast_episode_authors) + protoAdapter3.encodedSizeWithTag(7, rdu2.podcast_episode_id) + encodedSizeWithTag2;
        ProtoAdapter<REV> protoAdapter4 = REV.ADAPTER;
        return rdu2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(14, rdu2.podcast_feed_title) + protoAdapter3.encodedSizeWithTag(13, rdu2.podcast_episode_duration_milliseconds) + protoAdapter.encodedSizeWithTag(12, rdu2.podcast_episode_is_branded_content) + protoAdapter2.encodedSizeWithTag(11, rdu2.podcast_episode_title) + protoAdapter4.encodedSizeWithTag(10, rdu2.podcast_episode_cover_image) + protoAdapter4.encodedSizeWithTag(9, rdu2.podcast_episode_play_addr) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RDU rdu) {
        RDU rdu2 = rdu;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, rdu2.audio_is_listenable);
        protoAdapter.encodeWithTag(protoWriter, 2, rdu2.audio_is_podcast);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, rdu2.follow_display);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, rdu2.background_color);
        protoAdapter.encodeWithTag(protoWriter, 5, rdu2.audio_is_audible);
        protoAdapter.encodeWithTag(protoWriter, 6, rdu2.is_podcast_preview);
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 7, rdu2.podcast_episode_id);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 8, rdu2.podcast_episode_authors);
        ProtoAdapter<REV> protoAdapter4 = REV.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 9, rdu2.podcast_episode_play_addr);
        protoAdapter4.encodeWithTag(protoWriter, 10, rdu2.podcast_episode_cover_image);
        protoAdapter2.encodeWithTag(protoWriter, 11, rdu2.podcast_episode_title);
        protoAdapter.encodeWithTag(protoWriter, 12, rdu2.podcast_episode_is_branded_content);
        protoAdapter3.encodeWithTag(protoWriter, 13, rdu2.podcast_episode_duration_milliseconds);
        protoAdapter2.encodeWithTag(protoWriter, 14, rdu2.podcast_feed_title);
        protoWriter.writeBytes(rdu2.unknownFields());
    }
}
