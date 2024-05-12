package X;

import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.PmJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65443PmJ implements InterfaceC65464Pme {
    public static final /* synthetic */ int LIZ = 0;

    static {
        String name;
        F93 f93 = new F93("application/x-www-form-urlencoded");
        Charset charset = C65460Pma.LIZ;
        if (charset == null) {
            name = null;
        } else {
            name = charset.name();
        }
        f93.LIZIZ("charset", name);
        f93.LIZ();
    }

    public static void LIZ(Reader reader, Object obj) {
        C65445PmL c65445PmL;
        java.util.Map map;
        int read;
        Type genericComponentType;
        boolean z;
        ParameterizedType LIZJ;
        Type type;
        Type type2;
        Class cls;
        Class<?> cls2 = obj.getClass();
        C65453PmT LIZIZ = C65453PmT.LIZIZ(cls2, false);
        List asList = Arrays.asList(cls2);
        if (C65445PmL.class.isAssignableFrom(cls2)) {
            c65445PmL = (C65445PmL) obj;
        } else {
            c65445PmL = null;
        }
        if (java.util.Map.class.isAssignableFrom(cls2)) {
            map = (java.util.Map) obj;
        } else {
            map = null;
        }
        C65459PmZ c65459PmZ = new C65459PmZ(obj);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            boolean z2 = true;
            while (true) {
                read = reader.read();
                if (read == -1 || read == 38) {
                    break;
                }
                if (read != 61) {
                    if (z2) {
                        stringWriter.write(read);
                    } else {
                        stringWriter2.write(read);
                    }
                } else {
                    z2 = false;
                }
            }
            String LIZ2 = C64365PNx.LIZ(stringWriter.toString());
            if (LIZ2.length() != 0) {
                String LIZ3 = C64365PNx.LIZ(stringWriter2.toString());
                C65454PmU LIZ4 = LIZIZ.LIZ(LIZ2);
                if (LIZ4 != null) {
                    Type LJ = C65444PmK.LJ(asList, LIZ4.LIZIZ.getGenericType());
                    if (!(LJ instanceof GenericArrayType)) {
                        if ((LJ instanceof Class) && ((Class) LJ).isArray()) {
                            genericComponentType = ((Class) LJ).getComponentType();
                        } else {
                            Class<?> LIZIZ2 = C65321PkL.LIZIZ(asList, LJ);
                            if (LIZIZ2.isAssignableFrom(Iterable.class) || Iterable.class.isAssignableFrom(LIZIZ2)) {
                                Collection collection = (Collection) LIZ4.LIZ(obj);
                                if (collection == null) {
                                    if (LJ instanceof WildcardType) {
                                        type2 = C65321PkL.LIZ((WildcardType) LJ);
                                    } else {
                                        type2 = LJ;
                                    }
                                    if (type2 instanceof ParameterizedType) {
                                        type2 = ((ParameterizedType) type2).getRawType();
                                    }
                                    if (type2 instanceof Class) {
                                        cls = (Class) type2;
                                    } else {
                                        cls = null;
                                    }
                                    if (type2 != null && !(type2 instanceof GenericArrayType)) {
                                        if (cls != null) {
                                            if (!cls.isArray() && !cls.isAssignableFrom(ArrayList.class)) {
                                                if (cls.isAssignableFrom(HashSet.class)) {
                                                    collection = new HashSet();
                                                } else if (cls.isAssignableFrom(TreeSet.class)) {
                                                    collection = new TreeSet();
                                                } else {
                                                    collection = (Collection) C65321PkL.LJFF(cls);
                                                }
                                                LIZ4.LIZLLL(obj, collection);
                                            }
                                        } else {
                                            String valueOf = String.valueOf(type2);
                                            throw new IllegalArgumentException(AnonymousClass073.LIZIZ(new StringBuilder(valueOf.length() + 39), "unable to create new instance of type: ", valueOf));
                                        }
                                    }
                                    collection = new ArrayList();
                                    LIZ4.LIZLLL(obj, collection);
                                }
                                if (LJ == Object.class || (LIZJ = C65321PkL.LIZJ(LJ, Iterable.class)) == null) {
                                    type = null;
                                } else {
                                    Type type3 = LIZJ.getActualTypeArguments()[0];
                                    if (!(type3 instanceof TypeVariable) || (type = C65321PkL.LJI(Arrays.asList(LJ), (TypeVariable) type3)) == null) {
                                        type = type3;
                                    }
                                }
                                collection.add(LIZIZ(type, asList, LIZ3));
                            } else {
                                LIZ4.LIZLLL(obj, LIZIZ(LJ, asList, LIZ3));
                            }
                        }
                    } else {
                        genericComponentType = ((GenericArrayType) LJ).getGenericComponentType();
                    }
                    Class<?> LIZIZ3 = C65321PkL.LIZIZ(asList, genericComponentType);
                    Field field = LIZ4.LIZIZ;
                    Object LIZIZ4 = LIZIZ(LIZIZ3, asList, LIZ3);
                    C65447PmN c65447PmN = (C65447PmN) c65459PmZ.LIZIZ.get(field);
                    if (c65447PmN == null) {
                        c65447PmN = new C65447PmN(LIZIZ3);
                        c65459PmZ.LIZIZ.put(field, c65447PmN);
                    }
                    if (LIZIZ3 == c65447PmN.LIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C77357UXp.LJFF(z);
                    c65447PmN.LIZIZ.add(LIZIZ4);
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(LIZ2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (c65445PmL != null) {
                            c65445PmL.LIZIZ(arrayList, LIZ2);
                        } else {
                            map.put(LIZ2, arrayList);
                        }
                    }
                    arrayList.add(LIZ3);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (read != -1);
        C65446PmM c65446PmM = c65459PmZ.LIZ;
        c65446PmM.getClass();
        Iterator it = new C65450PmQ(c65446PmM).iterator();
        while (true) {
            C65448PmO c65448PmO = (C65448PmO) it;
            if (!c65448PmO.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c65448PmO.next();
            ((java.util.Map) c65459PmZ.LIZJ).put(entry.getKey(), ((C65447PmN) entry.getValue()).LIZ());
        }
        C65446PmM c65446PmM2 = c65459PmZ.LIZIZ;
        c65446PmM2.getClass();
        Iterator it2 = new C65450PmQ(c65446PmM2).iterator();
        while (true) {
            C65448PmO c65448PmO2 = (C65448PmO) it2;
            if (c65448PmO2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) c65448PmO2.next();
                C65454PmU.LIZJ(c65459PmZ.LIZJ, (Field) entry2.getKey(), ((C65447PmN) entry2.getValue()).LIZ());
            } else {
                return;
            }
        }
    }

    public static Object LIZIZ(Type type, List<Type> list, String str) {
        Class cls;
        Object bigDecimal;
        Type LJ = C65444PmK.LJ(list, type);
        if (LJ instanceof Class) {
            cls = (Class) LJ;
        } else {
            cls = null;
        }
        if (LJ == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(cls);
                throw new IllegalArgumentException(AnonymousClass073.LIZIZ(new StringBuilder(valueOf.length() + 37), "expected type Character/char but got ", valueOf));
            }
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            }
            if (cls == Byte.class || cls == Byte.TYPE) {
                return CastByteProtector.valueOf(str);
            }
            if (cls == Short.class || cls == Short.TYPE) {
                return CastShortProtector.valueOf(str);
            }
            if (cls == Integer.class || cls == Integer.TYPE) {
                return CastIntegerProtector.valueOf(str);
            }
            if (cls == Long.class || cls == Long.TYPE) {
                return CastLongProtector.valueOf(str);
            }
            if (cls == Float.class || cls == Float.TYPE) {
                return CastFloatProtector.valueOf(str);
            }
            if (cls == Double.class || cls == Double.TYPE) {
                return CastDoubleProtector.valueOf(str);
            }
            if (cls == C61705OJp.class) {
                return C61705OJp.parseRfc3339(str);
            }
            if (cls == BigInteger.class) {
                bigDecimal = new BigInteger(str);
            } else if (cls == BigDecimal.class) {
                bigDecimal = new BigDecimal(str);
            } else if (cls.isEnum()) {
                C65454PmU LIZ2 = C65453PmT.LIZIZ(cls, false).LIZ(str);
                return V0N.LJJJ(LIZ2.LIZIZ.getDeclaringClass(), LIZ2.LIZIZ.getName());
            }
            return bigDecimal;
        }
        String valueOf2 = String.valueOf(LJ);
        throw new IllegalArgumentException(AnonymousClass073.LIZIZ(new StringBuilder(valueOf2.length() + 35), "expected primitive class, but got: ", valueOf2));
    }
}
