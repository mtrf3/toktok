package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69183RDf extends ProtoAdapter<RFV> {
    public C69183RDf() {
        super(FieldEncoding.LENGTH_DELIMITED, RFV.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFV decode(ProtoReader protoReader) {
        RFV rfv = new RFV();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 5) {
                                if (nextTag != 6) {
                                    if (nextTag != 7) {
                                        C1EW.LIZJ(protoReader, protoReader);
                                    } else {
                                        rfv.site_id = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    rfv.quick_shop_name = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                rfv.quick_shop_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            rfv.challenge_list.add(C69160RCi.ADAPTER.decode(protoReader));
                        }
                    } else {
                        rfv.offline_info_list.add(RHE.ADAPTER.decode(protoReader));
                    }
                } else {
                    rfv.head_image_url = REV.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFV rfv) {
        RFV rfv2 = rfv;
        int encodedSizeWithTag = C69160RCi.ADAPTER.asRepeated().encodedSizeWithTag(3, rfv2.challenge_list) + RHE.ADAPTER.asRepeated().encodedSizeWithTag(2, rfv2.offline_info_list) + REV.ADAPTER.encodedSizeWithTag(1, rfv2.head_image_url);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rfv2.unknownFields().size() + protoAdapter.encodedSizeWithTag(7, rfv2.site_id) + protoAdapter.encodedSizeWithTag(6, rfv2.quick_shop_name) + protoAdapter.encodedSizeWithTag(5, rfv2.quick_shop_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFV rfv) {
        RFV rfv2 = rfv;
        REV.ADAPTER.encodeWithTag(protoWriter, 1, rfv2.head_image_url);
        RHE.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, rfv2.offline_info_list);
        C69160RCi.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, rfv2.challenge_list);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 5, rfv2.quick_shop_url);
        protoAdapter.encodeWithTag(protoWriter, 6, rfv2.quick_shop_name);
        protoAdapter.encodeWithTag(protoWriter, 7, rfv2.site_id);
        protoWriter.writeBytes(rfv2.unknownFields());
    }
}
