package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RE5 extends ProtoAdapter<RFX> {
    public RE5() {
        super(FieldEncoding.LENGTH_DELIMITED, RFX.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFX decode(ProtoReader protoReader) {
        RFX rfx = new RFX();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rfx.rec_reasons.add(RHO.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        rfx.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rfx.body = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rfx.sub_body = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rfx.url_text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rfx.url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rfx.button_text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rfx.biz_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfx;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFX rfx) {
        RFX rfx2 = rfx;
        int encodedSizeWithTag = RHO.ADAPTER.asRepeated().encodedSizeWithTag(1, rfx2.rec_reasons);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rfx2.unknownFields().size() + protoAdapter.encodedSizeWithTag(8, rfx2.biz_type) + protoAdapter.encodedSizeWithTag(7, rfx2.button_text) + protoAdapter.encodedSizeWithTag(6, rfx2.url) + protoAdapter.encodedSizeWithTag(5, rfx2.url_text) + protoAdapter.encodedSizeWithTag(4, rfx2.sub_body) + protoAdapter.encodedSizeWithTag(3, rfx2.body) + protoAdapter.encodedSizeWithTag(2, rfx2.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFX rfx) {
        RFX rfx2 = rfx;
        RHO.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, rfx2.rec_reasons);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rfx2.title);
        protoAdapter.encodeWithTag(protoWriter, 3, rfx2.body);
        protoAdapter.encodeWithTag(protoWriter, 4, rfx2.sub_body);
        protoAdapter.encodeWithTag(protoWriter, 5, rfx2.url_text);
        protoAdapter.encodeWithTag(protoWriter, 6, rfx2.url);
        protoAdapter.encodeWithTag(protoWriter, 7, rfx2.button_text);
        protoAdapter.encodeWithTag(protoWriter, 8, rfx2.biz_type);
        protoWriter.writeBytes(rfx2.unknownFields());
    }
}
