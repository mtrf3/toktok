package X;

import com.bytedance.android.livesdkapi.host.IHostUser;

/* loaded from: classes6.dex */
public final class B83 {
    public static volatile B83 LIZIZ;
    public volatile C29374Bfu LIZ;

    public static B83 LIZ() {
        if (LIZIZ == null) {
            synchronized (B83.class) {
                if (LIZIZ == null) {
                    LIZIZ = new B83();
                }
            }
        }
        return LIZIZ;
    }

    public final InterfaceC29405BgP LIZIZ() {
        if (this.LIZ == null) {
            synchronized (InterfaceC29405BgP.class) {
                if (this.LIZ == null) {
                    this.LIZ = new C29374Bfu((IHostUser) CN1.LIZ(IHostUser.class));
                }
            }
        }
        return this.LIZ;
    }
}
