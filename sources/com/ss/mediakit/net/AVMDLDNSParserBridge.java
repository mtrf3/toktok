package com.ss.mediakit.net;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class AVMDLDNSParserBridge implements AVMDLDNSParserListener {
    public static boolean v2Usable = true;
    public String host;
    public String ipList;
    public boolean isFinish;
    public Lock lock = new ReentrantLock();
    public long handle = 0;

    public static native void _notifyParserResult(long j, String str, String str2, long j2, String str3);

    public static native void _notifyParserResultV2(long j, String str, String str2, long j2, String str3, int i);

    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("****get result:");
            LIZ.append(str);
            AVMDLLog.d("AVMDLDNSParserBridge", X1D.LIZIZ(LIZ));
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public void release() {
        Locale locale = Locale.US;
        AVMDLLog.d("AVMDLDNSParserBridge", C16880lQ.LLLZI(locale, "----start release:%s", new Object[]{this}));
        this.lock.lock();
        try {
            this.handle = 0L;
            this.lock.unlock();
            AVMDLLog.d("AVMDLDNSParserBridge", C16880lQ.LLLZI(locale, "remove host:%s", new Object[]{this.host}));
            AVMDLDNSParser.getInstance().removeHost(this.host, this);
            AVMDLLog.d("AVMDLDNSParserBridge", C16880lQ.LLLZI(locale, "****end call release:%s", new Object[]{this}));
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public boolean isFinish() {
        return this.isFinish;
    }

    public String getBackUp(String str) {
        String str2;
        AVMDLDNSInfo backUpIp;
        if (AVMDLDNSParser.getIntValue(5) == 1 && (backUpIp = IPCache.getInstance().getBackUpIp(str)) != null) {
            str2 = backUpIp.mIpList;
        } else {
            str2 = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("****get backup ip result:");
        LIZ.append(str2);
        AVMDLLog.d("AVMDLDNSParserBridge", X1D.LIZIZ(LIZ));
        return str2;
    }

    public int start(long j, String str) {
        int parserResult;
        if (!v2Usable || (parserResult = parserResult(j, str, 2, -1)) <= 0) {
            return parserResult(j, str, 1, -1);
        }
        return parserResult;
    }

    public int start(long j, String str, int i) {
        int parserResult;
        if (!v2Usable || (parserResult = parserResult(j, str, 2, i)) <= 0) {
            return parserResult(j, str, 1, i);
        }
        return parserResult;
    }

    public void triggerRefresh(long j, String str, int i) {
        AVMDLDNSParser.getInstance().postDNSInfoRefreshMsg(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009e A[Catch: UnsatisfiedLinkError -> 0x00f4, all -> 0x0148, TryCatch #0 {UnsatisfiedLinkError -> 0x00f4, blocks: (B:15:0x0096, B:17:0x009e, B:19:0x00cb, B:20:0x00dd), top: B:14:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int parserResult(long r22, java.lang.String r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.net.AVMDLDNSParserBridge.parserResult(long, java.lang.String, int, int):int");
    }

    @Override // com.ss.mediakit.net.AVMDLDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3, int i2) {
        if (!this.isFinish && v2Usable) {
            parserResult(i, str, str2, j, str3, i2, 2);
        }
        if (!this.isFinish) {
            parserResult(i, str, str2, j, str3, i2, 1);
        }
    }

    private void parserResult(int i, String str, String str2, long j, String str3, int i2, int i3) {
        String str4;
        int i4 = i2;
        String str5 = str2;
        long j2 = j;
        this.lock.lock();
        try {
            try {
                if (!this.isFinish) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[3];
                    objArr[0] = Integer.valueOf(i);
                    if (TextUtils.isEmpty(str5)) {
                        str4 = "null";
                    } else {
                        str4 = str5;
                    }
                    objArr[1] = str4;
                    objArr[2] = Integer.valueOf(i4);
                    AVMDLLog.d("AVMDLDNSParserBridge", C16880lQ.LLLZI(locale, "receive completion code:%d result:%s type:%d", objArr));
                    if (TextUtils.isEmpty(str5) && AVMDLDNSParser.getIntValue(5) == 1) {
                        AVMDLLog.d("AVMDLDNSParserBridge", "pare result is null, try get backupip");
                        AVMDLDNSInfo backUpIp = IPCache.getInstance().getBackUpIp(str);
                        if (backUpIp != null) {
                            str5 = backUpIp.mIpList;
                            i4 = backUpIp.mType;
                            AVMDLLog.d("AVMDLDNSParserBridge", C16880lQ.LLLZI(locale, "get backup ip, result:%s type:%d", new Object[]{str5, Integer.valueOf(i4)}));
                            j2 = 0;
                        }
                    }
                    this.ipList = str5;
                    this.isFinish = true;
                    long j3 = this.handle;
                    if (j3 != 0) {
                        if (i3 == 2) {
                            v2Usable = true;
                            _notifyParserResultV2(j3, str, str5, j2, str3, i4);
                        } else {
                            v2Usable = false;
                            _notifyParserResult(j3, str, str5, j2, str3);
                        }
                    }
                } else {
                    AVMDLLog.d("AVMDLDNSParserBridge", C16880lQ.LLLZI(Locale.US, "has finished not nedd cur completion code:%d result:%s expiredTime:%d", new Object[]{Integer.valueOf(i), str5, Long.valueOf(j2)}));
                }
            } catch (UnsatisfiedLinkError e) {
                AVMDLLog.d("AVMDLDNSParserBridge", e.toString());
                if (v2Usable) {
                    v2Usable = false;
                }
                this.isFinish = false;
            }
        } finally {
            this.lock.unlock();
        }
    }
}
