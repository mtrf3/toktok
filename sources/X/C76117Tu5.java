package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.Tu5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76117Tu5 {
    public static boolean LIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.isLocalTest();
        }
        return false;
    }

    public static boolean LIZIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.isOffline();
        }
        return false;
    }
}
