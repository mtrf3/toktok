package X;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes12.dex */
public final class QZT<T> {
    public final java.util.Set<Class<? super T>> LIZ;
    public final java.util.Set<QZW> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final InterfaceC67209QZh<T> LJ;
    public final java.util.Set<Class<?>> LJFF;

    public QZT() {
        throw null;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.LIZ.toArray()) + ">{" + this.LIZJ + ", type=" + this.LIZLLL + ", deps=" + Arrays.toString(this.LIZIZ.toArray()) + "}";
    }

    public static <T> QZU<T> LIZ(Class<T> cls) {
        return new QZU<>(cls, new Class[0]);
    }

    public static <T> QZT<T> LIZIZ(T t, Class<T> cls, Class<? super T>... clsArr) {
        QZU qzu = new QZU(cls, clsArr);
        qzu.LJ = new C67211QZj(t);
        return qzu.LIZIZ();
    }

    public QZT(java.util.Set set, java.util.Set set2, int i, int i2, InterfaceC67209QZh interfaceC67209QZh, java.util.Set set3) {
        this.LIZ = Collections.unmodifiableSet(set);
        this.LIZIZ = Collections.unmodifiableSet(set2);
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = interfaceC67209QZh;
        this.LJFF = Collections.unmodifiableSet(set3);
    }
}
