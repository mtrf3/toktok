package com.bytedance.android.live.network.interceptors;

import X.C31012CFc;
import X.C64797Pbt;
import X.C76273Twb;
import X.EJ6;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveTimeNtpOpt;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NtpTimeInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        String str;
        long j;
        long j2;
        String str2;
        String str3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        System.currentTimeMillis();
        Request request = ((F7S) fbz).LIZJ;
        C64797Pbt<?> LIZ = ((F7S) fbz).LIZ(request);
        try {
            List<EJ6> list = LIZ.LIZ.LIZLLL;
            if (list == null) {
                str = "";
                j = 0;
                j2 = 0;
            } else {
                str = "";
                j = 0;
                j2 = 0;
                for (EJ6 ej6 : list) {
                    o.LJII(ej6, "null cannot be cast to non-null type com.bytedance.retrofit2.client.Header");
                    String str4 = ej6.LIZ;
                    String value = ej6.LIZIZ;
                    if (ujb.o.LJJJJIZL("webcast-ntp-t2", str4, true)) {
                        o.LJIIIIZZ(value, "value");
                        j = CastLongProtector.parseLong(value);
                    } else if (ujb.o.LJJJJIZL("webcast-ntp-t3", str4, true)) {
                        o.LJIIIIZZ(value, "value");
                        j2 = CastLongProtector.parseLong(value);
                    } else if (ujb.o.LJJJJIZL("X-Tt-Logid", str4, true)) {
                        o.LJIIIIZZ(value, "value");
                        str = value;
                    }
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = ((elapsedRealtime2 - elapsedRealtime) - (j2 - j)) / 2;
            if (j > 0 && j2 > 0) {
                if (request == null || (str3 = request.getPath()) == null) {
                    str3 = "";
                }
                C76273Twb.LIZIZ(j2, j3, str3, str);
            }
            LiveTimeNtpOpt liveTimeNtpOpt = LiveTimeNtpOpt.INSTANCE;
            if (liveTimeNtpOpt.getValue().enableHttp && j > 0 && j2 > 0 && j3 < liveTimeNtpOpt.getValue().httpDelayThresholdForNTP) {
                if (request == null || (str2 = request.getPath()) == null) {
                    str2 = "";
                }
                C31012CFc.LJIIJ(j2, elapsedRealtime2, currentTimeMillis, str2, j3);
            }
        } catch (Exception unused) {
        }
        return LIZ;
    }
}
