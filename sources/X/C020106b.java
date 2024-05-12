package X;

import android.app.RemoteInput;
import android.content.Intent;

/* renamed from: X.06b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C020106b {
    public static java.util.Set<String> LIZIZ(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    public static java.util.Map<String, android.net.Uri> LIZJ(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static void LIZ(C020406e c020406e, Intent intent, java.util.Map<String, android.net.Uri> map) {
        RemoteInput.addDataResultToIntent(C020406e.LIZ(c020406e), intent, map);
    }

    public static RemoteInput.Builder LIZLLL(RemoteInput.Builder builder, String str, boolean z) {
        return builder.setAllowDataType(str, z);
    }
}
