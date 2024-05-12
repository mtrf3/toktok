package X;

import Y.ARunnableS38S0100000_2;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5S3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5S3 {
    public final ArrayList<Integer> LIZ;
    public final java.util.Map<String, ArrayList<NLEFilter>> LIZIZ;
    public boolean LIZJ;
    public ARunnableS38S0100000_2 LIZLLL;
    public Integer LJ;
    public final InterfaceC143655kP LJFF;
    public final VEEditorAutoStartStopArbiter LJI;
    public final int LJII;
    public final InterfaceC65784Pro<Boolean> LJIIIIZZ;
    public final InterfaceC65784Pro<Boolean> LJIIIZ;
    public final InterfaceC88471Ynr<AbstractC142705is, Runnable, C76800UCe> LJIIJ;
    public final InterfaceC65784Pro<Boolean> LJIIJJI;

    public final InterfaceC153045zY LIZIZ() {
        return this.LJFF.Kh().getValue();
    }

    public final int LIZ(InterfaceC153045zY interfaceC153045zY) {
        if (this.LJIIJJI.invoke().booleanValue()) {
            Integer num = this.LJ;
            if (num != null) {
                return num.intValue();
            }
            Integer valueOf = Integer.valueOf(interfaceC153045zY.getDuration());
            this.LJ = valueOf;
            if (valueOf != null) {
                return valueOf.intValue();
            }
            return 0;
        }
        return interfaceC153045zY.getDuration();
    }

    public final void LIZJ(boolean z) {
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("audio fadeout || resetAudioFadeout in Thread: ");
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
        LIZ.append(LLLLIIIILLL.getName());
        c83964WxM.LIZ(X1D.LIZIZ(LIZ));
        VEEditor.VEState vEState = null;
        this.LIZLLL = null;
        this.LIZJ = false;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.LJI;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.LJLJLJ = false;
        }
        InterfaceC153045zY LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            C78841Uwv.LJJIIJZLJL("", LIZIZ, new AqS168S0100000_2(this, 1));
        }
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter2 = this.LJI;
        if (vEEditorAutoStartStopArbiter2 != null) {
            vEEditorAutoStartStopArbiter2.LIZIZ();
        }
        this.LIZ.clear();
        ((LinkedHashMap) this.LIZIZ).clear();
        if (z) {
            InterfaceC153045zY LIZIZ2 = LIZIZ();
            if (LIZIZ2 != null) {
                vEState = LIZIZ2.getState();
            }
            if (vEState != VEEditor.VEState.IDLE && this.LJIIIIZZ.invoke().booleanValue() && this.LJIIIZ.invoke().booleanValue()) {
                this.LJIIJ.invoke(C142695ir.LIZIZ, new ARunnableS38S0100000_2(this, 4));
            }
        }
    }

    public C5S3(C143265jm editPreviewApi, VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter, int i, InterfaceC65784Pro isSupportMemoryOpt, AqS152S0100000_2 aqS152S0100000_2, InterfaceC88471Ynr holdUpAction, AqS152S0100000_2 aqS152S0100000_22) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(isSupportMemoryOpt, "isSupportMemoryOpt");
        o.LJIIIZ(holdUpAction, "holdUpAction");
        this.LJFF = editPreviewApi;
        this.LJI = vEEditorAutoStartStopArbiter;
        this.LJII = i;
        this.LJIIIIZZ = isSupportMemoryOpt;
        this.LJIIIZ = aqS152S0100000_2;
        this.LJIIJ = holdUpAction;
        this.LJIIJJI = aqS152S0100000_22;
        this.LIZ = new ArrayList<>();
        this.LIZIZ = new LinkedHashMap();
    }
}
