package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes13.dex */
public final class S1V {
    public static /* synthetic */ void LIZ(S1U s1u, Context context, Aweme aweme, String str, String str2, C188727au c188727au, String str3, int i) {
        String str4 = str3;
        if ((i & 64) != 0) {
            str4 = "";
        }
        s1u.LJJL(context, aweme, str, str2, c188727au, false, str4);
    }

    public static /* synthetic */ void LIZJ(S1U s1u, Aweme aweme, String str, String str2, boolean z, String str3, C188727au c188727au, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            c188727au = null;
        }
        s1u.LJJIJ(aweme, str, str2, z, str3, c188727au);
    }

    public static /* synthetic */ void LIZIZ(S1U s1u, Aweme aweme, String str, String str2, boolean z, boolean z2, String str3, C188727au c188727au, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            str3 = "";
        }
        if ((i & 64) != 0) {
            c188727au = null;
        }
        s1u.LJIJI(aweme, str, str2, z, z2, str3, c188727au);
    }
}
