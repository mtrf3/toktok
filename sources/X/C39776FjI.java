package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: X.FjI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39776FjI {
    public static final C13T LIZ = new C13T("PhoneskyVerificationUtils");

    public static boolean LIZ(Context context) {
        Signature[] signatureArr;
        int length;
        String str;
        try {
            signatureArr = C16880lQ.LLLLLLZ(context.getPackageManager(), "com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (signatureArr != null && (length = signatureArr.length) != 0) {
            int i = 0;
            do {
                byte[] byteArray = signatureArr[i].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    str = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException unused2) {
                    str = "";
                }
                if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                    if ((!Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                        i++;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } while (i < length);
            return false;
        }
        LIZ.LIZJ("Phonesky package is not signed -- possibly self-built package. Could not verify.", 5, new Object[0]);
        return false;
    }

    public static boolean LIZIZ(Context context) {
        Object[] packagesForUid;
        PackageManager packageManager = context.getPackageManager();
        int callingUid = Binder.getCallingUid();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101310, "android/content/pm/PackageManager", "getPackagesForUid", packageManager, new Object[]{Integer.valueOf(callingUid)}, "java.lang.String[]", new C65300Pk0(false, "(I)[Ljava/lang/String;", "-5247225026861236531"));
        if (LIZJ.LIZ) {
            packagesForUid = (Object[]) LIZJ.LIZIZ;
        } else {
            packagesForUid = packageManager.getPackagesForUid(callingUid);
        }
        if (packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
            return true;
        }
        return false;
    }
}
