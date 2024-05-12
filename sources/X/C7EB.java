package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.7EB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7EB extends AbstractC65781Prl implements InterfaceC88471Ynr<StoryViewerEntranceComponent, Integer, C76800UCe> {
    public static final C7EB LJLIL = new C7EB();

    public C7EB() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(StoryViewerEntranceComponent storyViewerEntranceComponent, Integer num) {
        Integer LIZJ;
        StoryViewerEntranceComponent selectSubscribe = storyViewerEntranceComponent;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TuxTextView tuxTextView = selectSubscribe.LLFII;
        if (tuxTextView != null && (LIZJ = C72972SkS.LIZJ(tuxTextView, "context", intValue)) != null) {
            tuxTextView.setTextColor(LIZJ.intValue());
        }
        return C76800UCe.LIZ;
    }
}
