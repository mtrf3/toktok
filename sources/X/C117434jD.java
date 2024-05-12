package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.4jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117434jD {
    public final android.net.Uri LIZ;
    public final String LIZIZ;

    public final android.net.Uri LIZIZ() {
        android.net.Uri uri = this.LIZ;
        if (uri != null) {
            return uri;
        }
        throw new AssertionError();
    }

    public final android.net.Uri LIZ(Context context) {
        if (C117424jC.LIZIZ == null) {
            synchronized (C117424jC.class) {
                if (C117424jC.LIZIZ == null) {
                    C117424jC.LIZIZ = new C117424jC();
                }
            }
        }
        return C117424jC.LIZIZ.LIZ(context, this.LIZIZ);
    }

    public C117434jD(Context context, String str, int i) {
        android.net.Uri LIZ;
        this.LIZIZ = str;
        try {
            LIZ = UriProtector.parse(str);
            if (LIZ.getScheme() == null) {
                LIZ = LIZ(context);
            }
        } catch (Exception unused) {
            LIZ = LIZ(context);
        }
        this.LIZ = LIZ;
    }
}
