package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69162RCk extends ProtoAdapter<C69172RCu> {
    public C69162RCk() {
        super(FieldEncoding.LENGTH_DELIMITED, C69172RCu.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69172RCu decode(ProtoReader protoReader) {
        C69172RCu c69172RCu = new C69172RCu();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69172RCu.room_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c69172RCu.status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c69172RCu.owner = C69154RCc.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        c69172RCu.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69172RCu.user_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        c69172RCu.create_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        c69172RCu.finish_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        c69172RCu.stream_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 9:
                        c69172RCu.stream_url = RM8.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        c69172RCu.share_info = C69199RDv.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69172RCu.digg_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 12:
                        c69172RCu.total_user_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 14:
                        c69172RCu.in_sandbox = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 15:
                        c69172RCu.dynamic_cover = REV.ADAPTER.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69172RCu.room_cover = REV.ADAPTER.decode(protoReader);
                        break;
                    case 17:
                        c69172RCu.room_type_tag = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 18:
                        c69172RCu.additional_stream_url = RM8.ADAPTER.decode(protoReader);
                        break;
                    case 19:
                        c69172RCu.webp_cover = REV.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        c69172RCu.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 21:
                        c69172RCu.live_type_audio = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 22:
                        c69172RCu.live_type_third_party = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 23:
                        c69172RCu.live_type_screenshot = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 24:
                        c69172RCu.live_type_official = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 25:
                        c69172RCu.live_type_normal = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 26:
                        c69172RCu.live_type_linkmic = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 27:
                        c69172RCu.live_type_sandbox = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 28:
                        c69172RCu.with_linkmic = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69172RCu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69172RCu c69172RCu) {
        C69172RCu c69172RCu2 = c69172RCu;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69172RCu2.room_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = C69154RCc.ADAPTER.encodedSizeWithTag(3, c69172RCu2.owner) + protoAdapter2.encodedSizeWithTag(2, c69172RCu2.status) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(8, c69172RCu2.stream_id) + protoAdapter.encodedSizeWithTag(7, c69172RCu2.finish_time) + protoAdapter.encodedSizeWithTag(6, c69172RCu2.create_time) + protoAdapter2.encodedSizeWithTag(5, c69172RCu2.user_count) + protoAdapter3.encodedSizeWithTag(4, c69172RCu2.title) + encodedSizeWithTag2;
        ProtoAdapter<RM8> protoAdapter4 = RM8.ADAPTER;
        int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(12, c69172RCu2.total_user_count) + protoAdapter2.encodedSizeWithTag(11, c69172RCu2.digg_count) + C69199RDv.ADAPTER.encodedSizeWithTag(10, c69172RCu2.share_info) + protoAdapter4.encodedSizeWithTag(9, c69172RCu2.stream_url) + encodedSizeWithTag3;
        ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
        int encodedSizeWithTag5 = protoAdapter5.encodedSizeWithTag(14, c69172RCu2.in_sandbox) + encodedSizeWithTag4;
        ProtoAdapter<REV> protoAdapter6 = REV.ADAPTER;
        return c69172RCu2.unknownFields().size() + protoAdapter5.encodedSizeWithTag(28, c69172RCu2.with_linkmic) + protoAdapter5.encodedSizeWithTag(27, c69172RCu2.live_type_sandbox) + protoAdapter5.encodedSizeWithTag(26, c69172RCu2.live_type_linkmic) + protoAdapter5.encodedSizeWithTag(25, c69172RCu2.live_type_normal) + protoAdapter5.encodedSizeWithTag(24, c69172RCu2.live_type_official) + protoAdapter5.encodedSizeWithTag(23, c69172RCu2.live_type_screenshot) + protoAdapter5.encodedSizeWithTag(22, c69172RCu2.live_type_third_party) + protoAdapter5.encodedSizeWithTag(21, c69172RCu2.live_type_audio) + protoAdapter3.encodedSizeWithTag(20, c69172RCu2.extra) + protoAdapter6.encodedSizeWithTag(19, c69172RCu2.webp_cover) + protoAdapter4.encodedSizeWithTag(18, c69172RCu2.additional_stream_url) + protoAdapter3.encodedSizeWithTag(17, c69172RCu2.room_type_tag) + protoAdapter6.encodedSizeWithTag(16, c69172RCu2.room_cover) + protoAdapter6.encodedSizeWithTag(15, c69172RCu2.dynamic_cover) + encodedSizeWithTag5;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69172RCu c69172RCu) {
        C69172RCu c69172RCu2 = c69172RCu;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, c69172RCu2.room_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 2, c69172RCu2.status);
        C69154RCc.ADAPTER.encodeWithTag(protoWriter, 3, c69172RCu2.owner);
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 4, c69172RCu2.title);
        protoAdapter2.encodeWithTag(protoWriter, 5, c69172RCu2.user_count);
        protoAdapter.encodeWithTag(protoWriter, 6, c69172RCu2.create_time);
        protoAdapter.encodeWithTag(protoWriter, 7, c69172RCu2.finish_time);
        protoAdapter.encodeWithTag(protoWriter, 8, c69172RCu2.stream_id);
        ProtoAdapter<RM8> protoAdapter4 = RM8.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 9, c69172RCu2.stream_url);
        C69199RDv.ADAPTER.encodeWithTag(protoWriter, 10, c69172RCu2.share_info);
        protoAdapter2.encodeWithTag(protoWriter, 11, c69172RCu2.digg_count);
        protoAdapter2.encodeWithTag(protoWriter, 12, c69172RCu2.total_user_count);
        ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
        protoAdapter5.encodeWithTag(protoWriter, 14, c69172RCu2.in_sandbox);
        ProtoAdapter<REV> protoAdapter6 = REV.ADAPTER;
        protoAdapter6.encodeWithTag(protoWriter, 15, c69172RCu2.dynamic_cover);
        protoAdapter6.encodeWithTag(protoWriter, 16, c69172RCu2.room_cover);
        protoAdapter3.encodeWithTag(protoWriter, 17, c69172RCu2.room_type_tag);
        protoAdapter4.encodeWithTag(protoWriter, 18, c69172RCu2.additional_stream_url);
        protoAdapter6.encodeWithTag(protoWriter, 19, c69172RCu2.webp_cover);
        protoAdapter3.encodeWithTag(protoWriter, 20, c69172RCu2.extra);
        protoAdapter5.encodeWithTag(protoWriter, 21, c69172RCu2.live_type_audio);
        protoAdapter5.encodeWithTag(protoWriter, 22, c69172RCu2.live_type_third_party);
        protoAdapter5.encodeWithTag(protoWriter, 23, c69172RCu2.live_type_screenshot);
        protoAdapter5.encodeWithTag(protoWriter, 24, c69172RCu2.live_type_official);
        protoAdapter5.encodeWithTag(protoWriter, 25, c69172RCu2.live_type_normal);
        protoAdapter5.encodeWithTag(protoWriter, 26, c69172RCu2.live_type_linkmic);
        protoAdapter5.encodeWithTag(protoWriter, 27, c69172RCu2.live_type_sandbox);
        protoAdapter5.encodeWithTag(protoWriter, 28, c69172RCu2.with_linkmic);
        protoWriter.writeBytes(c69172RCu2.unknownFields());
    }
}
