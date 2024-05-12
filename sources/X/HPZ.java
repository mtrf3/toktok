package X;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPZ extends M56 {
    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        return null;
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        if (!SC5.LIZIZ(str, "host", str2, "path", str, "openRecord") && !o.LJ(str, "video_record")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(str2);
            if (!ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "studio/task/create", false)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(str2);
                if (!ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ2), "studio/create", false)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e1  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // X.M56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.app.Activity r26, android.net.Uri r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HPZ.LIZLLL(android.app.Activity, android.net.Uri, boolean):void");
    }
}
