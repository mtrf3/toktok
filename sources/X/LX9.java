package X;

import com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility;
import com.ss.android.ugc.aweme.stemfeed.ui.IStemToFYPAssemAbility;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedFragment;

/* loaded from: classes10.dex */
public final class LX9 extends AbstractC244919jL {
    public final /* synthetic */ StemFeedFragment LIZ;

    @Override // X.AbstractC244919jL, X.InterfaceC55109Lk1
    public final void onHide() {
        IStemContentAssemAbility iStemContentAssemAbility;
        IStemToFYPAssemAbility iStemToFYPAssemAbility;
        IStemContentAssemAbility iStemContentAssemAbility2 = (IStemContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LIZ, null), IStemContentAssemAbility.class, null);
        if (iStemContentAssemAbility2 != null && !iStemContentAssemAbility2.LJJZZI() && (iStemContentAssemAbility = (IStemContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LIZ, null), IStemContentAssemAbility.class, null)) != null && !iStemContentAssemAbility.LLILZLL() && (iStemToFYPAssemAbility = (IStemToFYPAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LIZ, null), IStemToFYPAssemAbility.class, null)) != null) {
            iStemToFYPAssemAbility.LJLJLJ();
        }
    }

    public LX9(StemFeedFragment stemFeedFragment) {
        this.LIZ = stemFeedFragment;
    }
}
