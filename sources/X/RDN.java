package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDN extends ProtoAdapter<RFW> {
    public RDN() {
        super(FieldEncoding.LENGTH_DELIMITED, RFW.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFW decode(ProtoReader protoReader) {
        RFW rfw = new RFW();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rfw.question_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        rfw.user_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rfw.item_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        rfw.content = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rfw.username = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rfw.user_avatar = REV.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        rfw.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rfw.invite_share_info = C69199RDv.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        rfw.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rfw.category_meta = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFW rfw) {
        RFW rfw2 = rfw;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, rfw2.item_id) + protoAdapter.encodedSizeWithTag(2, rfw2.user_id) + protoAdapter.encodedSizeWithTag(1, rfw2.question_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rfw2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(10, rfw2.category_meta) + protoAdapter2.encodedSizeWithTag(9, rfw2.extra) + C69199RDv.ADAPTER.encodedSizeWithTag(8, rfw2.invite_share_info) + protoAdapter2.encodedSizeWithTag(7, rfw2.sec_uid) + REV.ADAPTER.encodedSizeWithTag(6, rfw2.user_avatar) + protoAdapter2.encodedSizeWithTag(5, rfw2.username) + protoAdapter2.encodedSizeWithTag(4, rfw2.content) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFW rfw) {
        RFW rfw2 = rfw;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, rfw2.question_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rfw2.user_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rfw2.item_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, rfw2.content);
        protoAdapter2.encodeWithTag(protoWriter, 5, rfw2.username);
        REV.ADAPTER.encodeWithTag(protoWriter, 6, rfw2.user_avatar);
        protoAdapter2.encodeWithTag(protoWriter, 7, rfw2.sec_uid);
        C69199RDv.ADAPTER.encodeWithTag(protoWriter, 8, rfw2.invite_share_info);
        protoAdapter2.encodeWithTag(protoWriter, 9, rfw2.extra);
        protoAdapter2.encodeWithTag(protoWriter, 10, rfw2.category_meta);
        protoWriter.writeBytes(rfw2.unknownFields());
    }
}
