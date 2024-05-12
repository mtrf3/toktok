package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedOutput;
import defpackage.a1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.PeM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64950PeM<T> {
    public static final Pattern LJJIIZI = PatternProtector.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern LJJIJ = PatternProtector.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final C65019PfT LIZ;
    public final Method LIZIZ;
    public final Annotation[] LIZJ;
    public final Annotation[][] LIZLLL;
    public final Type[] LJ;
    public final C64738Paw LJFF;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public String LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public String LJJI;
    public List<EJ6> LJJIFFI;
    public String LJJII;
    public java.util.Set<String> LJJIII;
    public String LJJIIJ;
    public AbstractC64937Pe9<?>[] LJJIIJZLJL;
    public boolean LJJIIZ;
    public int LJI = 1;
    public String LJII = "";
    public int LJIIJ = 3;

    public static Class<?> LIZ(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    public final List<EJ6> LIZJ(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int indexOf = str.indexOf(58);
            if (indexOf != -1 && indexOf != 0 && indexOf != str.length() - 1) {
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    this.LJJII = trim;
                } else {
                    C77800Ug8.LJFF(substring, trim, arrayList);
                }
            } else {
                throw C65139PhP.LJIIIZ(this.LIZIZ, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
            }
        }
        return arrayList;
    }

    public static C64606PXe LIZIZ(String str, String str2) {
        return C64606PXe.LJII("Content-Disposition", a1.LJ("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", str2);
    }

    public final void LJI(int i, String str) {
        if (LJJIJ.matcher(str).matches()) {
            if (this.LJJIII.contains(str)) {
                return;
            } else {
                throw C65139PhP.LJIIJ(this.LIZIZ, i, "URL \"%s\" does not contain \"{%s}\".", this.LJJI, str);
            }
        }
        throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Path parameter name must match %s. Found: %s", LJJIIZI.pattern(), str);
    }

    public final void LJII(int i, Type type) {
        if (!C65139PhP.LJII(type)) {
        } else {
            throw C65139PhP.LJIIJ(this.LIZIZ, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    public C64950PeM(C65019PfT c65019PfT, Method method, C64738Paw c64738Paw) {
        this.LIZ = c65019PfT;
        this.LIZIZ = method;
        this.LIZJ = method.getAnnotations();
        this.LJ = method.getGenericParameterTypes();
        this.LIZLLL = method.getParameterAnnotations();
        this.LJFF = c64738Paw;
    }

    public static AbstractC64937Pe9 LJFF(Type type, String str, String str2) {
        Class<?> LJFF = C65139PhP.LJFF(type);
        if (TextUtils.isEmpty(str)) {
            if (Iterable.class.isAssignableFrom(LJFF)) {
                if ((type instanceof ParameterizedType) && C64553PVd.class.isAssignableFrom(C65139PhP.LJFF(C65139PhP.LJ(0, (ParameterizedType) type)))) {
                    return new C64947PeJ(PZD.LIZ);
                }
            } else if (LJFF.isArray()) {
                if (C64553PVd.class.isAssignableFrom(LJFF.getComponentType())) {
                    return new C64948PeK(PZD.LIZ);
                }
            } else if (C64553PVd.class.isAssignableFrom(LJFF)) {
                return PZD.LIZ;
            }
        } else if (Iterable.class.isAssignableFrom(LJFF)) {
            if ((type instanceof ParameterizedType) && PVP.class.isAssignableFrom(C65139PhP.LJFF(C65139PhP.LJ(0, (ParameterizedType) type)))) {
                return new C64947PeJ(new PZC(LIZIZ(str, str2)));
            }
        } else if (LJFF.isArray()) {
            if (PVP.class.isAssignableFrom(LIZ(LJFF.getComponentType()))) {
                return new C64948PeK(new PZC(LIZIZ(str, str2)));
            }
        } else if (PVP.class.isAssignableFrom(LJFF)) {
            return new PZC(LIZIZ(str, str2));
        }
        return null;
    }

    public final void LIZLLL(String str, String str2, boolean z) {
        String str3;
        String str4 = this.LJIJJ;
        if (str4 == null) {
            this.LJIJJ = str;
            if (str != null) {
                Matcher matcher = LJJIIZI.matcher(str);
                if (matcher.find()) {
                    str3 = matcher.group(1);
                } else {
                    str3 = null;
                }
                this.LJJIIJ = str3;
            }
            if (this.LJJIIJ != null) {
                this.LJIIIZ = true;
            }
            this.LJIJJLI = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (LJJIIZI.matcher(substring).find()) {
                    throw C65139PhP.LJIIIZ(this.LIZIZ, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.LJJI = str2;
            Matcher matcher2 = LJJIIZI.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher2.find()) {
                linkedHashSet.add(matcher2.group(1));
            }
            this.LJJIII = linkedHashSet;
            return;
        }
        throw C65139PhP.LJIIIZ(this.LIZIZ, null, "Only one HTTP method is allowed. Found: %s and %s.", str4, str);
    }

    public final AbstractC64937Pe9<?> LJ(int i, Type type, Annotation[] annotationArr, boolean z) {
        AbstractC64937Pe9<?> c64942PeE;
        if (annotationArr != null) {
            AbstractC64937Pe9<?> abstractC64937Pe9 = null;
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof InterfaceC195747mE) {
                    LJII(i, type);
                    if (!this.LJIJ) {
                        if (!this.LJIILJJIL) {
                            if (!this.LJIILL) {
                                if (this.LJJI == null) {
                                    if (!this.LJIILLIIL) {
                                        if (!this.LJIIZILJ) {
                                            this.LJIJ = true;
                                            if (type == String.class || type == java.net.URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                                                c64942PeE = new C64941PeD();
                                            } else {
                                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                            }
                                        } else {
                                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                        }
                                    } else {
                                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Url cannot be used with @%s URL", this.LJIJJ);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                    } else {
                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "Multiple @Url method annotations found.", new Object[0]);
                    }
                } else if (annotation instanceof InterfaceC36332ENs) {
                    LJII(i, type);
                    if (!this.LJIILL) {
                        if (!this.LJIJ) {
                            if (this.LJJI != null) {
                                if (!this.LJIILLIIL) {
                                    if (!this.LJIIZILJ) {
                                        this.LJIILJJIL = true;
                                        InterfaceC36332ENs interfaceC36332ENs = (InterfaceC36332ENs) annotation;
                                        String value = interfaceC36332ENs.value();
                                        LJI(i, value);
                                        c64942PeE = new C64934Pe6<>(this.LIZIZ, i, value, this.LIZ.LJI(type, annotationArr), interfaceC36332ENs.encode());
                                    } else {
                                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Path can only be used with relative url on @%s", this.LJIJJ);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                    } else {
                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                    }
                } else if (annotation instanceof InterfaceC64986Pew) {
                    LJII(i, type);
                    InterfaceC64986Pew interfaceC64986Pew = (InterfaceC64986Pew) annotation;
                    String value2 = interfaceC64986Pew.value();
                    boolean encode = interfaceC64986Pew.encode();
                    Class<?> LJFF = C65139PhP.LJFF(type);
                    this.LJIILL = true;
                    if (Iterable.class.isAssignableFrom(LJFF)) {
                        if (type instanceof ParameterizedType) {
                            c64942PeE = new C64947PeJ(new C64938PeA(value2, this.LIZ.LJI(C65139PhP.LJ(0, (ParameterizedType) type), annotationArr), encode));
                        } else {
                            Method method = this.LIZIZ;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(C16880lQ.LJLLJ(LJFF));
                            LIZ.append(" must include generic type (e.g., ");
                            LIZ.append(C16880lQ.LJLLJ(LJFF));
                            LIZ.append("<String>)");
                            throw C65139PhP.LJIIJ(method, i, X1D.LIZIZ(LIZ), new Object[0]);
                        }
                    } else if (LJFF.isArray()) {
                        c64942PeE = new C64948PeK(new C64938PeA(value2, this.LIZ.LJI(LIZ(LJFF.getComponentType()), annotationArr), encode));
                    } else {
                        c64942PeE = new C64938PeA<>(value2, this.LIZ.LJI(type, annotationArr), encode);
                    }
                } else if (annotation instanceof InterfaceC64990Pf0) {
                    LJII(i, type);
                    boolean encoded = ((InterfaceC64990Pf0) annotation).encoded();
                    Class<?> LJFF2 = C65139PhP.LJFF(type);
                    this.LJIILLIIL = true;
                    if (Iterable.class.isAssignableFrom(LJFF2)) {
                        if (type instanceof ParameterizedType) {
                            c64942PeE = new C64947PeJ(new C64939PeB(this.LIZ.LJI(C65139PhP.LJ(0, (ParameterizedType) type), annotationArr), encoded));
                        } else {
                            Method method2 = this.LIZIZ;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(C16880lQ.LJLLJ(LJFF2));
                            LIZ2.append(" must include generic type (e.g., ");
                            LIZ2.append(C16880lQ.LJLLJ(LJFF2));
                            LIZ2.append("<String>)");
                            throw C65139PhP.LJIIJ(method2, i, X1D.LIZIZ(LIZ2), new Object[0]);
                        }
                    } else if (LJFF2.isArray()) {
                        c64942PeE = new C64948PeK(new C64939PeB(this.LIZ.LJI(LIZ(LJFF2.getComponentType()), annotationArr), encoded));
                    } else {
                        c64942PeE = new C64939PeB<>(this.LIZ.LJI(type, annotationArr), encoded);
                    }
                } else if (annotation instanceof InterfaceC36228EJs) {
                    LJII(i, type);
                    Class<?> LJFF3 = C65139PhP.LJFF(type);
                    this.LJIIZILJ = true;
                    if (java.util.Map.class.isAssignableFrom(LJFF3)) {
                        Type LJI = C65139PhP.LJI(type, LJFF3, java.util.Map.class);
                        if (LJI instanceof ParameterizedType) {
                            ParameterizedType parameterizedType = (ParameterizedType) LJI;
                            Type LJ = C65139PhP.LJ(0, parameterizedType);
                            if (String.class == LJ) {
                                c64942PeE = new C64927Pdz<>(i, this.LIZ.LJI(C65139PhP.LJ(1, parameterizedType), annotationArr), this.LIZIZ, ((InterfaceC36228EJs) annotation).encode());
                            } else {
                                Method method3 = this.LIZIZ;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("@QueryMap keys must be of type String: ");
                                LIZ3.append(LJ);
                                throw C65139PhP.LJIIJ(method3, i, X1D.LIZIZ(LIZ3), new Object[0]);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                    } else {
                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "@QueryMap parameter type must be Map.", new Object[0]);
                    }
                } else if (annotation instanceof InterfaceC36348EOi) {
                    LJII(i, type);
                    String value3 = ((InterfaceC36348EOi) annotation).value();
                    Class<?> LJFF4 = C65139PhP.LJFF(type);
                    if (Iterable.class.isAssignableFrom(LJFF4)) {
                        if (type instanceof ParameterizedType) {
                            c64942PeE = new C64947PeJ(new C64936Pe8(value3, this.LIZ.LJI(C65139PhP.LJ(0, (ParameterizedType) type), annotationArr)));
                        } else {
                            Method method4 = this.LIZIZ;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append(C16880lQ.LJLLJ(LJFF4));
                            LIZ4.append(" must include generic type (e.g., ");
                            LIZ4.append(C16880lQ.LJLLJ(LJFF4));
                            LIZ4.append("<String>)");
                            throw C65139PhP.LJIIJ(method4, i, X1D.LIZIZ(LIZ4), new Object[0]);
                        }
                    } else if (LJFF4.isArray()) {
                        c64942PeE = new C64948PeK(new C64936Pe8(value3, this.LIZ.LJI(LIZ(LJFF4.getComponentType()), annotationArr)));
                    } else {
                        c64942PeE = new C64936Pe8<>(value3, this.LIZ.LJI(type, annotationArr));
                    }
                } else {
                    if (annotation instanceof InterfaceC195767mG) {
                        Class<?> LJFF5 = C65139PhP.LJFF(type);
                        if (List.class.isAssignableFrom(LJFF5)) {
                            Type LJI2 = C65139PhP.LJI(type, LJFF5, List.class);
                            if (LJI2 instanceof ParameterizedType) {
                                Type LJ2 = C65139PhP.LJ(0, (ParameterizedType) LJI2);
                                if (EJ6.class == LJ2) {
                                    C65019PfT c65019PfT = this.LIZ;
                                    c65019PfT.getClass();
                                    C65139PhP.LIZ(LJ2, "type == null");
                                    int size = c65019PfT.LIZLLL.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        InterfaceC65016PfQ LIZ5 = ((AbstractC65022PfW) ListProtector.get(c65019PfT.LIZLLL, i2)).LIZ(LJ2);
                                        if (LIZ5 != null) {
                                            c64942PeE = new C64930Pe2<>(LIZ5);
                                        }
                                    }
                                    throw new IllegalArgumentException("Could not locate header converter");
                                }
                                Method method5 = this.LIZIZ;
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append("@HeaderList keys must be of type retrofit.client.Header: ");
                                LIZ6.append(LJ2);
                                throw C65139PhP.LJIIJ(method5, i, X1D.LIZIZ(LIZ6), new Object[0]);
                            }
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "List must include generic types (e.g., List<Header>)", new Object[0]);
                        }
                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "@HeaderList parameter type must be List.", new Object[0]);
                    }
                    if (annotation instanceof InterfaceC30952CCu) {
                        LJII(i, type);
                        Class<?> LJFF6 = C65139PhP.LJFF(type);
                        if (java.util.Map.class.isAssignableFrom(LJFF6)) {
                            Type LJI3 = C65139PhP.LJI(type, LJFF6, java.util.Map.class);
                            if (LJI3 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType2 = (ParameterizedType) LJI3;
                                Type LJ3 = C65139PhP.LJ(0, parameterizedType2);
                                if (String.class == LJ3) {
                                    c64942PeE = new C64928Pe0<>(this.LIZIZ, i, this.LIZ.LJI(C65139PhP.LJ(1, parameterizedType2), annotationArr));
                                } else {
                                    Method method6 = this.LIZIZ;
                                    StringBuilder LIZ7 = X1D.LIZ();
                                    LIZ7.append("@HeaderMap keys must be of type String: ");
                                    LIZ7.append(LJ3);
                                    throw C65139PhP.LJIIJ(method6, i, X1D.LIZIZ(LIZ7), new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                        }
                    } else if (annotation instanceof InterfaceC64985Pev) {
                        LJII(i, type);
                        if (this.LJIL) {
                            InterfaceC64985Pev interfaceC64985Pev = (InterfaceC64985Pev) annotation;
                            String value4 = interfaceC64985Pev.value();
                            boolean encode2 = interfaceC64985Pev.encode();
                            this.LJIIJJI = true;
                            Class<?> LJFF7 = C65139PhP.LJFF(type);
                            if (Iterable.class.isAssignableFrom(LJFF7)) {
                                if (type instanceof ParameterizedType) {
                                    c64942PeE = new C64947PeJ(new C64932Pe4(value4, this.LIZ.LJI(C65139PhP.LJ(0, (ParameterizedType) type), annotationArr), encode2));
                                } else {
                                    Method method7 = this.LIZIZ;
                                    StringBuilder LIZ8 = X1D.LIZ();
                                    LIZ8.append(C16880lQ.LJLLJ(LJFF7));
                                    LIZ8.append(" must include generic type (e.g., ");
                                    LIZ8.append(C16880lQ.LJLLJ(LJFF7));
                                    LIZ8.append("<String>)");
                                    throw C65139PhP.LJIIJ(method7, i, X1D.LIZIZ(LIZ8), new Object[0]);
                                }
                            } else if (LJFF7.isArray()) {
                                c64942PeE = new C64948PeK(new C64932Pe4(value4, this.LIZ.LJI(LIZ(LJFF7.getComponentType()), annotationArr), encode2));
                            } else {
                                c64942PeE = new C64932Pe4<>(value4, this.LIZ.LJI(type, annotationArr), encode2);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof InterfaceC36229EJt) {
                        LJII(i, type);
                        if (this.LJIL) {
                            Class<?> LJFF8 = C65139PhP.LJFF(type);
                            if (java.util.Map.class.isAssignableFrom(LJFF8)) {
                                Type LJI4 = C65139PhP.LJI(type, LJFF8, java.util.Map.class);
                                if (LJI4 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) LJI4;
                                    Type LJ4 = C65139PhP.LJ(0, parameterizedType3);
                                    if (String.class == LJ4) {
                                        InterfaceC65016PfQ<T, String> LJI5 = this.LIZ.LJI(C65139PhP.LJ(1, parameterizedType3), annotationArr);
                                        this.LJIIJJI = true;
                                        c64942PeE = new C64926Pdy<>(i, LJI5, this.LIZIZ, ((InterfaceC36229EJt) annotation).encode());
                                    } else {
                                        Method method8 = this.LIZIZ;
                                        StringBuilder LIZ9 = X1D.LIZ();
                                        LIZ9.append("@FieldMap keys must be of type String: ");
                                        LIZ9.append(LJ4);
                                        throw C65139PhP.LJIIJ(method8, i, X1D.LIZIZ(LIZ9), new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@FieldMap parameter type must be Map.", new Object[0]);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof InterfaceC64977Pen) {
                        if (this.LJJ) {
                            InterfaceC64977Pen interfaceC64977Pen = (InterfaceC64977Pen) annotation;
                            this.LJIIL = true;
                            c64942PeE = LJFF(type, interfaceC64977Pen.value(), interfaceC64977Pen.encoding());
                            if (c64942PeE == null) {
                                c64942PeE = new C64931Pe3<>(i, this.LIZ.LJ(type, annotationArr, this.LIZJ), interfaceC64977Pen.value(), this.LIZIZ);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof InterfaceC64982Pes) {
                        LJII(i, type);
                        if (this.LJJ) {
                            this.LJIIL = true;
                            Class<?> LJFF9 = C65139PhP.LJFF(type);
                            if (java.util.Map.class.isAssignableFrom(LJFF9)) {
                                Type LJI6 = C65139PhP.LJI(type, LJFF9, java.util.Map.class);
                                if (LJI6 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType4 = (ParameterizedType) LJI6;
                                    Type LJ5 = C65139PhP.LJ(0, parameterizedType4);
                                    if (String.class == LJ5) {
                                        if (PVP.class.isAssignableFrom(C65139PhP.LJFF(C65139PhP.LJ(1, parameterizedType4)))) {
                                            c64942PeE = new PZB(((InterfaceC64982Pes) annotation).encoding());
                                        } else {
                                            c64942PeE = new C64929Pe1<>(i, this.LIZ.LJ(C65139PhP.LJ(1, parameterizedType4), annotationArr, this.LIZJ), ((InterfaceC64982Pes) annotation).encoding(), this.LIZIZ);
                                        }
                                    } else {
                                        Method method9 = this.LIZIZ;
                                        StringBuilder LIZ10 = X1D.LIZ();
                                        LIZ10.append("@PartMap keys must be of type String: ");
                                        LIZ10.append(LJ5);
                                        throw C65139PhP.LJIIJ(method9, i, X1D.LIZIZ(LIZ10), new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@PartMap parameter type must be Map.", new Object[0]);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof InterfaceC195727mC) {
                        LJII(i, type);
                        if (!this.LJIL && !this.LJJ) {
                            if (!this.LJIILIIL) {
                                if (PVP.class.isAssignableFrom(C65139PhP.LJFF(type)) && (c64942PeE = C64940PeC.LIZ) != null) {
                                    this.LJIILIIL = true;
                                } else {
                                    try {
                                        InterfaceC65016PfQ<T, TypedOutput> LJ6 = this.LIZ.LJ(type, annotationArr, this.LIZJ);
                                        this.LJIILIIL = true;
                                        c64942PeE = new C64933Pe5<>(i, LJ6, this.LIZIZ, this.LJIIIZ);
                                    } catch (RuntimeException e) {
                                        throw C65139PhP.LJIIJJI(this.LIZIZ, e, i, "Unable to create @Body converter for %s", type);
                                    }
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "Multiple @Body method annotations found.", new Object[0]);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof InterfaceC36331ENr) {
                        if (!this.LJIJI) {
                            this.LJIJI = true;
                            String value5 = ((InterfaceC36331ENr) annotation).value();
                            if (LJJIJ.matcher(value5).matches()) {
                                String str = this.LJJIIJ;
                                if (str == null || str.equals(value5)) {
                                    c64942PeE = new C64935Pe7<>(value5, this.LIZ.LJI(type, annotationArr));
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "Method \"%s\" does not contain \"{%s}\".", this.LJIJJ, value5);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Method parameter name must match %s. Found: %s", LJJIIZI.pattern(), value5);
                            }
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "Multiple @Method method annotations found.", new Object[0]);
                        }
                    } else if (annotation instanceof ENW) {
                        try {
                            c64942PeE = new C64942PeE<>(this.LIZ.LJI(type, annotationArr));
                        } catch (RuntimeException e2) {
                            throw C65139PhP.LJIIJJI(this.LIZIZ, e2, i, "Unable to create @MaxLength converter for %s", type);
                        }
                    } else if (annotation instanceof InterfaceC30951CCt) {
                        try {
                            c64942PeE = new C64944PeG<>(this.LIZ.LJI(type, annotationArr));
                        } catch (RuntimeException e3) {
                            throw C65139PhP.LJIIJJI(this.LIZIZ, e3, i, "Unable to create @AddCommonParam converter for %s", type);
                        }
                    } else if (annotation instanceof InterfaceC195737mD) {
                        try {
                            c64942PeE = new C64943PeF<>(this.LIZ.LIZLLL(type, annotationArr));
                        } catch (RuntimeException e4) {
                            throw C65139PhP.LJIIJJI(this.LIZIZ, e4, i, "Unable to create @ExtraInfo converter for %s", type);
                        }
                    } else if (annotation instanceof InterfaceC65006PfG) {
                        if (InterfaceC64949PeL.class.isAssignableFrom(C65139PhP.LJFF(type))) {
                            c64942PeE = new C64945PeH<>();
                        } else {
                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "Unable to create @QueryObject for %s not QueryParamObject type", type);
                        }
                    } else if (annotation instanceof InterfaceC65005PfF) {
                        LJII(i, type);
                        Class<?> LJFF10 = C65139PhP.LJFF(type);
                        for (int i3 = i - 1; i3 >= 0; i3--) {
                            AbstractC64937Pe9<?> abstractC64937Pe92 = this.LJJIIJZLJL[i3];
                            if ((abstractC64937Pe92 instanceof C64946PeI) && ((C64946PeI) abstractC64937Pe92).LIZ.equals(LJFF10)) {
                                Method method10 = this.LIZIZ;
                                StringBuilder LIZ11 = X1D.LIZ();
                                LIZ11.append("@Tag type ");
                                LIZ11.append(LJFF10.getName());
                                LIZ11.append(" is duplicate of parameter #");
                                LIZ11.append(i3 + 1);
                                LIZ11.append(" and would always overwrite its value.");
                                throw C65139PhP.LJIIJ(method10, i, X1D.LIZIZ(LIZ11), new Object[0]);
                            }
                        }
                        c64942PeE = new C64946PeI<>(LJFF10);
                    } else {
                        if (!C65065PgD.LIZIZ) {
                            continue;
                        } else if (annotation instanceof InterfaceC195797mJ) {
                            LJII(i, type);
                            if (!this.LJIJ) {
                                if (!this.LJIILJJIL) {
                                    if (!this.LJIILL) {
                                        if (!this.LJIILLIIL) {
                                            if (!this.LJIIZILJ) {
                                                if (this.LJJI == null) {
                                                    this.LJIJ = true;
                                                    if (type == String.class || type == java.net.URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                                                        c64942PeE = new C64941PeD();
                                                    } else {
                                                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                                    }
                                                } else {
                                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Url cannot be used with @%s URL", this.LJIJJ);
                                                }
                                            } else {
                                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                            }
                                        } else {
                                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                        }
                                    } else {
                                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "Multiple @Url method annotations found.", new Object[0]);
                            }
                        } else if (annotation instanceof InterfaceC64988Pey) {
                            LJII(i, type);
                            if (!this.LJIILL) {
                                if (!this.LJIILLIIL) {
                                    if (!this.LJIIZILJ) {
                                        if (!this.LJIJ) {
                                            if (this.LJJI != null) {
                                                this.LJIILJJIL = true;
                                                String value6 = ((InterfaceC64988Pey) annotation).value();
                                                LJI(i, value6);
                                                c64942PeE = new C64934Pe6<>(this.LIZIZ, i, value6, this.LIZ.LJI(type, annotationArr), !r12.encoded());
                                            } else {
                                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Path can only be used with relative url on @%s", this.LJIJJ);
                                            }
                                        } else {
                                            throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Path parameters may not be used with @Url.", new Object[0]);
                                        }
                                    } else {
                                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                            }
                        } else if (annotation instanceof InterfaceC64989Pez) {
                            LJII(i, type);
                            InterfaceC64989Pez interfaceC64989Pez = (InterfaceC64989Pez) annotation;
                            String value7 = interfaceC64989Pez.value();
                            boolean encoded2 = interfaceC64989Pez.encoded();
                            Class<?> LJFF11 = C65139PhP.LJFF(type);
                            this.LJIILL = true;
                            if (Iterable.class.isAssignableFrom(LJFF11)) {
                                if (type instanceof ParameterizedType) {
                                    c64942PeE = new C64947PeJ(new C64938PeA(value7, this.LIZ.LJI(C65139PhP.LJ(0, (ParameterizedType) type), annotationArr), !encoded2));
                                } else {
                                    Method method11 = this.LIZIZ;
                                    StringBuilder LIZ12 = X1D.LIZ();
                                    LIZ12.append(C16880lQ.LJLLJ(LJFF11));
                                    LIZ12.append(" must include generic type (e.g., ");
                                    LIZ12.append(C16880lQ.LJLLJ(LJFF11));
                                    LIZ12.append("<String>)");
                                    throw C65139PhP.LJIIJ(method11, i, X1D.LIZIZ(LIZ12), new Object[0]);
                                }
                            } else if (LJFF11.isArray()) {
                                c64942PeE = new C64948PeK(new C64938PeA(value7, this.LIZ.LJI(LIZ(LJFF11.getComponentType()), annotationArr), !encoded2));
                            } else {
                                c64942PeE = new C64938PeA<>(value7, this.LIZ.LJI(type, annotationArr), !encoded2);
                            }
                        } else if (annotation instanceof InterfaceC64998Pf8) {
                            LJII(i, type);
                            boolean encoded3 = ((InterfaceC64998Pf8) annotation).encoded();
                            Class<?> LJFF12 = C65139PhP.LJFF(type);
                            this.LJIILLIIL = true;
                            if (Iterable.class.isAssignableFrom(LJFF12)) {
                                if (type instanceof ParameterizedType) {
                                    c64942PeE = new C64947PeJ(new C64939PeB(this.LIZ.LJI(C65139PhP.LJ(0, (ParameterizedType) type), annotationArr), encoded3));
                                } else {
                                    Method method12 = this.LIZIZ;
                                    StringBuilder LIZ13 = X1D.LIZ();
                                    LIZ13.append(C16880lQ.LJLLJ(LJFF12));
                                    LIZ13.append(" must include generic type (e.g., ");
                                    LIZ13.append(C16880lQ.LJLLJ(LJFF12));
                                    LIZ13.append("<String>)");
                                    throw C65139PhP.LJIIJ(method12, i, X1D.LIZIZ(LIZ13), new Object[0]);
                                }
                            } else if (LJFF12.isArray()) {
                                c64942PeE = new C64948PeK(new C64939PeB(this.LIZ.LJI(LIZ(LJFF12.getComponentType()), annotationArr), encoded3));
                            } else {
                                c64942PeE = new C64939PeB<>(this.LIZ.LJI(type, annotationArr), encoded3);
                            }
                        } else if (annotation instanceof InterfaceC64997Pf7) {
                            LJII(i, type);
                            Class<?> LJFF13 = C65139PhP.LJFF(type);
                            this.LJIIZILJ = true;
                            if (java.util.Map.class.isAssignableFrom(LJFF13)) {
                                Type LJI7 = C65139PhP.LJI(type, LJFF13, java.util.Map.class);
                                if (LJI7 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType5 = (ParameterizedType) LJI7;
                                    Type LJ7 = C65139PhP.LJ(0, parameterizedType5);
                                    if (String.class == LJ7) {
                                        c64942PeE = new C64927Pdz<>(i, this.LIZ.LJI(C65139PhP.LJ(1, parameterizedType5), annotationArr), this.LIZIZ, !((InterfaceC64997Pf7) annotation).encoded());
                                    } else {
                                        Method method13 = this.LIZIZ;
                                        StringBuilder LIZ14 = X1D.LIZ();
                                        LIZ14.append("@QueryMap keys must be of type String: ");
                                        LIZ14.append(LJ7);
                                        throw C65139PhP.LJIIJ(method13, i, X1D.LIZIZ(LIZ14), new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@QueryMap parameter type must be Map.", new Object[0]);
                            }
                        } else if (annotation instanceof InterfaceC65002PfC) {
                            LJII(i, type);
                            String value8 = ((InterfaceC65002PfC) annotation).value();
                            Class<?> LJFF14 = C65139PhP.LJFF(type);
                            if (Iterable.class.isAssignableFrom(LJFF14)) {
                                if (type instanceof ParameterizedType) {
                                    c64942PeE = new C64947PeJ(new C64936Pe8(value8, this.LIZ.LJI(C65139PhP.LJ(0, (ParameterizedType) type), annotationArr)));
                                } else {
                                    Method method14 = this.LIZIZ;
                                    StringBuilder LIZ15 = X1D.LIZ();
                                    LIZ15.append(C16880lQ.LJLLJ(LJFF14));
                                    LIZ15.append(" must include generic type (e.g., ");
                                    LIZ15.append(C16880lQ.LJLLJ(LJFF14));
                                    LIZ15.append("<String>)");
                                    throw C65139PhP.LJIIJ(method14, i, X1D.LIZIZ(LIZ15), new Object[0]);
                                }
                            } else if (LJFF14.isArray()) {
                                c64942PeE = new C64948PeK(new C64936Pe8(value8, this.LIZ.LJI(LIZ(LJFF14.getComponentType()), annotationArr)));
                            } else {
                                c64942PeE = new C64936Pe8<>(value8, this.LIZ.LJI(type, annotationArr));
                            }
                        } else if (annotation instanceof InterfaceC36315ENb) {
                            LJII(i, type);
                            Class<?> LJFF15 = C65139PhP.LJFF(type);
                            if (java.util.Map.class.isAssignableFrom(LJFF15)) {
                                Type LJI8 = C65139PhP.LJI(type, LJFF15, java.util.Map.class);
                                if (LJI8 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType6 = (ParameterizedType) LJI8;
                                    Type LJ8 = C65139PhP.LJ(0, parameterizedType6);
                                    if (String.class == LJ8) {
                                        c64942PeE = new C64928Pe0<>(this.LIZIZ, i, this.LIZ.LJI(C65139PhP.LJ(1, parameterizedType6), annotationArr));
                                    } else {
                                        Method method15 = this.LIZIZ;
                                        StringBuilder LIZ16 = X1D.LIZ();
                                        LIZ16.append("@HeaderMap keys must be of type String: ");
                                        LIZ16.append(LJ8);
                                        throw C65139PhP.LJIIJ(method15, i, X1D.LIZIZ(LIZ16), new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                            }
                        } else if (annotation instanceof InterfaceC64987Pex) {
                            LJII(i, type);
                            if (this.LJIL) {
                                InterfaceC64987Pex interfaceC64987Pex = (InterfaceC64987Pex) annotation;
                                String value9 = interfaceC64987Pex.value();
                                boolean encoded4 = interfaceC64987Pex.encoded();
                                this.LJIIJJI = true;
                                Class<?> LJFF16 = C65139PhP.LJFF(type);
                                if (Iterable.class.isAssignableFrom(LJFF16)) {
                                    if (type instanceof ParameterizedType) {
                                        c64942PeE = new C64947PeJ(new C64932Pe4(value9, this.LIZ.LJI(C65139PhP.LJ(0, (ParameterizedType) type), annotationArr), !encoded4));
                                    } else {
                                        Method method16 = this.LIZIZ;
                                        StringBuilder LIZ17 = X1D.LIZ();
                                        LIZ17.append(C16880lQ.LJLLJ(LJFF16));
                                        LIZ17.append(" must include generic type (e.g., ");
                                        LIZ17.append(C16880lQ.LJLLJ(LJFF16));
                                        LIZ17.append("<String>)");
                                        throw C65139PhP.LJIIJ(method16, i, X1D.LIZIZ(LIZ17), new Object[0]);
                                    }
                                } else if (LJFF16.isArray()) {
                                    c64942PeE = new C64948PeK(new C64932Pe4(value9, this.LIZ.LJI(LIZ(LJFF16.getComponentType()), annotationArr), !encoded4));
                                } else {
                                    c64942PeE = new C64932Pe4<>(value9, this.LIZ.LJI(type, annotationArr), !encoded4);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof InterfaceC64992Pf2) {
                            LJII(i, type);
                            if (this.LJIL) {
                                Class<?> LJFF17 = C65139PhP.LJFF(type);
                                if (java.util.Map.class.isAssignableFrom(LJFF17)) {
                                    Type LJI9 = C65139PhP.LJI(type, LJFF17, java.util.Map.class);
                                    if (LJI9 instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType7 = (ParameterizedType) LJI9;
                                        Type LJ9 = C65139PhP.LJ(0, parameterizedType7);
                                        if (String.class == LJ9) {
                                            InterfaceC65016PfQ<T, String> LJI10 = this.LIZ.LJI(C65139PhP.LJ(1, parameterizedType7), annotationArr);
                                            this.LJIIJJI = true;
                                            c64942PeE = new C64926Pdy<>(i, LJI10, this.LIZIZ, !((InterfaceC64992Pf2) annotation).encoded());
                                        } else {
                                            Method method17 = this.LIZIZ;
                                            StringBuilder LIZ18 = X1D.LIZ();
                                            LIZ18.append("@FieldMap keys must be of type String: ");
                                            LIZ18.append(LJ9);
                                            throw C65139PhP.LJIIJ(method17, i, X1D.LIZIZ(LIZ18), new Object[0]);
                                        }
                                    } else {
                                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "@FieldMap parameter type must be Map.", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof InterfaceC64978Peo) {
                            if (this.LJJ) {
                                InterfaceC64978Peo interfaceC64978Peo = (InterfaceC64978Peo) annotation;
                                this.LJIIL = true;
                                c64942PeE = LJFF(type, interfaceC64978Peo.value(), interfaceC64978Peo.encoding());
                                if (c64942PeE == null) {
                                    c64942PeE = new C64931Pe3<>(i, this.LIZ.LJ(type, annotationArr, this.LIZJ), interfaceC64978Peo.value(), this.LIZIZ);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof InterfaceC64983Pet) {
                            LJII(i, type);
                            if (this.LJJ) {
                                this.LJIIL = true;
                                Class<?> LJFF18 = C65139PhP.LJFF(type);
                                if (java.util.Map.class.isAssignableFrom(LJFF18)) {
                                    Type LJI11 = C65139PhP.LJI(type, LJFF18, java.util.Map.class);
                                    if (LJI11 instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType8 = (ParameterizedType) LJI11;
                                        Type LJ10 = C65139PhP.LJ(0, parameterizedType8);
                                        if (String.class == LJ10) {
                                            Type LJ11 = C65139PhP.LJ(1, parameterizedType8);
                                            if (!C64553PVd.class.isAssignableFrom(C65139PhP.LJFF(LJ11))) {
                                                c64942PeE = new C64929Pe1<>(i, this.LIZ.LJ(LJ11, annotationArr, this.LIZJ), ((InterfaceC64983Pet) annotation).encoding(), this.LIZIZ);
                                            } else {
                                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                            }
                                        } else {
                                            Method method18 = this.LIZIZ;
                                            StringBuilder LIZ19 = X1D.LIZ();
                                            LIZ19.append("@PartMap keys must be of type String: ");
                                            LIZ19.append(LJ10);
                                            throw C65139PhP.LJIIJ(method18, i, X1D.LIZIZ(LIZ19), new Object[0]);
                                        }
                                    } else {
                                        throw C65139PhP.LJIIJ(this.LIZIZ, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "@PartMap parameter type must be Map.", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof InterfaceC27211Am7) {
                            LJII(i, type);
                            if (!this.LJIL && !this.LJJ) {
                                if (!this.LJIILIIL) {
                                    if (PVP.class.isAssignableFrom(C65139PhP.LJFF(type)) && (c64942PeE = C64940PeC.LIZ) != null) {
                                        this.LJIILIIL = true;
                                    } else {
                                        try {
                                            InterfaceC65016PfQ<T, TypedOutput> LJ12 = this.LIZ.LJ(type, annotationArr, this.LIZJ);
                                            this.LJIILIIL = true;
                                            c64942PeE = new C64933Pe5<>(i, LJ12, this.LIZIZ, this.LJIIIZ);
                                        } catch (RuntimeException e5) {
                                            throw C65139PhP.LJIIJJI(this.LIZIZ, e5, i, "Unable to create @Body converter for %s", type);
                                        }
                                    }
                                } else {
                                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "Multiple @Body method annotations found.", new Object[0]);
                                }
                            } else {
                                throw C65139PhP.LJIIJ(this.LIZIZ, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof InterfaceC27212Am8) {
                            LJII(i, type);
                            Class<?> LJFF19 = C65139PhP.LJFF(type);
                            for (int i4 = i - 1; i4 >= 0; i4--) {
                                AbstractC64937Pe9<?> abstractC64937Pe93 = this.LJJIIJZLJL[i4];
                                if ((abstractC64937Pe93 instanceof C64946PeI) && ((C64946PeI) abstractC64937Pe93).LIZ.equals(LJFF19)) {
                                    Method method19 = this.LIZIZ;
                                    StringBuilder LIZ20 = X1D.LIZ();
                                    LIZ20.append("@Tag type ");
                                    LIZ20.append(LJFF19.getName());
                                    LIZ20.append(" is duplicate of parameter #");
                                    LIZ20.append(i4 + 1);
                                    LIZ20.append(" and would always overwrite its value.");
                                    throw C65139PhP.LJIIJ(method19, i, X1D.LIZIZ(LIZ20), new Object[0]);
                                }
                            }
                            c64942PeE = new C64946PeI<>(LJFF19);
                        } else {
                            continue;
                        }
                    }
                }
                if (abstractC64937Pe9 == null) {
                    abstractC64937Pe9 = c64942PeE;
                } else {
                    throw C65139PhP.LJIIJ(this.LIZIZ, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                }
            }
            if (abstractC64937Pe9 != null) {
                return abstractC64937Pe9;
            }
        }
        if (z) {
            try {
                if (C65139PhP.LJFF(type) == InterfaceC67352kd.class) {
                    this.LJJIIZ = true;
                    return null;
                }
            } catch (NoClassDefFoundError unused) {
            }
        }
        throw C65139PhP.LJIIJ(this.LIZIZ, i, "No Retrofit annotation found.", new Object[0]);
    }
}
