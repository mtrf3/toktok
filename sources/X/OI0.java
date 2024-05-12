package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Window;

/* loaded from: classes11.dex */
public final class OI0 extends AbstractC65781Prl implements InterfaceC88472Yns<C66300Q0i, C76800UCe> {
    public final /* synthetic */ Window LJLIL;
    public final /* synthetic */ Rect LJLILLLLZI;
    public final /* synthetic */ Bitmap LJLJI;
    public final /* synthetic */ PixelCopy.OnPixelCopyFinishedListener LJLJJI;
    public final /* synthetic */ Handler LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OI0(Window window, Rect rect, Bitmap bitmap, PixelCopyOnPixelCopyFinishedListenerC61661OHx pixelCopyOnPixelCopyFinishedListenerC61661OHx, Handler handler) {
        super(1);
        this.LJLIL = window;
        this.LJLILLLLZI = rect;
        this.LJLJI = bitmap;
        this.LJLJJI = pixelCopyOnPixelCopyFinishedListenerC61661OHx;
        this.LJLJJL = handler;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C66300Q0i c66300Q0i) {
        PixelCopy.request(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
