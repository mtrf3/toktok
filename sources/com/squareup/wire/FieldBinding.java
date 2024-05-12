package com.squareup.wire;

import X.C03880Dg;
import X.C65300Pk0;
import X.X1D;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> {
    public final String LIZ;
    public final String LIZIZ;
    public final Field LIZJ;
    public final Field LIZLLL;
    public final Method LJ;
    public ProtoAdapter<?> LJFF;
    public ProtoAdapter<?> LJI;
    public ProtoAdapter<Object> LJII;
    public final WireField.Label label;
    public final String name;
    public final boolean redacted;
    public final int tag;

    public static void LIZIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "407937481878708492")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public final ProtoAdapter<Object> LIZ() {
        ProtoAdapter<Object> protoAdapter = this.LJII;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        if (!this.LIZ.isEmpty()) {
            ProtoAdapter<?> protoAdapter2 = this.LJI;
            if (protoAdapter2 == null) {
                protoAdapter2 = ProtoAdapter.get(this.LIZ);
                this.LJI = protoAdapter2;
            }
            ProtoAdapter<Object> newMapAdapter = ProtoAdapter.newMapAdapter(protoAdapter2, LJ());
            this.LJII = newMapAdapter;
            return newMapAdapter;
        }
        ProtoAdapter<?> LJ = LJ();
        WireField.Label label = this.label;
        LJ.getClass();
        if (label.LIZJ()) {
            if (label == WireField.Label.PACKED) {
                LJ = LJ.asPacked();
            } else {
                LJ = LJ.asRepeated();
            }
        }
        this.LJII = LJ;
        return LJ;
    }

    public final ProtoAdapter<?> LJ() {
        ProtoAdapter<?> protoAdapter = this.LJFF;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.LIZIZ);
        this.LJFF = protoAdapter2;
        return protoAdapter2;
    }

    public final Object LIZJ(B b) {
        try {
            return this.LIZLLL.get(b);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public final void LIZLLL(B b, Object obj) {
        try {
            WireField.Label label = this.label;
            label.getClass();
            if (label == WireField.Label.ONE_OF) {
                LIZIZ(b, this.LJ, new Object[]{obj});
            } else {
                this.LIZLLL.set(b, obj);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    public FieldBinding(WireField wireField, Field field, Class<B> cls) {
        this.label = wireField.label();
        String name = field.getName();
        this.name = name;
        this.tag = wireField.tag();
        this.LIZ = wireField.keyAdapter();
        this.LIZIZ = wireField.adapter();
        this.redacted = wireField.redacted();
        this.LIZJ = field;
        try {
            this.LIZLLL = cls.getField(name);
            Class<?> type = field.getType();
            try {
                this.LJ = cls.getMethod(name, type);
            } catch (NoSuchMethodException unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("No builder method ");
                LIZ.append(cls.getName());
                LIZ.append(".");
                LIZ.append(name);
                LIZ.append("(");
                LIZ.append(type.getName());
                LIZ.append(")");
                throw new AssertionError(X1D.LIZIZ(LIZ));
            }
        } catch (NoSuchFieldException unused2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("No builder field ");
            LIZ2.append(cls.getName());
            LIZ2.append(".");
            LIZ2.append(name);
            throw new AssertionError(X1D.LIZIZ(LIZ2));
        }
    }
}
