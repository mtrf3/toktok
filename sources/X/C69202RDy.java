package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69202RDy extends ProtoAdapter<RFR> {
    public C69202RDy() {
        super(FieldEncoding.LENGTH_DELIMITED, RFR.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFR decode(ProtoReader protoReader) {
        RFR rfr = new RFR();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rfr.reason_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rfr.sub_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        rfr.middle_info.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 4:
                        rfr.middle_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        rfr.user_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        rfr.item_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfr;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFR rfr) {
        RFR rfr2 = rfr;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, rfr2.sub_type) + protoAdapter.encodedSizeWithTag(1, rfr2.reason_type);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return rfr2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(6, rfr2.item_id) + protoAdapter2.encodedSizeWithTag(5, rfr2.user_id) + protoAdapter.encodedSizeWithTag(4, rfr2.middle_count) + protoAdapter2.asRepeated().encodedSizeWithTag(3, rfr2.middle_info) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFR rfr) {
        RFR rfr2 = rfr;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rfr2.reason_type);
        protoAdapter.encodeWithTag(protoWriter, 2, rfr2.sub_type);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, rfr2.middle_info);
        protoAdapter.encodeWithTag(protoWriter, 4, rfr2.middle_count);
        protoAdapter2.encodeWithTag(protoWriter, 5, rfr2.user_id);
        protoAdapter2.encodeWithTag(protoWriter, 6, rfr2.item_id);
        protoWriter.writeBytes(rfr2.unknownFields());
    }
}
