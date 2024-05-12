package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.dataChannel.ServerTimeGapChangeEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveTimeNtpOpt;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.CFc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31012CFc {
    public static final SimpleDateFormat LIZ;
    public static volatile long LIZIZ;
    public static volatile long LIZJ;

    static {
        new SimpleDateFormat("yyyy-MM-dd");
        LIZ = new SimpleDateFormat("HH:mm:dd.SSS");
        LIZIZ = 0L;
        LIZJ = 0L;
    }

    public static long LIZJ() {
        if (LIZJ <= 0) {
            return LIZIZ();
        }
        return SystemClock.elapsedRealtime() + LIZJ;
    }

    public static long LIZIZ() {
        return System.currentTimeMillis() + LIZIZ;
    }

    public static void LIZLLL(java.util.Map map) {
        String LJFF = i0.LJFF("livesdk_ntp_", "server_time");
        ((HashMap) map).put("event_name", LJFF);
        C0K2.LJIILL(0, 1, LJFF, map);
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_ntp", map);
    }

    public static String LJ(Long l) {
        return new SimpleDateFormat("h:mm a", Locale.US).format(new Date(l.longValue()));
    }

    public static int LJFF(int i) {
        boolean z;
        if (i <= 0) {
            return 1;
        }
        if (i % 60 > 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = i / 60;
        if (z) {
            return i2 + 1;
        }
        return i2;
    }

    public static String LJI(int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            return "";
        }
        long j = i / 3600;
        long j2 = i - (3600 * j);
        long j3 = j2 / 60;
        long j4 = j2 - (60 * j3);
        if (j < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j);
        sb.append(":");
        if (j3 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j3);
        sb.append(":");
        if (j4 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j4);
        return sb.toString();
    }

    public static String LJII(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        if (j2 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j2);
        sb.append(":");
        if (j3 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j3);
        return sb.toString();
    }

    public static String LJIIIIZZ(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        if (j2 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j2);
        sb.append(":");
        if (j3 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j3);
        return sb.toString();
    }

    public static String LJIIIZ(long j) {
        StringBuilder sb = new StringBuilder();
        if (j <= 0) {
            return "";
        }
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        if (j2 > 0) {
            if (j2 < 10) {
                sb.append(CardStruct.IStatusCode.DEFAULT);
            }
            sb.append(j2);
            sb.append(":");
        }
        if (j4 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j4);
        sb.append(":");
        if (j5 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j5);
        return sb.toString();
    }

    public static void LJIIJJI(long j) {
        if (LiveTimeNtpOpt.INSTANCE.getValue().enableWS) {
            LIZIZ = j;
            LIZJ = LIZIZ() - SystemClock.elapsedRealtime();
            DataChannelGlobal.LJLJJI.sv0(ServerTimeGapChangeEvent.class, Long.valueOf(j));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(j);
            LIZ2.append(" ==>");
            LIZ2.append(LIZJ);
            C0NB.LIZIZ("Time Util", X1D.LIZIZ(LIZ2));
            HashMap hashMap = new HashMap();
            StringBuilder LIZ3 = X1D.LIZ();
            hashMap.put("gap_current", C0H1.LIZJ(LIZ3, LIZIZ, "", LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            hashMap.put("gap_elapse", C0H1.LIZJ(LIZ4, LIZJ, "", LIZ4));
            hashMap.put("source", "msg");
            LIZLLL(hashMap);
        }
    }

    public static String LIZ(Long l, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        return new SimpleDateFormat(str).format(new Date(l.longValue() * 1000));
    }

    public static void LJIIJ(long j, long j2, long j3, String str, long j4) {
        long j5 = j + j4;
        if (j5 > 0) {
            LIZIZ = j5 - j3;
            LIZJ = j5 - j2;
            DataChannelGlobal.LJLJJI.sv0(ServerTimeGapChangeEvent.class, Long.valueOf(LIZIZ));
            HashMap hashMap = new HashMap();
            StringBuilder LIZ2 = X1D.LIZ();
            hashMap.put("gap_current", C0H1.LIZJ(LIZ2, LIZIZ, "", LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            hashMap.put("gap_elapse", C0H1.LIZJ(LIZ3, LIZJ, "", LIZ3));
            hashMap.put("path", str);
            hashMap.put("source", "http");
            LIZLLL(hashMap);
        }
    }
}
