package com.google.gson.internal;

import X.X1D;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public final class f implements n<Object> {
    public final /* synthetic */ Constructor LJLIL;

    @Override // com.google.gson.internal.n
    public final Object LJI() {
        try {
            return this.LJLIL.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to invoke ");
            LIZ.append(this.LJLIL);
            LIZ.append(" with no args");
            throw new RuntimeException(X1D.LIZIZ(LIZ), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Failed to invoke ");
            LIZ2.append(this.LJLIL);
            LIZ2.append(" with no args");
            throw new RuntimeException(X1D.LIZIZ(LIZ2), e3.getTargetException());
        }
    }

    public f(Constructor constructor) {
        this.LJLIL = constructor;
    }
}
