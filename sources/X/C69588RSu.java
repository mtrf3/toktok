package X;

import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69588RSu extends ProtoAdapter<SecUidPair> {
    public C69588RSu() {
        super(FieldEncoding.LENGTH_DELIMITED, SecUidPair.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final SecUidPair decode(ProtoReader protoReader) {
        C69589RSv c69589RSv = new C69589RSv();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69589RSv.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c69589RSv.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69589RSv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69589RSv.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SecUidPair secUidPair) {
        SecUidPair secUidPair2 = secUidPair;
        return secUidPair2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, secUidPair2.sec_uid) + ProtoAdapter.INT64.encodedSizeWithTag(1, secUidPair2.uid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, SecUidPair secUidPair) {
        SecUidPair secUidPair2 = secUidPair;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, secUidPair2.uid);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, secUidPair2.sec_uid);
        protoWriter.writeBytes(secUidPair2.unknownFields());
    }
}
