package X;

import androidx.lifecycle.LiveData;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinTaskManager;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Jvf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50735Jvf implements JC4 {
    public final /* synthetic */ SearchCoinTaskManager LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;

    @Override // X.JC4
    public final void onStart() {
    }

    @Override // X.JC4
    public final void LIZ() {
        long serverTimeMills;
        this.LJLIL.hideResultPageCoinBanner();
        C50734Jve LIZ = C252019un.LIZ();
        C50436Jqq LJJIJ = LIZ.LJJIJ();
        int i = LIZ.LJJIJ().LJLIL + 1;
        if (SpecActServiceImpl.LJJJIL().LJJJI()) {
            serverTimeMills = System.currentTimeMillis();
        } else {
            serverTimeMills = NetworkUtils.getServerTimeMills();
        }
        LIZ.LJLJJLL = C50436Jqq.L(LJJIJ, i, serverTimeMills, 10);
        String curUserId = LIZ.LJJIFFI().getCurUserId();
        o.LJIIIIZZ(curUserId, "accountService.curUserId");
        LIZ.LJJJI(curUserId, LIZ.LJJIJ(), "search_task_complete_count_", "search_task_complete_time_");
        String str = C252019un.LIZ().LJLJLLL;
        if (str != null) {
            this.LJLIL.showTopCoinTaskPush(this.LJLILLLLZI);
            C50734Jve LIZ2 = C252019un.LIZ();
            LIZ2.getClass();
            if (str.length() > 0) {
                LIZ2.LJLJLJ.put(str, Long.valueOf(NetworkUtils.getServerTimeMills()));
                java.util.Map<String, Long> map = LIZ2.LJLJLJ;
                String curUserId2 = LIZ2.LJJIFFI().getCurUserId();
                o.LJIIIIZZ(curUserId2, "accountService.curUserId");
                LIZ2.LJJIL(curUserId2, map);
            }
        }
    }

    @Override // X.JC4
    public final void LJIILIIL(long j) {
        if (C50929Jyn.LIZ()) {
            this.LJLIL.getHeaderBannerView().LIZ((int) Math.ceil((((float) j) * 1.0f) / ((float) this.LJLIL.timerInterval)));
        } else {
            ((LiveData) this.LJLIL.getNewCoinViewModel().LJLILLLLZI.getValue()).setValue(Integer.valueOf((int) Math.ceil((((float) j) * 1.0f) / ((float) this.LJLIL.timerInterval))));
        }
    }

    public C50735Jvf(SearchCoinTaskManager searchCoinTaskManager, ActivityC45651qj activityC45651qj) {
        this.LJLIL = searchCoinTaskManager;
        this.LJLILLLLZI = activityC45651qj;
    }
}
