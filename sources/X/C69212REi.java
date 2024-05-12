package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69212REi extends ProtoAdapter<RGO> {
    public C69212REi() {
        super(FieldEncoding.LENGTH_DELIMITED, RGO.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGO decode(ProtoReader protoReader) {
        RGO rgo = new RGO();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgo.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rgo.image_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rgo.schema = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rgo.type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        rgo.i18n_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rgo.header = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rgo.footer = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rgo.pattern_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgo;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGO rgo) {
        RGO rgo2 = rgo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, rgo2.schema) + protoAdapter.encodedSizeWithTag(2, rgo2.image_url) + protoAdapter.encodedSizeWithTag(1, rgo2.title);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return rgo2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(8, rgo2.pattern_type) + protoAdapter.encodedSizeWithTag(7, rgo2.footer) + protoAdapter.encodedSizeWithTag(6, rgo2.header) + protoAdapter.encodedSizeWithTag(5, rgo2.i18n_title) + protoAdapter2.encodedSizeWithTag(4, rgo2.type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGO rgo) {
        RGO rgo2 = rgo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rgo2.title);
        protoAdapter.encodeWithTag(protoWriter, 2, rgo2.image_url);
        protoAdapter.encodeWithTag(protoWriter, 3, rgo2.schema);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 4, rgo2.type);
        protoAdapter.encodeWithTag(protoWriter, 5, rgo2.i18n_title);
        protoAdapter.encodeWithTag(protoWriter, 6, rgo2.header);
        protoAdapter.encodeWithTag(protoWriter, 7, rgo2.footer);
        protoAdapter2.encodeWithTag(protoWriter, 8, rgo2.pattern_type);
        protoWriter.writeBytes(rgo2.unknownFields());
    }
}
