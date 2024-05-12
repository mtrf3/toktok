package X;

import Y.ACallableS111S0100000_8;
import android.view.SurfaceHolder;
import com.ss.ttm.player.TTPlayerClient;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.IzW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class SurfaceHolderCallbackC48426IzW implements SurfaceHolder.Callback {
    public final InterfaceC48430Iza LJLIL;

    static {
        C16880lQ.LJLLJ(SurfaceHolderCallbackC48426IzW.class);
    }

    public SurfaceHolderCallbackC48426IzW(InterfaceC48430Iza interfaceC48430Iza) {
        this.LJLIL = interfaceC48430Iza;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        InterfaceC48430Iza interfaceC48430Iza = this.LJLIL;
        if (interfaceC48430Iza != null) {
            TTPlayerClient tTPlayerClient = (TTPlayerClient) interfaceC48430Iza;
            tTPlayerClient.LJLILLLLZI = surfaceHolder;
            if (tTPlayerClient.LJLLI || tTPlayerClient.LLIILII == 1) {
                return;
            }
            tTPlayerClient.LJLLLLLL.lock();
            try {
                if (tTPlayerClient.LJJJJLI()) {
                    SurfaceHolder surfaceHolder2 = tTPlayerClient.LJLILLLLZI;
                    if (surfaceHolder != surfaceHolder2) {
                        if (surfaceHolder2 != null) {
                            surfaceHolder2.removeCallback(tTPlayerClient.LJLJLLL);
                        }
                        tTPlayerClient.LJLILLLLZI = surfaceHolder;
                        if (surfaceHolder != null) {
                            surfaceHolder.addCallback(tTPlayerClient.LJLJLLL);
                        }
                    }
                    tTPlayerClient.LJZL.LJJI(surfaceHolder.getSurface());
                }
            } finally {
                tTPlayerClient.LJLLLLLL.unlock();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Future submit;
        InterfaceC48430Iza interfaceC48430Iza = this.LJLIL;
        if (interfaceC48430Iza != null) {
            TTPlayerClient tTPlayerClient = (TTPlayerClient) interfaceC48430Iza;
            if (tTPlayerClient.LJLLI) {
                return;
            }
            if (tTPlayerClient.LLIIJLIL > 0) {
                ACallableS111S0100000_8 aCallableS111S0100000_8 = new ACallableS111S0100000_8(tTPlayerClient, 10);
                synchronized (V16.class) {
                    submit = V16.LJIJ().submit(aCallableS111S0100000_8);
                }
                try {
                    submit.get(tTPlayerClient.LLIIJLIL, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    O5Y.LJFF(TTPlayerClient.LLIIZ, tTPlayerClient, "set surface time out");
                    return;
                }
            }
            tTPlayerClient.LJLLLLLL.lock();
            try {
                if (tTPlayerClient.LJJJJLI()) {
                    tTPlayerClient.LJZL.LJJI(null);
                }
            } finally {
                tTPlayerClient.LJLLLLLL.unlock();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        InterfaceC48430Iza interfaceC48430Iza = this.LJLIL;
        if (interfaceC48430Iza != null) {
            interfaceC48430Iza.getClass();
        }
    }
}
