package com.bytedance.bdlocation.log;

import com.bytedance.bdlocation.client.BDLocationConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public class Logger {
    public static final LogPrinter sLogPrinter;
    public static final Map<Class<?>, Printer> sPrinters = new ConcurrentHashMap();

    static {
        LogPrinter logPrinter = new LogPrinter();
        sLogPrinter = logPrinter;
        logPrinter.setEnable(BDLocationConfig.isDebug());
        addPrinter(logPrinter);
    }

    public static void addPrinter(Printer printer) {
        if (printer == null) {
            return;
        }
        Map<Class<?>, Printer> map = sPrinters;
        if (!map.containsKey(printer.getClass())) {
            map.put(printer.getClass(), printer);
        }
    }

    public static void d(String str) {
        d("BDLocation", str);
    }

    public static void e(String str) {
        e("BDLocation", str);
    }

    public static void i(String str) {
        i("BDLocation", str);
    }

    public static void setEnabled(boolean z) {
        sLogPrinter.setEnable(z);
    }

    public static void v(String str) {
        v("BDLocation", str);
    }

    public static void w(String str) {
        w("BDLocation", str);
    }

    public static void d(String str, String str2) {
        d(str, str2, null);
    }

    public static void e(String str, Throwable th) {
        e("BDLocation", str, th);
    }

    public static void i(String str, String str2) {
        i(str, str2, null);
    }

    public static void v(String str, String str2) {
        v(str, str2, null);
    }

    public static void w(String str, String str2) {
        w(str, str2, null);
    }

    public static void e(String str, String str2) {
        e(str, str2, null);
    }

    public static void d(String str, String str2, Throwable th) {
        Iterator<Map.Entry<Class<?>, Printer>> it = sPrinters.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().d(str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        Iterator<Map.Entry<Class<?>, Printer>> it = sPrinters.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().e(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        Iterator<Map.Entry<Class<?>, Printer>> it = sPrinters.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().i(str, str2, th);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        Iterator<Map.Entry<Class<?>, Printer>> it = sPrinters.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().v(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        Iterator<Map.Entry<Class<?>, Printer>> it = sPrinters.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().w(str, str2, th);
        }
    }
}
