package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes12.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    public abstract E LIZ(int i);

    public EnumAdapter(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final E decode(ProtoReader protoReader) {
        int readVarint32 = protoReader.readVarint32();
        E LIZ = LIZ(readVarint32);
        if (LIZ != null) {
            return LIZ;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, this.LIZIZ);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(E e) {
        return ProtoWriter.LIZ(e.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, E e) {
        protoWriter.writeVarint32(e.getValue());
    }
}
