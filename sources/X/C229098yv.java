package X;

import com.ss.android.ugc.aweme.mix.api.MixFeedApi;

/* renamed from: X.8yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229098yv {
    public static /* synthetic */ AbstractC73672Svk LIZ(MixFeedApi mixFeedApi, String str, String str2, long j, int i, String str3, String str4, boolean z, Integer num, int i2) {
        int i3;
        if ((i2 & 64) != 0) {
            z = false;
        }
        if ((i2 & 128) != 0) {
            num = null;
        }
        if ((i2 & 256) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        return mixFeedApi.getMixVideos2(str, str2, j, i, str3, str4, z, num, i3);
    }
}
