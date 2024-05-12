package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* loaded from: classes6.dex */
public final class B4I {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, String str2) {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ttlive_enter_room_log_");
        LIZ2.append(str);
        C0NB.LIZIZ(X1D.LIZIZ(LIZ2), str2);
    }

    public static final void LIZIZ(String str, String str2) {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ttlive_enter_room_log_");
        LIZ2.append(str);
        C0NB.LJ(X1D.LIZIZ(LIZ2), str2);
    }

    public static final void LIZJ(String str, String str2) {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ttlive_enter_room_log_");
        LIZ2.append(str);
        C0NB.LJIIIZ(X1D.LIZIZ(LIZ2), str2);
    }
}
