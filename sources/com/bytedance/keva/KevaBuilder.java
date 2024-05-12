package com.bytedance.keva;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class KevaBuilder {
    public static KevaBuilder mInstance = new KevaBuilder();
    public Context mContext;
    public boolean mEnableArrayMap;
    public boolean mEnableAsyncWrite;
    public boolean mEnableExecutorOpt;
    public boolean mEnableLoadOpt;
    public boolean mEnableLockOpt;
    public int mExecuteKevaType;
    public Executor mExecutor;
    public int mIsLoadFromNative;
    public KevaMonitor mMonitor;
    public String mPortedRepoName;
    public File mWorkDir;

    public static void clearInstance() {
        mInstance = null;
    }

    public static KevaBuilder getInstance() {
        KevaBuilder kevaBuilder = mInstance;
        if (kevaBuilder != null) {
            return kevaBuilder;
        }
        return new KevaBuilder();
    }

    public static void onFlush() {
        KevaAsyncWriter.onFlush();
    }

    public KevaBuilder setAsyncWriteEnable(boolean z) {
        this.mEnableAsyncWrite = z;
        return this;
    }

    public KevaBuilder setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public void setEnableArrayMap(boolean z) {
        this.mEnableArrayMap = z;
    }

    public void setEnableExecutorOpt(boolean z) {
        this.mEnableExecutorOpt = z;
    }

    public void setEnableLoadOpt(boolean z) {
        this.mEnableLoadOpt = z;
    }

    public void setEnableLockOpt(boolean z) {
        this.mEnableLockOpt = z;
    }

    public void setExecuteType(int i) {
        this.mExecuteKevaType = i;
    }

    public KevaBuilder setExecutor(Executor executor) {
        this.mExecutor = executor;
        return this;
    }

    public KevaBuilder setIsLoadFromNative(int i) {
        this.mIsLoadFromNative = i;
        return this;
    }

    public KevaBuilder setMonitor(KevaMonitor kevaMonitor) {
        this.mMonitor = kevaMonitor;
        return this;
    }

    public KevaBuilder setPortedRepoName(String str) {
        this.mPortedRepoName = str;
        return this;
    }

    public KevaBuilder setWorkDir(File file) {
        if (!file.exists() && !file.mkdirs()) {
            return this;
        }
        this.mWorkDir = file;
        return this;
    }
}
