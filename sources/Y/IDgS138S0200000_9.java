package Y;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C212428Vi;
import X.C55096Ljo;
import X.JJ4;
import X.LN2;
import X.M78;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFSocialAssem;

/* loaded from: classes10.dex */
public class IDgS138S0200000_9 implements JJ4 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.JJ4
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.JJ4
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                return;
            case 1:
                LIZIZ$1(this);
                return;
            default:
                return;
        }
    }

    public static final void LIZ$0(IDgS138S0200000_9 iDgS138S0200000_9) {
        TabChangeManager.jv0(C116694i1.LIZ(((LN2) iDgS138S0200000_9.l0).LJLIL), "HOME", false, 30);
        ((M78) iDgS138S0200000_9.l1).LIZ();
    }

    public static final void LIZ$1(IDgS138S0200000_9 iDgS138S0200000_9) {
        boolean z;
        Fragment fragment;
        FeedFragment feedFragment;
        ActivityC45651qj LIZ = C212428Vi.LIZ((MFSocialAssem) iDgS138S0200000_9.l0);
        if (LIZ == null) {
            return;
        }
        if (((IMFAbility) iDgS138S0200000_9.l1).io0()) {
            int currentItemCompat = ((IMFAbility) iDgS138S0200000_9.l1).getCurrentItemCompat();
            MFSocialAssem mFSocialAssem = (MFSocialAssem) iDgS138S0200000_9.l0;
            if (currentItemCompat != 0) {
                z = true;
            } else {
                z = false;
            }
            mFSocialAssem.LJLJI = z;
            if (z) {
                IMFAbility iMFAbility = (IMFAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(mFSocialAssem), IMFAbility.class, null);
                if (iMFAbility != null) {
                    fragment = iMFAbility.getCurrentFragment();
                } else {
                    fragment = null;
                }
                if ((fragment instanceof FeedFragment) && (feedFragment = (FeedFragment) fragment) != null) {
                    feedFragment.wl(false);
                }
            }
            int LLLZZ = ((IMFAbility) iDgS138S0200000_9.l1).LLLZZ(1);
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "MainFragment");
            Hox.LJLLI.LIZ(LIZ).Bv0(LLLZZ, bundle);
        }
        ((MFSocialAssem) iDgS138S0200000_9.l0).LJLILLLLZI = null;
    }

    public static final void LIZIZ$0(IDgS138S0200000_9 iDgS138S0200000_9) {
        ((M78) iDgS138S0200000_9.l1).LIZ();
    }

    public static final void LIZIZ$1(IDgS138S0200000_9 iDgS138S0200000_9) {
        ((MFSocialAssem) iDgS138S0200000_9.l0).LJLILLLLZI = null;
    }

    public IDgS138S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
