package X;

import android.os.Process;
import android.text.TextUtils;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: X.QfG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67554QfG {
    public final String LIZ;

    public C67554QfG(String str) {
        this.LIZ = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public final void LIZ(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            LIZIZ(this.LIZ, str, objArr);
        }
    }

    public static String LIZIZ(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = C16880lQ.LLLZI(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }
}
