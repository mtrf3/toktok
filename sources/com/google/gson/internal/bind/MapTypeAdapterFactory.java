package com.google.gson.internal.bind;

import X.AbstractC38911fr;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.X1D;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.e;
import com.google.gson.internal.n;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.u;
import defpackage.b0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes12.dex */
public final class MapTypeAdapterFactory implements u {
    public final e LJLIL;
    public final boolean LJLILLLLZI;

    /* loaded from: classes12.dex */
    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        public final TypeAdapter<K> LIZ;
        public final TypeAdapter<V> LIZIZ;
        public final n<? extends Map<K, V>> LIZJ;

        @Override // com.google.gson.TypeAdapter
        public final Object read(C65385PlN c65385PlN) {
            EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
            if (LJJIJIL == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
                return null;
            }
            Map<K, V> LJI = this.LIZJ.LJI();
            if (LJJIJIL == EnumC65386PlO.BEGIN_ARRAY) {
                c65385PlN.LIZ();
                while (c65385PlN.LJIIJJI()) {
                    c65385PlN.LIZ();
                    K read = this.LIZ.read(c65385PlN);
                    if (LJI.put(read, this.LIZIZ.read(c65385PlN)) == null) {
                        c65385PlN.LJ();
                    } else {
                        throw new s(b0.LIZIZ("duplicate key: ", read));
                    }
                }
                c65385PlN.LJ();
                return LJI;
            }
            c65385PlN.LIZIZ();
            while (c65385PlN.LJIIJJI()) {
                AbstractC38911fr.LJLIL.getClass();
                if (c65385PlN instanceof a) {
                    a aVar = (a) c65385PlN;
                    aVar.LJJJJIZL(EnumC65386PlO.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) aVar.LJJJJJ()).next();
                    aVar.LJJJJL(entry.getValue());
                    aVar.LJJJJL(new p((String) entry.getKey()));
                } else {
                    int i = c65385PlN.LJLJLJ;
                    if (i == 0) {
                        i = c65385PlN.LIZLLL();
                    }
                    if (i == 13) {
                        c65385PlN.LJLJLJ = 9;
                    } else if (i == 12) {
                        c65385PlN.LJLJLJ = 8;
                    } else if (i == 14) {
                        c65385PlN.LJLJLJ = 10;
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Expected a name but was ");
                        LIZ.append(c65385PlN.LJJIJIL());
                        LIZ.append(c65385PlN.LJIILIIL());
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                }
                K read2 = this.LIZ.read(c65385PlN);
                if (LJI.put(read2, this.LIZIZ.read(c65385PlN)) != null) {
                    throw new s(b0.LIZIZ("duplicate key: ", read2));
                }
            }
            c65385PlN.LJFF();
            return LJI;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, Object obj) {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                c65403Plf.LJIIJJI();
                return;
            }
            if (!MapTypeAdapterFactory.this.LJLILLLLZI) {
                c65403Plf.LIZJ();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c65403Plf.LJI(String.valueOf(entry.getKey()));
                    this.LIZIZ.write(c65403Plf, entry.getValue());
                }
                c65403Plf.LJFF();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z2 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                j jsonTree = this.LIZ.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                jsonTree.getClass();
                if ((jsonTree instanceof g) || (jsonTree instanceof m)) {
                    z = true;
                } else {
                    z = false;
                }
                z2 |= z;
            }
            if (z2) {
                c65403Plf.LIZIZ();
                int size = arrayList.size();
                while (i < size) {
                    c65403Plf.LIZIZ();
                    com.google.gson.internal.p.LIZIZ((j) arrayList.get(i), c65403Plf);
                    this.LIZIZ.write(c65403Plf, arrayList2.get(i));
                    c65403Plf.LJ();
                    i++;
                }
                c65403Plf.LJ();
                return;
            }
            c65403Plf.LIZJ();
            int size2 = arrayList.size();
            while (i < size2) {
                j jVar = (j) arrayList.get(i);
                jVar.getClass();
                if (jVar instanceof p) {
                    p LJIJ = jVar.LJIJ();
                    Object obj2 = LJIJ.LJLIL;
                    if (obj2 instanceof Number) {
                        str = String.valueOf(LJIJ.LJIL());
                    } else if (obj2 instanceof Boolean) {
                        str = Boolean.toString(LJIJ.LJFF());
                    } else if (obj2 instanceof String) {
                        str = LJIJ.LJJIFFI();
                    } else {
                        throw new AssertionError();
                    }
                } else if (jVar instanceof l) {
                    str = "null";
                } else {
                    throw new AssertionError();
                }
                c65403Plf.LJI(str);
                this.LIZIZ.write(c65403Plf, arrayList2.get(i));
                i++;
            }
            c65403Plf.LJFF();
        }

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, n<? extends Map<K, V>> nVar) {
            this.LIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.LIZIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.LIZJ = nVar;
        }
    }

    public MapTypeAdapterFactory(e eVar, boolean z) {
        this.LJLIL = eVar;
        this.LJLILLLLZI = z;
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type[] typeArr;
        TypeAdapter<Boolean> typeAdapter;
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Class<?> LJFF = com.google.gson.internal.a.LJFF(type);
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type LJI = com.google.gson.internal.a.LJI(type, LJFF, Map.class);
            if (LJI instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) LJI).getActualTypeArguments();
            } else {
                typeArr = new Type[]{Object.class, Object.class};
            }
        }
        Type type2 = typeArr[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            typeAdapter = TypeAdapters.LIZJ;
        } else {
            typeAdapter = gson.LJIIIZ(TypeToken.get(type2));
        }
        return new Adapter(gson, typeArr[0], typeAdapter, typeArr[1], gson.LJIIIZ(TypeToken.get(typeArr[1])), this.LJLIL.LIZ(typeToken));
    }
}
