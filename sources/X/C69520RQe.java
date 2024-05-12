package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RQe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69520RQe extends ProtoAdapter<C69521RQf> {
    public C69520RQe() {
        super(FieldEncoding.LENGTH_DELIMITED, C69521RQf.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69521RQf decode(ProtoReader protoReader) {
        C69522RQg c69522RQg = new C69522RQg();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                c69522RQg.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return c69522RQg.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69521RQf c69521RQf) {
        return c69521RQf.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69521RQf c69521RQf) {
    }
}
