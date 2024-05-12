package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDT extends ProtoAdapter<RFJ> {
    public RDT() {
        super(FieldEncoding.LENGTH_DELIMITED, RFJ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFJ decode(ProtoReader protoReader) {
        RFJ rfj = new RFJ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rfj.app_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rfj.app_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rfj.icon = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rfj.orientation = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        rfj.schema = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rfj.state = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        rfj.summary = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        rfj.type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        rfj.description = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rfj.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rfj.card = RL7.ADAPTER.decode(protoReader);
                        break;
                    case 12:
                        rfj.web_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfj;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFJ rfj) {
        RFJ rfj2 = rfj;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, rfj2.icon) + protoAdapter.encodedSizeWithTag(2, rfj2.app_name) + protoAdapter.encodedSizeWithTag(1, rfj2.app_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return rfj2.unknownFields().size() + protoAdapter.encodedSizeWithTag(12, rfj2.web_url) + RL7.ADAPTER.encodedSizeWithTag(11, rfj2.card) + protoAdapter.encodedSizeWithTag(10, rfj2.title) + protoAdapter.encodedSizeWithTag(9, rfj2.description) + protoAdapter2.encodedSizeWithTag(8, rfj2.type) + protoAdapter.encodedSizeWithTag(7, rfj2.summary) + protoAdapter2.encodedSizeWithTag(6, rfj2.state) + protoAdapter.encodedSizeWithTag(5, rfj2.schema) + protoAdapter2.encodedSizeWithTag(4, rfj2.orientation) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFJ rfj) {
        RFJ rfj2 = rfj;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rfj2.app_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rfj2.app_name);
        protoAdapter.encodeWithTag(protoWriter, 3, rfj2.icon);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 4, rfj2.orientation);
        protoAdapter.encodeWithTag(protoWriter, 5, rfj2.schema);
        protoAdapter2.encodeWithTag(protoWriter, 6, rfj2.state);
        protoAdapter.encodeWithTag(protoWriter, 7, rfj2.summary);
        protoAdapter2.encodeWithTag(protoWriter, 8, rfj2.type);
        protoAdapter.encodeWithTag(protoWriter, 9, rfj2.description);
        protoAdapter.encodeWithTag(protoWriter, 10, rfj2.title);
        RL7.ADAPTER.encodeWithTag(protoWriter, 11, rfj2.card);
        protoAdapter.encodeWithTag(protoWriter, 12, rfj2.web_url);
        protoWriter.writeBytes(rfj2.unknownFields());
    }
}
