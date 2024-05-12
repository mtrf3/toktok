package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ow4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63500Ow4 extends ProtoAdapter<C63499Ow3> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ C63499Ow3 decode(ProtoReader protoReader) {
        return null;
    }

    public C63500Ow4() {
        super(FieldEncoding.LENGTH_DELIMITED, C63499Ow3.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C63499Ow3 c63499Ow3) {
        return c63499Ow3.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C63499Ow3 c63499Ow3) {
        protoWriter.writeBytes(c63499Ow3.unknownFields());
    }
}
