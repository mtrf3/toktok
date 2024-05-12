package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.behavior.RankBottomBehavior;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uib, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C77953Uib extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C77953Uib(RankPageFragment rankPageFragment) {
        super(0, rankPageFragment, RankPageFragment.class, "expandRankList", "expandRankList()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ViewGroup.LayoutParams layoutParams;
        C06C c06c;
        RankBottomBehavior rankBottomBehavior;
        ViewGroup.LayoutParams layoutParams2;
        C80214Vdy c80214Vdy;
        C06F c06f;
        C06F c06f2;
        RankPageFragment rankPageFragment = (RankPageFragment) this.receiver;
        RankPageController rankPageController = rankPageFragment.LJLILLLLZI;
        C06C c06c2 = null;
        if (rankPageController != null) {
            rankPageController.LJFF();
            View _$_findCachedViewById = rankPageFragment._$_findCachedViewById(R.id.nb6);
            if (_$_findCachedViewById != null) {
                layoutParams = _$_findCachedViewById.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof C06F) && (c06f2 = (C06F) layoutParams) != null) {
                c06c = c06f2.LIZ;
            } else {
                c06c = null;
            }
            if ((c06c instanceof RankBottomBehavior) && (rankBottomBehavior = (RankBottomBehavior) c06c) != null) {
                C80217Ve1 c80217Ve1 = rankPageFragment.LJLJJLL;
                View _$_findCachedViewById2 = rankPageFragment._$_findCachedViewById(R.id.nb6);
                int i = 0;
                rankBottomBehavior.LJFF = false;
                if (c80217Ve1 != null) {
                    layoutParams2 = c80217Ve1.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                if ((layoutParams2 instanceof C06F) && (c06f = (C06F) layoutParams2) != null) {
                    c06c2 = c06f.LIZ;
                }
                if ((c06c2 instanceof AppBarLayout$Behavior) && (c80214Vdy = (C80214Vdy) c06c2) != null) {
                    c80214Vdy.setTopAndBottomOffset(0);
                }
                if (_$_findCachedViewById2 != null) {
                    int paddingLeft = _$_findCachedViewById2.getPaddingLeft();
                    int paddingTop = _$_findCachedViewById2.getPaddingTop();
                    int paddingRight = _$_findCachedViewById2.getPaddingRight();
                    C80217Ve1 c80217Ve12 = rankBottomBehavior.LJ;
                    if (c80217Ve12 != null) {
                        i = c80217Ve12.getTotalScrollRange();
                    }
                    _$_findCachedViewById2.setPadding(paddingLeft, paddingTop, paddingRight, i);
                }
                rankBottomBehavior.LJFF = true;
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("controller");
        throw null;
    }
}
