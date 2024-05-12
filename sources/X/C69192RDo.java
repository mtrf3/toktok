package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69192RDo extends ProtoAdapter<C69234RFe> {
    public C69192RDo() {
        super(FieldEncoding.LENGTH_DELIMITED, C69234RFe.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69234RFe decode(ProtoReader protoReader) {
        C69234RFe c69234RFe = new C69234RFe();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69234RFe.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69234RFe.comment_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69234RFe.digg_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c69234RFe.download_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c69234RFe.play_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c69234RFe.share_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        c69234RFe.forward_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        c69234RFe.lose_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        c69234RFe.lose_comment_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 10:
                        c69234RFe.whatsapp_share_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69234RFe.collect_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69234RFe;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69234RFe c69234RFe) {
        C69234RFe c69234RFe2 = c69234RFe;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c69234RFe2.aweme_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, c69234RFe2.forward_count) + protoAdapter.encodedSizeWithTag(6, c69234RFe2.share_count) + protoAdapter.encodedSizeWithTag(5, c69234RFe2.play_count) + protoAdapter.encodedSizeWithTag(4, c69234RFe2.download_count) + protoAdapter.encodedSizeWithTag(3, c69234RFe2.digg_count) + protoAdapter.encodedSizeWithTag(2, c69234RFe2.comment_count) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return c69234RFe2.unknownFields().size() + protoAdapter.encodedSizeWithTag(11, c69234RFe2.collect_count) + protoAdapter.encodedSizeWithTag(10, c69234RFe2.whatsapp_share_count) + protoAdapter2.encodedSizeWithTag(9, c69234RFe2.lose_comment_count) + protoAdapter2.encodedSizeWithTag(8, c69234RFe2.lose_count) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69234RFe c69234RFe) {
        C69234RFe c69234RFe2 = c69234RFe;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c69234RFe2.aweme_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, c69234RFe2.comment_count);
        protoAdapter.encodeWithTag(protoWriter, 3, c69234RFe2.digg_count);
        protoAdapter.encodeWithTag(protoWriter, 4, c69234RFe2.download_count);
        protoAdapter.encodeWithTag(protoWriter, 5, c69234RFe2.play_count);
        protoAdapter.encodeWithTag(protoWriter, 6, c69234RFe2.share_count);
        protoAdapter.encodeWithTag(protoWriter, 7, c69234RFe2.forward_count);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 8, c69234RFe2.lose_count);
        protoAdapter2.encodeWithTag(protoWriter, 9, c69234RFe2.lose_comment_count);
        protoAdapter.encodeWithTag(protoWriter, 10, c69234RFe2.whatsapp_share_count);
        protoAdapter.encodeWithTag(protoWriter, 11, c69234RFe2.collect_count);
        protoWriter.writeBytes(c69234RFe2.unknownFields());
    }
}
