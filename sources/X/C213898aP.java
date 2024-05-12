package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.8aP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213898aP extends AbstractC186377Td {
    public final C213888aO LJLILLLLZI = new C213888aO(this);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 796));
    public boolean LJLJJI;
    public final C213218Yj LJLJJL;

    @Override // X.AbstractC186377Td
    public final void LJ(boolean z) {
    }

    @Override // X.AbstractC186377Td
    public final C213218Yj LIZ() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC186377Td
    public final void LIZJ(Lifecycle.Event event) {
        o.LJIIIZ(event, "event");
        super.LIZJ(event);
        if (C52535Kjb.LIZ()) {
            int i = C213908aQ.LIZ[event.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                if (C52535Kjb.LIZIZ()) {
                    AwemeCollectionAgent.LJIILLIIL().LIZJ(this.LJLILLLLZI);
                    return;
                } else {
                    AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ((C213878aN) this.LJLJI.getValue());
                    return;
                }
            }
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LJFF(this.LJLILLLLZI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJI((C213878aN) this.LJLJI.getValue());
            }
        }
    }

    @Override // X.AbstractC186377Td
    public final void LIZLLL(boolean z) {
        AwemeListFragment awemeListFragment;
        if (z && this.LJLJJI) {
            Fragment fragment = this.LJLJJL.LIZ;
            if ((fragment instanceof AwemeListFragment) && (awemeListFragment = (AwemeListFragment) fragment) != null && awemeListFragment.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                this.LJLJJI = false;
                ((AwemeListFragmentImpl) awemeListFragment).LLLZI();
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onVideoCollect(C193087hw ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.LJLILLLLZI == 1) {
            LJFF(this.LJLIL);
            this.LJLJJI = true;
        } else {
            LIZIZ(this.LJLIL);
        }
    }

    public C213898aP(ProfileServiceImpl profileServiceImpl, int i, Boolean bool, String str, Context context) {
        boolean z;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        AwemeListFragment newBasicAwemeListFragment = profileServiceImpl.newBasicAwemeListFragment(i, 4, curUserId, curSecUserId, z, true);
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) newBasicAwemeListFragment;
        awemeListFragmentImpl.LLFFF = true;
        awemeListFragmentImpl.LJLLJ = true;
        newBasicAwemeListFragment.s(C79234V7u.LJIJI(8));
        this.LJLJJL = new C213218Yj(newBasicAwemeListFragment, str, "video", "videos", context.getString(R.string.gap));
    }
}
