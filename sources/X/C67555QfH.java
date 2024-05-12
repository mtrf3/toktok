package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.QfH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67555QfH {
    public final C67554QfG LIZ;
    public final String LIZIZ;
    public final C67574Qfa LIZJ;

    public C67555QfH(Context context, C67554QfG c67554QfG) {
        int length;
        String str;
        this.LIZIZ = context.getPackageName();
        this.LIZ = c67554QfG;
        try {
            if (C16880lQ.LLLLLLLLL(context.getPackageManager(), "com.android.vending", 0).enabled) {
                Signature[] signatureArr = C16880lQ.LLLLLLZ(context.getPackageManager(), "com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    C67554QfG c67554QfG2 = C67559QfL.LIZ;
                    Object[] objArr = new Object[0];
                    if (android.util.Log.isLoggable("PlayCore", 5)) {
                        C67554QfG.LIZIZ(c67554QfG2.LIZ, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                    } else {
                        c67554QfG2.getClass();
                    }
                } else {
                    int i = 0;
                    do {
                        byte[] byteArray = signatureArr[i].toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) && ((!Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str))) {
                            i++;
                        } else {
                            this.LIZJ = new C67574Qfa(context, c67554QfG, C67557QfJ.LIZ);
                            return;
                        }
                    } while (i < length);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            C67554QfG.LIZIZ(c67554QfG.LIZ, "Phonesky is not installed.", objArr2);
        } else {
            c67554QfG.getClass();
        }
        this.LIZJ = null;
    }

    public static Bundle LIZ(C67555QfH c67555QfH, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c67555QfH.LIZIZ);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C67556QfI(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC67558QfK abstractC67558QfK = (AbstractC67558QfK) it.next();
            Bundle LIZ = C141415gn.LIZ("event_type", 3);
            LIZ.putLong("event_timestamp", abstractC67558QfK.LIZIZ());
            arrayList2.add(LIZ);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
