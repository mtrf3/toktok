package X;

import com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OzY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63716OzY extends ProtoAdapter<ModifyMessagePropertyResponseBody> {
    public C63716OzY() {
        super(FieldEncoding.LENGTH_DELIMITED, ModifyMessagePropertyResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ModifyMessagePropertyResponseBody decode(ProtoReader protoReader) {
        C63717OzZ c63717OzZ = new C63717OzZ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63717OzZ.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c63717OzZ.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    try {
                        c63717OzZ.LIZLLL = EnumC63233Orl.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        c63717OzZ.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63717OzZ.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
        ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody2 = modifyMessagePropertyResponseBody;
        return modifyMessagePropertyResponseBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(2, modifyMessagePropertyResponseBody2.version) + EnumC63233Orl.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyResponseBody2.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
    }
}
