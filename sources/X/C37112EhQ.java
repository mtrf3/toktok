package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.EhQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37112EhQ {
    public static final C13T LIZ = new C13T("SplitInstallHelper");

    public static void LIZ(Context context, String str) {
        synchronized (C37111EhP.class) {
            try {
                C16880lQ.LLJJJIL(str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String mapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(mapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(mapLibraryName);
                String sb2 = sb.toString();
                if (!new File(sb2).exists()) {
                    throw e;
                }
                System.load(sb2);
            }
        }
    }
}
