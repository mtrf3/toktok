package X;

import com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody;
import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ow1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63497Ow1 extends ProtoAdapter<ModifyMessagePropertyRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ModifyMessagePropertyRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63497Ow1() {
        super(FieldEncoding.LENGTH_DELIMITED, ModifyMessagePropertyRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
        ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody2 = modifyMessagePropertyRequestBody;
        return modifyMessagePropertyRequestBody2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, modifyMessagePropertyRequestBody2.ticket) + ModifyPropertyBody.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyRequestBody2.property_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
        ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody2 = modifyMessagePropertyRequestBody;
        ModifyPropertyBody.ADAPTER.encodeWithTag(protoWriter, 1, modifyMessagePropertyRequestBody2.property_list);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifyMessagePropertyRequestBody2.ticket);
        protoWriter.writeBytes(modifyMessagePropertyRequestBody2.unknownFields());
    }
}
