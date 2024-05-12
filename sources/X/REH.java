package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REH extends ProtoAdapter<RGI> {
    public REH() {
        super(FieldEncoding.LENGTH_DELIMITED, RGI.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGI decode(ProtoReader protoReader) {
        RGI rgi = new RGI();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgi.icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 2:
                        rgi.display = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rgi.button_icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        rgi.schema = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rgi.event_keyword_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        rgi.event_keyword = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rgi.event_tracking_param = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgi;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGI rgi) {
        RGI rgi2 = rgi;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rgi2.icon_url);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rgi2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(7, rgi2.event_tracking_param) + protoAdapter2.encodedSizeWithTag(6, rgi2.event_keyword) + ProtoAdapter.INT64.encodedSizeWithTag(5, rgi2.event_keyword_id) + protoAdapter2.encodedSizeWithTag(4, rgi2.schema) + protoAdapter.encodedSizeWithTag(3, rgi2.button_icon_url) + protoAdapter2.encodedSizeWithTag(2, rgi2.display) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGI rgi) {
        RGI rgi2 = rgi;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, rgi2.icon_url);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, rgi2.display);
        protoAdapter.encodeWithTag(protoWriter, 3, rgi2.button_icon_url);
        protoAdapter2.encodeWithTag(protoWriter, 4, rgi2.schema);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, rgi2.event_keyword_id);
        protoAdapter2.encodeWithTag(protoWriter, 6, rgi2.event_keyword);
        protoAdapter2.encodeWithTag(protoWriter, 7, rgi2.event_tracking_param);
        protoWriter.writeBytes(rgi2.unknownFields());
    }
}
