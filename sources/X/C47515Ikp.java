package X;

import com.ss.android.common.util.NetworkUtils;

/* renamed from: X.Ikp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47515Ikp implements J3K {
    public static final C47515Ikp LIZ = new C47515Ikp();

    @Override // X.J3K
    public final boolean LIZ(String str, String str2, String str3) {
        try {
            return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
