package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I05 implements WXE {
    public final /* synthetic */ I02 LJLIL;

    public I05(I02 i02) {
        this.LJLIL = i02;
    }

    @Override // X.WXE
    public final boolean LIZIZ(MotionEvent motionEvent, float f, float f2) {
        if (motionEvent != null) {
            I02 i02 = this.LJLIL;
            if (!i02.LJLLI) {
                Boolean LIZ = i02.getRecordControlApi().isRecording().LIZ();
                o.LJIIIIZZ(LIZ, "recordControlApi.isRecording.value");
                if (!LIZ.booleanValue() && !this.LJLIL.LJJLI() && this.LJLIL.LJLLILLLL && motionEvent.getPointerCount() <= 1 && I09.LIZ() && f2 - motionEvent.getY() > I02.LJZL && C47959Irz.LIZ(motionEvent, f) < C1I1.LIZIZ(motionEvent, f2) && C47959Irz.LIZ(motionEvent, f) < C81184Vtc.LJ(C78688UuS.LJIJJ(this.LJLIL)) / 10.0f) {
                    return true;
                }
            }
        }
        return false;
    }
}
