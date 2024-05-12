package X;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class P8N {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                if (o.LJ("mounted", C16880lQ.LLLLLLLZIL())) {
                    File file = new File(str);
                    if (file.exists()) {
                        C16880lQ.LLLZZIL(file);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void LIZ(String str, boolean z) {
        if (str != null && !TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                if (!z) {
                    file.mkdirs();
                    return;
                }
                try {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
    }
}
