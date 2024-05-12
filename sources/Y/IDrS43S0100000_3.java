package Y;

import X.AYA;
import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C0A2;
import X.C0A6;
import X.C118234kV;
import X.C174906ti;
import X.C177336xd;
import X.C188727au;
import X.C208298Fl;
import X.C212428Vi;
import X.C219488jQ;
import X.C227318w3;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C76800UCe;
import X.C78842Uww;
import X.C7CA;
import X.C7DC;
import X.EnumC196967oC;
import X.FMX;
import X.InterfaceC55235Lm3;
import X.K5T;
import X.T5T;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageContentScrollAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mention.ui.assem.VideoCaptionMentionRecommendListAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.NowAreaMonitorAssem;
import com.ss.android.ugc.aweme.poi.reviews.assem.PoiReviewContentAssem;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendsV2Fragment;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryContentAssem;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursDetailAwemeListFragment;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDrS43S0100000_3 extends C0A6 {
    public final int $t;
    public Object l0;

    public static final void LJIILJJIL$0(IDrS43S0100000_3 iDrS43S0100000_3, int i, RecyclerView recyclerView) {
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
            case 5:
            case 6:
            case 8:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
            case 2:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 4:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 7:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            case 9:
                LJIILJJIL$5(this, i, recyclerView);
                return;
            case 12:
                LJIILJJIL$6(this, i, recyclerView);
                return;
            case 14:
                LJIILJJIL$7(this, i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 2:
            case 7:
            case 9:
            case 12:
            case 14:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 3:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 4:
                LJIILL$3(this, recyclerView, i, i2);
                return;
            case 5:
                LJIILL$4(this, recyclerView, i, i2);
                return;
            case 6:
                LJIILL$5(this, recyclerView, i, i2);
                return;
            case 8:
                LJIILL$6(this, recyclerView, i, i2);
                return;
            case 10:
                LJIILL$7(this, recyclerView, i, i2);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILL$8(this, recyclerView, i, i2);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJIILL$9(this, recyclerView, i, i2);
                return;
            case 15:
                LJIILL$10(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS43S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$1(IDrS43S0100000_3 iDrS43S0100000_3, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = ((VideoCaptionMentionRecommendListAssem) iDrS43S0100000_3.l0).v3().getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((VideoCaptionMentionRecommendListAssem) iDrS43S0100000_3.l0).C3().setRecycleViewPos$mention_tag_release(((LinearLayoutManager) layoutManager).LLILL());
    }

    public static final void LJIILJJIL$2(IDrS43S0100000_3 iDrS43S0100000_3, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            NowAreaMonitorAssem nowAreaMonitorAssem = (NowAreaMonitorAssem) iDrS43S0100000_3.l0;
            EnumC196967oC enumC196967oC = EnumC196967oC.VERTICAL_SCROLL_IDLE;
            nowAreaMonitorAssem.b4(enumC196967oC);
            ((NowAreaMonitorAssem) iDrS43S0100000_3.l0).g4(enumC196967oC);
        }
    }

    public static final void LJIILJJIL$3(IDrS43S0100000_3 iDrS43S0100000_3, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            NowAreaMonitorAssem nowAreaMonitorAssem = (NowAreaMonitorAssem) iDrS43S0100000_3.l0;
            EnumC196967oC enumC196967oC = EnumC196967oC.HORIZONTAL_SCROLL_IDLE;
            nowAreaMonitorAssem.b4(enumC196967oC);
            ((NowAreaMonitorAssem) iDrS43S0100000_3.l0).g4(enumC196967oC);
        }
    }

    public static final void LJIILJJIL$4(IDrS43S0100000_3 iDrS43S0100000_3, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            ((AssemViewModel) ((SearchFriendsV2Fragment) iDrS43S0100000_3.l0).LJLJL.getValue()).setState(C227318w3.LJLIL);
        }
    }

    public static final void LJIILJJIL$5(IDrS43S0100000_3 iDrS43S0100000_3, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        AddYoursInviteFriendsAssem addYoursInviteFriendsAssem = (AddYoursInviteFriendsAssem) iDrS43S0100000_3.l0;
        T5T editTextView = ((K5T) addYoursInviteFriendsAssem._$_findCachedViewById(R.id.je_)).getEditTextView();
        editTextView.clearFocus();
        ActivityC45651qj LIZ = C212428Vi.LIZ(addYoursInviteFriendsAssem);
        if (LIZ != null) {
            AYA.LIZ(LIZ, editTextView);
        }
    }

    public static final void LJIILJJIL$6(IDrS43S0100000_3 iDrS43S0100000_3, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((PostModeContainerViewModel) iDrS43S0100000_3.l0).LLIILII.setValue(Boolean.TRUE);
            return;
        }
        ((PostModeContainerViewModel) iDrS43S0100000_3.l0).LLIILII.setValue(Boolean.FALSE);
    }

    public static final void LJIILJJIL$7(IDrS43S0100000_3 iDrS43S0100000_3, int i, RecyclerView recyclerView) {
        String str;
        String str2;
        Aweme aweme;
        String authorUid;
        Aweme aweme2;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0 && i == 2) {
            C7DC c7dc = (C7DC) iDrS43S0100000_3.l0;
            c7dc.getClass();
            C188727au c188727au = new C188727au();
            C177336xd LJJIII = c7dc.LJJIII();
            String str3 = "";
            if (LJJIII == null || (str = LJJIII.LJLJJLL) == null) {
                str = "";
            }
            c188727au.LJIIIZ("enter_from", str);
            C177336xd LJJIII2 = c7dc.LJJIII();
            if (LJJIII2 == null || (aweme2 = LJJIII2.LJLLI) == null || (str2 = aweme2.getAid()) == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("group_id", str2);
            C177336xd LJJIII3 = c7dc.LJJIII();
            if (LJJIII3 != null && (aweme = LJJIII3.LJLLI) != null && (authorUid = aweme.getAuthorUid()) != null) {
                str3 = authorUid;
            }
            c188727au.LJIIIZ("author_id", str3);
            FMX.LJIIL("vertical_scroll_gift_panel", c188727au.LIZ);
        }
    }

    public static final void LJIILL$0(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        int i3;
        WrapLinearLayoutManager wrapLinearLayoutManager = ((CommentListFragment) iDrS43S0100000_3.l0).LLIIZ;
        if (wrapLinearLayoutManager != null) {
            int LLILLJJLI = wrapLinearLayoutManager.LLILLJJLI();
            int LJJJJZ = ((CommentListFragment) iDrS43S0100000_3.l0).LLIIZ.LJJJJZ();
            if (!C7CA.LIZ()) {
                CommentListFragment commentListFragment = (CommentListFragment) iDrS43S0100000_3.l0;
                C62822Ol8 c62822Ol8 = C174906ti.LIZ;
                if (((Number) c62822Ol8.getValue()).intValue() != 0) {
                    i3 = ((Number) c62822Ol8.getValue()).intValue();
                } else {
                    i3 = 8;
                }
                commentListFragment.LLLLLLJ = i3;
            }
            CommentListFragment commentListFragment2 = (CommentListFragment) iDrS43S0100000_3.l0;
            int i4 = commentListFragment2.LLLLLLJ;
            if (LLILLJJLI >= i4 && LJJJJZ - LLILLJJLI < i4 && ((AbstractC51036K1g) commentListFragment2.LLILIL.LJLIL).isHasMore()) {
                ((CommentListFragment) iDrS43S0100000_3.l0).LJIIJJI();
            }
        }
        if (!C7CA.LIZ()) {
            CommentListFragment commentListFragment3 = (CommentListFragment) iDrS43S0100000_3.l0;
            commentListFragment3.LLLLLLL = C63081OpJ.LJJLL(commentListFragment3.LJLJI);
        }
        CommentListFragment commentListFragment4 = (CommentListFragment) iDrS43S0100000_3.l0;
        if (commentListFragment4.LLLLLLL) {
            commentListFragment4.LLJJLIIIJLLLLLLLZ.jv0(3, "comment_dialog_state");
        }
    }

    public static final void LJIILL$1(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        PageContentScrollAbility pageContentScrollAbility = (PageContentScrollAbility) C55096Ljo.LIZ((InterfaceC55235Lm3) iDrS43S0100000_3.l0, PageContentScrollAbility.class, null);
        if (pageContentScrollAbility != null) {
            pageContentScrollAbility.pS(recyclerView.computeVerticalScrollOffset());
        }
    }

    public static final void LJIILL$10(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((PostModeCommentListFragment) iDrS43S0100000_3.l0).op().LLIIL.setValue(Integer.valueOf(i2));
    }

    public static final void LJIILL$2(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        NowAreaMonitorAssem nowAreaMonitorAssem = (NowAreaMonitorAssem) iDrS43S0100000_3.l0;
        EnumC196967oC enumC196967oC = EnumC196967oC.VERTICAL_SCROLL;
        nowAreaMonitorAssem.a4(enumC196967oC, false);
        ((NowAreaMonitorAssem) iDrS43S0100000_3.l0).g4(enumC196967oC);
    }

    public static final void LJIILL$3(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        NowAreaMonitorAssem nowAreaMonitorAssem = (NowAreaMonitorAssem) iDrS43S0100000_3.l0;
        EnumC196967oC enumC196967oC = EnumC196967oC.HORIZONTAL_SCROLL;
        nowAreaMonitorAssem.a4(enumC196967oC, false);
        ((NowAreaMonitorAssem) iDrS43S0100000_3.l0).g4(enumC196967oC);
    }

    public static final void LJIILL$4(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        PageContentScrollAbility pageContentScrollAbility;
        o.LJIIIZ(recyclerView, "recyclerView");
        Fragment LIZLLL = C212428Vi.LIZLLL((PoiReviewContentAssem) iDrS43S0100000_3.l0);
        if (LIZLLL != null && (pageContentScrollAbility = (PageContentScrollAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), PageContentScrollAbility.class, null)) != null) {
            pageContentScrollAbility.pS(recyclerView.computeVerticalScrollOffset());
        }
    }

    public static final void LJIILL$5(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((RecFriendsFragment) iDrS43S0100000_3.l0).vl().iv0().setState(new AqS8S0010000_3(recyclerView.canScrollVertically(-1), 35));
    }

    public static final void LJIILL$6(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C208298Fl c208298Fl = (C208298Fl) iDrS43S0100000_3.l0;
        C118234kV it = C78842Uww.LJJ(0, c208298Fl.getChildCount()).iterator();
        while (it.LJLJI) {
            View childAt = c208298Fl.getChildAt(it.nextInt());
            float pow = (((float) (Math.pow(2.718281828459045d, (-Math.pow(((childAt.getRight() + childAt.getLeft()) / 2) - ((c208298Fl.getRight() + c208298Fl.getLeft()) / 2), 2.0d)) / (Math.pow(150.0d, 2.0d) * 2)) * 1.0f)) * 0.45f) + 0.55f;
            childAt.setScaleX(pow);
            childAt.setScaleY(pow);
        }
    }

    public static final void LJIILL$7(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        View LJJIJIL = linearLayoutManager.LJJIJIL(linearLayoutManager.LLILL());
        if (LJJIJIL != null) {
            LJJIJIL.getTop();
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        AddYoursDetailViewModel addYoursDetailViewModel = (AddYoursDetailViewModel) ((AddYoursDetailAwemeListFragment) iDrS43S0100000_3.l0).LLILLL.getValue();
        float f = computeVerticalScrollOffset / ((AddYoursDetailAwemeListFragment) iDrS43S0100000_3.l0).LLILZ;
        if (f > 1.0f) {
            f = 1.0f;
        }
        addYoursDetailViewModel.withState(new C219488jQ(addYoursDetailViewModel, f));
    }

    public static final void LJIILL$8(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int LLILLJJLI = linearLayoutManager.LLILLJJLI();
            PostModeContainerViewModel postModeContainerViewModel = (PostModeContainerViewModel) iDrS43S0100000_3.l0;
            if (LLILLJJLI > 0) {
                postModeContainerViewModel.LJLLJ.setValue(C76800UCe.LIZ);
            }
        }
    }

    public static final void LJIILL$9(IDrS43S0100000_3 iDrS43S0100000_3, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (Math.abs(i2) <= 10) {
            return;
        }
        C0A2 layoutManager = ((WatchHistoryContentAssem) iDrS43S0100000_3.l0).v3().getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int LLILL = ((LinearLayoutManager) layoutManager).LLILL();
        WatchHistoryListViewModel A3 = ((WatchHistoryContentAssem) iDrS43S0100000_3.l0).A3();
        A3.getClass();
        A3.withState(new AqS93S0101000_3(LLILL, A3, 14));
    }
}
