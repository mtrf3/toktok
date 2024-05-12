package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDJ extends ProtoAdapter<C69200RDw> {
    public RDJ() {
        super(FieldEncoding.LENGTH_DELIMITED, C69200RDw.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69200RDw decode(ProtoReader protoReader) {
        C69200RDw c69200RDw = new C69200RDw();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69200RDw.status_code = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c69200RDw.min_cursor = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69200RDw.max_cursor = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c69200RDw.has_more = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69200RDw.aweme_list.add(C69177RCz.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        c69200RDw.rid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c69200RDw.refresh_clear = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        c69200RDw.extra = C69487ROx.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69200RDw.log_pb = ROA.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        c69200RDw.DebugInfo = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69200RDw.block_code = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 12:
                        c69200RDw.status_msg = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69200RDw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69200RDw c69200RDw) {
        C69200RDw c69200RDw2 = c69200RDw;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69200RDw2.status_code);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = C69177RCz.ADAPTER.asRepeated().encodedSizeWithTag(5, c69200RDw2.aweme_list) + protoAdapter.encodedSizeWithTag(4, c69200RDw2.has_more) + protoAdapter2.encodedSizeWithTag(3, c69200RDw2.max_cursor) + protoAdapter2.encodedSizeWithTag(2, c69200RDw2.min_cursor) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        return c69200RDw2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(12, c69200RDw2.status_msg) + protoAdapter.encodedSizeWithTag(11, c69200RDw2.block_code) + protoAdapter3.encodedSizeWithTag(10, c69200RDw2.DebugInfo) + ROA.ADAPTER.encodedSizeWithTag(9, c69200RDw2.log_pb) + C69487ROx.ADAPTER.encodedSizeWithTag(8, c69200RDw2.extra) + protoAdapter.encodedSizeWithTag(7, c69200RDw2.refresh_clear) + protoAdapter3.encodedSizeWithTag(6, c69200RDw2.rid) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69200RDw c69200RDw) {
    }
}
