package X;

import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes12.dex */
public final class P30 extends AbstractC65781Prl implements InterfaceC88472Yns<C66300Q0i, VirtualDisplay> {
    public final /* synthetic */ MediaProjection LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ Surface LJLJL;
    public final /* synthetic */ VirtualDisplay.Callback LJLJLJ;
    public final /* synthetic */ int LJLJJLL = 3;
    public final /* synthetic */ Handler LJLJLLL = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P30(MediaProjection mediaProjection, String str, int i, int i2, int i3, Surface surface, C0JZ c0jz) {
        super(1);
        this.LJLIL = mediaProjection;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
        this.LJLJL = surface;
        this.LJLJLJ = c0jz;
    }

    @Override // X.InterfaceC88472Yns
    public final VirtualDisplay invoke(C66300Q0i c66300Q0i) {
        return this.LJLIL.createVirtualDisplay(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL);
    }
}
