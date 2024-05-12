package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.VVi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79846VVi implements Handler.Callback {
    public int LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final /* synthetic */ C79845VVh LJLILLLLZI;

    public C79846VVi(C79845VVh c79845VVh) {
        this.LJLILLLLZI = c79845VVh;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what != 1) {
            return false;
        }
        int scrollY = this.LJLILLLLZI.getScrollY();
        C79845VVh c79845VVh = this.LJLILLLLZI;
        if (!c79845VVh.LJLIL && this.LJLIL == scrollY) {
            this.LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
            c79845VVh.setScrollState(0);
        } else {
            this.LJLIL = scrollY;
            c79845VVh.LJLJI.removeMessages(1);
            c79845VVh.LJLJI.sendEmptyMessageDelayed(1, 80L);
        }
        return true;
    }
}
