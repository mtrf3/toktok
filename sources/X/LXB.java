package X;

import com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicToFYPAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment;

/* loaded from: classes10.dex */
public final class LXB extends AbstractC244919jL {
    public final /* synthetic */ BaseTopicFeedFragment LIZ;

    @Override // X.AbstractC244919jL, X.InterfaceC55109Lk1
    public final void onHide() {
        ITopicContentAssemAbility iTopicContentAssemAbility;
        ITopicToFYPAssemAbility iTopicToFYPAssemAbility;
        ITopicContentAssemAbility iTopicContentAssemAbility2 = (ITopicContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LIZ, null), ITopicContentAssemAbility.class, null);
        if (iTopicContentAssemAbility2 != null && !iTopicContentAssemAbility2.LJJZZI() && (iTopicContentAssemAbility = (ITopicContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LIZ, null), ITopicContentAssemAbility.class, null)) != null && !iTopicContentAssemAbility.LLILZLL() && (iTopicToFYPAssemAbility = (ITopicToFYPAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LIZ, null), ITopicToFYPAssemAbility.class, null)) != null) {
            iTopicToFYPAssemAbility.LJLJLJ();
        }
    }

    public LXB(BaseTopicFeedFragment baseTopicFeedFragment) {
        this.LIZ = baseTopicFeedFragment;
    }
}
