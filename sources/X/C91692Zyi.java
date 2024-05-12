package X;

import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Zyi, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91692Zyi {
    public static final C91690Zyg LIZ(String str, InterfaceC88472Yns<? super C91701Zyr, C76800UCe> builder) {
        AbstractC91689Zyf abstractC91689Zyf;
        o.LJIIIZ(builder, "builder");
        C91701Zyr c91701Zyr = new C91701Zyr();
        builder.invoke(c91701Zyr);
        C91697Zyn c91697Zyn = c91701Zyr.LIZ;
        c91697Zyn.getClass();
        Object obj = c91697Zyn.LIZ;
        if (obj instanceof Integer) {
            abstractC91689Zyf = AbstractC91689Zyf.LIZIZ;
        } else if (obj instanceof int[]) {
            abstractC91689Zyf = AbstractC91689Zyf.LIZJ;
        } else if (obj instanceof Long) {
            abstractC91689Zyf = AbstractC91689Zyf.LIZLLL;
        } else if (obj instanceof long[]) {
            abstractC91689Zyf = AbstractC91689Zyf.LJ;
        } else if (obj instanceof Float) {
            abstractC91689Zyf = AbstractC91689Zyf.LJFF;
        } else if (obj instanceof float[]) {
            abstractC91689Zyf = AbstractC91689Zyf.LJI;
        } else if (obj instanceof Boolean) {
            abstractC91689Zyf = AbstractC91689Zyf.LJII;
        } else if (obj instanceof boolean[]) {
            abstractC91689Zyf = AbstractC91689Zyf.LJIIIIZZ;
        } else if ((obj instanceof String) || obj == null) {
            abstractC91689Zyf = AbstractC91689Zyf.LJIIIZ;
        } else if ((obj instanceof Object[]) && (obj instanceof String[])) {
            abstractC91689Zyf = AbstractC91689Zyf.LJIIJ;
        } else {
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                o.LJI(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    if (componentType2 != null) {
                        abstractC91689Zyf = new C92136a5s(componentType2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    }
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                o.LJI(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    if (componentType4 != null) {
                        abstractC91689Zyf = new C92138a5u(componentType4);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    }
                }
            }
            if (obj instanceof Parcelable) {
                abstractC91689Zyf = new C92137a5t(obj.getClass());
            } else if (obj instanceof Enum) {
                abstractC91689Zyf = new C92336a96(obj.getClass());
            } else if (obj instanceof Serializable) {
                abstractC91689Zyf = new C92139a5v(obj.getClass());
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Object of type ");
                LIZ.append((Object) obj.getClass().getName());
                LIZ.append(" is not supported for navigation arguments.");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        return new C91690Zyg(str, new C91698Zyo(abstractC91689Zyf, c91697Zyn.LIZ, c91697Zyn.LIZIZ));
    }
}
