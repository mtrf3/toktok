package X;

import com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class EI9 implements InterfaceC36081EEb {
    @Override // X.InterfaceC36081EEb
    public final void LIZ() {
        C36922EeM.LJ("FetchCombineSettingsTask delayUnreadCountAllProcess boot finish");
        InboxNoticeCountStrategyExperiment.LIZ.getClass();
        long j = InboxNoticeCountStrategyExperiment.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delayUnreadCountAllProcess call ");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        LIZ.append(", delayTime = ");
        LIZ.append(j);
        C221018lt.LJFF("NoticeCountFetcher", X1D.LIZIZ(LIZ));
        AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LJJL(T16.LJ).LJJJJZI(EIF.LJLIL);
    }
}
