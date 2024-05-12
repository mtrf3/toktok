package com.ss.bduploader;

import X.C16880lQ;
import X.C1JX;
import X.C39045FUb;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.bduploader.BDUploadUtil;
import com.ss.bduploader.logupload.VideoEventEngineUploader;
import com.ss.bduploader.net.BDUploadThreadPool;
import com.ss.bduploader.util.BDUrlDispatchInterface;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BDUploadUtil {
    public static String DiskResumeConfigDir = "DiskResumeConfigDir";
    public static String RetryStatesInfoDir = "RetryStatesInfoDir";
    public static String SpeedTestcontextDir = "SpeedTestcontextDir";
    public static Boolean mEnableDisaptch;
    public static Boolean mEnableNativeLog;
    public static volatile boolean mIsLibraryLoaded;
    public static volatile boolean mIsXQuicLoaded;
    public static volatile BDLibraryLoaderProxy mProxy;
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;
    public static String sdkConfigDir;
    public static final ReentrantLock mLock = new ReentrantLock();
    public static VideoEventEngineUploader eventEngineUploader = null;
    public static BDUrlDispatchInterface urlDispatch = null;

    static {
        Boolean bool = Boolean.FALSE;
        mEnableDisaptch = bool;
        mEnableNativeLog = bool;
    }

    public static synchronized String getDNSServerIP() {
        String str;
        synchronized (BDUploadUtil.class) {
            if (SystemClock.elapsedRealtime() - mServerIPTime >= LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                BDUploadThreadPool.addExecuteTask(new Runnable() { // from class: X.FUc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BDUploadUtil.lambda$getDNSServerIP$0();
                    }
                });
            }
            str = mServerIP;
        }
        return str;
    }

    public static /* synthetic */ void lambda$getDNSServerIP$0() {
        try {
            InetAddress byName = InetAddress.getByName("whoami.akamai.net");
            if (byName != null) {
                mServerIP = byName.getHostAddress();
                mServerIPTime = SystemClock.elapsedRealtime();
            }
        } catch (UnknownHostException unused) {
        }
    }

    public static boolean loadLibrary() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (mProxy == null) {
            return true;
        }
        if (mProxy != null && !mIsLibraryLoaded) {
            boolean LIZ = C39045FUb.LIZ();
            boolean loadLibrary = mProxy.loadLibrary("ttopenssl");
            if (LIZ || loadLibrary) {
                z = true;
            } else {
                z = false;
            }
            mProxy.loadLibrary("vcn");
            mProxy.loadLibrary("vcnverify");
            boolean loadLibrary2 = mProxy.loadLibrary("xquic");
            boolean loadLibrary3 = mProxy.loadLibrary("xquicclient");
            boolean loadLibrary4 = mProxy.loadLibrary("bdvideouploader");
            if (loadLibrary2 && loadLibrary3) {
                z2 = true;
            } else {
                z2 = false;
            }
            mIsXQuicLoaded = z2;
            if (!z || !loadLibrary4) {
                z3 = false;
            }
            mIsLibraryLoaded = z3;
        }
        return mIsLibraryLoaded;
    }

    public static synchronized void updateDNSServerIP() {
        synchronized (BDUploadUtil.class) {
            if (SystemClock.elapsedRealtime() - mServerIPTime < LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                return;
            }
            new PthreadThread(new Runnable() { // from class: com.ss.bduploader.BDUploadUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_bduploader_BDUploadUtil$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_bduploader_BDUploadUtil$1__run$___twin___() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            BDUploadUtil.mServerIP = byName.getHostAddress();
                            BDUploadUtil.mServerIPTime = SystemClock.elapsedRealtime();
                        }
                    } catch (UnknownHostException unused) {
                    }
                }

                public static void com_ss_bduploader_BDUploadUtil$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_bduploader_BDUploadUtil$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, "/BDUploadUtil").start();
        }
    }

    public static synchronized boolean xquicAvalilable() {
        boolean z;
        synchronized (BDUploadUtil.class) {
            z = mIsXQuicLoaded;
        }
        return z;
    }

    public static boolean loadVcn() {
        VcnlibloadWrapper.tryLoadVcnlib();
        VcnlibloadWrapper.tryLoadVcnverifylib();
        return true;
    }

    public static int createDir(String str) {
        File file = new File(str);
        if (file.exists()) {
            return 1;
        }
        String str2 = File.separator;
        if (!str.endsWith(str2)) {
            C1JX.LJIIIIZZ(str, str2);
        }
        if (file.mkdirs()) {
            return 1;
        }
        return -1;
    }

    public static synchronized boolean initInternal(StringBuffer stringBuffer) {
        boolean z;
        synchronized (BDUploadUtil.class) {
            if (!loadLibrary()) {
                return false;
            }
            if (mProxy != null) {
                z = true;
            } else {
                z = false;
            }
            if (systemLoadInit(z, stringBuffer) != 1) {
                return false;
            }
            return true;
        }
    }

    public static Map<String, String> jsonToHashMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String valueOf = String.valueOf(keys.next());
            hashMap.put(valueOf, jSONObject.optString(valueOf));
        }
        return hashMap;
    }

    public static JSONObject mapToJSON(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static String mapToString(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setDispatchImp(BDUrlDispatchInterface bDUrlDispatchInterface) {
        urlDispatch = bDUrlDispatchInterface;
    }

    public static void setEnableDispatch(Boolean bool) {
        mEnableDisaptch = bool;
    }

    public static void setEnableNativeLog(Boolean bool) {
        mEnableNativeLog = bool;
    }

    public static void setLoadProxy(BDLibraryLoaderProxy bDLibraryLoaderProxy) {
        ReentrantLock reentrantLock = mLock;
        reentrantLock.lock();
        if (bDLibraryLoaderProxy != null) {
            try {
                mProxy = bDLibraryLoaderProxy;
            } catch (Throwable th) {
                mLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public static void setSDKConfigDir(String str) {
        String str2 = sdkConfigDir;
        if (str2 != null && str2.length() > 0) {
            return;
        }
        sdkConfigDir = str;
    }

    public static void setVideoEventUpload(VideoEventEngineUploader videoEventEngineUploader) {
        eventEngineUploader = videoEventEngineUploader;
    }

    public static int systemLoadInit(boolean z, StringBuffer stringBuffer) {
        boolean z2;
        if (mIsLibraryLoaded) {
            return 1;
        }
        mIsLibraryLoaded = z;
        if (!mIsLibraryLoaded) {
            C39045FUb.LIZ();
            VcnlibloadWrapper.tryLoadVcnlib();
            VcnlibloadWrapper.tryLoadVcnverifylib();
            try {
                C16880lQ.LLJJJIL("xquic");
                C16880lQ.LLJJJIL("xquicclient");
                z2 = true;
            } catch (Throwable unused) {
                z2 = false;
            }
            mIsXQuicLoaded = z2;
            try {
                C16880lQ.LLJJJIL("bdvideouploader");
                mIsLibraryLoaded = true;
            } catch (UnsatisfiedLinkError e) {
                stringBuffer.append(e.toString());
            } catch (Throwable th) {
                stringBuffer.append(th.toString());
            }
        }
        if (mIsLibraryLoaded) {
            return 1;
        }
        return -1;
    }
}
