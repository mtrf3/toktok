package com.byted.cast.dnssd;

import X.C16880lQ;
import X.RunnableC90175ZaF;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes29.dex */
public class DNSSDEmbedded extends DNSSD {
    public volatile boolean isStarted;
    public final Handler mHandler;
    public HandlerThread mHandlerThread;
    public final long mStopTimerDelay;
    public Thread mThread;
    public int serviceCount;

    public static native void nativeExit();

    public static native int nativeInit();

    public static native int nativeLoop();

    private void waitUntilStarted() {
        synchronized (DNSSDEmbedded.class) {
            while (!this.isStarted) {
                try {
                    DNSSDEmbedded.class.wait();
                } catch (InterruptedException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("waitUntilStarted exception: ");
                    LIZ.append(e);
                    Logger.e("DNSSDEmbedded", X1D.LIZIZ(LIZ));
                }
            }
            Logger.i("DNSSDEmbedded", "after waitUntilStarted");
        }
    }

    public void exit() {
        synchronized (DNSSDEmbedded.class) {
            Logger.i("DNSSDEmbedded", "post exit");
            this.mHandler.postDelayed(new RunnableC90175ZaF(), this.mStopTimerDelay);
        }
    }

    public void init() {
        this.mHandler.removeCallbacks(new RunnableC90175ZaF());
        Thread thread = this.mThread;
        if (thread != null && thread.isAlive()) {
            Logger.i("DNSSDEmbedded", "already started");
            waitUntilStarted();
            return;
        }
        this.isStarted = false;
        InternalDNSSD.getInstance();
        PthreadThread pthreadThread = new PthreadThread() { // from class: com.byted.cast.dnssd.DNSSDEmbedded.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                com_byted_cast_dnssd_DNSSDEmbedded$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_dnssd_DNSSDEmbedded$1__run$___twin___() {
                Logger.i("DNSSDEmbedded", "init");
                int nativeInit = DNSSDEmbedded.nativeInit();
                synchronized (DNSSDEmbedded.class) {
                    DNSSDEmbedded.this.isStarted = true;
                    DNSSDEmbedded.class.notifyAll();
                }
                if (nativeInit != 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("error: ");
                    LIZ.append(nativeInit);
                    Logger.e("DNSSDEmbedded", X1D.LIZIZ(LIZ));
                    return;
                }
                Logger.i("DNSSDEmbedded", "start");
                int nativeLoop = DNSSDEmbedded.nativeLoop();
                DNSSDEmbedded.this.isStarted = false;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("finish with code: ");
                LIZ2.append(nativeLoop);
                Logger.i("DNSSDEmbedded", X1D.LIZIZ(LIZ2));
            }

            public static void com_byted_cast_dnssd_DNSSDEmbedded$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_byted_cast_dnssd_DNSSDEmbedded$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.mThread = pthreadThread;
        pthreadThread.setPriority(10);
        this.mThread.setName("DNS-SDEmbedded");
        this.mThread.start();
        waitUntilStarted();
    }

    @Override // com.byted.cast.dnssd.DNSSD, com.byted.cast.dnssd.InternalDNSSDService.DnssdServiceListener
    public void onServiceStarting() {
        super.onServiceStarting();
        init();
        this.serviceCount++;
    }

    @Override // com.byted.cast.dnssd.DNSSD, com.byted.cast.dnssd.InternalDNSSDService.DnssdServiceListener
    public void onServiceStopped() {
        super.onServiceStopped();
        int i = this.serviceCount - 1;
        this.serviceCount = i;
        if (i == 0) {
            exit();
        }
    }

    public DNSSDEmbedded(Context context) {
        this(context, 5000L);
    }

    public DNSSDEmbedded(Context context, long j) {
        super(context, "jdns_sd_embedded", (ILibraryLoader) null);
        this.mStopTimerDelay = j;
        this.mHandler = new Handler(C16880lQ.LLJJJJ());
    }

    public DNSSDEmbedded(Context context, Looper looper, int i, long j, ILibraryLoader iLibraryLoader) {
        super(context, "jdns_sd_embedded", looper, i, iLibraryLoader);
        this.mStopTimerDelay = j;
        this.mHandler = new Handler(looper);
    }
}
