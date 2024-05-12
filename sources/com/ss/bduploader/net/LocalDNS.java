package com.ss.bduploader.net;

import X.C16880lQ;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.bduploader.BDUploadLog;
import defpackage.a1;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* loaded from: classes9.dex */
public class LocalDNS extends BaseDNS {
    public InetAddress[] mAddress;
    public Future mFuture;
    public boolean mRet;

    @Override // com.ss.bduploader.net.BaseDNS
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

    @Override // com.ss.bduploader.net.BaseDNS
    public void start() {
        try {
            this.mFuture = BDUploadThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.bduploader.net.LocalDNS.1
                public void com_ss_bduploader_net_LocalDNS$1__run$___twin___() {
                    BDUploadLog.d("LocalDNS", C16880lQ.LLLZ("----call local dns, host:%s", new Object[]{LocalDNS.this.mHostname}));
                    try {
                        LocalDNS localDNS = LocalDNS.this;
                        localDNS.mAddress = InetAddress.getAllByName(localDNS.mHostname);
                        LocalDNS localDNS2 = LocalDNS.this;
                        localDNS2.mRet = true;
                        if (localDNS2.mAddress == null) {
                            BDUploadLog.d("LocalDNS", C16880lQ.LLLZ("****end call local dns, not get address host:%s", new Object[]{localDNS2.mHostname}));
                            LocalDNS localDNS3 = LocalDNS.this;
                            localDNS3.notifyError(new BDUploadDNSInfo(0, localDNS3.mHostname, null, 0L, localDNS3.mId));
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
                            BDUploadLog.d("LocalDNS", C16880lQ.LLLZ("****end call local dns, iplist null host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS localDNS4 = LocalDNS.this;
                            localDNS4.notifyError(new BDUploadDNSInfo(0, localDNS4.mHostname, null, 0L, localDNS4.mId));
                        } else {
                            BDUploadLog.d("LocalDNS", C16880lQ.LLLZ("****end call local dns, suc iplist:%s host:%s", new Object[]{str, LocalDNS.this.mHostname}));
                            BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(0, LocalDNS.this.mHostname, str, System.currentTimeMillis() + (BDUploadDNSParser.mGlobalDefaultExpiredTime * 1000), LocalDNS.this.mId);
                            IPCache.getInstance().put(LocalDNS.this.mHostname, bDUploadDNSInfo);
                            LocalDNS.this.notifySuccess(bDUploadDNSInfo);
                        }
                    } catch (Throwable th) {
                        LocalDNS localDNS5 = LocalDNS.this;
                        localDNS5.mRet = true;
                        BDUploadLog.d("LocalDNS", C16880lQ.LLLZ("****end call local dns, end exception:%s host:%s", new Object[]{th, localDNS5.mHostname}));
                        LocalDNS localDNS6 = LocalDNS.this;
                        localDNS6.notifyError(new BDUploadDNSInfo(0, localDNS6.mHostname, null, 0L, localDNS6.mId));
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_bduploader_net_LocalDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public static void com_ss_bduploader_net_LocalDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_bduploader_net_LocalDNS$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } catch (Exception e) {
            BDUploadLog.d("LocalDNS", C16880lQ.LLLZ("****end call local dns, exception:%s host:%s", new Object[]{e, this.mHostname}));
            notifyError(new BDUploadDNSInfo(0, this.mHostname, null, 0L, this.mId));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000L);
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    /* loaded from: classes9.dex */
    public static class MyRunnable implements Runnable {
        public final WeakReference<LocalDNS> mLocalDNSRef;

        public void com_ss_bduploader_net_LocalDNS$MyRunnable__run$___twin___() {
            BDUploadLog.d("LocalDNS", C16880lQ.LLLZ("----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS == null) {
                BDUploadLog.d("LocalDNS", C16880lQ.LLLZ("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNS.mRet) {
                localDNS.cancel();
                BDUploadLog.d("LocalDNS", C16880lQ.LLLZ("****end implement delayed check cancel local dns,", new Object[0]));
                localDNS.notifyError(new BDUploadDNSInfo(0, localDNS.mHostname, null, 0L, localDNS.mId));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            com_ss_bduploader_net_LocalDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }

        public static void com_ss_bduploader_net_LocalDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MyRunnable myRunnable) {
            boolean LIZ;
            try {
                myRunnable.com_ss_bduploader_net_LocalDNS$MyRunnable__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public LocalDNS(String str, Handler handler) {
        super(str, handler);
    }
}
