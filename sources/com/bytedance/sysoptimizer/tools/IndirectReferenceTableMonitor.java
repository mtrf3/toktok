package com.bytedance.sysoptimizer.tools;

import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.sysoptimizer.SysOptimizer;

/* loaded from: classes15.dex */
public class IndirectReferenceTableMonitor {
    public static boolean sOptimized;

    /* loaded from: classes15.dex */
    public static class Config {
        public int cap;
        public RefConfig globalConfig;
        public RefConfig weakGlobalConfig;

        public boolean isValid() {
            int i = this.cap;
            if ((i & 1) != 0) {
                if (this.globalConfig == null) {
                    return false;
                }
                return true;
            }
            if ((i & 2) == 0 || this.weakGlobalConfig == null) {
                return false;
            }
            return true;
        }

        /* loaded from: classes15.dex */
        public static final class Builder {
            public final Config config = new Config();

            public Config getConfig() {
                return this.config;
            }

            public Builder setCapability(int i) {
                this.config.cap = i;
                return this;
            }

            public Builder setGlobalConfig(RefConfig refConfig) {
                this.config.globalConfig = refConfig;
                return this;
            }

            public Builder setWeakGlobalConfig(RefConfig refConfig) {
                this.config.weakGlobalConfig = refConfig;
                return this;
            }
        }

        public Config() {
        }

        /* loaded from: classes15.dex */
        public static class RefConfig {
            public final int crashCount;
            public final int crawlStackCount;
            public final int maxStackDump;

            public RefConfig(int i, int i2, int i3) {
                this.crashCount = i;
                this.crawlStackCount = i2;
                this.maxStackDump = i3;
            }
        }
    }

    public static native void changeConfig0(Config config);

    public static native int dump2file(String str);

    public static native int getReferenceCount(int i);

    public static native void mockLeak();

    public static native void monitor(Config config, int i);

    public static native boolean startMonitor(int i, int i2);

    public static void ThrowCustomException() {
        throw new RuntimeException("Leak IndirectReferenceTable");
    }

    public static String getJavaStackTrace() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length > 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < stackTrace.length; i++) {
                sb.append(stackTrace[i].toString());
                sb.append("\n");
            }
            return sb.toString();
        }
        return "";
    }

    public static void changeConfig(Config config) {
        if (config == null || !config.isValid()) {
            return;
        }
        changeConfig0(config);
    }

    public static void e(String str, String str2) {
        if (str2.length() <= 3072) {
            return;
        }
        while (str2.length() > 3072) {
            str2 = str2.replace(str2.substring(0, 3072), "");
        }
    }

    public static synchronized void monitor(Context context, Config config) {
        synchronized (IndirectReferenceTableMonitor.class) {
            if (!sOptimized && config != null && config.isValid()) {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    C79527VJb c79527VJb = new C79527VJb();
                    c79527VJb.LIZ = VJZ.SHARED.value;
                    c79527VJb.LIZIZ = true;
                    ShadowHook.init(c79527VJb.LIZ());
                    try {
                        monitor(config, Build.VERSION.SDK_INT);
                        sOptimized = true;
                    } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                    }
                }
            }
        }
    }
}
