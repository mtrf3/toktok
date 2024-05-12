package X;

import Y.ARunnableS38S0100000_2;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ttve.nativePort.TEImageInterface;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class SurfaceHolderCallbackC151355wp implements SurfaceHolder.Callback {
    public final C151325wm LJLIL;
    public final InterfaceC151685xM LJLILLLLZI;
    public final Handler LJLJI;
    public EnumC151405wu LJLJJI;

    public final void LIZ() {
        if (!this.LJLIL.LJI.isEmpty()) {
            Iterator<Runnable> it = this.LJLIL.LJI.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
        ((ArrayList) this.LJLIL.LJI).clear();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLJJI = EnumC151405wu.Created;
        InterfaceC151685xM interfaceC151685xM = this.LJLILLLLZI;
        if (interfaceC151685xM != null) {
            interfaceC151685xM.LJJJJL();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
        C151325wm c151325wm = this.LJLIL;
        Surface surface = holder.getSurface();
        o.LJIIIIZZ(surface, "holder!!.surface");
        c151325wm.getClass();
        TEImageInterface tEImageInterface = c151325wm.LJII;
        if (tEImageInterface != null) {
            tEImageInterface.destorySurface(surface);
        }
        this.LJLJJI = EnumC151405wu.Destroyed;
        InterfaceC151685xM interfaceC151685xM = this.LJLILLLLZI;
        if (interfaceC151685xM != null) {
            interfaceC151685xM.LJLL();
        }
    }

    public SurfaceHolderCallbackC151355wp(C151325wm veImage, InterfaceC151685xM interfaceC151685xM, Handler handler) {
        o.LJIIIZ(veImage, "veImage");
        this.LJLIL = veImage;
        this.LJLILLLLZI = interfaceC151685xM;
        this.LJLJI = handler;
        this.LJLJJI = EnumC151405wu.Destroyed;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        o.LJIIIZ(holder, "holder");
        C151325wm c151325wm = this.LJLIL;
        Surface surface = holder.getSurface();
        o.LJIIIIZZ(surface, "holder.surface");
        c151325wm.getClass();
        TEImageInterface tEImageInterface = c151325wm.LJII;
        if (tEImageInterface != null) {
            tEImageInterface.initPreviewSurface(surface);
        }
        this.LJLJJI = EnumC151405wu.Changed;
        InterfaceC151685xM interfaceC151685xM = this.LJLILLLLZI;
        if (interfaceC151685xM != null) {
            interfaceC151685xM.onSurfaceChanged(i2, i3);
        }
        Handler handler = this.LJLJI;
        if (handler != null) {
            o.LJI(handler);
            handler.post(new ARunnableS38S0100000_2(this, 121));
        } else {
            LIZ();
        }
    }
}
