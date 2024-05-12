package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WX8 implements WXD {
    public final /* synthetic */ AqS164S0100000_14 LIZ;

    @Override // X.WXD
    public final boolean j7() {
        return false;
    }

    @Override // X.WXD
    public final boolean onScaleBegin() {
        return true;
    }

    @Override // X.WXD
    public final boolean i7() {
        if (o.LJ(((WX9) this.LIZ.l0).LJLILLLLZI.VO().LIZJ(), Boolean.FALSE)) {
            return false;
        }
        ((WX9) this.LIZ.l0).LJLILLLLZI.Gm0(false);
        WX9 wx9 = (WX9) this.LIZ.l0;
        wx9.LJLILLLLZI.z6(true, wx9.LJZ.LIZIZ(), "double_click");
        return true;
    }

    @Override // X.WXD
    public final void onScaleEnd() {
        ((WX9) this.LIZ.l0).LJLILLLLZI.LJL();
        ((WX9) this.LIZ.l0).LJLLJ.LJII(new C39670Fha(EnumC62292cT.SCALE_END));
    }

    public WX8(AqS164S0100000_14 aqS164S0100000_14) {
        this.LIZ = aqS164S0100000_14;
    }

    @Override // X.WXD
    public final boolean LIZ(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (!((WX9) this.LIZ.l0).getCameraView().H9()) {
            return false;
        }
        CopyOnWriteArraySet<WXK> copyOnWriteArraySet = ((WX9) this.LIZ.l0).LJLJL;
        if (!(copyOnWriteArraySet instanceof Collection) || !copyOnWriteArraySet.isEmpty()) {
            Iterator<WXK> it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next().LIZ(e);
                return true;
            }
        }
        ((WX9) this.LIZ.l0).LJLILLLLZI.R0(e.getX(), e.getY());
        return true;
    }

    @Override // X.WXD
    public final boolean k7(float f) {
        CopyOnWriteArrayList<WXL> copyOnWriteArrayList = ((WX9) this.LIZ.l0).LJLJJLL;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<WXL> it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                it.next().LIZIZ();
                return true;
            }
        }
        if (((WX9) this.LIZ.l0).LJJLIIIIJ() != null) {
            WXJ LJJLIIIIJ = ((WX9) this.LIZ.l0).LJJLIIIIJ();
            if (LJJLIIIIJ == null) {
                return true;
            }
            LJJLIIIIJ.Wa(f);
            return true;
        }
        return false;
    }

    @Override // X.WXD
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        o.LJIIIZ(scaleGestureDetector, "scaleGestureDetector");
        if (!((WX9) this.LIZ.l0).getCameraView().H9()) {
            return false;
        }
        InterfaceC88472Yns<? super ScaleGestureDetector, OSZ<Boolean, Boolean>> interfaceC88472Yns = ((WX9) this.LIZ.l0).LJLJJL;
        if (interfaceC88472Yns != null) {
            OSZ<Boolean, Boolean> invoke = interfaceC88472Yns.invoke(scaleGestureDetector);
            if (invoke.getFirst().booleanValue()) {
                return invoke.getSecond().booleanValue();
            }
        }
        return ((WX9) this.LIZ.l0).LJLILLLLZI.scaleCamera(scaleGestureDetector);
    }

    @Override // X.WXD
    public final boolean setExposureSeekBarProgress(float f) {
        ((WX9) this.LIZ.l0).LJLILLLLZI.setExposureSeekBarProgress(f);
        return true;
    }

    @Override // X.WXD
    public final boolean h7(float f, float f2) {
        CopyOnWriteArrayList<WXL> copyOnWriteArrayList = ((WX9) this.LIZ.l0).LJLJJLL;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<WXL> it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                it.next().LIZ();
                return true;
            }
        }
        if (((WX9) this.LIZ.l0).LJJLIIIIJ() != null) {
            WXJ LJJLIIIIJ = ((WX9) this.LIZ.l0).LJJLIIIIJ();
            if (LJJLIIIIJ == null) {
                return true;
            }
            LJJLIIIIJ.h7(f, f2);
            return true;
        }
        return false;
    }
}
