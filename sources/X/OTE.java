package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.authorize.network.AuthorizeApi;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTE {
    public static final OTE LIZ = new OTE();
    public static final AuthorizeApi LIZIZ;
    public static final AuthorizeApi LIZJ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        LIZIZ = (AuthorizeApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(AuthorizeApi.class);
        IRetrofitFactory LIZLLL2 = RetrofitFactory.LIZLLL();
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        C65087PgZ LIZ2 = LIZLLL2.LIZ(API_URL_PREFIX_SI);
        LIZ2.LJIIIZ = 1;
        LIZJ = (AuthorizeApi) LIZ2.LJFF().LIZ.LIZ(AuthorizeApi.class);
    }

    public static String LIZJ(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        o.LJIIIIZZ(digest, "getInstance(\"SHA-256\")\n …ackageName.toByteArray())");
        String str2 = "";
        for (byte b : digest) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            String LLLZ = C16880lQ.LLLZ("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            o.LJIIIIZZ(LLLZ, "format(this, *args)");
            LIZ2.append(LLLZ);
            str2 = X1D.LIZIZ(LIZ2);
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:13:0x003a, B:14:0x003d, B:17:0x0044, B:18:0x004b, B:21:0x002f), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r10, java.lang.String r11, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.OTG
            if (r0 == 0) goto L1e
            r4 = r12
            X.OTG r4 = (X.OTG) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L24
            goto L3a
        L1e:
            X.OTG r4 = new X.OTG
            r4.<init>(r9, r12)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.authorize.network.AuthorizeApi r0 = X.OTE.LIZJ     // Catch: java.lang.Exception -> L4c
            r4.LJLJI = r1     // Catch: java.lang.Exception -> L4c
            java.lang.Object r3 = r0.requestTicketInfo(r10, r11, r4)     // Catch: java.lang.Exception -> L4c
            if (r3 != r2) goto L3d
            return r2
        L3a:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L4c
        L3d:
            com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponse r3 = (com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponse) r3     // Catch: java.lang.Exception -> L4c
            com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData r0 = r3.data     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L44
            return r0
        L44:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = "Didn't receive any auth information data from server"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L4c
            throw r1     // Catch: java.lang.Exception -> L4c
        L4c:
            r0 = move-exception
            com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData r1 = new com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData
            r2 = 0
            r3 = 0
            r7 = 31
            r4 = r2
            r5 = r3
            r6 = r3
            r8 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r6 = X.V0N.LJJIJL(r0)
            boolean r2 = r1.canSkipConfirm
            java.lang.String r3 = r1.clientName
            r4 = -1
            java.lang.String r5 = r1.description
            com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData r1 = new com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OTE.LIZIZ(java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00fb A[PHI: r0
      0x00fb: PHI (r0v10 java.lang.Object) = (r0v7 java.lang.Object), (r0v2 java.lang.Object) binds: [B:49:0x00f8, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9 A[Catch: Exception -> 0x00fc, TryCatch #0 {Exception -> 0x00fc, blocks: (B:14:0x002b, B:16:0x0038, B:19:0x003f, B:22:0x0051, B:24:0x005e, B:29:0x0080, B:32:0x0092, B:34:0x00a3, B:40:0x00b4, B:42:0x00c1, B:47:0x00d9, B:48:0x00e7, B:51:0x00e3), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3 A[Catch: Exception -> 0x00fc, TryCatch #0 {Exception -> 0x00fc, blocks: (B:14:0x002b, B:16:0x0038, B:19:0x003f, B:22:0x0051, B:24:0x005e, B:29:0x0080, B:32:0x0092, B:34:0x00a3, B:40:0x00b4, B:42:0x00c1, B:47:0x00d9, B:48:0x00e7, B:51:0x00e3), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r23, X.OT6 r24, X.OTD r25, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.openauthorize.entity.AuthCodeResponse> r26) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OTE.LIZ(android.content.Context, X.OT6, X.OTD, X.2kd):java.lang.Object");
    }
}
