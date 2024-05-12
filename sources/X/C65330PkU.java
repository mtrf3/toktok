package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PkU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65330PkU {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Type LIZJ(C65338Pkc c65338Pkc) {
        Type LIZJ;
        if ((c65338Pkc instanceof InterfaceC65334PkY) && (LIZJ = ((InterfaceC65334PkY) c65338Pkc).LIZJ()) != null) {
            return LIZJ;
        }
        return LIZ(c65338Pkc, false);
    }

    public static final Type LIZLLL(C65337Pkb c65337Pkb) {
        EnumC65342Pkg enumC65342Pkg = c65337Pkb.LIZ;
        if (enumC65342Pkg == null) {
            return C65324PkO.LJLJI;
        }
        InterfaceC65332PkW interfaceC65332PkW = c65337Pkb.LIZIZ;
        o.LJI(interfaceC65332PkW);
        int i = C65344Pki.LIZ[enumC65342Pkg.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C65324PkO(LIZ(interfaceC65332PkW, true), null);
                }
                throw new C162476Zf();
            }
            return LIZ(interfaceC65332PkW, true);
        }
        return new C65324PkO(null, LIZ(interfaceC65332PkW, true));
    }

    public static final String LJ(Type type) {
        String name;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                InterfaceC1039145z LJJIZ = OJ6.LJJIZ(type, C65329PkT.LJLIL);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((Class) OJ4.LJJJJLI(LJJIZ)).getName());
                LIZ.append(ujb.o.LJJJJLI(OJ4.LJJJI(LJJIZ), "[]"));
                name = X1D.LIZIZ(LIZ);
            } else {
                name = cls.getName();
            }
            o.LJIIIIZZ(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }

    public static final Type LIZ(InterfaceC65332PkW interfaceC65332PkW, boolean z) {
        Class LIZ;
        Object obj;
        int i;
        InterfaceC65335PkZ LJ = interfaceC65332PkW.LJ();
        if (LJ instanceof InterfaceC65333PkX) {
            return new C65331PkV((InterfaceC65333PkX) LJ);
        }
        if (LJ instanceof InterfaceC65350Pko) {
            if (z) {
                LIZ = C39557Ffl.LIZIZ((InterfaceC65350Pko) LJ);
            } else {
                LIZ = C39557Ffl.LIZ((InterfaceC65350Pko) LJ);
            }
            List<C65337Pkb> LJI = interfaceC65332PkW.LJI();
            if (LJI.isEmpty()) {
                return LIZ;
            }
            if (LIZ.isArray()) {
                if (LIZ.getComponentType().isPrimitive()) {
                    return LIZ;
                }
                if (LJI.size() == 1) {
                    obj = ListProtector.get(LJI, 0);
                } else {
                    obj = null;
                }
                C65337Pkb c65337Pkb = (C65337Pkb) obj;
                if (c65337Pkb != null) {
                    EnumC65342Pkg enumC65342Pkg = c65337Pkb.LIZ;
                    InterfaceC65332PkW interfaceC65332PkW2 = c65337Pkb.LIZIZ;
                    if (enumC65342Pkg == null || (i = C65344Pki.LIZ[enumC65342Pkg.ordinal()]) == -1 || i == 1) {
                        return LIZ;
                    }
                    if (i == 2 || i == 3) {
                        o.LJI(interfaceC65332PkW2);
                        Type LIZ2 = LIZ(interfaceC65332PkW2, false);
                        if (LIZ2 instanceof Class) {
                            return LIZ;
                        }
                        return new C65326PkQ(LIZ2);
                    }
                    throw new C162476Zf();
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("kotlin.Array must have exactly one type argument: ");
                LIZ3.append(interfaceC65332PkW);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
            }
            return LIZIZ(LIZ, LJI);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Unsupported type classifier: ");
        LIZ4.append(interfaceC65332PkW);
        throw new UnsupportedOperationException(X1D.LIZIZ(LIZ4));
    }

    public static final C65327PkR LIZIZ(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(LIZLLL((C65337Pkb) it.next()));
            }
            return new C65327PkR(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(LIZLLL((C65337Pkb) it2.next()));
            }
            return new C65327PkR(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C65327PkR LIZIZ = LIZIZ(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(subList, 10));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(LIZLLL((C65337Pkb) it3.next()));
        }
        return new C65327PkR(cls, LIZIZ, arrayList3);
    }
}
