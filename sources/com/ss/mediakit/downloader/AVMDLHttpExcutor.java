package com.ss.mediakit.downloader;

import X.C03880Dg;
import X.C16880lQ;
import X.C1FJ;
import X.C39519Ff9;
import X.C61845OOz;
import X.C64587PWl;
import X.C64598PWw;
import X.C64600PWy;
import X.C64601PWz;
import X.C64605PXd;
import X.C64606PXe;
import X.C64618PXq;
import X.C65300Pk0;
import X.EnumC64572PVw;
import X.InterfaceC48133Iun;
import X.X1D;
import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLLog;
import defpackage.i0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* loaded from: classes9.dex */
public class AVMDLHttpExcutor {
    public static C64600PWy okHttpClient;

    public static C64598PWw com_ss_mediakit_downloader_AVMDLHttpExcutor_okhttp3_Call_execute(InterfaceC48133Iun interfaceC48133Iun) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", interfaceC48133Iun, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "-8609052126760413432"));
        return LIZJ.LIZ ? (C64598PWw) LIZJ.LIZIZ : interfaceC48133Iun.execute();
    }

    public static C64600PWy com_ss_mediakit_downloader_AVMDLHttpExcutor_okhttp3_OkHttpClient$Builder_build(C64601PWz c64601PWz) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-8609052126760413432"));
        return LIZJ.LIZ ? (C64600PWy) LIZJ.LIZIZ : c64601PWz.build();
    }

    public static synchronized C64600PWy getOkHttpClient() {
        C64600PWy c64600PWy;
        long j;
        long j2;
        synchronized (AVMDLHttpExcutor.class) {
            if (okHttpClient == null) {
                AVMDLDataLoaderConfigure config = AVMDLDataLoader.getInstance().getConfig();
                long j3 = 10000;
                if (config != null) {
                    int i = config.mOpenTimeOut;
                    if (i > 0) {
                        j2 = i * 1000;
                    } else {
                        j2 = 10000;
                    }
                    int i2 = config.mRWTimeOut;
                    if (i2 > 0) {
                        j3 = i2 * 1000;
                    }
                    j = j3;
                    j3 = j2;
                } else {
                    j = 10000;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("connect timeout:");
                LIZ.append(j3);
                LIZ.append(" rwtimeout:");
                LIZ.append(j);
                AVMDLLog.d("AVMDLHttpExcutor", X1D.LIZIZ(LIZ));
                C64601PWz c64601PWz = new C64601PWz();
                c64601PWz.protocols(Collections.singletonList(EnumC64572PVw.HTTP_1_1));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c64601PWz.connectTimeout(j3, timeUnit);
                c64601PWz.readTimeout(j, timeUnit);
                c64601PWz.writeTimeout(j, timeUnit);
                okHttpClient = com_ss_mediakit_downloader_AVMDLHttpExcutor_okhttp3_OkHttpClient$Builder_build(c64601PWz);
            }
            c64600PWy = okHttpClient;
        }
        return c64600PWy;
    }

    public static synchronized void setOkHttpClient(C64600PWy c64600PWy) {
        synchronized (AVMDLHttpExcutor.class) {
            if (okHttpClient == null) {
                okHttpClient = c64600PWy;
                AVMDLLog.d("AVMDLHttpExcutor", "cur client null allow set");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set custom client:");
            LIZ.append(c64600PWy);
            AVMDLLog.d("AVMDLHttpExcutor", X1D.LIZIZ(LIZ));
        }
    }

    public static C64606PXe toOkHttpHeaders(AVMDLRequest aVMDLRequest) {
        C64605PXd c64605PXd = new C64605PXd();
        HashMap<String, String> hashMap = aVMDLRequest.headers;
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("custom header key:");
                LIZ.append((String) C1FJ.LIZJ(LIZ, entry.getKey(), "  value:", entry));
                AVMDLLog.d("AVMDLHttpExcutor", X1D.LIZIZ(LIZ));
                c64605PXd.LIZ(entry.getKey(), entry.getValue());
            }
        }
        String buildRangeHeader = buildRangeHeader(aVMDLRequest.reqOff, aVMDLRequest.size);
        if (!TextUtils.isEmpty(buildRangeHeader)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("range str: ");
            LIZ2.append(buildRangeHeader);
            AVMDLLog.d("AVMDLHttpExcutor", X1D.LIZIZ(LIZ2));
            c64605PXd.LIZ("Range", buildRangeHeader);
        }
        c64605PXd.LIZ("Accept-Encoding", "identity");
        return new C64606PXe(c64605PXd);
    }

    public static String buildRangeHeader(long j, long j2) {
        String formRangeStrBySize = formRangeStrBySize(j, j2);
        if (TextUtils.isEmpty(formRangeStrBySize)) {
            return "";
        }
        return i0.LJFF("bytes=", formRangeStrBySize);
    }

    public static AVMDLResponse excute(AVMDLRequest aVMDLRequest, int i) {
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(aVMDLRequest.urls[i]);
        c64618PXq.LJ("GET", null);
        c64618PXq.LIZJ = toOkHttpHeaders(aVMDLRequest).LJI();
        C64600PWy okHttpClient2 = getOkHttpClient();
        Request LIZIZ = c64618PXq.LIZIZ();
        okHttpClient2.getClass();
        C64587PWl LIZJ = C64587PWl.LIZJ(okHttpClient2, LIZIZ, false);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C64598PWw com_ss_mediakit_downloader_AVMDLHttpExcutor_okhttp3_Call_execute = com_ss_mediakit_downloader_AVMDLHttpExcutor_okhttp3_Call_execute(LIZJ);
            long currentTimeMillis2 = System.currentTimeMillis();
            aVMDLRequest.mCurlUrlIndex = i;
            AVMDLLog.d("AVMDLHttpExcutor", C16880lQ.LLLZI(Locale.US, "http open cost time:%d url:%s", new Object[]{Long.valueOf(currentTimeMillis2 - currentTimeMillis), aVMDLRequest.urls[i]}));
            return new AVMDLResponse(aVMDLRequest, com_ss_mediakit_downloader_AVMDLHttpExcutor_okhttp3_Call_execute, LIZJ);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request exception is ");
            LIZ.append(e.getLocalizedMessage());
            AVMDLLog.e("AVMDLHttpExcutor", X1D.LIZIZ(LIZ));
            throw e;
        }
    }

    public static String formRangeStrByPos(long j, long j2) {
        if (j >= 0) {
            if (j2 > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(j);
                LIZ.append("-");
                LIZ.append(j2);
                return X1D.LIZIZ(LIZ);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(j);
            LIZ2.append("-");
            return X1D.LIZIZ(LIZ2);
        }
        if (j2 > 0) {
            return C61845OOz.LIZ("-", j2);
        }
        return "";
    }

    public static String formRangeStrBySize(long j, long j2) {
        long j3;
        if (j2 > 0) {
            j3 = (j2 + j) - 1;
        } else {
            j3 = -1;
        }
        return formRangeStrByPos(j, j3);
    }
}
