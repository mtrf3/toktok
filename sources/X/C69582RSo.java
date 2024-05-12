package X;

import com.bytedance.im.core.proto.GetMessageByKeyError;
import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69582RSo extends ProtoAdapter<GetMessageByKeyError> {
    public C69582RSo() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessageByKeyError.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetMessageByKeyError decode(ProtoReader protoReader) {
        C69583RSp c69583RSp = new C69583RSp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69583RSp.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c69583RSp.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69583RSp.LIZLLL = MessageKey.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69583RSp.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessageByKeyError getMessageByKeyError) {
        GetMessageByKeyError getMessageByKeyError2 = getMessageByKeyError;
        return getMessageByKeyError2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageByKeyError2.status_code) + MessageKey.ADAPTER.encodedSizeWithTag(1, getMessageByKeyError2.key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetMessageByKeyError getMessageByKeyError) {
        GetMessageByKeyError getMessageByKeyError2 = getMessageByKeyError;
        MessageKey.ADAPTER.encodeWithTag(protoWriter, 1, getMessageByKeyError2.key);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageByKeyError2.status_code);
        protoWriter.writeBytes(getMessageByKeyError2.unknownFields());
    }
}
