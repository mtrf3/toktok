package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OU1 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(Signature signature) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(signature.toByteArray());
        byte[] digest = messageDigest.digest();
        o.LJIIIIZZ(digest, "digest.digest()");
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i = 0; i < length; i++) {
            int i2 = digest[i] & 255;
            int i3 = i * 2;
            cArr2[i3] = cArr[i2 >>> 4];
            cArr2[i3 + 1] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    public static String LIZ(PackageManager packageManager, String str) {
        ArrayList arrayList;
        if (str == null) {
            return "";
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(packageManager, str, 134217728);
                o.LJIIIIZZ(LLLLLLZ, "{\n                packag…RTIFICATES)\n            }");
                SigningInfo signingInfo = LLLLLLZ.signingInfo;
                if (signingInfo == null) {
                    return "";
                }
                if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    o.LJIIIIZZ(apkContentsSigners, "sig.apkContentsSigners");
                    arrayList = new ArrayList(apkContentsSigners.length);
                    int length = apkContentsSigners.length;
                    while (i < length) {
                        Signature it = apkContentsSigners[i];
                        o.LJIIIIZZ(it, "it");
                        arrayList.add(LIZIZ(it));
                        i++;
                    }
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    o.LJIIIIZZ(signingCertificateHistory, "sig.signingCertificateHistory");
                    arrayList = new ArrayList(signingCertificateHistory.length);
                    int length2 = signingCertificateHistory.length;
                    while (i < length2) {
                        Signature it2 = signingCertificateHistory[i];
                        o.LJIIIIZZ(it2, "it");
                        arrayList.add(LIZIZ(it2));
                        i++;
                    }
                }
            } catch (Exception unused) {
                return "";
            }
        } else {
            try {
                PackageInfo LLLLLLZ2 = C16880lQ.LLLLLLZ(packageManager, str, 64);
                o.LJIIIIZZ(LLLLLLZ2, "{\n                packag…SIGNATURES)\n            }");
                Signature[] signatureArr = LLLLLLZ2.signatures;
                if (signatureArr == null) {
                    return "";
                }
                arrayList = new ArrayList(signatureArr.length);
                int length3 = signatureArr.length;
                while (i < length3) {
                    Signature it3 = signatureArr[i];
                    o.LJIIIIZZ(it3, "it");
                    arrayList.add(LIZIZ(it3));
                    i++;
                }
            } catch (Exception unused2) {
                return "";
            }
        }
        return ORZ.LLD(arrayList, ",", null, null, null, 62);
    }
}
