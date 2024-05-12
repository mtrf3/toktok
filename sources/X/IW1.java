package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.List;

/* loaded from: classes9.dex */
public final class IW1 extends HandlerThread {
    public static volatile IW1 LJLJJL;
    public List<Runnable> LJLIL;
    public List<Runnable> LJLILLLLZI;
    public Handler LJLJI;
    public Handler LJLJJI;

    public IW1() {
        super("Lynx_image");
        start();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS44S0100000_8(this, 17));
    }
}
