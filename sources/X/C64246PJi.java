package X;

import com.bytedance.crash.util.NativeTools;

/* renamed from: X.PJi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64246PJi extends PKN {
    public C64246PJi() {
    }

    public C64246PJi(int i) {
    }

    public static C64246PJi LJJI(StackTraceElement stackTraceElement, String str, String str2, String str3, String str4) {
        C64246PJi c64246PJi = new C64246PJi();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        c64246PJi.LJIIJJI("event_type", "exception");
        c64246PJi.LJIIJJI("log_type", "core_exception_monitor");
        c64246PJi.LJIIJJI("timestamp", Long.valueOf(System.currentTimeMillis()));
        c64246PJi.LJIIJJI("crash_time", Long.valueOf(System.currentTimeMillis()));
        c64246PJi.LJIIJJI("class_ref", className);
        c64246PJi.LJIIJJI("method", methodName);
        c64246PJi.LJIIJJI("line_num", Integer.valueOf(lineNumber));
        c64246PJi.LJIIJJI("stack", str);
        c64246PJi.LJIIJJI("exception_type", 1);
        c64246PJi.LJIIJJI("ensure_type", str4);
        c64246PJi.LJIIJJI("is_core", 0);
        c64246PJi.LJIIJJI("message", str2);
        c64246PJi.LJIIJJI("process_name", C64264PKa.LIZJ(PK0.LIZ));
        c64246PJi.LJIIJJI("crash_thread_name", str3);
        C64254PJq.LIZ(c64246PJi.LIZ);
        return c64246PJi;
    }

    public static C64246PJi LJJII(String str, String str2, String str3, String str4, String str5) {
        C64246PJi LJJIFFI = LJJIFFI(new StackTraceElement("Native", "Native", "Native.java", -1), str2, str3, str4, true, "EnsureNotReachHere", str5);
        LJJIFFI.LJIIJJI("event_type", "native_exception");
        LJJIFFI.LJIIJJI("java_data", str);
        NativeTools.LJIILJJIL().getClass();
        LJJIFFI.LJIIJJI("crash_lib_uuid", NativeTools.LJJIFFI(str2));
        return LJJIFFI;
    }

    public static C64246PJi LJJIFFI(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C64246PJi c64246PJi = new C64246PJi();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        c64246PJi.LJIIJJI("event_type", "exception");
        c64246PJi.LJIIJJI("log_type", str5);
        c64246PJi.LJIIJJI("timestamp", Long.valueOf(System.currentTimeMillis()));
        c64246PJi.LJIIJJI("crash_time", Long.valueOf(System.currentTimeMillis()));
        c64246PJi.LJIIJJI("class_ref", className);
        c64246PJi.LJIIJJI("method", methodName);
        c64246PJi.LJIIJJI("line_num", Integer.valueOf(lineNumber));
        c64246PJi.LJIIJJI("stack", str);
        c64246PJi.LJIIJJI("crash_md5", PL3.LIZ(str));
        c64246PJi.LJIIJJI("exception_type", 1);
        c64246PJi.LJIIJJI("ensure_type", str4);
        c64246PJi.LJIIJJI("is_core", Integer.valueOf(z ? 1 : 0));
        c64246PJi.LJIIJJI("message", str2);
        c64246PJi.LJIIJJI("process_name", C64264PKa.LIZJ(PK0.LIZ));
        c64246PJi.LJIIJJI("crash_thread_name", str3);
        C64254PJq.LIZ(c64246PJi.LIZ);
        return c64246PJi;
    }
}
