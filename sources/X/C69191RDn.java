package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69191RDn extends ProtoAdapter<C69245RFp> {
    public C69191RDn() {
        super(FieldEncoding.LENGTH_DELIMITED, C69245RFp.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69245RFp decode(ProtoReader protoReader) {
        C69245RFp c69245RFp = new C69245RFp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69245RFp.sentence = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69245RFp.challenge_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69245RFp.search_word = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69245RFp.value = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c69245RFp.vb_rank = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        c69245RFp.vb_rank_value = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        c69245RFp.rank = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        c69245RFp.group_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        c69245RFp.label = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 10:
                        c69245RFp.pattern_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69245RFp;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69245RFp c69245RFp) {
        C69245RFp c69245RFp2 = c69245RFp;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, c69245RFp2.search_word) + protoAdapter.encodedSizeWithTag(2, c69245RFp2.challenge_id) + protoAdapter.encodedSizeWithTag(1, c69245RFp2.sentence);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, c69245RFp2.value) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return c69245RFp2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(10, c69245RFp2.pattern_type) + protoAdapter3.encodedSizeWithTag(9, c69245RFp2.label) + protoAdapter.encodedSizeWithTag(8, c69245RFp2.group_id) + protoAdapter3.encodedSizeWithTag(7, c69245RFp2.rank) + protoAdapter2.encodedSizeWithTag(6, c69245RFp2.vb_rank_value) + protoAdapter3.encodedSizeWithTag(5, c69245RFp2.vb_rank) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69245RFp c69245RFp) {
        C69245RFp c69245RFp2 = c69245RFp;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69245RFp2.sentence);
        protoAdapter.encodeWithTag(protoWriter, 2, c69245RFp2.challenge_id);
        protoAdapter.encodeWithTag(protoWriter, 3, c69245RFp2.search_word);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 4, c69245RFp2.value);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 5, c69245RFp2.vb_rank);
        protoAdapter2.encodeWithTag(protoWriter, 6, c69245RFp2.vb_rank_value);
        protoAdapter3.encodeWithTag(protoWriter, 7, c69245RFp2.rank);
        protoAdapter.encodeWithTag(protoWriter, 8, c69245RFp2.group_id);
        protoAdapter3.encodeWithTag(protoWriter, 9, c69245RFp2.label);
        protoAdapter3.encodeWithTag(protoWriter, 10, c69245RFp2.pattern_type);
        protoWriter.writeBytes(c69245RFp2.unknownFields());
    }
}
