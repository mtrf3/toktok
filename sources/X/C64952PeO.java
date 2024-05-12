package X;

import com.bytedance.retrofit2.mime.TypedOutput;
import defpackage.b1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.PeO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64952PeO<T> {
    public final C65019PfT LIZ;
    public final Method LIZIZ;
    public final Annotation[] LIZJ;
    public final Annotation[][] LIZLLL;
    public final Type[] LJ;
    public final InterfaceC65003PfD LJFF;
    public InterfaceC65014PfO<?, ?> LJI;
    public Type LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public String LJIILL;
    public AbstractC64964Pea<?>[] LJIILLIIL;
    public InterfaceC65048Pfw LJIIZILJ;
    public long LJIJ = -1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.Pek] */
    /* JADX WARN: Type inference failed for: r5v15, types: [X.Peb] */
    /* JADX WARN: Type inference failed for: r5v19, types: [X.PeS] */
    /* JADX WARN: Type inference failed for: r5v20, types: [X.PeV] */
    /* JADX WARN: Type inference failed for: r5v21, types: [X.Pek] */
    /* JADX WARN: Type inference failed for: r5v22, types: [X.Peb] */
    /* JADX WARN: Type inference failed for: r5v27, types: [X.Pef] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.Pec] */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.PeR] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.PeU] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.Pea<?>[]] */
    public final C64971Peh LIZ() {
        C73410SrW c73410SrW;
        Throwable th;
        Type genericReturnType = this.LIZIZ.getGenericReturnType();
        Throwable th2 = null;
        int i = 1;
        int i2 = 0;
        if (!C65140PhQ.LJFF(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                Class<?> returnClass = C65140PhQ.LJ(genericReturnType);
                this.LJFF.getClass();
                o.LJIIIZ(returnClass, "returnClass");
                Iterator it = ((ArrayList) C65009PfJ.LIZ).iterator();
                while (true) {
                    if (it.hasNext()) {
                        c73410SrW = ((InterfaceC65001PfB) it.next()).LIZ(returnClass);
                        if (c73410SrW != null) {
                            break;
                        }
                    } else {
                        c73410SrW = null;
                        break;
                    }
                }
                this.LJIIZILJ = c73410SrW;
                if (c73410SrW != null) {
                    try {
                        InterfaceC65014PfO<?, ?> LIZJ = this.LIZ.LIZJ(null, genericReturnType, this.LIZIZ.getAnnotations());
                        this.LJI = LIZJ;
                        this.LJII = LIZJ.LIZ();
                        for (Annotation annotation : this.LIZJ) {
                            if (!(annotation instanceof InterfaceC36317ENd)) {
                                if (annotation instanceof E8L) {
                                    LJ("GET", ((E8L) annotation).value(), false);
                                } else if (!(annotation instanceof InterfaceC36325ENl)) {
                                    if (!(annotation instanceof InterfaceC36337ENx)) {
                                        if (annotation instanceof E8M) {
                                            LJ("POST", ((E8M) annotation).value(), true);
                                        } else if (!(annotation instanceof InterfaceC36318ENe)) {
                                            if (!(annotation instanceof InterfaceC36324ENk)) {
                                                if (!(annotation instanceof InterfaceC36326ENm)) {
                                                    if (!(annotation instanceof EKC)) {
                                                        if (!(annotation instanceof ENY)) {
                                                            if (annotation instanceof InterfaceC195757mF) {
                                                                this.LJIILJJIL = true;
                                                            } else if (!(annotation instanceof ENX)) {
                                                                if (!(annotation instanceof E6L)) {
                                                                    if (!(annotation instanceof InterfaceC61611OFz)) {
                                                                        if (annotation instanceof InterfaceC65000PfA) {
                                                                            this.LJIJ = ((InterfaceC65000PfA) annotation).value();
                                                                        }
                                                                    } else {
                                                                        throw LIZJ("ServiceType", new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw LIZJ("Priority", new Object[0]);
                                                                }
                                                            } else {
                                                                throw LIZJ("Streaming", new Object[0]);
                                                            }
                                                        } else {
                                                            throw LIZJ("Multipart", new Object[0]);
                                                        }
                                                    } else {
                                                        throw LIZJ("Headers", new Object[0]);
                                                    }
                                                } else {
                                                    throw LIZJ("HTTP", new Object[0]);
                                                }
                                            } else {
                                                throw LIZJ("OPTIONS", new Object[0]);
                                            }
                                        } else {
                                            throw LIZJ("PUT", new Object[0]);
                                        }
                                    } else {
                                        throw LIZJ("PATCH", new Object[0]);
                                    }
                                } else {
                                    throw LIZJ("HEAD", new Object[0]);
                                }
                            } else {
                                throw LIZJ("DELETE", new Object[0]);
                            }
                        }
                        if (this.LJIIL != null) {
                            if (this.LJIILIIL || !this.LJIILJJIL) {
                                int length = this.LIZLLL.length;
                                this.LJIILLIIL = new AbstractC64964Pea[length];
                                int i3 = 0;
                                while (i3 < length) {
                                    Type type = this.LJ[i3];
                                    if (!C65140PhQ.LJFF(type)) {
                                        Annotation[] annotationArr = this.LIZLLL[i3];
                                        if (annotationArr != null) {
                                            ?? r9 = this.LJIILLIIL;
                                            int length2 = annotationArr.length;
                                            int i4 = 0;
                                            int i5 = i;
                                            while (i4 < length2) {
                                                Annotation annotation2 = annotationArr[i4];
                                                if (annotation2 instanceof InterfaceC195747mE) {
                                                    if (!this.LJIIJJI) {
                                                        if (!this.LJIIJ) {
                                                            if (this.LJIILL == null) {
                                                                this.LJIIJJI = i5;
                                                                if (type == String.class || type == java.net.URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                                                                    th = new C64969Pef();
                                                                } else {
                                                                    throw LIZLLL("@Url must be String, java.net.URI, or android.net.Uri type.", i3, new Object[i2]);
                                                                }
                                                            } else {
                                                                Object[] objArr = new Object[i5];
                                                                objArr[i2] = this.LJIIL;
                                                                throw LIZLLL("@Url cannot be used with @%s URL", i3, objArr);
                                                            }
                                                        } else {
                                                            throw LIZLLL("A @Url parameter must not come after a @Query", i3, new Object[i2]);
                                                        }
                                                    } else {
                                                        throw LIZLLL("Multiple @Url method annotations found.", i3, new Object[i2]);
                                                    }
                                                } else if (!(annotation2 instanceof InterfaceC36332ENs)) {
                                                    if (annotation2 instanceof InterfaceC64986Pew) {
                                                        InterfaceC64986Pew interfaceC64986Pew = (InterfaceC64986Pew) annotation2;
                                                        String value = interfaceC64986Pew.value();
                                                        boolean encode = interfaceC64986Pew.encode();
                                                        Class<?> LJ = C65140PhQ.LJ(type);
                                                        this.LJIIJ = i5;
                                                        if (Iterable.class.isAssignableFrom(LJ)) {
                                                            if (type instanceof ParameterizedType) {
                                                                th = new C64965Peb(new C64959PeV(value, this.LIZ.LJI(C65140PhQ.LIZLLL(0, (ParameterizedType) type), annotationArr), encode));
                                                            } else {
                                                                StringBuilder LIZ = X1D.LIZ();
                                                                LIZ.append(C16880lQ.LJLLJ(LJ));
                                                                LIZ.append(" must include generic type (e.g., ");
                                                                LIZ.append(C16880lQ.LJLLJ(LJ));
                                                                LIZ.append("<String>)");
                                                                throw LIZLLL(X1D.LIZIZ(LIZ), i3, new Object[0]);
                                                            }
                                                        } else if (LJ.isArray()) {
                                                            th = new C64974Pek(new C64959PeV(value, this.LIZ.LJI(C64971Peh.LIZ(LJ.getComponentType()), annotationArr), encode));
                                                        } else {
                                                            th = new C64959PeV(value, this.LIZ.LJI(type, annotationArr), encode);
                                                        }
                                                    } else if (!(annotation2 instanceof InterfaceC64990Pf0)) {
                                                        if (annotation2 instanceof InterfaceC36228EJs) {
                                                            Class<?> LJ2 = C65140PhQ.LJ(type);
                                                            if (java.util.Map.class.isAssignableFrom(LJ2)) {
                                                                if (java.util.Map.class.isAssignableFrom(LJ2)) {
                                                                    Type LJI = C65140PhQ.LJI(type, LJ2, C65140PhQ.LIZJ(type, LJ2, java.util.Map.class));
                                                                    if (LJI instanceof ParameterizedType) {
                                                                        ParameterizedType parameterizedType = (ParameterizedType) LJI;
                                                                        Type LIZLLL = C65140PhQ.LIZLLL(0, parameterizedType);
                                                                        if (String.class == LIZLLL) {
                                                                            th = new C64956PeS(this.LIZ.LJI(C65140PhQ.LIZLLL(1, parameterizedType), annotationArr), ((InterfaceC36228EJs) annotation2).encode());
                                                                        } else {
                                                                            StringBuilder LIZ2 = X1D.LIZ();
                                                                            LIZ2.append("@QueryMap keys must be of type String: ");
                                                                            LIZ2.append(LIZLLL);
                                                                            throw LIZLLL(X1D.LIZIZ(LIZ2), i3, new Object[0]);
                                                                        }
                                                                    } else {
                                                                        throw LIZLLL("Map must include generic types (e.g., Map<String, String>)", i3, new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                            } else {
                                                                throw LIZLLL("@QueryMap parameter type must be Map.", i3, new Object[0]);
                                                            }
                                                        } else if (!(annotation2 instanceof InterfaceC36348EOi)) {
                                                            if (!(annotation2 instanceof InterfaceC195767mG)) {
                                                                if (!(annotation2 instanceof InterfaceC30952CCu)) {
                                                                    if (annotation2 instanceof InterfaceC64985Pev) {
                                                                        if (this.LJIILJJIL) {
                                                                            InterfaceC64985Pev interfaceC64985Pev = (InterfaceC64985Pev) annotation2;
                                                                            String value2 = interfaceC64985Pev.value();
                                                                            boolean encode2 = interfaceC64985Pev.encode();
                                                                            this.LJIIIIZZ = true;
                                                                            Class<?> LJ3 = C65140PhQ.LJ(type);
                                                                            if (Iterable.class.isAssignableFrom(LJ3)) {
                                                                                if (type instanceof ParameterizedType) {
                                                                                    th = new C64965Peb(new C64958PeU(value2, this.LIZ.LJI(C65140PhQ.LIZLLL(0, (ParameterizedType) type), annotationArr), encode2));
                                                                                } else {
                                                                                    StringBuilder LIZ3 = X1D.LIZ();
                                                                                    LIZ3.append(C16880lQ.LJLLJ(LJ3));
                                                                                    LIZ3.append(" must include generic type (e.g., ");
                                                                                    LIZ3.append(C16880lQ.LJLLJ(LJ3));
                                                                                    LIZ3.append("<String>)");
                                                                                    throw LIZLLL(X1D.LIZIZ(LIZ3), i3, new Object[0]);
                                                                                }
                                                                            } else if (LJ3.isArray()) {
                                                                                th = new C64974Pek(new C64958PeU(value2, this.LIZ.LJI(C64971Peh.LIZ(LJ3.getComponentType()), annotationArr), encode2));
                                                                            } else {
                                                                                th = new C64958PeU(value2, this.LIZ.LJI(type, annotationArr), encode2);
                                                                            }
                                                                        } else {
                                                                            throw LIZLLL("@Field parameters can only be used with form encoding.", i3, new Object[0]);
                                                                        }
                                                                    } else if (annotation2 instanceof InterfaceC36229EJt) {
                                                                        if (this.LJIILJJIL) {
                                                                            Class<?> LJ4 = C65140PhQ.LJ(type);
                                                                            if (java.util.Map.class.isAssignableFrom(LJ4)) {
                                                                                if (java.util.Map.class.isAssignableFrom(LJ4)) {
                                                                                    Type LJI2 = C65140PhQ.LJI(type, LJ4, C65140PhQ.LIZJ(type, LJ4, java.util.Map.class));
                                                                                    if (LJI2 instanceof ParameterizedType) {
                                                                                        ParameterizedType parameterizedType2 = (ParameterizedType) LJI2;
                                                                                        Type LIZLLL2 = C65140PhQ.LIZLLL(0, parameterizedType2);
                                                                                        if (String.class == LIZLLL2) {
                                                                                            InterfaceC65016PfQ<T, String> LJI3 = this.LIZ.LJI(C65140PhQ.LIZLLL(1, parameterizedType2), annotationArr);
                                                                                            this.LJIIIIZZ = true;
                                                                                            th = new C64955PeR(LJI3, ((InterfaceC36229EJt) annotation2).encode());
                                                                                        } else {
                                                                                            StringBuilder LIZ4 = X1D.LIZ();
                                                                                            LIZ4.append("@FieldMap keys must be of type String: ");
                                                                                            LIZ4.append(LIZLLL2);
                                                                                            throw LIZLLL(X1D.LIZIZ(LIZ4), i3, new Object[0]);
                                                                                        }
                                                                                    } else {
                                                                                        throw LIZLLL("Map must include generic types (e.g., Map<String, String>)", i3, new Object[0]);
                                                                                    }
                                                                                } else {
                                                                                    throw new IllegalArgumentException();
                                                                                }
                                                                            } else {
                                                                                throw LIZLLL("@FieldMap parameter type must be Map.", i3, new Object[0]);
                                                                            }
                                                                        } else {
                                                                            throw LIZLLL("@FieldMap parameters can only be used with form encoding.", i3, new Object[0]);
                                                                        }
                                                                    } else if (!(annotation2 instanceof InterfaceC64977Pen)) {
                                                                        if (!(annotation2 instanceof InterfaceC64982Pes)) {
                                                                            if (annotation2 instanceof InterfaceC195727mC) {
                                                                                if (!this.LJIILJJIL) {
                                                                                    if (!this.LJIIIZ) {
                                                                                        if (!PVP.class.isAssignableFrom(C65140PhQ.LJ(type))) {
                                                                                            try {
                                                                                                InterfaceC65016PfQ<T, TypedOutput> LJ5 = this.LIZ.LJ(type, annotationArr, this.LIZJ);
                                                                                                this.LJIIIZ = true;
                                                                                                th = new C64966Pec(LJ5);
                                                                                            } catch (RuntimeException e) {
                                                                                                Object[] objArr2 = {type};
                                                                                                StringBuilder LIZJ2 = b1.LIZJ("Unable to create @Body converter for %s", " (parameter #");
                                                                                                LIZJ2.append(i3 + 1);
                                                                                                LIZJ2.append(")");
                                                                                                throw LIZIZ(X1D.LIZIZ(LIZJ2), e, objArr2);
                                                                                            }
                                                                                        } else {
                                                                                            throw LIZIZ("uplink not support RequestBody", null, new Object[0]);
                                                                                        }
                                                                                    } else {
                                                                                        throw LIZLLL("Multiple @Body method annotations found.", i3, new Object[0]);
                                                                                    }
                                                                                } else {
                                                                                    throw LIZLLL("@Body parameters cannot be used with form or multi-part encoding.", i3, new Object[0]);
                                                                                }
                                                                            } else {
                                                                                if (!(annotation2 instanceof InterfaceC36331ENr)) {
                                                                                    if (!(annotation2 instanceof ENW)) {
                                                                                        if (!(annotation2 instanceof InterfaceC30951CCt)) {
                                                                                            if (!(annotation2 instanceof InterfaceC195737mD)) {
                                                                                                if (!(annotation2 instanceof InterfaceC65006PfG)) {
                                                                                                    if (annotation2 instanceof InterfaceC65005PfF) {
                                                                                                        throw LIZJ("Tag", new Object[0]);
                                                                                                    }
                                                                                                    throw LIZJ(annotation2.toString(), new Object[0]);
                                                                                                }
                                                                                                throw LIZJ("QueryObject", new Object[0]);
                                                                                            }
                                                                                            throw LIZJ("ExtraInfo", new Object[0]);
                                                                                        }
                                                                                        throw LIZJ("AddCommonParam", new Object[0]);
                                                                                    }
                                                                                    throw LIZJ("MaxLength", new Object[0]);
                                                                                }
                                                                                throw LIZJ("Method", new Object[0]);
                                                                            }
                                                                        } else {
                                                                            throw LIZJ("PartMap", new Object[0]);
                                                                        }
                                                                    } else {
                                                                        throw LIZJ("Part", new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw LIZJ("HeaderMap", new Object[0]);
                                                                }
                                                            } else {
                                                                throw LIZJ("HeaderList", new Object[0]);
                                                            }
                                                        } else {
                                                            throw LIZJ("Header", new Object[0]);
                                                        }
                                                    } else {
                                                        throw LIZJ("QueryName", new Object[0]);
                                                    }
                                                } else {
                                                    throw LIZJ("Path", new Object[0]);
                                                }
                                                if (th2 == null) {
                                                    i4++;
                                                    i2 = 0;
                                                    th2 = th;
                                                    i5 = 1;
                                                } else {
                                                    throw LIZLLL("Multiple Retrofit annotations found, only one allowed.", i3, new Object[0]);
                                                }
                                            }
                                            if (th2 != null) {
                                                r9[i3] = th2;
                                                i3++;
                                                th2 = null;
                                                i = 1;
                                            } else {
                                                throw LIZLLL("No Retrofit annotation found.", i3, new Object[i2]);
                                            }
                                        } else {
                                            throw LIZLLL("No Retrofit annotation found.", i3, new Object[i2]);
                                        }
                                    } else {
                                        Object[] objArr3 = new Object[i];
                                        objArr3[i2] = type;
                                        throw LIZLLL("Parameter type must not include a type variable or wildcard: %s", i3, objArr3);
                                    }
                                }
                                if (this.LJIILL != null || this.LJIIJJI) {
                                    boolean z = this.LJIILJJIL;
                                    if (!z) {
                                        if (!this.LJIILIIL && this.LJIIIZ) {
                                            throw LIZIZ("Non-body HTTP method cannot contain @Body.", th2, new Object[i2]);
                                        }
                                    } else if (z && !this.LJIIIIZZ) {
                                        throw LIZIZ("Form-encode method must contain at least one @Field.", th2, new Object[i2]);
                                    }
                                    return new C64971Peh(this);
                                }
                                Object[] objArr4 = new Object[i];
                                objArr4[i2] = this.LJIIL;
                                throw LIZIZ("Missing either @%s URL or @Url parameter.", null, objArr4);
                            }
                            throw LIZIZ("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", null, new Object[0]);
                        }
                        throw LIZIZ("HTTP method annotation is required (e.g., @GET, @POST, etc.).", null, new Object[0]);
                    } catch (RuntimeException e2) {
                        throw LIZIZ("Unable to create call adapter for %s", e2, genericReturnType);
                    }
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Uplink Service Could not locate request adapter for: ");
                LIZ5.append(genericReturnType);
                throw LIZIZ(X1D.LIZIZ(LIZ5), null, new Object[0]);
            }
            throw LIZIZ("Service methods cannot return void.", null, new Object[0]);
        }
        throw LIZIZ("Method return type must not include a type variable or wildcard: %s", null, genericReturnType);
    }

    public final RuntimeException LIZJ(String str, Object... objArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uplink not support annotation: ");
        LIZ.append(str);
        return LIZIZ(X1D.LIZIZ(LIZ), null, objArr);
    }

    public C64952PeO(C65019PfT c65019PfT, Method method, C65045Pft c65045Pft) {
        this.LIZ = c65019PfT;
        this.LIZIZ = method;
        this.LIZJ = method.getAnnotations();
        this.LJ = method.getGenericParameterTypes();
        this.LIZLLL = method.getParameterAnnotations();
        this.LJFF = c65045Pft;
    }

    public final RuntimeException LIZIZ(String str, Throwable th, Object... objArr) {
        StringBuilder LIZJ = b1.LIZJ(C16880lQ.LLLZ(str, objArr), "\n    for method ");
        LIZJ.append(C16880lQ.LJLLJ(this.LIZIZ.getDeclaringClass()));
        LIZJ.append(".");
        LIZJ.append(this.LIZIZ.getName());
        return new IllegalArgumentException(X1D.LIZIZ(LIZJ), th);
    }

    public final RuntimeException LIZLLL(String str, int i, Object... objArr) {
        StringBuilder LIZJ = b1.LIZJ(str, " (parameter #");
        LIZJ.append(i + 1);
        LIZJ.append(")");
        return LIZIZ(X1D.LIZIZ(LIZJ), null, objArr);
    }

    public final void LJ(String str, String str2, boolean z) {
        String str3 = this.LJIIL;
        if (str3 == null) {
            this.LJIIL = str;
            Pattern pattern = C64971Peh.LJIIIIZZ;
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                matcher.group(1);
            }
            this.LJIILIIL = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw LIZIZ("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", null, substring);
                }
            }
            this.LJIILL = str2;
            Matcher matcher2 = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher2.find()) {
                linkedHashSet.add(matcher2.group(1));
            }
            return;
        }
        throw LIZIZ("Only one HTTP method is allowed. Found: %s and %s.", null, str3, str);
    }
}
