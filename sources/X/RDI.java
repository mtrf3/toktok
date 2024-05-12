package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDI extends ProtoAdapter<RFH> {
    public RDI() {
        super(FieldEncoding.LENGTH_DELIMITED, RFH.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFH decode(ProtoReader protoReader) {
        RFH rfh = new RFH();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rfh.room = C69172RCu.ADAPTER.decode(protoReader);
                        break;
                    case 2:
                        rfh.type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        rfh.fans_struct = C69269RGn.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        rfh.tag = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rfh.tag_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        rfh.icon = REV.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        rfh.distance = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rfh.rawdata = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        rfh.ecom_rec_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFH rfh) {
        RFH rfh2 = rfh;
        int encodedSizeWithTag = C69269RGn.ADAPTER.encodedSizeWithTag(3, rfh2.fans_struct) + ProtoAdapter.INT32.encodedSizeWithTag(2, rfh2.type) + C69172RCu.ADAPTER.encodedSizeWithTag(1, rfh2.room);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rfh2.unknownFields().size() + protoAdapter.encodedSizeWithTag(9, rfh2.ecom_rec_info) + protoAdapter.encodedSizeWithTag(8, rfh2.rawdata) + protoAdapter.encodedSizeWithTag(7, rfh2.distance) + REV.ADAPTER.encodedSizeWithTag(6, rfh2.icon) + ProtoAdapter.INT64.encodedSizeWithTag(5, rfh2.tag_id) + protoAdapter.encodedSizeWithTag(4, rfh2.tag) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFH rfh) {
        RFH rfh2 = rfh;
        C69172RCu.ADAPTER.encodeWithTag(protoWriter, 1, rfh2.room);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, rfh2.type);
        C69269RGn.ADAPTER.encodeWithTag(protoWriter, 3, rfh2.fans_struct);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, rfh2.tag);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, rfh2.tag_id);
        REV.ADAPTER.encodeWithTag(protoWriter, 6, rfh2.icon);
        protoAdapter.encodeWithTag(protoWriter, 7, rfh2.distance);
        protoAdapter.encodeWithTag(protoWriter, 8, rfh2.rawdata);
        protoAdapter.encodeWithTag(protoWriter, 9, rfh2.ecom_rec_info);
        protoWriter.writeBytes(rfh2.unknownFields());
    }
}
