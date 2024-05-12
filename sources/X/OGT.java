package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class OGT {
    public static String LIZIZ(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Bundle[{");
        LIZ(bundle, sb);
        sb.append("}]");
        return sb.toString();
    }

    public static void LIZ(Bundle bundle, StringBuilder sb) {
        boolean z = true;
        for (String str : bundle.keySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            sb.append('=');
            Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
            if (LLJJIII instanceof int[]) {
                sb.append(Arrays.toString((int[]) LLJJIII));
            } else if (LLJJIII instanceof byte[]) {
                byte[] bArr = (byte[]) LLJJIII;
                if (bArr.length < 102400) {
                    sb.append(Arrays.toString(bArr));
                } else {
                    sb.append("byte[] in Bundle is too long, limit for 100K");
                }
            } else if (LLJJIII instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) LLJJIII));
            } else if (LLJJIII instanceof short[]) {
                sb.append(Arrays.toString((short[]) LLJJIII));
            } else if (LLJJIII instanceof long[]) {
                sb.append(Arrays.toString((long[]) LLJJIII));
            } else if (LLJJIII instanceof float[]) {
                sb.append(Arrays.toString((float[]) LLJJIII));
            } else if (LLJJIII instanceof double[]) {
                sb.append(Arrays.toString((double[]) LLJJIII));
            } else if (LLJJIII instanceof String[]) {
                sb.append(Arrays.toString((Object[]) LLJJIII));
            } else if (LLJJIII instanceof CharSequence[]) {
                sb.append(Arrays.toString((CharSequence[]) LLJJIII));
            } else if (LLJJIII instanceof Parcelable[]) {
                sb.append(Arrays.toString((Parcelable[]) LLJJIII));
            } else if (LLJJIII instanceof Bundle) {
                sb.append(LIZIZ((Bundle) LLJJIII));
            } else {
                sb.append(LLJJIII);
            }
            z = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.content.Intent r7, java.lang.StringBuilder r8) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OGT.LIZJ(android.content.Intent, java.lang.StringBuilder):void");
    }
}
