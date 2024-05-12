package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionViewPagerComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222078nb extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedCollectionViewPagerComponent, C43I<? extends String>, C76800UCe> {
    public static final C222078nb LJLIL = new C222078nb();

    public C222078nb() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedCollectionViewPagerComponent feedCollectionViewPagerComponent, C43I<? extends String> c43i) {
        T t;
        Aweme aweme;
        UserStory userStory;
        List<Aweme> stories;
        FeedCollectionViewPagerComponent selectSubscribe = feedCollectionViewPagerComponent;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (t = c43i2.LIZ) != 0 && (aweme = selectSubscribe.LLIIJLIL) != null && (userStory = aweme.getUserStory()) != null && (stories = userStory.getStories()) != null) {
            Iterator<Aweme> it = stories.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Aweme next = it.next();
                if (o.LJ(next.getAid(), t)) {
                    if (next != null) {
                        InterfaceC222288nw interfaceC222288nw = selectSubscribe.LLILII;
                        if (interfaceC222288nw != null) {
                            interfaceC222288nw.dispose();
                        }
                        selectSubscribe.LLILII = null;
                        if (selectSubscribe.LLIL) {
                            selectSubscribe.LLIL = false;
                            selectSubscribe.k4().setOffscreenPageLimit(1);
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
