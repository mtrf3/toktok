package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.repo;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.a;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.ss.android.ugc.aweme.search.common.ui.TypeAdapterRuntimeTypeWrapper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class SearchMixFeedCollectionTypeAdapterFactory implements u {
    public static boolean LJLIL;

    /* loaded from: classes12.dex */
    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        public final TypeAdapterRuntimeTypeWrapper LIZ;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object read(C65385PlN c65385PlN) {
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            c65385PlN.LIZ();
            boolean z = SearchMixFeedCollectionTypeAdapterFactory.LJLIL;
            boolean z2 = false;
            int i = 3;
            while (c65385PlN.LJIIJJI()) {
                if (z && z2 && arrayList.size() >= i) {
                    c65385PlN.LJJJJ();
                } else {
                    T read = this.LIZ.read(c65385PlN);
                    if (read instanceof SearchMixFeed) {
                        SearchMixFeed searchMixFeed = (SearchMixFeed) read;
                        if (arrayList.isEmpty() && searchMixFeed.getFeedType() == 65280) {
                            i = 4;
                        }
                        if (z && arrayList.size() == i - 1 && c65385PlN.LJIIJJI()) {
                            searchMixFeed.LJLJL = true;
                        }
                        z2 = true;
                    }
                    arrayList.add(read);
                }
            }
            c65385PlN.LJ();
            if (arrayList.isEmpty()) {
                return arrayList;
            }
            Iterator<E> it = arrayList.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (next instanceof SearchMixFeed) {
                    next.getClass();
                }
            }
            return arrayList;
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

        public Adapter(Gson gson, TypeAdapter typeAdapter, Type type) {
            this.LIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
        }
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type LIZLLL = a.LIZLLL(type, rawType);
        if (!SearchMixFeed.class.equals(LIZLLL)) {
            return null;
        }
        return new Adapter(gson, gson.LJIIIZ(TypeToken.get(LIZLLL)), LIZLLL);
    }
}
