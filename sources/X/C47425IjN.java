package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.IjN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47425IjN implements InterfaceC47432IjU {
    public static final C47425IjN LIZ = new C47425IjN();

    @Override // X.InterfaceC47432IjU
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC47432IjU
    public final File LIZ(Context context, EnumC47428IjQ enumC47428IjQ) {
        File LLIIIL;
        if (context == null) {
            LLIIIL = null;
        } else {
            LLIIIL = C16880lQ.LLIIIL(context);
        }
        return new File(LLIIIL, EnumC47317Ihd.VideoCache.getCacheDirName());
    }
}
