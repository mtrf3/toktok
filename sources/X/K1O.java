package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K1O {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C60737Nsb hybridContext, String url) {
        android.net.Uri LIZIZ;
        o.LJIIJ(url, "url");
        o.LJIIJ(hybridContext, "hybridContext");
        if (url.length() == 0) {
            InterfaceC60710NsA interfaceC60710NsA = hybridContext.hybridParams;
            if (interfaceC60710NsA != null && (LIZIZ = interfaceC60710NsA.LIZIZ()) != null) {
                return LIZIZ.toString();
            }
            return null;
        }
        return url;
    }
}
