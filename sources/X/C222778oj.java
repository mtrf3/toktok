package X;

import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem;
import kotlin.jvm.internal.o;

/* renamed from: X.8oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222778oj {
    public static boolean LIZ(StoryImmersiveFeedItem storyImmersiveFeedItem, InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        if (!(other instanceof StoryImmersiveFeedItem)) {
            return false;
        }
        return o.LJ(C54838Lfe.LJIIIIZZ(storyImmersiveFeedItem.getStoryCollection()), C54838Lfe.LJIIIIZZ(((StoryImmersiveFeedItem) other).getStoryCollection()));
    }
}
