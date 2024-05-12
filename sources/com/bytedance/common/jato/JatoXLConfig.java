package com.bytedance.common.jato;

import X.InterfaceC36130EFy;
import android.content.Context;
import com.bytedance.common.jato.logcut.LogCut;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class JatoXLConfig {
    public long mBlockInterval;
    public Context mContext;
    public ExecutorService mExecuteService;
    public boolean mIsAddref;
    public boolean mIsDebug;
    public boolean mIsEnabledDalvikGcBlocker;
    public int mLogCutType;
    public InterfaceC36130EFy mMonitor;
    public int mPriority;
    public boolean mUseByteHook;
    public boolean mUseJitBlock;
    public boolean mUseLogCut;
    public boolean mUseSoLoad;
    public static int LOGCUT_NATIVE_LOG = LogCut.LOGCUT_NATIVE_LOG;
    public static int LOGCUT_JNI_LOG = LogCut.LOGCUT_JNI_LOG;
    public static int LOGCUT_ALL_LOG = LogCut.LOGCUT_ALL_LOG;
    public boolean mIsEnabledArtGcBlocker = true;
    public int mMaxGcBlockTime = 3000;
    public boolean isEnabledCpuSetFeature = true;

    public int getMaxGcBlockTimeout() {
        return this.mMaxGcBlockTime;
    }

    public boolean isDebug() {
        return this.mIsDebug;
    }

    public boolean isEnabledArtGcBlocker() {
        return this.mIsEnabledArtGcBlocker;
    }

    public boolean isEnabledDalvikGcBlocker() {
        return this.mIsEnabledDalvikGcBlocker;
    }
}
