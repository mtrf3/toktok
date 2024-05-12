package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.PfS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65018PfS {
    public final InterfaceC48134Iuo LIZIZ;
    public final C64626PXy LIZJ;
    public final List<AbstractC65015PfP> LIZLLL;
    public final List<AbstractC65025PfZ> LJ;
    public final Executor LJFF;
    public final java.util.Map<Method, AbstractC64951PeN<?>> LIZ = new ConcurrentHashMap();
    public final boolean LJI = false;

    public final <T> T LIZIZ(Class<T> cls) {
        if (cls.isInterface()) {
            if (cls.getInterfaces().length <= 0) {
                if (this.LJI) {
                    C65030Pfe c65030Pfe = C65030Pfe.LIZ;
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!c65030Pfe.LJFF(method) && !Modifier.isStatic(method.getModifiers())) {
                            LIZJ(method);
                        }
                    }
                }
                return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C65021PfV(this, cls));
            }
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final AbstractC64951PeN<?> LIZJ(Method method) {
        AbstractC64951PeN<?> abstractC64951PeN;
        AbstractC64951PeN<?> abstractC64951PeN2 = (AbstractC64951PeN) ((ConcurrentHashMap) this.LIZ).get(method);
        if (abstractC64951PeN2 != null) {
            return abstractC64951PeN2;
        }
        synchronized (this.LIZ) {
            abstractC64951PeN = (AbstractC64951PeN) ((ConcurrentHashMap) this.LIZ).get(method);
            if (abstractC64951PeN == null) {
                abstractC64951PeN = AbstractC64951PeN.LIZIZ(this, method);
                ((ConcurrentHashMap) this.LIZ).put(method, abstractC64951PeN);
            }
        }
        return abstractC64951PeN;
    }

    public final InterfaceC65013PfN<?, ?> LIZ(Type type, Annotation[] annotationArr) {
        C65138PhO.LIZ(type, "returnType == null");
        C65138PhO.LIZ(annotationArr, "annotations == null");
        int indexOf = this.LJ.indexOf(null) + 1;
        int size = this.LJ.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC65013PfN<?, ?> LIZ = ((AbstractC65025PfZ) ListProtector.get(this.LJ, i)).LIZ(type, annotationArr);
            if (LIZ != null) {
                return LIZ;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.LJ.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LJ, indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> InterfaceC65017PfR<PVM, T> LJ(Type type, Annotation[] annotationArr) {
        C65138PhO.LIZ(type, "type == null");
        C65138PhO.LIZ(annotationArr, "annotations == null");
        int indexOf = this.LIZLLL.indexOf(null) + 1;
        int size = this.LIZLLL.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC65017PfR<PVM, T> interfaceC65017PfR = (InterfaceC65017PfR<PVM, T>) ((AbstractC65015PfP) ListProtector.get(this.LIZLLL, i)).responseBodyConverter(type, annotationArr, this);
            if (interfaceC65017PfR != null) {
                return interfaceC65017PfR;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
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

    public final <T> InterfaceC65017PfR<T, String> LJFF(Type type, Annotation[] annotationArr) {
        C65138PhO.LIZ(type, "type == null");
        int size = this.LIZLLL.size();
        for (int i = 0; i < size; i++) {
            InterfaceC65017PfR<T, String> interfaceC65017PfR = (InterfaceC65017PfR<T, String>) ((AbstractC65015PfP) ListProtector.get(this.LIZLLL, i)).stringConverter(type, annotationArr, this);
            if (interfaceC65017PfR != null) {
                return interfaceC65017PfR;
            }
        }
        return C64979Pep.LJLIL;
    }

    public final <T> InterfaceC65017PfR<T, PVP> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C65138PhO.LIZ(type, "type == null");
        C65138PhO.LIZ(annotationArr2, "methodAnnotations == null");
        int indexOf = this.LIZLLL.indexOf(null) + 1;
        int size = this.LIZLLL.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC65017PfR<T, PVP> interfaceC65017PfR = (InterfaceC65017PfR<T, PVP>) ((AbstractC65015PfP) ListProtector.get(this.LIZLLL, i)).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (interfaceC65017PfR != null) {
                return interfaceC65017PfR;
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

    public C65018PfS(InterfaceC48134Iuo interfaceC48134Iuo, C64626PXy c64626PXy, List list, List list2, Executor executor) {
        this.LIZIZ = interfaceC48134Iuo;
        this.LIZJ = c64626PXy;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = executor;
    }
}
