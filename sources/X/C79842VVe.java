package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.VVe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79842VVe implements Handler.Callback {
    public int LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final /* synthetic */ C79841VVd LJLILLLLZI;

    public C79842VVe(C79841VVd c79841VVd) {
        this.LJLILLLLZI = c79841VVd;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what != 1) {
            return false;
        }
        int scrollY = this.LJLILLLLZI.getScrollY();
        C79841VVd c79841VVd = this.LJLILLLLZI;
        if (!c79841VVd.LJLIL && this.LJLIL == scrollY) {
            this.LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
            c79841VVd.setScrollState(0);
        } else {
            this.LJLIL = scrollY;
            c79841VVd.LJLJI.removeMessages(1);
            c79841VVd.LJLJI.sendEmptyMessageDelayed(1, 80L);
        }
        return true;
    }
}
