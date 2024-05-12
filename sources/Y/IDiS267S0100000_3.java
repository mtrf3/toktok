package Y;

import X.AnonymousClass759;
import X.C0C3;
import X.C187167We;
import X.C200847uS;
import X.C212418Vh;
import X.C218478hn;
import X.C220828la;
import X.C222038nX;
import X.C222588oQ;
import X.C2MA;
import X.C54297LSr;
import X.C55723Ltv;
import X.C71Y;
import X.C76800UCe;
import X.EnumC215438ct;
import X.H7B;
import X.InterfaceC222068na;
import X.InterfaceC222838op;
import X.InterfaceC224548ra;
import X.InterfaceC36571c5;
import X.InterfaceC51679KPz;
import X.InterfaceC57312Mt;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.detail.panel.PoiCollectPanel;
import com.ss.android.ugc.aweme.detail.panel.PublishVideoPreviewPanel;
import com.ss.android.ugc.aweme.detail.panel.StoryDetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.publish.PublishStatus;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionViewPagerComponent;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.now.interaction.ui.InteractionFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDiS267S0100000_3 implements C0C3 {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
    }

    public static final void onPageScrollStateChanged$1(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
    }

    public static final void onPageScrollStateChanged$2(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
    }

    public static final void onPageScrollStateChanged$5(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
    }

    public static final void onPageScrollStateChanged$6(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
    }

    public static final void onPageScrolled$0(IDiS267S0100000_3 iDiS267S0100000_3, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(IDiS267S0100000_3 iDiS267S0100000_3, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(IDiS267S0100000_3 iDiS267S0100000_3, int i, float f, int i2) {
    }

    public static final void onPageScrolled$3(IDiS267S0100000_3 iDiS267S0100000_3, int i, float f, int i2) {
    }

    public static final void onPageScrolled$4(IDiS267S0100000_3 iDiS267S0100000_3, int i, float f, int i2) {
    }

    public static final void onPageScrolled$6(IDiS267S0100000_3 iDiS267S0100000_3, int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                return;
            case 1:
                onPageScrollStateChanged$1(this, i);
                return;
            case 2:
                onPageScrollStateChanged$2(this, i);
                return;
            case 3:
                onPageScrollStateChanged$3(this, i);
                return;
            case 4:
                onPageScrollStateChanged$4(this, i);
                return;
            case 5:
                onPageScrollStateChanged$5(this, i);
                return;
            case 6:
                onPageScrollStateChanged$6(this, i);
                return;
            case 7:
                onPageScrollStateChanged$7(this, i);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                return;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                return;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                return;
            case 3:
                onPageScrolled$3(this, i, f, i2);
                return;
            case 4:
                onPageScrolled$4(this, i, f, i2);
                return;
            case 5:
                onPageScrolled$5(this, i, f, i2);
                return;
            case 6:
                onPageScrolled$6(this, i, f, i2);
                return;
            case 7:
                onPageScrolled$7(this, i, f, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                return;
            case 1:
                onPageSelected$1(this, i);
                return;
            case 2:
                onPageSelected$2(this, i);
                return;
            case 3:
                onPageSelected$3(this, i);
                return;
            case 4:
                onPageSelected$4(this, i);
                return;
            case 5:
                onPageSelected$5(this, i);
                return;
            case 6:
                onPageSelected$6(this, i);
                return;
            case 7:
                onPageSelected$7(this, i);
                return;
            default:
                return;
        }
    }

    public IDiS267S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$3(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        InterfaceC57312Mt LJIIIIZZ;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            C222038nX c222038nX = (C222038nX) iDiS267S0100000_3.l0;
            C2MA c2ma = c222038nX.LJLILLLLZI;
            if ((c2ma != null || (c2ma = c222038nX.Y6()) != null) && (LJIIIIZZ = c2ma.LJIIIIZZ()) != null) {
                LJIIIIZZ.o2();
            }
            ((C222038nX) iDiS267S0100000_3.l0).HM(EnumC215438ct.LOOP_CURRENT_VIDEO);
            if (C220828la.LIZ().getBoolean("key_has_performed_swipe", false)) {
                return;
            }
            C220828la.LIZ().storeBoolean("key_has_performed_swipe", true);
            return;
        }
        C222038nX c222038nX2 = (C222038nX) iDiS267S0100000_3.l0;
        InterfaceC222068na LJIJ = C55723Ltv.LIZIZ.LJIJ();
        C222588oQ c222588oQ = ((C222038nX) iDiS267S0100000_3.l0).LJLIL;
        c222038nX2.HM(LJIJ.LJII(c222588oQ.LJIIIZ, c222588oQ.LJ.param.getFrom()));
    }

    public static final void onPageScrollStateChanged$4(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        C2MA jX;
        InterfaceC57312Mt LJIIIIZZ;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) ((FeedCollectionViewPagerComponent) iDiS267S0100000_3.l0).LLFII.getValue();
            if (storyCollectionCellAbility != null && (jX = storyCollectionCellAbility.jX()) != null && (LJIIIIZZ = jX.LJIIIIZZ()) != null) {
                LJIIIIZZ.o2();
            }
            ((FeedCollectionViewPagerComponent) iDiS267S0100000_3.l0).k1(EnumC215438ct.LOOP_CURRENT_VIDEO);
            FeedCollectionViewPagerComponent feedCollectionViewPagerComponent = (FeedCollectionViewPagerComponent) iDiS267S0100000_3.l0;
            if (!feedCollectionViewPagerComponent.LLIL) {
                return;
            }
            feedCollectionViewPagerComponent.LLIL = false;
            feedCollectionViewPagerComponent.k4().setOffscreenPageLimit(1);
            return;
        }
        ((FeedCollectionViewPagerComponent) iDiS267S0100000_3.l0).k1(C55723Ltv.LIZIZ.LJIJ().LJII(((FeedCollectionViewPagerComponent) iDiS267S0100000_3.l0).g4().LJIIIZ, ((FeedCollectionViewPagerComponent) iDiS267S0100000_3.l0).g4().LJ.param.getFrom()));
    }

    public static final void onPageScrollStateChanged$7(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        ScrollSwitchStateManager scrollSwitchStateManager = ((PostModeDetailPageFragment) iDiS267S0100000_3.l0).LJLJJLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LJLJLLL.setValue(Integer.valueOf(i));
        }
        PostModeContainerViewModel postModeContainerViewModel = (PostModeContainerViewModel) ((PostModeDetailPageFragment) iDiS267S0100000_3.l0).LJLL.getValue();
        if (postModeContainerViewModel.LLILZ) {
            postModeContainerViewModel.LLILZ = false;
            postModeContainerViewModel.LJLJI.setValue(C76800UCe.LIZ);
        }
    }

    public static final void onPageSelected$0(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        InterfaceC224548ra interfaceC224548ra = (InterfaceC224548ra) ((PoiCollectPanel) iDiS267S0100000_3.l0).LLJJJJ.getValue();
        if (interfaceC224548ra != null) {
            interfaceC224548ra.R1(((PoiCollectPanel) iDiS267S0100000_3.l0).LJJLJ());
        }
    }

    public static final void onPageSelected$1(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        InterfaceC222838op interfaceC222838op;
        StoryDetailFragmentPanel storyDetailFragmentPanel = (StoryDetailFragmentPanel) iDiS267S0100000_3.l0;
        InterfaceC51679KPz interfaceC51679KPz = storyDetailFragmentPanel.LJLL;
        if ((interfaceC51679KPz instanceof InterfaceC222838op) && (interfaceC222838op = (InterfaceC222838op) interfaceC51679KPz) != null) {
            interfaceC222838op.qN(i, storyDetailFragmentPanel.getCurrentPlayAweme());
        }
    }

    public static final void onPageSelected$2(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        boolean z;
        PublishStatus publishStatus;
        PublishPreviewInfo previewData;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishVideoPreviewPanel -> onPageSelected -> showRetry() -> position = ");
        LIZ.append(i);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        Aweme item = ((PublishVideoPreviewPanel) iDiS267S0100000_3.l0).mAdapter.getItem(i);
        if (item != null && (previewData = item.getPreviewData()) != null && !previewData.getInPublishing()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = ((PublishVideoPreviewPanel) iDiS267S0100000_3.l0).LLJJJIL;
            if (view != null) {
                view.setVisibility(8);
            }
            ((PublishVideoPreviewPanel) iDiS267S0100000_3.l0).LJLZ(true);
            return;
        }
        View view2 = ((PublishVideoPreviewPanel) iDiS267S0100000_3.l0).LLJJJIL;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        ((PublishVideoPreviewPanel) iDiS267S0100000_3.l0).LJLZ(false);
        Aweme item2 = ((PublishVideoPreviewPanel) iDiS267S0100000_3.l0).mAdapter.getItem(i);
        if (item2 == null) {
            return;
        }
        PublishVideoPreviewPanel publishVideoPreviewPanel = (PublishVideoPreviewPanel) iDiS267S0100000_3.l0;
        String scheduleId = item2.getScheduleId();
        o.LJIIIIZZ(scheduleId, "it.scheduleId");
        publishVideoPreviewPanel.LLIILZL(scheduleId);
        PublishPreviewInfo previewData2 = item2.getPreviewData();
        if (previewData2 != null) {
            publishStatus = previewData2.getPublishStatus();
        } else {
            publishStatus = null;
        }
        if (publishStatus != PublishStatus.FAILED) {
            return;
        }
        H7B.LIZJ("PublishVideoPreviewPanel -> onPageSelected -> showRetry()");
        View view3 = publishVideoPreviewPanel.LLJJJIL;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        String scheduleId2 = item2.getScheduleId();
        o.LJIIIIZZ(scheduleId2, "it.scheduleId");
        publishVideoPreviewPanel.LLIIJLIL(scheduleId2);
    }

    public static final void onPageSelected$3(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        boolean z;
        int i2;
        C222038nX c222038nX = (C222038nX) iDiS267S0100000_3.l0;
        if (!c222038nX.LLII || ((i2 = c222038nX.LJLJJLL) != -1 && i2 != i)) {
            z = true;
        } else {
            z = false;
        }
        c222038nX.LIZLLL(i, z);
    }

    public static final void onPageSelected$4(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        boolean z;
        int i2;
        FeedCollectionViewPagerComponent feedCollectionViewPagerComponent = (FeedCollectionViewPagerComponent) iDiS267S0100000_3.l0;
        if (!feedCollectionViewPagerComponent.LLI || ((i2 = feedCollectionViewPagerComponent.LLIIIZ) != -1 && i2 != i)) {
            z = true;
        } else {
            z = false;
        }
        feedCollectionViewPagerComponent.n4(i, z);
    }

    public static final void onPageSelected$5(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" mViewPager onPageSelected");
        LIZ.append(i);
        C71Y.LIZ("comment_page", X1D.LIZIZ(LIZ));
        ((CommentListPageFragment) iDiS267S0100000_3.l0).Wl(i);
    }

    public static final void onPageSelected$6(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        int i2;
        C218478hn c218478hn;
        InteractionFragment interactionFragment = (InteractionFragment) iDiS267S0100000_3.l0;
        interactionFragment.Al(interactionFragment.LJLL, i, "");
        InteractionFragment interactionFragment2 = (InteractionFragment) iDiS267S0100000_3.l0;
        if (interactionFragment2.LJLJLLL == null) {
            return;
        }
        List<Integer> list = interactionFragment2.LJLLI;
        if (list != null) {
            i2 = ((LinkedList) list).size();
        } else {
            i2 = 0;
        }
        if (i >= i2 || (c218478hn = interactionFragment2.LJLIL) == null) {
            return;
        }
        c218478hn.setEnableSwipeRightToClose(false);
    }

    public static final void onPageSelected$7(IDiS267S0100000_3 iDiS267S0100000_3, int i) {
        PostModeDetailFragment postModeDetailFragment;
        PostModeDetailParams postModeDetailParams;
        String str;
        PostModeDetailParams postModeDetailParams2;
        String str2;
        C54297LSr c54297LSr = ((PostModeDetailPageFragment) iDiS267S0100000_3.l0).LJLJJI;
        CommonPageFragment commonPageFragment = null;
        if (c54297LSr != null) {
            commonPageFragment = c54297LSr.LJJIII("PostModeDetailFragment");
        }
        if ((commonPageFragment instanceof PostModeDetailFragment) && (postModeDetailFragment = (PostModeDetailFragment) commonPageFragment) != null) {
            postModeDetailFragment.LJLJI = i;
            String str3 = "";
            if (i == 0) {
                C212418Vh.LJIIL(postModeDetailFragment.Dl(), new AqS169S0100000_3(postModeDetailFragment, 1016));
                postModeDetailFragment.Gl().LJLLLL.setValue(C76800UCe.LIZ);
                IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
                C200847uS c200847uS = postModeDetailFragment.LJLJL;
                if (c200847uS != null && (postModeDetailParams2 = c200847uS.LJI) != null && (str2 = postModeDetailParams2.previousPage) != null) {
                    str3 = str2;
                }
                LJIIIZ.LIZ(str3, new C187167We(postModeDetailFragment));
            } else {
                postModeDetailFragment.pausePlayer();
                postModeDetailFragment.Gl().LJLLLLLL.setValue(C76800UCe.LIZ);
                IScreenshotService LJIIIZ2 = ScreenShotService.LJIIIZ();
                C200847uS c200847uS2 = postModeDetailFragment.LJLJL;
                if (c200847uS2 != null && (postModeDetailParams = c200847uS2.LJI) != null && (str = postModeDetailParams.previousPage) != null) {
                    str3 = str;
                }
                LJIIIZ2.LJI(str3);
            }
        }
        ScrollSwitchStateManager scrollSwitchStateManager = ((PostModeDetailPageFragment) iDiS267S0100000_3.l0).LJLJJLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LJLJLJ.setValue(Integer.valueOf(i));
        }
        ((PostModeContainerViewModel) ((PostModeDetailPageFragment) iDiS267S0100000_3.l0).LJLL.getValue()).LLFII.setValue(Integer.valueOf(i));
    }

    public static final void onPageScrolled$5(IDiS267S0100000_3 iDiS267S0100000_3, int i, float f, int i2) {
        AnonymousClass759 anonymousClass759;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" mViewPager onPageScrolled:");
        LIZ.append(i);
        LIZ.append(" positionOffset:");
        LIZ.append(f);
        LIZ.append(" positionOffsetPixels:");
        LIZ.append(i2);
        C71Y.LIZ("comment_page", X1D.LIZIZ(LIZ));
        Iterator it = ((ArrayList) ((CommentListPageFragment) iDiS267S0100000_3.l0).LJLLL).iterator();
        while (it.hasNext()) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
            if ((interfaceC36571c5 instanceof AnonymousClass759) && (anonymousClass759 = (AnonymousClass759) interfaceC36571c5) != null) {
                anonymousClass759.D0(f, i);
            }
        }
    }

    public static final void onPageScrolled$7(IDiS267S0100000_3 iDiS267S0100000_3, int i, float f, int i2) {
        ScrollSwitchStateManager scrollSwitchStateManager = ((PostModeDetailPageFragment) iDiS267S0100000_3.l0).LJLJJLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.sv0(f, i, i2);
        }
    }
}
