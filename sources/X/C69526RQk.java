package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RQk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69526RQk extends ProtoAdapter<C69527RQl> {
    public C69526RQk() {
        super(FieldEncoding.LENGTH_DELIMITED, C69527RQl.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69527RQl decode(ProtoReader protoReader) {
        C69528RQm c69528RQm = new C69528RQm();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                c69528RQm.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return c69528RQm.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69527RQl c69527RQl) {
        return c69527RQl.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69527RQl c69527RQl) {
    }
}
