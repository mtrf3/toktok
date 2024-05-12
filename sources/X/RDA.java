package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDA extends ProtoAdapter<REM> {
    public RDA() {
        super(FieldEncoding.LENGTH_DELIMITED, REM.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final REM decode(ProtoReader protoReader) {
        REM rem = new REM();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rem.act_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rem.image = REV.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        rem.jump_web_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rem.jump_open_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rem.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rem.start_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        rem.end_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        rem.time_range.add(RHD.ADAPTER.decode(protoReader));
                        break;
                    case 9:
                        rem.track_url_list = REV.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        rem.click_track_url_list = REV.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rem;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(REM rem) {
        REM rem2 = rem;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, rem2.act_type);
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, rem2.image) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(5, rem2.title) + protoAdapter2.encodedSizeWithTag(4, rem2.jump_open_url) + protoAdapter2.encodedSizeWithTag(3, rem2.jump_web_url) + encodedSizeWithTag2;
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        return rem2.unknownFields().size() + protoAdapter.encodedSizeWithTag(10, rem2.click_track_url_list) + protoAdapter.encodedSizeWithTag(9, rem2.track_url_list) + RHD.ADAPTER.asRepeated().encodedSizeWithTag(8, rem2.time_range) + protoAdapter3.encodedSizeWithTag(7, rem2.end_time) + protoAdapter3.encodedSizeWithTag(6, rem2.start_time) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, REM rem) {
        REM rem2 = rem;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rem2.act_type);
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, rem2.image);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, rem2.jump_web_url);
        protoAdapter2.encodeWithTag(protoWriter, 4, rem2.jump_open_url);
        protoAdapter2.encodeWithTag(protoWriter, 5, rem2.title);
        ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 6, rem2.start_time);
        protoAdapter3.encodeWithTag(protoWriter, 7, rem2.end_time);
        RHD.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, rem2.time_range);
        protoAdapter.encodeWithTag(protoWriter, 9, rem2.track_url_list);
        protoAdapter.encodeWithTag(protoWriter, 10, rem2.click_track_url_list);
        protoWriter.writeBytes(rem2.unknownFields());
    }
}
