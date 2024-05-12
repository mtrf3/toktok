package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RKu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69380RKu extends ProtoAdapter<C69381RKv> {
    public C69380RKu() {
        super(FieldEncoding.LENGTH_DELIMITED, C69381RKv.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69381RKv decode(ProtoReader protoReader) {
        C69381RKv c69381RKv = new C69381RKv();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69381RKv.now_creation_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c69381RKv.now_post_camera_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69381RKv.expired_at = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69381RKv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69381RKv c69381RKv) {
        C69381RKv c69381RKv2 = c69381RKv;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c69381RKv2.expired_at);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c69381RKv2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, c69381RKv2.now_creation_type) + protoAdapter.encodedSizeWithTag(2, c69381RKv2.now_post_camera_type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69381RKv c69381RKv) {
        C69381RKv c69381RKv2 = c69381RKv;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c69381RKv2.expired_at);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, c69381RKv2.now_post_camera_type);
        protoAdapter.encodeWithTag(protoWriter, 3, c69381RKv2.now_creation_type);
        protoWriter.writeBytes(c69381RKv2.unknownFields());
    }
}
