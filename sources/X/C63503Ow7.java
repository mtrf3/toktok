package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ow7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63503Ow7 extends ProtoAdapter<C63502Ow6> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ C63502Ow6 decode(ProtoReader protoReader) {
        return null;
    }

    public C63503Ow7() {
        super(FieldEncoding.LENGTH_DELIMITED, C63502Ow6.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C63502Ow6 c63502Ow6) {
        return c63502Ow6.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C63502Ow6 c63502Ow6) {
        protoWriter.writeBytes(c63502Ow6.unknownFields());
    }
}
