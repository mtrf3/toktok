package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Wuj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class SurfaceHolderCallbackC83801Wuj implements SurfaceHolder.Callback {
    public final /* synthetic */ InterfaceC83803Wul LJLIL;
    public final /* synthetic */ InterfaceC65784Pro LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro LJLJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJI;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
        C82891Wg3.LIZLLL().i("CameraCapturePreOpener: surfaceCreated");
        InterfaceC83803Wul interfaceC83803Wul = this.LJLIL;
        Surface surface = holder.getSurface();
        o.LJIIIIZZ(surface, "holder.surface");
        interfaceC83803Wul.LIZJ(surface);
        this.LJLILLLLZI.invoke();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
        C82891Wg3.LIZLLL().i("CameraCapturePreOpener: surfaceDestroyed");
        InterfaceC83803Wul interfaceC83803Wul = this.LJLIL;
        o.LJIIIIZZ(holder.getSurface(), "holder.surface");
        interfaceC83803Wul.LIZ();
        this.LJLJJI.invoke();
    }

    public SurfaceHolderCallbackC83801Wuj(C83680Wsm c83680Wsm, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3) {
        this.LJLIL = c83680Wsm;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = interfaceC65784Pro2;
        this.LJLJJI = interfaceC65784Pro3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        o.LJIIIZ(holder, "holder");
        InterfaceC83803Wul interfaceC83803Wul = this.LJLIL;
        Surface surface = holder.getSurface();
        o.LJIIIIZZ(surface, "holder.surface");
        interfaceC83803Wul.LIZIZ(i2, i3, surface);
        this.LJLJI.invoke();
    }
}
