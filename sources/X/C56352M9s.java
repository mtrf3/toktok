package X;

import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.M9s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56352M9s {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C56353M9t.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C56354M9u.LJLIL);

    public final List<InterfaceC57784Mm4> LIZ() {
        C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
        StoryInboxItem storyInboxItem = new StoryInboxItem(c55723Ltv.LJIL().LJI(), 0, false, 6, null);
        boolean z = !C54838Lfe.LJIJI(storyInboxItem.getStoryCollection());
        boolean shouldShowShootingEntrance = ((IStoryInboxService) this.LIZ.getValue()).shouldShowShootingEntrance(true, z);
        ArrayList arrayList = new ArrayList();
        if (shouldShowShootingEntrance && (c55723Ltv.LJIILJJIL().LIZIZ() || z)) {
            arrayList.add(storyInboxItem);
        }
        List<InterfaceC57784Mm4> first = ((IAppWidgetService) this.LIZIZ.getValue()).LJII(arrayList).getFirst();
        int LIZJ = C53432Ky4.LIZJ();
        for (int size = first.size(); size < LIZJ; size++) {
            first.add(new M9J());
        }
        return first;
    }
}
