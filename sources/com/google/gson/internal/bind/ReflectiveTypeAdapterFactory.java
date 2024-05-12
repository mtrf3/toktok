package com.google.gson.internal.bind;

import X.AbstractC37304EkW;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.InterfaceC65349Pkn;
import X.InterfaceC65405Plh;
import X.InterfaceC65406Pli;
import X.O1A;
import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.e;
import com.google.gson.internal.n;
import com.google.gson.s;
import com.google.gson.u;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class ReflectiveTypeAdapterFactory implements u {
    public final e LJLIL;
    public final d LJLILLLLZI;
    public final Excluder LJLJI;
    public final JsonAdapterAnnotationTypeAdapterFactory LJLJJI;
    public final AbstractC37304EkW LJLJJL = AbstractC37304EkW.LIZ;

    /* loaded from: classes12.dex */
    public static final class Adapter<T> extends TypeAdapter<T> {
        public final n<T> LIZ;
        public final Map<String, a> LIZIZ;

        @Override // com.google.gson.TypeAdapter
        public final T read(C65385PlN c65385PlN) {
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
                return null;
            }
            T LJI = this.LIZ.LJI();
            try {
                c65385PlN.LIZIZ();
                while (c65385PlN.LJIIJJI()) {
                    a aVar = this.LIZIZ.get(c65385PlN.LJJ());
                    if (aVar == null || !aVar.LIZJ) {
                        c65385PlN.LJJJJ();
                    } else {
                        aVar.LIZ(c65385PlN, LJI);
                    }
                }
                c65385PlN.LJFF();
                return LJI;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new s(e2);
            }
        }

        public Adapter(n<T> nVar, Map<String, a> map) {
            this.LIZ = nVar;
            this.LIZIZ = map;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, T t) {
            if (t == null) {
                c65403Plf.LJIIJJI();
                return;
            }
            c65403Plf.LIZJ();
            try {
                for (a aVar : this.LIZIZ.values()) {
                    if (aVar.LIZJ(t)) {
                        c65403Plf.LJI(aVar.LIZ);
                        aVar.LIZIZ(c65403Plf, t);
                    }
                }
                c65403Plf.LJFF();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final List<String> LIZ(Field field) {
        InterfaceC65349Pkn interfaceC65349Pkn = (InterfaceC65349Pkn) field.getAnnotation(InterfaceC65349Pkn.class);
        if (interfaceC65349Pkn == null) {
            return Collections.singletonList(this.LJLILLLLZI.translateName(field));
        }
        String value = interfaceC65349Pkn.value();
        String[] alternate = interfaceC65349Pkn.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public final boolean LIZIZ(Field field, boolean z) {
        List<com.google.gson.a> list;
        Excluder excluder = this.LJLJI;
        Class<?> type = field.getType();
        if (excluder.LIZIZ(type) || excluder.LIZJ(type, z) || (excluder.LJLILLLLZI & field.getModifiers()) != 0) {
            return false;
        }
        if ((excluder.LJLIL != -1.0d && !excluder.LIZLLL((InterfaceC65405Plh) field.getAnnotation(InterfaceC65405Plh.class), (InterfaceC65406Pli) field.getAnnotation(InterfaceC65406Pli.class))) || field.isSynthetic()) {
            return false;
        }
        if (excluder.LJLJJI) {
            O1A o1a = (O1A) field.getAnnotation(O1A.class);
            if (o1a == null) {
                return false;
            }
            if (z) {
                if (!o1a.serialize()) {
                    return false;
                }
            } else if (!o1a.deserialize()) {
                return false;
            }
        }
        if (!excluder.LJLJI) {
            Class<?> type2 = field.getType();
            if (type2.isMemberClass() && (type2.getModifiers() & 8) == 0) {
                return false;
            }
        }
        Class<?> type3 = field.getType();
        if (!Enum.class.isAssignableFrom(type3) && (type3.isAnonymousClass() || type3.isLocalClass())) {
            return false;
        }
        if (z) {
            list = excluder.LJLJJL;
        } else {
            list = excluder.LJLJJLL;
        }
        if (!list.isEmpty()) {
            com.google.gson.b bVar = new com.google.gson.b(field);
            Iterator<com.google.gson.a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().shouldSkipField(bVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[SYNTHETIC] */
    @Override // com.google.gson.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r32, com.google.gson.reflect.TypeToken<T> r33) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    /* loaded from: classes12.dex */
    public static abstract class a {
        public final String LIZ;
        public final boolean LIZIZ;
        public final boolean LIZJ;

        public abstract void LIZ(C65385PlN c65385PlN, Object obj);

        public abstract void LIZIZ(C65403Plf c65403Plf, Object obj);

        public abstract boolean LIZJ(Object obj);

        public a(String str, boolean z, boolean z2) {
            this.LIZ = str;
            this.LIZIZ = z;
            this.LIZJ = z2;
        }
    }

    public ReflectiveTypeAdapterFactory(e eVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.LJLIL = eVar;
        this.LJLILLLLZI = dVar;
        this.LJLJI = excluder;
        this.LJLJJI = jsonAdapterAnnotationTypeAdapterFactory;
    }
}
