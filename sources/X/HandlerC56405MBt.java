package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.MBt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC56405MBt extends Handler {
    public final WeakReference<TrendingTitleSwitcher> LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC56405MBt(TrendingTitleSwitcher switcher) {
        super(C16880lQ.LLJJJJ());
        o.LJIIIZ(switcher, "switcher");
        this.LIZ = new WeakReference<>(switcher);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 101) {
            int i = 0;
            if (C56424MCm.LIZ()) {
                TrendingTitleSwitcher trendingTitleSwitcher = this.LIZ.get();
                if (trendingTitleSwitcher != null) {
                    if (trendingTitleSwitcher.LJLJJLL + 1 >= ((ArrayList) trendingTitleSwitcher.LJLJLJ).size()) {
                        trendingTitleSwitcher.LJLJJLL = 0;
                    } else {
                        i = trendingTitleSwitcher.LJLJJLL + 1;
                        trendingTitleSwitcher.LJLJJLL = i;
                    }
                    trendingTitleSwitcher.LIZIZ(i, true);
                }
            } else {
                TrendingTitleSwitcher trendingTitleSwitcher2 = this.LIZ.get();
                if (trendingTitleSwitcher2 != null) {
                    if (trendingTitleSwitcher2.LJLJJLL + 1 >= trendingTitleSwitcher2.LJLJI.size()) {
                        trendingTitleSwitcher2.LJLJJLL = 0;
                    } else {
                        i = trendingTitleSwitcher2.LJLJJLL + 1;
                        trendingTitleSwitcher2.LJLJJLL = i;
                    }
                    trendingTitleSwitcher2.LIZ(i, true);
                }
            }
            sendEmptyMessageDelayed(101, 4000L);
        }
    }
}
