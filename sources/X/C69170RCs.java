package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69170RCs extends ProtoAdapter<RDH> {
    public C69170RCs() {
        super(FieldEncoding.LENGTH_DELIMITED, RDH.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RDH decode(ProtoReader protoReader) {
        RDH rdh = new RDH();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rdh.keyword = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rdh.url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rdh.language = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rdh.schema = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rdh.id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rdh.type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        rdh.icon = REV.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        rdh.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        rdh.deep_link = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rdh.universal_link = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rdh.general_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 12:
                        rdh.log_extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rdh.description = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        rdh.thumbnail = REV.ADAPTER.decode(protoReader);
                        break;
                    case 15:
                        rdh.actions.add(C69280RGy.ADAPTER.decode(protoReader));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        rdh.is_shooting_allow = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 17:
                        rdh.most_relevant_product_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 18:
                        rdh.component_key = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rdh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RDH rdh) {
        RDH rdh2 = rdh;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, rdh2.id) + protoAdapter.encodedSizeWithTag(4, rdh2.schema) + protoAdapter.encodedSizeWithTag(3, rdh2.language) + protoAdapter.encodedSizeWithTag(2, rdh2.url) + protoAdapter.encodedSizeWithTag(1, rdh2.keyword);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, rdh2.type) + encodedSizeWithTag;
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        return rdh2.unknownFields().size() + protoAdapter.encodedSizeWithTag(18, rdh2.component_key) + protoAdapter.encodedSizeWithTag(17, rdh2.most_relevant_product_id) + ProtoAdapter.BOOL.encodedSizeWithTag(16, rdh2.is_shooting_allow) + C69280RGy.ADAPTER.asRepeated().encodedSizeWithTag(15, rdh2.actions) + protoAdapter3.encodedSizeWithTag(14, rdh2.thumbnail) + protoAdapter.encodedSizeWithTag(13, rdh2.description) + protoAdapter.encodedSizeWithTag(12, rdh2.log_extra) + protoAdapter2.encodedSizeWithTag(11, rdh2.general_type) + protoAdapter.encodedSizeWithTag(10, rdh2.universal_link) + protoAdapter.encodedSizeWithTag(9, rdh2.deep_link) + protoAdapter.encodedSizeWithTag(8, rdh2.extra) + protoAdapter3.encodedSizeWithTag(7, rdh2.icon) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RDH rdh) {
        RDH rdh2 = rdh;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rdh2.keyword);
        protoAdapter.encodeWithTag(protoWriter, 2, rdh2.url);
        protoAdapter.encodeWithTag(protoWriter, 3, rdh2.language);
        protoAdapter.encodeWithTag(protoWriter, 4, rdh2.schema);
        protoAdapter.encodeWithTag(protoWriter, 5, rdh2.id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 6, rdh2.type);
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 7, rdh2.icon);
        protoAdapter.encodeWithTag(protoWriter, 8, rdh2.extra);
        protoAdapter.encodeWithTag(protoWriter, 9, rdh2.deep_link);
        protoAdapter.encodeWithTag(protoWriter, 10, rdh2.universal_link);
        protoAdapter2.encodeWithTag(protoWriter, 11, rdh2.general_type);
        protoAdapter.encodeWithTag(protoWriter, 12, rdh2.log_extra);
        protoAdapter.encodeWithTag(protoWriter, 13, rdh2.description);
        protoAdapter3.encodeWithTag(protoWriter, 14, rdh2.thumbnail);
        C69280RGy.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, rdh2.actions);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, rdh2.is_shooting_allow);
        protoAdapter.encodeWithTag(protoWriter, 17, rdh2.most_relevant_product_id);
        protoAdapter.encodeWithTag(protoWriter, 18, rdh2.component_key);
        protoWriter.writeBytes(rdh2.unknownFields());
    }
}
