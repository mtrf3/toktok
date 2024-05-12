package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.921, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass921 {
    public static final /* synthetic */ int LIZ = 0;

    public static android.net.Uri LIZ(Context context) {
        o.LJIIIZ(context, "context");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("android.resource://");
        LIZ2.append(context.getPackageName());
        LIZ2.append('/');
        String LIZIZ = X1D.LIZIZ(LIZ2);
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ);
            LIZ3.append(R.raw.tiktok_new_customezed_tone);
            return UriProtector.parse(X1D.LIZIZ(LIZ3));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
