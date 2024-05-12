package com.google.gson;

import X.C16880lQ;
import X.C38302F1m;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.X1D;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.p;
import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes12.dex */
public final class Gson {
    public static final TypeToken<?> LJIJJLI = TypeToken.get(Object.class);
    public final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> LIZ;
    public final Map<TypeToken<?>, TypeAdapter<?>> LIZIZ;
    public final com.google.gson.internal.e LIZJ;
    public final JsonAdapterAnnotationTypeAdapterFactory LIZLLL;
    public final List<u> LJ;
    public final Excluder LJFF;
    public final d LJI;
    public final Map<Type, f<?>> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final String LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final t LJIJ;
    public final List<u> LJIJI;
    public final List<u> LJIJJ;

    public Gson() {
        this(Excluder.LJLJL, c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, t.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public final String toString() {
        return "{serializeNulls:" + this.LJIIIIZZ + ",factories:" + this.LJ + ",instanceCreators:" + this.LIZJ + "}";
    }

    /* loaded from: classes12.dex */
    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {
        public TypeAdapter<T> LIZ;

        @Override // com.google.gson.TypeAdapter
        public final T read(C65385PlN c65385PlN) {
            TypeAdapter<T> typeAdapter = this.LIZ;
            if (typeAdapter != null) {
                return typeAdapter.read(c65385PlN);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, T t) {
            TypeAdapter<T> typeAdapter = this.LIZ;
            if (typeAdapter != null) {
                typeAdapter.write(c65403Plf, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void LIZIZ(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(d);
        LIZ.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final <T> TypeAdapter<T> LJIIIZ(TypeToken<T> typeToken) {
        Object obj;
        boolean z;
        Map<TypeToken<?>, TypeAdapter<?>> map = this.LIZIZ;
        if (typeToken == null) {
            obj = LJIJJLI;
        } else {
            obj = typeToken;
        }
        TypeAdapter<T> typeAdapter = (TypeAdapter) ((ConcurrentHashMap) map).get(obj);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<TypeToken<?>, FutureTypeAdapter<?>> map2 = this.LIZ.get();
        if (map2 == null) {
            map2 = new HashMap<>();
            this.LIZ.set(map2);
            z = true;
        } else {
            z = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map2.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map2.put(typeToken, futureTypeAdapter2);
            Iterator<u> it = this.LJ.iterator();
            while (it.hasNext()) {
                TypeAdapter<T> create = it.next().create(this, typeToken);
                if (create != null) {
                    if (futureTypeAdapter2.LIZ == null) {
                        futureTypeAdapter2.LIZ = create;
                        ((ConcurrentHashMap) this.LIZIZ).put(typeToken, create);
                        return create;
                    }
                    throw new AssertionError();
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GSON (2.8.5) cannot handle ");
            LIZ.append(typeToken);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        } finally {
            map2.remove(typeToken);
            if (z) {
                this.LIZ.remove();
            }
        }
    }

    public final <T> TypeAdapter<T> LJIIJ(Class<T> cls) {
        return C16880lQ.LLJ(this, TypeToken.get((Class) cls));
    }

    public final C65385PlN LJIIL(Reader reader) {
        C65385PlN c65385PlN = new C65385PlN(reader);
        c65385PlN.LJLILLLLZI = this.LJIILIIL;
        return c65385PlN;
    }

    public final C65403Plf LJIILIIL(Writer writer) {
        if (this.LJIIJ) {
            writer.write(")]}'\n");
        }
        C65403Plf c65403Plf = new C65403Plf(writer);
        if (this.LJIIL) {
            c65403Plf.LJLJJI = "  ";
            c65403Plf.LJLJJL = ": ";
        }
        c65403Plf.LJLJLLL = this.LJIIIIZZ;
        return c65403Plf;
    }

    public final String LJIILJJIL(j jVar) {
        StringWriter stringWriter = new StringWriter();
        LJIIZILJ(jVar, stringWriter);
        return stringWriter.toString();
    }

    public final String LJIILL(Object obj) {
        if (obj == null) {
            return LJIILJJIL(l.LJLIL);
        }
        return LJIILLIIL(obj, obj.getClass());
    }

    public final j LJIJJLI(Object obj) {
        if (obj == null) {
            return l.LJLIL;
        }
        return LJIL(obj, obj.getClass());
    }

    public static void LIZ(C65385PlN c65385PlN, Object obj) {
        if (obj != null) {
            try {
                if (c65385PlN.LJJIJIL() != EnumC65386PlO.END_DOCUMENT) {
                    throw new k("JSON document was not fully consumed.");
                }
            } catch (C38302F1m e) {
                throw new s(e);
            } catch (IOException e2) {
                throw new k(e2);
            }
        }
    }

    public final <T> T LIZJ(j jVar, Class<T> cls) {
        return (T) com.google.gson.internal.o.LIZ(cls).cast(LIZLLL(jVar, cls));
    }

    public final <T> T LIZLLL(j jVar, Type type) {
        if (jVar == null) {
            return null;
        }
        return (T) LJIIIIZZ(new com.google.gson.internal.bind.a(jVar), type);
    }

    public final <T> T LJ(Reader reader, Class<T> cls) {
        C65385PlN LJIIL = LJIIL(reader);
        Object LJIIIIZZ = LJIIIIZZ(LJIIL, cls);
        LIZ(LJIIL, LJIIIIZZ);
        return (T) com.google.gson.internal.o.LIZ(cls).cast(LJIIIIZZ);
    }

    public final <T> T LJFF(Reader reader, Type type) {
        C65385PlN LJIIL = LJIIL(reader);
        T t = (T) LJIIIIZZ(LJIIL, type);
        LIZ(LJIIL, t);
        return t;
    }

    public final <T> T LJI(String str, Class<T> cls) {
        return (T) com.google.gson.internal.o.LIZ(cls).cast(LJII(str, cls));
    }

    public final <T> T LJII(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) LJFF(new StringReader(str), type);
    }

    public final <T> T LJIIIIZZ(C65385PlN c65385PlN, Type type) {
        boolean z = c65385PlN.LJLILLLLZI;
        boolean z2 = true;
        c65385PlN.LJLILLLLZI = true;
        try {
            try {
                try {
                    c65385PlN.LJJIJIL();
                    z2 = false;
                    return (T) C16880lQ.LLJ(this, TypeToken.get(type)).read(c65385PlN);
                } catch (EOFException e) {
                    if (z2) {
                        c65385PlN.LJLILLLLZI = z;
                        return null;
                    }
                    throw new s(e);
                } catch (AssertionError e2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("AssertionError (GSON 2.8.5): ");
                    LIZ.append(e2.getMessage());
                    throw new AssertionError(X1D.LIZIZ(LIZ), e2);
                }
            } catch (IOException e3) {
                throw new s(e3);
            } catch (IllegalStateException e4) {
                throw new s(e4);
            }
        } finally {
            c65385PlN.LJLILLLLZI = z;
        }
    }

    public final <T> TypeAdapter<T> LJIIJJI(u uVar, TypeToken<T> typeToken) {
        if (!this.LJ.contains(uVar)) {
            uVar = this.LIZLLL;
        }
        boolean z = false;
        for (u uVar2 : this.LJ) {
            if (!z) {
                if (uVar2 == uVar) {
                    z = true;
                }
            } else {
                TypeAdapter<T> create = uVar2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GSON cannot serialize ");
        LIZ.append(typeToken);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final String LJIILLIIL(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        LJIJI(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public final void LJIIZILJ(j jVar, Appendable appendable) {
        Writer aVar;
        try {
            if (appendable instanceof Writer) {
                aVar = (Writer) appendable;
            } else {
                aVar = new p.a(appendable);
            }
            LJIJ(jVar, LJIILIIL(aVar));
        } catch (IOException e) {
            throw new k(e);
        }
    }

    public final void LJIJ(j jVar, C65403Plf c65403Plf) {
        boolean z = c65403Plf.LJLJJLL;
        c65403Plf.LJLJJLL = true;
        boolean z2 = c65403Plf.LJLJL;
        c65403Plf.LJLJL = this.LJIIJJI;
        boolean z3 = c65403Plf.LJLJLLL;
        c65403Plf.LJLJLLL = this.LJIIIIZZ;
        try {
            try {
                com.google.gson.internal.p.LIZIZ(jVar, c65403Plf);
            } catch (IOException e) {
                throw new k(e);
            } catch (AssertionError e2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AssertionError (GSON 2.8.5): ");
                LIZ.append(e2.getMessage());
                throw new AssertionError(X1D.LIZIZ(LIZ), e2);
            }
        } finally {
            c65403Plf.LJLJJLL = z;
            c65403Plf.LJLJL = z2;
            c65403Plf.LJLJLLL = z3;
        }
    }

    public final j LJIL(Object obj, Type type) {
        com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
        LJIJJ(obj, type, bVar);
        return bVar.LJJIIJZLJL();
    }

    public final void LJIJI(Object obj, Type type, Appendable appendable) {
        Writer aVar;
        try {
            if (appendable instanceof Writer) {
                aVar = (Writer) appendable;
            } else {
                aVar = new p.a(appendable);
            }
            LJIJJ(obj, type, LJIILIIL(aVar));
        } catch (IOException e) {
            throw new k(e);
        }
    }

    public final void LJIJJ(Object obj, Type type, C65403Plf c65403Plf) {
        TypeAdapter LLJ = C16880lQ.LLJ(this, TypeToken.get(type));
        boolean z = c65403Plf.LJLJJLL;
        c65403Plf.LJLJJLL = true;
        boolean z2 = c65403Plf.LJLJL;
        c65403Plf.LJLJL = this.LJIIJJI;
        boolean z3 = c65403Plf.LJLJLLL;
        c65403Plf.LJLJLLL = this.LJIIIIZZ;
        try {
            try {
                try {
                    LLJ.write(c65403Plf, obj);
                } catch (AssertionError e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("AssertionError (GSON 2.8.5): ");
                    LIZ.append(e.getMessage());
                    throw new AssertionError(X1D.LIZIZ(LIZ), e);
                }
            } catch (IOException e2) {
                throw new k(e2);
            }
        } finally {
            c65403Plf.LJLJJLL = z;
            c65403Plf.LJLJL = z2;
            c65403Plf.LJLJLLL = z3;
        }
    }

    public Gson(Excluder excluder, d dVar, Map<Type, f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, t tVar, String str, int i, int i2, List<u> list, List<u> list2, List<u> list3) {
        final TypeAdapter<Number> typeAdapter;
        TypeAdapter<Number> typeAdapter2;
        TypeAdapter<Number> typeAdapter3;
        this.LIZ = new ThreadLocal<>();
        this.LIZIZ = new ConcurrentHashMap();
        this.LJFF = excluder;
        this.LJI = dVar;
        this.LJII = map;
        com.google.gson.internal.e eVar = new com.google.gson.internal.e(map);
        this.LIZJ = eVar;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
        this.LJIIJ = z3;
        this.LJIIJJI = z4;
        this.LJIIL = z5;
        this.LJIILIIL = z6;
        this.LJIILJJIL = z7;
        this.LJIJ = tVar;
        this.LJIILL = str;
        this.LJIILLIIL = i;
        this.LJIIZILJ = i2;
        this.LJIJI = list;
        this.LJIJJ = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.LJJIIJZLJL);
        arrayList.add(ObjectTypeAdapter.LIZIZ);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.LJIIZILJ);
        arrayList.add(TypeAdapters.LJI);
        arrayList.add(TypeAdapters.LIZLLL);
        arrayList.add(TypeAdapters.LJ);
        arrayList.add(TypeAdapters.LJFF);
        if (tVar == t.DEFAULT) {
            typeAdapter = TypeAdapters.LJIIJ;
        } else {
            typeAdapter = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
                @Override // com.google.gson.TypeAdapter
                public final Number read(C65385PlN c65385PlN) {
                    if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                        c65385PlN.LJJIIJ();
                        return null;
                    }
                    return Long.valueOf(c65385PlN.LJIJJ());
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(C65403Plf c65403Plf, Number number) {
                    if (number == null) {
                        c65403Plf.LJIIJJI();
                    } else {
                        c65403Plf.LJJ(number.toString());
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.LIZJ(Long.TYPE, Long.class, typeAdapter));
        Class cls = Double.TYPE;
        if (z7) {
            typeAdapter2 = TypeAdapters.LJIIL;
        } else {
            typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
                @Override // com.google.gson.TypeAdapter
                public final Number read(C65385PlN c65385PlN) {
                    if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                        c65385PlN.LJJIIJ();
                        return null;
                    }
                    return Double.valueOf(c65385PlN.LJIJ());
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(C65403Plf c65403Plf, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        c65403Plf.LJIIJJI();
                    } else {
                        Gson.LIZIZ(number2.doubleValue());
                        c65403Plf.LJIJJ(number2);
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.LIZJ(cls, Double.class, typeAdapter2));
        Class cls2 = Float.TYPE;
        if (z7) {
            typeAdapter3 = TypeAdapters.LJIIJJI;
        } else {
            typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
                @Override // com.google.gson.TypeAdapter
                public final Number read(C65385PlN c65385PlN) {
                    if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                        c65385PlN.LJJIIJ();
                        return null;
                    }
                    return Float.valueOf((float) c65385PlN.LJIJ());
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(C65403Plf c65403Plf, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        c65403Plf.LJIIJJI();
                    } else {
                        Gson.LIZIZ(number2.floatValue());
                        c65403Plf.LJIJJ(number2);
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.LIZJ(cls2, Float.class, typeAdapter3));
        arrayList.add(TypeAdapters.LJIILIIL);
        arrayList.add(TypeAdapters.LJII);
        arrayList.add(TypeAdapters.LJIIIIZZ);
        arrayList.add(TypeAdapters.LIZIZ(AtomicLong.class, new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            public final AtomicLong read(C65385PlN c65385PlN) {
                return new AtomicLong(((Number) TypeAdapter.this.read(c65385PlN)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, AtomicLong atomicLong) {
                TypeAdapter.this.write(c65403Plf, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.LIZIZ(AtomicLongArray.class, new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            public final AtomicLongArray read(C65385PlN c65385PlN) {
                ArrayList arrayList2 = new ArrayList();
                c65385PlN.LIZ();
                while (c65385PlN.LJIIJJI()) {
                    arrayList2.add(Long.valueOf(((Number) TypeAdapter.this.read(c65385PlN)).longValue()));
                }
                c65385PlN.LJ();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicLongArray.set(i3, ((Long) arrayList2.get(i3)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, AtomicLongArray atomicLongArray) {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                c65403Plf.LIZIZ();
                int length = atomicLongArray2.length();
                for (int i3 = 0; i3 < length; i3++) {
                    TypeAdapter.this.write(c65403Plf, Long.valueOf(atomicLongArray2.get(i3)));
                }
                c65403Plf.LJ();
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.LJIIIZ);
        arrayList.add(TypeAdapters.LJIILJJIL);
        arrayList.add(TypeAdapters.LJIJ);
        arrayList.add(TypeAdapters.LJIJI);
        arrayList.add(TypeAdapters.LIZIZ(BigDecimal.class, TypeAdapters.LJIILL));
        arrayList.add(TypeAdapters.LIZIZ(BigInteger.class, TypeAdapters.LJIILLIIL));
        arrayList.add(TypeAdapters.LJIJJ);
        arrayList.add(TypeAdapters.LJIJJLI);
        arrayList.add(TypeAdapters.LJJ);
        arrayList.add(TypeAdapters.LJJI);
        arrayList.add(TypeAdapters.LJJIII);
        arrayList.add(TypeAdapters.LJIL);
        arrayList.add(TypeAdapters.LIZIZ);
        arrayList.add(DateTypeAdapter.LIZIZ);
        arrayList.add(TypeAdapters.LJJII);
        arrayList.add(TimeTypeAdapter.LIZIZ);
        arrayList.add(SqlDateTypeAdapter.LIZIZ);
        arrayList.add(TypeAdapters.LJJIFFI);
        arrayList.add(ArrayTypeAdapter.LIZJ);
        arrayList.add(TypeAdapters.LIZ);
        arrayList.add(new CollectionTypeAdapterFactory(eVar));
        arrayList.add(new MapTypeAdapterFactory(eVar, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(eVar);
        this.LIZLLL = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.LJJIIZ);
        arrayList.add(new ReflectiveTypeAdapterFactory(eVar, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.LJ = Collections.unmodifiableList(arrayList);
    }
}
