package X;

import com.ss.android.ugc.aweme.relation.api.IMafUserApi;

/* renamed from: X.Mnn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57891Mnn {
    public static /* synthetic */ AbstractC73638SvC LIZ(IMafUserApi iMafUserApi, int i, int i2, String str, String str2, String str3, String str4, Integer num, int i3, boolean z, int i4) {
        int i5 = i3;
        String str5 = str4;
        boolean z2 = z;
        Integer num2 = null;
        if ((i4 & 32) != 0) {
            str5 = null;
        }
        if ((i4 & 64) == 0) {
            num2 = num;
        }
        if ((i4 & 256) != 0) {
            i5 = 0;
        }
        if ((i4 & 512) != 0) {
            z2 = false;
        }
        return iMafUserApi.getMaFUserList(i, i2, str, str2, str3, str5, num2, null, i5, z2);
    }
}
