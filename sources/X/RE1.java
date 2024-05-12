package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RE1 extends ProtoAdapter<RFU> {
    public RE1() {
        super(FieldEncoding.LENGTH_DELIMITED, RFU.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RFU decode(ProtoReader protoReader) {
        RFU rfu = new RFU();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rfu.schema = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rfu.schema_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rfu.icons.add(REV.ADAPTER.decode(protoReader));
                        break;
                    case 4:
                        rfu.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rfu.description = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rfu.button_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rfu.button_bg = REV.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rfu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RFU rfu) {
        RFU rfu2 = rfu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, rfu2.schema_desc) + protoAdapter.encodedSizeWithTag(1, rfu2.schema);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        return rfu2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(7, rfu2.button_bg) + protoAdapter.encodedSizeWithTag(6, rfu2.button_desc) + protoAdapter.encodedSizeWithTag(5, rfu2.description) + protoAdapter.encodedSizeWithTag(4, rfu2.title) + protoAdapter2.asRepeated().encodedSizeWithTag(3, rfu2.icons) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RFU rfu) {
        RFU rfu2 = rfu;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rfu2.schema);
        protoAdapter.encodeWithTag(protoWriter, 2, rfu2.schema_desc);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, rfu2.icons);
        protoAdapter.encodeWithTag(protoWriter, 4, rfu2.title);
        protoAdapter.encodeWithTag(protoWriter, 5, rfu2.description);
        protoAdapter.encodeWithTag(protoWriter, 6, rfu2.button_desc);
        protoAdapter2.encodeWithTag(protoWriter, 7, rfu2.button_bg);
        protoWriter.writeBytes(rfu2.unknownFields());
    }
}
