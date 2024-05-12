package X;

import Y.ARunnableS45S0100000_9;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.experiment.SlidePage;
import com.ss.android.ugc.aweme.experiment.SlidePageItem;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class LKQ {
    public final LKT LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public AbstractC53895LDf LIZLLL;
    public boolean LJ;
    public Fragment LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public Bundle LJIIIZ;
    public boolean LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;

    public LKQ(LKT slideContainerAbility) {
        o.LJIIIZ(slideContainerAbility, "slideContainerAbility");
        this.LIZ = slideContainerAbility;
        this.LIZIZ = "";
        this.LJIIJJI = C221108m2.LIZIZ(LKP.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(LKO.LJLIL);
    }

    public final boolean LIZIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null || this.LIZLLL == null) {
            return false;
        }
        if (this.LIZJ) {
            return true;
        }
        if ((!TextUtils.equals(this.LIZIZ, "scroll_to_slide") && !TextUtils.equals(this.LIZIZ, "click_top_icon")) || !(C116694i1.LIZ(activityC45651qj).ov0() instanceof InterfaceC54054LJi) || this.LIZ.zc() || !this.LJIIIIZZ) {
            return false;
        }
        return true;
    }

    public final void LIZLLL(String from) {
        o.LJIIIZ(from, "from");
        this.LIZIZ = from;
        if (from.length() == 0) {
            return;
        }
        LKR.LJ = from;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(boolean r10) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKQ.LJ(boolean):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserLoginSuccessfully(C175256uH c175256uH) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        C221018lt.LJFF("CustomSlideManager", "onUserLoginSuccessfully, clearLoginFragment");
        C221018lt.LJFF("CustomSlideManager", "removeCustomSlidePage");
        Fragment fragment2 = this.LJFF;
        if (fragment2 != null) {
            Object obj = this.LIZ;
            if ((obj instanceof Fragment) && (fragment = (Fragment) obj) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
                C1B3 c1b3 = new C1B3(childFragmentManager);
                this.LJII = false;
                c1b3.LJJI(fragment2);
                c1b3.LJI();
            }
        }
        this.LJI = false;
        this.LJII = false;
        this.LJFF = null;
        this.LIZLLL = null;
        this.LJ = false;
        this.LJIIIIZZ = false;
    }

    public final void LIZJ(boolean z, Bundle bundle) {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        String str;
        String tag;
        o.LJIIIZ(bundle, "bundle");
        if (!this.LJII) {
            return;
        }
        if (z && this.LJFF == null) {
            this.LJIIIZ = bundle;
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin() && z) {
            C1DH.LJJIJIIJI(new ARunnableS45S0100000_9(this, 117));
            return;
        }
        Object obj = this.LIZ;
        if (!(obj instanceof Fragment) || (fragment = (Fragment) obj) == null || (mo49getActivity = fragment.mo49getActivity()) == null || !(this.LJFF instanceof InterfaceC53896LDg)) {
            return;
        }
        if (z) {
            AbstractC53895LDf abstractC53895LDf = this.LIZLLL;
            if (abstractC53895LDf != null && (tag = abstractC53895LDf.tag()) != null) {
                LKR.LIZJ = tag;
                com.bytedance.hox.Hox.LJLLI.LIZ(mo49getActivity).Av0(tag);
            }
            this.LIZ.l9(Fragment.class, new AqS156S0200000_9(this, bundle, 53));
            return;
        }
        AbstractC53895LDf abstractC53895LDf2 = this.LIZLLL;
        if (abstractC53895LDf2 != null) {
            str = abstractC53895LDf2.tag();
        } else {
            str = null;
        }
        LKR.LIZLLL = str;
        LKR.LIZJ = null;
        Fragment fragment2 = this.LJFF;
        LKR.LIZ = false;
        LKR.LIZIZ = fragment2;
        C84193Sd.LIZ(mo49getActivity).LLFF.setValue(new OSJ<>(Boolean.TRUE, this.LJFF, Boolean.FALSE));
        com.bytedance.hox.Hox.LJLLI.LIZ(mo49getActivity).Av0("profile_fake_child");
    }

    public final void LIZ(ScrollSwitchStateManager stateManager, int i, ActivityC45651qj activityC45651qj) {
        SlidePage LJII;
        SlidePageItem slidePageItem;
        o.LJIIIZ(stateManager, "stateManager");
        if (activityC45651qj != null && C40471FuV.LIZ() && i == 1 && TextUtils.equals("page_feed", stateManager.hv0()) && (C116694i1.LIZ(activityC45651qj).ov0() instanceof InterfaceC54054LJi)) {
            if (!this.LIZ.zc() && (LJII = C53765L8f.LJII()) != null && (slidePageItem = LJII.right) != null && slidePageItem.scope == 2) {
                LJ(false);
                return;
            }
            if (this.LJII) {
                this.LIZ.o9();
            }
            LIZLLL("");
            this.LJIIIIZZ = false;
            this.LJII = false;
        }
    }
}
