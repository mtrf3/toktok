package com.google.gson.internal;

import X.AbstractC37304EkW;
import X.C1DH;
import X.C73030SlO;
import X.OHZ;
import X.TCM;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* loaded from: classes12.dex */
public final class e {
    public final Map<Type, com.google.gson.f<?>> LIZ;
    public final AbstractC37304EkW LIZIZ = AbstractC37304EkW.LIZ;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes12.dex */
    public final class a<T> implements n<T> {
        public final /* synthetic */ com.google.gson.f LJLIL;

        @Override // com.google.gson.internal.n
        public final T LJI() {
            return (T) this.LJLIL.LIZ();
        }

        public a(com.google.gson.f fVar, Type type) {
            this.LJLIL = fVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes12.dex */
    public final class b<T> implements n<T> {
        public final /* synthetic */ com.google.gson.f LJLIL;

        @Override // com.google.gson.internal.n
        public final T LJI() {
            return (T) this.LJLIL.LIZ();
        }

        public b(com.google.gson.f fVar, Type type) {
            this.LJLIL = fVar;
        }
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public e(Map<Type, com.google.gson.f<?>> map) {
        this.LIZ = map;
    }

    public final <T> n<T> LIZ(TypeToken<T> typeToken) {
        f fVar;
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        com.google.gson.f<?> fVar2 = this.LIZ.get(type);
        if (fVar2 != null) {
            return new a(fVar2, type);
        }
        com.google.gson.f<?> fVar3 = this.LIZ.get(rawType);
        if (fVar3 != null) {
            return new b(fVar3, type);
        }
        n<T> nVar = null;
        try {
            Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.LIZIZ.LIZ(declaredConstructor);
            }
            fVar = new f(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            fVar = null;
        }
        if (fVar != null) {
            return fVar;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                nVar = new C1DH();
            } else if (EnumSet.class.isAssignableFrom(rawType)) {
                nVar = new g(type);
            } else if (Set.class.isAssignableFrom(rawType)) {
                nVar = new h();
            } else if (Queue.class.isAssignableFrom(rawType)) {
                nVar = new TCM();
            } else {
                nVar = new i();
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                nVar = new j();
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                nVar = new OHZ();
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                nVar = new com.google.gson.internal.b();
            } else if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                nVar = new C73030SlO();
            } else {
                nVar = new c();
            }
        }
        if (nVar != null) {
            return nVar;
        }
        return new d(rawType, type);
    }
}
