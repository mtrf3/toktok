package X;

import com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment;
import com.ss.android.ugc.aweme.popularfeed.ui.IPopularContentAssemAbility;
import com.ss.android.ugc.aweme.popularfeed.ui.IPopularToFYPAssemAbility;

/* loaded from: classes10.dex */
public final class LX8 extends AbstractC244919jL {
    public final /* synthetic */ FeedPopularFragment LIZ;

    @Override // X.AbstractC244919jL, X.InterfaceC55109Lk1
    public final void onHide() {
        IPopularContentAssemAbility iPopularContentAssemAbility;
        IPopularToFYPAssemAbility iPopularToFYPAssemAbility;
        IPopularContentAssemAbility iPopularContentAssemAbility2 = (IPopularContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LIZ, null), IPopularContentAssemAbility.class, null);
        if (iPopularContentAssemAbility2 != null && !iPopularContentAssemAbility2.LJJZZI() && (iPopularContentAssemAbility = (IPopularContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LIZ, null), IPopularContentAssemAbility.class, null)) != null && !iPopularContentAssemAbility.LLILZLL() && (iPopularToFYPAssemAbility = (IPopularToFYPAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LIZ, null), IPopularToFYPAssemAbility.class, null)) != null) {
            iPopularToFYPAssemAbility.LJLJLJ();
        }
    }

    public LX8(FeedPopularFragment feedPopularFragment) {
        this.LIZ = feedPopularFragment;
    }
}
