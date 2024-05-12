package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class R2X {
    public static final String LIZJ;
    public static volatile R2X LIZLLL;
    public final RBY LIZ = R41.LIZ();
    public R7H LIZIZ;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZJ = JBR.LJFF(LIZ, "api-va.tiktokv.com", "/aweme/v1/check/out/", LIZ);
    }

    public final void LIZ(String str, boolean z, boolean z2, Bundle bundle) {
        Object obj;
        DialogC61824OOe dialogC61824OOe;
        String LIZLLL2 = R41.LIZLLL();
        boolean LJIIJJI = AV1.LJIIJJI();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        HashMap hashMap = new HashMap();
        String str2 = "1";
        if (R41.LIZ().isLogin()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("user_was_login", obj);
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("force_logout", str2);
        if (bundle != null && !TextUtils.isEmpty(bundle.getString("from_path"))) {
            hashMap.put("from_path", C16880lQ.LLJJIII(bundle, "from_path"));
        }
        if (z && LJIIIIZZ != null) {
            dialogC61824OOe = new DialogC61824OOe(LJIIIIZZ);
        } else {
            dialogC61824OOe = null;
        }
        if (dialogC61824OOe != null) {
            V1B.LJLJJL(dialogC61824OOe);
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new R7H(C58725N2z.LIZ);
        }
        this.LIZIZ.LJJIIJ(str, hashMap, new R4E(this, dialogC61824OOe, LJIIJJI, LJIIIIZZ, LIZLLL2, str, bundle));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x005e, code lost:
    
        if (android.text.TextUtils.equals(r12, "user_logout") == false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r11, final java.lang.String r12, android.os.Bundle r13, X.InterfaceC65892PtY r14) {
        /*
            r10 = this;
            java.lang.String r0 = "h5_delete_account"
            boolean r8 = android.text.TextUtils.equals(r0, r11)
            java.lang.String r0 = "h5_deactivate_account"
            boolean r0 = android.text.TextUtils.equals(r0, r11)
            r3 = 0
            r9 = 1
            if (r8 != 0) goto L12
            if (r0 == 0) goto L2e
        L12:
            r2 = 1
        L13:
            X.RBY r0 = r10.LIZ
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L4a
            long r0 = java.lang.System.currentTimeMillis()
            X.RBY r4 = r10.LIZ
            com.ss.android.ugc.aweme.profile.model.User r7 = r4.getCurUser()
            X.Qun r6 = X.C68517Qun.LIZ
            X.1Uc r5 = new X.1Uc
            r5.<init>(r9, r14)
            monitor-enter(r6)
            goto L30
        L2e:
            r2 = 0
            goto L13
        L30:
            X.Qur r4 = new X.Qur     // Catch: java.lang.Throwable -> L47
            r4.<init>(r7, r0, r8)     // Catch: java.lang.Throwable -> L47
            X.SvX r1 = new X.SvX     // Catch: java.lang.Throwable -> L47
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L47
            X.T0k r0 = X.T16.LIZIZ     // Catch: java.lang.Throwable -> L47
            X.Suk r1 = r1.LJIILIIL(r0)     // Catch: java.lang.Throwable -> L47
            X.9E3<T> r0 = new X.InterfaceC64592gB() { // from class: X.9E3
                static {
                    /*
                        X.9E3 r0 = new X.9E3
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.9E3<T>) X.9E3.LJLIL X.9E3
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9E3.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9E3.<init>():void");
                }

                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9E3.accept(java.lang.Object):void");
                }
            }     // Catch: java.lang.Throwable -> L47
            r1.LJIIJ(r0, r5)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r6)
            goto L4a
        L47:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L4a:
            java.lang.String r1 = "user_logout"
            boolean r0 = android.text.TextUtils.equals(r11, r1)     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto L53
            goto L62
        L53:
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto L5a
            goto L60
        L5a:
            boolean r0 = android.text.TextUtils.equals(r12, r1)     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto L62
        L60:
            r5 = 0
            goto L63
        L62:
            r5 = 1
        L63:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> La1
            r4.<init>()     // Catch: java.lang.Exception -> La1
            java.lang.String r0 = "is_logout_from_right"
            r4.put(r0, r5)     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = "logout_from"
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto L9f
            java.lang.String r0 = "none"
        L77:
            r4.put(r1, r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = "type"
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto L9d
            java.lang.String r0 = "other"
        L84:
            r4.put(r1, r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = "exception"
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> La1
            r0.<init>()     // Catch: java.lang.Exception -> La1
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch: java.lang.Exception -> La1
            r4.put(r1, r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = "dmt_logout"
            r0 = r5 ^ 1
            X.Q13.LIZIZ(r1, r0, r4)     // Catch: java.lang.Exception -> La1
            goto La5
        L9d:
            r0 = r12
            goto L84
        L9f:
            r0 = r12
            goto L77
        La1:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        La5:
            X.RBY r0 = r10.LIZ
            java.lang.String r0 = r0.getCurUserId()
            X.R4D.LJ = r0
            boolean r0 = X.AV1.LJIIJJI()
            if (r0 == 0) goto Lc6
            r10.LIZ(r12, r3, r2, r13)
        Lb6:
            java.lang.String r0 = "login"
            com.bytedance.keva.Keva r3 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r2 = "last_logout_time"
            long r0 = java.lang.System.currentTimeMillis()
            r3.storeLong(r2, r0)
            return
        Lc6:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            X.R2Z r0 = new X.R2Z
            r0.<init>()
            X.SuF r1 = X.AbstractC73638SvC.LJI(r0)
            X.T0k r0 = X.T16.LIZ()
            X.Sun r1 = r1.LJJIIJ(r0)
            X.R2Y r0 = new X.R2Y
            r0.<init>(r10, r2, r13)
            r1.LIZ(r0)
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R2X.LIZIZ(java.lang.String, java.lang.String, android.os.Bundle, X.PtY):void");
    }
}
