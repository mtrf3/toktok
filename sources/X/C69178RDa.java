package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69178RDa extends ProtoAdapter<C69244RFo> {
    public C69178RDa() {
        super(FieldEncoding.LENGTH_DELIMITED, C69244RFo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69244RFo decode(ProtoReader protoReader) {
        C69244RFo c69244RFo = new C69244RFo();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69244RFo.comment = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c69244RFo.profile = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c69244RFo.comment_pro = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 4:
                        c69244RFo.profile_pro = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 5:
                        c69244RFo.comment_thres = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 6:
                        c69244RFo.profile_thres = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 7:
                        c69244RFo.comment_median_time = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 8:
                        c69244RFo.profile_median_time = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 9:
                        c69244RFo.model_v2 = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 10:
                        c69244RFo.predict_config = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69244RFo;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69244RFo c69244RFo) {
        C69244RFo c69244RFo2 = c69244RFo;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69244RFo2.profile) + protoAdapter.encodedSizeWithTag(1, c69244RFo2.comment);
        ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
        return c69244RFo2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(10, c69244RFo2.predict_config) + protoAdapter.encodedSizeWithTag(9, c69244RFo2.model_v2) + protoAdapter2.encodedSizeWithTag(8, c69244RFo2.profile_median_time) + protoAdapter2.encodedSizeWithTag(7, c69244RFo2.comment_median_time) + protoAdapter2.encodedSizeWithTag(6, c69244RFo2.profile_thres) + protoAdapter2.encodedSizeWithTag(5, c69244RFo2.comment_thres) + protoAdapter2.encodedSizeWithTag(4, c69244RFo2.profile_pro) + protoAdapter2.encodedSizeWithTag(3, c69244RFo2.comment_pro) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69244RFo c69244RFo) {
        C69244RFo c69244RFo2 = c69244RFo;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69244RFo2.comment);
        protoAdapter.encodeWithTag(protoWriter, 2, c69244RFo2.profile);
        ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69244RFo2.comment_pro);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69244RFo2.profile_pro);
        protoAdapter2.encodeWithTag(protoWriter, 5, c69244RFo2.comment_thres);
        protoAdapter2.encodeWithTag(protoWriter, 6, c69244RFo2.profile_thres);
        protoAdapter2.encodeWithTag(protoWriter, 7, c69244RFo2.comment_median_time);
        protoAdapter2.encodeWithTag(protoWriter, 8, c69244RFo2.profile_median_time);
        protoAdapter.encodeWithTag(protoWriter, 9, c69244RFo2.model_v2);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, c69244RFo2.predict_config);
        protoWriter.writeBytes(c69244RFo2.unknownFields());
    }
}
