package X;

import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.7E9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7E9 extends AbstractC65781Prl implements InterfaceC88471Ynr<StoryViewerEntranceComponent, OSZ<? extends String, ? extends Long>, C76800UCe> {
    public static final C7E9 LJLIL = new C7E9();

    public C7E9() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(StoryViewerEntranceComponent storyViewerEntranceComponent, OSZ<? extends String, ? extends Long> osz) {
        StoryViewerEntranceComponent selectSubscribe = storyViewerEntranceComponent;
        OSZ<? extends String, ? extends Long> osz2 = osz;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (osz2 != null) {
            String first = osz2.getFirst();
            long longValue = osz2.getSecond().longValue();
            if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), first)) {
                selectSubscribe.r4(longValue);
                AwemeStatistics statistics = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getStatistics();
                if (statistics != null) {
                    statistics.setPlayCount(longValue);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
