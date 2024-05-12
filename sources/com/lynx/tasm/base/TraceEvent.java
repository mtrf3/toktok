package com.lynx.tasm.base;

import X.C39942Fly;
import android.os.Trace;
import com.lynx.tasm.LynxEnv;
import java.util.Random;

/* loaded from: classes7.dex */
public class TraceEvent {
    public static boolean LIZ;

    public static native void nativeBeginSection(long j, String str);

    public static native boolean nativeCategoryEnabled(long j);

    public static native void nativeEndSection(long j, String str);

    public static native void nativeInstant(long j, String str, long j2, String str2);

    public static native boolean nativeRegisterTraceBackend(long j);

    public static boolean LIZJ() {
        if (C39942Fly.LIZLLL.booleanValue() || LynxEnv.LJIIIZ().LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(String str) {
        LIZ(0L, str);
    }

    public static void LJ(String str) {
        LIZLLL(0L, str);
    }

    public static boolean LJIIIIZZ(long j) {
        if (j != 0) {
            return nativeRegisterTraceBackend(j);
        }
        return false;
    }

    public static void LIZ(long j, String str) {
        if (LIZJ()) {
            if (!C39942Fly.LJ.booleanValue() && LIZ) {
                nativeBeginSection(j, str);
            } else {
                Trace.beginSection(str);
            }
        }
    }

    public static void LIZLLL(long j, String str) {
        if (LIZJ()) {
            if (!C39942Fly.LJ.booleanValue() && LIZ) {
                nativeEndSection(j, str);
            } else {
                Trace.endSection();
            }
        }
    }

    public static void LJII(String str, String str2) {
        LJI(1L, System.nanoTime() / 1000, str, str2);
    }

    public static void LJFF(long j, long j2, String str) {
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('#');
            int i = 0;
            do {
                sb.append(Integer.toHexString(new Random().nextInt(16)));
                i++;
            } while (i < 6);
            str2 = sb.toString().toUpperCase();
        } catch (Exception unused) {
            str2 = "#FF0000";
        }
        LJI(j, j2, str, str2);
    }

    public static void LJI(long j, long j2, String str, String str2) {
        if (LIZJ()) {
            if (!C39942Fly.LJ.booleanValue() && LIZ) {
                nativeInstant(j, str, j2, str2);
            } else {
                Trace.beginSection(str);
                Trace.endSection();
            }
        }
    }
}
