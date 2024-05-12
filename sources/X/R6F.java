package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class R6F implements R6L {
    public final Context LIZ;

    public R6F(Context context) {
        this.LIZ = context;
    }

    @Override // X.R6L
    public final void LIZ(String str, String str2, String str3, long j, java.util.Map map, R6Q r6q) {
        Context context = this.LIZ;
        QQN LIZIZ = R6V.LIZIZ(str2, str3, String.valueOf(j), null, str, map);
        LIZIZ.LIZ = C78939UyV.LIZIZ("/passport/auth/bind/");
        new R6T(context, LIZIZ.LJFF(), r6q).LJIIIZ();
    }
}
