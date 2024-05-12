package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RE6 extends ProtoAdapter<RGW> {
    public RE6() {
        super(FieldEncoding.LENGTH_DELIMITED, RGW.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGW decode(ProtoReader protoReader) {
        RGW rgw = new RGW();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgw.background_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rgw.text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rgw.text_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rgw.image = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        rgw.ref_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rgw.label_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGW rgw) {
        RGW rgw2 = rgw;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rgw2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(6, rgw2.label_type) + protoAdapter.encodedSizeWithTag(5, rgw2.ref_url) + REV.ADAPTER.encodedSizeWithTag(4, rgw2.image) + protoAdapter.encodedSizeWithTag(3, rgw2.text_color) + protoAdapter.encodedSizeWithTag(2, rgw2.text) + protoAdapter.encodedSizeWithTag(1, rgw2.background_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGW rgw) {
        RGW rgw2 = rgw;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rgw2.background_color);
        protoAdapter.encodeWithTag(protoWriter, 2, rgw2.text);
        protoAdapter.encodeWithTag(protoWriter, 3, rgw2.text_color);
        REV.ADAPTER.encodeWithTag(protoWriter, 4, rgw2.image);
        protoAdapter.encodeWithTag(protoWriter, 5, rgw2.ref_url);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, rgw2.label_type);
        protoWriter.writeBytes(rgw2.unknownFields());
    }
}
