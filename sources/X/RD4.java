package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RD4 extends ProtoAdapter<RDR> {
    public RD4() {
        super(FieldEncoding.LENGTH_DELIMITED, RDR.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RDR decode(ProtoReader protoReader) {
        RDR rdr = new RDR();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rdr.id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rdr.ad_owner_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rdr.ad_owner_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rdr.detail_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rdr.detail_letters = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rdr.detail_open_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rdr.detail_web_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rdr.detail_web_url_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        rdr.screen_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rdr.screen_switch = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rdr.publish_icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 12:
                        rdr.publish_letters = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rdr.publish_open_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        rdr.publish_web_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 15:
                        rdr.publish_web_url_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        rdr.music_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 17:
                        rdr.challenge_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 18:
                        rdr.screen_icon = REV.ADAPTER.decode(protoReader);
                        break;
                    case 19:
                        rdr.expire_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 20:
                        rdr.unlock_info = RLP.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rdr;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RDR rdr) {
        RDR rdr2 = rdr;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(10, rdr2.screen_switch) + protoAdapter.encodedSizeWithTag(9, rdr2.screen_desc) + protoAdapter.encodedSizeWithTag(8, rdr2.detail_web_url_title) + protoAdapter.encodedSizeWithTag(7, rdr2.detail_web_url) + protoAdapter.encodedSizeWithTag(6, rdr2.detail_open_url) + protoAdapter.encodedSizeWithTag(5, rdr2.detail_letters) + protoAdapter.encodedSizeWithTag(4, rdr2.detail_desc) + protoAdapter.encodedSizeWithTag(3, rdr2.ad_owner_name) + protoAdapter.encodedSizeWithTag(2, rdr2.ad_owner_id) + protoAdapter.encodedSizeWithTag(1, rdr2.id);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        return rdr2.unknownFields().size() + RLP.ADAPTER.encodedSizeWithTag(20, rdr2.unlock_info) + ProtoAdapter.INT64.encodedSizeWithTag(19, rdr2.expire_time) + protoAdapter2.encodedSizeWithTag(18, rdr2.screen_icon) + protoAdapter.encodedSizeWithTag(17, rdr2.challenge_id) + protoAdapter.encodedSizeWithTag(16, rdr2.music_id) + protoAdapter.encodedSizeWithTag(15, rdr2.publish_web_url_title) + protoAdapter.encodedSizeWithTag(14, rdr2.publish_web_url) + protoAdapter.encodedSizeWithTag(13, rdr2.publish_open_url) + protoAdapter.encodedSizeWithTag(12, rdr2.publish_letters) + protoAdapter2.encodedSizeWithTag(11, rdr2.publish_icon_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RDR rdr) {
        RDR rdr2 = rdr;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rdr2.id);
        protoAdapter.encodeWithTag(protoWriter, 2, rdr2.ad_owner_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rdr2.ad_owner_name);
        protoAdapter.encodeWithTag(protoWriter, 4, rdr2.detail_desc);
        protoAdapter.encodeWithTag(protoWriter, 5, rdr2.detail_letters);
        protoAdapter.encodeWithTag(protoWriter, 6, rdr2.detail_open_url);
        protoAdapter.encodeWithTag(protoWriter, 7, rdr2.detail_web_url);
        protoAdapter.encodeWithTag(protoWriter, 8, rdr2.detail_web_url_title);
        protoAdapter.encodeWithTag(protoWriter, 9, rdr2.screen_desc);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, rdr2.screen_switch);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 11, rdr2.publish_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 12, rdr2.publish_letters);
        protoAdapter.encodeWithTag(protoWriter, 13, rdr2.publish_open_url);
        protoAdapter.encodeWithTag(protoWriter, 14, rdr2.publish_web_url);
        protoAdapter.encodeWithTag(protoWriter, 15, rdr2.publish_web_url_title);
        protoAdapter.encodeWithTag(protoWriter, 16, rdr2.music_id);
        protoAdapter.encodeWithTag(protoWriter, 17, rdr2.challenge_id);
        protoAdapter2.encodeWithTag(protoWriter, 18, rdr2.screen_icon);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 19, rdr2.expire_time);
        RLP.ADAPTER.encodeWithTag(protoWriter, 20, rdr2.unlock_info);
        protoWriter.writeBytes(rdr2.unknownFields());
    }
}
