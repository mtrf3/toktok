package X;

import android.content.MutableContextWrapper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import java.util.ArrayList;

/* renamed from: X.LUw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C54354LUw implements MessageQueue.IdleHandler {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.LJLIL) {
            case 0:
                C54353LUv c54353LUv = (C54353LUv) this.LJLILLLLZI;
                c54353LUv.getClass();
                SystemClock.uptimeMillis();
                synchronized (c54353LUv.LJ) {
                    for (int i = 0; i < c54353LUv.LIZLLL - ((ArrayList) c54353LUv.LIZ).size(); i++) {
                        ((ArrayList) c54353LUv.LIZ).add(new C59612NaS(new MutableContextWrapper(EF7.LIZIZ())));
                    }
                }
                SystemClock.uptimeMillis();
                return false;
            default:
                FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) this.LJLILLLLZI;
                fullFeedFragmentPanel.LJJJJJL();
                fullFeedFragmentPanel.LJLIIIL();
                return false;
        }
    }

    public /* synthetic */ C54354LUw(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
