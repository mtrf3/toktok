package X;

import X.AbstractC90950Zmk;
import X.C90891Zln;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Zmk, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90950Zmk<MessageType extends AbstractC90950Zmk<MessageType, BuilderType>, BuilderType extends C90891Zln<MessageType, BuilderType>> extends AbstractC90893Zlp<MessageType, BuilderType> {
    public static final java.util.Map<Object, AbstractC90950Zmk<?, ?>> zzb = new ConcurrentHashMap();
    public C90314ZcU zzc = C90314ZcU.LIZLLL;
    public int zzd = -1;

    public static Object LIZJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8392104118779660882"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.AbstractC90893Zlp
    public final int LIZ() {
        return this.zzd;
    }

    @Override // X.AbstractC90893Zlp
    public final void LIZIZ(int i) {
        this.zzd = i;
    }

    public abstract Object LJ(int i, Object obj);

    public final <MessageType extends AbstractC90950Zmk<MessageType, BuilderType>, BuilderType extends C90891Zln<MessageType, BuilderType>> BuilderType LJI() {
        return (BuilderType) LJ(5, null);
    }

    @Override // X.InterfaceC90327Zch
    public final /* synthetic */ AbstractC90950Zmk LJIILIIL() {
        return (AbstractC90950Zmk) LJ(6, null);
    }

    @Override // X.InterfaceC90712Ziu
    public final /* synthetic */ C90891Zln LJIILJJIL() {
        C90891Zln c90891Zln = (C90891Zln) LJ(5, null);
        c90891Zln.LIZIZ(this);
        return c90891Zln;
    }

    @Override // X.InterfaceC90712Ziu
    public final int LJFF() {
        int i = this.zzd;
        if (i == -1) {
            int LIZJ = C90375ZdT.LIZJ.LIZ(getClass()).LIZJ(this);
            this.zzd = LIZJ;
            return LIZJ;
        }
        return i;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int LIZ = C90375ZdT.LIZJ.LIZ(getClass()).LIZ(this);
        this.zza = LIZ;
        return LIZ;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C90335Zcp.LIZJ(this, sb, 0);
        return sb.toString();
    }

    public static <T extends AbstractC90950Zmk> T LJII(Class<T> cls) {
        java.util.Map<Object, AbstractC90950Zmk<?, ?>> map = zzb;
        AbstractC90950Zmk<?, ?> abstractC90950Zmk = map.get(cls);
        if (abstractC90950Zmk == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC90950Zmk = map.get(cls);
                if (abstractC90950Zmk == null) {
                    abstractC90950Zmk = (AbstractC90950Zmk) ((AbstractC90950Zmk) C90376ZdU.LJIIIIZZ(cls)).LJ(6, null);
                    if (abstractC90950Zmk != null) {
                        map.put(cls, abstractC90950Zmk);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return abstractC90950Zmk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C90375ZdT.LIZJ.LIZ(getClass()).LJFF(this, obj);
    }

    public static <T extends AbstractC90950Zmk> void LIZLLL(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    public static Object LJIIIIZZ(Object obj, Method method, Object... objArr) {
        try {
            return LIZJ(obj, method, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw cause;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw cause;
        }
    }
}
