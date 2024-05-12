package X;

import com.ss.android.ugc.aweme.component.NearbyFeedComponent;
import com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility;
import com.ss.android.ugc.aweme.ui.INearbyToFYPAssemAbility;

/* loaded from: classes10.dex */
public final class LXJ implements InterfaceC55109Lk1 {
    public final /* synthetic */ NearbyFeedComponent LIZ;

    @Override // X.InterfaceC55109Lk1
    public final void onShow() {
    }

    @Override // X.InterfaceC55109Lk1
    public final void onHide() {
        INearbyContentAssemAbility iNearbyContentAssemAbility;
        ActivityC45651qj mo49getActivity;
        INearbyToFYPAssemAbility iNearbyToFYPAssemAbility;
        ActivityC45651qj mo49getActivity2 = this.LIZ.A3().mo49getActivity();
        if (mo49getActivity2 != null && (iNearbyContentAssemAbility = (INearbyContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity2, null), INearbyContentAssemAbility.class, null)) != null && !iNearbyContentAssemAbility.LJJZZI() && (mo49getActivity = this.LIZ.A3().mo49getActivity()) != null && (iNearbyToFYPAssemAbility = (INearbyToFYPAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity, null), INearbyToFYPAssemAbility.class, null)) != null) {
            iNearbyToFYPAssemAbility.LJLJLJ();
        }
    }

    public LXJ(NearbyFeedComponent nearbyFeedComponent) {
        this.LIZ = nearbyFeedComponent;
    }
}
