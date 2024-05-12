package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RE8 extends ProtoAdapter<RGL> {
    public RE8() {
        super(FieldEncoding.LENGTH_DELIMITED, RGL.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGL decode(ProtoReader protoReader) {
        RGL rgl = new RGL();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgl.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rgl.end_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rgl.subscribe_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        rgl.is_subscribed = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 5:
                        rgl.text_to_be_subscribed = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rgl.text_already_subscribed = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rgl.text_already_ended = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgl;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGL rgl) {
        RGL rgl2 = rgl;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rgl2.title);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return rgl2.unknownFields().size() + protoAdapter.encodedSizeWithTag(7, rgl2.text_already_ended) + protoAdapter.encodedSizeWithTag(6, rgl2.text_already_subscribed) + protoAdapter.encodedSizeWithTag(5, rgl2.text_to_be_subscribed) + ProtoAdapter.BOOL.encodedSizeWithTag(4, rgl2.is_subscribed) + protoAdapter2.encodedSizeWithTag(3, rgl2.subscribe_count) + protoAdapter2.encodedSizeWithTag(2, rgl2.end_time) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGL rgl) {
        RGL rgl2 = rgl;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rgl2.title);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, rgl2.end_time);
        protoAdapter2.encodeWithTag(protoWriter, 3, rgl2.subscribe_count);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, rgl2.is_subscribed);
        protoAdapter.encodeWithTag(protoWriter, 5, rgl2.text_to_be_subscribed);
        protoAdapter.encodeWithTag(protoWriter, 6, rgl2.text_already_subscribed);
        protoAdapter.encodeWithTag(protoWriter, 7, rgl2.text_already_ended);
        protoWriter.writeBytes(rgl2.unknownFields());
    }
}
