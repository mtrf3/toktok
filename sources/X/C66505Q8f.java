package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import tiktok.image.proto.ImageHeader;

/* renamed from: X.Q8f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66505Q8f extends ProtoAdapter<ImageHeader> {
    public C66505Q8f() {
        super(FieldEncoding.LENGTH_DELIMITED, ImageHeader.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ImageHeader decode(ProtoReader protoReader) {
        Q3N q3n = new Q3N();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        q3n.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        q3n.LJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        q3n.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        q3n.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        q3n.LJII = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        q3n.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        q3n.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        q3n.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 9:
                        q3n.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        q3n.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return q3n.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ImageHeader imageHeader) {
        ImageHeader imageHeader2 = imageHeader;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, imageHeader2.network_quality);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(7, imageHeader2.animated_format) + protoAdapter2.encodedSizeWithTag(6, imageHeader2.static_format) + protoAdapter2.encodedSizeWithTag(5, imageHeader2.requestFrom) + ProtoAdapter.INT64.encodedSizeWithTag(4, imageHeader2.memory) + protoAdapter.encodedSizeWithTag(3, imageHeader2.battery) + protoAdapter2.encodedSizeWithTag(2, imageHeader2.network_type) + encodedSizeWithTag;
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        return imageHeader2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(9, imageHeader2.supportMultiBitrate) + protoAdapter3.encodedSizeWithTag(8, imageHeader2.supportSuperRes) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ImageHeader imageHeader) {
        ImageHeader imageHeader2 = imageHeader;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, imageHeader2.network_quality);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, imageHeader2.network_type);
        protoAdapter.encodeWithTag(protoWriter, 3, imageHeader2.battery);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, imageHeader2.memory);
        protoAdapter2.encodeWithTag(protoWriter, 5, imageHeader2.requestFrom);
        protoAdapter2.encodeWithTag(protoWriter, 6, imageHeader2.static_format);
        protoAdapter2.encodeWithTag(protoWriter, 7, imageHeader2.animated_format);
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 8, imageHeader2.supportSuperRes);
        protoAdapter3.encodeWithTag(protoWriter, 9, imageHeader2.supportMultiBitrate);
        protoWriter.writeBytes(imageHeader2.unknownFields());
    }
}
