package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69205REb extends ProtoAdapter<C69257RGb> {
    public C69205REb() {
        super(FieldEncoding.LENGTH_DELIMITED, C69257RGb.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69257RGb decode(ProtoReader protoReader) {
        C69257RGb c69257RGb = new C69257RGb();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    c69257RGb.external_recommend_reason = RLY.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c69257RGb.relation_type = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69257RGb.mutual_struct = RHS.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69257RGb.recommend_reason = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69257RGb.rec_type = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69257RGb;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69257RGb c69257RGb) {
        C69257RGb c69257RGb2 = c69257RGb;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69257RGb2.unknownFields().size() + RLY.ADAPTER.encodedSizeWithTag(5, c69257RGb2.external_recommend_reason) + protoAdapter.encodedSizeWithTag(4, c69257RGb2.relation_type) + RHS.ADAPTER.encodedSizeWithTag(3, c69257RGb2.mutual_struct) + protoAdapter.encodedSizeWithTag(2, c69257RGb2.recommend_reason) + protoAdapter.encodedSizeWithTag(1, c69257RGb2.rec_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69257RGb c69257RGb) {
        C69257RGb c69257RGb2 = c69257RGb;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69257RGb2.rec_type);
        protoAdapter.encodeWithTag(protoWriter, 2, c69257RGb2.recommend_reason);
        RHS.ADAPTER.encodeWithTag(protoWriter, 3, c69257RGb2.mutual_struct);
        protoAdapter.encodeWithTag(protoWriter, 4, c69257RGb2.relation_type);
        RLY.ADAPTER.encodeWithTag(protoWriter, 5, c69257RGb2.external_recommend_reason);
        protoWriter.writeBytes(c69257RGb2.unknownFields());
    }
}
