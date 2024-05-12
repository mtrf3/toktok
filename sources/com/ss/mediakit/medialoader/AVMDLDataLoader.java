package com.ss.mediakit.medialoader;

import X.C00F;
import X.C06490Nh;
import X.C16880lQ;
import X.C39045FUb;
import X.C47242IgQ;
import X.C47994IsY;
import X.C61845OOz;
import X.C64600PWy;
import X.UPJ;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.mediakit.downloader.AVMDLHttpExcutor;
import com.ss.mediakit.net.AVMDLDNSInfo;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.mediakit.net.AVMDLMultiNetwork;
import com.ss.mediakit.net.IPCache;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;
import defpackage.a1;
import defpackage.i0;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class AVMDLDataLoader implements Handler.Callback {
    public static final int KeyIsLoaderFactoryP2PLevel = 8216;
    public static boolean isSupportQueryEncode = true;
    public static Context mGlobalApplicationContext = null;
    public static volatile AVMDLDataLoader mInstance = null;
    public static volatile boolean mIsAsyncLoadPlugin = false;
    public static Boolean mIsByteMediaNetInit = Boolean.FALSE;
    public static volatile boolean mIsLibraryLoaded = false;
    public static volatile boolean mIsMdlByteMediaNetPluginLoaded = false;
    public static volatile boolean mIsMdlTtnetPluginLoaded = false;
    public static volatile boolean mIsMdlv2PluginLoaded = false;
    public static String mLoadFailMsg = "";
    public boolean isSupportGetAuth;
    public AVMDLDataLoaderConfigure mConfigure;
    public long mEndTime;
    public LoaderListener mEventListener;
    public long mHandle;
    public Handler mHandler;
    public AVMDLDataLoaderListener mLiveListener;
    public Handler mLogHandler;
    public Thread mMsgThread;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    public final ReentrantReadWriteLock mReadWritedLock;
    public long mSartTime;
    public AVMDLStartCompleteListener mStartCompleteListener;
    public volatile int mState;
    public AVMDLTaskEventListener mTaskListener;
    public AVMDLDataLoaderListener mVodListener;
    public Map<String, AVMDLCopyOperation> mWaitingCopyItem;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;

    public static native void _addDataSource(long j, int i, String str);

    public static native void _cancel(long j, String str);

    public static native void _cancelAll(long j);

    public static native void _cancelAllPreloadWaitReqs(long j);

    public static native void _cleanCacheDir(long j, long j2);

    public static native void _cleanSpecifiedCacheDir(long j, String str, int i);

    public static native void _clearAllCaches(long j);

    public static native long _clearAndGetCachesByUsedTime(long j, long j2, int i);

    public static native void _clearCachesByUsedTime(long j, long j2);

    public static native void _clearNetinfoCache(long j);

    public static native void _close(long j);

    public static native int _copyFile(long j, String str, String str2);

    public static native long _copyFile64(long j, String str, String str2);

    public static native int _copyFileWithCustomDir(long j, String str, String str2, String str3);

    public static native long _copyFileWithCustomDir64(long j, String str, String str2, String str3);

    public static native int _copyFileWithForceFlag(long j, String str, String str2, int i);

    public static native long _copyFileWithForceFlag64(long j, String str, String str2, int i);

    private final native long _create();

    public static native void _downloadResource(long j, String str);

    public static native String _encodeUrl(String str, int i);

    public static native void _forceClearAllCaches(long j);

    public static native void _forceRemoveCacheFile(long j, String str);

    public static native String _getAuth(long j, String str);

    public static native String _getCDNLog(long j, String str);

    public static native long _getContinueCacheSize(long j, String str, int i, long j2);

    public static native int _getIsFileCacheComplete(long j, String str);

    public static native long _getLongValue(long j, int i);

    public static native long _getLongValueByStr(long j, String str, int i);

    public static native long _getLongValueByStrStr(long j, String str, String str2, int i);

    public static native String _getStringValue(long j, int i);

    public static native String _getStringValueByStr(long j, String str, int i);

    public static native String _getStringValueByStrStr(long j, String str, String str2, int i);

    public static native int _haveRunningPlayTask(long j, String str);

    public static native void _makeFileAutoDeleteFlag(long j, String str, int i);

    public static native String _makeTsFileKey(String str, String str2);

    public static native int _onCellularAlwaysUp(long j, long j2, int i);

    public static native int _onInitMultiNetworkEnv(long j, int i);

    public static native void _p2pPredown(long j, String str);

    public static native void _preConnectByHost(long j, String str, int i);

    public static native void _preloadGroupResource(long j, String str, String str2, int i, int i2);

    public static native void _preloadResource(long j, String str, int i);

    public static native void _preloadResourceWithOffset(long j, String str, int i, int i2);

    public static native void _removeCacheFile(long j, String str);

    public static native void _removeCacheFileInDirPath(long j, String str, String str2);

    public static native void _removeOfflineFilePath(long j, boolean z, String str);

    public static native void _resetPreloadTraceId(long j, String str);

    public static native void _resumeFileWriteIO(long j);

    public static native void _setInt64Value(long j, int i, long j2);

    public static native void _setInt64ValueByStrKey(long j, int i, String str, long j2);

    public static native void _setIntValue(long j, int i, int i2);

    public static native void _setStringValue(long j, int i, String str);

    public static native int _start(long j);

    public static native void _stop(long j);

    public static native void _suspendedDownload(long j, String str);

    public static native int _tryDownloadPlayReqByKey(long j, String str);

    public static native void _updateDNSInfo(long j, String str, String str2, long j2, String str3, int i);

    public static native int _writeDataToFile(long j, String str, long j2, long j3, int i, byte[] bArr);

    private boolean isNotifyInfo(int i) {
        return i == 4 || i == 20 || i == 50 || i == 8 || i == 3 || i == 21 || i == 51 || i == 7 || i == 22 || i == 52 || i == 901 || i == 24 || i == 902;
    }

    public static boolean isVCBasekitStaticLinked() {
        return false;
    }

    public int start() {
        return com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_feed_lancet_PlayerLancet_start(this);
    }

    public static Context getApplicationContext() {
        Context context;
        synchronized (AVMDLDataLoader.class) {
            context = mGlobalApplicationContext;
        }
        return context;
    }

    public static AVMDLDataLoader getInstance() {
        if (mInstance == null) {
            synchronized (AVMDLDataLoader.class) {
                if (mInstance == null) {
                    try {
                        mInstance = new AVMDLDataLoader(null);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        mInstance = null;
                    }
                }
            }
        }
        return mInstance;
    }

    public static synchronized String getLoadFailMsg() {
        String str;
        synchronized (AVMDLDataLoader.class) {
            str = mLoadFailMsg;
        }
        return str;
    }

    private String getProxyUrl() {
        String str;
        AVMDLLog.d("AVMDLProxy", "----try get proxyaddr");
        String property = System.getProperty("http.proxyHost");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("proxy host:");
        LIZ.append(property);
        AVMDLLog.d("AVMDLProxy", X1D.LIZIZ(LIZ));
        if (!TextUtils.isEmpty(property)) {
            String property2 = System.getProperty("http.proxyPort");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("proxy port:");
            LIZ2.append(property2);
            AVMDLLog.d("AVMDLProxy", X1D.LIZIZ(LIZ2));
            if (!TextUtils.isEmpty(property2)) {
                str = UPJ.LIZIZ("http://", property, ":", property2, "/");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("****end get proxyaddr, result:");
                LIZ3.append(str);
                AVMDLLog.d("AVMDLProxy", X1D.LIZIZ(LIZ3));
                return str;
            }
        }
        str = null;
        StringBuilder LIZ32 = X1D.LIZ();
        LIZ32.append("****end get proxyaddr, result:");
        LIZ32.append(str);
        AVMDLLog.d("AVMDLProxy", X1D.LIZIZ(LIZ32));
        return str;
    }

    private void hijack() {
        AVMDLLog.d("ttmdljava", "----hijack start");
        AVMDLDNSParser.processHijack();
        AVMDLLog.d("ttmdljava", "hijack clear net cache: ");
        clearNetinfoCache();
        AVMDLLog.d("ttmdljava", "****hijack end");
    }

    public static synchronized int initDependency() {
        synchronized (AVMDLDataLoader.class) {
            C39045FUb.LIZ();
            VcnlibloadWrapper.tryLoadVcnlib();
            VcnlibloadWrapper.tryLoadVcnverifylib();
        }
        return 0;
    }

    private void initNativeHandle() {
        if (this.mHandle != 0) {
            return;
        }
        try {
            this.mHandle = _create();
        } catch (Throwable unused) {
            this.mHandle = 0L;
        }
        if (this.mHandle != 0 && this.mHandler == null) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
            } else {
                this.mHandler = new Handler(C16880lQ.LLJJJJ(), this);
            }
        }
    }

    public static synchronized int initWithLibraryManager() {
        synchronized (AVMDLDataLoader.class) {
            int i = 0;
            if (mIsLibraryLoaded) {
                return 0;
            }
            if (AVMDLLibraryManager.loadLibraries()) {
                mIsLibraryLoaded = true;
            }
            if (!mIsLibraryLoaded) {
                i = -1;
            }
            return i;
        }
    }

    public static synchronized void loadAVMDLBaseLibrary() {
        synchronized (AVMDLDataLoader.class) {
            initDependency();
            try {
                C16880lQ.LLJJJIL("avmdlbase");
            } catch (Throwable unused) {
            }
        }
    }

    private int testFileIOSpeed() {
        String LLLZI;
        double d;
        if (TextUtils.isEmpty(this.mConfigure.mCacheDir)) {
            return -1;
        }
        String str = this.mConfigure.mCacheDir;
        if (str.charAt(str.length() - 1) == '/') {
            LLLZI = C16880lQ.LLLZI(Locale.US, "%siospeed", new Object[]{this.mConfigure.mCacheDir});
        } else {
            LLLZI = C16880lQ.LLLZI(Locale.US, "%s/iospeed", new Object[]{this.mConfigure.mCacheDir});
        }
        File file = new File(LLLZI);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(LLLZI, "iospeed.cach");
        if (file2.exists()) {
            C16880lQ.LLLZZIL(file2);
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            int i = 0;
            double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            double d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            do {
                try {
                    d = testFileIO(LLLZI, i, randomAccessFile);
                    try {
                        AVMDLLog.d("BENCHMARKIO", C16880lQ.LLLZI(Locale.US, "num:%d result:%f", new Object[]{Integer.valueOf(i), Double.valueOf(d)}));
                    } catch (Exception e) {
                        e = e;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("test fileio exception:");
                        LIZ.append(e);
                        AVMDLLog.d("BENCHMARKIO", X1D.LIZIZ(LIZ));
                        C16880lQ.LLLLIIL(e);
                        if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                            try {
                                d3 += d;
                                d2 += 1.0d;
                            } catch (Exception unused) {
                            }
                        }
                        i++;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && i >= 20) {
                    d3 += d;
                    d2 += 1.0d;
                }
                i++;
            } while (i < 30);
            randomAccessFile.close();
            C16880lQ.LLLZZIL(file2);
            if (d2 <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                return 0;
            }
            return (int) (d3 / d2);
        } catch (Exception e3) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("create accefile exception:");
            LIZ2.append(e3);
            AVMDLLog.d("BENCHMARKIO", X1D.LIZIZ(LIZ2));
            return -1;
        }
    }

    public static synchronized boolean tryLoadByteMediaNetLoaderPlugin() {
        boolean z;
        synchronized (AVMDLDataLoader.class) {
            z = mIsMdlByteMediaNetPluginLoaded;
        }
        return z;
    }

    private void tryLoadP2pPluginInternal() {
        if (mIsAsyncLoadPlugin && mIsMdlv2PluginLoaded) {
            try {
                C16880lQ.LLJJJIL("avmdlp2pv2");
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized boolean tryLoadTTNetLoaderPlugin() {
        boolean z;
        synchronized (AVMDLDataLoader.class) {
            z = mIsMdlTtnetPluginLoaded;
        }
        return z;
    }

    public void cancelAll() {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cancelAll(j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void cancelAllPreloadWaitReqs() {
        if (this.mState != 1) {
            return;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cancelAllPreloadWaitReqs(j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void clearAllCaches() {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _clearAllCaches(j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void clearNetinfoCache() {
        if (this.mState != 1) {
            return;
        }
        IPCache.getInstance().clear();
        this.mWriteLock.lock();
        try {
            try {
                _clearNetinfoCache(this.mHandle);
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                return;
            }
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _close(j);
                    this.mHandle = 0L;
                    this.mState = 5;
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        this.mHandler = null;
                    }
                    Handler handler2 = this.mLogHandler;
                    if (handler2 != null) {
                        handler2.removeCallbacksAndMessages(null);
                        this.mLogHandler.getLooper().quit();
                        this.mLogHandler = null;
                        this.mMsgThread = null;
                    }
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public int com_ss_mediakit_medialoader_AVMDLDataLoader__start$___twin___() {
        if (this.mState == 1) {
            return 0;
        }
        initNativeHandle();
        new PthreadThread(new Runnable() { // from class: com.ss.mediakit.medialoader.AVMDLDataLoader.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_mediakit_medialoader_AVMDLDataLoader$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_mediakit_medialoader_AVMDLDataLoader$2__run$___twin___() {
                AVMDLDataLoader.this.startInternal();
            }

            public static void com_ss_mediakit_medialoader_AVMDLDataLoader$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_mediakit_medialoader_AVMDLDataLoader$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, "AVMDLDataLoader").start();
        return 0;
    }

    public void forceClearAllCaches() {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _forceClearAllCaches(j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public long getAllCacheSize() {
        long j = -1;
        if (this.mState != 1) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValue(j2, 100);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public AVMDLDataLoaderConfigure getConfig() {
        if (this.mState != 1) {
            return null;
        }
        return this.mConfigure;
    }

    public String getLocalAddr() {
        String str = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str = _getStringValue(j, 4);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return str;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public boolean isRunning() {
        if (this.mState == 1) {
            return true;
        }
        return false;
    }

    public int onInitMultiNetworkEnv() {
        AVMDLLog.d("AVMDLDataLoader", "start on init multinetwork env");
        this.mWriteLock.lock();
        int i = -1;
        try {
            long j = this.mHandle;
            if (j != 0) {
                i = _onInitMultiNetworkEnv(j, Build.VERSION.SDK_INT);
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        AVMDLLog.d("AVMDLDataLoader", "end on init multinetwork env");
        return i;
    }

    public void resumeFileWriteIO() {
        if (this.mState != 1) {
            return;
        }
        AVMDLLog.d("AVMDLDataLoader", "resume file write io: ");
        this.mWriteLock.lock();
        try {
            if (this.mConfigure.mMaxFileMemCacheSize > 0) {
                _resumeFileWriteIO(this.mHandle);
                this.mConfigure.mMaxFileMemCacheSize = 0;
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
    }

    public void resumePreConnect() {
        setIntValue(8223, 0);
    }

    public void startInternal() {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                initLogThread(this);
                if (this.mHandle != 0) {
                    tryLoadP2pPluginInternal();
                    setConfigureInternal(this.mConfigure);
                    if (_start(this.mHandle) >= 0) {
                        this.mState = 1;
                    }
                }
            }
            this.mWriteLock.unlock();
            if (this.mConfigure.mEnableBenchMarkIOSpeed > 0) {
                int testFileIOSpeed = testFileIOSpeed();
                AVMDLLog.d("BENCHMARKIO", C16880lQ.LLLZI(Locale.US, "test io average speed:%d", new Object[]{Integer.valueOf(testFileIOSpeed)}));
                if (testFileIOSpeed > 0) {
                    setIntValue(1508, testFileIOSpeed);
                }
            }
            AVMDLStartCompleteListener aVMDLStartCompleteListener = this.mStartCompleteListener;
            if (aVMDLStartCompleteListener != null) {
                aVMDLStartCompleteListener.onStartComplete();
            }
            if (this.mState == 1 && this.mConfigure.mEnableCellularUp > 0) {
                AVMDLLog.d("AVMDLDataLoader", "start try up cellular");
                AVMDLMultiNetwork.alwayUpCellular(getApplicationContext());
                AVMDLLog.d("AVMDLDataLoader", "end try up cellular");
            }
            AVMDLMultiNetwork.registerNetworkChangeCallback(getApplicationContext());
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void stop() {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _stop(j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void suspendPreconnect() {
        setIntValue(8223, 1);
    }

    public static boolean tryLoadVcnverifylib() {
        if (!VcnlibloadWrapper.tryLoadVcnlib()) {
            AVMDLLog.d("vcn", "load vcnverify fail");
            return false;
        }
        AVMDLLog.d("vcn", "load vcnverify suc");
        return true;
    }

    public AVMDLDataLoader(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        this.mState = -1;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mMsgThread = null;
        this.isSupportGetAuth = true;
        this.mStartCompleteListener = null;
        this.mWaitingCopyItem = new HashMap();
        this.mTaskListener = null;
        initNativeHandle();
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        if (this.mHandle != 0) {
            initLogThread(this);
            this.mConfigure = aVMDLDataLoaderConfigure;
            this.mState = 0;
            this.isSupportGetAuth = true;
            return;
        }
        throw new Exception("create native mdl fail");
    }

    private void _copyInternal(AVMDLCopyOperation aVMDLCopyOperation) {
        long copyFile;
        if (TextUtils.isEmpty(aVMDLCopyOperation.mCustomDir)) {
            copyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath, aVMDLCopyOperation.mForceCopyUnfinished);
        } else {
            copyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mCustomDir, aVMDLCopyOperation.mDestPath);
        }
        AVMDLFileInfo cacheInfo = getCacheInfo(aVMDLCopyOperation.mFileKey);
        if (cacheInfo == null) {
            AVMDLCopyOperationListener aVMDLCopyOperationListener = aVMDLCopyOperation.mListener;
            if (aVMDLCopyOperationListener != null) {
                aVMDLCopyOperationListener.onCopyComplete(false, -5, C61845OOz.LIZ("copy failed. file info null ", copyFile));
                return;
            }
            return;
        }
        AVMDLCopyOperationListener aVMDLCopyOperationListener2 = aVMDLCopyOperation.mListener;
        if (aVMDLCopyOperationListener2 != null) {
            aVMDLCopyOperationListener2.onFileInfo(cacheInfo);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("copy file result: ");
        LIZ.append(copyFile);
        AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ));
        AVMDLCopyOperationListener aVMDLCopyOperationListener3 = aVMDLCopyOperation.mListener;
        if (aVMDLCopyOperationListener3 != null) {
            if (copyFile == cacheInfo.mCacheSize || copyFile == cacheInfo.mContentLenght || copyFile == 0) {
                aVMDLCopyOperationListener3.onCopyComplete(true, 0, "copy success.");
            } else {
                aVMDLCopyOperationListener3.onCopyComplete(false, -5, C61845OOz.LIZ("copy failed.copy error code ", copyFile));
            }
        }
    }

    public static int com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_feed_lancet_PlayerLancet_start(AVMDLDataLoader aVMDLDataLoader) {
        int startMethodHook;
        if (((Boolean) C47994IsY.LIZ.getValue()).booleanValue() && (startMethodHook = C47242IgQ.LIZ().startMethodHook()) == 0) {
            return startMethodHook;
        }
        return aVMDLDataLoader.com_ss_mediakit_medialoader_AVMDLDataLoader__start$___twin___();
    }

    private void copyInternal(AVMDLCopyOperation aVMDLCopyOperation) {
        AVMDLCopyOperationListener aVMDLCopyOperationListener;
        if (aVMDLCopyOperation == null || TextUtils.isEmpty(aVMDLCopyOperation.mFileKey) || TextUtils.isEmpty(aVMDLCopyOperation.mDestPath)) {
            AVMDLLog.d("AVMDLDataLoader", "copy file invalid filekey or destpath is null");
            if (aVMDLCopyOperation != null && (aVMDLCopyOperationListener = aVMDLCopyOperation.mListener) != null) {
                aVMDLCopyOperationListener.onCopyComplete(false, -1, "invalid parameter");
                return;
            }
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    int _getIsFileCacheComplete = _getIsFileCacheComplete(j, aVMDLCopyOperation.mFileKey);
                    if (_getIsFileCacheComplete == 1) {
                        _copyInternal(aVMDLCopyOperation);
                    } else if (_getIsFileCacheComplete == -1) {
                        AVMDLCopyOperationListener aVMDLCopyOperationListener2 = aVMDLCopyOperation.mListener;
                        if (aVMDLCopyOperationListener2 != null) {
                            aVMDLCopyOperationListener2.onCopyComplete(false, -6, "cache file read writer failed.");
                        }
                    } else if (aVMDLCopyOperation.mForceCopyUnfinished) {
                        _copyInternal(aVMDLCopyOperation);
                    } else if (aVMDLCopyOperation.mWaitIfCaching) {
                        int _haveRunningPlayTask = _haveRunningPlayTask(this.mHandle, aVMDLCopyOperation.mFileKey);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("try download play ");
                        LIZ.append(aVMDLCopyOperation.mFileKey);
                        LIZ.append(" result: ");
                        LIZ.append(_haveRunningPlayTask);
                        AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ));
                        if (_haveRunningPlayTask > 0) {
                            this.mWaitingCopyItem.put(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation);
                        } else {
                            AVMDLCopyOperationListener aVMDLCopyOperationListener3 = aVMDLCopyOperation.mListener;
                            if (aVMDLCopyOperationListener3 != null) {
                                aVMDLCopyOperationListener3.onCopyComplete(false, -4, "file key not playing.");
                            }
                        }
                    } else {
                        AVMDLCopyOperationListener aVMDLCopyOperationListener4 = aVMDLCopyOperation.mListener;
                        if (aVMDLCopyOperationListener4 != null) {
                            aVMDLCopyOperationListener4.onCopyComplete(false, -3, "cache not finish.");
                        }
                    }
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
                AVMDLCopyOperationListener aVMDLCopyOperationListener5 = aVMDLCopyOperation.mListener;
                if (aVMDLCopyOperationListener5 != null) {
                    aVMDLCopyOperationListener5.onCopyComplete(false, -2, "medialoader not running");
                }
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    private String encodeUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private void handleCopyMsg(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo == null || TextUtils.isEmpty(aVMDLDataLoaderNotifyInfo.logInfo)) {
            return;
        }
        int i = aVMDLDataLoaderNotifyInfo.what;
        if (i != 3 && i != 51) {
            return;
        }
        String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
        if (split.length < 4) {
            return;
        }
        long longValue = CastLongProtector.valueOf(split[0]).longValue();
        long longValue2 = CastLongProtector.valueOf(split[1]).longValue();
        if (longValue2 <= 0 && aVMDLDataLoaderNotifyInfo.what != 4) {
            return;
        }
        String str = split[2];
        if (!this.mWaitingCopyItem.containsKey(str)) {
            return;
        }
        AVMDLCopyOperation aVMDLCopyOperation = this.mWaitingCopyItem.get(str);
        if (longValue == longValue2) {
            if (aVMDLCopyOperation == null || TextUtils.isEmpty(aVMDLCopyOperation.mFileKey)) {
                return;
            }
            long copyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath, aVMDLCopyOperation.mForceCopyUnfinished);
            AVMDLCopyOperationListener aVMDLCopyOperationListener = aVMDLCopyOperation.mListener;
            if (aVMDLCopyOperationListener == null) {
                return;
            }
            if (copyFile == 0) {
                aVMDLCopyOperationListener.onCopyComplete(true, 0, "copy success.");
                return;
            } else {
                aVMDLCopyOperationListener.onCopyComplete(false, -5, "copy failed.");
                return;
            }
        }
        if (aVMDLDataLoaderNotifyInfo.what != 51) {
            return;
        }
        if (_haveRunningPlayTask(this.mHandle, aVMDLCopyOperation.mFileKey) > 0) {
            AVMDLLog.d("AVMDLDataLoader", C16880lQ.LLLZI(Locale.US, "have running playtask skip, %s", new Object[]{aVMDLCopyOperation.mFileKey}));
            return;
        }
        AVMDLCopyOperationListener aVMDLCopyOperationListener2 = aVMDLCopyOperation.mListener;
        if (aVMDLCopyOperationListener2 == null) {
            return;
        }
        aVMDLCopyOperationListener2.onCopyComplete(false, -3, "copy failed.");
    }

    public static synchronized int init(boolean z) {
        synchronized (AVMDLDataLoader.class) {
            if (mIsLibraryLoaded) {
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!mIsLibraryLoaded) {
                C39045FUb.LIZ();
                VcnlibloadWrapper.tryLoadVcnlib();
                loadAVMDLBaseLibrary();
                try {
                    C16880lQ.LLJJJIL("avmdl");
                    mIsLibraryLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Can't load avmdl library: ");
                    LIZ.append(e);
                    mLoadFailMsg = X1D.LIZIZ(LIZ);
                } catch (Throwable th) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("other exception when loading avmdl library: ");
                    LIZ2.append(th);
                    mLoadFailMsg = X1D.LIZIZ(LIZ2);
                }
                VcnlibloadWrapper.tryLoadVcnverifylib();
                tryLoadTTNetLoaderPlugin();
                tryLoadByteMediaNetLoaderPlugin();
            }
            if (mIsLibraryLoaded) {
                return 0;
            }
            return -1;
        }
    }

    public static void initApplicationContext(Context context) {
        synchronized (AVMDLDataLoader.class) {
            if (mGlobalApplicationContext == null) {
                mGlobalApplicationContext = context;
            }
        }
    }

    private void initLogThread(final Handler.Callback callback) {
        if (this.mMsgThread == null) {
            PthreadThread pthreadThread = new PthreadThread() { // from class: com.ss.mediakit.medialoader.AVMDLDataLoader.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    com_ss_mediakit_medialoader_AVMDLDataLoader$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_mediakit_medialoader_AVMDLDataLoader$1__run$___twin___() {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    AVMDLDataLoader.this.mLogHandler = new Handler(callback);
                    Looper.loop();
                }

                public static void com_ss_mediakit_medialoader_AVMDLDataLoader$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_mediakit_medialoader_AVMDLDataLoader$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("AVMDLDataLoader$1");
                }
            };
            this.mMsgThread = pthreadThread;
            pthreadThread.setName("mdl_log_handler");
            this.mMsgThread.start();
        }
    }

    public static String queryComponentEncode(String str) {
        if (isSupportQueryEncode && !TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("before encode, src: ");
            LIZ.append(str);
            AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ));
            try {
                return _encodeUrl(str, 4);
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("query ComponentEncode:err ");
                LIZ2.append(e.getMessage());
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("query ComponentEncode:stacktrace ");
                LIZ3.append(e.getStackTrace());
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ3));
            } catch (UnsatisfiedLinkError e2) {
                isSupportQueryEncode = false;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("query ComponentEncode:err ");
                LIZ4.append(e2.getMessage());
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ4));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("query ComponentEncode:stacktrace ");
                LIZ5.append(e2.getStackTrace());
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ5));
            }
        }
        return null;
    }

    private void setConfigureInternal(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        if (this.mHandle == 0 || aVMDLDataLoaderConfigure == null) {
            return;
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mCacheDir)) {
            String createFilePathBaseDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "loaderFactory");
            if (!TextUtils.isEmpty(createFilePathBaseDir)) {
                _setStringValue(this.mHandle, 9, createFilePathBaseDir);
            }
            if (TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
                aVMDLDataLoaderConfigure.mNetCacheDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "netCache");
            }
            _setStringValue(this.mHandle, 0, aVMDLDataLoaderConfigure.mCacheDir);
        }
        if (!TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
            _setStringValue(this.mHandle, 5510, aVMDLDataLoaderConfigure.mNetCacheDir);
            String createFilePathBaseDir2 = createFilePathBaseDir(aVMDLDataLoaderConfigure.mNetCacheDir, "ttquiche");
            aVMDLDataLoaderConfigure.mTTquicheCacheDir = createFilePathBaseDir2;
            _setStringValue(this.mHandle, 6513, createFilePathBaseDir2);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mAppInfo)) {
            _setStringValue(this.mHandle, 10, aVMDLDataLoaderConfigure.mAppInfo);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDownloadDir)) {
            _setStringValue(this.mHandle, 7300, aVMDLDataLoaderConfigure.mDownloadDir);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mMdlExtensionOptsStr)) {
            _setStringValue(this.mHandle, 7500, aVMDLDataLoaderConfigure.mMdlExtensionOptsStr);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mMdlTTQuicHeOptsStr)) {
            _setStringValue(this.mHandle, 7504, aVMDLDataLoaderConfigure.mMdlTTQuicHeOptsStr);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mTemporaryOptStr)) {
            _setStringValue(this.mHandle, 7502, aVMDLDataLoaderConfigure.mTemporaryOptStr);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mN80OptsStr)) {
            _setStringValue(this.mHandle, 7503, aVMDLDataLoaderConfigure.mN80OptsStr);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mSpeedEngineSetting)) {
            _setStringValue(this.mHandle, 8226, aVMDLDataLoaderConfigure.mSpeedEngineSetting);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mPrecisePreloadConfigStr)) {
            _setStringValue(this.mHandle, 7434, aVMDLDataLoaderConfigure.mPrecisePreloadConfigStr);
        }
        _setIntValue(this.mHandle, 8001, aVMDLDataLoaderConfigure.mLiveP2pAllow);
        _setIntValue(this.mHandle, LiveCenterDelayLoadSetting.DEFAULT, aVMDLDataLoaderConfigure.mLiveLoaderType);
        _setIntValue(this.mHandle, 8005, aVMDLDataLoaderConfigure.mLiveWatchDurationThreshold);
        _setIntValue(this.mHandle, 8006, aVMDLDataLoaderConfigure.mLiveCacheThresholdHttpToP2p);
        _setIntValue(this.mHandle, 8007, aVMDLDataLoaderConfigure.mLiveCacheThresholdP2pToHttp);
        _setIntValue(this.mHandle, 8008, aVMDLDataLoaderConfigure.mLiveMaxTrySwitchP2pTimes);
        _setIntValue(this.mHandle, 8009, aVMDLDataLoaderConfigure.mLiveWaitP2pReadyThreshold);
        _setIntValue(this.mHandle, 8010, aVMDLDataLoaderConfigure.mLiveMobileUploadAllow);
        _setIntValue(this.mHandle, 8011, aVMDLDataLoaderConfigure.mLiveMobileDownloadAllow);
        _setIntValue(this.mHandle, 8012, aVMDLDataLoaderConfigure.mLiveRecvDataTimeout);
        _setStringValue(this.mHandle, 8021, aVMDLDataLoaderConfigure.mLiveContainerString);
        _setIntValue(this.mHandle, 1, aVMDLDataLoaderConfigure.mMaxCacheSize);
        _setIntValue(this.mHandle, 2, aVMDLDataLoaderConfigure.mRWTimeOut);
        _setIntValue(this.mHandle, 3, aVMDLDataLoaderConfigure.mOpenTimeOut);
        _setIntValue(this.mHandle, 5, aVMDLDataLoaderConfigure.mTryCount);
        _setIntValue(this.mHandle, 7, aVMDLDataLoaderConfigure.mMaxCacheSize);
        _setIntValue(this.mHandle, 8, aVMDLDataLoaderConfigure.mLoaderFactoryMaxMemorySize);
        int i = aVMDLDataLoaderConfigure.mEnablePcdnAuto;
        if (i == 1) {
            _setIntValue(this.mHandle, 12, i);
        } else {
            _setIntValue(this.mHandle, 6, aVMDLDataLoaderConfigure.mLoaderType);
        }
        _setIntValue(this.mHandle, 102, aVMDLDataLoaderConfigure.mPreloadParallelNum);
        _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
        int i2 = aVMDLDataLoaderConfigure.mMaxCacheAge;
        if (i2 > 0) {
            _setIntValue(this.mHandle, 104, i2);
        }
        _setIntValue(this.mHandle, 111, aVMDLDataLoaderConfigure.mEnableMaxCacheAgeForAllDir);
        _setIntValue(this.mHandle, 1030, aVMDLDataLoaderConfigure.mPreloadStrategy);
        _setIntValue(this.mHandle, 1040, aVMDLDataLoaderConfigure.mPreloadWaitListType);
        _setIntValue(this.mHandle, 105, aVMDLDataLoaderConfigure.mEnablePreloadReUse);
        _setIntValue(this.mHandle, 700, aVMDLDataLoaderConfigure.mEnableExternDNS);
        _setIntValue(this.mHandle, 701, aVMDLDataLoaderConfigure.mEnableSocketReuse);
        _setIntValue(this.mHandle, 703, aVMDLDataLoaderConfigure.mControlCDNRangeType);
        _setIntValue(this.mHandle, 702, aVMDLDataLoaderConfigure.mSocketIdleTimeOut);
        _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
        _setIntValue(this.mHandle, 1502, aVMDLDataLoaderConfigure.mTestSpeedTypeVersion);
        _setIntValue(this.mHandle, 1504, aVMDLDataLoaderConfigure.mCheckSumLevel);
        _setIntValue(this.mHandle, 1505, aVMDLDataLoaderConfigure.mEncryptVersion);
        _setIntValue(this.mHandle, 1507, aVMDLDataLoaderConfigure.mSpeedCoefficientValue);
        _setIntValue(this.mHandle, 900, aVMDLDataLoaderConfigure.mMaxIpCountEachDomain);
        _setIntValue(this.mHandle, 901, aVMDLDataLoaderConfigure.mEnableIpBucket);
        _setIntValue(this.mHandle, 902, aVMDLDataLoaderConfigure.mErrorStateTrustTime);
        _setIntValue(this.mHandle, 2508, aVMDLDataLoaderConfigure.mEnablePreconnect);
        _setIntValue(this.mHandle, 2509, aVMDLDataLoaderConfigure.mPreconnectNum);
        _setIntValue(this.mHandle, 2510, aVMDLDataLoaderConfigure.mEnableLoaderPreempt);
        _setIntValue(this.mHandle, 2511, aVMDLDataLoaderConfigure.mNextDownloadThreshold);
        _setIntValue(this.mHandle, 7216, aVMDLDataLoaderConfigure.mOnlyUseCdn);
        _setIntValue(this.mHandle, 3511, aVMDLDataLoaderConfigure.mAccessCheckLevel);
        _setIntValue(this.mHandle, 5511, aVMDLDataLoaderConfigure.mEnableSessionReuse);
        _setIntValue(this.mHandle, 5512, aVMDLDataLoaderConfigure.mMaxTlsVersion);
        _setIntValue(this.mHandle, 6512, aVMDLDataLoaderConfigure.mCheckPreloadLevel);
        _setIntValue(this.mHandle, 8217, aVMDLDataLoaderConfigure.mXYLibValue);
        _setIntValue(this.mHandle, 7340, aVMDLDataLoaderConfigure.mEnableP2PPreDown);
        _setIntValue(this.mHandle, 7341, aVMDLDataLoaderConfigure.mEnablePlayLog);
        _setIntValue(this.mHandle, 7342, aVMDLDataLoaderConfigure.mEnableNetScheduler);
        _setIntValue(this.mHandle, 7358, aVMDLDataLoaderConfigure.mEnableCacheReqRange);
        _setIntValue(this.mHandle, 7343, aVMDLDataLoaderConfigure.mNetSchedulerBlockAllNetErr);
        _setIntValue(this.mHandle, 7344, aVMDLDataLoaderConfigure.mNetSchedulerBlockErrCount);
        _setIntValue(this.mHandle, 7345, aVMDLDataLoaderConfigure.mNetSChedulerBlockDurationMs);
        _setIntValue(this.mHandle, 7346, aVMDLDataLoaderConfigure.mFirstRangeLeftThreshold);
        _setIntValue(this.mHandle, 7394, aVMDLDataLoaderConfigure.mNetSchedulerBlockHostIpErrCount);
        _setIntValue(this.mHandle, 5513, aVMDLDataLoaderConfigure.mMaxFileMemCacheSize);
        _setIntValue(this.mHandle, 5515, aVMDLDataLoaderConfigure.mMaxFileMemCacheNum);
        _setIntValue(this.mHandle, 110, aVMDLDataLoaderConfigure.mWriteFileNotifyIntervalMS);
        _setIntValue(this.mHandle, 7359, aVMDLDataLoaderConfigure.mP2PPreDownPeerCount);
        _setIntValue(this.mHandle, 7372, aVMDLDataLoaderConfigure.mP2PFirstRangeLoaderType);
        int i3 = aVMDLDataLoaderConfigure.mSocketSendBufferKB;
        if (i3 > 0) {
            _setIntValue(this.mHandle, 7220, i3);
        }
        int i4 = aVMDLDataLoaderConfigure.mRingBufferSizeKB;
        if (i4 > 0) {
            _setIntValue(this.mHandle, 7221, i4);
        }
        _setIntValue(this.mHandle, 7222, aVMDLDataLoaderConfigure.mEnableFileCacheV2);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpABTestId)) {
            _setStringValue(this.mHandle, 7223, aVMDLDataLoaderConfigure.mVdpABTestId);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpGroupId)) {
            _setStringValue(this.mHandle, 7224, aVMDLDataLoaderConfigure.mVdpGroupId);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mNetSchedulerConfigStr)) {
            _setStringValue(this.mHandle, 7403, aVMDLDataLoaderConfigure.mNetSchedulerConfigStr);
        }
        _setIntValue(this.mHandle, 7225, aVMDLDataLoaderConfigure.mAlogEnable);
        _setIntValue(this.mHandle, 7226, aVMDLDataLoaderConfigure.mEnableSyncDnsForPcdn);
        _setIntValue(this.mHandle, 7228, aVMDLDataLoaderConfigure.mEnableFileRingBuffer);
        _setIntValue(this.mHandle, 7332, aVMDLDataLoaderConfigure.mEnableLazyBufferpool);
        _setIntValue(this.mHandle, 7334, aVMDLDataLoaderConfigure.mEnableNewBufferpool);
        _setIntValue(this.mHandle, 7335, aVMDLDataLoaderConfigure.mNewBufferPoolBlockSize);
        _setIntValue(this.mHandle, 7336, aVMDLDataLoaderConfigure.mNewBufferPoolResidentSize);
        _setIntValue(this.mHandle, 7337, aVMDLDataLoaderConfigure.mNewBufferPoolGrowBlockCount);
        _setIntValue(this.mHandle, 7229, aVMDLDataLoaderConfigure.mEnableUseFileExtendLoaderBuffer);
        _setIntValue(this.mHandle, 7330, aVMDLDataLoaderConfigure.mMaxIPV6Num);
        _setIntValue(this.mHandle, 7331, aVMDLDataLoaderConfigure.mMaxIPV4Num);
        _setIntValue(this.mHandle, 1510, aVMDLDataLoaderConfigure.mForbidByPassCookie);
        _setIntValue(this.mHandle, 7333, aVMDLDataLoaderConfigure.mSessionTimeout);
        _setIntValue(this.mHandle, 7339, aVMDLDataLoaderConfigure.mEnablePlayInfoCache);
        _setIntValue(this.mHandle, 7347, aVMDLDataLoaderConfigure.mEnableDownloaderLog);
        _setIntValue(this.mHandle, 7348, aVMDLDataLoaderConfigure.mEnableTTNetLoader);
        _setIntValue(this.mHandle, 7349, aVMDLDataLoaderConfigure.mTTNetLoaderCronetBufSizeKB);
        _setIntValue(this.mHandle, 7357, aVMDLDataLoaderConfigure.mIsAllowTryTheLastUrl);
        _setIntValue(this.mHandle, 7368, aVMDLDataLoaderConfigure.mSpeedSampleInterval);
        _setIntValue(this.mHandle, 7400, aVMDLDataLoaderConfigure.mUseNewSpeedTestForSingle);
        _setIntValue(this.mHandle, 7352, aVMDLDataLoaderConfigure.mEnableTTQuicHeLoader);
        _setIntValue(this.mHandle, 7353, aVMDLDataLoaderConfigure.mEnableTTQuicHeLoaderCheckWithNetworkType);
        _setIntValue(this.mHandle, 7391, aVMDLDataLoaderConfigure.mEnableIOManager);
        _setIntValue(this.mHandle, 7369, aVMDLDataLoaderConfigure.mEnableLoaderSeek);
        _setIntValue(this.mHandle, 7370, aVMDLDataLoaderConfigure.mGlobalSpeedSampleInterval);
        _setIntValue(this.mHandle, 7362, aVMDLDataLoaderConfigure.mEnableDynamicTimeout);
        _setIntValue(this.mHandle, 7360, aVMDLDataLoaderConfigure.mSocketInitialTimeout);
        _setIntValue(this.mHandle, 7361, aVMDLDataLoaderConfigure.mMaxSocketReuseCount);
        _setIntValue(this.mHandle, 7371, aVMDLDataLoaderConfigure.mEnableReportTaskLog);
        _setInt64Value(this.mHandle, 8218, aVMDLDataLoaderConfigure.mP2PStragetyLevel);
        _setInt64Value(this.mHandle, 7363, aVMDLDataLoaderConfigure.mConnectPoolStragetyValue);
        _setIntValue(this.mHandle, 7364, aVMDLDataLoaderConfigure.mMaxAliveHostNum);
        _setIntValue(this.mHandle, 7392, aVMDLDataLoaderConfigure.mFileExtendSizeKB);
        _setIntValue(this.mHandle, 7393, aVMDLDataLoaderConfigure.mMinAllowSpeed);
        _setIntValue(this.mHandle, 7395, aVMDLDataLoaderConfigure.mEnableOwnVDPPreloadNotify);
        _setIntValue(this.mHandle, 8219, aVMDLDataLoaderConfigure.mEnableEarlyData);
        _setIntValue(this.mHandle, 8220, aVMDLDataLoaderConfigure.mEnableSpeedPredict);
        _setIntValue(this.mHandle, 8224, aVMDLDataLoaderConfigure.mEnableSpeedEngine);
        _setIntValue(this.mHandle, 8225, aVMDLDataLoaderConfigure.mEnableSpeedReport);
        _setIntValue(this.mHandle, 7404, aVMDLDataLoaderConfigure.mEnableUseOriginalUrl);
        _setIntValue(this.mHandle, 7405, aVMDLDataLoaderConfigure.mEnableLoaderLogExtractUrls);
        _setIntValue(this.mHandle, 7406, aVMDLDataLoaderConfigure.mMaxLoaderLogNum);
        _setIntValue(this.mHandle, 7407, aVMDLDataLoaderConfigure.mCheckContentTypeMethod);
        _setIntValue(this.mHandle, 7412, aVMDLDataLoaderConfigure.mThreadStackSizeLevel);
        _setIntValue(this.mHandle, 7413, aVMDLDataLoaderConfigure.mEnableThreadPoolCheckIdle);
        _setIntValue(this.mHandle, 7414, aVMDLDataLoaderConfigure.mThreadPoolTTLSecond);
        _setIntValue(this.mHandle, 7415, aVMDLDataLoaderConfigure.mThreadPoolMinCount);
        _setIntValue(this.mHandle, 7416, aVMDLDataLoaderConfigure.mNonBlockRangeMode);
        int i5 = aVMDLDataLoaderConfigure.mNonBlockRangeMaxSizeKB;
        if (i5 > 0) {
            _setIntValue(this.mHandle, 7417, i5);
        }
        _setIntValue(this.mHandle, 7418, aVMDLDataLoaderConfigure.mNetUnreachableStopRetry);
        _setIntValue(this.mHandle, 7419, aVMDLDataLoaderConfigure.mEnableWaitNetReachable);
        _setInt64Value(this.mHandle, 7397, aVMDLDataLoaderConfigure.mMonitorMinAllowLoadSize);
        _setInt64Value(this.mHandle, 7396, aVMDLDataLoaderConfigure.mMonitorTimeInternal);
        _setStringValue(this.mHandle, 7398, aVMDLDataLoaderConfigure.mSocketTraingCenterConfigStr);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mEnginePortraitStr)) {
            _setStringValue(this.mHandle, 7445, aVMDLDataLoaderConfigure.mEnginePortraitStr);
        }
        _setStringValue(this.mHandle, 7399, aVMDLDataLoaderConfigure.mCacheDirListsStr);
        _setStringValue(this.mHandle, 8221, aVMDLDataLoaderConfigure.mP2PConfigStr);
        _setIntValue(this.mHandle, 7401, aVMDLDataLoaderConfigure.mSocketRecvBufferSize);
        _setIntValue(this.mHandle, 7350, aVMDLDataLoaderConfigure.mEnableByteMediaNetLoader);
        _setIntValue(this.mHandle, 7351, aVMDLDataLoaderConfigure.mByteMediaNetLoaderCronetBufSizeKB);
        _setIntValue(this.mHandle, 8215, aVMDLDataLoaderConfigure.mEnableCellularUp);
        _setIntValue(this.mHandle, 7408, aVMDLDataLoaderConfigure.mCloseThreadPool);
        _setIntValue(this.mHandle, 8301, aVMDLDataLoaderConfigure.mMaxIpNum);
        _setIntValue(this.mHandle, 7427, aVMDLDataLoaderConfigure.mIgnoreTextSpeedTest);
        _setIntValue(this.mHandle, 7428, aVMDLDataLoaderConfigure.mEnableOptimizeRange);
        _setIntValue(this.mHandle, 7430, aVMDLDataLoaderConfigure.mCheckCacheDir);
        _setIntValue(this.mHandle, 7431, aVMDLDataLoaderConfigure.mEnableUseGroupId);
        _setIntValue(this.mHandle, 7438, aVMDLDataLoaderConfigure.mEnableMissReason);
        _setIntValue(this.mHandle, 7439, aVMDLDataLoaderConfigure.mPreloadInfoRecordMaxCnt);
        _setIntValue(this.mHandle, 7440, aVMDLDataLoaderConfigure.mEnableTraceIdPreloadLog);
        int i6 = aVMDLDataLoaderConfigure.mCloseLocalServer;
        if (i6 > 0) {
            _setIntValue(this.mHandle, 7441, i6);
        }
        int i7 = aVMDLDataLoaderConfigure.mGetCookieTokenLevel;
        if (i7 > 0) {
            _setIntValue(this.mHandle, 8303, i7);
        }
        _setIntValue(this.mHandle, 7435, aVMDLDataLoaderConfigure.mDisableRecentCache);
        _setIntValue(this.mHandle, 7436, aVMDLDataLoaderConfigure.mUpdateCacheFileInternal);
        _setIntValue(this.mHandle, 12001, aVMDLDataLoaderConfigure.mHlsTsFileKeyGenerateType);
        _setStringValue(this.mHandle, 7444, aVMDLDataLoaderConfigure.mProtectCacheDirsStr);
        int i8 = aVMDLDataLoaderConfigure.mEnableEventInfo;
        if (i8 > 0) {
            _setIntValue(this.mHandle, 9999, i8);
        }
        int i9 = aVMDLDataLoaderConfigure.mDownLogMaxSize;
        if (i9 > 0) {
            _setIntValue(this.mHandle, 7429, i9);
        }
        int i10 = aVMDLDataLoaderConfigure.mEnableStorageModule;
        if (i10 > 0) {
            _setIntValue(this.mHandle, 10000, i10);
            int i11 = aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBNM;
            if (i11 > 0) {
                _setIntValue(this.mHandle, 10001, i11);
            }
            int i12 = aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBLS;
            if (i12 > 0) {
                _setIntValue(this.mHandle, 10002, i12);
            }
            int i13 = aVMDLDataLoaderConfigure.mStoRingBufferSizeKB;
            if (i13 > 0) {
                _setIntValue(this.mHandle, 10003, i13);
            }
            int i14 = aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh1;
            if (i14 > 0) {
                _setIntValue(this.mHandle, 10004, i14);
            }
            int i15 = aVMDLDataLoaderConfigure.mStoMaxIdleTimeSec;
            if (i15 > 0) {
                _setIntValue(this.mHandle, 10006, i15);
            }
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mStoStrategyConfig)) {
            _setStringValue(this.mHandle, 10007, aVMDLDataLoaderConfigure.mStoStrategyConfig);
        }
        int i16 = aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh2;
        if (i16 > 0) {
            _setIntValue(this.mHandle, 10005, i16);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mP2PCostTag)) {
            _setStringValue(this.mHandle, 7423, aVMDLDataLoaderConfigure.mP2PCostTag);
        }
        _setIntValue(this.mHandle, 9400, aVMDLDataLoaderConfigure.mIgnorePlayInfo);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mSettingsDomain)) {
            _setStringValue(this.mHandle, 9401, aVMDLDataLoaderConfigure.mSettingsDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDmDomain)) {
            _setStringValue(this.mHandle, 9402, aVMDLDataLoaderConfigure.mDmDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mForesightDomain)) {
            _setStringValue(this.mHandle, 9403, aVMDLDataLoaderConfigure.mForesightDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDomains)) {
            _setStringValue(this.mHandle, 9404, aVMDLDataLoaderConfigure.mDomains);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyDomain)) {
            _setStringValue(this.mHandle, 9405, aVMDLDataLoaderConfigure.mKeyDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyToken)) {
            _setStringValue(this.mHandle, 9406, aVMDLDataLoaderConfigure.mKeyToken);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr)) {
            _setStringValue(this.mHandle, 7501, aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mCustomUA)) {
            _setStringValue(this.mHandle, 8222, aVMDLDataLoaderConfigure.mCustomUA);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mFileRingBufferOptStr)) {
            _setStringValue(this.mHandle, 8302, aVMDLDataLoaderConfigure.mFileRingBufferOptStr);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mFileKeyRule)) {
            _setStringValue(this.mHandle, 12000, aVMDLDataLoaderConfigure.mFileKeyRule);
        }
        _setIntValue(this.mHandle, 9300, aVMDLDataLoaderConfigure.mEnableOkHttpLoader);
        _setIntValue(this.mHandle, 11000, aVMDLDataLoaderConfigure.mEnableP2pUpload);
        _setIntValue(this.mHandle, 11002, aVMDLDataLoaderConfigure.mDevDiskSizeMB);
        _setIntValue(this.mHandle, 11004, aVMDLDataLoaderConfigure.mDevMemorySizeMB);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpExtGlobalInfo)) {
            _setStringValue(this.mHandle, 11001, aVMDLDataLoaderConfigure.mVdpExtGlobalInfo);
        }
        _setIntValue(this.mHandle, 7411, aVMDLDataLoaderConfigure.mEnableMultiDownloadPath);
        _setIntValue(this.mHandle, 7420, aVMDLDataLoaderConfigure.mEnableFileMutexOptimize);
        _setIntValue(this.mHandle, 7421, aVMDLDataLoaderConfigure.mSkipCDNBeforeExpiredSec);
        _setIntValue(this.mHandle, 7422, aVMDLDataLoaderConfigure.mNetUnreachableTimeout);
        int i17 = aVMDLDataLoaderConfigure.mDeviceScoreEx;
        if (i17 > 0) {
            _setIntValue(this.mHandle, 7426, i17);
        }
        int i18 = aVMDLDataLoaderConfigure.mSessionCacheInterval;
        if (i18 > 0) {
            _setIntValue(this.mHandle, 7442, i18);
        }
        int i19 = aVMDLDataLoaderConfigure.mFileManagerInterval;
        if (i19 > 0) {
            _setIntValue(this.mHandle, 7443, i19);
        }
        AVMDLDNSParser.setIntValue(0, this.mConfigure.mDNSMainType);
        AVMDLDNSParser.setIntValue(1, this.mConfigure.mDNSBackType);
        AVMDLDNSParser.setIntValue(2, this.mConfigure.mDefaultExpiredTime);
        AVMDLDNSParser.setIntValue(3, this.mConfigure.mMainToBackUpDelayedTime);
    }

    public static void setOkhttpClient(C64600PWy c64600PWy) {
        AVMDLHttpExcutor.setOkHttpClient(c64600PWy);
    }

    public int asyncCopyOperation(AVMDLCopyOperation aVMDLCopyOperation) {
        Handler handler;
        if (this.mState != 1 || (handler = this.mLogHandler) == null) {
            return -1;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = 23;
        obtainMessage.obj = aVMDLCopyOperation;
        obtainMessage.sendToTarget();
        return 0;
    }

    public void cancel(String str) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cancel(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void cleanCacheDir(long j) {
        if (this.mState != 1) {
            return;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _cleanCacheDir(j2, j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void doParseHosts(String[] strArr) {
        AVMDLDNSParser.getInstance().doParseHosts(strArr);
    }

    public void downloadResource(String str) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _downloadResource(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void forceRemoveFileCache(String str) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _forceRemoveCacheFile(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public String getAuth(String str) {
        String str2 = null;
        if (this.mState != 1 || !this.isSupportGetAuth) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                str2 = _getAuth(this.mHandle, str);
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
                this.isSupportGetAuth = false;
            }
            return str2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public String getCDNLog(String str) {
        String str2 = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                str2 = _getCDNLog(this.mHandle, str);
            } catch (UnsatisfiedLinkError e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("not support get cdnlog,");
                LIZ.append(e.toString());
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ));
            }
            return str2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public AVMDLFileInfo getCacheInfo(String str) {
        AVMDLFileInfo aVMDLFileInfo = null;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    String _getStringValueByStr = _getStringValueByStr(j, str, 101);
                    if (TextUtils.isEmpty(_getStringValueByStr)) {
                        return null;
                    }
                    String[] split = _getStringValueByStr.split(",");
                    if (split.length >= 3) {
                        AVMDLFileInfo aVMDLFileInfo2 = new AVMDLFileInfo();
                        try {
                            aVMDLFileInfo2.mFilePath = split[2];
                            if (!TextUtils.isEmpty(split[0])) {
                                aVMDLFileInfo2.mCacheSize = Long.valueOf(split[0]).longValue();
                            }
                            if (!TextUtils.isEmpty(split[1])) {
                                aVMDLFileInfo2.mContentLenght = Long.valueOf(split[1]).longValue();
                            }
                            aVMDLFileInfo = aVMDLFileInfo2;
                        } catch (UnsatisfiedLinkError e) {
                            e = e;
                            aVMDLFileInfo = aVMDLFileInfo2;
                            e.printStackTrace();
                            return aVMDLFileInfo;
                        }
                    }
                }
            } finally {
                this.mReadLock.unlock();
            }
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
        }
        return aVMDLFileInfo;
    }

    public long getCacheSize(String str) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStr(j2, str, 103);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public long getDownloadCount(String str) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStr(j2, str, 9217);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public long getLongValue(int i) {
        int i2;
        long j = -1;
        if (i == 7218 || i == 7390 || i == 9407 || i == 7402 || i == 7433) {
            long j2 = this.mHandle;
            if (j2 == 0) {
                return -1L;
            }
            return _getLongValue(j2, i);
        }
        if (this.mState != 1) {
            AVMDLLog.d("ttmdljava", C00F.LIZJ("getLongValue key: ", i, " result: ", -1L));
            return -1L;
        }
        if (this.mConfigure == null) {
            AVMDLLog.d("ttmdljava", C00F.LIZJ("getLongValue key: ", i, " result: ", -998L));
            return -998L;
        }
        this.mReadLock.lock();
        try {
            try {
                switch (i) {
                    case 8100:
                        i2 = this.mConfigure.mLiveLoaderEnable;
                        j = i2;
                        break;
                    case 8101:
                        i2 = this.mConfigure.mLiveP2pAllow;
                        j = i2;
                        break;
                    case 8102:
                        i2 = this.mConfigure.mLiveEnableMdlProto;
                        j = i2;
                        break;
                    case 8103:
                        i2 = this.mConfigure.mLiveLoaderType;
                        j = i2;
                        break;
                    default:
                        long j3 = this.mHandle;
                        if (j3 != 0) {
                            j = _getLongValue(j3, i);
                            break;
                        }
                        break;
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            AVMDLLog.d("ttmdljava", "getLongValue key: " + i + " result: " + j);
            return j;
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    public String getStringCacheInfo(String str) {
        String str2 = null;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str2 = _getStringValueByStr(j, str, 101);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return str2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public String getStringValue(int i) {
        String str = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str = _getStringValue(j, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return str;
        } finally {
            this.mReadLock.unlock();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 23) {
            AVMDLCopyOperation aVMDLCopyOperation = (AVMDLCopyOperation) message.obj;
            if (aVMDLCopyOperation != null) {
                copyInternal(aVMDLCopyOperation);
                return true;
            }
            return true;
        }
        if (i == 3 || i == 51) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) message.obj;
            if (this.mWaitingCopyItem.size() > 0 && aVMDLDataLoaderNotifyInfo != null) {
                handleCopyMsg(aVMDLDataLoaderNotifyInfo);
            }
        }
        if (i == 12 || i == 9) {
            return postMessage(this.mLiveListener, message);
        }
        if (i == 71 || i == 72 || i == 73 || i == 74) {
            return postMessage(this.mEventListener, message);
        }
        return postMessage(this.mVodListener, message);
    }

    public int onCellularAlwaysUp(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start on cellular netId: ");
        LIZ.append(j);
        AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ));
        this.mWriteLock.lock();
        int i = -1;
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                i = _onCellularAlwaysUp(j2, j, Build.VERSION.SDK_INT);
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        AVMDLLog.d("AVMDLDataLoader", "end on cellular netId: " + j + " ret: " + i);
        return i;
    }

    public void onEventInfo(Object obj) {
        String str;
        if (this.mState != 1 || this.mLogHandler == null) {
            return;
        }
        LoaderEventInfo loaderEventInfo = new LoaderEventInfo();
        loaderEventInfo.what = 74;
        try {
            HashMap hashMap = (HashMap) obj;
            if (hashMap.containsKey("what")) {
                loaderEventInfo.what = ((Integer) hashMap.get("what")).intValue();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[debugUI] eventMap contains What");
                LIZ.append(loaderEventInfo.what);
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ));
            }
            if (hashMap.containsKey("taskType")) {
                loaderEventInfo.taskType = ((Integer) hashMap.get("taskType")).intValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[debugUI] eventMap contains taskType");
                LIZ2.append(loaderEventInfo.taskType);
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ2));
            }
            if (hashMap.containsKey("off")) {
                loaderEventInfo.off = ((Long) hashMap.get("off")).longValue();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("[debugUI] eventMap contains off");
                LIZ3.append(loaderEventInfo.off);
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ3));
            }
            if (hashMap.containsKey("endOff")) {
                loaderEventInfo.endOff = ((Long) hashMap.get("endOff")).longValue();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("[debugUI] eventMap contains endOff");
                LIZ4.append(loaderEventInfo.endOff);
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ4));
            }
            if (hashMap.containsKey("fileHash")) {
                loaderEventInfo.fileHash = String.valueOf(hashMap.get("fileHash"));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("[debugUI] eventMap contains fileHash");
                LIZ5.append(loaderEventInfo.fileHash);
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ5));
            }
            if (hashMap.containsKey("bytesLoaded")) {
                loaderEventInfo.bytesLoaded = ((Long) hashMap.get("bytesLoaded")).longValue();
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("[debugUI] eventMap contains bytesLoaded");
                LIZ6.append(loaderEventInfo.bytesLoaded);
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ6));
            }
            if (!hashMap.containsKey("headers")) {
                str = "";
            } else {
                str = String.valueOf(hashMap.get("headers"));
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("[debugUI] eventMap contains headers");
                LIZ7.append(str);
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ7));
            }
            if (str != "") {
                String[] split = str.split("\r\n");
                for (String str2 : split) {
                    String[] split2 = str2.split(":");
                    loaderEventInfo.mHeaders.put(split2[0], split2[1]);
                }
            } else {
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("[debugUI] what");
                LIZ8.append(loaderEventInfo.what);
                AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ8));
                AVMDLLog.d("AVMDLDataLoader", "[debugUI]no headers");
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        Message obtainMessage = this.mLogHandler.obtainMessage();
        obtainMessage.what = loaderEventInfo.what;
        obtainMessage.obj = loaderEventInfo;
        obtainMessage.sendToTarget();
    }

    public long quickQueryCacheSize(String str) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStr(j2, str, 113);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void removeFileCache(String str) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _removeCacheFile(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void resetPreloadTraceId(String str) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _resetPreloadTraceId(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setConfigure(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                this.mConfigure = aVMDLDataLoaderConfigure;
                aVMDLDataLoaderConfigure.ParseJsonConfig();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setEventListener(LoaderListener loaderListener) {
        this.mWriteLock.lock();
        try {
            this.mEventListener = loaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setListener(AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        try {
            this.mVodListener = aVMDLDataLoaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setPluginLibraryLoader(IAVMDLLibraryLoader iAVMDLLibraryLoader) {
        this.mWriteLock.lock();
        try {
            mIsAsyncLoadPlugin = true;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setStartCompleteListener(AVMDLStartCompleteListener aVMDLStartCompleteListener) {
        this.mStartCompleteListener = aVMDLStartCompleteListener;
    }

    public synchronized void setTaskEventListener(AVMDLTaskEventListener aVMDLTaskEventListener) {
        this.mTaskListener = aVMDLTaskEventListener;
    }

    public void suspendDownload(String str) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _suspendedDownload(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public long tryQuickGetCacheSize(String str) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStr(j2, str, 106);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void tryToClearCachesByUsedTime(long j) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _clearCachesByUsedTime(j2, j);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
    }

    private String createFilePathBaseDir(String str, String str2) {
        String LJ;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str.charAt(str.length() - 1) == '/') {
            LJ = i0.LJFF(str, str2);
        } else {
            LJ = a1.LJ(str, "/", str2);
        }
        if (!TextUtils.isEmpty(LJ)) {
            File file = new File(LJ);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return LJ;
    }

    public static synchronized int init(boolean z, boolean z2) {
        synchronized (AVMDLDataLoader.class) {
            if (mIsLibraryLoaded) {
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!mIsLibraryLoaded) {
                C39045FUb.LIZ();
                VcnlibloadWrapper.tryLoadVcnlib();
                loadAVMDLBaseLibrary();
                try {
                    C16880lQ.LLJJJIL("avmdl");
                    mIsLibraryLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Can't load avmdl library: ");
                    LIZ.append(e);
                    mLoadFailMsg = X1D.LIZIZ(LIZ);
                } catch (Throwable th) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("other exception when loading avmdl library: ");
                    LIZ2.append(th);
                    mLoadFailMsg = X1D.LIZIZ(LIZ2);
                }
                VcnlibloadWrapper.tryLoadVcnverifylib();
                tryLoadTTNetLoaderPlugin();
                tryLoadByteMediaNetLoaderPlugin();
            }
            if (mIsLibraryLoaded) {
                return 0;
            }
            return -1;
        }
    }

    public static void initByteMediaNetEnv(Context context, ClassLoader classLoader) {
        synchronized (AVMDLDataLoader.class) {
            if (mIsByteMediaNetInit.booleanValue()) {
                return;
            }
            try {
                Method method = Class.forName("com.ss.avframework.transport.ContextUtils").getMethod("initApplicationContext", Context.class);
                method.setAccessible(true);
                method.invoke(null, context);
                Method method2 = Class.forName("com.ss.avframework.transport.JNIUtils").getMethod("setClassLoader", ClassLoader.class);
                method2.setAccessible(true);
                method2.invoke(null, classLoader);
                mIsByteMediaNetInit = Boolean.TRUE;
            } catch (Throwable unused) {
            }
        }
    }

    public static String makeTsFileKey(String str, String str2) {
        try {
            return _makeTsFileKey(str, str2);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("makeTsFileKey failed, other reason:  ");
            LIZ.append(e.getMessage());
            AVMDLLog.e("AVMDLDataLoader", X1D.LIZIZ(LIZ));
            return null;
        } catch (UnsatisfiedLinkError e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("makeTsFileKey failed, native not support: ");
            LIZ2.append(e2.getMessage());
            AVMDLLog.e("AVMDLDataLoader", X1D.LIZIZ(LIZ2));
            return null;
        }
    }

    private boolean postMessage(LoaderListener loaderListener, Message message) {
        Object obj;
        LoaderEventInfo loaderEventInfo;
        if (loaderListener != null && (obj = message.obj) != null && (loaderEventInfo = (LoaderEventInfo) obj) != null) {
            int i = message.what;
            if (i == 71) {
                loaderListener.onLoaderTaskStart(loaderEventInfo);
                AVMDLLog.d("ttmdljava", "receive eventLog KeyIsLoaderEventStart");
            } else if (i == 72) {
                loaderListener.onLoaderTaskCancel(loaderEventInfo);
                AVMDLLog.d("ttmdljava", "receive eventLog KeyIsLoaderEventCancel");
            } else if (i == 73) {
                loaderListener.onLoaderTaskCompleted(loaderEventInfo);
                AVMDLLog.d("ttmdljava", "receive eventLog KeyIsLoaderEventCompleted");
            } else {
                AVMDLLog.d("ttmdljava", "receive eventLog fail");
            }
        }
        return true;
    }

    public void addDataSource(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addDataSource: id: ");
        LIZ.append(i);
        LIZ.append(", queyr: ");
        LIZ.append(str);
        AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZ));
        this.mWriteLock.lock();
        try {
            _addDataSource(this.mHandle, i, str);
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
    }

    public void cleanSpecifiedCacheDir(String str, int i) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cleanSpecifiedCacheDir(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public long copyFile(String str, String str2) {
        long j = -1;
        if (this.mState != 1) {
            return -1L;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _copyFile64(j2, str, str2);
                }
            } catch (UnsatisfiedLinkError e) {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    try {
                        j = _copyFile(j3, str, str2);
                    } catch (UnsatisfiedLinkError e2) {
                        e2.printStackTrace();
                    }
                }
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public long getCacheSize(String str, String str2) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStrStr(j2, str, str2, 103);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public long getCacheSizeByKeyAndDirPath(String str, String str2) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStrStr(j2, str, str2, 114);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public long getInt64Value(int i, long j) {
        if (i == 8003 || i == 8004) {
            AVMDLDataLoaderListener aVMDLDataLoaderListener = this.mLiveListener;
            if (aVMDLDataLoaderListener != null) {
                return aVMDLDataLoaderListener.getInt64Value(i, j);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getInt64Value mLiveListener is nullptr, code: ");
            LIZ.append(i);
            AVMDLLog.e("ttmdljava", X1D.LIZIZ(LIZ));
        }
        AVMDLLog.d("ttmdljava", C00F.LIZJ("getInt64Value code: ", i, " defaultValue: ", j));
        return j;
    }

    public long getLongValueByStr(String str, int i) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStr(j2, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public long getMissReason(String str, String str2) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStrStr(j2, str, str2, 112);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public String getStringCacheInfo(String str, String str2) {
        String str3 = null;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str3 = _getStringValueByStrStr(j, str, str2, 101);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return str3;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public String getStringValueByStr(String str, int i) {
        String str2 = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str2 = _getStringValueByStr(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return str2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void makeFileAutoDeleteFlag(String str, int i) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _makeFileAutoDeleteFlag(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void preConnectByHost(String str, int i) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                _preConnectByHost(this.mHandle, str, i);
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void preloadResource(String str, int i) {
        if (this.mState != 1 || TextUtils.isEmpty(str) || i == 0) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _preloadResource(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void removeFileCacheByKeyAndPath(String str, String str2) {
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _removeCacheFileInDirPath(j, str, str2);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void removeOfflineFilePath(boolean z, String str) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _removeOfflineFilePath(j, z, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setBackUpIp(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        IPCache.getInstance().putBackUpIp(str, new AVMDLDNSInfo(11, str, str2, 0L, (String) null));
    }

    public void setIntValue(int i, int i2) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _setIntValue(j, i, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setListener(int i, AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        if (i == 107) {
            try {
                this.mLiveListener = aVMDLDataLoaderListener;
            } finally {
                this.mWriteLock.unlock();
            }
        }
    }

    public void setLongValue(int i, long j) {
        if (i == 7432) {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _setInt64Value(j2, i, j);
                return;
            }
            return;
        }
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    _setInt64Value(j3, i, j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setStringValue(int i, String str) {
        if (TextUtils.isEmpty(str) || this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _setStringValue(j, i, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public long tryToClearAndGetCachesByUsedTime(long j, boolean z) {
        long j2 = 0;
        int i = 1;
        if (this.mState != 1) {
            return 0L;
        }
        this.mWriteLock.lock();
        try {
            long j3 = this.mHandle;
            if (j3 != 0) {
                if (!z) {
                    i = 0;
                }
                j2 = _clearAndGetCachesByUsedTime(j3, j, i);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return j2;
    }

    private boolean postMessage(AVMDLDataLoaderListener aVMDLDataLoaderListener, Message message) {
        Object obj;
        AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo;
        if (message.what == 701) {
            AVMDLLog.d("ttmdljava", "receive hijack err: ");
            hijack();
            return true;
        }
        if (aVMDLDataLoaderListener != null && (obj = message.obj) != null && (aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) obj) != null) {
            aVMDLDataLoaderListener.onNotify(aVMDLDataLoaderNotifyInfo);
        }
        return true;
    }

    public static synchronized int init(boolean z, boolean z2, boolean z3) {
        synchronized (AVMDLDataLoader.class) {
            if (mIsLibraryLoaded) {
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!mIsLibraryLoaded) {
                C39045FUb.LIZ();
                VcnlibloadWrapper.tryLoadVcnlib();
                loadAVMDLBaseLibrary();
                if (z3) {
                    try {
                        C16880lQ.LLJJJIL("avmdlv2");
                        mIsLibraryLoaded = true;
                        mIsMdlv2PluginLoaded = true;
                        if (z2 && !mIsAsyncLoadPlugin) {
                            C16880lQ.LLJJJIL("avmdlp2pv2");
                        }
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                try {
                    C16880lQ.LLJJJIL("mdlttquicheloader");
                } catch (Throwable unused2) {
                }
                if (!mIsLibraryLoaded) {
                    try {
                        C16880lQ.LLJJJIL("avmdl");
                        mIsLibraryLoaded = true;
                    } catch (UnsatisfiedLinkError e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Can't load avmdl library: ");
                        LIZ.append(e);
                        mLoadFailMsg = X1D.LIZIZ(LIZ);
                    } catch (Throwable th) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("other exception when loading avmdl library: ");
                        LIZ2.append(th);
                        mLoadFailMsg = X1D.LIZIZ(LIZ2);
                    }
                    VcnlibloadWrapper.tryLoadVcnverifylib();
                    tryLoadTTNetLoaderPlugin();
                    tryLoadByteMediaNetLoaderPlugin();
                }
            }
            if (mIsLibraryLoaded) {
                return 0;
            }
            return -1;
        }
    }

    private double testFileIO(String str, int i, RandomAccessFile randomAccessFile) {
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        long currentTimeMillis = System.currentTimeMillis();
        randomAccessFile.seek(i);
        byte[] bArr = new byte[4096];
        int i2 = 0;
        do {
            Thread.sleep(5);
            randomAccessFile.write(bArr, 0, 1024);
            i2++;
        } while (i2 < 200);
        long currentTimeMillis2 = ((System.currentTimeMillis() - currentTimeMillis) - 1000) + 0;
        if (currentTimeMillis2 <= 0) {
            return -1.0d;
        }
        AVMDLLog.d("BENCHMARKIO", C16880lQ.LLLZI(Locale.US, "size:%d costtime:%d", new Object[]{819200, Long.valueOf(currentTimeMillis2)}));
        return 819200 / currentTimeMillis2;
    }

    public long copyFile(String str, String str2, boolean z) {
        int i;
        int i2;
        long j = -1;
        if (this.mState != 1) {
            return -1L;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    j = _copyFileWithForceFlag64(j2, str, str2, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    try {
                        j = _copyFileWithForceFlag(j3, str, str2, i);
                    } catch (UnsatisfiedLinkError e2) {
                        e2.printStackTrace();
                        if (!z) {
                            j = copyFile(str, str2);
                        }
                    }
                }
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public long getContinueCacheSize(String str, int i, long j) {
        long j2 = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    j2 = _getContinueCacheSize(j3, str, i, j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            return j2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public String getStringValueByStrkey(int i, long j, String str) {
        if (this.mState != 1) {
            return null;
        }
        if (i != 1503) {
            if (i != 1506 && i != 1509) {
                if (i != 3512) {
                    return null;
                }
                return getProxyUrl();
            }
            if (this.mVodListener == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return this.mVodListener.getStringValue(i, j, str);
        }
        if (this.mVodListener == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mVodListener.getCheckSumInfo(str);
    }

    public void onLogInfo(int i, int i2, String str) {
        onLogInfo(i, i2, -1, str);
    }

    public void onNotify(int i, long j, int i2) {
        if (this.mState != 1 || this.mHandler == null) {
            return;
        }
        AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
        aVMDLDataLoaderNotifyInfo.what = i;
        aVMDLDataLoaderNotifyInfo.parameter = j;
        aVMDLDataLoaderNotifyInfo.code = i2;
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.obj = aVMDLDataLoaderNotifyInfo;
        obtainMessage.what = i;
        obtainMessage.sendToTarget();
    }

    public void preloadResource(String str, int i, int i2) {
        if (this.mState != 1 || TextUtils.isEmpty(str) || i2 == 0) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _preloadResourceWithOffset(j, str, i, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setInt64ValueByStrKey(int i, String str, long j) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _setInt64ValueByStrKey(j2, i, str, j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public long copyFile(String str, String str2, String str3) {
        long j = -1;
        if (this.mState != 1) {
            return -1L;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _copyFileWithCustomDir64(j2, str, str2, str3);
                }
            } catch (UnsatisfiedLinkError e) {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    try {
                        j = _copyFileWithCustomDir(j3, str, str2, str3);
                    } catch (UnsatisfiedLinkError e2) {
                        e2.printStackTrace();
                    }
                }
                e.printStackTrace();
            }
            return j;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (r15 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ac, code lost:
    
        if (0 == 1) goto L96;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0083. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLogInfo(int r15, int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.onLogInfo(int, int, int, java.lang.String):void");
    }

    public void preloadGroupResource(String str, String str2, int i, int i2) {
        if (this.mState != 1 || TextUtils.isEmpty(str2) || i2 == 0) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _preloadGroupResource(j, str, str2, i, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public synchronized void onTaskEvent(int i, String str, int i2, int i3, String str2) {
        JSONObject jSONObject;
        if (this.mTaskListener == null) {
            return;
        }
        if (!AVMDLTaskEventID.taskTypeIsValid(i2)) {
            return;
        }
        if (!AVMDLTaskEventID.eventTypeIsValid(i3)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Exception unused) {
            }
            this.mTaskListener.onTaskEventNotify(i, str, i2, i3, jSONObject);
        }
        jSONObject = null;
        this.mTaskListener.onTaskEventNotify(i, str, i2, i3, jSONObject);
    }

    public void updateDNSInfo(String str, String str2, long j, String str3, int i) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                _updateDNSInfo(this.mHandle, str, str2, j, str3, i);
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public int writeDataToFile(String str, long j, long j2, int i, byte[] bArr) {
        int i2;
        if (this.mState != 1) {
            return -1;
        }
        StringBuilder LIZJ = C06490Nh.LIZJ("start write data to file filekey:", str, " off:", j2);
        LIZJ.append(" length:");
        LIZJ.append(i);
        AVMDLLog.d("AVMDLDataLoader", X1D.LIZIZ(LIZJ));
        this.mWriteLock.lock();
        try {
            i2 = _writeDataToFile(this.mHandle, str, j, j2, i, bArr);
            this.mWriteLock.unlock();
        } catch (Exception unused) {
            this.mWriteLock.unlock();
            i2 = -3;
        } catch (UnsatisfiedLinkError unused2) {
            this.mWriteLock.unlock();
            i2 = -2;
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        AVMDLLog.d("AVMDLDataLoader", "end write data to file filekey:" + str + " off:" + j2 + " length:" + i);
        return i2;
    }
}
