package com.ss.bduploader;

import X.C16880lQ;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.bduploader.net.BDUploadDNSInfo;
import com.ss.bduploader.net.BDUploadDNSParser;
import com.ss.bduploader.net.BDUploadDNSParserListener;
import com.ss.bduploader.net.BDUploadThreadPool;
import com.ss.bduploader.net.HTTPDNS;
import com.ss.bduploader.net.IPCache;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes9.dex */
public class BDUploadResolver implements BDUploadDNSParserListener {
    public static int HOST_MAX_CACHE_TIME = 60000;
    public static volatile int mDNSVersion = 1;
    public static volatile int mIsUseTTnetDNS;
    public String mError;
    public Future mFuture;
    public HostInfo mHostInfo;
    public volatile String mHostName;
    public volatile String[] mIPStr;
    public volatile boolean mRet;
    public Thread mThread;
    public int mUseDNSType = mDNSVersion;
    public static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public static int mEnableThreadPool = 1;

    /* loaded from: classes9.dex */
    public static class HostInfo {
        public String ip;
        public long time;
    }

    /* loaded from: classes9.dex */
    public static class ParserHost implements Runnable {
        public String mHostName;
        public BDUploadResolver mResolver;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_bduploader_BDUploadResolver$ParserHost_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:1|(3:3|4|(2:8|(2:10|11)(2:13|14)))|17|18|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
        
            X.C16880lQ.LLLLIIL(r0);
            r5.mResolver.mError = r0.getMessage();
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void com_ss_bduploader_BDUploadResolver$ParserHost__run$___twin___() {
            /*
                r5 = this;
                int r0 = com.ss.bduploader.BDUploadResolver.mIsUseTTnetDNS
                r3 = 0
                r2 = 0
                r4 = 1
                if (r0 != r4) goto L1d
                java.lang.String r0 = r5.mHostName     // Catch: java.lang.Throwable -> L1d
                java.util.List r1 = com.ss.bduploader.TTNetWrapper.dnsLookup(r0)     // Catch: java.lang.Throwable -> L1d
                if (r1 == 0) goto L1d
                java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)     // Catch: java.lang.Throwable -> L1d
                if (r0 == 0) goto L1d
                java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)     // Catch: java.lang.Throwable -> L1d
                java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch: java.lang.Throwable -> L1d
                r3 = r0
                goto L30
            L1d:
                java.lang.String r0 = r5.mHostName     // Catch: java.net.UnknownHostException -> L24
                java.net.InetAddress r3 = java.net.InetAddress.getByName(r0)     // Catch: java.net.UnknownHostException -> L24
                goto L30
            L24:
                r0 = move-exception
                X.C16880lQ.LLLLIIL(r0)
                com.ss.bduploader.BDUploadResolver r1 = r5.mResolver
                java.lang.String r0 = r0.getMessage()
                r1.mError = r0
            L30:
                if (r3 == 0) goto L5f
                java.lang.String r3 = r3.getHostAddress()
                com.ss.bduploader.BDUploadResolver r1 = r5.mResolver
                java.lang.String[] r0 = new java.lang.String[r4]
                r1.mIPStr = r0
                com.ss.bduploader.BDUploadResolver r0 = r5.mResolver
                java.lang.String[] r0 = r0.mIPStr
                r0[r2] = r3
                com.ss.bduploader.BDUploadResolver$HostInfo r2 = new com.ss.bduploader.BDUploadResolver$HostInfo
                r2.<init>()
                long r0 = java.lang.System.currentTimeMillis()
                r2.time = r0
                r2.ip = r3
                java.lang.String r0 = r5.mHostName
                com.ss.bduploader.BDUploadResolver.putHostInfo(r0, r2)
                long r0 = java.lang.System.currentTimeMillis()
                r2.time = r0
                com.ss.bduploader.BDUploadResolver r0 = r5.mResolver
                r0.mRet = r4
            L5e:
                return
            L5f:
                com.ss.bduploader.BDUploadResolver r0 = r5.mResolver
                r0.mRet = r4
                goto L5e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bduploader.BDUploadResolver.ParserHost.com_ss_bduploader_BDUploadResolver$ParserHost__run$___twin___():void");
        }

        public static void com_ss_bduploader_BDUploadResolver$ParserHost_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ParserHost parserHost) {
            boolean LIZ;
            try {
                parserHost.com_ss_bduploader_BDUploadResolver$ParserHost__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public ParserHost(BDUploadResolver bDUploadResolver, String str) {
            this.mResolver = bDUploadResolver;
            this.mHostName = str;
        }
    }

    private native void _notifyParserResult(String str, String str2, long j, String str3);

    public void freeAddress() {
        if (this.mUseDNSType == 1) {
            Future future = this.mFuture;
            if (future != null) {
                try {
                    future.cancel(true);
                    this.mFuture = null;
                    BDUploadLog.d("BDUploadResolver", "----cancel parser thread");
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            Thread thread = this.mThread;
            if (thread != null) {
                try {
                    thread.interrupt();
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        if (this.mUseDNSType == 2) {
            try {
                BDUploadDNSParser.getInstance().removeHost(this.mHostName, this);
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
    }

    public String getAddress() {
        if (this.mRet && this.mIPStr != null && this.mIPStr[0] != null) {
            return this.mIPStr[0];
        }
        return null;
    }

    public int isSuccess() {
        if (!this.mRet) {
            return 0;
        }
        if (this.mIPStr != null && this.mIPStr[0] != null) {
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008f -> B:26:0x0028). Please report as a decompilation issue!!! */
    private void getAddressInfoVersion_1(String str) {
        this.mHostName = str;
        if (str != null && str.length() >= 1 && !"".equals(str)) {
            if (isIP(this.mHostName)) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = this.mHostName;
                this.mRet = true;
                return;
            }
            Hashtable<String, HostInfo> hashtable = mCacheHosts;
            HostInfo hostInfo = hashtable.get(str);
            this.mHostInfo = hostInfo;
            if (hostInfo != null) {
                if (hostInfo.ip != null && System.currentTimeMillis() - this.mHostInfo.time < HOST_MAX_CACHE_TIME) {
                    this.mIPStr = new String[1];
                    this.mIPStr[0] = this.mHostInfo.ip;
                    this.mRet = true;
                    return;
                }
                hashtable.remove(str);
                this.mHostInfo = null;
            }
            try {
                if (mEnableThreadPool > 0) {
                    BDUploadLog.d("BDUploadResolver", "----enable dns parser thread pool");
                    this.mFuture = BDUploadThreadPool.addExecuteTask(new ParserHost(this, this.mHostName));
                } else {
                    BDUploadLog.d("BDUploadResolver", "----disable dns parser thread pool");
                    PthreadThread pthreadThread = new PthreadThread(new ParserHost(this, this.mHostName), "BDUploadResolver");
                    this.mThread = pthreadThread;
                    pthreadThread.start();
                }
            } catch (Exception e) {
                this.mRet = true;
                this.mError = e.getMessage();
            }
            return;
        }
        this.mRet = true;
    }

    private void getAddressInfoVersion_2(String str) {
        BDUploadLog.d("BDUploadResolver", "----add host to parser");
        this.mHostName = str;
        BDUploadDNSInfo bDUploadDNSInfo = IPCache.getInstance().get(str);
        if (bDUploadDNSInfo != null && bDUploadDNSInfo.mIpList != null) {
            long currentTimeMillis = System.currentTimeMillis();
            BDUploadLog.d("BDUploadResolver", C16880lQ.LLLZ("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(bDUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
            if (bDUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                BDUploadLog.d("BDUploadResolver", C16880lQ.LLLZ("has expired try call parse:", new Object[0]));
                BDUploadDNSParser.getInstance().addHost(str, null);
            }
            String[] split = bDUploadDNSInfo.mIpList.split(",");
            if (split != null && split.length > 0) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = split[0];
                this.mRet = true;
                BDUploadLog.d("BDUploadResolver", C16880lQ.LLLZ("get result from cache suc, ip:%s ", new Object[]{split[0]}));
            }
        }
        if (!this.mRet) {
            BDUploadLog.d("BDUploadResolver", "****add host to parser");
            BDUploadDNSParser.getInstance().addHost(str, this);
        }
    }

    public static final boolean isIP(String str) {
        if (str.length() >= 7 && str.length() <= 15) {
            return PatternProtector.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
        }
        if (str.charAt(0) != '[' || str.charAt(str.length() - 1) != ']') {
            return false;
        }
        return true;
    }

    public static void setEnableDNSParserThreadPool(int i) {
        mEnableThreadPool = i;
    }

    public static void setEnableTTNetDNS(int i) {
        mIsUseTTnetDNS = i;
    }

    public void getAddressInfo(String str) {
        int i = this.mUseDNSType;
        if (i != 1) {
            if (i != 2) {
                getAddressInfoVersion_1(str);
                return;
            } else {
                getAddressInfoVersion_2(str);
                return;
            }
        }
        getAddressInfoVersion_1(str);
    }

    public static synchronized void putHostInfo(String str, HostInfo hostInfo) {
        synchronized (BDUploadResolver.class) {
            long currentTimeMillis = System.currentTimeMillis();
            Hashtable<String, HostInfo> hashtable = mCacheHosts;
            String str2 = null;
            if (hashtable.size() > 128) {
                Iterator<Map.Entry<String, HostInfo>> it = hashtable.entrySet().iterator();
                HostInfo hostInfo2 = null;
                while (it.hasNext()) {
                    HostInfo value = it.next().getValue();
                    str2 = it.next().getKey();
                    if (value != null) {
                        long j = value.time;
                        if (j < currentTimeMillis) {
                            hostInfo2 = value;
                            currentTimeMillis = j;
                        }
                    }
                }
                if (hostInfo2 != null && str2 != null) {
                    mCacheHosts.remove(str2);
                }
            }
            mCacheHosts.put(str, hostInfo);
        }
    }

    public static void setDNSServer(String str, String str2) {
        HTTPDNS.setDNSServerHost(str, str2);
    }

    public static void setDNSType(int i, int i2, int i3, int i4, int i5) {
        if (i != 1 && i != 2) {
            return;
        }
        BDUploadDNSParser.setIntValue(0, i2);
        BDUploadDNSParser.setIntValue(1, i3);
        BDUploadDNSParser.setIntValue(3, i4);
        BDUploadDNSParser.setIntValue(2, i5);
        mDNSVersion = i;
    }

    @Override // com.ss.bduploader.net.BDUploadDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3) {
        String[] split;
        BDUploadLog.d("BDUploadResolver", C16880lQ.LLLZ("notify result host:%s iplist:%s ", new Object[]{str, str2}));
        if (!this.mRet) {
            if (str2 != null && str != null && str.equals(this.mHostName) && (split = str2.split(",")) != null && split.length > 0) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = split[0];
            }
            this.mRet = true;
        }
    }
}
