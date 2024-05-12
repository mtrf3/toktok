package com.ss.mediakit.net;

import X.C16880lQ;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import defpackage.a1;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.Locale;
import java.util.concurrent.Future;

/* loaded from: classes9.dex */
public class LocalDNSHosts {
    public InetAddress[] mAddress;
    public boolean mCancelled;
    public Future mFuture;
    public Handler mHandler;
    public String[] mHosts;
    public String mId;
    public AVMDLNetClient mNetClient;
    public boolean mRet;

    /* loaded from: classes9.dex */
    public static class MyRunnable implements Runnable {
        public final WeakReference<LocalDNSHosts> mLocalDNSRef;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_mediakit_net_LocalDNSHosts$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_mediakit_net_LocalDNSHosts$MyRunnable__run$___twin___() {
            Locale locale = Locale.US;
            AVMDLLog.d("BatchParseLocalDNSHosts", C16880lQ.LLLZI(locale, "----implement delayed check for local dns", new Object[0]));
            LocalDNSHosts localDNSHosts = this.mLocalDNSRef.get();
            if (localDNSHosts == null) {
                AVMDLLog.d("BatchParseLocalDNSHosts", C16880lQ.LLLZI(locale, "****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNSHosts.mRet) {
                localDNSHosts.cancel();
                AVMDLLog.d("BatchParseLocalDNSHosts", C16880lQ.LLLZI(locale, "****end implement delayed check cancel local dns,", new Object[0]));
            }
        }

        public MyRunnable(LocalDNSHosts localDNSHosts) {
            this.mLocalDNSRef = new WeakReference<>(localDNSHosts);
        }

        public static void com_ss_mediakit_net_LocalDNSHosts$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MyRunnable myRunnable) {
            boolean LIZ;
            try {
                myRunnable.com_ss_mediakit_net_LocalDNSHosts$MyRunnable__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    public void close() {
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.mediakit.net.LocalDNSHosts.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_mediakit_net_LocalDNSHosts$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_mediakit_net_LocalDNSHosts$1__run$___twin___() {
                    LocalDNSHosts localDNSHosts;
                    AVMDLLog.d("BatchParseLocalDNSHosts", "----call local dns batch parse");
                    int i = 0;
                    while (true) {
                        LocalDNSHosts localDNSHosts2 = LocalDNSHosts.this;
                        String[] strArr = localDNSHosts2.mHosts;
                        if (i < strArr.length) {
                            if (!TextUtils.isEmpty(strArr[i])) {
                                try {
                                    LocalDNSHosts localDNSHosts3 = LocalDNSHosts.this;
                                    localDNSHosts3.mAddress = InetAddress.getAllByName(localDNSHosts3.mHosts[i]);
                                    String str = "";
                                    int i2 = 0;
                                    while (true) {
                                        localDNSHosts = LocalDNSHosts.this;
                                        InetAddress[] inetAddressArr = localDNSHosts.mAddress;
                                        if (i2 >= inetAddressArr.length) {
                                            break;
                                        }
                                        String hostAddress = inetAddressArr[i2].getHostAddress();
                                        if (!TextUtils.isEmpty(hostAddress)) {
                                            if (TextUtils.isEmpty(str)) {
                                                str = i0.LJFF(str, hostAddress);
                                            } else {
                                                str = a1.LJ(str, ",", hostAddress);
                                            }
                                        }
                                        i2++;
                                    }
                                    Locale locale = Locale.US;
                                    AVMDLLog.d("BatchParseLocalDNSHosts", C16880lQ.LLLZI(locale, "host:%s pasrse suc result:%s", new Object[]{localDNSHosts.mHosts[i], str}));
                                    if (!TextUtils.isEmpty(str)) {
                                        AVMDLLog.d("BatchParseLocalDNSHosts", C16880lQ.LLLZI(locale, "****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                                        int i3 = AVMDLDNSParser.mGlobalForceExpiredTime;
                                        if (i3 <= 0) {
                                            i3 = AVMDLDNSParser.mGlobalDefaultExpiredTime;
                                        }
                                        IPCache.getInstance().put(LocalDNSHosts.this.mHosts[i], new AVMDLDNSInfo(0, LocalDNSHosts.this.mHosts[i], str, (i3 * 1000) + System.currentTimeMillis(), LocalDNSHosts.this.mId));
                                    }
                                } catch (Throwable th) {
                                    AVMDLLog.d("BatchParseLocalDNSHosts", C16880lQ.LLLZI(Locale.US, "host:%s pasrse err:%s", new Object[]{LocalDNSHosts.this.mHosts[i], th.getMessage()}));
                                }
                            }
                            i++;
                        } else {
                            localDNSHosts2.mRet = true;
                            AVMDLLog.d("BatchParseLocalDNSHosts", "****end call local dns batch parse");
                            return;
                        }
                    }
                }

                public static void com_ss_mediakit_net_LocalDNSHosts$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_mediakit_net_LocalDNSHosts$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } catch (Exception e) {
            AVMDLLog.d("BatchParseLocalDNSHosts", C16880lQ.LLLZI(Locale.US, "****end call local dns, exception:%s", new Object[]{e}));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000L);
    }

    public boolean isRunning() {
        return this.mRet;
    }

    public LocalDNSHosts(String[] strArr, Handler handler) {
        this.mHosts = strArr;
        this.mHandler = handler;
    }
}
