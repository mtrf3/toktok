package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialTextViewTagAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211158Ql extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedSocialTextViewTagAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C211158Ql LJLIL = new C211158Ql();

    public C211158Ql() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedSocialTextViewTagAssem feedSocialTextViewTagAssem, C43I<? extends Integer> c43i) {
        ViewGroup viewGroup;
        FeedSocialTextViewTagAssem selectSubscribe = feedSocialTextViewTagAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C59251NNf.LIZIZ(3, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) {
            InteractVideoTagAbility interactVideoTagAbility = (InteractVideoTagAbility) selectSubscribe.LLFZ.getValue();
            if (interactVideoTagAbility != null) {
                viewGroup = interactVideoTagAbility.getContainerView();
            } else {
                viewGroup = null;
            }
            TagLayout tagLayout = selectSubscribe.LLI;
            if (tagLayout != null) {
                C253039wR.LJ(viewGroup, tagLayout);
            } else {
                o.LJIJI("tagLayout");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
