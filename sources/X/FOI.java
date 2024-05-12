package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FOI implements Runnable {
    public static final FOI LJLIL = new FOI();

    public static void LIZ() {
        long j;
        long j2;
        if (FB0.LIZIZ) {
            return;
        }
        FB0.LIZIZ = true;
        try {
            if (FOJ.LIZ) {
                Class<?> cls = Class.forName("com.bytedance.frameworks.baselib.network.dispatcher.NetThreadPoolManager");
                Field declaredField = cls.getDeclaredField("INSTANCE");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                Field declaredField2 = cls.getDeclaredField("mExecutorDownload");
                declaredField2.setAccessible(true);
                Constructor<?> declaredConstructor = Class.forName("com.bytedance.frameworks.baselib.network.dispatcher.NetThreadPoolManager$ApiThreadFactory").getDeclaredConstructor(String.class);
                declaredConstructor.setAccessible(true);
                ThreadFactory threadFactory = (ThreadFactory) declaredConstructor.newInstance("NetDownload");
                int i = C64831PcR.LIZJ().LIZLLL;
                int i2 = C64831PcR.LIZJ().LIZIZ;
                boolean z = FOJ.LIZIZ;
                if (z) {
                    j = 60;
                } else {
                    j = C64831PcR.LIZJ().LJFF;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                C38549FAz c38549FAz = new C38549FAz(i, i2, j, timeUnit, new PriorityBlockingQueue(), threadFactory);
                c38549FAz.allowCoreThreadTimeOut(C64831PcR.LIZJ().LJII);
                if (FOJ.LJFF) {
                    declaredField2.set(obj, c38549FAz);
                }
                Field declaredField3 = cls.getDeclaredField("mExecutorNormal");
                declaredField3.setAccessible(true);
                ThreadFactory threadFactory2 = (ThreadFactory) declaredConstructor.newInstance("NetNormal");
                int i3 = C64831PcR.LIZJ().LIZJ;
                int i4 = C64831PcR.LIZJ().LIZ;
                if (z) {
                    j2 = 60;
                } else {
                    j2 = C64831PcR.LIZJ().LJ;
                }
                C38549FAz c38549FAz2 = new C38549FAz(i3, i4, j2, timeUnit, new PriorityBlockingQueue(), threadFactory2);
                c38549FAz2.allowCoreThreadTimeOut(C64831PcR.LIZJ().LJII);
                if (FOJ.LJI) {
                    declaredField3.set(obj, c38549FAz2);
                }
            }
            if (!FOJ.LIZJ) {
                return;
            }
            Field declaredField4 = Class.forName("com.ss.ttvideoengine.utils.EngineThreadPool").getDeclaredField("mExecutorInstance");
            declaredField4.setAccessible(true);
            C38549FAz c38549FAz3 = new C38549FAz(TimeUnit.SECONDS, new LinkedBlockingQueue());
            c38549FAz3.allowCoreThreadTimeOut(true);
            declaredField4.set(null, c38549FAz3);
        } catch (Throwable th) {
            if (!FOJ.LIZ) {
                return;
            }
            if (!C35810E3q.LJIIIIZZ() && new Random().nextFloat() >= 0.001d) {
                return;
            }
            C78983UzD.LJIJ(th, "NetworkHook");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
