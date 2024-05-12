package X;

import Y.ARunnableS12S0101000_8;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchPreloadLayoutOptConfig;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.Jbg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC49496Jbg {
    public final Queue<RecyclerView.ViewHolder> LIZ = new ConcurrentLinkedQueue();
    public int LIZIZ = 0;
    public final Handler LIZJ;

    public abstract RecyclerView.ViewHolder LIZ();

    public AbstractC49496Jbg(Handler handler) {
        this.LIZJ = handler;
    }

    public final void LIZIZ(int i) {
        if (this.LIZIZ >= i) {
            return;
        }
        ARunnableS12S0101000_8 aRunnableS12S0101000_8 = new ARunnableS12S0101000_8(i, this, 29);
        if (((SearchPreloadLayoutOptConfig) C49500Jbk.LIZIZ.getValue()).enableAsyncCreate && C46442IKo.LIZ()) {
            C38995FSd.LIZJ().execute(aRunnableS12S0101000_8);
        } else {
            this.LIZJ.post(aRunnableS12S0101000_8);
        }
    }
}
