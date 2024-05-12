package com.bytedance.pitaya.log;

import X.C37692Eqm;
import X.InterfaceC93293aOX;
import X.X1D;
import android.content.Context;
import android.util.Log;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class PitayaLogger {
    public static PitayaLogPrinter LIZ = new PitayaLogPrinter() { // from class: com.bytedance.pitaya.log.PitayaLogger$logImpl$1
        public int logLevel = 7;

        @Override // com.bytedance.pitaya.log.PitayaLogPrinter
        public long getNativeImpl() {
            return 0L;
        }

        @Override // com.bytedance.pitaya.log.PitayaLogPrinter
        public void uploadLogToServer(long j, long j2, String scene, InterfaceC93293aOX interfaceC93293aOX) {
            o.LJIIJ(scene, "scene");
        }

        private final boolean printLog(int i) {
            if (i >= this.logLevel) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.pitaya.log.PitayaLogPrinter
        public void init(Context context) {
            Method declaredMethod;
            Object invoke;
            o.LJIIJ(context, "context");
            int i = 0;
            try {
                declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            } catch (Throwable th) {
                PitayaLogger.LJ(th, null, 6);
            }
            if (declaredMethod != null && (invoke = declaredMethod.invoke(null, "log.tag.PTY")) != null) {
                String str = (String) invoke;
                if (!ujb.o.LJJJJJL(str)) {
                    i = CastIntegerProtector.parseInt(str);
                }
                this.logLevel = i;
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
        }

        @Override // com.bytedance.pitaya.log.PitayaLogPrinter
        public void d(String tag, String msg) {
            o.LJIIJ(tag, "tag");
            o.LJIIJ(msg, "msg");
            printLog(3);
        }

        @Override // com.bytedance.pitaya.log.PitayaLogPrinter
        public void e(String tag, String msg) {
            o.LJIIJ(tag, "tag");
            o.LJIIJ(msg, "msg");
            printLog(6);
        }

        @Override // com.bytedance.pitaya.log.PitayaLogPrinter
        public void i(String tag, String msg) {
            o.LJIIJ(tag, "tag");
            o.LJIIJ(msg, "msg");
            printLog(4);
        }

        @Override // com.bytedance.pitaya.log.PitayaLogPrinter
        public void w(String tag, String msg) {
            o.LJIIJ(tag, "tag");
            o.LJIIJ(msg, "msg");
            printLog(5);
        }
    };

    public static void LIZ(String str, String message) {
        o.LJIIJ(message, "message");
        PitayaLogPrinter pitayaLogPrinter = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PTY-");
        LIZ2.append(str);
        pitayaLogPrinter.d(X1D.LIZIZ(LIZ2), message);
    }

    public static void LIZIZ(String tag, String message) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(message, "message");
        PitayaLogPrinter pitayaLogPrinter = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PTY-");
        LIZ2.append(tag);
        pitayaLogPrinter.e(X1D.LIZIZ(LIZ2), message);
    }

    public static void LIZJ(String str, String message) {
        o.LJIIJ(message, "message");
        PitayaLogPrinter pitayaLogPrinter = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PTY-");
        LIZ2.append(str);
        pitayaLogPrinter.i(X1D.LIZIZ(LIZ2), message);
    }

    public static void LIZLLL(String prefix, String suffix, Throwable th) {
        o.LJIIJ(prefix, "prefix");
        o.LJIIJ(suffix, "suffix");
        String stackTraceString = Log.getStackTraceString(th);
        o.LJFF(stackTraceString, "Log.getStackTraceString(t)");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(prefix);
        LIZ2.append("  ");
        LIZ2.append(stackTraceString);
        LIZ2.append(" \n ");
        LIZ2.append(suffix);
        LIZIZ("EXCEPTION", X1D.LIZIZ(LIZ2));
    }

    public static /* synthetic */ void LJ(Throwable th, String str, int i) {
        String str2;
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        LIZLLL(str2, str, th);
    }

    public static void LJFF(String str, String prefix, String suffix, Throwable th) {
        o.LJIIJ(prefix, "prefix");
        o.LJIIJ(suffix, "suffix");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("EXCEPTION-");
        LIZ2.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(prefix);
        LIZ3.append("  ");
        LIZ3.append(th);
        LIZ3.append(" \n ");
        LIZ3.append(suffix);
        LIZIZ(LIZIZ, X1D.LIZIZ(LIZ3));
    }
}
