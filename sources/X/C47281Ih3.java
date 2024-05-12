package X;

import android.content.Context;
import android.os.Build;
import android.util.SparseIntArray;
import android.webkit.CookieManager;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Ih3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47281Ih3 {
    public static C47409Ij7 LIZ;
    public static Boolean LIZIZ;
    public static C47282Ih4 LIZJ;
    public static C54840Lfg LIZLLL;

    public static boolean LIZLLL() {
        boolean z;
        boolean z2;
        if (C00F.LIZ(31744, 0, "player_use_codecpool", true) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static InterfaceC47412IjA LJFF() {
        if (LIZ == null) {
            LIZ = new C47409Ij7(((C65087PgZ) C46104I7o.LJIILLIIL(C16880lQ.LLLZ("https://%s/", new Object[]{"tiktokv.com"}))).LJFF());
        }
        return LIZ;
    }

    public static void LIZ(C47282Ih4 c47282Ih4) {
        String cookie;
        if (!C38866FNe.LIZ()) {
            LIZLLL.getClass();
            if (!C88408Ymq.LIZJ() && C00F.LIZ(31744, 0, "player_get_cookie_lazy_enable", true) != 1) {
                CookieManager cookieManager = CookieManager.getInstance();
                String str = EFJ.LIZ;
                C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-4326433407838977128"));
                if (LIZJ2.LIZ) {
                    cookie = (String) LIZJ2.LIZIZ;
                } else {
                    cookie = cookieManager.getCookie(str);
                }
                java.util.Map<String, String> LIZ2 = C66952QPk.LIZ(str);
                C47279Ih1 c47279Ih1 = new C47279Ih1();
                c47279Ih1.LIZ = cookie;
                c47279Ih1.LIZIZ = LIZ2;
                c47282Ih4.LJIIL = c47279Ih1;
                return;
            }
        }
        c47282Ih4.LJIIJJI = new C47291IhD();
    }

    public static void LIZIZ(boolean z, SparseIntArray sparseIntArray) {
        try {
            if (!((Boolean) C47295IhH.LIZ.getValue()).booleanValue()) {
                return;
            }
            SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2 = (SuperResolutionStrategyConfigV2) IS1.LIZ.getValue();
            FFL.LJIIIZ().getClass();
            SuperResolutionStrategyConfig superResolutionStrategyConfig = (SuperResolutionStrategyConfig) FFL.LJIJ(true, "super_resolution_strategy", 31744, SuperResolutionStrategyConfig.class, null);
            if (superResolutionStrategyConfigV2 == null && superResolutionStrategyConfig == null) {
                return;
            }
            LIZJ(z, sparseIntArray);
        } catch (Throwable unused) {
        }
    }

    public static void LIZJ(boolean z, SparseIntArray sparseIntArray) {
        int i;
        if (sparseIntArray == null) {
            return;
        }
        TTVideoEngine.LJLLLLLL(719, 1);
        sparseIntArray.put(42, z ? 1 : 0);
        C5H3 c5h3 = IS1.LIZ;
        if (c5h3.getValue() != null) {
            SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2 = (SuperResolutionStrategyConfigV2) c5h3.getValue();
            if (superResolutionStrategyConfigV2 == null) {
                i = 0;
            } else {
                i = superResolutionStrategyConfigV2.asyncInitSr;
            }
        } else {
            i = 1;
        }
        sparseIntArray.put(62, i);
        FFL.LJIIIZ().getClass();
        sparseIntArray.put(66, FFL.LJIIJ(31744, 0, "player_sr_dynamic_control", true));
        FFL.LJIIIZ().getClass();
        sparseIntArray.put(45, FFL.LJIIJ(31744, 5, "player_super_resolution_algorithm_type", true));
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0029: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:33554473), block:B:16:0x0029 */
    public static String LJ(Context context, String str) {
        InputStream inputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                inputStream = context.getAssets().open(str);
                try {
                    byte[] bArr = new byte[inputStream.available()];
                    inputStream.read(bArr);
                    String str2 = new String(bArr, "UTF-8");
                    C38891fp.LJIIJJI(inputStream);
                    return str2;
                } catch (IOException e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                    C38891fp.LJIIJJI(inputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                C38891fp.LJIIJJI(closeable2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C38891fp.LJIIJJI(closeable2);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x08e1, code lost:
    
        if (r2 == null) goto L226;
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0687 A[Catch: all -> 0x06ee, TryCatch #11 {all -> 0x06ee, blocks: (B:169:0x03e6, B:172:0x03f8, B:174:0x03fc, B:185:0x0493, B:188:0x0495, B:191:0x04a8, B:194:0x05af, B:197:0x05d0, B:200:0x05e2, B:204:0x061c, B:207:0x064e, B:209:0x0674, B:213:0x0699, B:216:0x06c1, B:232:0x0687, B:233:0x0641, B:234:0x060a), top: B:168:0x03e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0641 A[Catch: all -> 0x06ee, TryCatch #11 {all -> 0x06ee, blocks: (B:169:0x03e6, B:172:0x03f8, B:174:0x03fc, B:185:0x0493, B:188:0x0495, B:191:0x04a8, B:194:0x05af, B:197:0x05d0, B:200:0x05e2, B:204:0x061c, B:207:0x064e, B:209:0x0674, B:213:0x0699, B:216:0x06c1, B:232:0x0687, B:233:0x0641, B:234:0x060a), top: B:168:0x03e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0a32 A[Catch: all -> 0x0a49, TryCatch #9 {all -> 0x0a49, blocks: (B:45:0x0904, B:48:0x0916, B:50:0x091a, B:58:0x0981, B:60:0x0983, B:63:0x0998, B:67:0x09ef, B:70:0x0a0d, B:72:0x0a1d, B:76:0x0a46, B:80:0x0a32, B:81:0x09fe, B:82:0x09db), top: B:44:0x0904 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x09fe A[Catch: all -> 0x0a49, TryCatch #9 {all -> 0x0a49, blocks: (B:45:0x0904, B:48:0x0916, B:50:0x091a, B:58:0x0981, B:60:0x0983, B:63:0x0998, B:67:0x09ef, B:70:0x0a0d, B:72:0x0a1d, B:76:0x0a46, B:80:0x0a32, B:81:0x09fe, B:82:0x09db), top: B:44:0x0904 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x09db A[Catch: all -> 0x0a49, TryCatch #9 {all -> 0x0a49, blocks: (B:45:0x0904, B:48:0x0916, B:50:0x091a, B:58:0x0981, B:60:0x0983, B:63:0x0998, B:67:0x09ef, B:70:0x0a0d, B:72:0x0a1d, B:76:0x0a46, B:80:0x0a32, B:81:0x09fe, B:82:0x09db), top: B:44:0x0904 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0997  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C47282Ih4 LJI(X.ITZ r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 2667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47281Ih3.LJI(X.ITZ, boolean, boolean):X.Ih4");
    }
}
