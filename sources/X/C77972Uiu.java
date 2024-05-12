package X;

import android.view.View;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankLeagueFragment;

/* renamed from: X.Uiu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77972Uiu extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ RankLeagueFragment LJLJJL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        View view = this.LJLJJL.LLIIIL;
        if (view != null) {
            view.setVisibility(8);
        }
        RankLeagueFragment rankLeagueFragment = this.LJLJJL;
        rankLeagueFragment.LLIILII = false;
        CountDownTimerC77998UjK countDownTimerC77998UjK = rankLeagueFragment.LLIILZL;
        if (countDownTimerC77998UjK != null) {
            countDownTimerC77998UjK.cancel();
        }
        CountDownTimerC77998UjK countDownTimerC77998UjK2 = rankLeagueFragment.LLIILZL;
        if (countDownTimerC77998UjK2 != null) {
            countDownTimerC77998UjK2.LIZ = null;
        }
        rankLeagueFragment.LLIILZL = null;
    }

    public C77972Uiu(RankLeagueFragment rankLeagueFragment) {
        this.LJLJJL = rankLeagueFragment;
    }
}
