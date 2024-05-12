package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.PfT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65019PfT {
    public static volatile CopyOnWriteArrayList<InterfaceC37216Ej6> LJIIIZ;
    public final InterfaceC64805Pc1 LIZIZ;
    public final InterfaceC64660PZg LIZJ;
    public final List<AbstractC65022PfW> LIZLLL;
    public final List<AbstractC65069PgH> LJ;
    public final Executor LJFF;
    public final Executor LJII;
    public final List<InterfaceC37216Ej6> LJIIIIZZ;
    public final java.util.Map<Method, AbstractC64954PeQ<?>> LIZ = new ConcurrentHashMap();
    public final boolean LJI = false;

    public final <T> T LIZ(Class<T> cls) {
        if (cls.isInterface()) {
            if (cls.getInterfaces().length <= 0) {
                if (this.LJI) {
                    C65065PgD c65065PgD = C65065PgD.LIZ;
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!c65065PgD.LJ(method) && !Modifier.isStatic(method.getModifiers())) {
                            LIZIZ(method);
                        }
                    }
                }
                return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C66615QCl(this, cls));
            }
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final AbstractC64954PeQ<?> LIZIZ(Method method) {
        AbstractC64954PeQ<?> abstractC64954PeQ;
        AbstractC64954PeQ<?> abstractC64954PeQ2 = (AbstractC64954PeQ) ((ConcurrentHashMap) this.LIZ).get(method);
        if (abstractC64954PeQ2 != null) {
            if (abstractC64954PeQ2 instanceof AbstractC64962PeY) {
                ((AbstractC64962PeY) abstractC64954PeQ2).LIZ.retrofitMetrics = new C64738Paw(true);
            }
            return abstractC64954PeQ2;
        }
        synchronized (this.LIZ) {
            abstractC64954PeQ = (AbstractC64954PeQ) ((ConcurrentHashMap) this.LIZ).get(method);
            if (abstractC64954PeQ == null) {
                abstractC64954PeQ = AbstractC64954PeQ.LIZIZ(this, method, new C64738Paw(false));
                ((ConcurrentHashMap) this.LIZ).put(method, abstractC64954PeQ);
            }
        }
        return abstractC64954PeQ;
    }

    public final <T> InterfaceC65016PfQ<T, Object> LIZLLL(Type type, Annotation[] annotationArr) {
        C65139PhP.LIZ(type, "type == null");
        C65139PhP.LIZ(annotationArr, "annotations == null");
        int size = this.LIZLLL.size();
        for (int i = 0; i < size; i++) {
            InterfaceC65016PfQ<T, Object> LIZIZ = ((AbstractC65022PfW) ListProtector.get(this.LIZLLL, i)).LIZIZ(type);
            if (LIZIZ != null) {
                return LIZIZ;
            }
        }
        throw new IllegalArgumentException("Could not locate object converter");
    }

    public final <T> InterfaceC65016PfQ<TypedInput, T> LJFF(Type type, Annotation[] annotationArr) {
        C65139PhP.LIZ(type, "type == null");
        C65139PhP.LIZ(annotationArr, "annotations == null");
        int indexOf = this.LIZLLL.indexOf(null) + 1;
        int size = this.LIZLLL.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC65016PfQ<TypedInput, T> interfaceC65016PfQ = (InterfaceC65016PfQ<TypedInput, T>) ((AbstractC65022PfW) ListProtector.get(this.LIZLLL, i)).LIZLLL(type, annotationArr, this);
            if (interfaceC65016PfQ != null) {
                return interfaceC65016PfQ;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate TypedInput converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.LIZLLL.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LIZLLL, indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> InterfaceC65016PfQ<T, String> LJI(Type type, Annotation[] annotationArr) {
        C65139PhP.LIZ(type, "type == null");
        C65139PhP.LIZ(annotationArr, "annotations == null");
        int size = this.LIZLLL.size();
        for (int i = 0; i < size; i++) {
            InterfaceC65016PfQ<T, String> LJ = ((AbstractC65022PfW) ListProtector.get(this.LIZLLL, i)).LJ(type);
            if (LJ != null) {
                return LJ;
            }
        }
        return C65024PfY.LIZ;
    }

    public final InterfaceC65014PfO<?, ?> LIZJ(AbstractC65069PgH abstractC65069PgH, Type type, Annotation[] annotationArr) {
        C65139PhP.LIZ(type, "returnType == null");
        C65139PhP.LIZ(annotationArr, "annotations == null");
        int indexOf = this.LJ.indexOf(abstractC65069PgH) + 1;
        int size = this.LJ.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC65014PfO<?, ?> LIZ = ((AbstractC65069PgH) ListProtector.get(this.LJ, i)).LIZ(type, annotationArr, this);
            if (LIZ != null) {
                return LIZ;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC65069PgH != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(ListProtector.get(this.LJ, i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.LJ.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LJ, indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> InterfaceC65016PfQ<T, TypedOutput> LJ(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C65139PhP.LIZ(type, "type == null");
        C65139PhP.LIZ(annotationArr, "parameterAnnotations == null");
        C65139PhP.LIZ(annotationArr2, "methodAnnotations == null");
        int indexOf = this.LIZLLL.indexOf(null) + 1;
        int size = this.LIZLLL.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC65016PfQ<T, TypedOutput> interfaceC65016PfQ = (InterfaceC65016PfQ<T, TypedOutput>) ((AbstractC65022PfW) ListProtector.get(this.LIZLLL, i)).LIZJ(type, annotationArr, annotationArr2, this);
            if (interfaceC65016PfQ != null) {
                return interfaceC65016PfQ;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.LIZLLL.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LIZLLL, indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public C65019PfT(C65026Pfa c65026Pfa, InterfaceC64805Pc1 interfaceC64805Pc1, List list, List list2, List list3, Executor executor, Executor executor2) {
        this.LIZJ = c65026Pfa;
        this.LIZIZ = interfaceC64805Pc1;
        this.LJIIIIZZ = list;
        this.LIZLLL = Collections.unmodifiableList(list2);
        this.LJ = Collections.unmodifiableList(list3);
        this.LJII = executor;
        this.LJFF = executor2;
    }
}
