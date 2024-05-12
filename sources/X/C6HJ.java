package X;

import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6HJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HJ implements C6HY {
    public final InterfaceC153045zY LIZ;
    public final InterfaceC65784Pro<VEEditorAutoStartStopArbiter> LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 746));

    public final long LIZ() {
        return this.LIZ.LJZL();
    }

    public final long LIZIZ() {
        return this.LIZ.getDuration();
    }

    public final VEEditorAutoStartStopArbiter LIZJ() {
        return (VEEditorAutoStartStopArbiter) this.LIZJ.getValue();
    }

    public final boolean LIZLLL() {
        if (this.LIZ.getState() == VEEditor.VEState.STARTED) {
            return true;
        }
        return false;
    }

    public final void LJ(boolean z) {
        if (z) {
            LIZJ().LIZJ(false, false);
        } else {
            LIZJ().LIZ();
        }
    }

    public final void LJI(boolean z) {
        LIZJ().LJLJJI = z;
    }

    public final void LJII(boolean z) {
        if (z) {
            LIZJ().LIZJ(true, false);
        } else {
            LIZJ().LIZIZ();
        }
    }

    public C6HJ(InterfaceC153045zY interfaceC153045zY, InterfaceC65784Pro<VEEditorAutoStartStopArbiter> interfaceC65784Pro) {
        this.LIZ = interfaceC153045zY;
        this.LIZIZ = interfaceC65784Pro;
    }

    public final boolean LJFF(long j, VEEditor.SEEK_MODE seekMode, InterfaceC133865Ne interfaceC133865Ne) {
        o.LJIIIZ(seekMode, "seekMode");
        if (this.LIZ.LLJJJJJIL((int) j, seekMode, interfaceC133865Ne) == 0) {
            return true;
        }
        return false;
    }
}
