package X;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import defpackage.a1;
import java.util.HashMap;

/* renamed from: X.IoR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47739IoR {
    public final InterfaceC47747IoZ LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public long LJ;
    public AbstractC47745IoX LJFF;

    public C47739IoR(C47738IoQ c47738IoQ) {
        this.LIZ = c47738IoQ;
    }

    public final void LIZ(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("retry fetch, count = ");
        LIZ.append(this.LJ);
        X1D.LIZIZ(LIZ);
        if (this.LIZLLL > 10) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("fetch fail, module = ", str, ", retry times = ");
            LIZIZ.append(this.LIZLLL);
            X1D.LIZIZ(LIZIZ);
            InterfaceC47747IoZ interfaceC47747IoZ = this.LIZ;
            if (interfaceC47747IoZ != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fetch fail. try times = ");
                LIZ2.append(this.LIZLLL);
                LIZ2.append(", max = ");
                LIZ2.append(10);
                ((C47738IoQ) interfaceC47747IoZ).LIZ(-999, X1D.LIZIZ(LIZ2), null, null, null);
            }
            this.LIZLLL = 0;
            return;
        }
        new PthreadTimer("tting/Fetcher").schedule(new C47743IoV(this, str, str2), 5000L);
    }

    public final void LIZIZ(String str, String str2) {
        String str3;
        long j = this.LJ;
        if (j >= Long.MAX_VALUE) {
            this.LJ = 1L;
        } else {
            this.LJ = j + 1;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("start to fetch, module = ", str, ", fetch count = ");
        LIZIZ.append(this.LJ);
        X1D.LIZIZ(LIZIZ);
        if (this.LJFF == null) {
            InterfaceC47747IoZ interfaceC47747IoZ = this.LIZ;
            if (interfaceC47747IoZ != null) {
                ((C47738IoQ) interfaceC47747IoZ).LIZ(-996, "netClient is null", null, null, null);
                return;
            }
            return;
        }
        String str4 = C47566Ile.LIZLLL;
        if (TextUtils.isEmpty(str4)) {
            str3 = null;
        } else {
            str3 = C47566Ile.LIZJ;
            if (str4.equals("us-east-1")) {
                str3 = C47566Ile.LIZ;
            } else if (str4.equals("ap-singapore-1")) {
                str3 = C47566Ile.LIZIZ;
            } else if (str4.equals("cn-north-1")) {
                str3 = C47566Ile.LIZJ;
            }
        }
        if (TextUtils.isEmpty(str3)) {
            InterfaceC47747IoZ interfaceC47747IoZ2 = this.LIZ;
            if (interfaceC47747IoZ2 != null) {
                ((C47738IoQ) interfaceC47747IoZ2).LIZ(-998, "host is null", null, null, null);
                return;
            }
            return;
        }
        this.LIZLLL++;
        HashMap LIZ = C45243HpH.LIZ("caller_name", "VideoCloud", "device_platform", "android");
        LIZ.put("os_version", Build.VERSION.RELEASE);
        LIZ.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(this.LIZJ);
        LIZ.put("config_version", X1D.LIZIZ(LIZ2));
        if (!LIZ.containsKey("device_brand")) {
            LIZ.put("device_brand", Build.BRAND);
        }
        if (!LIZ.containsKey("device_type")) {
            LIZ.put("device_type", Build.MODEL.toLowerCase());
        }
        if (!TextUtils.isEmpty(str) && !str.equals("all")) {
            LIZ.put("module", str);
        }
        if (this.LIZIZ) {
            LIZ.put("debug", "1");
        }
        if (!TextUtils.isEmpty(str2)) {
            LIZ.put("config_key", str2);
        }
        if (C47566Ile.LIZ(C47566Ile.LJ) != null) {
            LIZ.putAll(C47566Ile.LIZ(C47566Ile.LJ));
        }
        if (C47566Ile.LIZ(C47566Ile.LJFF) != null) {
            LIZ.putAll(C47566Ile.LIZ(C47566Ile.LJFF));
        }
        String LJ = a1.LJ("https://", str3, "/vod/settings/v1");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("param = ");
        LIZ3.append(LIZ.toString());
        X1D.LIZIZ(LIZ3);
        AbstractC47745IoX abstractC47745IoX = this.LJFF;
        C47740IoS c47740IoS = new C47740IoS(this, str, str2);
        C47744IoW c47744IoW = (C47744IoW) abstractC47745IoX;
        synchronized (c47744IoW) {
            C47735IoN c47735IoN = c47744IoW.LIZ;
            if (c47735IoN.LJI == null) {
                c47735IoN.LJI = new C47985IsP();
            }
            c47744IoW.LIZ.getClass();
            String LIZ4 = C47735IoN.LIZ(LJ, LIZ);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("setting query ");
            LIZ5.append(LIZ4);
            TTVideoEngineLog.d("VodSettings", X1D.LIZIZ(LIZ5));
            c47744IoW.LIZ.LJI.LIZLLL(LIZ4, null, new C47741IoT(c47740IoS));
        }
    }
}
