package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQ6 extends ProtoAdapter<RQ5> {
    public RQ6() {
        super(FieldEncoding.LENGTH_DELIMITED, RQ5.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RQ5 decode(ProtoReader protoReader) {
        RQ5 rq5 = new RQ5();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rq5.enable_client_adgap_adjust = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 2:
                        rq5.enable_fast_browse = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 3:
                        rq5.enable_showtime_gap = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 4:
                        rq5.downstream_range_end = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        rq5.adgap_delta_by_time = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rq5.use_fast_browse_model = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        rq5.viewed_vid_num = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        rq5.single_vid_view_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        rq5.fast_browse_time_threshold = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 10:
                        rq5.min_gap = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rq5;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RQ5 rq5) {
        RQ5 rq52 = rq5;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, rq52.enable_showtime_gap) + protoAdapter.encodedSizeWithTag(2, rq52.enable_fast_browse) + protoAdapter.encodedSizeWithTag(1, rq52.enable_client_adgap_adjust);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return rq52.unknownFields().size() + protoAdapter2.encodedSizeWithTag(10, rq52.min_gap) + protoAdapter2.encodedSizeWithTag(9, rq52.fast_browse_time_threshold) + protoAdapter2.encodedSizeWithTag(8, rq52.single_vid_view_time) + protoAdapter2.encodedSizeWithTag(7, rq52.viewed_vid_num) + protoAdapter.encodedSizeWithTag(6, rq52.use_fast_browse_model) + ProtoAdapter.STRING.encodedSizeWithTag(5, rq52.adgap_delta_by_time) + protoAdapter2.encodedSizeWithTag(4, rq52.downstream_range_end) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RQ5 rq5) {
        RQ5 rq52 = rq5;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, rq52.enable_client_adgap_adjust);
        protoAdapter.encodeWithTag(protoWriter, 2, rq52.enable_fast_browse);
        protoAdapter.encodeWithTag(protoWriter, 3, rq52.enable_showtime_gap);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 4, rq52.downstream_range_end);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, rq52.adgap_delta_by_time);
        protoAdapter.encodeWithTag(protoWriter, 6, rq52.use_fast_browse_model);
        protoAdapter2.encodeWithTag(protoWriter, 7, rq52.viewed_vid_num);
        protoAdapter2.encodeWithTag(protoWriter, 8, rq52.single_vid_view_time);
        protoAdapter2.encodeWithTag(protoWriter, 9, rq52.fast_browse_time_threshold);
        protoAdapter2.encodeWithTag(protoWriter, 10, rq52.min_gap);
        protoWriter.writeBytes(rq52.unknownFields());
    }
}
