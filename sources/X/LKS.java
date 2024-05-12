package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes10.dex */
public final class LKS implements AWU {
    public final /* synthetic */ LKQ LIZ;

    public LKS(LKQ lkq) {
        this.LIZ = lkq;
    }

    @Override // X.AWU
    public final void LJI() {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        C54030LIk.LIZIZ = LJF.GOBACK_ICON.getValue();
        C54154LNe.LJ("profile_2_feed", "click_back");
        Object obj = this.LIZ.LIZ;
        if ((obj instanceof Fragment) && (fragment = (Fragment) obj) != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            C84193Sd.LIZ(mo49getActivity).E50("page_feed", true);
        }
    }
}
