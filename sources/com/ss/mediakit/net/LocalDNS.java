package com.ss.mediakit.net;

import X.C16880lQ;
import android.net.Network;
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
public class LocalDNS extends BaseDNS {
    public InetAddress[] mAddress;
    public Future mFuture;
    public boolean mRet;

    /* loaded from: classes9.dex */
    public static class MyRunnable implements Runnable {
        public final WeakReference<LocalDNS> mLocalDNSRef;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_mediakit_net_LocalDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_mediakit_net_LocalDNS$MyRunnable__run$___twin___() {
            Locale locale = Locale.US;
            AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(locale, "----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS == null) {
                AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(locale, "****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNS.mRet) {
                localDNS.cancel();
                AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(locale, "****end implement delayed check cancel local dns,", new Object[0]));
                localDNS.notifyError(new AVMDLDNSInfo(0, localDNS.mHostname, (String) null, 0L, localDNS.mId));
            }
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }

        public static void com_ss_mediakit_net_LocalDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MyRunnable myRunnable) {
            boolean LIZ;
            try {
                myRunnable.com_ss_mediakit_net_LocalDNS$MyRunnable__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    @Override // com.ss.mediakit.net.BaseDNS
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

    @Override // com.ss.mediakit.net.BaseDNS
    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.mediakit.net.LocalDNS.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_mediakit_net_LocalDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_mediakit_net_LocalDNS$1__run$___twin___() {
                    Locale locale = Locale.US;
                    AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(locale, "----call local dns, host:%s", new Object[]{LocalDNS.this.mHostname}));
                    try {
                        Network curNetwork = AVMDLMultiNetwork.getCurNetwork();
                        if (curNetwork != null) {
                            AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(locale, "do local by cellular network", new Object[0]));
                            LocalDNS localDNS = LocalDNS.this;
                            localDNS.mAddress = curNetwork.getAllByName(localDNS.mHostname);
                        } else {
                            AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(locale, "do local by default network", new Object[0]));
                            LocalDNS localDNS2 = LocalDNS.this;
                            localDNS2.mAddress = InetAddress.getAllByName(localDNS2.mHostname);
                        }
                        LocalDNS localDNS3 = LocalDNS.this;
                        localDNS3.mRet = true;
                        if (localDNS3.mAddress == null) {
                            AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(locale, "****end call local dns, not get address host:%s", new Object[]{localDNS3.mHostname}));
                            LocalDNS localDNS4 = LocalDNS.this;
                            localDNS4.notifyError(new AVMDLDNSInfo(0, localDNS4.mHostname, (String) null, 0L, localDNS4.mId));
                            return;
                        }
                        String str = "";
                        int i = 0;
                        while (true) {
                            InetAddress[] inetAddressArr = LocalDNS.this.mAddress;
                            if (i >= inetAddressArr.length) {
                                break;
                            }
                            String hostAddress = inetAddressArr[i].getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                if (TextUtils.isEmpty(str)) {
                                    str = i0.LJFF(str, hostAddress);
                                } else {
                                    str = a1.LJ(str, ",", hostAddress);
                                }
                            }
                            i++;
                        }
                        if (TextUtils.isEmpty(str)) {
                            AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(Locale.US, "****end call local dns, iplist null host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS localDNS5 = LocalDNS.this;
                            localDNS5.notifyError(new AVMDLDNSInfo(0, localDNS5.mHostname, (String) null, 0L, localDNS5.mId));
                            return;
                        }
                        Locale locale2 = Locale.US;
                        AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(locale2, "****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                        int i2 = AVMDLDNSParser.mGlobalForceExpiredTime;
                        if (i2 <= 0) {
                            i2 = AVMDLDNSParser.mGlobalDefaultExpiredTime;
                        }
                        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(0, LocalDNS.this.mHostname, str, System.currentTimeMillis() + (i2 * 1000), LocalDNS.this.mId);
                        IPCache.getInstance().put(LocalDNS.this.mHostname, aVMDLDNSInfo);
                        LocalDNS.this.notifySuccess(aVMDLDNSInfo);
                        AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(locale2, "****end call local dns, suc iplist:%s host:%s", new Object[]{str, LocalDNS.this.mHostname}));
                    } catch (Throwable th) {
                        LocalDNS localDNS6 = LocalDNS.this;
                        localDNS6.mRet = true;
                        AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(Locale.US, "****end call local dns, end exception:%s host:%s", new Object[]{th, localDNS6.mHostname}));
                        LocalDNS localDNS7 = LocalDNS.this;
                        localDNS7.notifyError(new AVMDLDNSInfo(0, localDNS7.mHostname, (String) null, 0L, localDNS7.mId));
                    }
                }

                public static void com_ss_mediakit_net_LocalDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_mediakit_net_LocalDNS$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } catch (Exception e) {
            AVMDLLog.d("LocalDNS", C16880lQ.LLLZI(Locale.US, "****end call local dns, exception:%s host:%s", new Object[]{e, this.mHostname}));
            notifyError(new AVMDLDNSInfo(0, this.mHostname, (String) null, 0L, this.mId));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000L);
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    public LocalDNS(String str, Handler handler) {
        super(str, handler);
    }
}
