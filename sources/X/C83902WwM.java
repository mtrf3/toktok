package X;

import com.bytedance.creativex.camerakit.camera.session.recorder.impl.RecorderImpl;
import com.ss.android.vesdk.VERecorder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WwM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83902WwM implements InterfaceC83868Wvo {
    public InterfaceC88472Yns<? super Integer, C76800UCe> LIZ;
    public final C62822Ol8 LIZIZ;
    public final CopyOnWriteArraySet<InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe>> LIZJ;
    public final IDqS456S0100000_14 LIZLLL;
    public final C83900WwK LJ;
    public final C83816Wuy LJFF;
    public final C83871Wvr LJI;
    public final InterfaceC83829WvB LJII;
    public final InterfaceC83927Wwl LJIIIIZZ;
    public final InterfaceC65784Pro<Boolean> LJIIIZ;
    public final InterfaceC65784Pro<InterfaceC83906WwQ> LJIIJ;

    public final CopyOnWriteArrayList<InterfaceC83707WtD> LIZLLL() {
        return (CopyOnWriteArrayList) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC83868Wvo
    public final void LIZJ() {
        if (this.LJIIIIZZ.LJLJJL()) {
            VERecorder LJ = this.LJII.LJ();
            LJ.LIZIZ.addCommonCallback(new C83903WwN(this));
        } else {
            VERecorder LJ2 = this.LJII.LJ();
            LJ2.LIZIZ.addRecorderStateListener(new C83904WwO(this));
        }
    }

    @Override // X.InterfaceC83868Wvo
    public final void LLLLLLL() {
        C83900WwK c83900WwK = this.LJ;
        c83900WwK.LJLIL.clear();
        if (c83900WwK.LJLJI) {
            c83900WwK.LJLILLLLZI.LIZIZ.removeCommonCallback(c83900WwK);
        } else {
            c83900WwK.LJLILLLLZI.LIZIZ.setCommonCallback(null);
        }
    }

    @Override // X.InterfaceC83868Wvo
    public final void LLLLLLZ() {
        C83816Wuy c83816Wuy = this.LJFF;
        c83816Wuy.LJLIL.clear();
        c83816Wuy.LJLILLLLZI.LIZIZ.setOnInfoListener(null);
    }

    @Override // X.InterfaceC83868Wvo
    public final void LIZ(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        if (!LIZLLL().contains(listener)) {
            LIZLLL().add(listener);
        }
    }

    @Override // X.InterfaceC83868Wvo
    public final void LIZIZ(AqS173S0100000_7 aqS173S0100000_7) {
        this.LIZ = aqS173S0100000_7;
    }

    public final void LJ(boolean z) {
        if (this.LJIIIZ.invoke().booleanValue()) {
            return;
        }
        Iterator<InterfaceC83707WtD> it = LIZLLL().iterator();
        while (it.hasNext()) {
            InterfaceC83707WtD next = it.next();
            if (this.LJIIIIZZ.LLJL().invoke().booleanValue()) {
                next.LIZIZ(!z ? 1 : 0);
            } else {
                next.LIZIZ(z ? 1 : 0);
            }
        }
    }

    public final void LJI(int i) {
        if (this.LJIIIZ.invoke().booleanValue()) {
            return;
        }
        Iterator<InterfaceC83707WtD> it = LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LIZ(i);
        }
        if (i == 0) {
            VERecorder LJ = this.LJII.LJ();
            LJ.LIZIZ.slamGetTextBitmap(new TCM());
        }
    }

    @Override // X.InterfaceC83868Wvo
    public final void LLLLLJLJLL(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        LIZLLL().remove(listener);
    }

    @Override // X.InterfaceC83868Wvo
    public final void LLLLLLIL(HJ0 hj0) {
        C83900WwK c83900WwK = this.LJ;
        c83900WwK.getClass();
        if (c83900WwK.LJLIL.isEmpty()) {
            if (c83900WwK.LJLJI) {
                c83900WwK.LJLILLLLZI.LIZIZ.addCommonCallback(c83900WwK);
            } else {
                c83900WwK.LJLILLLLZI.LIZIZ.setCommonCallback(c83900WwK);
            }
        }
        c83900WwK.LJLIL.add(hj0);
    }

    @Override // X.InterfaceC83868Wvo
    public final void LLLLLLJ(InterfaceC83889Ww9 listener) {
        o.LJIIIZ(listener, "listener");
        C83871Wvr c83871Wvr = this.LJI;
        c83871Wvr.getClass();
        synchronized (c83871Wvr) {
            if (c83871Wvr.LIZ.contains(listener)) {
                c83871Wvr.LIZ.remove(listener);
                if (c83871Wvr.LIZ.isEmpty()) {
                    if (c83871Wvr.LIZJ) {
                        c83871Wvr.LIZIZ.getCameraController().LLLLLZ(c83871Wvr);
                    } else {
                        c83871Wvr.LIZIZ.LJ().LIZIZ.setOnFrameAvailableListenerExt(null);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC83868Wvo
    public final void LLLLLLLLL(IAF listener) {
        o.LJIIIZ(listener, "listener");
        C83816Wuy c83816Wuy = this.LJFF;
        c83816Wuy.getClass();
        if (c83816Wuy.LJLIL.isEmpty()) {
            c83816Wuy.LJLILLLLZI.LIZIZ.setOnInfoListener(c83816Wuy);
        }
        if (!c83816Wuy.LJLIL.contains(listener)) {
            c83816Wuy.LJLIL.add(listener);
        }
    }

    @Override // X.InterfaceC83868Wvo
    public final void LLLLZLLLI(InterfaceC83889Ww9 listener) {
        o.LJIIIZ(listener, "listener");
        C83871Wvr c83871Wvr = this.LJI;
        c83871Wvr.getClass();
        synchronized (c83871Wvr) {
            if (c83871Wvr.LIZ.isEmpty()) {
                if (c83871Wvr.LIZJ) {
                    c83871Wvr.LIZIZ.getCameraController().LJIJ(c83871Wvr);
                } else {
                    VERecorder LJ = c83871Wvr.LIZIZ.LJ();
                    LJ.getClass();
                    LJ.LIZIZ.setOnFrameAvailableListenerExt(new C63912P6m(LJ, c83871Wvr));
                }
            }
            if (!c83871Wvr.LIZ.contains(listener)) {
                c83871Wvr.LIZ.add(listener);
            }
        }
    }

    @Override // X.InterfaceC83868Wvo
    public final void LLLZ(IAF listener) {
        o.LJIIIZ(listener, "listener");
        C83816Wuy c83816Wuy = this.LJFF;
        c83816Wuy.getClass();
        c83816Wuy.LJLIL.remove(listener);
        if (c83816Wuy.LJLIL.isEmpty()) {
            c83816Wuy.LJLILLLLZI.LIZIZ.setOnInfoListener(null);
        }
    }

    @Override // X.InterfaceC83868Wvo
    public final void LLLZI(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        if (!this.LIZJ.contains(callback)) {
            this.LIZJ.add(callback);
        }
    }

    @Override // X.InterfaceC83868Wvo
    public final void q9(HJ0 callback) {
        o.LJIIIZ(callback, "callback");
        C83900WwK c83900WwK = this.LJ;
        c83900WwK.getClass();
        c83900WwK.LJLIL.remove(callback);
        if (c83900WwK.LJLIL.isEmpty()) {
            if (c83900WwK.LJLJI) {
                c83900WwK.LJLILLLLZI.LIZIZ.removeCommonCallback(c83900WwK);
            } else {
                c83900WwK.LJLILLLLZI.LIZIZ.setCommonCallback(null);
            }
        }
    }

    public final void LJFF(int i, int i2, String str) {
        boolean booleanValue = this.LJIIIZ.invoke().booleanValue();
        if (i == 1000) {
            if (booleanValue && this.LJIIIIZZ.t()) {
                return;
            } else {
                this.LJIIJ.invoke().LJJIIZ();
            }
        } else if (i == 1001) {
            this.LJIIJ.invoke().LJJIIZI();
        }
        if (booleanValue) {
            return;
        }
        if (i != 1040) {
            if (i == 1041) {
                HY1.LIZIZ = Integer.valueOf(i2);
            }
        } else {
            HY1.LIZ = Integer.valueOf(i2);
        }
        this.LIZLLL.invoke(Integer.valueOf(i), Integer.valueOf(i2), str, this.LJII.LJ());
    }

    public C83902WwM(RecorderImpl recorder, InterfaceC83927Wwl recorderContext, InterfaceC65784Pro interceptCallbacks, AqS164S0100000_14 aqS164S0100000_14) {
        boolean z;
        o.LJIIIZ(recorder, "recorder");
        o.LJIIIZ(recorderContext, "recorderContext");
        o.LJIIIZ(interceptCallbacks, "interceptCallbacks");
        this.LJII = recorder;
        this.LJIIIIZZ = recorderContext;
        this.LJIIIZ = interceptCallbacks;
        this.LJIIJ = aqS164S0100000_14;
        this.LIZIZ = C221108m2.LIZIZ(C83905WwP.LJLIL);
        this.LIZJ = new CopyOnWriteArraySet<>();
        this.LIZLLL = new IDqS456S0100000_14(this, 3);
        this.LJ = new C83900WwK(recorder.LJ(), recorderContext.LJLJJL(), interceptCallbacks);
        this.LJFF = new C83816Wuy(recorder.LJ(), interceptCallbacks);
        if (recorderContext.LLJL().invoke().booleanValue() && recorderContext.LJJJJJL().LJ()) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = new C83871Wvr(recorder, z, interceptCallbacks);
    }
}
