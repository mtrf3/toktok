package com.ss.mediakit.net;

import X.C16880lQ;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.Locale;
import java.util.concurrent.Future;

/* loaded from: classes9.dex */
public class CustomHTTPDNS extends BaseDNS {
    public InetAddress[] mAddress;
    public Future mFuture;
    public boolean mRet;

    /* loaded from: classes9.dex */
    public static class MyRunnable implements Runnable {
        public final WeakReference<CustomHTTPDNS> mCustomHTTPDNSRef;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_mediakit_net_CustomHTTPDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_mediakit_net_CustomHTTPDNS$MyRunnable__run$___twin___() {
            Locale locale = Locale.US;
            AVMDLLog.d("CustomHTTPDNS", C16880lQ.LLLZI(locale, "----implement delayed check for custom httpdns", new Object[0]));
            CustomHTTPDNS customHTTPDNS = this.mCustomHTTPDNSRef.get();
            if (customHTTPDNS == null) {
                AVMDLLog.d("CustomHTTPDNS", C16880lQ.LLLZI(locale, "****end implement delayed check for custom httpdns, dns object null", new Object[0]));
            } else if (!customHTTPDNS.mRet) {
                customHTTPDNS.cancel();
                AVMDLLog.d("CustomHTTPDNS", C16880lQ.LLLZI(locale, "****end implement delayed check cancel custom httpdns,", new Object[0]));
                customHTTPDNS.notifyError(new AVMDLDNSInfo(4, customHTTPDNS.mHostname, (String) null, 0L, customHTTPDNS.mId));
            }
        }

        public MyRunnable(CustomHTTPDNS customHTTPDNS) {
            this.mCustomHTTPDNSRef = new WeakReference<>(customHTTPDNS);
        }

        public static void com_ss_mediakit_net_CustomHTTPDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MyRunnable myRunnable) {
            boolean LIZ;
            try {
                myRunnable.com_ss_mediakit_net_CustomHTTPDNS$MyRunnable__run$___twin___();
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
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.mediakit.net.CustomHTTPDNS.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_mediakit_net_CustomHTTPDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_mediakit_net_CustomHTTPDNS$1__run$___twin___() {
                    int i;
                    AVMDLCustomHTTPDNSParserResult aVMDLCustomHTTPDNSParserResult;
                    long j;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    objArr[0] = CustomHTTPDNS.this.mHostname;
                    if (AVMDLDNSParser.mCustomHttpDNSParser == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    objArr[1] = Integer.valueOf(i);
                    AVMDLLog.d("CustomHTTPDNS", C16880lQ.LLLZI(locale, "----call custom httpdns, host:%s custom parser:%d", objArr));
                    AVMDLCustomHTTPDNSParser aVMDLCustomHTTPDNSParser = AVMDLDNSParser.mCustomHttpDNSParser;
                    if (aVMDLCustomHTTPDNSParser != null) {
                        aVMDLCustomHTTPDNSParserResult = aVMDLCustomHTTPDNSParser.parseHost(CustomHTTPDNS.this.mHostname);
                    } else {
                        aVMDLCustomHTTPDNSParserResult = null;
                    }
                    CustomHTTPDNS.this.mRet = true;
                    if (aVMDLCustomHTTPDNSParserResult == null || TextUtils.isEmpty(aVMDLCustomHTTPDNSParserResult.mIPList)) {
                        AVMDLLog.d("CustomHTTPDNS", C16880lQ.LLLZI(locale, "****end call custom httpdns, result null or iplist null host:%s", new Object[]{CustomHTTPDNS.this.mHostname}));
                        CustomHTTPDNS customHTTPDNS = CustomHTTPDNS.this;
                        customHTTPDNS.notifyError(new AVMDLDNSInfo(4, customHTTPDNS.mHostname, (String) null, 0L, customHTTPDNS.mId));
                        return;
                    }
                    AVMDLLog.d("CustomHTTPDNS", C16880lQ.LLLZI(locale, "****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                    int i2 = AVMDLDNSParser.mGlobalForceExpiredTime;
                    if (i2 > 0) {
                        j = i2;
                    } else {
                        j = aVMDLCustomHTTPDNSParserResult.mTTL;
                    }
                    AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(4, CustomHTTPDNS.this.mHostname, aVMDLCustomHTTPDNSParserResult.mIPList, System.currentTimeMillis() + (j * 1000), CustomHTTPDNS.this.mId);
                    IPCache.getInstance().put(CustomHTTPDNS.this.mHostname, aVMDLDNSInfo);
                    CustomHTTPDNS.this.notifySuccess(aVMDLDNSInfo);
                    AVMDLLog.d("CustomHTTPDNS", C16880lQ.LLLZI(locale, "****end call custom httpdns, suc iplist:%s host:%s", new Object[]{aVMDLCustomHTTPDNSParserResult.mIPList, CustomHTTPDNS.this.mHostname}));
                }

                public static void com_ss_mediakit_net_CustomHTTPDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_mediakit_net_CustomHTTPDNS$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } catch (Exception e) {
            AVMDLLog.d("CustomHTTPDNS", C16880lQ.LLLZI(Locale.US, "****end call custom httpdns, exception:%s host:%s", new Object[]{e, this.mHostname}));
            notifyError(new AVMDLDNSInfo(4, this.mHostname, (String) null, 0L, this.mId));
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

    public CustomHTTPDNS(String str, Handler handler) {
        super(str, handler);
    }
}
