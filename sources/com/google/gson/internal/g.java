package com.google.gson.internal;

import X.X1D;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* loaded from: classes12.dex */
public final class g implements n<Object> {
    public final /* synthetic */ Type LJLIL;

    @Override // com.google.gson.internal.n
    public final Object LJI() {
        Type type = this.LJLIL;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid EnumSet type: ");
            LIZ.append(this.LJLIL.toString());
            throw new com.google.gson.k(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Invalid EnumSet type: ");
        LIZ2.append(this.LJLIL.toString());
        throw new com.google.gson.k(X1D.LIZIZ(LIZ2));
    }

    public g(Type type) {
        this.LJLIL = type;
    }
}
