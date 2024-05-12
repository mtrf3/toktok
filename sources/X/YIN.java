package X;

import X.YIN;
import X.YIR;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public abstract class YIN<MessageType extends YIN<MessageType, BuilderType>, BuilderType extends YIR<MessageType, BuilderType>> extends YIP<MessageType, BuilderType> {
    public static final java.util.Map zza = new ConcurrentHashMap();
    public C87157YIn zzc = C87157YIn.LJFF;
    public int zzd = -1;

    public static Object LJIIIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8344585710407265203"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.YIH
    public final /* synthetic */ YIR LIZIZ() {
        return (YIR) LJIIZILJ(5);
    }

    @Override // X.YIH
    public final /* synthetic */ YIR LIZJ() {
        YIR yir = (YIR) LJIIZILJ(5);
        yir.LJI(this);
        return yir;
    }

    @Override // X.YIK
    public final /* synthetic */ YIN LIZLLL() {
        return (YIN) LJIIZILJ(6);
    }

    @Override // X.YIP
    public final int LJFF() {
        return this.zzd;
    }

    @Override // X.YIP
    public final void LJII(int i) {
        this.zzd = i;
    }

    public final YIR LJIIJ() {
        return (YIR) LJIIZILJ(5);
    }

    public final YIR LJIIJJI() {
        YIR yir = (YIR) LJIIZILJ(5);
        yir.LJI(this);
        return yir;
    }

    public abstract Object LJIIZILJ(int i);

    @Override // X.YIH
    public final int LIZ() {
        int i = this.zzd;
        if (i == -1) {
            int LIZJ = C87158YIo.LIZJ.LIZ(getClass()).LIZJ(this);
            this.zzd = LIZJ;
            return LIZJ;
        }
        return i;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int LIZ = C87158YIo.LIZJ.LIZ(getClass()).LIZ(this);
        this.zzb = LIZ;
        return LIZ;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        YIF.LIZJ(this, sb, 0);
        return sb.toString();
    }

    public static YIN LJIIL(Class cls) {
        java.util.Map map = zza;
        YIN yin = (YIN) map.get(cls);
        if (yin == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                yin = (YIN) map.get(cls);
                if (yin == null) {
                    yin = (YIN) ((YIN) C87167YIx.LJIIIIZZ(cls)).LJIIZILJ(6);
                    if (yin != null) {
                        map.put(cls, yin);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return yin;
    }

    public static C84686XLm LJIILIIL(InterfaceC68330Qrm interfaceC68330Qrm) {
        int i;
        C84686XLm c84686XLm = (C84686XLm) interfaceC68330Qrm;
        int i2 = c84686XLm.LJLJI;
        if (i2 == 0) {
            i = 10;
        } else {
            i = i2 + i2;
            if (i < i2) {
                throw new IllegalArgumentException();
            }
        }
        return new C84686XLm(c84686XLm.LJLJI, Arrays.copyOf(c84686XLm.LJLILLLLZI, i));
    }

    public static XM7 LJIILJJIL(XM7 xm7) {
        int i;
        int size = xm7.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return xm7.LJIJI(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C87158YIo.LIZJ.LIZ(getClass()).LJFF(this, obj);
    }

    public static void LJIILLIIL(Class cls, YIN yin) {
        zza.put(cls, yin);
    }

    public static Object LJIILL(Object obj, Method method, Object... objArr) {
        try {
            return LJIIIZ(obj, method, objArr);
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
