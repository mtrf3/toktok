package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RPa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69490RPa extends ProtoAdapter<C69491RPb> {
    public C69490RPa() {
        super(FieldEncoding.LENGTH_DELIMITED, C69491RPb.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69491RPb decode(ProtoReader protoReader) {
        C69491RPb c69491RPb = new C69491RPb();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69491RPb.id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69491RPb.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69491RPb.sub_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69491RPb.avatar_icon = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        c69491RPb.web_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69491RPb.open_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69491RPb;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69491RPb c69491RPb) {
        C69491RPb c69491RPb2 = c69491RPb;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69491RPb2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, c69491RPb2.open_url) + protoAdapter.encodedSizeWithTag(5, c69491RPb2.web_url) + REV.ADAPTER.encodedSizeWithTag(4, c69491RPb2.avatar_icon) + protoAdapter.encodedSizeWithTag(3, c69491RPb2.sub_title) + protoAdapter.encodedSizeWithTag(2, c69491RPb2.title) + protoAdapter.encodedSizeWithTag(1, c69491RPb2.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69491RPb c69491RPb) {
        C69491RPb c69491RPb2 = c69491RPb;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69491RPb2.id);
        protoAdapter.encodeWithTag(protoWriter, 2, c69491RPb2.title);
        protoAdapter.encodeWithTag(protoWriter, 3, c69491RPb2.sub_title);
        REV.ADAPTER.encodeWithTag(protoWriter, 4, c69491RPb2.avatar_icon);
        protoAdapter.encodeWithTag(protoWriter, 5, c69491RPb2.web_url);
        protoAdapter.encodeWithTag(protoWriter, 6, c69491RPb2.open_url);
        protoWriter.writeBytes(c69491RPb2.unknownFields());
    }
}
