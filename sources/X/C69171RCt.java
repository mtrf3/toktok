package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69171RCt extends ProtoAdapter<C69173RCv> {
    public C69171RCt() {
        super(FieldEncoding.LENGTH_DELIMITED, C69173RCv.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69173RCv decode(ProtoReader protoReader) {
        C69173RCv c69173RCv = new C69173RCv();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69173RCv.id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c69173RCv.id_str = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69173RCv.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69173RCv.author = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69173RCv.album = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69173RCv.strong_beat_url = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69173RCv.is_author_artist = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 8:
                        c69173RCv.unshelve_countries.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 9:
                        c69173RCv.cover_thumb = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        c69173RCv.play_url = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69173RCv.start_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 12:
                        c69173RCv.end_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69173RCv.duration = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 14:
                        c69173RCv.owner_handle = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 15:
                        c69173RCv.status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69173RCv.offline_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 17:
                        c69173RCv.owner_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 18:
                        c69173RCv.owner_nickname = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 19:
                        c69173RCv.audio_track = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        c69173RCv.is_original = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 21:
                        c69173RCv.mid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 22:
                        c69173RCv.author_deleted = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 23:
                        c69173RCv.is_del_video = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 24:
                        c69173RCv.is_video_self_see = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69173RCv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69173RCv c69173RCv) {
        C69173RCv c69173RCv2 = c69173RCv;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c69173RCv2.id);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, c69173RCv2.album) + protoAdapter.encodedSizeWithTag(4, c69173RCv2.author) + protoAdapter.encodedSizeWithTag(3, c69173RCv2.title) + protoAdapter.encodedSizeWithTag(2, c69173RCv2.id_str) + encodedSizeWithTag;
        ProtoAdapter<C69214REk> protoAdapter2 = C69214REk.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(6, c69173RCv2.strong_beat_url) + encodedSizeWithTag2;
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(10, c69173RCv2.play_url) + protoAdapter2.encodedSizeWithTag(9, c69173RCv2.cover_thumb) + protoAdapter.asRepeated().encodedSizeWithTag(8, c69173RCv2.unshelve_countries) + protoAdapter3.encodedSizeWithTag(7, c69173RCv2.is_author_artist) + encodedSizeWithTag3;
        ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
        return c69173RCv2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(24, c69173RCv2.is_video_self_see) + protoAdapter3.encodedSizeWithTag(23, c69173RCv2.is_del_video) + protoAdapter3.encodedSizeWithTag(22, c69173RCv2.author_deleted) + protoAdapter.encodedSizeWithTag(21, c69173RCv2.mid) + protoAdapter3.encodedSizeWithTag(20, c69173RCv2.is_original) + protoAdapter2.encodedSizeWithTag(19, c69173RCv2.audio_track) + protoAdapter.encodedSizeWithTag(18, c69173RCv2.owner_nickname) + protoAdapter.encodedSizeWithTag(17, c69173RCv2.owner_id) + protoAdapter.encodedSizeWithTag(16, c69173RCv2.offline_desc) + protoAdapter4.encodedSizeWithTag(15, c69173RCv2.status) + protoAdapter.encodedSizeWithTag(14, c69173RCv2.owner_handle) + protoAdapter4.encodedSizeWithTag(13, c69173RCv2.duration) + protoAdapter4.encodedSizeWithTag(12, c69173RCv2.end_time) + protoAdapter4.encodedSizeWithTag(11, c69173RCv2.start_time) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69173RCv c69173RCv) {
    }
}
