package com.ss.android.ugc.aweme.discover.repo.gson;

import X.C16880lQ;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.a;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.u;
import com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class TrendingTopicListTypeAdapterFactory implements u {

    /* loaded from: classes12.dex */
    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        public final TypeAdapter<E> LIZ;
        public final Boolean LIZIZ = Boolean.FALSE;
        public final int LIZJ;

        @Override // com.google.gson.TypeAdapter
        public final Object read(C65385PlN c65385PlN) {
            System.currentTimeMillis();
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            c65385PlN.LIZ();
            Boolean bool = Boolean.FALSE;
            int i = 0;
            if (this.LIZIZ.booleanValue()) {
                while (c65385PlN.LJIIJJI()) {
                    int i2 = this.LIZJ;
                    if (i2 == Integer.MAX_VALUE) {
                        c65385PlN.LJJJJ();
                    } else {
                        if (i2 > i) {
                            c65385PlN.LJJJJ();
                            i++;
                        }
                        arrayList.add(this.LIZ.read(c65385PlN));
                    }
                }
            } else {
                E read = this.LIZ.read(c65385PlN);
                if (read instanceof TrendingTopic) {
                    bool = Boolean.TRUE;
                    i = 1;
                }
                arrayList.add(read);
                while (c65385PlN.LJIIJJI()) {
                    if (!bool.booleanValue()) {
                        read = this.LIZ.read(c65385PlN);
                        arrayList.add(read);
                    } else if (this.LIZJ <= i) {
                        c65385PlN.LJJJJ();
                    } else {
                        try {
                            read = this.LIZ.read(c65385PlN);
                            if (i == this.LIZJ - 1 && c65385PlN.LJIIJJI() && (read instanceof LazyDeserializeItem)) {
                                ((LazyDeserializeItem) read).setNeedToBeSupplied(true);
                            }
                        } catch (s e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        arrayList.add(read);
                        i++;
                    }
                }
            }
            c65385PlN.LJ();
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

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter) {
            this.LIZJ = Integer.MAX_VALUE;
            this.LIZJ = 0;
            this.LIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
        }
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        System.currentTimeMillis();
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type LIZLLL = a.LIZLLL(type, rawType);
        if (!TrendingTopic.class.equals(LIZLLL)) {
            return null;
        }
        return new Adapter(gson, LIZLLL, gson.LJIIIZ(TypeToken.get(LIZLLL)));
    }
}
