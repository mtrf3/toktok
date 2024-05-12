package X;

import com.bytedance.keva.Keva;
import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.Ho0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45164Ho0 implements InterfaceC29937Boz {
    public static final C45164Ho0 LIZ = new C45164Ho0();

    @Override // X.InterfaceC29937Boz
    public final void run() {
        if (C45087Hml.LIZJ == null) {
            C45087Hml.LIZJ = Keva.getRepo("repo_auto_cut");
        }
        Keva keva = C45087Hml.LIZJ;
        if ((keva != null && keva.getBoolean("is_auto_cut_inited", false)) || TTNetInit.getEffectiveConnectionType() >= 6) {
            C45161Hnx.LIZIZ(null);
        }
    }
}
