package X;

import com.ss.android.ugc.aweme.live.LiveOuterService;

/* renamed from: X.QBp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66593QBp extends AbstractC43055Gv5 {
    @Override // X.AbstractC43055Gv5
    public final String LJI() {
        return "RESOURCE";
    }

    @Override // X.AbstractC43055Gv5
    public final boolean LJFF() {
        if (!C23930wn.LIZ()) {
            return false;
        }
        try {
            LJII(LiveOuterService.LJJJLL().LJJIJIL().LJIIZILJ(true), "manual_clean_livegift");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.AbstractC43055Gv5
    public final long LJIIIIZZ() {
        if (!C23930wn.LIZ()) {
            return 0L;
        }
        try {
            return LiveOuterService.LJJJLL().LJJIJIL().LJIIZILJ(false);
        } catch (Exception unused) {
            return 0L;
        }
    }
}
