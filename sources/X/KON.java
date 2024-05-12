package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class KON {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LJ(FrameLayout frameLayout, Aweme aweme, C174366sq c174366sq) {
        if (aweme == null || c174366sq == null || frameLayout == null) {
            return false;
        }
        IBAAnchorService LJII = BAAnchorServiceImpl.LJII();
        Context context = frameLayout.getContext();
        o.LJIIIIZZ(context, "parentView.context");
        String eventType = c174366sq.getEventType();
        o.LJIIIIZZ(eventType, "params.eventType");
        C44091HSd LJFF = LJII.LJFF(context, aweme, eventType);
        if (LJFF == null) {
            return false;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(LJFF);
        frameLayout.setVisibility(0);
        return true;
    }

    public static boolean LIZ(FrameLayout frameLayout, Aweme aweme, C174366sq c174366sq, boolean z) {
        View LJJI;
        if (aweme == null || c174366sq == null || frameLayout == null || z) {
            return false;
        }
        IEcomSearchService LJJIJL = C63081OpJ.LJJIJL();
        EnumC51280KAq enumC51280KAq = EnumC51280KAq.COMMENT_TOP_ANCHOR;
        if (LJJIJL.LJJIJLIJ(enumC51280KAq)) {
            Context context = frameLayout.getContext();
            o.LJIIIIZZ(context, "parentView.context");
            Object LJJJJL = LJJIJL.LJJJJL(context, enumC51280KAq, null, new KEK(c174366sq.getEventType(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, aweme, c174366sq.getTabName(), c174366sq.isSplitMode(), Long.valueOf(c174366sq.getSessionId()), Boolean.valueOf(o.LJ(c174366sq.getEventType(), "selfharm")), 4194302), C174536t7.LJLIL);
            if (LJJJJL instanceof View) {
                LJJI = (View) LJJJJL;
            }
            return false;
        }
        Context context2 = frameLayout.getContext();
        o.LJIIIIZZ(context2, "parentView.context");
        LJJI = LJJIJL.LJJI(c174366sq.getSessionId(), context2, aweme, c174366sq.getEventType(), c174366sq.getTabName(), c174366sq.isSplitMode(), o.LJ(c174366sq.getEventType(), "selfharm"));
        if (LJJI != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(LJJI);
            frameLayout.setVisibility(0);
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(View view, Aweme aweme, C174366sq c174366sq, boolean z) {
        ViewGroup viewGroup;
        if (aweme == null || c174366sq == null || view == null || z) {
            return false;
        }
        IECommerceVideoService LJIIJ = ECommerceVideoService.LJIIJ();
        if (!LJIIJ.LJFF() || (viewGroup = (ViewGroup) view.findViewById(R.id.e3p)) == null) {
            return false;
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        String eventType = c174366sq.getEventType();
        o.LJIIIIZZ(eventType, "params.eventType");
        C71353RzR LIZJ = LJIIJ.LIZJ(context, aweme, eventType);
        if (LIZJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        viewGroup.addView(LIZJ);
        return true;
    }

    public static boolean LIZLLL(FrameLayout frameLayout, Aweme aweme, C174366sq c174366sq, boolean z) {
        if (aweme != null && c174366sq != null && frameLayout != null && !SearchServiceImpl.LLLZI().LJJIJIIJI() && !AV1.LJIJI(aweme.getAuthorUid()) && !AV1.LJIIZILJ(aweme.getAuthor(), AV1.LJIJI(aweme.getAuthorUid())) && !z) {
            CommentService.LIZ.getClass();
            if (!CommentServiceImpl.LJJL().LJIILLIIL(aweme) && CommentServiceImpl.LJJL().LJJIJIIJI(aweme) && aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 0 && !o.LJ(c174366sq.getEventType(), "selfharm") && !a.LJIIIZ().LIZJ()) {
                ISearchService LLLZI = SearchServiceImpl.LLLZI();
                Context context = frameLayout.getContext();
                o.LJIIIIZZ(context, "parentView.context");
                View LLLLJ = LLLZI.LLLLJ(c174366sq.getSessionId(), context, aweme, c174366sq.getEventType(), c174366sq.getTabName(), c174366sq.isSplitMode(), false);
                if (LLLLJ == null) {
                    return false;
                }
                frameLayout.removeAllViews();
                frameLayout.addView(LLLLJ);
                frameLayout.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF(FrameLayout frameLayout, Aweme aweme, C174366sq c174366sq, boolean z) {
        if (z || aweme == null || c174366sq == null || frameLayout == null) {
            return false;
        }
        ITcmService LJIJI = TcmServiceImpl.LJIJI();
        Context context = frameLayout.getContext();
        o.LJIIIIZZ(context, "parentView.context");
        String eventType = c174366sq.getEventType();
        o.LJIIIIZZ(eventType, "params.eventType");
        C198377qT LIZ2 = LJIJI.LIZ(context, aweme, eventType);
        if (LIZ2 == null) {
            return false;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(LIZ2);
        frameLayout.setVisibility(0);
        return true;
    }

    public static boolean LIZJ(FrameLayout frameLayout, boolean z, Aweme aweme, C174366sq c174366sq, TuxIconView tuxIconView, boolean z2) {
        if (aweme == null || c174366sq == null || z2) {
            return false;
        }
        if (frameLayout == null) {
            C71Y.LIZ("CommentPageHeaderHelper", "parentView == null");
            return false;
        }
        if (tuxIconView == null) {
            C71Y.LIZ("CommentPageHeaderHelper", "mBatchManagementView == null");
            return false;
        }
        frameLayout.removeAllViews();
        C51556KLg.LIZ.getClass();
        IPoiService LIZ2 = C51556KLg.LIZ();
        if (!z) {
            Context context = frameLayout.getContext();
            o.LJIIIIZZ(context, "parentView.context");
            String eventType = c174366sq.getEventType();
            o.LJIIIIZZ(eventType, "params.eventType");
            View LJJLI = LIZ2.LJJLI(context, aweme, eventType);
            if (LJJLI != null) {
                C71Y.LIZ("CommentPageHeaderHelper", "add view");
                frameLayout.addView(LJJLI);
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                o.LJIIIIZZ(layoutParams, "mBatchManagementView.layoutParams");
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 8388613;
                    layoutParams2.setMarginEnd(C17N.LJIILL(44.0d));
                    tuxIconView.setLayoutParams(layoutParams);
                    return true;
                }
                return true;
            }
        }
        return false;
    }
}
