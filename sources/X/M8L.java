package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8L {
    public static final void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        C36922EeM.LIZLLL(6, "fav_trace", msg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.lang.String r7, java.lang.Throwable r8) {
        /*
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = r8 instanceof X.C57300MeG
            if (r0 == 0) goto Lf
            X.MeG r8 = (X.C57300MeG) r8
            java.lang.Throwable r8 = r8.getE()
        Lf:
            boolean r0 = r8 instanceof X.C38333F2r
            java.lang.String r6 = "net"
            java.lang.String r5 = " from "
            java.lang.String r2 = "failed request api "
            java.lang.String r4 = "fav_trace"
            r3 = 6
            r1 = 0
            if (r0 == 0) goto L60
            java.lang.String r0 = ", resp is "
            java.lang.StringBuilder r1 = X.C06540Nm.LIZLLL(r2, r7, r5, r6, r0)
            X.F2r r8 = (X.C38333F2r) r8
            java.lang.String r0 = r8.getResponse()
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            X.C36922EeM.LIZLLL(r3, r4, r2)
            java.text.DateFormat r1 = java.text.SimpleDateFormat.getInstance()
            boolean r0 = r1 instanceof java.text.SimpleDateFormat
            if (r0 == 0) goto L58
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1
            if (r1 == 0) goto L58
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            r1.applyPattern(r0)
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r1.setTimeZone(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r1 = r1.format(r0)
            if (r1 != 0) goto L5a
        L58:
            java.lang.String r1 = ""
        L5a:
            X.0M6<java.lang.String, java.lang.String> r0 = X.C203657yz.LIZIZ
            r0.LIZJ(r1, r2)
        L5f:
            return
        L60:
            java.lang.String r0 = ", reason is "
            java.lang.StringBuilder r0 = X.C06540Nm.LIZLLL(r2, r7, r5, r6, r0)
            if (r8 == 0) goto L6c
            java.lang.String r1 = X.V0N.LJJIJL(r8)
        L6c:
            X.C1FJ.LJFF(r0, r1, r0, r3, r4)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M8L.LIZIZ(java.lang.String, java.lang.Throwable):void");
    }

    public static final void LIZJ(String url, String str, BaseResponse baseResponse) {
        Integer num;
        String str2;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("success request api ");
        LIZ.append(url);
        LIZ.append(" from ");
        LIZ.append(str);
        LIZ.append(", status code is ");
        String str3 = null;
        if (baseResponse != null) {
            num = Integer.valueOf(baseResponse.status_code);
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", status msg is ");
        if (baseResponse != null) {
            str2 = baseResponse.status_msg;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(", log id is ");
        if (baseResponse != null && (serverTimeExtra = baseResponse.extra) != null) {
            str3 = serverTimeExtra.logid;
        }
        C1FJ.LJFF(LIZ, str3, LIZ, 6, "fav_trace");
    }
}
