package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RQh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69523RQh extends ProtoAdapter<C69524RQi> {
    public C69523RQh() {
        super(FieldEncoding.LENGTH_DELIMITED, C69524RQi.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69524RQi decode(ProtoReader protoReader) {
        C69525RQj c69525RQj = new C69525RQj();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                c69525RQj.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return c69525RQj.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69524RQi c69524RQi) {
        return c69524RQi.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69524RQi c69524RQi) {
    }
}
