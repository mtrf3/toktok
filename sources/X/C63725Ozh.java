package X;

import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63725Ozh extends ProtoAdapter<GetMessageError> {
    public C63725Ozh() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessageError.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetMessageError decode(ProtoReader protoReader) {
        C63726Ozi c63726Ozi = new C63726Ozi();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63726Ozi.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c63726Ozi.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c63726Ozi.LIZLLL = MessageIDIndexEntry.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63726Ozi.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessageError getMessageError) {
        GetMessageError getMessageError2 = getMessageError;
        return getMessageError2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageError2.status_code) + MessageIDIndexEntry.ADAPTER.encodedSizeWithTag(1, getMessageError2.entry);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetMessageError getMessageError) {
        GetMessageError getMessageError2 = getMessageError;
        MessageIDIndexEntry.ADAPTER.encodeWithTag(protoWriter, 1, getMessageError2.entry);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageError2.status_code);
        protoWriter.writeBytes(getMessageError2.unknownFields());
    }
}
