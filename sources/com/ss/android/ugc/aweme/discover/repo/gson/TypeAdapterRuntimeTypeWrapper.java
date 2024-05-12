package com.ss.android.ugc.aweme.discover.repo.gson;

import X.C65385PlN;
import X.C65403Plf;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes12.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
    public final Gson LIZ;
    public final TypeAdapter<T> LIZIZ;
    public final Type LIZJ;

    @Override // com.google.gson.TypeAdapter
    public final T read(C65385PlN c65385PlN) {
        return this.LIZIZ.read(c65385PlN);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, T t) {
        TypeAdapter<T> typeAdapter = this.LIZIZ;
        Type type = this.LIZJ;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.LIZJ) {
            typeAdapter = this.LIZ.LJIIIZ(TypeToken.get(type));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = this.LIZIZ;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.write(c65403Plf, t);
    }

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
        this.LIZJ = type;
    }
}
