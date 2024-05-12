package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RM7 extends ProtoAdapter<RM8> {
    public RM7() {
        super(FieldEncoding.LENGTH_DELIMITED, RM8.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RM8 decode(ProtoReader protoReader) {
        RM8 rm8 = new RM8();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rm8.sid = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        rm8.rtmp_pull_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rm8.rtmp_push_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rm8.provider = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        rm8.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rm8.id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rm8;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RM8 rm8) {
        RM8 rm82 = rm8;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, rm82.sid);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rm82.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, rm82.id) + protoAdapter.encodedSizeWithTag(5, rm82.extra) + ProtoAdapter.INT32.encodedSizeWithTag(4, rm82.provider) + protoAdapter.encodedSizeWithTag(3, rm82.rtmp_push_url) + protoAdapter.encodedSizeWithTag(2, rm82.rtmp_pull_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RM8 rm8) {
        RM8 rm82 = rm8;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, rm82.sid);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rm82.rtmp_pull_url);
        protoAdapter.encodeWithTag(protoWriter, 3, rm82.rtmp_push_url);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, rm82.provider);
        protoAdapter.encodeWithTag(protoWriter, 5, rm82.extra);
        protoAdapter.encodeWithTag(protoWriter, 6, rm82.id);
        protoWriter.writeBytes(rm82.unknownFields());
    }
}
