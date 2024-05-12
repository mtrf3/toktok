package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LN1 implements InterfaceC53896LDg {
    public final /* synthetic */ LN0 LJLIL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public LN1(LN0 ln0) {
        this.LJLIL = ln0;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        LN0 ln0 = this.LJLIL;
        ln0.LJLJLLL = false;
        ActivityC45651qj activityC45651qj = ln0.LJLILLLLZI;
        if (C53765L8f.LJIIL("USER") || activityC45651qj == null) {
            return;
        }
        C27740Aue.LJIIIIZZ(activityC45651qj);
        C244389iU.LIZ(activityC45651qj);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        Fragment fragment;
        o.LJIIIZ(args, "args");
        LN0 ln0 = this.LJLIL;
        ActivityC45651qj activityC45651qj = ln0.LJLILLLLZI;
        Fragment fragment2 = null;
        if (activityC45651qj != null) {
            fragment = LKR.LIZ(activityC45651qj);
        } else {
            fragment = null;
        }
        ln0.LIZJ(fragment, false, false);
        ActivityC45651qj activityC45651qj2 = this.LJLIL.LJLILLLLZI;
        if (activityC45651qj2 != null) {
            LTT.LJ(activityC45651qj2);
        }
        C27740Aue.LJIIIIZZ(this.LJLIL.LJLILLLLZI);
        C27740Aue.LJII(this.LJLIL.LJLILLLLZI);
        LN0 ln02 = this.LJLIL;
        if (!ln02.LJLJLLL) {
            ln02.LJ();
            LN0 ln03 = this.LJLIL;
            ln03.LIZIZ(ln03.LJLJJLL, ln03.LJLJLLL);
            LN0 ln04 = this.LJLIL;
            ln04.LIZ(ln04.LJLJLJ);
        } else {
            Keva profileReminderKeva = Keva.getRepo("move_reminder_keva");
            o.LJIIIIZZ(profileReminderKeva, "profileReminderKeva");
            if (!C79057V0z.LJIJ(profileReminderKeva, "profile_has_clicked", false)) {
                profileReminderKeva.storeBoolean("profile_has_clicked", true);
            }
        }
        if (C54305LSz.LJ() || C54305LSz.LIZLLL()) {
            C2U8.LIZ(new C54109LLl());
        }
        IProfileService LIZ = ProfileServiceImpl.LIZ();
        ActivityC45651qj activityC45651qj3 = this.LJLIL.LJLILLLLZI;
        if (activityC45651qj3 != null) {
            fragment2 = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj3).Ja("USER");
        }
        LIZ.checkAndRefreshUser(fragment2);
    }
}
