package X;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06170Mb {
    public final C1HQ<String, Method> LIZ;
    public final C1HQ<String, Method> LIZIZ;
    public final C1HQ<String, Class> LIZJ;

    public abstract C1HZ LIZ();

    public abstract boolean LJ();

    public abstract byte[] LJFF();

    public abstract CharSequence LJI();

    public abstract boolean LJII(int i);

    public abstract int LJIIIIZZ();

    public abstract <T extends Parcelable> T LJIIJ();

    public abstract String LJIIL();

    public abstract void LJIILJJIL(int i);

    public abstract void LJIILL(boolean z);

    public abstract void LJIILLIIL(byte[] bArr);

    public abstract void LJIIZILJ(CharSequence charSequence);

    public abstract void LJIJ(int i);

    public abstract void LJIJJ(Parcelable parcelable);

    public abstract void LJIJJLI(String str);

    public final <T extends InterfaceC06180Mc> T LJIILIIL() {
        String LJIIL = LJIIL();
        if (LJIIL == null) {
            return null;
        }
        try {
            return (T) LIZJ(LJIIL).invoke(null, LIZ());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw e4.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final Class LIZIZ(Class<? extends InterfaceC06180Mc> cls) {
        Class orDefault = this.LIZJ.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(C16880lQ.LLLZ("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), C16880lQ.LJLLJ(cls)}), false, cls.getClassLoader());
            this.LIZJ.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method LIZJ(String str) {
        Method orDefault = this.LIZ.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC06170Mb.class.getClassLoader()).getDeclaredMethod("read", AbstractC06170Mb.class);
            this.LIZ.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method LIZLLL(Class cls) {
        Method orDefault = this.LIZIZ.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class LIZIZ = LIZIZ(cls);
            System.currentTimeMillis();
            Method declaredMethod = LIZIZ.getDeclaredMethod("write", cls, AbstractC06170Mb.class);
            this.LIZIZ.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIL(InterfaceC06180Mc interfaceC06180Mc) {
        if (interfaceC06180Mc == null) {
            LJIJJLI(null);
            return;
        }
        try {
            LJIJJLI(LIZIZ(interfaceC06180Mc.getClass()).getName());
            C1HZ LIZ = LIZ();
            try {
                LIZLLL(interfaceC06180Mc.getClass()).invoke(null, interfaceC06180Mc, LIZ);
                LIZ.LJJ();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw e4.getCause();
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LJLLJ(interfaceC06180Mc.getClass()));
            LIZ2.append(" does not have a Parcelizer");
            throw new RuntimeException(X1D.LIZIZ(LIZ2), e5);
        }
    }

    public final int LJIIIZ(int i, int i2) {
        if (!LJII(i2)) {
            return i;
        }
        return LJIIIIZZ();
    }

    public final <T extends Parcelable> T LJIIJJI(T t, int i) {
        if (!LJII(i)) {
            return t;
        }
        return (T) LJIIJ();
    }

    public final void LJIJI(int i, int i2) {
        LJIILJJIL(i2);
        LJIJ(i);
    }

    public AbstractC06170Mb(C1HQ<String, Method> c1hq, C1HQ<String, Method> c1hq2, C1HQ<String, Class> c1hq3) {
        this.LIZ = c1hq;
        this.LIZIZ = c1hq2;
        this.LIZJ = c1hq3;
    }
}
