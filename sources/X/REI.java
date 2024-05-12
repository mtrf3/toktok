package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REI extends ProtoAdapter<RGK> {
    public REI() {
        super(FieldEncoding.LENGTH_DELIMITED, RGK.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGK decode(ProtoReader protoReader) {
        RGK rgk = new RGK();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgk.vote = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 2:
                        rgk.warn = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 3:
                        rgk.risk_sink = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 4:
                        rgk.type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        rgk.content = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rgk.notice = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        rgk.url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgk;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGK rgk) {
        RGK rgk2 = rgk;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(4, rgk2.type) + protoAdapter.encodedSizeWithTag(3, rgk2.risk_sink) + protoAdapter.encodedSizeWithTag(2, rgk2.warn) + protoAdapter.encodedSizeWithTag(1, rgk2.vote);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rgk2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(7, rgk2.url) + protoAdapter.encodedSizeWithTag(6, rgk2.notice) + protoAdapter2.encodedSizeWithTag(5, rgk2.content) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGK rgk) {
        RGK rgk2 = rgk;
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, rgk2.vote);
        protoAdapter.encodeWithTag(protoWriter, 2, rgk2.warn);
        protoAdapter.encodeWithTag(protoWriter, 3, rgk2.risk_sink);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, rgk2.type);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 5, rgk2.content);
        protoAdapter.encodeWithTag(protoWriter, 6, rgk2.notice);
        protoAdapter2.encodeWithTag(protoWriter, 7, rgk2.url);
        protoWriter.writeBytes(rgk2.unknownFields());
    }
}
