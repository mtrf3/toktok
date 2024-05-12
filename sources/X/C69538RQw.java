package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RQw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69538RQw extends ProtoAdapter<C69539RQx> {
    public C69538RQw() {
        super(FieldEncoding.LENGTH_DELIMITED, C69539RQx.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69539RQx decode(ProtoReader protoReader) {
        C69540RQy c69540RQy = new C69540RQy();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                c69540RQy.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return c69540RQy.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69539RQx c69539RQx) {
        return c69539RQx.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69539RQx c69539RQx) {
    }
}
