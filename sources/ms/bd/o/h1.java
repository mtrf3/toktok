package ms.bd.o;

import X.F9J;
import android.content.Context;
import android.content.SharedPreferences;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class h1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        String[] split = str.split((String) k.a(16777217, 0, 0L, "e9db0f", new byte[]{72, 39}));
        String str2 = split[0];
        String str3 = split[1];
        SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, str2).edit();
        edit.putString(str3, (String) obj);
        edit.commit();
        return null;
    }
}
