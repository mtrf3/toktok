package ms.bd.o;

import android.content.Context;
import android.content.Intent;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class i1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        String[] strArr = (String[]) obj;
        if (context != null && str != null && strArr != null && strArr.length % 2 == 0) {
            Intent intent = new Intent(str);
            intent.setPackage(context.getPackageName());
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                intent.putExtra(strArr[i2], strArr[i2 + 1]);
            }
            context.sendBroadcast(intent);
            return null;
        }
        return null;
    }
}
