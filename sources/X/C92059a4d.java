package X;

import android.util.Base64;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinRule;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Random;
import javax.crypto.Cipher;
import kotlin.jvm.internal.o;

/* renamed from: X.a4d, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92059a4d {
    public static long LIZJ;
    public static final C92059a4d LIZ = new C92059a4d();
    public static String LIZIZ = "";
    public static final ArrayList<PinRule> LIZLLL = new ArrayList<>();

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:13)(2:10|11))(3:24|(1:26)(1:38)|(1:28)(5:29|(1:31)|(2:35|(1:37))|19|20))|14|(4:16|(1:18)(1:21)|19|20)(2:22|23)))|44|6|7|(0)(0)|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        X.C92059a4d.LIZIZ = "";
        r1 = X.EnumC91923a2R.PUBLIC_KEY;
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        r0 = "exception error";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        X.C91924a2S.LIZ.LIZLLL("unknown", r1, r0, "");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:13:0x006d, B:14:0x0070, B:16:0x0078, B:18:0x0082, B:21:0x0095, B:22:0x00a3, B:35:0x005b), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[Catch: Exception -> 0x00af, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:13:0x006d, B:14:0x0070, B:16:0x0078, B:18:0x0082, B:21:0x0095, B:22:0x00a3, B:35:0x005b), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super java.lang.String> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C92995aJj
            if (r0 == 0) goto L22
            r7 = r12
            X.aJj r7 = (X.C92995aJj) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r3 = r7.LJLILLLLZI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            java.lang.String r2 = "unknown"
            r9 = 1
            java.lang.String r10 = ""
            if (r0 == 0) goto L30
            if (r0 != r9) goto L28
            goto L6d
        L22:
            X.aJj r7 = new X.aJj
            r7.<init>(r11, r12)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r3)
            java.lang.String r0 = X.C91826a0s.LIZLLL
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L40
            r0 = 1
        L3d:
            if (r0 == 0) goto L42
            return r10
        L40:
            r0 = 0
            goto L3d
        L42:
            java.lang.String r0 = X.C92059a4d.LIZIZ
            int r0 = r0.length()
            if (r0 != 0) goto L4b
            r1 = 1
        L4b:
            if (r1 != 0) goto L5b
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = X.C92059a4d.LIZJ
            long r5 = r5 - r0
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lbf
        L5b:
            X.a0m r0 = com.ss.android.ugc.aweme.bnpl.network.VerifyApi.LIZ     // Catch: java.lang.Exception -> Laf
            r7.LJLIL = r11     // Catch: java.lang.Exception -> Laf
            r7.LJLJJI = r9     // Catch: java.lang.Exception -> Laf
            r0.getClass()     // Catch: java.lang.Exception -> Laf
            com.ss.android.ugc.aweme.bnpl.network.VerifyApi r0 = X.C91820a0m.LIZIZ     // Catch: java.lang.Exception -> Laf
            java.lang.Object r3 = r0.getPinPublicKey(r7)     // Catch: java.lang.Exception -> Laf
            if (r3 != r8) goto L70
            return r8
        L6d:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> Laf
        L70:
            X.Pbt r3 = (X.C64797Pbt) r3     // Catch: java.lang.Exception -> Laf
            boolean r0 = r3.LIZIZ()     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto La3
            T r0 = r3.LIZIZ     // Catch: java.lang.Exception -> Laf
            com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse) r0     // Catch: java.lang.Exception -> Laf
            boolean r0 = r0.LIZ()     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L95
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Laf
            X.C92059a4d.LIZJ = r0     // Catch: java.lang.Exception -> Laf
            T r0 = r3.LIZIZ     // Catch: java.lang.Exception -> Laf
            com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse) r0     // Catch: java.lang.Exception -> Laf
            T r0 = r0.data     // Catch: java.lang.Exception -> Laf
            com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinPublicKey r0 = (com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinPublicKey) r0     // Catch: java.lang.Exception -> Laf
            java.lang.String r0 = r0.publicKey     // Catch: java.lang.Exception -> Laf
            X.C92059a4d.LIZIZ = r0     // Catch: java.lang.Exception -> Laf
            goto Lbf
        L95:
            X.C92059a4d.LIZIZ = r10     // Catch: java.lang.Exception -> Laf
            X.a2R r1 = X.EnumC91923a2R.PUBLIC_KEY     // Catch: java.lang.Exception -> Laf
            T r0 = r3.LIZIZ     // Catch: java.lang.Exception -> Laf
            com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse r0 = (com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse) r0     // Catch: java.lang.Exception -> Laf
            java.lang.String r0 = r0.errorMsg     // Catch: java.lang.Exception -> Laf
            X.C91924a2S.LJ(r2, r1, r0)     // Catch: java.lang.Exception -> Laf
            goto Lbf
        La3:
            X.C92059a4d.LIZIZ = r10     // Catch: java.lang.Exception -> Laf
            r3.LIZJ()     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = "response.message()"
            r0 = 0
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)     // Catch: java.lang.Exception -> Laf
            throw r0
        Laf:
            r0 = move-exception
            X.C92059a4d.LIZIZ = r10
            X.a2R r1 = X.EnumC91923a2R.PUBLIC_KEY
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Lbc
            java.lang.String r0 = "exception error"
        Lbc:
            X.C91924a2S.LJ(r2, r1, r0)
        Lbf:
            java.lang.String r0 = X.C92059a4d.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92059a4d.LIZJ(X.2kd):java.lang.Object");
    }

    public static C92070a4o LIZ(String pin, String publicKey) {
        o.LJIIIZ(pin, "pin");
        o.LJIIIZ(publicKey, "publicKey");
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            stringBuffer.append("abcdefghijklmnopkrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".charAt(random.nextInt(62)));
            i++;
        } while (i < 32);
        String stringBuffer2 = stringBuffer.toString();
        o.LJIIIIZZ(stringBuffer2, "stringBuffer.toString()");
        String valueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(pin);
        LIZ2.append(valueOf);
        LIZ2.append('_');
        LIZ2.append(stringBuffer2);
        String LIZIZ2 = LIZIZ(X1D.LIZIZ(LIZ2), publicKey);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(valueOf);
        LIZ3.append('_');
        LIZ3.append(stringBuffer2);
        String LIZIZ3 = LIZIZ(X1D.LIZIZ(LIZ3), publicKey);
        if (LIZIZ2 == null) {
            LIZIZ2 = "";
        }
        if (LIZIZ3 == null) {
            LIZIZ3 = "";
        }
        return new C92070a4o(LIZIZ2, LIZIZ3);
    }

    public static String LIZIZ(String encryptData, String publicKey) {
        o.LJIIIZ(encryptData, "encryptData");
        o.LJIIIZ(publicKey, "publicKey");
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new OJD("\t").replace(new OJD("\n").replace(ujb.o.LJJJJZ(ujb.o.LJJJJZ(publicKey, "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), ""), ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, generatePublic);
            return Base64.encodeToString(cipher.doFinal(ujb.o.LJJJIL(encryptData)), 0);
        } catch (Throwable unused) {
            return null;
        }
    }
}
