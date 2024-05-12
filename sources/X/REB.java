package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REB extends ProtoAdapter<RGP> {
    public REB() {
        super(FieldEncoding.LENGTH_DELIMITED, RGP.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGP decode(ProtoReader protoReader) {
        RGP rgp = new RGP();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgp.name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rgp.icon = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rgp.fans_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rgp.open_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rgp.apple_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rgp.download_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rgp.package_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rgp.app_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgp;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGP rgp) {
        RGP rgp2 = rgp;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rgp2.unknownFields().size() + protoAdapter.encodedSizeWithTag(8, rgp2.app_name) + protoAdapter.encodedSizeWithTag(7, rgp2.package_name) + protoAdapter.encodedSizeWithTag(6, rgp2.download_url) + protoAdapter.encodedSizeWithTag(5, rgp2.apple_id) + protoAdapter.encodedSizeWithTag(4, rgp2.open_url) + ProtoAdapter.INT32.encodedSizeWithTag(3, rgp2.fans_count) + protoAdapter.encodedSizeWithTag(2, rgp2.icon) + protoAdapter.encodedSizeWithTag(1, rgp2.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGP rgp) {
        RGP rgp2 = rgp;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rgp2.name);
        protoAdapter.encodeWithTag(protoWriter, 2, rgp2.icon);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, rgp2.fans_count);
        protoAdapter.encodeWithTag(protoWriter, 4, rgp2.open_url);
        protoAdapter.encodeWithTag(protoWriter, 5, rgp2.apple_id);
        protoAdapter.encodeWithTag(protoWriter, 6, rgp2.download_url);
        protoAdapter.encodeWithTag(protoWriter, 7, rgp2.package_name);
        protoAdapter.encodeWithTag(protoWriter, 8, rgp2.app_name);
        protoWriter.writeBytes(rgp2.unknownFields());
    }
}
