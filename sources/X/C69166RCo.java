package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69166RCo extends ProtoAdapter<RD1> {
    public C69166RCo() {
        super(FieldEncoding.LENGTH_DELIMITED, RD1.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RD1 decode(ProtoReader protoReader) {
        RD1 rd1 = new RD1();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rd1.id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rd1.name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rd1.children.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 4:
                        rd1.icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        rd1.owner_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rd1.owner_nickname = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rd1.user_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        rd1.desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        rd1.effect_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rd1.share_info = C69199RDv.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rd1.is_favorite = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 12:
                        rd1.commerce_sticker = RDR.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rd1.tags.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 14:
                        rd1.avatar_thumb = REV.ADAPTER.decode(protoReader);
                        break;
                    case 15:
                        rd1.avatar_medium = REV.ADAPTER.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        rd1.avatar_large = REV.ADAPTER.decode(protoReader);
                        break;
                    case 17:
                        rd1.vv_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 18:
                        rd1.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 19:
                        rd1.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rd1;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RD1 rd1) {
        RD1 rd12 = rd1;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(3, rd12.children) + protoAdapter.encodedSizeWithTag(2, rd12.name) + protoAdapter.encodedSizeWithTag(1, rd12.id);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        return rd12.unknownFields().size() + protoAdapter.encodedSizeWithTag(19, rd12.sec_uid) + protoAdapter.encodedSizeWithTag(18, rd12.extra) + ProtoAdapter.INT64.encodedSizeWithTag(17, rd12.vv_count) + protoAdapter2.encodedSizeWithTag(16, rd12.avatar_large) + protoAdapter2.encodedSizeWithTag(15, rd12.avatar_medium) + protoAdapter2.encodedSizeWithTag(14, rd12.avatar_thumb) + protoAdapter.asRepeated().encodedSizeWithTag(13, rd12.tags) + RDR.ADAPTER.encodedSizeWithTag(12, rd12.commerce_sticker) + ProtoAdapter.BOOL.encodedSizeWithTag(11, rd12.is_favorite) + C69199RDv.ADAPTER.encodedSizeWithTag(10, rd12.share_info) + protoAdapter.encodedSizeWithTag(9, rd12.effect_id) + protoAdapter.encodedSizeWithTag(8, rd12.desc) + ProtoAdapter.INT32.encodedSizeWithTag(7, rd12.user_count) + protoAdapter.encodedSizeWithTag(6, rd12.owner_nickname) + protoAdapter.encodedSizeWithTag(5, rd12.owner_id) + protoAdapter2.encodedSizeWithTag(4, rd12.icon_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RD1 rd1) {
        RD1 rd12 = rd1;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rd12.id);
        protoAdapter.encodeWithTag(protoWriter, 2, rd12.name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, rd12.children);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, rd12.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 5, rd12.owner_id);
        protoAdapter.encodeWithTag(protoWriter, 6, rd12.owner_nickname);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, rd12.user_count);
        protoAdapter.encodeWithTag(protoWriter, 8, rd12.desc);
        protoAdapter.encodeWithTag(protoWriter, 9, rd12.effect_id);
        C69199RDv.ADAPTER.encodeWithTag(protoWriter, 10, rd12.share_info);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, rd12.is_favorite);
        RDR.ADAPTER.encodeWithTag(protoWriter, 12, rd12.commerce_sticker);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 13, rd12.tags);
        protoAdapter2.encodeWithTag(protoWriter, 14, rd12.avatar_thumb);
        protoAdapter2.encodeWithTag(protoWriter, 15, rd12.avatar_medium);
        protoAdapter2.encodeWithTag(protoWriter, 16, rd12.avatar_large);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, rd12.vv_count);
        protoAdapter.encodeWithTag(protoWriter, 18, rd12.extra);
        protoAdapter.encodeWithTag(protoWriter, 19, rd12.sec_uid);
        protoWriter.writeBytes(rd12.unknownFields());
    }
}
