package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankLeagueFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uig, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77958Uig extends C31073CHl {
    public final /* synthetic */ RankLeagueFragment LJLJL;

    public C77958Uig(RankLeagueFragment rankLeagueFragment) {
        this.LJLJL = rankLeagueFragment;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        RankLeagueFragment rankLeagueFragment = this.LJLJL;
        CountDownTimerC77998UjK countDownTimerC77998UjK = rankLeagueFragment.LLIILZL;
        if (countDownTimerC77998UjK != null) {
            countDownTimerC77998UjK.cancel();
        }
        CountDownTimerC77998UjK countDownTimerC77998UjK2 = rankLeagueFragment.LLIILZL;
        if (countDownTimerC77998UjK2 != null) {
            countDownTimerC77998UjK2.LIZ = null;
        }
        CountDownTimerC77998UjK countDownTimerC77998UjK3 = new CountDownTimerC77998UjK(5000L);
        countDownTimerC77998UjK3.start();
        countDownTimerC77998UjK3.LIZ = rankLeagueFragment.LLIIZ;
        rankLeagueFragment.LLIILZL = countDownTimerC77998UjK3;
        C2A7 c2a7 = this.LJLJL.LLIIL;
        if (c2a7 != null) {
            c2a7.setVisibility(0);
        }
        C2A7 c2a72 = this.LJLJL.LLIIL;
        if (c2a72 != null) {
            C16880lQ.LJJIII(c2a72, new C77972Uiu(this.LJLJL));
        }
        C2A7 c2a73 = this.LJLJL.LLIIL;
        if (c2a73 == null) {
            return;
        }
        c2a73.setText(C15380j0.LJIILJJIL(R.string.nsv));
    }
}
