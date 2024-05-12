package X;

import android.app.ActivityManager;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.util.List;

/* renamed from: X.Ed4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36842Ed4 {
    public static String LIZ;

    public static List LIZIZ(ActivityManager activityManager) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101302, "android/app/ActivityManager", "getRunningServices", activityManager, new Object[]{Integer.MAX_VALUE}, "java.util.List", new C65300Pk0(false, "(I)Ljava/util/List;", "174577469360097625"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : activityManager.getRunningServices(Integer.MAX_VALUE);
    }

    public static String LIZ(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        while (i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                hexString = i0.LJFF(CardStruct.IStatusCode.DEFAULT, hexString);
            }
            i = C0EH.LIZIZ(sb, hexString, "", i, 1);
        }
        return sb.toString().toUpperCase().trim();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36842Ed4.LIZJ(android.content.Context):java.lang.String");
    }

    public static boolean LIZLLL(Context context) {
        String LIZJ = LIZJ(context);
        if (LIZJ == null || LIZJ.contains(":") || !LIZJ.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }
}
