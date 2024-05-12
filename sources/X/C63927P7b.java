package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* renamed from: X.P7b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63927P7b {
    public static final Pattern LIZ = PatternProtector.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    public static void LIZ(String str) {
        boolean z;
        boolean z2 = true;
        if (43 <= str.length()) {
            z = true;
        } else {
            z = false;
        }
        T2R.LJIILJJIL("codeVerifier length is shorter than allowed by the PKCE specification", z);
        if (str.length() > 128) {
            z2 = false;
        }
        T2R.LJIILJJIL("codeVerifier length is longer than allowed by the PKCE specification", z2);
        T2R.LJIILJJIL("codeVerifier string contains illegal characters", LIZ.matcher(str).matches());
    }
}
