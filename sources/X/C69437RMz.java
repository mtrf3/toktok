package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RMz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69437RMz extends ProtoAdapter<RN0> {
    public C69437RMz() {
        super(FieldEncoding.LENGTH_DELIMITED, RN0.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RN0 decode(ProtoReader protoReader) {
        RN0 rn0 = new RN0();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rn0.share_story_post_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rn0.is_visible = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rn0;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RN0 rn0) {
        RN0 rn02 = rn0;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rn02.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rn02.share_story_post_type) + protoAdapter.encodedSizeWithTag(1, rn02.is_visible);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RN0 rn0) {
        RN0 rn02 = rn0;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rn02.is_visible);
        protoAdapter.encodeWithTag(protoWriter, 2, rn02.share_story_post_type);
        protoWriter.writeBytes(rn02.unknownFields());
    }
}
