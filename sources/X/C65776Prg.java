package X;

import defpackage.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Prg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65776Prg implements InterfaceC65350Pko<Object>, InterfaceC39558Ffm {
    public static final java.util.Map<Class<? extends InterfaceC106334Fh<?>>, Integer> LJLILLLLZI;
    public static final HashMap<String, String> LJLJI;
    public static final java.util.Map<String, String> LJLJJI;
    public final Class<?> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(InterfaceC65784Pro.class, InterfaceC88472Yns.class, InterfaceC88471Ynr.class, InterfaceC88473Ynt.class, InterfaceC88474Ynu.class, InterfaceC88475Ynv.class, InterfaceC88476Ynw.class, InterfaceC88477Ynx.class, InterfaceC88478Yny.class, InterfaceC88479Ynz.class, InterfaceC88480Yo0.class, InterfaceC88481Yo1.class, InterfaceC88482Yo2.class, InterfaceC88483Yo3.class, InterfaceC88484Yo4.class, InterfaceC88485Yo5.class, InterfaceC88486Yo6.class, InterfaceC88487Yo7.class, InterfaceC88488Yo8.class, InterfaceC88489Yo9.class, InterfaceC88490YoA.class, InterfaceC88491YoB.class, InterfaceC88492YoC.class);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
        for (Object obj : LJJIJIIJI) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new OSZ(obj, Integer.valueOf(i)));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LJLILLLLZI = C113554cx.LJJLIIIJLJLI(arrayList);
        HashMap LIZ = C45243HpH.LIZ("boolean", "kotlin.Boolean", "char", "kotlin.Char");
        LIZ.put("byte", "kotlin.Byte");
        LIZ.put("short", "kotlin.Short");
        LIZ.put("int", "kotlin.Int");
        LIZ.put("float", "kotlin.Float");
        LIZ.put("long", "kotlin.Long");
        LIZ.put("double", "kotlin.Double");
        HashMap hashMap = new HashMap();
        hashMap.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap.put("java.lang.Character", "kotlin.Char");
        hashMap.put("java.lang.Byte", "kotlin.Byte");
        hashMap.put("java.lang.Short", "kotlin.Short");
        hashMap.put("java.lang.Integer", "kotlin.Int");
        hashMap.put("java.lang.Float", "kotlin.Float");
        hashMap.put("java.lang.Long", "kotlin.Long");
        hashMap.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Object", "kotlin.Any");
        hashMap2.put("java.lang.String", "kotlin.String");
        hashMap2.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap2.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap2.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap2.put("java.lang.Number", "kotlin.Number");
        hashMap2.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap2.put("java.lang.Enum", "kotlin.Enum");
        hashMap2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap2.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap2.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap2.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap2.put("java.util.List", "kotlin.collections.List");
        hashMap2.put("java.util.Set", "kotlin.collections.Set");
        hashMap2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap2.put("java.util.Map", "kotlin.collections.Map");
        hashMap2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap2.putAll(LIZ);
        hashMap2.putAll(hashMap);
        Collection<String> values = LIZ.values();
        o.LJIIIIZZ(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("kotlin.jvm.internal.");
            o.LJIIIIZZ(kotlinName, "kotlinName");
            LIZ2.append(s.LJLLILLLL('.', kotlinName, kotlinName));
            LIZ2.append("CompanionObject");
            OSZ osz = new OSZ(X1D.LIZIZ(LIZ2), i0.LJFF(kotlinName, ".Companion"));
            hashMap2.put(osz.getFirst(), osz.getSecond());
        }
        for (Map.Entry<Class<? extends InterfaceC106334Fh<?>>, Integer> entry : LJLILLLLZI.entrySet()) {
            Class<? extends InterfaceC106334Fh<?>> key = entry.getKey();
            int intValue = entry.getValue().intValue();
            String name = key.getName();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("kotlin.Function");
            LIZ3.append(intValue);
            hashMap2.put(name, X1D.LIZIZ(LIZ3));
        }
        LJLJI = hashMap2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(hashMap2.size()));
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            Object key2 = entry2.getKey();
            String str = (String) entry2.getValue();
            linkedHashMap.put(key2, s.LJLLILLLL('.', str, str));
        }
        LJLJJI = linkedHashMap;
    }

    @Override // X.InterfaceC65350Pko
    public final String LIZLLL() {
        String str;
        String LJFF;
        Class<?> jClass = this.LJLIL;
        o.LJIIIZ(jClass, "jClass");
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (jClass.isArray()) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = LJLJI.get(componentType.getName())) != null && (LJFF = i0.LJFF(str, "Array")) != null) {
                return LJFF;
            }
            return "kotlin.Array";
        }
        String str2 = LJLJI.get(jClass.getName());
        if (str2 != null) {
            return str2;
        }
        return C16880lQ.LJLLILLLL(jClass);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r4 == 0) goto L20;
     */
    @Override // X.InterfaceC65350Pko
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJFF() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65776Prg.LJFF():java.lang.String");
    }

    public final int hashCode() {
        return C39557Ffl.LIZIZ(this).hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.toString());
        LIZ.append(" (Kotlin reflection is not available)");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC39558Ffm
    public final Class<?> LIZIZ() {
        return this.LJLIL;
    }

    public C65776Prg(Class<?> jClass) {
        o.LJIIIZ(jClass, "jClass");
        this.LJLIL = jClass;
    }

    @Override // X.InterfaceC65350Pko
    public final boolean LIZ(Object obj) {
        Class<?> jClass = this.LJLIL;
        o.LJIIIZ(jClass, "jClass");
        java.util.Map<Class<? extends InterfaceC106334Fh<?>>, Integer> map = LJLILLLLZI;
        o.LJII(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(jClass);
        if (num != null) {
            return C65777Prh.LJFF(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = C39557Ffl.LIZIZ(C65352Pkq.LIZ(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C65776Prg) && o.LJ(C39557Ffl.LIZIZ(this), C39557Ffl.LIZIZ((InterfaceC65350Pko) obj))) {
            return true;
        }
        return false;
    }
}
