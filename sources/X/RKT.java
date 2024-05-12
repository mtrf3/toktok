package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RKT extends ProtoAdapter<RKU> {
    public RKT() {
        super(FieldEncoding.LENGTH_DELIMITED, RKU.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RKU decode(ProtoReader protoReader) {
        RKU rku = new RKU();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rku.mix_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rku.name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rku.index = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rku.icon = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        rku.item_total = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        rku.name_in_review = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rku.is_default_name = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rku;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RKU rku) {
        RKU rku2 = rku;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rku2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(7, rku2.is_default_name) + protoAdapter.encodedSizeWithTag(6, rku2.name_in_review) + ProtoAdapter.INT64.encodedSizeWithTag(5, rku2.item_total) + REV.ADAPTER.encodedSizeWithTag(4, rku2.icon) + ProtoAdapter.INT32.encodedSizeWithTag(3, rku2.index) + protoAdapter.encodedSizeWithTag(2, rku2.name) + protoAdapter.encodedSizeWithTag(1, rku2.mix_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RKU rku) {
        RKU rku2 = rku;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rku2.mix_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rku2.name);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, rku2.index);
        REV.ADAPTER.encodeWithTag(protoWriter, 4, rku2.icon);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, rku2.item_total);
        protoAdapter.encodeWithTag(protoWriter, 6, rku2.name_in_review);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, rku2.is_default_name);
        protoWriter.writeBytes(rku2.unknownFields());
    }
}
