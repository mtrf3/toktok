package X;

import com.ss.android.ugc.aweme.user.UserStore;

/* renamed from: X.QvE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68544QvE {
    public static UserStore.AccountUser LIZ(int i, int i2, long j, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String valueOf;
        if (j == 0) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(j);
        }
        return new UserStore.AccountUser(valueOf, str, str2, z, str3, str4, z2, i, i2);
    }
}
