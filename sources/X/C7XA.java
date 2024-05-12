package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.model.StoryAnalytics;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import com.ss.android.ugc.aweme.story.model.StoryViewerListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7XA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7XA implements InterfaceC214228aw<InterfaceC189237bj> {
    public final C7X7 LIZ = new InterfaceC189237bj() { // from class: X.7X7
        @Override // X.InterfaceC189237bj
        public final boolean LJLJJI(String str) {
            C189297bp c189297bp = C189297bp.LIZIZ;
            if (c189297bp != null) {
                return ((java.util.Map) c189297bp.LIZ.getValue()).containsKey(str);
            }
            return false;
        }

        @Override // X.InterfaceC189237bj
        public final List<Object> LJJLJ(Aweme aweme, StoryViewerListResponse response) {
            o.LJIIIZ(response, "response");
            ArrayList arrayList = new ArrayList();
            StoryAnalytics storyAnalytics = response.storyAnalytics;
            if (storyAnalytics != null && response.total > 0) {
                arrayList.add(new C7X8(storyAnalytics.getAccountReached(), storyAnalytics.getFollowersReached()));
            }
            List<StoryInteractionUser> list = response.interactionUserList;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
                Iterator<StoryInteractionUser> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C7X9(it.next()));
                }
                arrayList.addAll(arrayList2);
            }
            if (!response.hasMore && !C54838Lfe.LJJIIJ(aweme)) {
                arrayList.add(new C182067Co());
            }
            return arrayList;
        }

        @Override // X.InterfaceC189237bj
        public final StoryViewerListResponse LJIIL(long j, String storyId, List list) {
            C189297bp c189297bp;
            StoryViewerListResponse storyViewerListResponse;
            o.LJIIIZ(storyId, "storyId");
            if (j == 0 && (c189297bp = C189297bp.LIZIZ) != null && (storyViewerListResponse = (StoryViewerListResponse) ((java.util.Map) c189297bp.LIZ.getValue()).get(storyId)) != null) {
                return storyViewerListResponse;
            }
            StoryViewerListResponse response = StoryApi.LIZIZ.fetchStoryViewerList(storyId, j, 20, C75792yF.LIZJ(list)).execute().LIZIZ;
            C189297bp c189297bp2 = C189297bp.LIZIZ;
            if (c189297bp2 != null) {
                o.LJIIIIZZ(response, "response");
                ((java.util.Map) c189297bp2.LIZ.getValue()).put(storyId, response);
            }
            o.LJIIIIZZ(response, "StoryApi.fetchStoryViewe…save(storyId, response) }");
            return response;
        }
    };

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC189237bj getOperator() {
        return this.LIZ;
    }
}
