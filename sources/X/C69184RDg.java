package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69184RDg extends ProtoAdapter<RFT> {
    public C69184RDg() {
        super(FieldEncoding.LENGTH_DELIMITED, RFT.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFT decode(ProtoReader protoReader) {
        RFT rft = new RFT();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rft.vote_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        rft.ref_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rft.ref_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rft.question = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rft.options.add(RH7.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        rft.select_option_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rft;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFT rft) {
        RFT rft2 = rft;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return rft2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, rft2.select_option_id) + RH7.ADAPTER.asRepeated().encodedSizeWithTag(5, rft2.options) + ProtoAdapter.STRING.encodedSizeWithTag(4, rft2.question) + ProtoAdapter.INT32.encodedSizeWithTag(3, rft2.ref_type) + protoAdapter.encodedSizeWithTag(2, rft2.ref_id) + protoAdapter.encodedSizeWithTag(1, rft2.vote_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFT rft) {
        RFT rft2 = rft;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, rft2.vote_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rft2.ref_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, rft2.ref_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, rft2.question);
        RH7.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, rft2.options);
        protoAdapter.encodeWithTag(protoWriter, 6, rft2.select_option_id);
        protoWriter.writeBytes(rft2.unknownFields());
    }
}
