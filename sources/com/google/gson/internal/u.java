package com.google.gson.internal;

import X.AnonymousClass028;
import X.X1D;
import java.lang.reflect.Modifier;

/* loaded from: classes7.dex */
public abstract class u {
    public abstract <T> T LIZIZ(Class<T> cls);

    public static void LIZ(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            throw new UnsupportedOperationException(AnonymousClass028.LIZLLL(LIZ, "Abstract class can't be instantiated! Class name: ", cls, LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        throw new UnsupportedOperationException(AnonymousClass028.LIZLLL(LIZ2, "Interface can't be instantiated! Interface name: ", cls, LIZ2));
    }
}
