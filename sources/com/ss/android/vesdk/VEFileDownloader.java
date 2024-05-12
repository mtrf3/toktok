package com.ss.android.vesdk;

import X.C1B6;
import X.C36570EWw;
import X.E0U;
import X.P4Q;
import X.X1D;
import Y.ARunnableS43S0100000_7;
import android.text.TextUtils;
import com.ss.android.ttve.nativePort.TENativeFileDownloader;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import defpackage.a1;
import defpackage.i0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public class VEFileDownloader {
    public long mNativeHandle;
    public AtomicBoolean mIsDestroying = new AtomicBoolean(false);
    public Lock mDestroyLock = new ReentrantLock();
    public final TENativeFileDownloader mNativeDownloader = new TENativeFileDownloader();

    public synchronized void destroyFileDownload() {
        if (this.mIsDestroying.get()) {
            P4Q.LJII("VEFileDownloader", "destroyFileDownload is already been called.");
        } else if (this.mNativeHandle == 0) {
            P4Q.LJII("VEFileDownloader", "destroyFileDownload downloadHandle = 0, may have been auto-destroyed 1");
        } else {
            this.mIsDestroying.set(true);
            new PthreadThread(new ARunnableS43S0100000_7(this, 87), "VEFileDownloader").start();
        }
    }

    public static int checkTTNetAvailable() {
        return TENativeFileDownloader.nativeCheckTTNetAvailable();
    }

    public int getBufferTimeWithTimestamp(int i) {
        if (i < 0) {
            return -2;
        }
        if (this.mIsDestroying.get()) {
            P4Q.LJII("VEFileDownloader", "destroyFileDownload is already been called and getBufferTimeWithTimestamp is invalided");
            return -1;
        }
        if (this.mDestroyLock.tryLock()) {
            long j = this.mNativeHandle;
            if (j == 0) {
                P4Q.LJII("VEFileDownloader", "mNativeHandle is nullptr");
                this.mDestroyLock.unlock();
                return -1;
            }
            int bufferTimeWithTimestamp = this.mNativeDownloader.getBufferTimeWithTimestamp(j, i);
            this.mDestroyLock.unlock();
            return bufferTimeWithTimestamp;
        }
        P4Q.LJII("VEFileDownloader", "mDestroyLock is already been called and getBufferTimeWithTimestamp is invalided");
        return -1;
    }

    public static String getFilePathWithUrl(String str, String str2) {
        String nativeGetMD5FileName = TEVideoUtils.nativeGetMD5FileName(str, str2);
        if (nativeGetMD5FileName != null && C1B6.LIZIZ(nativeGetMD5FileName) && new File(i0.LJFF(nativeGetMD5FileName, ".vesf")).exists() && new File(a1.LJ(nativeGetMD5FileName, ".vesf", ".meta")).exists()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getFilePathWithUrl found, url = ");
            LIZ.append(str2);
            P4Q.LJFF("VEFileDownloader", X1D.LIZIZ(LIZ));
            return nativeGetMD5FileName;
        }
        return null;
    }

    public synchronized boolean createFileDownload(VEDownloaderConfig vEDownloaderConfig, E0U e0u) {
        boolean z;
        P4Q.LJFF("VEFileDownloader", "createFileDownload in.");
        if (TextUtils.isEmpty(vEDownloaderConfig.url) || TextUtils.isEmpty(vEDownloaderConfig.cacheDir)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createFileDownload param error! url = ");
            LIZ.append(vEDownloaderConfig.url);
            LIZ.append(", cacheDir = ");
            LIZ.append(vEDownloaderConfig.cacheDir);
            P4Q.LIZJ("VEFileDownloader", X1D.LIZIZ(LIZ));
            return false;
        }
        long createFileDownload = this.mNativeDownloader.createFileDownload(vEDownloaderConfig.url, vEDownloaderConfig.cacheDir, vEDownloaderConfig.externalPath, vEDownloaderConfig.externalFirstSegOffset, vEDownloaderConfig.externalMediaSize, vEDownloaderConfig.maxDownloadCount, vEDownloaderConfig.maxCacheFileCount, vEDownloaderConfig.maxNetworkTimeout, vEDownloaderConfig.needSaveFile, vEDownloaderConfig.headerParams, new C36570EWw(this, e0u));
        this.mNativeHandle = createFileDownload;
        if (createFileDownload != 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
