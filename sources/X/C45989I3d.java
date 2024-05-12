package X;

import com.bytedance.keva.Keva;
import defpackage.m0;
import kotlin.jvm.internal.o;

/* renamed from: X.I3d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45989I3d {
    public final Keva LIZ;

    public final boolean LIZ() {
        return m0.LIZLLL("has_live_tab_pop_up_show", C44172HVg.LJIJ.getCurrentUserID(), this.LIZ, false);
    }

    public final boolean LIZIZ() {
        return m0.LIZLLL("never_live_flag_when_first_entrance", C44172HVg.LJIJ.getCurrentUserID(), this.LIZ, false);
    }

    public final boolean LIZJ() {
        return m0.LIZLLL("never_go_live_flag_value_as_zero", C44172HVg.LJIJ.getCurrentUserID(), this.LIZ, false);
    }

    public C45989I3d() {
        Keva repo = Keva.getRepo("live_tab_pop_up_in_record");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZ = repo;
    }

    public final void LIZLLL(boolean z) {
        C65429Pm5.LJ("never_live_flag_when_first_entrance", C44172HVg.LJIJ.getCurrentUserID(), this.LIZ, z);
    }
}
