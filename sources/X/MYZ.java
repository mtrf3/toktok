package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MYZ extends AbstractC116364hU<StoryInboxItem> {
    public final C62822Ol8 LIZJ;
    public final SkylightListViewModel LIZLLL;
    public List<? extends Aweme> LJ;

    @Override // X.AbstractC116364hU
    public final Object LIZLLL() {
        boolean z;
        List<?> list;
        Iterator<? extends Aweme> it = this.LJ.iterator();
        while (it.hasNext()) {
            this.LIZIZ.add(new StoryInboxItem(it.next(), this.LIZ.LJI(5), false, 4, null));
        }
        AbstractC116364hU<?> abstractC116364hU = this.LIZ.LIZLLL().get(EnumC56998MYo.GENERAL);
        boolean z2 = false;
        if (abstractC116364hU != null && (list = abstractC116364hU.LIZIZ) != null && !list.isEmpty()) {
            Iterator<?> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof AbstractC54715Ldf) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z3 = !this.LIZIZ.isEmpty();
        C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
        StoryInboxItem storyInboxItem = new StoryInboxItem(c55723Ltv.LJIL().LJI(), 0, true, 2, null);
        boolean z4 = !C54838Lfe.LJIJI(storyInboxItem.getStoryCollection());
        IStoryInboxService iStoryInboxService = (IStoryInboxService) this.LIZJ.getValue();
        if (z3 || z4) {
            z2 = true;
        }
        if (iStoryInboxService.shouldShowShootingEntrance(z, z2) && ((c55723Ltv.LJIILJJIL().LIZIZ() || z4) && ((IStoryInboxService) this.LIZJ.getValue()).canShowStoryCell() && storyInboxItem != null)) {
            this.LIZIZ.add(StoryInboxItem.copy$default(storyInboxItem, null, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, false, 5, null));
        }
        return this;
    }

    @Override // X.AbstractC116364hU
    public final C76800UCe LIZ() {
        SkylightListViewModel skylightListViewModel = this.LIZLLL;
        if (skylightListViewModel != null) {
            AssemViewModel.asyncSubscribe$default(skylightListViewModel, new TBT() { // from class: X.MYx
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((InboxSkylightListState) obj).getRefreshState();
                }
            }, C213688a4.LIZLLL(), null, null, new AqS175S0100000_9(this, 403), 12, null);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC116364hU
    public final Object LIZJ() {
        List<? extends Aweme> list = this.LJ;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            Aweme aweme2 = aweme;
            String LJIIIIZZ = C54838Lfe.LJIIIIZZ(aweme2);
            boolean z = !C54838Lfe.LJIJI(aweme2);
            InterfaceC116134h7 interfaceC116134h7 = this.LIZ;
            if (interfaceC116134h7.LJFF(interfaceC116134h7.LJI(5), LJIIIIZZ) && !C54838Lfe.LJIIJJI(LJIIIIZZ) && z) {
                this.LIZ.LIZ().put(LJIIIIZZ, new Integer(this.LIZ.LJI(5)));
                arrayList.add(aweme);
            }
        }
        this.LJ = C65777Prh.LIZIZ(arrayList);
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MYZ(InterfaceC116134h7 ft) {
        super(ft);
        SkylightListViewModel skylightListViewModel;
        o.LJIIIZ(ft, "ft");
        this.LIZJ = C221108m2.LIZIZ(C57003MYt.LJLIL);
        LifecycleOwner LIZJ = ft.LIZJ();
        if (LIZJ instanceof SkylightListViewModel) {
            skylightListViewModel = (SkylightListViewModel) LIZJ;
        } else {
            skylightListViewModel = null;
        }
        this.LIZLLL = skylightListViewModel;
        this.LJ = new ArrayList();
    }

    @Override // X.AbstractC116364hU
    public final Object LIZIZ(InterfaceC67352kd<? super AbstractC116364hU<StoryInboxItem>> interfaceC67352kd) {
        List<Aweme> list;
        this.LIZIZ.clear();
        if (((IStoryInboxService) this.LIZJ.getValue()).canShowStoryCell()) {
            InboxHorizontalTopListCombinePod LJII = this.LIZ.LJII();
            C114304eA.LIZIZ(new AqS159S0100000_9(LJII, 789));
            StoryGetFeedByPageResponse preloadGetFeedByPageResponse = ((IStoryInboxService) this.LIZJ.getValue()).getPreloadGetFeedByPageResponse();
            if (preloadGetFeedByPageResponse != null && LJII.getStoryGetFeedByPageResponse() == null) {
                LJII = InboxHorizontalTopListCombinePod.copy$default(LJII, null, null, preloadGetFeedByPageResponse, 0L, false, null, null, null, 251, null);
            }
            StoryGetFeedByPageResponse storyGetFeedByPageResponse = LJII.getStoryGetFeedByPageResponse();
            if (storyGetFeedByPageResponse == null || (list = storyGetFeedByPageResponse.getAwemes()) == null) {
                list = C61878OQg.INSTANCE;
            }
        } else {
            list = C61878OQg.INSTANCE;
        }
        this.LJ = list;
        return this;
    }
}
