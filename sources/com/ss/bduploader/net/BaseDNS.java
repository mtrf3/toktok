package com.ss.bduploader.net;

import X.X1D;
import android.os.Handler;

/* loaded from: classes9.dex */
public class BaseDNS {
    public boolean mCancelled;
    public Handler mHandler;
    public String mHostname;
    public String mId;
    public DNSCompletionListener mListener;
    public BDVNetClient mNetClient;

    public void cancel() {
    }

    public void close() {
    }

    public boolean isRunning() {
        return true;
    }

    public void start() {
    }

    public void notifyCancelled() {
        this.mHandler.sendEmptyMessage(0);
    }

    public void notifyError(BDUploadDNSInfo bDUploadDNSInfo) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, bDUploadDNSInfo));
    }

    public void notifyRetry(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    public void notifySuccess(BDUploadDNSInfo bDUploadDNSInfo) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, bDUploadDNSInfo));
    }

    public void setCompletionListener(DNSCompletionListener dNSCompletionListener) {
        this.mListener = dNSCompletionListener;
    }

    public BaseDNS(String str, Handler handler) {
        this.mHostname = str;
        this.mHandler = handler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(Long.toString(System.nanoTime()));
        LIZ.append(Integer.toString(System.identityHashCode(this)));
        this.mId = X1D.LIZIZ(LIZ);
    }

    public BaseDNS(String str, BDVNetClient bDVNetClient, Handler handler) {
        this.mHostname = str;
        this.mHandler = handler;
        this.mNetClient = bDVNetClient == null ? new BDHTTPNetwork() : bDVNetClient;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(Long.toString(System.nanoTime()));
        LIZ.append(Integer.toString(System.identityHashCode(this)));
        this.mId = X1D.LIZIZ(LIZ);
    }
}
