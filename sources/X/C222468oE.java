package X;

import com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.newarch.StoryVideoViewHolderV2;
import kotlin.jvm.internal.o;

/* renamed from: X.8oE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222468oE extends AbstractC65781Prl implements InterfaceC88472Yns<C222588oQ, InterfaceC55219Lln> {
    public static final C222468oE LJLIL = new C222468oE();

    public C222468oE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC55219Lln invoke(C222588oQ c222588oQ) {
        C222588oQ it = c222588oQ;
        o.LJIIIZ(it, "it");
        if (!C59542Vi.LIZ()) {
            return new StoryVideoViewHolder(it);
        }
        return new StoryVideoViewHolderV2(it);
    }
}
