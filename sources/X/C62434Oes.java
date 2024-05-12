package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;

/* renamed from: X.Oes */
/* loaded from: classes11.dex */
public final class C62434Oes {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage LIZ(int r37, android.content.Context r38, com.ss.android.ugc.aweme.feed.model.Aweme r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 2079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62434Oes.LIZ(int, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, boolean):com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage");
    }

    public static /* synthetic */ AwemeSharePackage LIZIZ(C62434Oes c62434Oes, Aweme aweme, Context context, int i, String str, String str2, String str3, int i2) {
        boolean z;
        String str4 = str3;
        int i3 = i;
        String str5 = str;
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        String str6 = "";
        if ((i2 & 8) != 0) {
            str5 = "";
        }
        if ((i2 & 16) == 0) {
            str6 = str2;
        }
        if ((i2 & 32) != 0) {
            str4 = "share_panel";
        }
        if ((i2 & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        c62434Oes.getClass();
        return LIZ(i3, context, aweme, str5, str6, str4, z);
    }
}
