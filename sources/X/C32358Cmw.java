package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.Cmw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32358Cmw {
    public static boolean LIZ() {
        String str;
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            str = iHostAppContext.getChannel();
        } else {
            str = null;
        }
        return C38354F3m.LIZJ("amazon_int", str);
    }
}
