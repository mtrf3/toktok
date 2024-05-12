package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.8ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222308ny extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, C76800UCe> {
    public static final C222308ny LJLIL = new C222308ny();

    public C222308ny() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Aweme aweme) {
        Aweme invisibleStory = aweme;
        o.LJIIIZ(invisibleStory, "invisibleStory");
        invisibleStory.setVideo((Video) StoryVideoViewHolder.LLZZZZ.getValue());
        return C76800UCe.LIZ;
    }
}
