package X;

import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.5GW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        int length;
        C5GX log = C5GX.LJLIL;
        o.LJIIIZ(log, "log");
        if (str == null || (length = str.length() / LivePlayerResourceReleaseSetting.ENABLE) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i * LivePlayerResourceReleaseSetting.ENABLE;
            int i3 = i + 1;
            int i4 = i3 * LivePlayerResourceReleaseSetting.ENABLE;
            if (i4 > str.length()) {
                i4 = str.length();
            }
            if (i2 == i4) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("split log order ");
            LIZ2.append(i3);
            LIZ2.append(' ');
            String substring = str.substring(i2, i4);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ2.append(substring);
            log.invoke(X1D.LIZIZ(LIZ2));
            if (i == length) {
                return;
            } else {
                i = i3;
            }
        }
    }
}
