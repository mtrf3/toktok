package com.bytedance.crash.runtime;

import X.C171096nZ;
import X.C48008Ism;
import X.C64264PKa;
import X.C77321UWf;
import X.InterfaceC52297Kfl;
import X.InterfaceC63984P9g;
import X.JBR;
import X.PJ2;
import X.PJ5;
import X.PJE;
import X.PJF;
import X.PJG;
import X.PJU;
import X.PK0;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes12.dex */
public class ConfigManager {
    public static boolean sApmExists = true;
    public static IConfigManager sConfigManager;
    public boolean mBlockMonitorEnable;
    public boolean mEnsureWithLogcat;
    public boolean mIsDebugMode;
    public ThreadPoolExecutor mThreadPoolExecutor;
    public boolean reportErrorEnable = true;
    public String mNativeMemUrl = "";
    public String mCoreDumpUrl = "";
    public String mUploadCheckCoreDumpUrl = "";
    public String mJavaCrashUploadUrl = "";
    public String mLaunchCrashUploadUrl = "";
    public String mExceptionUploadUrl = "";
    public String mExceptionZipUploadUrl = "";
    public final String mEventUploadUrl = "";
    public String mNativeCrashUploadUrl = "";
    public String mAlogUploadUrl = "";
    public String mApmConfigUrl = "";
    public String mAsanReportUploadUrl = "";
    public long mLaunchCrashInterval = 8000;
    public InterfaceC63984P9g mEncryptImpl = new PJE();
    public int mLogcatDumpCount = 512;
    public volatile long mAnrCheckInterval = 500;
    public int mLogcatLevel = 1;
    public final boolean mNativeCrashMiniDump = true;
    public boolean mEnsureEnable = true;
    public long mBlockMonitorInterval = 1000;

    public boolean isEnsureEnable() {
        return com_bytedance_crash_runtime_ConfigManager_com_ss_android_ugc_aweme_lancet_EnsureManagerLancet_isEnsureEnableInAb(this);
    }

    public boolean isNativeCrashMiniDump() {
        return true;
    }

    private String getUrlSuffix() {
        if (PJU.LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("?aid=");
            LIZ.append(PJU.LIZIZ.config().mAid);
            LIZ.append("&device_id=");
            LIZ.append(PK0.LIZLLL().LIZ());
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    public String getAlogUploadUrl() {
        if (!TextUtils.isEmpty(this.mAlogUploadUrl)) {
            return this.mAlogUploadUrl;
        }
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/c/logcollect", LIZ);
    }

    public IConfigManager getApmConfigManager() {
        if (sApmExists && sConfigManager == null) {
            try {
                sConfigManager = (IConfigManager) C171096nZ.LIZ(IConfigManager.class);
            } catch (Throwable unused) {
                sApmExists = false;
            }
        }
        if (sApmExists) {
            return sConfigManager;
        }
        return null;
    }

    public String getApmConfigUrl() {
        if (!TextUtils.isEmpty(this.mApmConfigUrl)) {
            return this.mApmConfigUrl;
        }
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/appmonitor/v3/settings", LIZ);
    }

    public String getExceptionUploadUrl() {
        if (!TextUtils.isEmpty(this.mExceptionUploadUrl)) {
            return this.mExceptionUploadUrl;
        }
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/c/exception", LIZ);
    }

    public String getExceptionZipUploadUrl() {
        if (!TextUtils.isEmpty(this.mExceptionZipUploadUrl)) {
            return this.mExceptionZipUploadUrl;
        }
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/c/custom_exception/zip", LIZ);
    }

    public String getJavaCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mJavaCrashUploadUrl)) {
            return this.mJavaCrashUploadUrl;
        }
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/c/crash", LIZ);
    }

    public String getLaunchCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mLaunchCrashUploadUrl)) {
            return this.mLaunchCrashUploadUrl;
        }
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/c/exception/dump_collection", LIZ);
    }

    public String getNativeCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mNativeCrashUploadUrl)) {
            return this.mNativeCrashUploadUrl;
        }
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/c/native_bin_crash", LIZ);
    }

    public boolean isDebugMode() {
        if (!this.mIsDebugMode) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0.LJ == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean com_bytedance_crash_runtime_ConfigManager__isEnsureEnable$___twin___() {
        /*
            r3 = this;
            boolean r0 = X.PJA.LJIIL()
            r2 = 0
            if (r0 == 0) goto L1f
            X.PJt r0 = X.PK0.LIZIZ()
            java.lang.String r1 = r0.LIZ()
            java.util.HashMap<java.lang.String, X.PJ9> r0 = X.PJ9.LJFF
            java.lang.Object r0 = r0.get(r1)
            X.PJ9 r0 = (X.PJ9) r0
            if (r0 == 0) goto L1d
            boolean r0 = r0.LJ
            if (r0 == 0) goto L1f
        L1d:
            r2 = 1
        L1e:
            return r2
        L1f:
            boolean r0 = r3.mEnsureEnable
            if (r0 == 0) goto L1e
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.ConfigManager.com_bytedance_crash_runtime_ConfigManager__isEnsureEnable$___twin___():boolean");
    }

    public String getAsanReportUploadUrl() {
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/c/native_bin_crash", LIZ);
    }

    public String getCoreDumpUrl() {
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/c/core_dump_collect", LIZ);
    }

    public String getEventUploadUrl() {
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/", LIZ);
    }

    public String getNativeMemUrl() {
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "/monitor/collect/c/rapheal_file_collect", LIZ);
    }

    public String getUploadCheckCoreDumpUrl() {
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, C77321UWf.LJLIL, "", LIZ);
    }

    public long getBlockInterval() {
        return this.mBlockMonitorInterval;
    }

    public long getDefaultAnrCheckInterval() {
        return this.mAnrCheckInterval;
    }

    public InterfaceC63984P9g getEncryptImpl() {
        return this.mEncryptImpl;
    }

    public Set<String> getFilterThreadSet() {
        return PJ2.LIZ;
    }

    public long getLaunchCrashInterval() {
        return this.mLaunchCrashInterval;
    }

    public int getLogcatDumpCount() {
        return this.mLogcatDumpCount;
    }

    public int getLogcatLevel() {
        return this.mLogcatLevel;
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isApmExists() {
        return PJ5.LJ;
    }

    public boolean isBlockMonitorEnable() {
        return this.mBlockMonitorEnable;
    }

    public boolean isEnsureWithLogcat() {
        return this.mEnsureWithLogcat;
    }

    public boolean isReportErrorEnable() {
        return this.reportErrorEnable;
    }

    public static boolean com_bytedance_crash_runtime_ConfigManager_com_ss_android_ugc_aweme_lancet_EnsureManagerLancet_isEnsureEnableInAb(ConfigManager configManager) {
        if (InterfaceC52297Kfl.LIZ) {
            return true;
        }
        return configManager.com_bytedance_crash_runtime_ConfigManager__isEnsureEnable$___twin___();
    }

    public boolean isCrashIgnored(String str) {
        try {
            PJF pjf = new PJF(str);
            if (PJG.LIZ(pjf)) {
                return true;
            }
            if (C48008Ism.LIZJ(PK0.LIZ)) {
                PJ5.LIZIZ();
                return PJG.LIZ(pjf);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setAlogUploadUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mAlogUploadUrl = str;
    }

    public void setBlockMonitorEnable(boolean z) {
        this.mBlockMonitorEnable = z;
    }

    public void setBlockMonitorInterval(long j) {
        this.mBlockMonitorInterval = j;
    }

    public void setConfigGetUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mApmConfigUrl = str;
    }

    public void setCurrentProcessName(String str) {
        C64264PKa.LIZ = str;
    }

    public void setDebugMode(boolean z) {
        this.mIsDebugMode = z;
    }

    public void setDefaultAnrCheckInterval(long j) {
        this.mAnrCheckInterval = j;
    }

    public void setEncryptImpl(InterfaceC63984P9g interfaceC63984P9g) {
        if (interfaceC63984P9g != null) {
            this.mEncryptImpl = interfaceC63984P9g;
        }
    }

    public void setEnsureEnable(boolean z) {
        this.mEnsureEnable = z;
    }

    public void setEnsureWithLogcat(boolean z) {
        this.mEnsureWithLogcat = z;
    }

    public void setJavaCrashUploadUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mJavaCrashUploadUrl = str;
    }

    public void setLaunchCrashInterval(long j) {
        if (j > 0) {
            this.mLaunchCrashInterval = j;
        }
    }

    public void setLaunchCrashUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mExceptionUploadUrl = str;
        int indexOf = str.indexOf("//");
        if (indexOf == -1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str.substring(0, str.indexOf("/") + 1));
            LIZ.append("monitor/collect/c/exception/dump_collection");
            this.mLaunchCrashUploadUrl = X1D.LIZIZ(LIZ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str.substring(0, str.indexOf("/", indexOf + 2) + 1));
        LIZ2.append("monitor/collect/c/exception/dump_collection");
        this.mLaunchCrashUploadUrl = X1D.LIZIZ(LIZ2);
    }

    public void setLogcatDumpCount(int i) {
        if (i > 0) {
            this.mLogcatDumpCount = i;
        }
    }

    public void setLogcatLevel(int i) {
        if (i >= 0 && i <= 4) {
            this.mLogcatLevel = i;
        }
    }

    public void setNativeCrashUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mNativeCrashUploadUrl = str;
    }

    public void setReportErrorEnable(boolean z) {
        this.reportErrorEnable = z;
    }

    public void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.mThreadPoolExecutor = threadPoolExecutor;
    }
}
