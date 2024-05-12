package X;

import android.os.HandlerThread;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeFrequencyControlConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.R3i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68926R3i implements InterfaceC68935R3r, InterfaceC68936R3s {
    public final InterfaceC60472Yx LIZ;
    public final CopyOnWriteArrayList<OSZ<BaseNotice, NoticeFrequencyControlConfig>> LIZIZ;
    public final String LIZJ;
    public HandlerThread LIZLLL;
    public HandlerC68929R3l LJ;
    public volatile boolean LJFF;
    public String LJI;

    public C68926R3i(InterfaceC60472Yx cacheUpdateExecutor) {
        o.LJIIIZ(cacheUpdateExecutor, "cacheUpdateExecutor");
        this.LIZ = cacheUpdateExecutor;
        this.LIZIZ = new CopyOnWriteArrayList<>();
        this.LIZJ = "Report";
        this.LJI = "";
    }

    public final void LIZ(boolean z) {
        HandlerC68929R3l handlerC68929R3l;
        long j;
        if (this.LIZIZ.isEmpty() || this.LJFF) {
            HandlerC68929R3l handlerC68929R3l2 = this.LJ;
            if (handlerC68929R3l2 != null) {
                handlerC68929R3l2.removeMessages(1);
                return;
            }
            return;
        }
        HandlerC68929R3l handlerC68929R3l3 = this.LJ;
        if (handlerC68929R3l3 != null && !handlerC68929R3l3.hasMessages(1) && (handlerC68929R3l = this.LJ) != null) {
            if (z) {
                j = 0;
            } else {
                j = 2000;
            }
            handlerC68929R3l.sendEmptyMessageDelayed(1, j);
        }
    }
}
