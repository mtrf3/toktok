package X;

import com.bytedance.scalpel.protos.MethodStack;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYl, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87571YYl extends ProtoAdapter<MethodStack> {
    public C87571YYl() {
        super(FieldEncoding.LENGTH_DELIMITED, MethodStack.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MethodStack decode(ProtoReader protoReader) {
        return new C87572YYm().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MethodStack methodStack) {
        MethodStack methodStack2 = methodStack;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(3, methodStack2.stackType) + protoAdapter.asRepeated().encodedSizeWithTag(2, methodStack2.ids) + protoAdapter.encodedSizeWithTag(1, methodStack2.time);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return methodStack2.unknownFields().size() + protoAdapter2.asRepeated().encodedSizeWithTag(6, methodStack2.nativeStack) + protoAdapter2.asRepeated().encodedSizeWithTag(5, methodStack2.methods) + protoAdapter2.encodedSizeWithTag(4, methodStack2.threadName) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MethodStack methodStack) {
        MethodStack methodStack2 = methodStack;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, methodStack2.time);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, methodStack2.ids);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, methodStack2.stackType);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, methodStack2.threadName);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, methodStack2.methods);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, methodStack2.nativeStack);
        protoWriter.writeBytes(methodStack2.unknownFields());
    }
}
