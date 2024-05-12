package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RQn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69529RQn extends ProtoAdapter<C69530RQo> {
    public C69529RQn() {
        super(FieldEncoding.LENGTH_DELIMITED, C69530RQo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69530RQo decode(ProtoReader protoReader) {
        C69531RQp c69531RQp = new C69531RQp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                c69531RQp.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return c69531RQp.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69530RQo c69530RQo) {
        return c69530RQo.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69530RQo c69530RQo) {
    }
}
