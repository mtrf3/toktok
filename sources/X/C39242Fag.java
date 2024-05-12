package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Fag, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39242Fag {
    public static final HashSet<String> LIZ = C77275UUl.LIZLLL("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean LIZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        String brand = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        o.LJIIIIZZ(brand, "brand");
        if (ujb.o.LJJJLIIL(brand, "generic", false) && (i & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = C16880lQ.LLLLLLZ(context.getPackageManager(), str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                o.LJIIIIZZ(signatureArr, "packageInfo.signatures");
                for (Signature signature : signatureArr) {
                    HashSet<String> hashSet = LIZ;
                    byte[] byteArray = signature.toByteArray();
                    o.LJIIIIZZ(byteArray, "it.toByteArray()");
                    if (!ORZ.LJLJJI(C66373Q3d.LJJIIJZLJL(byteArray), hashSet)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
