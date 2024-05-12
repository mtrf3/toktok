package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.GMq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41400GMq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(File file, InterfaceC88472Yns callback) {
        o.LJIIIZ(file, "file");
        o.LJIIIZ(callback, "callback");
        long j = 1024;
        int length = (int) (((file.length() / j) + 1) * j);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(com.ss.android.ugc.aweme.app.api.Api.LIZIZ);
        LIZ2.append("?uid=");
        ((RBX) HG3.LJIILL()).uploadAvatar(new HandlerC41399GMp(callback), UPJ.LJ((RBX) HG3.LJIILL(), LIZ2, LIZ2), length, file.getPath(), null);
    }
}
