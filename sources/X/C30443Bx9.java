package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.Bx9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30443Bx9 {
    public static final C48459J0d<Integer> LIZ = new C48459J0d<>("tt_live_sdk_version", 3060);

    public static String LIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null && iHostAppContext.isOffline()) {
            return String.valueOf(LIZ.LIZJ());
        }
        return String.valueOf(3060);
    }
}
