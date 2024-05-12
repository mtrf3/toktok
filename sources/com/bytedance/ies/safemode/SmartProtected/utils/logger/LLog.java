package com.bytedance.ies.safemode.SmartProtected.utils.logger;

import X.C16880lQ;
import X.FTS;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LLog {
    public static final FTS LIZ;
    public static final LLog LIZIZ = new LLog();

    public static final void LIZ(String str, String msg, Object... objArr) {
        o.LJIIJ(msg, "msg");
    }

    private final native void nativePrintCompleteLog(String str, String str2);

    static {
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        LIZ = new FTS();
        System.getProperty("line.separator");
    }

    public static final void LIZIZ(String str, Throwable th, String str2, Object... objArr) {
        FTS fts = LIZ;
        Object[] obj = Arrays.copyOf(objArr, objArr.length);
        fts.getClass();
        o.LJIIJ(obj, "obj");
        if (obj.length != 0) {
            Object[] copyOf = Arrays.copyOf(obj, obj.length);
            o.LJIIIIZZ(C16880lQ.LLLZ(str2, Arrays.copyOf(copyOf, copyOf.length)), "java.lang.String.format(format, *args)");
        }
        Log.getStackTraceString(th);
    }
}
