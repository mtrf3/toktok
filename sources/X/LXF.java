package X;

import com.ss.android.ugc.aweme.ui.FeedNearbyFragment;
import com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility;
import com.ss.android.ugc.aweme.ui.INearbyEmptyAssemAbility;
import com.ss.android.ugc.aweme.ui.INearbyToFYPAssemAbility;

/* loaded from: classes10.dex */
public final class LXF implements InterfaceC55109Lk1 {
    public final /* synthetic */ FeedNearbyFragment LIZ;

    @Override // X.InterfaceC55109Lk1
    public final void onShow() {
    }

    @Override // X.InterfaceC55109Lk1
    public final void onHide() {
        INearbyContentAssemAbility iNearbyContentAssemAbility;
        ActivityC45651qj mo49getActivity;
        INearbyToFYPAssemAbility iNearbyToFYPAssemAbility;
        INearbyEmptyAssemAbility iNearbyEmptyAssemAbility;
        ActivityC45651qj mo49getActivity2 = this.LIZ.mo49getActivity();
        if (mo49getActivity2 != null && (iNearbyContentAssemAbility = (INearbyContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity2, null), INearbyContentAssemAbility.class, null)) != null && !iNearbyContentAssemAbility.LJJZZI()) {
            ActivityC45651qj mo49getActivity3 = this.LIZ.mo49getActivity();
            if ((mo49getActivity3 != null && (iNearbyEmptyAssemAbility = (INearbyEmptyAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity3, null), INearbyEmptyAssemAbility.class, null)) != null && iNearbyEmptyAssemAbility.LLF()) || (mo49getActivity = this.LIZ.mo49getActivity()) == null || (iNearbyToFYPAssemAbility = (INearbyToFYPAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity, null), INearbyToFYPAssemAbility.class, null)) == null) {
                return;
            }
            iNearbyToFYPAssemAbility.LJLJLJ();
        }
    }

    public LXF(FeedNearbyFragment feedNearbyFragment) {
        this.LIZ = feedNearbyFragment;
    }
}
