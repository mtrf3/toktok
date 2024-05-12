package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDG extends ProtoAdapter<REN> {
    public RDG() {
        super(FieldEncoding.LENGTH_DELIMITED, REN.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final REN decode(ProtoReader protoReader) {
        REN ren = new REN();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        ren.poi_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        ren.poi_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        ren.poi_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        ren.info_source = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        ren.collect_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        ren.poi_mapkit_collect = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        ren.video_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        ren.address_info = RH8.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        ren.video_anchor = C69229REz.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        ren.comment_anchor = C69229REz.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        ren.nearby_tag = RO4.ADAPTER.decode(protoReader);
                        break;
                    case 12:
                        ren.poi_review_config = ROT.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return ren;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(REN ren) {
        REN ren2 = ren;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = RH8.ADAPTER.encodedSizeWithTag(8, ren2.address_info) + ProtoAdapter.INT64.encodedSizeWithTag(7, ren2.video_count) + ProtoAdapter.BOOL.encodedSizeWithTag(6, ren2.poi_mapkit_collect) + protoAdapter.encodedSizeWithTag(5, ren2.collect_info) + protoAdapter.encodedSizeWithTag(4, ren2.info_source) + protoAdapter.encodedSizeWithTag(3, ren2.poi_type) + protoAdapter.encodedSizeWithTag(2, ren2.poi_id) + protoAdapter.encodedSizeWithTag(1, ren2.poi_name);
        ProtoAdapter<C69229REz> protoAdapter2 = C69229REz.ADAPTER;
        return ren2.unknownFields().size() + ROT.ADAPTER.encodedSizeWithTag(12, ren2.poi_review_config) + RO4.ADAPTER.encodedSizeWithTag(11, ren2.nearby_tag) + protoAdapter2.encodedSizeWithTag(10, ren2.comment_anchor) + protoAdapter2.encodedSizeWithTag(9, ren2.video_anchor) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, REN ren) {
        REN ren2 = ren;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, ren2.poi_name);
        protoAdapter.encodeWithTag(protoWriter, 2, ren2.poi_id);
        protoAdapter.encodeWithTag(protoWriter, 3, ren2.poi_type);
        protoAdapter.encodeWithTag(protoWriter, 4, ren2.info_source);
        protoAdapter.encodeWithTag(protoWriter, 5, ren2.collect_info);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, ren2.poi_mapkit_collect);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, ren2.video_count);
        RH8.ADAPTER.encodeWithTag(protoWriter, 8, ren2.address_info);
        ProtoAdapter<C69229REz> protoAdapter2 = C69229REz.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 9, ren2.video_anchor);
        protoAdapter2.encodeWithTag(protoWriter, 10, ren2.comment_anchor);
        RO4.ADAPTER.encodeWithTag(protoWriter, 11, ren2.nearby_tag);
        ROT.ADAPTER.encodeWithTag(protoWriter, 12, ren2.poi_review_config);
        protoWriter.writeBytes(ren2.unknownFields());
    }
}
