package X;

import X.YIO;
import X.YIT;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public abstract class YIO<MessageType extends YIO<MessageType, BuilderType>, BuilderType extends YIT<MessageType, BuilderType>> extends YIQ<MessageType, BuilderType> {
    public static java.util.Map<Object, YIO<?, ?>> zzfzc = new ConcurrentHashMap();
    public C87159YIp zzfza = C87159YIp.LJ;
    public int zzfzb = -1;

    public static Object LJII(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8392102493629258535"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.YID
    public final /* synthetic */ YIO LIZIZ() {
        return (YIO) LJIIIIZZ(6);
    }

    @Override // X.YIZ
    public final /* synthetic */ YIT LIZJ() {
        YIT yit = (YIT) LJIIIIZZ(5);
        yit.LJI(this);
        return yit;
    }

    public abstract Object LJIIIIZZ(int i);

    @Override // X.YID
    public final boolean isInitialized() {
        byte byteValue = ((Byte) LJIIIIZZ(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C87169YIz c87169YIz = C87169YIz.LIZJ;
        c87169YIz.getClass();
        boolean LJI = c87169YIz.LIZ(getClass()).LJI(this);
        LJIIIIZZ(2);
        return LJI;
    }

    @Override // X.YIZ
    public final int LIZLLL() {
        if (this.zzfzb == -1) {
            C87169YIz c87169YIz = C87169YIz.LIZJ;
            c87169YIz.getClass();
            this.zzfzb = c87169YIz.LIZ(getClass()).LJ(this);
        }
        return this.zzfzb;
    }

    public final int hashCode() {
        int i = this.zzfuc;
        if (i != 0) {
            return i;
        }
        C87169YIz c87169YIz = C87169YIz.LIZJ;
        c87169YIz.getClass();
        int LJII = c87169YIz.LIZ(getClass()).LJII(this);
        this.zzfuc = LJII;
        return LJII;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        YIE.LIZ(this, sb, 0);
        return sb.toString();
    }

    @Override // X.YIQ
    public final int LJFF() {
        return this.zzfzb;
    }

    public static <T extends YIO<?, ?>> T LJIIJJI(Class<T> cls) {
        T t = (T) zzfzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzfzc.get(cls);
                if (t == null) {
                    t = (T) ((YIO) C87166YIw.LJIIIIZZ(cls)).LJIIIIZZ(6);
                    if (t != null) {
                        zzfzc.put(cls, t);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return t;
    }

    @Override // X.YIZ
    public final void LIZ(AbstractC87156YIm abstractC87156YIm) {
        YIU LIZ = C87169YIz.LIZJ.LIZ(getClass());
        YJ8 yj8 = abstractC87156YIm.LIZ;
        if (yj8 == null) {
            yj8 = new YJ8(abstractC87156YIm);
        }
        LIZ.LJIIIZ(this, yj8);
    }

    @Override // X.YIQ
    public final void LJI(int i) {
        this.zzfzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LJIIIIZZ(6).getClass().isInstance(obj)) {
            return false;
        }
        C87169YIz c87169YIz = C87169YIz.LIZJ;
        c87169YIz.getClass();
        return c87169YIz.LIZ(getClass()).LJFF(this, obj);
    }

    public static <T extends YIO<?, ?>> void LJIIJ(Class<T> cls, T t) {
        zzfzc.put(cls, t);
    }

    public static Object LJIIIZ(Object obj, Method method, Object... objArr) {
        try {
            return LJII(obj, method, objArr);
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
