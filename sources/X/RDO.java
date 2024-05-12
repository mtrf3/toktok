package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDO extends ProtoAdapter<C69253RFx> {
    public RDO() {
        super(FieldEncoding.LENGTH_DELIMITED, C69253RFx.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69253RFx decode(ProtoReader protoReader) {
        C69253RFx c69253RFx = new C69253RFx();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69253RFx.text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69253RFx.start_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69253RFx.end_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 5:
                        c69253RFx.text_size = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        c69253RFx.text_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c69253RFx.bg_color = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c69253RFx.alignment = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        c69253RFx.source_width = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 10:
                        c69253RFx.source_height = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69253RFx;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69253RFx c69253RFx) {
        C69253RFx c69253RFx2 = c69253RFx;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69253RFx2.text);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, c69253RFx2.end_time) + protoAdapter2.encodedSizeWithTag(2, c69253RFx2.start_time) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(8, c69253RFx2.alignment) + protoAdapter.encodedSizeWithTag(7, c69253RFx2.bg_color) + protoAdapter.encodedSizeWithTag(6, c69253RFx2.text_color) + protoAdapter3.encodedSizeWithTag(5, c69253RFx2.text_size) + encodedSizeWithTag2;
        ProtoAdapter<Double> protoAdapter4 = ProtoAdapter.DOUBLE;
        return c69253RFx2.unknownFields().size() + protoAdapter4.encodedSizeWithTag(10, c69253RFx2.source_height) + protoAdapter4.encodedSizeWithTag(9, c69253RFx2.source_width) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69253RFx c69253RFx) {
        C69253RFx c69253RFx2 = c69253RFx;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69253RFx2.text);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, c69253RFx2.start_time);
        protoAdapter2.encodeWithTag(protoWriter, 3, c69253RFx2.end_time);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 5, c69253RFx2.text_size);
        protoAdapter.encodeWithTag(protoWriter, 6, c69253RFx2.text_color);
        protoAdapter.encodeWithTag(protoWriter, 7, c69253RFx2.bg_color);
        protoAdapter3.encodeWithTag(protoWriter, 8, c69253RFx2.alignment);
        ProtoAdapter<Double> protoAdapter4 = ProtoAdapter.DOUBLE;
        protoAdapter4.encodeWithTag(protoWriter, 9, c69253RFx2.source_width);
        protoAdapter4.encodeWithTag(protoWriter, 10, c69253RFx2.source_height);
        protoWriter.writeBytes(c69253RFx2.unknownFields());
    }
}
