package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RE7 extends ProtoAdapter<RGX> {
    public RE7() {
        super(FieldEncoding.LENGTH_DELIMITED, RGX.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGX decode(ProtoReader protoReader) {
        RGX rgx = new RGX();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgx.id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        rgx.item_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rgx.user_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        rgx.username = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rgx.content = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rgx.user_avatar = REV.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgx;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGX rgx) {
        RGX rgx2 = rgx;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, rgx2.user_id) + protoAdapter.encodedSizeWithTag(2, rgx2.item_id) + protoAdapter.encodedSizeWithTag(1, rgx2.id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rgx2.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(6, rgx2.user_avatar) + protoAdapter2.encodedSizeWithTag(5, rgx2.content) + protoAdapter2.encodedSizeWithTag(4, rgx2.username) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGX rgx) {
        RGX rgx2 = rgx;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, rgx2.id);
        protoAdapter.encodeWithTag(protoWriter, 2, rgx2.item_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rgx2.user_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, rgx2.username);
        protoAdapter2.encodeWithTag(protoWriter, 5, rgx2.content);
        REV.ADAPTER.encodeWithTag(protoWriter, 6, rgx2.user_avatar);
        protoWriter.writeBytes(rgx2.unknownFields());
    }
}
