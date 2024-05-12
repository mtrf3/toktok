package X;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Pmy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65484Pmy {
    public static final C65497PnB LIZ = new C65497PnB();
    public static final C65478Pms LIZIZ;

    static {
        C65477Pmr c65477Pmr = new C65477Pmr(", ");
        LIZIZ = new C65478Pms(c65477Pmr, c65477Pmr);
    }

    public static Type LIZIZ(Type type) {
        type.getClass();
        AtomicReference atomicReference = new AtomicReference();
        new C65479Pmt(atomicReference).LJIIIZ(type);
        return (Type) atomicReference.get();
    }

    public static Type LIZJ(Type type) {
        boolean z;
        boolean z2;
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            if (lowerBounds.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C76917UGr.LIZJ("Wildcard cannot have more than one lower bounds.", z);
            if (lowerBounds.length == 1) {
                return new C65499PnD(new Type[]{LIZJ(lowerBounds[0])}, new Type[]{Object.class});
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C76917UGr.LIZJ("Wildcard should have only one upper bound.", z2);
            return new C65499PnD(new Type[0], new Type[]{LIZJ(upperBounds[0])});
        }
        return EnumC65510PnO.LJLJI.LIZJ(type);
    }

    public static Type LJFF(Type[] typeArr) {
        for (Type type : typeArr) {
            Type LIZIZ2 = LIZIZ(type);
            if (LIZIZ2 != null) {
                if (LIZIZ2 instanceof Class) {
                    Class cls = (Class) LIZIZ2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return new C65499PnD(new Type[0], new Type[]{LIZIZ2});
            }
        }
        return null;
    }

    public static void LIZ(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                C76917UGr.LIZIZ((Class) type, str, "Primitive type '%s' used as %s", !r2.isPrimitive());
            }
        }
    }

    public static <D extends GenericDeclaration> TypeVariable<D> LIZLLL(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        C65487Pn1 c65487Pn1 = new C65487Pn1(new C65485Pmz(d, str, typeArr));
        C76917UGr.LIZLLL("%s is not an interface", TypeVariable.class.isInterface(), TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, c65487Pn1));
    }

    public static C65495Pn9 LJ(Type type, Class cls, Type... typeArr) {
        boolean z;
        if (type == null) {
            return new C65495Pn9(EnumC65490Pn4.LJLIL.LIZJ(cls), cls, typeArr);
        }
        if (cls.getEnclosingClass() != null) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LIZLLL("Owner type for unenclosed %s", z, cls);
        return new C65495Pn9(type, cls, typeArr);
    }
}
