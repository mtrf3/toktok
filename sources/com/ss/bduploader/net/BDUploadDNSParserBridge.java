package com.ss.bduploader.net;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import com.ss.bduploader.BDUploadLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class BDUploadDNSParserBridge implements BDUploadDNSParserListener {
    public String host;
    public String ipList;
    public boolean isFinish;
    public Lock lock = new ReentrantLock();
    public long handle = 0;

    public static native void _notifyParserResult(long j, String str, String str2, long j2, String str3);

    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("****get result:");
            LIZ.append(str);
            BDUploadLog.d("BDUploadDNSParserBridge", X1D.LIZIZ(LIZ));
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public void release() {
        this.lock.lock();
        try {
            this.handle = 0L;
            BDUploadDNSParser.getInstance().removeHost(this.host, this);
        } finally {
            this.lock.unlock();
        }
    }

    public boolean isFinish() {
        return this.isFinish;
    }

    public int start(long j, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("----start parse host:");
        LIZ.append(str);
        BDUploadLog.d("BDUploadDNSParserBridge", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("****end parse fail for host:");
            LIZ2.append(str);
            BDUploadLog.d("BDUploadDNSParserBridge", X1D.LIZIZ(LIZ2));
            return -1;
        }
        this.lock.lock();
        this.handle = j;
        try {
            this.host = str;
            BDUploadDNSInfo bDUploadDNSInfo = IPCache.getInstance().get(str);
            int i = 0;
            if (bDUploadDNSInfo != null) {
                this.ipList = bDUploadDNSInfo.mIpList;
                long currentTimeMillis = System.currentTimeMillis();
                BDUploadLog.d("BDUploadDNSParserBridge", C16880lQ.LLLZ("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(bDUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
                if (bDUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                    BDUploadLog.d("BDUploadDNSParserBridge", C16880lQ.LLLZ("has expired try call parse:", new Object[0]));
                    BDUploadDNSParser.getInstance().addHost(str, null);
                }
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, this.ipList, bDUploadDNSInfo.mExpiredTime, null);
                }
                i = 1;
            } else {
                BDUploadLog.d("BDUploadDNSParserBridge", "****add host to parser");
                BDUploadDNSParser.getInstance().addHost(str, this);
            }
            return i;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.ss.bduploader.net.BDUploadDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3) {
        this.lock.lock();
        try {
            if (!this.isFinish) {
                BDUploadLog.d("BDUploadDNSParserBridge", C16880lQ.LLLZ("receive completion code:%d result:%s", new Object[]{Integer.valueOf(i), str2}));
                this.ipList = str2;
                this.isFinish = true;
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, str2, j, str3);
                }
            } else {
                BDUploadLog.d("BDUploadDNSParserBridge", C16880lQ.LLLZ("has finished not nedd cur completion code:%d result:%s expiredTime:%lld", new Object[]{Integer.valueOf(i), str2, Long.valueOf(j)}));
            }
        } finally {
            this.lock.unlock();
        }
    }
}
