package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDX extends ProtoAdapter<C69251RFv> {
    public RDX() {
        super(FieldEncoding.LENGTH_DELIMITED, C69251RFv.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69251RFv decode(ProtoReader protoReader) {
        C69251RFv c69251RFv = new C69251RFv();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69251RFv.full_clip_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69251RFv.full_clip_author = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69251RFv.full_clip_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69251RFv.collect_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69251RFv.default_performer_avatar = C69277RGv.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69251RFv.mv_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        c69251RFv.is_show_entrance = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69251RFv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69251RFv c69251RFv) {
        C69251RFv c69251RFv2 = c69251RFv;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69251RFv2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(7, c69251RFv2.is_show_entrance) + ProtoAdapter.INT64.encodedSizeWithTag(6, c69251RFv2.mv_id) + C69277RGv.ADAPTER.encodedSizeWithTag(5, c69251RFv2.default_performer_avatar) + ProtoAdapter.INT32.encodedSizeWithTag(4, c69251RFv2.collect_status) + protoAdapter.encodedSizeWithTag(3, c69251RFv2.full_clip_title) + protoAdapter.encodedSizeWithTag(2, c69251RFv2.full_clip_author) + protoAdapter.encodedSizeWithTag(1, c69251RFv2.full_clip_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69251RFv c69251RFv) {
        C69251RFv c69251RFv2 = c69251RFv;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69251RFv2.full_clip_id);
        protoAdapter.encodeWithTag(protoWriter, 2, c69251RFv2.full_clip_author);
        protoAdapter.encodeWithTag(protoWriter, 3, c69251RFv2.full_clip_title);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c69251RFv2.collect_status);
        C69277RGv.ADAPTER.encodeWithTag(protoWriter, 5, c69251RFv2.default_performer_avatar);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, c69251RFv2.mv_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, c69251RFv2.is_show_entrance);
        protoWriter.writeBytes(c69251RFv2.unknownFields());
    }
}
