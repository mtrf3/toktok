package com.ss.videoarch.live.ttquic;

import X.C025908h;
import X.C16880lQ;
import X.F74;
import X.JBR;
import X.VE2;
import X.VE3;
import X.VE4;
import X.VE5;
import X.X1D;
import Y.IDCallbackS368S0100000_14;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class PreloadManager {
    public static boolean mInitialized;
    public Context mContext;
    public VE2 mCurrentTask;
    public int mEnableCancelAll;
    public Handler mEventHandler;
    public HandlerThread mEventThread;
    public final Object mListenerLock;
    public final HashMap<Integer, PreloadListener> mListeners;
    public int mMpdPreloadMinSec;
    public long mNativePtr;
    public int mOptCancelTask;
    public int mPlayCacheMaxAgeSec;
    public final Stack<Integer> mPlayerIds;
    public int mPreloadCacheMaxAgeSec;
    public final ThreadPoolExecutor mPreloadExecutor;
    public final Set<String> mPreloadList;
    public String mQuicScfgPath;
    public int mRequestOpenTimeout;
    public int mRequestReadTimeout;
    public final Object mTaskLock;
    public final LruCache<String, VE2> mTasks;

    private native int native_cancel(long j, String str);

    private native int native_destroy(long j);

    private native long native_init(TTEngineParam tTEngineParam, Handler handler);

    public int getActivePlayer() {
        try {
            if (this.mPlayerIds.isEmpty()) {
                return 0;
            }
            return this.mPlayerIds.peek().intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public native int native_preload(long j, TTRequestParam tTRequestParam);

    private void destroyEvent() {
        Handler handler = this.mEventHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mEventHandler = null;
        }
        HandlerThread handlerThread = this.mEventThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mEventThread = null;
        }
    }

    private int initContext() {
        try {
            Method method = Class.forName("com.ss.videoarch.live.ttquic.ContextUtils").getMethod("initApplicationContext", Context.class);
            method.setAccessible(true);
            method.invoke(null, C16880lQ.LLLLL(this.mContext));
            Method method2 = Class.forName("com.ss.videoarch.live.ttquic.JNIUtils").getMethod("setClassLoader", ClassLoader.class);
            method2.setAccessible(true);
            method2.invoke(null, this.mContext.getClassLoader());
            return 0;
        } catch (Throwable unused) {
            return -4002;
        }
    }

    private int initEvent() {
        try {
            HandlerThread handlerThread = new HandlerThread("tt_preload_event");
            this.mEventThread = handlerThread;
            handlerThread.start();
            this.mEventHandler = new Handler(this.mEventThread.getLooper(), new IDCallbackS368S0100000_14(this, 2));
            return 0;
        } catch (Exception unused) {
            return -4003;
        }
    }

    private int loadLibrary() {
        try {
            F74.LIZ("ttffmpeg");
            try {
                F74.LIZ("ffmpeg_dashdec");
                try {
                    F74.LIZ("ttmcmaf");
                    try {
                        F74.LIZ("vcbasekit");
                        try {
                            F74.LIZ("ttquic");
                            try {
                                F74.LIZ("ttpreload");
                                return 0;
                            } catch (Throwable unused) {
                                return -1004;
                            }
                        } catch (Throwable unused2) {
                            return -1001;
                        }
                    } catch (Throwable unused3) {
                        return -1006;
                    }
                } catch (Throwable unused4) {
                    return -1002;
                }
            } catch (Throwable unused5) {
                return -1005;
            }
        } catch (Throwable unused6) {
            return -1003;
        }
    }

    public int cancelAll() {
        if (this.mEnableCancelAll != 1 || this.mNativePtr == 0) {
            return -1;
        }
        String str = "";
        synchronized (this.mTaskLock) {
            VE2 ve2 = this.mCurrentTask;
            if (ve2 != null) {
                ve2.LJLJI.set(3);
                str = this.mCurrentTask.LJLIL;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            native_cancel(this.mNativePtr, str);
            return 0;
        }
        return 0;
    }

    public void destroy() {
        long j = this.mNativePtr;
        if (j != 0) {
            native_destroy(j);
            this.mNativePtr = 0L;
        }
        destroyEvent();
        synchronized (this.mListenerLock) {
            this.mListeners.clear();
        }
        mInitialized = false;
    }

    public int getCurrentTaskState() {
        int i;
        synchronized (this.mTaskLock) {
            VE2 ve2 = this.mCurrentTask;
            if (ve2 != null) {
                i = ve2.LJLJI.get();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public PreloadManager() {
        this.mPreloadCacheMaxAgeSec = 600;
        this.mPlayCacheMaxAgeSec = 600;
        this.mRequestOpenTimeout = 5000;
        this.mRequestReadTimeout = 5000;
        this.mEnableCancelAll = 1;
        this.mMpdPreloadMinSec = -1;
        this.mListenerLock = new Object();
        this.mListeners = new HashMap<>();
        this.mPreloadList = new HashSet();
        this.mTasks = new LruCache<>(64);
        this.mTaskLock = new Object();
        this.mCurrentTask = null;
        this.mPlayerIds = new Stack<>();
        this.mPreloadExecutor = new PThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new PriorityBlockingQueue(64, new VE4()), new VE3());
    }

    public static PreloadManager getInstance() {
        return VE5.LIZ;
    }

    public /* synthetic */ PreloadManager(IDCallbackS368S0100000_14 iDCallbackS368S0100000_14) {
        this();
    }

    public void attachPlayer(int i) {
        this.mPlayerIds.push(Integer.valueOf(i));
    }

    public String cacheKey(String str) {
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        buildUpon.clearQuery();
        return buildUpon.build().getPath();
    }

    public int cancelAll(int i) {
        VE2 ve2;
        if (this.mEnableCancelAll != 1 || this.mNativePtr == 0 || (ve2 = this.mCurrentTask) == null) {
            return -1;
        }
        ve2.LJLJI.set(3);
        native_cancel(this.mNativePtr, this.mCurrentTask.LJLIL);
        return 0;
    }

    public void detachPlayer(int i) {
        try {
            this.mPlayerIds.remove(Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public void recordResource(String str) {
        this.mPreloadList.add(str);
    }

    public void removeListener(int i) {
        synchronized (this.mListenerLock) {
            this.mListeners.remove(Integer.valueOf(i));
        }
    }

    public void updateTaskState(TTEvent tTEvent) {
        VE2 ve2;
        if (tTEvent.what == 0 || TextUtils.isEmpty(tTEvent.url) || (ve2 = this.mTasks.get(cacheKey(tTEvent.url))) == null) {
            return;
        }
        synchronized (this.mTaskLock) {
            this.mCurrentTask = null;
        }
        int i = tTEvent.what;
        if (1 == i) {
            ve2.LJLJI.set(4);
            ve2.LJLJJI = System.currentTimeMillis();
            ve2.LJLL.countDown();
        } else {
            if (2 != i) {
                return;
            }
            ve2.LJLJI.set(5);
            ve2.LJLJJLL = tTEvent.code;
            ve2.LJLL.countDown();
        }
    }

    private int parseEngineParam(String str, TTEngineParam tTEngineParam) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("cacheMaxSize")) {
                tTEngineParam.cacheMaxSize = jSONObject.optInt("cacheMaxSize");
            }
            if (jSONObject.has("PreloadCacheMaxAge")) {
                this.mPreloadCacheMaxAgeSec = jSONObject.optInt("PreloadCacheMaxAge");
            }
            if (jSONObject.has("PlayCacheMaxAge")) {
                this.mPlayCacheMaxAgeSec = jSONObject.optInt("PlayCacheMaxAge");
            }
            if (jSONObject.has("openTimeout")) {
                this.mRequestOpenTimeout = jSONObject.optInt("openTimeout");
            }
            if (jSONObject.has("readTimeout")) {
                this.mRequestReadTimeout = jSONObject.optInt("readTimeout");
            }
            if (jSONObject.has("EnableCancelAll")) {
                this.mEnableCancelAll = jSONObject.optInt("EnableCancelAll");
            }
            if (jSONObject.has("MpdPreloadMinSec")) {
                this.mMpdPreloadMinSec = jSONObject.optInt("MpdPreloadMinSec");
            }
            if (jSONObject.has("optCancelTask")) {
                this.mOptCancelTask = jSONObject.optInt("optCancelTask");
            }
            if (tTEngineParam.cacheMaxSize <= 0) {
                tTEngineParam.cacheMaxSize = 209715200;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LLIIJLIL(this.mContext).getAbsolutePath());
            String str2 = File.separator;
            tTEngineParam.cachePath = JBR.LJFF(LIZ, str2, "live_preload", LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            tTEngineParam.flvCachePath = C025908h.LIZIZ(LIZ2, tTEngineParam.cachePath, str2, "flv", LIZ2);
            File file = new File(tTEngineParam.cachePath);
            if (!file.exists() && !file.mkdirs()) {
                return -1;
            }
            File file2 = new File(tTEngineParam.flvCachePath);
            if (!file2.exists() && !file2.mkdirs()) {
                return -1;
            }
            if (this.mPreloadCacheMaxAgeSec <= 0) {
                this.mPreloadCacheMaxAgeSec = 600;
            }
            if (this.mPlayCacheMaxAgeSec <= 0) {
                this.mPlayCacheMaxAgeSec = 600;
            }
            if (this.mRequestOpenTimeout <= 0) {
                this.mRequestOpenTimeout = 5000;
            }
            if (this.mRequestReadTimeout <= 0) {
                this.mRequestReadTimeout = 5000;
                return 0;
            }
            return 0;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public void addListener(int i, Object obj) {
        synchronized (this.mListenerLock) {
            if (obj instanceof PreloadListener) {
                this.mListeners.put(Integer.valueOf(i), (PreloadListener) obj);
            }
        }
    }

    public int cancel(int i, String str) {
        VE2 ve2 = this.mTasks.get(cacheKey(str));
        if (ve2 == null) {
            return -3002;
        }
        if (ve2.LJLILLLLZI != i) {
            return -3003;
        }
        if (1 != ve2.LJLJI.get()) {
            return -3004;
        }
        ve2.LJLJI.set(3);
        native_cancel(this.mNativePtr, str);
        return 0;
    }

    public Bundle getPreloadInfo(String str, int i) {
        int i2;
        Bundle bundle = new Bundle();
        long j = 0;
        int i3 = -1;
        String str2 = "";
        if (i != 0 && 1 != i) {
            i2 = -2;
        } else {
            String cacheKey = cacheKey(str);
            VE2 ve2 = this.mTasks.get(cacheKey);
            if (ve2 == null) {
                if (this.mPreloadList.contains(cacheKey)) {
                    i2 = -3002;
                } else {
                    i2 = -3009;
                }
            } else if (4 == ve2.LJLJI.get() || 6 == ve2.LJLJI.get()) {
                if (ve2.LJLJJI > 0) {
                    j = System.currentTimeMillis() - ve2.LJLJJI;
                    if (j < this.mPlayCacheMaxAgeSec * 1000) {
                        int i4 = ve2.LJLJL;
                        if (i4 == -1) {
                            i2 = -3005;
                        } else {
                            i2 = 0;
                            if (i4 == 1) {
                                if (j >= ve2.LJLJLJ.cmafPreloadMPDExpMs) {
                                    i2 = -8002;
                                }
                            } else {
                                str2 = ve2.LJLJLLL.getString("resolution", "");
                                i2 = 0;
                            }
                            i3 = ve2.LJLJL;
                        }
                    } else {
                        i2 = -8000;
                    }
                } else {
                    i2 = -8001;
                }
            } else if (1 == ve2.LJLJI.get()) {
                i2 = -3001;
            } else if (5 == ve2.LJLJI.get()) {
                i2 = ve2.LJLJJLL;
            } else {
                i2 = -999;
            }
        }
        bundle.putInt("preload_result", i2);
        bundle.putLong("time_delta", j);
        bundle.putInt("preload_mode", i3);
        bundle.putString("preload_resolution", str2);
        return bundle;
    }

    public int init(Context context, String str) {
        if (mInitialized) {
            return 0;
        }
        this.mContext = C16880lQ.LLLLL(context);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(context).getAbsolutePath());
        LIZ.append("/pullstream.scfg");
        this.mQuicScfgPath = X1D.LIZIZ(LIZ);
        int loadLibrary = loadLibrary();
        if (loadLibrary != 0) {
            return loadLibrary;
        }
        TTEngineParam tTEngineParam = new TTEngineParam();
        int parseEngineParam = parseEngineParam(str, tTEngineParam);
        if (parseEngineParam != 0) {
            return parseEngineParam;
        }
        int initContext = initContext();
        if (initContext != 0) {
            return initContext;
        }
        int initEvent = initEvent();
        if (initEvent != 0) {
            return initEvent;
        }
        long native_init = native_init(tTEngineParam, this.mEventHandler);
        this.mNativePtr = native_init;
        if (native_init == 0) {
            return -4000;
        }
        mInitialized = true;
        return 0;
    }

    private int parseSdkParams(String str, String str2, TTRequestParam tTRequestParam) {
        try {
            tTRequestParam.url = str;
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("cmaf")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("cmaf"));
                if (jSONObject2.has("CmafEnableFastOpen")) {
                    tTRequestParam.cmafEnableFastOpen = jSONObject2.optInt("CmafEnableFastOpen");
                }
                if (jSONObject2.has("CmafSkipInitSection")) {
                    tTRequestParam.cmafSkipInitSection = jSONObject2.optInt("CmafSkipInitSection");
                }
                if (jSONObject2.has("CmafStartSegmentOffset")) {
                    tTRequestParam.cmafStartSegOffset = jSONObject2.optInt("CmafStartSegmentOffset");
                }
                if (jSONObject2.has("CmafPreloadNum")) {
                    tTRequestParam.cmafPreloadNum = jSONObject2.optInt("CmafPreloadNum");
                }
                if (jSONObject2.has("CmafPreloadParallel")) {
                    tTRequestParam.cmafPreloadParallel = jSONObject2.optInt("CmafPreloadParallel");
                }
                if (jSONObject2.has("CmafPreloadMPDUpdateMs")) {
                    tTRequestParam.cmafPreloadMPDUpdateMs = jSONObject2.optInt("CmafPreloadMPDUpdateMs");
                }
                if (jSONObject2.has("CmafPreloadMPDExpMs")) {
                    tTRequestParam.cmafPreloadMPDExpMs = jSONObject2.optInt("CmafPreloadMPDExpMs");
                }
            }
            if (jSONObject.has("httpx")) {
                String optString = jSONObject.optString("httpx");
                tTRequestParam.httpxParams = optString;
                JSONObject jSONObject3 = new JSONObject(optString);
                if (jSONObject3.has("HttpQuicVersion")) {
                    tTRequestParam.quicVersion = jSONObject3.optInt("HttpQuicVersion");
                }
                if (jSONObject3.has("HttpEnableCertVerify")) {
                    tTRequestParam.enableCertVerify = jSONObject3.optInt("HttpEnableCertVerify");
                }
            }
            if (jSONObject.has("LivePreloadConfig")) {
                JSONObject jSONObject4 = new JSONObject(jSONObject.optString("LivePreloadConfig"));
                if (jSONObject4.has("PreloadMode")) {
                    tTRequestParam.preloadMode = jSONObject4.optInt("PreloadMode", -1);
                }
            }
            if (jSONObject.has("quic")) {
                tTRequestParam.quicParams = jSONObject.optString("quic");
            }
            if (jSONObject.has("EnableSaveSCFG") && 1 == jSONObject.optInt("EnableSaveSCFG")) {
                tTRequestParam.quicSCFGAddr = this.mQuicScfgPath;
            }
            if (jSONObject.has("SuggestProtocol")) {
                String optString2 = jSONObject.optString("SuggestProtocol");
                tTRequestParam.protocol = optString2;
                if (TextUtils.equals("h2", optString2)) {
                    tTRequestParam.httpVersion = 2;
                    tTRequestParam.lowProtocol = 1;
                    tTRequestParam.cryptoProtocol = 2;
                } else if (TextUtils.equals("h2q", optString2)) {
                    tTRequestParam.httpVersion = 2;
                    tTRequestParam.lowProtocol = 2;
                    tTRequestParam.cryptoProtocol = 1;
                } else if (TextUtils.equals("tls", optString2)) {
                    tTRequestParam.httpVersion = 1;
                    tTRequestParam.lowProtocol = 1;
                    tTRequestParam.cryptoProtocol = 2;
                } else if (TextUtils.equals("tcp", optString2)) {
                    tTRequestParam.httpVersion = 1;
                    tTRequestParam.lowProtocol = 0;
                }
            }
            if (jSONObject.has("SuggestFormat")) {
                tTRequestParam.format = jSONObject.optString("SuggestFormat");
            }
            if (jSONObject.has("CacheFrameCount")) {
                tTRequestParam.cacheFrameCount = jSONObject.optInt("CacheFrameCount");
            }
            if (jSONObject.has("CacheDuration")) {
                tTRequestParam.cacheDuration = jSONObject.optInt("CacheDuration");
            }
            if (jSONObject.has("MinCacheDuration")) {
                tTRequestParam.minCacheDuration = jSONObject.optInt("MinCacheDuration");
            }
            if (jSONObject.has("CacheMode")) {
                tTRequestParam.cacheMode = jSONObject.optInt("CacheMode");
            }
            tTRequestParam.httpCacheMaxAgeSec = this.mPreloadCacheMaxAgeSec;
            tTRequestParam.openTimeoutMs = this.mRequestOpenTimeout;
            tTRequestParam.readTimeoutMs = this.mRequestReadTimeout;
            tTRequestParam.optCancelTask = this.mOptCancelTask;
            return 0;
        } catch (Exception unused) {
            return -2004;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (6 != r12) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (1 == r12) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int preload(int r20, java.lang.String r21, java.lang.String r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.live.ttquic.PreloadManager.preload(int, java.lang.String, java.lang.String, android.os.Bundle):int");
    }
}
