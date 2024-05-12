package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDK extends ProtoAdapter<RE3> {
    public RDK() {
        super(FieldEncoding.LENGTH_DELIMITED, RE3.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RE3 decode(ProtoReader protoReader) {
        RE3 re3 = new RE3();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        re3.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        re3.is_delete = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 3:
                        re3.allow_share = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 4:
                        re3.allow_comment = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 5:
                        re3.is_private = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 6:
                        re3.with_goods = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        re3.private_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 9:
                        re3.in_reviewing = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 10:
                        re3.reviewed = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        re3.self_see = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 12:
                        re3.is_prohibited = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        re3.download_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 14:
                        re3.dont_share_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 15:
                        re3.video_hide_search = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        re3.video_mute = C69417RMf.ADAPTER.decode(protoReader);
                        break;
                    case 17:
                        re3.is_copyright_violation = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 18:
                        re3.audio_change_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return re3;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RE3 re3) {
        RE3 re32 = re3;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, re32.aweme_id);
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(6, re32.with_goods) + protoAdapter.encodedSizeWithTag(5, re32.is_private) + protoAdapter.encodedSizeWithTag(4, re32.allow_comment) + protoAdapter.encodedSizeWithTag(3, re32.allow_share) + protoAdapter.encodedSizeWithTag(2, re32.is_delete) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return re32.unknownFields().size() + protoAdapter2.encodedSizeWithTag(18, re32.audio_change_status) + protoAdapter.encodedSizeWithTag(17, re32.is_copyright_violation) + C69417RMf.ADAPTER.encodedSizeWithTag(16, re32.video_mute) + protoAdapter2.encodedSizeWithTag(15, re32.video_hide_search) + protoAdapter2.encodedSizeWithTag(14, re32.dont_share_status) + protoAdapter2.encodedSizeWithTag(13, re32.download_status) + protoAdapter.encodedSizeWithTag(12, re32.is_prohibited) + protoAdapter.encodedSizeWithTag(11, re32.self_see) + protoAdapter2.encodedSizeWithTag(10, re32.reviewed) + protoAdapter.encodedSizeWithTag(9, re32.in_reviewing) + protoAdapter2.encodedSizeWithTag(7, re32.private_status) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RE3 re3) {
        RE3 re32 = re3;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, re32.aweme_id);
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, re32.is_delete);
        protoAdapter.encodeWithTag(protoWriter, 3, re32.allow_share);
        protoAdapter.encodeWithTag(protoWriter, 4, re32.allow_comment);
        protoAdapter.encodeWithTag(protoWriter, 5, re32.is_private);
        protoAdapter.encodeWithTag(protoWriter, 6, re32.with_goods);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 7, re32.private_status);
        protoAdapter.encodeWithTag(protoWriter, 9, re32.in_reviewing);
        protoAdapter2.encodeWithTag(protoWriter, 10, re32.reviewed);
        protoAdapter.encodeWithTag(protoWriter, 11, re32.self_see);
        protoAdapter.encodeWithTag(protoWriter, 12, re32.is_prohibited);
        protoAdapter2.encodeWithTag(protoWriter, 13, re32.download_status);
        protoAdapter2.encodeWithTag(protoWriter, 14, re32.dont_share_status);
        protoAdapter2.encodeWithTag(protoWriter, 15, re32.video_hide_search);
        C69417RMf.ADAPTER.encodeWithTag(protoWriter, 16, re32.video_mute);
        protoAdapter.encodeWithTag(protoWriter, 17, re32.is_copyright_violation);
        protoAdapter2.encodeWithTag(protoWriter, 18, re32.audio_change_status);
        protoWriter.writeBytes(re32.unknownFields());
    }
}
