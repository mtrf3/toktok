package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.LfY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54832LfY implements IStoryInboxService {
    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final boolean canShowStoryCell() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final C48710J9u convertDayResponseToItem(OnThisDayResponse onThisDayResponse) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] getOnThisDayCell() {
        return new Class[0];
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final StoryGetFeedByPageResponse getPreloadGetFeedByPageResponse() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] getStoryCell() {
        return new Class[0];
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void preloadOnBoot() {
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void sendViewedMemorableView(String pastMemoryKey) {
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final boolean shouldShowShootingEntrance(boolean z, boolean z2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final AbstractC73672Svk<OnThisDayResponse> requestOnThisDayData() {
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "empty()");
        return c73536StY;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final AbstractC73672Svk<StoryGetFeedByPageResponse> fetchStoryItems(long j, long j2, String str, EnumC54603Lbr scene) {
        o.LJIIIZ(scene, "scene");
        return C73536StY.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final Object fetchStoryItemsByCont(long j, long j2, String str, EnumC54603Lbr enumC54603Lbr, InterfaceC67352kd<? super StoryGetFeedByPageResponse> interfaceC67352kd) {
        return new StoryGetFeedByPageResponse(C61878OQg.INSTANCE, false, 0L, 0L, null);
    }
}
