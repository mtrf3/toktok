package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69194RDq extends ProtoAdapter<C69246RFq> {
    public C69194RDq() {
        super(FieldEncoding.LENGTH_DELIMITED, C69246RFq.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69246RFq decode(ProtoReader protoReader) {
        C69246RFq c69246RFq = new C69246RFq();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69246RFq.img_num = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c69246RFq.uri = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69246RFq.img_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69246RFq.img_x_size = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c69246RFq.img_y_size = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c69246RFq.img_x_len = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        c69246RFq.img_y_len = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        c69246RFq.duration = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 9:
                        c69246RFq.interval = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 10:
                        c69246RFq.fext = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69246RFq;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69246RFq c69246RFq) {
        C69246RFq c69246RFq2 = c69246RFq;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69246RFq2.img_num);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, c69246RFq2.img_y_len) + protoAdapter.encodedSizeWithTag(6, c69246RFq2.img_x_len) + protoAdapter.encodedSizeWithTag(5, c69246RFq2.img_y_size) + protoAdapter.encodedSizeWithTag(4, c69246RFq2.img_x_size) + protoAdapter2.encodedSizeWithTag(3, c69246RFq2.img_url) + protoAdapter2.encodedSizeWithTag(2, c69246RFq2.uri) + encodedSizeWithTag;
        ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
        return c69246RFq2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(10, c69246RFq2.fext) + protoAdapter3.encodedSizeWithTag(9, c69246RFq2.interval) + protoAdapter3.encodedSizeWithTag(8, c69246RFq2.duration) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69246RFq c69246RFq) {
    }
}
