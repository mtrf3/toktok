package com.google.gson.internal.bind;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
    public static final u LIZJ = new u() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.u
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Type genericComponentType;
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType)) {
                if (!(type instanceof Class) || !((Class) type).isArray()) {
                    return null;
                }
                genericComponentType = ((Class) type).getComponentType();
            } else {
                genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            }
            return new ArrayTypeAdapter(gson, gson.LJIIIZ(TypeToken.get(genericComponentType)), com.google.gson.internal.a.LJFF(genericComponentType));
        }
    };
    public final Class<E> LIZ;
    public final TypeAdapter<E> LIZIZ;

    @Override // com.google.gson.TypeAdapter
    public final Object read(C65385PlN c65385PlN) {
        if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
            c65385PlN.LJJIIJ();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c65385PlN.LIZ();
        while (c65385PlN.LJIIJJI()) {
            arrayList.add(this.LIZIZ.read(c65385PlN));
        }
        c65385PlN.LJ();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.LIZ, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, Object obj) {
        if (obj == null) {
            c65403Plf.LJIIJJI();
            return;
        }
        c65403Plf.LIZIZ();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.LIZIZ.write(c65403Plf, Array.get(obj, i));
        }
        c65403Plf.LJ();
    }

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.LIZIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.LIZ = cls;
    }
}
