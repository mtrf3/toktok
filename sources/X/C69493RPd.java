package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RPd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69493RPd extends ProtoAdapter<C69494RPe> {
    public C69493RPd() {
        super(FieldEncoding.LENGTH_DELIMITED, C69494RPe.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69494RPe decode(ProtoReader protoReader) {
        C69494RPe c69494RPe = new C69494RPe();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69494RPe.status_code = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c69494RPe.min_cursor = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69494RPe.max_cursor = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c69494RPe.has_more = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69494RPe.aweme_list.add(RCZ.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        c69494RPe.status_msg = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c69494RPe.log_pb = RME.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69494RPe.card_insert_results.add(RHB.ADAPTER.decode(protoReader));
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69494RPe;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69494RPe c69494RPe) {
        C69494RPe c69494RPe2 = c69494RPe;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69494RPe2.status_code);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return c69494RPe2.unknownFields().size() + RHB.ADAPTER.asRepeated().encodedSizeWithTag(8, c69494RPe2.card_insert_results) + RME.ADAPTER.encodedSizeWithTag(7, c69494RPe2.log_pb) + ProtoAdapter.STRING.encodedSizeWithTag(6, c69494RPe2.status_msg) + RCZ.ADAPTER.asRepeated().encodedSizeWithTag(5, c69494RPe2.aweme_list) + protoAdapter.encodedSizeWithTag(4, c69494RPe2.has_more) + protoAdapter2.encodedSizeWithTag(3, c69494RPe2.max_cursor) + protoAdapter2.encodedSizeWithTag(2, c69494RPe2.min_cursor) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69494RPe c69494RPe) {
        C69494RPe c69494RPe2 = c69494RPe;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69494RPe2.status_code);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, c69494RPe2.min_cursor);
        protoAdapter2.encodeWithTag(protoWriter, 3, c69494RPe2.max_cursor);
        protoAdapter.encodeWithTag(protoWriter, 4, c69494RPe2.has_more);
        RCZ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c69494RPe2.aweme_list);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, c69494RPe2.status_msg);
        RME.ADAPTER.encodeWithTag(protoWriter, 7, c69494RPe2.log_pb);
        RHB.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c69494RPe2.card_insert_results);
        protoWriter.writeBytes(c69494RPe2.unknownFields());
    }
}
