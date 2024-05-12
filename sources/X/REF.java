package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REF extends ProtoAdapter<RGV> {
    public REF() {
        super(FieldEncoding.LENGTH_DELIMITED, RGV.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGV decode(ProtoReader protoReader) {
        RGV rgv = new RGV();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgv.commerce_sticker_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        rgv.icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        rgv.letters = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rgv.open_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rgv.web_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rgv.web_url_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGV rgv) {
        RGV rgv2 = rgv;
        int encodedSizeWithTag = REV.ADAPTER.encodedSizeWithTag(2, rgv2.icon_url) + ProtoAdapter.INT64.encodedSizeWithTag(1, rgv2.commerce_sticker_id);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rgv2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, rgv2.web_url_title) + protoAdapter.encodedSizeWithTag(5, rgv2.web_url) + protoAdapter.encodedSizeWithTag(4, rgv2.open_url) + protoAdapter.encodedSizeWithTag(3, rgv2.letters) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGV rgv) {
        RGV rgv2 = rgv;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, rgv2.commerce_sticker_id);
        REV.ADAPTER.encodeWithTag(protoWriter, 2, rgv2.icon_url);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, rgv2.letters);
        protoAdapter.encodeWithTag(protoWriter, 4, rgv2.open_url);
        protoAdapter.encodeWithTag(protoWriter, 5, rgv2.web_url);
        protoAdapter.encodeWithTag(protoWriter, 6, rgv2.web_url_title);
        protoWriter.writeBytes(rgv2.unknownFields());
    }
}
