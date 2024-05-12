package X;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes6.dex */
public final class BU7 extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final BU7 LJLIL = new BU7();

    public BU7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        HandlerThread LIZLLL = VCG.LIZLLL();
        LIZLLL.start();
        return new Handler(LIZLLL.getLooper());
    }
}
