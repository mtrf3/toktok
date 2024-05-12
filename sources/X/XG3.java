package X;

import Y.ARunnableS51S0100000_15;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes16.dex */
public final class XG3 implements WeakHandler.IHandler {
    public static final XG3 LJLL = new XG3();
    public static final AtomicLong LJLLI = new AtomicLong();
    public long LJLIL;
    public WeakReference<C84541XFx> LJLJJL;
    public final Object LJLILLLLZI = new Object();
    public int LJLJI = 0;
    public int LJLJJI = 0;
    public final AtomicLong LJLJJLL = new AtomicLong(0);
    public final WeakHandler LJLJL = new WeakHandler(C16880lQ.LLJJJJ(), this);
    public final OJM<XG4> LJLJLJ = new OJM<>();
    public final ARunnableS51S0100000_15 LJLJLLL = new ARunnableS51S0100000_15(this, 6);

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public final void LIZ(C84541XFx c84541XFx) {
        boolean z;
        if (c84541XFx == null) {
            return;
        }
        synchronized (this.LJLILLLLZI) {
            int i = this.LJLJI;
            if (i > this.LJLJJI) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJI = i + 1;
            this.LJLJJL = new WeakReference<>(c84541XFx);
            if (!z) {
                this.LJLJJI = this.LJLJI;
                new XG2(this, c84541XFx).start();
            }
        }
    }
}
