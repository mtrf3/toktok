package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.SurfaceView;

/* renamed from: X.Ulf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78143Ulf extends AbstractC65781Prl implements InterfaceC88472Yns<C66300Q0i, C76800UCe> {
    public final /* synthetic */ SurfaceView LJLIL;
    public final /* synthetic */ Bitmap LJLILLLLZI;
    public final /* synthetic */ PixelCopy.OnPixelCopyFinishedListener LJLJI;
    public final /* synthetic */ Handler LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78143Ulf(SurfaceView surfaceView, Bitmap bitmap, PixelCopyOnPixelCopyFinishedListenerC78142Ule pixelCopyOnPixelCopyFinishedListenerC78142Ule, Handler handler) {
        super(1);
        this.LJLIL = surfaceView;
        this.LJLILLLLZI = bitmap;
        this.LJLJI = pixelCopyOnPixelCopyFinishedListenerC78142Ule;
        this.LJLJJI = handler;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C66300Q0i c66300Q0i) {
        PixelCopy.request(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
