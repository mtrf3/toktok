package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;

/* renamed from: X.4Gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106714Gt {
    public static final C106714Gt LIZ = new C106714Gt();

    public static int LIZ(C63540Owi c63540Owi) {
        EnumC106744Gw LIZ2;
        if (c63540Owi == null || (LIZ2 = c63540Owi.LIZ()) == null) {
            return -1;
        }
        int i = C106734Gv.LIZ[LIZ2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                int i2 = 0;
                if (i != 3) {
                    return 0;
                }
                String str = c63540Owi.LJJIIZ;
                if (str != null) {
                    try {
                        CheckMessage checkMessage = (CheckMessage) C62070OXq.LIZ(CheckMessage.class, str);
                        if (checkMessage != null) {
                            i2 = checkMessage.getStatusCode();
                        }
                    } catch (Exception unused) {
                    }
                }
                long j = c63540Owi.LJJIIJZLJL;
                if (i2 == 0 && j != -1) {
                    i2 = (int) j;
                }
                int i3 = c63540Owi.LJJIIZI;
                if (i2 == 0 && i3 != -1) {
                    return i3;
                }
                return i2;
            }
            return c63540Owi.LJJIJ;
        }
        return c63540Owi.LJJIJIIJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if (r7.put("sdk_metrics_valid", "1") == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(org.json.JSONObject r7, X.C63540Owi r8) {
        /*
            if (r8 != 0) goto L3
            return
        L3:
            long r4 = r8.LJJ
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L72
        Lb:
            java.lang.String r5 = "0"
            java.lang.String r4 = "sdk_metrics_valid"
            if (r8 == 0) goto L69
            java.lang.String r6 = "sdk_bs_stc"
            long r0 = r8.LIZIZ
            r7.put(r6, r0)
            java.lang.String r6 = "sdk_bs_sc"
            long r0 = r8.LJ
            r7.put(r6, r0)
            java.lang.String r6 = "sdk_bs_ncc"
            long r0 = r8.LJFF
            r7.put(r6, r0)
            java.lang.String r0 = "sdk_bs_fci"
            r7.put(r0, r5)
            java.lang.String r0 = "sdk_bs_fcic"
            r7.put(r0, r2)
            java.lang.String r2 = "sdk_bs_c"
            long r0 = r8.LJII
            r7.put(r2, r0)
            java.lang.String r2 = "sdk_nrc"
            long r0 = r8.LJIIL
            r7.put(r2, r0)
            java.lang.String r2 = "sdk_afs_stc"
            long r0 = r8.LJIJ
            r7.put(r2, r0)
            java.lang.String r2 = "sdk_afs_usc"
            long r0 = r8.LJIJI
            r7.put(r2, r0)
            java.lang.String r2 = "sdk_afs_ncc"
            long r0 = r8.LJIJJ
            r7.put(r2, r0)
            java.lang.String r2 = "sdk_afs_c"
            long r0 = r8.LJIJJLI
            r7.put(r2, r0)
            java.lang.String r2 = "sdk_c"
            long r0 = r8.LJJ
            r7.put(r2, r0)
            java.lang.String r0 = "1"
            org.json.JSONObject r0 = r7.put(r4, r0)
            if (r0 != 0) goto L6c
        L69:
            r7.put(r4, r5)
        L6c:
            java.lang.String r0 = "send_message_performance"
            X.FMX.LJIILJJIL(r0, r7)
            return
        L72:
            r8 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106714Gt.LIZJ(org.json.JSONObject, X.Owi):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|(1:(1:9)(2:46|47))(4:48|(1:50)(1:54)|51|(1:53))|10|(2:13|11)|14|15|16|17|(3:19|(7:21|(1:23)(1:39)|24|(1:28)|29|(3:33|34|(1:36))(1:31)|32)|40)(2:42|43)))|55|6|(0)(0)|10|(1:11)|14|15|16|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0115, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0116, code lost:
    
        r1 = new java.util.HashMap();
        r0 = r4.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "this.toString()");
        r1.put("error_msg", r0);
        X.C36L.LJ("send_msg_error", r1);
        X.C34B.LJFF(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[LOOP:0: B:11:0x003f->B:13:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc A[Catch: Exception -> 0x0115, TryCatch #1 {Exception -> 0x0115, blocks: (B:17:0x00c2, B:19:0x00dc, B:42:0x00e6, B:43:0x0114), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6 A[Catch: Exception -> 0x0115, TryCatch #1 {Exception -> 0x0115, blocks: (B:17:0x00c2, B:19:0x00dc, B:42:0x00e6, B:43:0x0114), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C109544Rq r11, long r12, X.C63540Owi r14, X.InterfaceC67352kd<? super org.json.JSONObject> r15) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106714Gt.LIZIZ(X.4Rq, long, X.Owi, X.2kd):java.lang.Object");
    }
}
