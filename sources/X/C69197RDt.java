package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69197RDt extends ProtoAdapter<RG4> {
    public C69197RDt() {
        super(FieldEncoding.LENGTH_DELIMITED, RG4.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RG4 decode(ProtoReader protoReader) {
        RG4 rg4 = new RG4();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rg4.show_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rg4.business_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        rg4.wikipedia_info = RO1.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        rg4.shop_link = RNI.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        rg4.anchor_info = RDH.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        rg4.anchor_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rg4;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RG4 rg4) {
        RG4 rg42 = rg4;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rg42.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(6, rg42.anchor_id) + RDH.ADAPTER.encodedSizeWithTag(5, rg42.anchor_info) + RNI.ADAPTER.encodedSizeWithTag(4, rg42.shop_link) + RO1.ADAPTER.encodedSizeWithTag(3, rg42.wikipedia_info) + protoAdapter.encodedSizeWithTag(2, rg42.business_type) + protoAdapter.encodedSizeWithTag(1, rg42.show_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RG4 rg4) {
        RG4 rg42 = rg4;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rg42.show_type);
        protoAdapter.encodeWithTag(protoWriter, 2, rg42.business_type);
        RO1.ADAPTER.encodeWithTag(protoWriter, 3, rg42.wikipedia_info);
        RNI.ADAPTER.encodeWithTag(protoWriter, 4, rg42.shop_link);
        RDH.ADAPTER.encodeWithTag(protoWriter, 5, rg42.anchor_info);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, rg42.anchor_id);
        protoWriter.writeBytes(rg42.unknownFields());
    }
}
