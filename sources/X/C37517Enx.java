package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.Enx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37517Enx implements InterfaceC37541EoL {
    public static final C37517Enx LIZ = new C37517Enx();

    @Override // X.InterfaceC37541EoL
    public final void LIZ(C37543EoN c37543EoN) {
        C37542EoM.LJIIJJI.getClass();
        if (C37542EoM.LIZ != null) {
            return;
        }
        C37542EoM.LIZIZ = c37543EoN;
        C37542EoM.LIZJ = "libra-va.tiktokv.com";
        Keva repo = Keva.getRepo("pia_settings");
        o.LJFF(repo, "Keva.getRepo(SETTINGS_REPO_NAME)");
        C37542EoM.LIZ = repo;
        if (C37542EoM.LIZIZ != null) {
            C37542EoM.LIZLLL();
        } else {
            o.LJIJI("appInfo");
            throw null;
        }
    }
}
