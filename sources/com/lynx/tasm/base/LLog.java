package com.lynx.tasm.base;

import X.AbstractC39951Fm7;
import X.C39942Fly;
import X.C39954FmA;
import X.C39955FmB;
import X.EnumC39952Fm8;
import X.EnumC39953Fm9;
import X.InterfaceC39968FmO;
import X.InterfaceC39970FmQ;
import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class LLog {
    public static int LIZ = -1;
    public static final ConcurrentHashMap<Integer, InterfaceC39968FmO> LIZIZ = new ConcurrentHashMap<>();
    public static Integer LIZJ = 0;
    public static int LIZLLL = 2;
    public static long LJ = 0;
    public static int LJFF = 0;
    public static boolean LJI = false;

    public static boolean LIZIZ() {
        long j;
        try {
            j = ((Long) Class.forName("com.ss.android.agilelogger.ALog").getMethod("getALogSimpleWriteFuncAddr", new Class[0]).invoke(null, new Object[0])).longValue();
        } catch (Exception unused) {
            j = 0;
        }
        if (j != 0) {
            LIZJ(j);
            return true;
        }
        int i = LJFF + 1;
        LJFF = i;
        return i == 120;
    }

    public static native void nativeInitALogNative(long j);

    public static native void nativeInternalLog(int i, String str, String str2);

    public static native void nativeSetNativeMinLogLevel(int i);

    public static void initALogLazy() {
        if (!C39942Fly.LIZ.booleanValue() && !LIZIZ()) {
            new PthreadTimer("asm/base/LLog").schedule(new C39955FmB(), 0L, 500L);
        }
    }

    public static long getALogPtr() {
        return LJ;
    }

    public static void LIZ(AbstractC39951Fm7 abstractC39951Fm7) {
        Integer valueOf;
        synchronized (LLog.class) {
            valueOf = Integer.valueOf(LIZJ.intValue() + 1);
            LIZJ = valueOf;
            if (abstractC39951Fm7.LIZLLL() == 1) {
                int i = LIZ;
                if (i != -1) {
                    LIZIZ.remove(Integer.valueOf(i));
                }
                LIZ = valueOf.intValue();
            }
            LIZIZ.put(valueOf, abstractC39951Fm7);
        }
        valueOf.intValue();
    }

    public static void LIZJ(long j) {
        LJ = j;
        nativeInitALogNative(j);
    }

    public static void LJ(int i) {
        try {
            if (!LJI) {
                LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
                LJIIIZ.LJIIL();
                LJI = LJIIIZ.LJIILIIL;
            }
            if (LJI && LIZLLL < i) {
                LIZLLL = i;
                nativeSetNativeMinLogLevel(i);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }

    public static void LIZLLL(int i, String str, String str2) {
        try {
            if (!LJI) {
                LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
                LJIIIZ.LJIIL();
                boolean z = LJIIIZ.LJIILIIL;
                LJI = z;
                if (!z) {
                    return;
                }
            }
            if (i >= LIZLLL) {
                nativeInternalLog(i, str, str2);
            }
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static void log(int i, String str, String str2, int i2, long j, int i3, int i4) {
        String substring;
        try {
            EnumC39953Fm9 enumC39953Fm9 = EnumC39953Fm9.values()[i2];
            int i5 = C39954FmA.LIZ[enumC39953Fm9.ordinal()];
            if (i5 == 1) {
                EnumC39952Fm8.values();
                return;
            }
            if (i5 == 2 && i == 4) {
                for (InterfaceC39968FmO interfaceC39968FmO : LIZIZ.values()) {
                    if (interfaceC39968FmO instanceof InterfaceC39970FmQ) {
                        InterfaceC39970FmQ interfaceC39970FmQ = (InterfaceC39970FmQ) interfaceC39968FmO;
                        if (interfaceC39970FmQ.LIZJ()) {
                            if (interfaceC39970FmQ.LIZ()) {
                                substring = str2;
                            } else {
                                substring = str2.substring(i4);
                            }
                        }
                    } else if (interfaceC39968FmO.LIZIZ(enumC39953Fm9, 6)) {
                        substring = str2;
                    }
                    interfaceC39968FmO.e(str, substring);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void logByte(int i, String str, byte[] bArr, int i2, long j, int i3, int i4) {
        log(i, str, new String(bArr), i2, j, i3, i4);
    }
}
