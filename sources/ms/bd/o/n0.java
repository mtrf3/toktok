package ms.bd.o;

import X.C16880lQ;
import android.content.Context;
import android.content.pm.Signature;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class n0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        Signature[] signatureArr = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 64).signatures;
        if (signatureArr != null && signatureArr.length > 0) {
            return signatureArr[0].toByteArray();
        }
        return null;
    }
}
