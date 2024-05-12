package X;

import com.ss.android.ugc.aweme.services.dm.DMPublishService;
import com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy;

/* renamed from: X.4XK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XK {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        ICreativePathServiceProxy creativePathServiceProxy = DMPublishService.INSTANCE.creativePathServiceProxy();
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(creativePathServiceProxy.getCacheRoot());
            LIZ2.append(str);
            C38891fp.LJIILL(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(creativePathServiceProxy.getCreativeRoot());
            LIZ3.append(str);
            C38891fp.LJIILL(X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(creativePathServiceProxy.getPersistentRoot());
            LIZ4.append(str);
            C38891fp.LJIILL(X1D.LIZIZ(LIZ4));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
