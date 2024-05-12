package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.3C5 */
/* loaded from: classes2.dex */
public final class C3C5<T> implements Serializable {
    public static final C3C6 Companion = new Object() { // from class: X.3C6
    };
    public final Object LJLIL;

    /* renamed from: box-impl */
    public static final /* synthetic */ C3C5 m6boximpl(Object obj) {
        return new C3C5(obj);
    }

    /* renamed from: constructor-impl */
    public static <T> Object m7constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl */
    public static boolean m8equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof C3C5) && o.LJ(obj, ((C3C5) obj2).m15unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m9equalsimpl0(Object obj, Object obj2) {
        return o.LJ(obj, obj2);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m11hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        return m8equalsimpl(this.LJLIL, obj);
    }

    public int hashCode() {
        return m11hashCodeimpl(this.LJLIL);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ Object m15unboximpl() {
        return this.LJLIL;
    }

    public String toString() {
        return m14toStringimpl(this.LJLIL);
    }

    public /* synthetic */ C3C5(Object obj) {
        this.LJLIL = obj;
    }

    /* renamed from: exceptionOrNull-impl */
    public static final Throwable m10exceptionOrNullimpl(Object obj) {
        if (obj instanceof C3C4) {
            return ((C3C4) obj).exception;
        }
        return null;
    }

    /* renamed from: isFailure-impl */
    public static final boolean m12isFailureimpl(Object obj) {
        return obj instanceof C3C4;
    }

    /* renamed from: isSuccess-impl */
    public static final boolean m13isSuccessimpl(Object obj) {
        return !(obj instanceof C3C4);
    }

    /* renamed from: toString-impl */
    public static String m14toStringimpl(Object obj) {
        if (obj instanceof C3C4) {
            return ((C3C4) obj).toString();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Success(");
        LIZ.append(obj);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}
