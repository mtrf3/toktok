package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionViewPagerComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222088nc extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedCollectionViewPagerComponent, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C222088nc LJLIL = new C222088nc();

    public C222088nc() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedCollectionViewPagerComponent feedCollectionViewPagerComponent, C43I<? extends C76800UCe> c43i) {
        int i;
        FeedCollectionViewPagerComponent selectSubscribe = feedCollectionViewPagerComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            int currentItem = selectSubscribe.k4().getCurrentItem() + 1;
            UserStory userStory = selectSubscribe.LLIIJI;
            if (userStory != null) {
                i = (int) userStory.getTotalCount();
            } else {
                i = 0;
            }
            if (currentItem >= i) {
                ((AssemViewModel) selectSubscribe.LLD.getValue()).setState(C222158nj.LJLIL);
            }
        }
        return C76800UCe.LIZ;
    }
}
