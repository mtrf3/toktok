package com.ss.bytertc.base.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes33.dex */
public class ExceptionUtils {
    public static String cause(Throwable th) {
        String str = null;
        while (th != null && th.getCause() != null) {
            str = th.getCause().toString();
            th = th.getCause();
        }
        return str;
    }

    public static String stackTrace(Throwable th) {
        th.printStackTrace(new PrintWriter(new StringWriter()));
        return th.toString();
    }
}
