package X;

import android.os.SystemClock;
import com.bytedance.retrofit2.RequestFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: X.PeQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64954PeQ<T> {
    public abstract T LIZ(Object[] objArr);

    public static AbstractC64962PeY LIZIZ(C65019PfT c65019PfT, Method method, C64738Paw c64738Paw) {
        Type genericReturnType;
        boolean z;
        c64738Paw.LJIIL = SystemClock.uptimeMillis();
        RequestFactory parseAnnotations = RequestFactory.parseAnnotations(c65019PfT, method, c64738Paw);
        Type genericReturnType2 = method.getGenericReturnType();
        if (!C65139PhP.LJII(genericReturnType2)) {
            if (genericReturnType2 != Void.TYPE) {
                c64738Paw.LJIILIIL = SystemClock.uptimeMillis();
                boolean z2 = parseAnnotations.isKotlinSuspendFunction;
                Annotation[] annotations = method.getAnnotations();
                if (z2) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type type = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type instanceof WildcardType) {
                        type = ((WildcardType) type).getLowerBounds()[0];
                    }
                    if (C65139PhP.LJFF(type) == C64797Pbt.class && (type instanceof ParameterizedType)) {
                        type = C65139PhP.LJ(0, (ParameterizedType) type);
                        z = true;
                    } else {
                        z = false;
                    }
                    genericReturnType = new C65136PhM(null, InterfaceC37276Ek4.class, type);
                    if (!C65139PhP.LJIIIIZZ(annotations, InterfaceC65004PfE.class)) {
                        Annotation[] annotationArr = new Annotation[annotations.length + 1];
                        annotationArr[0] = C64967Ped.LJIIIIZZ;
                        System.arraycopy(annotations, 0, annotationArr, 1, annotations.length);
                        annotations = annotationArr;
                    }
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                }
                try {
                    InterfaceC65014PfO<?, ?> LIZJ = c65019PfT.LIZJ(null, genericReturnType, annotations);
                    Type LIZ = LIZJ.LIZ();
                    if (LIZ != C64598PWw.class) {
                        if (LIZ != C64797Pbt.class) {
                            if (LIZ != C36910EeA.class) {
                                if (!parseAnnotations.httpMethod.equals("HEAD") || Void.class.equals(LIZ)) {
                                    try {
                                        parseAnnotations.responseConverter = c65019PfT.LJFF(LIZ, method.getAnnotations());
                                        if (!z2) {
                                            return new C64963PeZ(parseAnnotations, LIZJ);
                                        }
                                        if (z) {
                                            return new C65305Pk5(parseAnnotations, LIZJ);
                                        }
                                        return new C65306Pk6(parseAnnotations, LIZJ);
                                    } catch (RuntimeException e) {
                                        throw C65139PhP.LJIIIZ(method, e, "Unable to create converter for %s", LIZ);
                                    }
                                }
                                throw C65139PhP.LJIIIZ(method, null, "HEAD method must use Void as response type.", new Object[0]);
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("'");
                            LIZ2.append(C65139PhP.LJFF(LIZ).getName());
                            LIZ2.append("' is not a valid response body type.");
                            throw C65139PhP.LJIIIZ(method, null, X1D.LIZIZ(LIZ2), new Object[0]);
                        }
                        throw C65139PhP.LJIIIZ(method, null, "Response must include generic type (e.g., SsResponse<String>)", new Object[0]);
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("'");
                    LIZ3.append(C65139PhP.LJFF(LIZ).getName());
                    LIZ3.append("' is not a valid response body type. Did you mean ResponseBody?");
                    throw C65139PhP.LJIIIZ(method, null, X1D.LIZIZ(LIZ3), new Object[0]);
                } catch (RuntimeException e2) {
                    throw C65139PhP.LJIIIZ(method, e2, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            throw C65139PhP.LJIIIZ(method, null, "Service methods cannot return void.", new Object[0]);
        }
        throw C65139PhP.LJIIIZ(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
    }
}
