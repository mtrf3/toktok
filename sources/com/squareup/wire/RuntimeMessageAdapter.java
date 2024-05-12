package com.squareup.wire;

import X.C16880lQ;
import X.C63685Oz3;
import X.X1D;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class RuntimeMessageAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends ProtoAdapter<M> {
    public final Class<M> LJ;
    public final Class<B> LJFF;
    public final Map<Integer, FieldBinding<M, B>> LJI;

    public int hashCode() {
        return this.LJ.hashCode();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader protoReader) {
        ProtoAdapter<?> LJ;
        try {
            B newInstance = this.LJFF.newInstance();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldBinding<M, B> fieldBinding = this.LJI.get(Integer.valueOf(nextTag));
                    if (fieldBinding != null) {
                        try {
                            if (!fieldBinding.LIZ.isEmpty()) {
                                LJ = fieldBinding.LIZ();
                            } else {
                                LJ = fieldBinding.LJ();
                            }
                            Object decode = LJ.decode(protoReader);
                            if (fieldBinding.label.LIZJ()) {
                                ((List) fieldBinding.LIZJ(newInstance)).add(decode);
                            } else if (!fieldBinding.LIZ.isEmpty()) {
                                ((Map) fieldBinding.LIZJ(newInstance)).putAll((Map) decode);
                            } else {
                                fieldBinding.LIZLLL(newInstance, decode);
                            }
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            newInstance.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        newInstance.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return (M) newInstance.build();
                }
            }
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M m) {
        int i = m.cachedSerializedSize;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        for (FieldBinding<M, B> fieldBinding : this.LJI.values()) {
            fieldBinding.getClass();
            try {
                Object obj = fieldBinding.LIZJ.get(m);
                if (obj != null) {
                    i2 += fieldBinding.LIZ().encodedSizeWithTag(fieldBinding.tag, obj);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
        int size = m.unknownFields().size() + i2;
        m.cachedSerializedSize = size;
        return size;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof RuntimeMessageAdapter) && ((RuntimeMessageAdapter) obj).LJ == this.LJ) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M m) {
        Message.Builder<M, B> newBuilder2 = m.newBuilder2();
        for (FieldBinding<M, B> fieldBinding : this.LJI.values()) {
            if (!fieldBinding.redacted || fieldBinding.label != WireField.Label.REQUIRED) {
                boolean isAssignableFrom = Message.class.isAssignableFrom(fieldBinding.LJ().LIZIZ);
                if (!fieldBinding.redacted) {
                    if (isAssignableFrom) {
                        if (fieldBinding.label.LIZJ()) {
                            if (fieldBinding.label.LIZJ()) {
                                C63685Oz3.LJIIIZ((List) fieldBinding.LIZJ(newBuilder2), fieldBinding.LJ());
                            }
                        }
                    }
                }
                Object LIZJ = fieldBinding.LIZJ(newBuilder2);
                if (LIZJ != null) {
                    fieldBinding.LIZLLL(newBuilder2, fieldBinding.LIZ().redact(LIZJ));
                }
            } else {
                throw new UnsupportedOperationException(C16880lQ.LLLZ("Field '%s' in %s is required and cannot be redacted.", new Object[]{fieldBinding.name, this.LIZIZ.getName()}));
            }
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M m) {
        StringBuilder sb = new StringBuilder();
        for (FieldBinding<M, B> fieldBinding : this.LJI.values()) {
            fieldBinding.getClass();
            try {
                Object obj = fieldBinding.LIZJ.get(m);
                if (obj != null) {
                    sb.append(", ");
                    sb.append(fieldBinding.name);
                    sb.append('=');
                    if (fieldBinding.redacted) {
                        obj = "██";
                    }
                    sb.append(obj);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(this.LJ));
        LIZ.append('{');
        sb.replace(0, 2, X1D.LIZIZ(LIZ));
        sb.append('}');
        return sb.toString();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, M m) {
        for (FieldBinding<M, B> fieldBinding : this.LJI.values()) {
            fieldBinding.getClass();
            try {
                Object obj = fieldBinding.LIZJ.get(m);
                if (obj != null) {
                    fieldBinding.LIZ().encodeWithTag(protoWriter, fieldBinding.tag, obj);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
        protoWriter.writeBytes(m.unknownFields());
    }

    public RuntimeMessageAdapter(Class<M> cls, Class<B> cls2, Map<Integer, FieldBinding<M, B>> map) {
        super(FieldEncoding.LENGTH_DELIMITED, cls);
        this.LJ = cls;
        this.LJFF = cls2;
        this.LJI = map;
    }
}
