package X;

import android.text.TextUtils;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.2nK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69022nK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File child : listFiles) {
                o.LJIIIIZZ(child, "child");
                if (child.isDirectory()) {
                    LIZ(child.getPath());
                } else {
                    C16880lQ.LLLZZIL(child);
                }
            }
            C16880lQ.LLLZZIL(file);
        }
    }
}
