package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.MovingTabCornerTip;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LL0 implements LM4, InterfaceC54084LKm {
    public final ActivityC45651qj LJLIL;
    public final LNP LJLILLLLZI;
    public final String LJLJI;
    public final LN0 LJLJJI;
    public C119624mk LJLJJL;
    public String LJLJJLL;
    public final Keva LJLJL;

    @Override // X.LM4
    public final void LIZ() {
    }

    @Override // X.LM4
    public final int LIZIZ() {
        return 8388627;
    }

    @Override // X.LM4
    public final void LIZJ() {
    }

    @Override // X.InterfaceC54084LKm
    public final void LJIIIZ() {
    }

    @Override // X.LM4
    public final void LJIIJ() {
    }

    @Override // X.LM4
    public final void LJIIL() {
    }

    @Override // X.LM4
    public final void LJIILJJIL() {
    }

    @Override // X.LM4
    public final boolean LJIJ() {
        return true;
    }

    @Override // X.LM4
    public final boolean enabled() {
        return true;
    }

    @Override // X.LM4
    public final void onCreate() {
    }

    @Override // X.LM4
    public final void onDestroyView() {
    }

    @Override // X.LM4
    public final void onPause() {
    }

    @Override // X.LM4
    public final void onResume() {
    }

    @Override // X.InterfaceC54084LKm
    public final void LIZLLL() {
        LN0 ln0;
        if (this.LJLIL != null && (ln0 = this.LJLJJI) != null) {
            ln0.LIZLLL();
        }
    }

    @Override // X.LM4
    public final View LJII() {
        if (this.LJLIL == null) {
            return null;
        }
        String str = this.LJLJJLL;
        HG3.LJIIL();
        boolean LJ = o.LJ(str, HG3.LJLJL.LJFF().getAvatarUrl());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("buildIcon curUrl: ");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", this: ");
        LIZ.append(this);
        LIZ.append(", real url: ");
        HG3.LJIIL();
        LIZ.append(HG3.LJLJL.LJFF().getAvatarUrl());
        C221018lt.LJFF("ProfileTopIconGenerator", X1D.LIZIZ(LIZ));
        HG3.LJIIL();
        this.LJLJJLL = HG3.LJLJL.LJFF().getAvatarUrl();
        View buildProfileIcon = HomePageUIFrameServiceImpl.LIZ().buildProfileIcon(this.LJLILLLLZI.getActivity());
        o.LJII(buildProfileIcon, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.AvatarImageView");
        C119624mk c119624mk = (C119624mk) buildProfileIcon;
        this.LJLJJL = c119624mk;
        if (!LJ) {
            C78765Uvh.LJIIIZ(c119624mk, this.LJLJJLL, -1, -1);
        }
        return this.LJLJJL;
    }

    @Override // X.InterfaceC54084LKm
    public final boolean LJIILIIL() {
        int i;
        int i2;
        if (this.LJLJL.getBoolean("profile_has_clicked", false)) {
            return false;
        }
        C62822Ol8 c62822Ol8 = LL1.LIZIZ;
        MovingTabCornerTip movingTabCornerTip = (MovingTabCornerTip) c62822Ol8.getValue();
        if (movingTabCornerTip != null) {
            i = movingTabCornerTip.maxPopTimes;
        } else {
            i = 2;
        }
        if (this.LJLJL.getInt("profile_reminder_count", 0) >= i) {
            return false;
        }
        MovingTabCornerTip movingTabCornerTip2 = (MovingTabCornerTip) c62822Ol8.getValue();
        if (movingTabCornerTip2 != null) {
            i2 = movingTabCornerTip2.popIntervalHour;
        } else {
            i2 = 259200000;
        }
        if (System.currentTimeMillis() - this.LJLJL.getLong("profile_last_reminder_time", 0L) < i2 * 60 * 60 * 1000) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54084LKm
    public final void LJIILL() {
        this.LJLJL.storeLong("profile_last_reminder_time", System.currentTimeMillis());
        this.LJLJL.storeInt("profile_reminder_count", this.LJLJL.getInt("profile_reminder_count", 0) + 1);
    }

    @Override // X.InterfaceC54084LKm
    public final C53516KzQ LJIILLIIL() {
        String str;
        Resources resources;
        C119624mk c119624mk = this.LJLJJL;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null && (resources = activityC45651qj.getResources()) != null) {
            str = resources.getString(R.string.ry_);
        } else {
            str = null;
        }
        return new C53516KzQ(c119624mk, str, 5, C7MY.LIZIZ(12), C7MY.LIZIZ(4));
    }

    @Override // X.LM4
    public final void LJIIZILJ() {
        C119624mk c119624mk;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && !((RBX) LJIILL).isLogin()) {
            return;
        }
        HG3.LJIIL();
        String avatarUrl = HG3.LJLJL.LJFF().getAvatarUrl();
        if (!TextUtils.equals(avatarUrl, this.LJLJJLL) && (c119624mk = this.LJLJJL) != null) {
            C78765Uvh.LJIIIZ(c119624mk, avatarUrl, -1, -1);
        }
    }

    @Override // X.LM4
    public final String getTag() {
        return this.LJLJI;
    }

    @Override // X.LM4
    public final void LJFF(View view) {
        LN0 ln0;
        if (!C6ZT.LIZ(view) && this.LJLIL != null && (ln0 = this.LJLJJI) != null) {
            ln0.LIZLLL();
        }
    }

    @Override // X.InterfaceC54084LKm
    public final ImageView LJI(Context context) {
        o.LJIIIZ(context, "context");
        if (this.LJLIL == null) {
            return null;
        }
        HG3.LJIIL();
        String avatarUrl = HG3.LJLJL.LJFF().getAvatarUrl();
        View buildProfileIcon = HomePageUIFrameServiceImpl.LIZ().buildProfileIcon(this.LJLILLLLZI.getActivity());
        o.LJII(buildProfileIcon, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.AvatarImageView");
        C62846OlW c62846OlW = (C62846OlW) buildProfileIcon;
        C78765Uvh.LJIIIZ(c62846OlW, avatarUrl, -1, -1);
        return c62846OlW;
    }

    @Override // X.InterfaceC54084LKm
    public final Animator LJIIIIZZ(TuxIconView view) {
        o.LJIIIZ(view, "view");
        return null;
    }

    public LL0(ActivityC45651qj activityC45651qj, LNP environmentConfig) {
        LN0 ln0;
        o.LJIIIZ(environmentConfig, "environmentConfig");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = environmentConfig;
        this.LJLJI = "USER";
        this.LJLJL = Keva.getRepo("move_reminder_keva");
        if (activityC45651qj != null) {
            ln0 = new LN0(activityC45651qj);
        } else {
            ln0 = null;
        }
        this.LJLJJI = ln0;
    }

    @Override // X.LM4
    public final void LJ(LMX lmx, int i) {
        if (lmx != null) {
            lmx.LIZIZ("USER", this);
        }
    }
}
