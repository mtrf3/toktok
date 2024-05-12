package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69164RCm extends ProtoAdapter<C69165RCn> {
    public C69164RCm() {
        super(FieldEncoding.LENGTH_DELIMITED, C69165RCn.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69165RCn decode(ProtoReader protoReader) {
        C69165RCn c69165RCn = new C69165RCn();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69165RCn.uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69165RCn.short_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69165RCn.nickname = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69165RCn.avatar_larger = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        c69165RCn.avatar_thumb = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69165RCn.avatar_medium = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69165RCn.custom_verify = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c69165RCn.unique_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        c69165RCn.is_minor = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 10:
                        c69165RCn.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69165RCn.region = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 12:
                        c69165RCn.account_region = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69165RCn.secret = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 14:
                        c69165RCn.type_label.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 15:
                        c69165RCn.unique_id_modify_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69165RCn.user_canceled = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 17:
                        c69165RCn.register_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 18:
                        c69165RCn.status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 19:
                        c69165RCn.create_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 20:
                        c69165RCn.avatar_uri = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 21:
                        c69165RCn.country = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 22:
                        c69165RCn.cover_url.add(C69214REk.ADAPTER.decode(protoReader));
                        break;
                    case 23:
                        c69165RCn.iso_country_code = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 24:
                        c69165RCn.language = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 25:
                        c69165RCn.remark_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 26:
                        c69165RCn.user_mode = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 27:
                        c69165RCn.user_period = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 28:
                        c69165RCn.is_star = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 29:
                        c69165RCn.avatar_168x168 = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 30:
                        c69165RCn.avatar_300x300 = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69165RCn;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69165RCn c69165RCn) {
        C69165RCn c69165RCn2 = c69165RCn;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, c69165RCn2.nickname) + protoAdapter.encodedSizeWithTag(2, c69165RCn2.short_id) + protoAdapter.encodedSizeWithTag(1, c69165RCn2.uid);
        ProtoAdapter<C69214REk> protoAdapter2 = C69214REk.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(8, c69165RCn2.unique_id) + protoAdapter.encodedSizeWithTag(7, c69165RCn2.custom_verify) + protoAdapter2.encodedSizeWithTag(6, c69165RCn2.avatar_medium) + protoAdapter2.encodedSizeWithTag(5, c69165RCn2.avatar_thumb) + protoAdapter2.encodedSizeWithTag(4, c69165RCn2.avatar_larger) + encodedSizeWithTag;
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(12, c69165RCn2.account_region) + protoAdapter.encodedSizeWithTag(11, c69165RCn2.region) + protoAdapter.encodedSizeWithTag(10, c69165RCn2.sec_uid) + protoAdapter3.encodedSizeWithTag(9, c69165RCn2.is_minor) + encodedSizeWithTag2;
        ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
        int encodedSizeWithTag4 = protoAdapter4.encodedSizeWithTag(13, c69165RCn2.secret) + encodedSizeWithTag3;
        ProtoAdapter<Long> protoAdapter5 = ProtoAdapter.INT64;
        return c69165RCn2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(30, c69165RCn2.avatar_300x300) + protoAdapter2.encodedSizeWithTag(29, c69165RCn2.avatar_168x168) + protoAdapter3.encodedSizeWithTag(28, c69165RCn2.is_star) + protoAdapter4.encodedSizeWithTag(27, c69165RCn2.user_period) + protoAdapter4.encodedSizeWithTag(26, c69165RCn2.user_mode) + protoAdapter.encodedSizeWithTag(25, c69165RCn2.remark_name) + protoAdapter.encodedSizeWithTag(24, c69165RCn2.language) + protoAdapter.encodedSizeWithTag(23, c69165RCn2.iso_country_code) + protoAdapter2.asRepeated().encodedSizeWithTag(22, c69165RCn2.cover_url) + protoAdapter.encodedSizeWithTag(21, c69165RCn2.country) + protoAdapter.encodedSizeWithTag(20, c69165RCn2.avatar_uri) + protoAdapter5.encodedSizeWithTag(19, c69165RCn2.create_time) + protoAdapter4.encodedSizeWithTag(18, c69165RCn2.status) + protoAdapter5.encodedSizeWithTag(17, c69165RCn2.register_time) + protoAdapter3.encodedSizeWithTag(16, c69165RCn2.user_canceled) + protoAdapter4.encodedSizeWithTag(15, c69165RCn2.unique_id_modify_time) + protoAdapter5.asRepeated().encodedSizeWithTag(14, c69165RCn2.type_label) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69165RCn c69165RCn) {
    }
}
