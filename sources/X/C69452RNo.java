package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RNo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69452RNo extends ProtoAdapter<C69453RNp> {
    public C69452RNo() {
        super(FieldEncoding.LENGTH_DELIMITED, C69453RNp.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69453RNp decode(ProtoReader protoReader) {
        C69453RNp c69453RNp = new C69453RNp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69453RNp.need_pull_upvote_info = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69453RNp;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69453RNp c69453RNp) {
        C69453RNp c69453RNp2 = c69453RNp;
        return c69453RNp2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(1, c69453RNp2.need_pull_upvote_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69453RNp c69453RNp) {
        C69453RNp c69453RNp2 = c69453RNp;
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c69453RNp2.need_pull_upvote_info);
        protoWriter.writeBytes(c69453RNp2.unknownFields());
    }
}
