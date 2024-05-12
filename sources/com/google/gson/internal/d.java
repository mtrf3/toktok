package com.google.gson.internal;

import X.X1D;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class d implements n<Object> {
    public final u LJLIL;
    public final /* synthetic */ Class LJLILLLLZI;
    public final /* synthetic */ Type LJLJI;

    @Override // com.google.gson.internal.n
    public final Object LJI() {
        try {
            return this.LJLIL.LIZIZ(this.LJLILLLLZI);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to invoke no-args constructor for ");
            LIZ.append(this.LJLJI);
            LIZ.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(X1D.LIZIZ(LIZ), e);
        }
    }

    public d(Class cls, Type type) {
        u tVar;
        this.LJLILLLLZI = cls;
        this.LJLJI = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            tVar = new q(declaredField.get(null), cls2.getMethod("allocateInstance", Class.class));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    tVar = new r(intValue, declaredMethod2);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    tVar = new s(declaredMethod3);
                }
            } catch (Exception unused3) {
                tVar = new t();
            }
        }
        this.LJLIL = tVar;
    }
}
