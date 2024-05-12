package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REK extends ProtoAdapter<RGZ> {
    public REK() {
        super(FieldEncoding.LENGTH_DELIMITED, RGZ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGZ decode(ProtoReader protoReader) {
        RGZ rgz = new RGZ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgz.sticker_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rgz.link = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rgz.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rgz.sticker_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rgz.icon_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        rgz.open_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGZ rgz) {
        RGZ rgz2 = rgz;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, rgz2.sticker_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rgz2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, rgz2.open_url) + REV.ADAPTER.encodedSizeWithTag(5, rgz2.icon_url) + protoAdapter.encodedSizeWithTag(4, rgz2.sticker_id) + protoAdapter.encodedSizeWithTag(3, rgz2.title) + protoAdapter.encodedSizeWithTag(2, rgz2.link) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGZ rgz) {
        RGZ rgz2 = rgz;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rgz2.sticker_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rgz2.link);
        protoAdapter.encodeWithTag(protoWriter, 3, rgz2.title);
        protoAdapter.encodeWithTag(protoWriter, 4, rgz2.sticker_id);
        REV.ADAPTER.encodeWithTag(protoWriter, 5, rgz2.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 6, rgz2.open_url);
        protoWriter.writeBytes(rgz2.unknownFields());
    }
}
