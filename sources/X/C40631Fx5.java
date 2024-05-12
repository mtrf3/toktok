package X;

import android.os.Build;
import java.io.File;

/* renamed from: X.Fx5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40631Fx5 {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    public static InterfaceC39656FhM LIZ() {
        int i = 0;
        switch (Build.VERSION.SDK_INT) {
            case 21:
                return new C54840Lfg(i);
            case 22:
                return new C54845Lfl();
            case 23:
                return new C78857UxB();
            case 24:
                return new PJY(0);
            case 25:
                return new C78880UxY();
            case 26:
                return new TMC();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new C78841Uwv();
                }
            default:
                return new C78846Ux0();
        }
    }

    public static String LIZIZ(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String name = file.getName();
        String str = "";
        String replaceFirst = name.replaceFirst("(_\\d+)?\\.apk", "");
        if (replaceFirst.equals("base-master")) {
            return "";
        }
        String str2 = "base-";
        if (replaceFirst.startsWith("base-")) {
            str = "config.";
        } else {
            replaceFirst = replaceFirst.replace("-", ".config.");
            str2 = ".config.master";
        }
        return replaceFirst.replace(str2, str);
    }
}
