package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.7cG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189567cG extends AbstractC65781Prl implements InterfaceC88471Ynr<StoryViewerEntranceComponent, C43I<? extends C70012ov>, C76800UCe> {
    public static final C189567cG LJLIL = new C189567cG();

    public C189567cG() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(StoryViewerEntranceComponent storyViewerEntranceComponent, C43I<? extends C70012ov> c43i) {
        C70012ov c70012ov;
        Aweme aweme;
        Context context;
        BaseFeedPageParams baseFeedPageParams;
        M89 m89;
        C189517cB storyInsertUserWrapper;
        StoryViewerEntranceComponent selectSubscribe = storyViewerEntranceComponent;
        C43I<? extends C70012ov> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c70012ov = (C70012ov) c43i2.LIZ) != null && o.LJ(c70012ov.LJLIL, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme()) && (aweme = c70012ov.LJLIL) != null && (context = selectSubscribe.getContext()) != null && !C54838Lfe.LJJ(aweme) && C78996UzQ.LJJIIZI(aweme) && (baseFeedPageParams = selectSubscribe.a1().LJ) != null && (m89 = baseFeedPageParams.param) != null && (storyInsertUserWrapper = m89.getStoryInsertUserWrapper()) != null && !storyInsertUserWrapper.getInsertUsers().isEmpty()) {
            selectSubscribe.LLIFFJFJJ = storyInsertUserWrapper;
            selectSubscribe.dd0(context, "auto");
            m89.setStoryInsertUserWrapper(null);
        }
        return C76800UCe.LIZ;
    }
}
