package com.ss.android.ugc.aweme.net.interceptor;

import X.C36910EeA;
import X.C64797Pbt;
import X.C65436PmC;
import X.C65441PmH;
import X.EJ6;
import X.PYM;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.sec.SecApiImpl;

/* loaded from: classes12.dex */
public final class ResponseExtraParser {

    /* loaded from: classes12.dex */
    public static class OldErrorModel {
        public Data data;

        /* loaded from: classes12.dex */
        public static class Data {
            public String description;
            public int error_code;
            public String verify_center_decision_conf;
            public String verify_center_secondary_decision_conf;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0040. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C65441PmH LIZIZ(java.lang.String r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r8 = 0
            if (r0 == 0) goto L8
            return r8
        L8:
            X.PlN r5 = new X.PlN     // Catch: java.io.IOException -> Ld2
            java.io.StringReader r0 = new java.io.StringReader     // Catch: java.io.IOException -> Ld2
            r0.<init>(r9)     // Catch: java.io.IOException -> Ld2
            r5.<init>(r0)     // Catch: java.io.IOException -> Ld2
            X.PlO r1 = r5.LJJIJIL()     // Catch: java.lang.Throwable -> Lcd
            X.PlO r0 = X.EnumC65386PlO.NULL     // Catch: java.lang.Throwable -> Lcd
            if (r1 != r0) goto L21
            r5.LJJIIJ()     // Catch: java.lang.Throwable -> Lcd
            r5.close()     // Catch: java.io.IOException -> L20
        L20:
            return r8
        L21:
            r0 = 1
            r5.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> Lcd
            X.PmC r4 = new X.PmC     // Catch: java.lang.Throwable -> Lcd
            r4.<init>()     // Catch: java.lang.Throwable -> Lcd
            r5.LIZIZ()     // Catch: java.lang.Throwable -> Lcd
            r1 = -1
            r7 = 3
            r6 = 0
        L30:
            boolean r0 = r5.LJIIJJI()     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto Lbf
            if (r7 <= 0) goto Lbf
            java.lang.String r3 = r5.LJJ()     // Catch: java.lang.Throwable -> Lcd
            int r0 = r3.hashCode()     // Catch: java.lang.Throwable -> Lcd
            switch(r0) {
                case -891699686: goto L9c;
                case 96965648: goto L74;
                case 248339892: goto L65;
                case 954925063: goto L50;
                case 1635686852: goto L47;
                default: goto L43;
            }     // Catch: java.lang.Throwable -> Lcd
        L43:
            r5.LJJJJ()     // Catch: java.lang.Throwable -> Lcd
            goto L30
        L47:
            java.lang.String r0 = "error_code"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L43
            goto La4
        L50:
            java.lang.String r0 = "message"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L43
            java.lang.String r3 = r5.LJJIIZI()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "error"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L30
            goto Laf
        L65:
            java.lang.String r0 = "status_msg"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L43
            java.lang.String r0 = r5.LJJIIZI()     // Catch: java.lang.Throwable -> Lcd
            r4.LIZIZ = r0     // Catch: java.lang.Throwable -> Lcd
            goto Lb6
        L74:
            java.lang.String r0 = "extra"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L43
            r5.LIZIZ()     // Catch: java.lang.Throwable -> Lcd
        L7f:
            boolean r0 = r5.LJIIJJI()     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto Lb1
            java.lang.String r3 = "now"
            java.lang.String r0 = r5.LJJ()     // Catch: java.lang.Throwable -> Lcd
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L98
            long r1 = r5.LJIJJ()     // Catch: java.lang.Throwable -> Lcd
            int r7 = r7 + (-1)
            goto L7f
        L98:
            r5.LJJJJ()     // Catch: java.lang.Throwable -> Lcd
            goto L7f
        L9c:
            java.lang.String r0 = "status_code"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L43
        La4:
            int r0 = r4.LIZ     // Catch: java.lang.Throwable -> Lcd
            if (r0 > 0) goto Lba
            int r0 = r5.LJIJI()     // Catch: java.lang.Throwable -> Lcd
            r4.LIZ = r0     // Catch: java.lang.Throwable -> Lcd
            goto Lb6
        Laf:
            r6 = 1
            goto L30
        Lb1:
            r5.LJFF()     // Catch: java.lang.Throwable -> Lcd
            goto L30
        Lb6:
            int r7 = r7 + (-1)
            goto L30
        Lba:
            r5.LJJJJ()     // Catch: java.lang.Throwable -> Lcd
            goto L30
        Lbf:
            if (r6 == 0) goto Lc4
            LIZ(r9, r4)     // Catch: java.lang.Throwable -> Lcd
        Lc4:
            X.PmH r0 = new X.PmH     // Catch: java.lang.Throwable -> Lcd
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> Lcd
            r5.close()     // Catch: java.io.IOException -> Lcc
        Lcc:
            return r0
        Lcd:
            if (r5 == 0) goto Ld2
            r5.close()
        Ld2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.interceptor.ResponseExtraParser.LIZIZ(java.lang.String):X.PmH");
    }

    public static void LIZ(String str, C65436PmC c65436PmC) {
        int i;
        String str2;
        OldErrorModel oldErrorModel = (OldErrorModel) GsonProtectorUtils.fromJson(new Gson(), str, OldErrorModel.class);
        OldErrorModel.Data data = oldErrorModel.data;
        if (data == null) {
            i = 0;
        } else {
            i = data.error_code;
        }
        c65436PmC.LIZ = i;
        if (data == null) {
            str2 = null;
        } else {
            str2 = data.description;
        }
        c65436PmC.LIZIZ = str2;
        c65436PmC.LIZJ = null;
        if (data != null) {
            String str3 = data.verify_center_decision_conf;
            c65436PmC.LIZJ = str3;
            if (TextUtils.isEmpty(str3)) {
                c65436PmC.LIZJ = oldErrorModel.data.verify_center_secondary_decision_conf;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C65441PmH LIZJ(String str, C64797Pbt c64797Pbt) {
        C65441PmH c65441PmH = null;
        if (c64797Pbt == null) {
            return null;
        }
        T t = c64797Pbt.LIZIZ;
        if (t != 0) {
            long j = -1;
            if (t instanceof BaseResponse) {
                BaseResponse baseResponse = (BaseResponse) t;
                if (SecApiImpl.LIZ().isCaptchaUrl(str)) {
                    try {
                        return LIZIZ(PYM.LIZ(c64797Pbt.LIZ));
                    } catch (Exception unused) {
                    }
                }
                C65436PmC c65436PmC = new C65436PmC();
                c65436PmC.LIZ = baseResponse.status_code;
                c65436PmC.LIZIZ = baseResponse.status_msg;
                BaseResponse.ServerTimeExtra serverTimeExtra = baseResponse.extra;
                if (serverTimeExtra != null) {
                    j = serverTimeExtra.now;
                }
                return new C65441PmH(c65436PmC, j);
            }
            if (t instanceof String) {
                return LIZIZ(t.toString());
            }
            if (t instanceof FeedItemList) {
                FeedItemList feedItemList = (FeedItemList) t;
                C65436PmC c65436PmC2 = new C65436PmC();
                int i = feedItemList.status_code;
                if (i == 0) {
                    i = feedItemList.error_code;
                }
                c65436PmC2.LIZ = i;
                c65436PmC2.LIZIZ = feedItemList.status_msg;
                Extra extra = feedItemList.extra;
                if (extra != null) {
                    j = extra.now;
                }
                return new C65441PmH(c65436PmC2, j);
            }
        }
        C36910EeA c36910EeA = c64797Pbt.LIZ;
        if (c36910EeA == null || c36910EeA.LJ == null) {
            return null;
        }
        EJ6 LIZ = c36910EeA.LIZ("Transfer-Encoding");
        if (LIZ != null && "chunked".equalsIgnoreCase(LIZ.LIZIZ)) {
            return null;
        }
        try {
            System.currentTimeMillis();
            c65441PmH = LIZIZ(PYM.LIZ(c64797Pbt.LIZ));
            return c65441PmH;
        } catch (Throwable unused2) {
            return c65441PmH;
        }
    }
}
