package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69190RDm extends ProtoAdapter<RG0> {
    public C69190RDm() {
        super(FieldEncoding.LENGTH_DELIMITED, RG0.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RG0 decode(ProtoReader protoReader) {
        RG0 rg0 = new RG0();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rg0.category_id = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rg0.category_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rg0.brand_id = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rg0.brand_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rg0.logo_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        rg0.heat = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        rg0.rank = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        rg0.rank_diff = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        rg0.tag_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rg0;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RG0 rg0) {
        RG0 rg02 = rg0;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rg02.category_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rg02.unknownFields().size() + protoAdapter2.encodedSizeWithTag(9, rg02.tag_name) + protoAdapter.encodedSizeWithTag(8, rg02.rank_diff) + protoAdapter.encodedSizeWithTag(7, rg02.rank) + protoAdapter.encodedSizeWithTag(6, rg02.heat) + REV.ADAPTER.encodedSizeWithTag(5, rg02.logo_url) + protoAdapter2.encodedSizeWithTag(4, rg02.brand_name) + protoAdapter.encodedSizeWithTag(3, rg02.brand_id) + protoAdapter2.encodedSizeWithTag(2, rg02.category_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RG0 rg0) {
        RG0 rg02 = rg0;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rg02.category_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, rg02.category_name);
        protoAdapter.encodeWithTag(protoWriter, 3, rg02.brand_id);
        protoAdapter2.encodeWithTag(protoWriter, 4, rg02.brand_name);
        REV.ADAPTER.encodeWithTag(protoWriter, 5, rg02.logo_url);
        protoAdapter.encodeWithTag(protoWriter, 6, rg02.heat);
        protoAdapter.encodeWithTag(protoWriter, 7, rg02.rank);
        protoAdapter.encodeWithTag(protoWriter, 8, rg02.rank_diff);
        protoAdapter2.encodeWithTag(protoWriter, 9, rg02.tag_name);
        protoWriter.writeBytes(rg02.unknownFields());
    }
}
