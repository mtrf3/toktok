package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDB extends ProtoAdapter<RED> {
    public RDB() {
        super(FieldEncoding.LENGTH_DELIMITED, RED.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RED decode(ProtoReader protoReader) {
        RED red = new RED();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        red.img_num = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        red.uri = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        red.img_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        red.img_x_size = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        red.img_y_size = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        red.img_x_len = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        red.img_y_len = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        red.duration = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 9:
                        red.interval = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 10:
                        red.fext = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        red.img_uris.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 12:
                        red.img_urls.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return red;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RED red) {
        RED red2 = red;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, red2.img_num);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, red2.img_y_len) + protoAdapter.encodedSizeWithTag(6, red2.img_x_len) + protoAdapter.encodedSizeWithTag(5, red2.img_y_size) + protoAdapter.encodedSizeWithTag(4, red2.img_x_size) + protoAdapter2.encodedSizeWithTag(3, red2.img_url) + protoAdapter2.encodedSizeWithTag(2, red2.uri) + encodedSizeWithTag;
        ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
        return red2.unknownFields().size() + protoAdapter2.asRepeated().encodedSizeWithTag(12, red2.img_urls) + protoAdapter2.asRepeated().encodedSizeWithTag(11, red2.img_uris) + protoAdapter2.encodedSizeWithTag(10, red2.fext) + protoAdapter3.encodedSizeWithTag(9, red2.interval) + protoAdapter3.encodedSizeWithTag(8, red2.duration) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RED red) {
        RED red2 = red;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, red2.img_num);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, red2.uri);
        protoAdapter2.encodeWithTag(protoWriter, 3, red2.img_url);
        protoAdapter.encodeWithTag(protoWriter, 4, red2.img_x_size);
        protoAdapter.encodeWithTag(protoWriter, 5, red2.img_y_size);
        protoAdapter.encodeWithTag(protoWriter, 6, red2.img_x_len);
        protoAdapter.encodeWithTag(protoWriter, 7, red2.img_y_len);
        ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
        protoAdapter3.encodeWithTag(protoWriter, 8, red2.duration);
        protoAdapter3.encodeWithTag(protoWriter, 9, red2.interval);
        protoAdapter2.encodeWithTag(protoWriter, 10, red2.fext);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 11, red2.img_uris);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 12, red2.img_urls);
        protoWriter.writeBytes(red2.unknownFields());
    }
}
