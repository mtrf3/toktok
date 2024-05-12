package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REG extends ProtoAdapter<RGH> {
    public REG() {
        super(FieldEncoding.LENGTH_DELIMITED, RGH.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGH decode(ProtoReader protoReader) {
        RGH rgh = new RGH();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgh.icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 2:
                        rgh.display = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rgh.button_icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        rgh.schema = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rgh.event_keyword_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        rgh.event_keyword = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rgh.event_tracking_param = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGH rgh) {
        RGH rgh2 = rgh;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rgh2.icon_url);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rgh2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(7, rgh2.event_tracking_param) + protoAdapter2.encodedSizeWithTag(6, rgh2.event_keyword) + ProtoAdapter.INT64.encodedSizeWithTag(5, rgh2.event_keyword_id) + protoAdapter2.encodedSizeWithTag(4, rgh2.schema) + protoAdapter.encodedSizeWithTag(3, rgh2.button_icon_url) + protoAdapter2.encodedSizeWithTag(2, rgh2.display) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGH rgh) {
        RGH rgh2 = rgh;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, rgh2.icon_url);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, rgh2.display);
        protoAdapter.encodeWithTag(protoWriter, 3, rgh2.button_icon_url);
        protoAdapter2.encodeWithTag(protoWriter, 4, rgh2.schema);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, rgh2.event_keyword_id);
        protoAdapter2.encodeWithTag(protoWriter, 6, rgh2.event_keyword);
        protoAdapter2.encodeWithTag(protoWriter, 7, rgh2.event_tracking_param);
        protoWriter.writeBytes(rgh2.unknownFields());
    }
}
