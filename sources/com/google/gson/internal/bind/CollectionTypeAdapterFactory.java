package com.google.gson.internal.bind;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.e;
import com.google.gson.internal.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class CollectionTypeAdapterFactory implements u {
    public final e LJLIL;

    /* loaded from: classes12.dex */
    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        public final TypeAdapter<E> LIZ;
        public final n<? extends Collection<E>> LIZIZ;

        @Override // com.google.gson.TypeAdapter
        public final Object read(C65385PlN c65385PlN) {
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
                return null;
            }
            Collection<E> LJI = this.LIZIZ.LJI();
            c65385PlN.LIZ();
            while (c65385PlN.LJIIJJI()) {
                LJI.add(this.LIZ.read(c65385PlN));
            }
            c65385PlN.LJ();
            return LJI;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, Object obj) {
            Collection collection = (Collection) obj;
            if (collection == null) {
                c65403Plf.LJIIJJI();
                return;
            }
            c65403Plf.LIZIZ();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.LIZ.write(c65403Plf, it.next());
            }
            c65403Plf.LJ();
        }

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, n<? extends Collection<E>> nVar) {
            this.LIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.LIZIZ = nVar;
        }
    }

    public CollectionTypeAdapterFactory(e eVar) {
        this.LJLIL = eVar;
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type LIZLLL = com.google.gson.internal.a.LIZLLL(type, rawType);
        return new Adapter(gson, LIZLLL, gson.LJIIIZ(TypeToken.get(LIZLLL)), this.LJLIL.LIZ(typeToken));
    }
}
