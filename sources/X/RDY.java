package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDY extends ProtoAdapter<C69254RFy> {
    public RDY() {
        super(FieldEncoding.LENGTH_DELIMITED, C69254RFy.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69254RFy decode(ProtoReader protoReader) {
        C69254RFy c69254RFy = new C69254RFy();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69254RFy.aweme_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c69254RFy.comment_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69254RFy.alias_comment_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c69254RFy.user_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69254RFy.comment_msg = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69254RFy.comment_user_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        c69254RFy.user_avatar = REV.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69254RFy.collect_stat = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69254RFy;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69254RFy c69254RFy) {
        C69254RFy c69254RFy2 = c69254RFy;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, c69254RFy2.alias_comment_id) + protoAdapter.encodedSizeWithTag(2, c69254RFy2.comment_id) + protoAdapter.encodedSizeWithTag(1, c69254RFy2.aweme_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return c69254RFy2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(8, c69254RFy2.collect_stat) + REV.ADAPTER.encodedSizeWithTag(7, c69254RFy2.user_avatar) + protoAdapter.encodedSizeWithTag(6, c69254RFy2.comment_user_id) + protoAdapter2.encodedSizeWithTag(5, c69254RFy2.comment_msg) + protoAdapter2.encodedSizeWithTag(4, c69254RFy2.user_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69254RFy c69254RFy) {
        C69254RFy c69254RFy2 = c69254RFy;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, c69254RFy2.aweme_id);
        protoAdapter.encodeWithTag(protoWriter, 2, c69254RFy2.comment_id);
        protoAdapter.encodeWithTag(protoWriter, 3, c69254RFy2.alias_comment_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, c69254RFy2.user_name);
        protoAdapter2.encodeWithTag(protoWriter, 5, c69254RFy2.comment_msg);
        protoAdapter.encodeWithTag(protoWriter, 6, c69254RFy2.comment_user_id);
        REV.ADAPTER.encodeWithTag(protoWriter, 7, c69254RFy2.user_avatar);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, c69254RFy2.collect_stat);
        protoWriter.writeBytes(c69254RFy2.unknownFields());
    }
}
