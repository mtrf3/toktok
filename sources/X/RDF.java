package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDF extends ProtoAdapter<REC> {
    public RDF() {
        super(FieldEncoding.LENGTH_DELIMITED, REC.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final REC decode(ProtoReader protoReader) {
        REC rec = new REC();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rec.stories.add(RCZ.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        rec.total_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rec.current_position = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        rec.all_viewed = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 5:
                        rec.min_cursor = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        rec.max_cursor = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        rec.has_more_after = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 8:
                        rec.has_more_before = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 9:
                        rec.last_story_created_at = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 10:
                        rec.is_post_style = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rec.all_story_lite_metadata.add(ROD.ADAPTER.decode(protoReader));
                        break;
                    case 12:
                        rec.is_story_guide_card = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rec;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(REC rec) {
        REC rec2 = rec;
        int encodedSizeWithTag = RCZ.ADAPTER.asRepeated().encodedSizeWithTag(1, rec2.stories);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, rec2.current_position) + protoAdapter.encodedSizeWithTag(2, rec2.total_count) + encodedSizeWithTag;
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return rec2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(12, rec2.is_story_guide_card) + ROD.ADAPTER.asRepeated().encodedSizeWithTag(11, rec2.all_story_lite_metadata) + protoAdapter2.encodedSizeWithTag(10, rec2.is_post_style) + protoAdapter.encodedSizeWithTag(9, rec2.last_story_created_at) + protoAdapter2.encodedSizeWithTag(8, rec2.has_more_before) + protoAdapter2.encodedSizeWithTag(7, rec2.has_more_after) + protoAdapter.encodedSizeWithTag(6, rec2.max_cursor) + protoAdapter.encodedSizeWithTag(5, rec2.min_cursor) + protoAdapter2.encodedSizeWithTag(4, rec2.all_viewed) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, REC rec) {
        REC rec2 = rec;
        RCZ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, rec2.stories);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, rec2.total_count);
        protoAdapter.encodeWithTag(protoWriter, 3, rec2.current_position);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 4, rec2.all_viewed);
        protoAdapter.encodeWithTag(protoWriter, 5, rec2.min_cursor);
        protoAdapter.encodeWithTag(protoWriter, 6, rec2.max_cursor);
        protoAdapter2.encodeWithTag(protoWriter, 7, rec2.has_more_after);
        protoAdapter2.encodeWithTag(protoWriter, 8, rec2.has_more_before);
        protoAdapter.encodeWithTag(protoWriter, 9, rec2.last_story_created_at);
        protoAdapter2.encodeWithTag(protoWriter, 10, rec2.is_post_style);
        ROD.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, rec2.all_story_lite_metadata);
        protoAdapter2.encodeWithTag(protoWriter, 12, rec2.is_story_guide_card);
        protoWriter.writeBytes(rec2.unknownFields());
    }
}
