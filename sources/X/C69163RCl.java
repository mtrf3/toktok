package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69163RCl extends ProtoAdapter<C69177RCz> {
    public C69163RCl() {
        super(FieldEncoding.LENGTH_DELIMITED, C69177RCz.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69177RCz decode(ProtoReader protoReader) {
        C69177RCz c69177RCz = new C69177RCz();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69177RCz.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69177RCz.create_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69177RCz.author = C69165RCn.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        c69177RCz.music = C69173RCv.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        c69177RCz.video = C69174RCw.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69177RCz.user_digged = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        c69177RCz.statistics = RMQ.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69177RCz.status = ROK.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69177RCz.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        c69177RCz.is_vr = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69177RCz.aweme_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 12:
                        c69177RCz.image_infos.add(C69271RGp.ADAPTER.decode(protoReader));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69177RCz.group_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        c69177RCz.long_video.add(C69266RGk.ADAPTER.decode(protoReader));
                        break;
                    case 15:
                        c69177RCz.desc_language = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69177RCz.take_down_reason = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 17:
                        c69177RCz.take_down_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 18:
                        c69177RCz.distribute_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69177RCz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69177RCz c69177RCz) {
        C69177RCz c69177RCz2 = c69177RCz;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = C69174RCw.ADAPTER.encodedSizeWithTag(5, c69177RCz2.video) + C69173RCv.ADAPTER.encodedSizeWithTag(4, c69177RCz2.music) + C69165RCn.ADAPTER.encodedSizeWithTag(3, c69177RCz2.author) + ProtoAdapter.INT64.encodedSizeWithTag(2, c69177RCz2.create_time) + protoAdapter.encodedSizeWithTag(1, c69177RCz2.aweme_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return c69177RCz2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(18, c69177RCz2.distribute_type) + protoAdapter.encodedSizeWithTag(17, c69177RCz2.take_down_desc) + protoAdapter2.encodedSizeWithTag(16, c69177RCz2.take_down_reason) + protoAdapter.encodedSizeWithTag(15, c69177RCz2.desc_language) + C69266RGk.ADAPTER.asRepeated().encodedSizeWithTag(14, c69177RCz2.long_video) + protoAdapter.encodedSizeWithTag(13, c69177RCz2.group_id) + C69271RGp.ADAPTER.asRepeated().encodedSizeWithTag(12, c69177RCz2.image_infos) + protoAdapter2.encodedSizeWithTag(11, c69177RCz2.aweme_type) + ProtoAdapter.BOOL.encodedSizeWithTag(10, c69177RCz2.is_vr) + protoAdapter.encodedSizeWithTag(9, c69177RCz2.extra) + ROK.ADAPTER.encodedSizeWithTag(8, c69177RCz2.status) + RMQ.ADAPTER.encodedSizeWithTag(7, c69177RCz2.statistics) + protoAdapter2.encodedSizeWithTag(6, c69177RCz2.user_digged) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69177RCz c69177RCz) {
    }
}
